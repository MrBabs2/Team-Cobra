package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p6 */
final /* synthetic */ class C7832p6 implements Runnable {

    /* renamed from: f */
    private final zzbbr f16561f;

    /* renamed from: g */
    private final zzbam f16562g;

    /* renamed from: h */
    private final zzbbh f16563h;

    C7832p6(zzbbr zzbbr, zzbam zzbam, zzbbh zzbbh) {
        this.f16561f = zzbbr;
        this.f16562g = zzbam;
        this.f16563h = zzbbh;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbbr r0 = r3.f16561f
            com.google.android.gms.internal.ads.zzbam r1 = r3.f16562g
            com.google.android.gms.internal.ads.zzbbh r2 = r3.f16563h
            java.lang.Object r2 = r2.get()     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            java.lang.Object r1 = r1.apply(r2)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            r0.mo27904b(r1)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            r0.mo27903a(r1)
            return
        L_0x0017:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            r0.mo27903a(r1)
            return
        L_0x0023:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r0.mo27903a(r1)
            return
        L_0x0030:
            r1 = 1
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7832p6.run():void");
    }
}
