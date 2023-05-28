package p050l.p099n;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2;
import p015cm.aptoide.p016pt.utils.MultiDexHelper;

/* renamed from: l.n.b */
/* compiled from: MultiDexExtractor */
final class C5145b implements Closeable {

    /* renamed from: f */
    private final File f9088f;

    /* renamed from: g */
    private final long f9089g;

    /* renamed from: h */
    private final File f9090h;

    /* renamed from: i */
    private final RandomAccessFile f9091i;

    /* renamed from: j */
    private final FileChannel f9092j;

    /* renamed from: k */
    private final FileLock f9093k;

    /* renamed from: l.n.b$a */
    /* compiled from: MultiDexExtractor */
    class C5146a implements FileFilter {
        C5146a() {
        }

        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* renamed from: l.n.b$b */
    /* compiled from: MultiDexExtractor */
    private static class C5147b extends File {

        /* renamed from: f */
        public long f9095f = -1;

        public C5147b(File file, String str) {
            super(file, str);
        }
    }

    C5145b(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f9088f = file;
        this.f9090h = file2;
        this.f9089g = m9515b(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f9091i = randomAccessFile;
        try {
            this.f9092j = randomAccessFile.getChannel();
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f9093k = this.f9092j.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m9512a((Closeable) this.f9092j);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m9512a((Closeable) this.f9092j);
                throw e;
            } catch (Error e3) {
                e = e3;
                m9512a((Closeable) this.f9092j);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m9512a((Closeable) this.f9091i);
            throw e4;
        }
    }

    /* renamed from: b */
    private static long m9515b(File file) throws IOException {
        long a = C5148c.m9518a(file);
        return a == -1 ? a - 1 : a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<? extends File> mo17806a(Context context, String str, boolean z) throws IOException {
        List<C5147b> list;
        List<C5147b> list2;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f9088f.getPath() + ", " + z + ", " + str + ")");
        if (this.f9093k.isValid()) {
            if (z || m9514a(context, this.f9088f, this.f9089g, str)) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                list2 = m9516b();
                m9511a(context, str, m9507a(this.f9088f), this.f9089g, list2);
            } else {
                try {
                    list = m9509a(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    list2 = m9516b();
                    m9511a(context, str, m9507a(this.f9088f), this.f9089g, list2);
                }
                Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
                return list;
            }
            list = list2;
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    public void close() throws IOException {
        this.f9093k.release();
        this.f9092j.close();
        this.f9091i.close();
    }

    /* renamed from: b */
    private List<C5147b> m9516b() throws IOException {
        C5147b bVar;
        boolean z;
        String str = this.f9088f.getName() + ".classes";
        m9510a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f9088f);
        try {
            ZipEntry entry = zipFile.getEntry("classes" + 2 + ".dex");
            int i = 2;
            while (entry != null) {
                bVar = new C5147b(this.f9090h, str + i + MultiDexHelper.EXTRACTED_SUFFIX);
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    m9513a(zipFile, entry, (File) bVar, str);
                    bVar.f9095f = m9515b(bVar);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    int i4 = i3;
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f9095f);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z2 = z;
                    i2 = i4;
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e2);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    /* renamed from: a */
    private List<C5147b> m9509a(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str3 = this.f9088f.getName() + ".classes";
        SharedPreferences a = m9508a(context);
        int i = a.getInt(str2 + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            C5147b bVar = new C5147b(this.f9090h, str3 + i2 + MultiDexHelper.EXTRACTED_SUFFIX);
            if (bVar.isFile()) {
                bVar.f9095f = m9515b(bVar);
                long j = a.getLong(str2 + "dex.crc." + i2, -1);
                long j2 = a.getLong(str2 + "dex.time." + i2, -1);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = a;
                    if (j == bVar.f9095f) {
                        arrayList.add(bVar);
                        i2++;
                        a = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.f9095f);
            }
            throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m9514a(Context context, File file, long j, String str) {
        SharedPreferences a = m9508a(context);
        if (a.getLong(str + "timestamp", -1) == m9507a(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("crc");
            return a.getLong(sb.toString(), -1) != j;
        }
    }

    /* renamed from: a */
    private static long m9507a(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: a */
    private static void m9511a(Context context, String str, long j, long j2, List<C5147b> list) {
        SharedPreferences.Editor edit = m9508a(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (C5147b next : list) {
            edit.putLong(str + "dex.crc." + i, next.f9095f);
            edit.putLong(str + "dex.time." + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    /* renamed from: a */
    private static SharedPreferences m9508a(Context context) {
        return context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    /* renamed from: a */
    private void m9510a() {
        File[] listFiles = this.f9090h.listFiles(new C5146a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f9090h.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (!file.delete()) {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            } else {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            }
        }
    }

    /* renamed from: a */
    private static void m9513a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, MultiDexHelper.EXTRACTED_SUFFIX, file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    m9512a((Closeable) inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m9512a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m9512a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
