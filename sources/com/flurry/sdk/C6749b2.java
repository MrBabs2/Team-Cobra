package com.flurry.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.b2 */
public final class C6749b2 {

    /* renamed from: a */
    private static String f12562a = "FileUtil";

    /* renamed from: com.flurry.sdk.b2$a */
    static class C6750a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f12563a;

        C6750a(Pattern pattern) {
            this.f12563a = pattern;
        }

        public final boolean accept(File file, String str) {
            return this.f12563a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static File m14389a() {
        return C6747b0.m14386a().getFilesDir();
    }

    @TargetApi(21)
    /* renamed from: b */
    public static File m14392b() {
        File file;
        Context a = C6747b0.m14386a();
        if (C6766c2.m14421a(21)) {
            file = a.getNoBackupFilesDir();
        } else {
            file = new File(a.getFilesDir().getPath() + File.separator + "no_backup");
        }
        return new File(file.getPath() + File.separator + ".flurryNoBackup");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14394c(java.io.File r6) {
        /*
            r0 = 4
            r1 = 0
            if (r6 == 0) goto L_0x0061
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x000b
            goto L_0x0061
        L_0x000b:
            java.lang.String r2 = f12562a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Loading persistent data: "
            r3.<init>(r4)
            java.lang.String r4 = r6.getAbsolutePath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.flurry.sdk.C6792d1.m14476a((int) r0, (java.lang.String) r2, (java.lang.String) r3)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            r0.<init>(r6)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            r6.<init>()     // Catch:{ all -> 0x0044 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x0044 }
        L_0x0030:
            int r3 = r0.read(r2)     // Catch:{ all -> 0x0044 }
            if (r3 <= 0) goto L_0x0040
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0044 }
            r5 = 0
            r4.<init>(r2, r5, r3)     // Catch:{ all -> 0x0044 }
            r6.append(r4)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x0040:
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)
            goto L_0x0054
        L_0x0044:
            r6 = move-exception
            goto L_0x0048
        L_0x0046:
            r6 = move-exception
            r0 = r1
        L_0x0048:
            r2 = 6
            java.lang.String r3 = f12562a     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "Error when loading persistent file"
            com.flurry.sdk.C6792d1.m14477a(r2, r3, r4, r6)     // Catch:{ all -> 0x005c }
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)
            r6 = r1
        L_0x0054:
            if (r6 == 0) goto L_0x005b
            java.lang.String r6 = r6.toString()
            return r6
        L_0x005b:
            return r1
        L_0x005c:
            r6 = move-exception
            com.flurry.sdk.C6766c2.m14420a((java.io.Closeable) r0)
            throw r6
        L_0x0061:
            java.lang.String r6 = f12562a
            java.lang.String r2 = "Persistent file doesn't exist."
            com.flurry.sdk.C6792d1.m14476a((int) r0, (java.lang.String) r6, (java.lang.String) r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6749b2.m14394c(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m14390a(File file) {
        if (file == null || file.getAbsoluteFile() == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
            return true;
        }
        C6792d1.m14476a(6, f12562a, "Unable to create persistent dir: ".concat(String.valueOf(parentFile)));
        return false;
    }

    /* renamed from: b */
    public static boolean m14393b(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        for (String file2 : file.list()) {
            if (!m14393b(new File(file, file2))) {
                return false;
            }
        }
        return file.delete();
    }

    /* renamed from: a */
    public static String[] m14391a(File file, Pattern pattern) {
        if (!file.exists()) {
            return new String[0];
        }
        String[] list = file.list(new C6750a(pattern));
        return list == null ? new String[0] : list;
    }
}
