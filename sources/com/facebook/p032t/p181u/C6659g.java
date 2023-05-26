package com.facebook.p032t.p181u;

import java.io.File;

/* renamed from: com.facebook.t.u.g */
/* compiled from: HashUtils */
final class C6659g {
    /* renamed from: a */
    public static final String m14200a(String str) throws Exception {
        return m14199a(new File(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m14199a(java.io.File r4) throws java.lang.Exception {
        /*
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r4)
            r4 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r4)
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ all -> 0x0035 }
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0035 }
        L_0x0014:
            int r2 = r0.read(r4)     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x001e
            r3 = 0
            r1.update(r4, r3, r2)     // Catch:{ all -> 0x0035 }
        L_0x001e:
            r3 = -1
            if (r2 != r3) goto L_0x0014
            java.math.BigInteger r4 = new java.math.BigInteger     // Catch:{ all -> 0x0035 }
            r2 = 1
            byte[] r1 = r1.digest()     // Catch:{ all -> 0x0035 }
            r4.<init>(r2, r1)     // Catch:{ all -> 0x0035 }
            r1 = 16
            java.lang.String r4 = r4.toString(r1)     // Catch:{ all -> 0x0035 }
            r0.close()
            return r4
        L_0x0035:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            goto L_0x003d
        L_0x003c:
            throw r4
        L_0x003d:
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p181u.C6659g.m14199a(java.io.File):java.lang.String");
    }
}
