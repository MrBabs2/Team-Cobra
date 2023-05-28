package p050l.p075h.p076e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: l.h.e.k */
/* compiled from: TypefaceCompatUtil */
public class C4964k {
    /* renamed from: a */
    public static File m8791a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer m8794a(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001e }
            r0.<init>(r7)     // Catch:{ IOException -> 0x001e }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x0019 }
            long r5 = r1.size()     // Catch:{ all -> 0x0019 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0019 }
            r3 = 0
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0019 }
            r0.close()     // Catch:{ IOException -> 0x001e }
            return r7
        L_0x0019:
            r7 = move-exception
            r0.close()     // Catch:{ all -> 0x001d }
        L_0x001d:
            throw r7     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p076e.C4964k.m8794a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0040 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m8793a(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x0041 }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x003a }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x003a }
            r8.<init>(r9)     // Catch:{ all -> 0x003a }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0035 }
            long r5 = r1.size()     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0035 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            r8.close()     // Catch:{ all -> 0x003a }
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0034:
            return r9
        L_0x0035:
            r9 = move-exception
            r8.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r9     // Catch:{ all -> 0x003a }
        L_0x003a:
            r8 = move-exception
            if (r7 == 0) goto L_0x0040
            r7.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r8     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p076e.C4964k.m8793a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static ByteBuffer m8792a(Context context, Resources resources, int i) {
        File a = m8791a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m8796a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = m8794a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* renamed from: a */
    public static boolean m8797a(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        m8795a((Closeable) fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m8795a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    m8795a((Closeable) fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m8795a((Closeable) fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m8795a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m8796a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = m8797a(file, inputStream);
                m8795a((Closeable) inputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                m8795a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m8795a((Closeable) inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m8795a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
