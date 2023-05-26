package p015cm.aptoide.p016pt.utils;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import p015cm.aptoide.p016pt.logger.Logger;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.utils.FileUtils */
public class FileUtils {
    public static final String COPY = "Copy";
    public static final String MOVE = "Move";
    private static final String TAG = "FileUtils";
    private C5378b<String> sendFileMoveEvent;

    public static void createDir(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static boolean fileExists(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static boolean removeFile(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new File(str).delete();
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[SYNTHETIC, Splitter:B:11:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveBitmapToFile(java.io.File r2, java.lang.String r3, android.graphics.Bitmap r4, android.graphics.Bitmap.CompressFormat r5, int r6) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            r3 = 0
            r2.mkdirs()     // Catch:{ IOException -> 0x0018 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0018 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0018 }
            r4.compress(r5, r6, r2)     // Catch:{ IOException -> 0x0016 }
            r2.close()     // Catch:{ IOException -> 0x0016 }
            r2 = 1
            return r2
        L_0x0016:
            r3 = move-exception
            goto L_0x001c
        L_0x0018:
            r2 = move-exception
            r1 = r3
            r3 = r2
            r2 = r1
        L_0x001c:
            cm.aptoide.pt.logger.Logger r4 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.String r5 = TAG
            java.lang.String r3 = r3.getMessage()
            r4.mo12979e((java.lang.String) r5, (java.lang.String) r3)
            if (r2 == 0) goto L_0x003d
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x003d
        L_0x002f:
            r2 = move-exception
            cm.aptoide.pt.logger.Logger r3 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.String r4 = TAG
            java.lang.String r2 = r2.getMessage()
            r3.mo12979e((java.lang.String) r4, (java.lang.String) r2)
        L_0x003d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.utils.FileUtils.saveBitmapToFile(java.io.File, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int):boolean");
    }

    /* renamed from: a */
    public /* synthetic */ Long mo15038a(File file) throws Exception {
        long deleteDir = deleteDir(file);
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "deleting folder " + file.getPath() + " size: " + deleteDir);
        return Long.valueOf(deleteDir);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo15039b(File file) {
        return C5368e.m10240a(new C4470i(this, file)).mo18697k(C4472j.f7693f);
    }

    public void cloneFile(String str, String str2, String str3) {
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(str + "/" + str3);
            FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + str3);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    new File(str + str3).delete();
                    return;
                }
            }
        } catch (Exception e) {
            File file2 = new File(str + "/" + str3);
            if (file2.exists()) {
                file2.delete();
            }
            File file3 = new File(str2 + "/" + str3);
            if (file3.exists()) {
                file3.delete();
            }
            Logger.getInstance().mo12979e(TAG, e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void copyFile(String str, String str2, String str3) {
        if (!str.equals(str2)) {
            if (fileExists(str + str3)) {
                File file = new File(str + str3);
                if (!file.renameTo(new File(str2 + str3))) {
                    cloneFile(str, str2, str3);
                    return;
                }
                return;
            }
            throw new RuntimeException("Input file(" + str + str3 + ") doesn't exists");
        }
    }

    public long deleteDir(File file) {
        if (file != null) {
            long j = 0;
            if (file.isDirectory()) {
                for (File deleteDir : file.listFiles() == null ? new File[0] : file.listFiles()) {
                    j += deleteDir(deleteDir);
                }
            }
            long length = j + file.length();
            if (!file.exists() || file.delete()) {
                return length;
            }
            throw new RuntimeException("Something went wrong while deleting the file " + file.getPath() + " (if the is the file a directory, is it empty?");
        }
        throw new RuntimeException("The file to be deleted can't be null");
    }

    public C5368e<Long> deleteFolder(File... fileArr) {
        return C5368e.m10249a((T[]) fileArr).mo18644a(Schedulers.m10352io()).mo18687f(new C4468h(this)).mo18698l().mo18694j(C4466g.f7680f);
    }

    public long dirSize(File file) {
        File[] listFiles;
        long j;
        long j2 = 0;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    j = dirSize(listFiles[i]);
                } else {
                    j = listFiles[i].length();
                }
                j2 += j;
            }
        }
        return j2;
    }

    /* renamed from: a */
    static /* synthetic */ Long m7464a(List list) {
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j += ((Long) list.get(i)).longValue();
        }
        return Long.valueOf(j);
    }

    public C5368e<Long> deleteFolder(String... strArr) {
        File[] fileArr = new File[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            fileArr[i] = new File(strArr[i]);
        }
        return deleteFolder(fileArr);
    }
}
