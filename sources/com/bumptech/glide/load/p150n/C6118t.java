package com.bumptech.glide.load.p150n;

import com.bumptech.glide.load.C5904d;
import com.bumptech.glide.load.engine.p147z.C5999b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.t */
/* compiled from: StreamEncoder */
public class C6118t implements C5904d<InputStream> {

    /* renamed from: a */
    private final C5999b f11219a;

    public C6118t(C5999b bVar) {
        this.f11219a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ all -> 0x002e }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f A[SYNTHETIC, Splitter:B:23:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004a A[SYNTHETIC, Splitter:B:29:0x004a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo20068a(java.io.InputStream r5, java.io.File r6, com.bumptech.glide.load.C6027i r7) {
        /*
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            com.bumptech.glide.load.engine.z.b r0 = r4.f11219a
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r0 = r0.mo20263b(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0030 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0030 }
        L_0x0015:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x002b, all -> 0x0028 }
            r2 = -1
            if (r6 == r2) goto L_0x0020
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x002b, all -> 0x0028 }
            goto L_0x0015
        L_0x0020:
            r3.close()     // Catch:{ IOException -> 0x002b, all -> 0x0028 }
            r1 = 1
            r3.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0042
        L_0x0028:
            r5 = move-exception
            r2 = r3
            goto L_0x0048
        L_0x002b:
            r5 = move-exception
            r2 = r3
            goto L_0x0031
        L_0x002e:
            r5 = move-exception
            goto L_0x0048
        L_0x0030:
            r5 = move-exception
        L_0x0031:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x003d
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x002e }
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            r2.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            com.bumptech.glide.load.engine.z.b r5 = r4.f11219a
            r5.mo20262a(r0)
            return r1
        L_0x0048:
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            com.bumptech.glide.load.engine.z.b r6 = r4.f11219a
            r6.mo20262a(r0)
            goto L_0x0054
        L_0x0053:
            throw r5
        L_0x0054:
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p150n.C6118t.mo20068a(java.io.InputStream, java.io.File, com.bumptech.glide.load.i):boolean");
    }
}
