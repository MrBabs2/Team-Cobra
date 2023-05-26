package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

public final class zzcyc {
    /* renamed from: a */
    public static ParcelFileDescriptor m23113a(InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzaxg.f18648a.execute(new C8221zp(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        com.google.android.gms.internal.ads.zzdmb.m23747a(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0021, code lost:
        if (r2 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        m23115a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0026, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void m23114a(java.io.InputStream r2, android.os.ParcelFileDescriptor r3) {
        /*
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x001e }
            r0.<init>(r3)     // Catch:{ all -> 0x001e }
            com.google.android.gms.common.util.IOUtils.m16277a((java.io.InputStream) r2, (java.io.OutputStream) r0)     // Catch:{ all -> 0x0012 }
            r0.close()     // Catch:{ all -> 0x001e }
            if (r2 == 0) goto L_0x0011
            r3 = 0
            m23115a((java.lang.Throwable) r3, (java.io.InputStream) r2)     // Catch:{ IOException -> 0x0027 }
        L_0x0011:
            return
        L_0x0012:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzdmb.m23747a((java.lang.Throwable) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x001e }
        L_0x001d:
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            if (r2 == 0) goto L_0x0026
            m23115a((java.lang.Throwable) r3, (java.io.InputStream) r2)     // Catch:{ IOException -> 0x0027 }
        L_0x0026:
            throw r0     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcyc.m23114a(java.io.InputStream, android.os.ParcelFileDescriptor):void");
    }

    /* renamed from: a */
    private static /* synthetic */ void m23115a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                zzdmb.m23747a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }
}
