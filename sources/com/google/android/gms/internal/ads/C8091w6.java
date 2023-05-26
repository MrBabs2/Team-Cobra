package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.w6 */
final /* synthetic */ class C8091w6 implements Runnable {

    /* renamed from: f */
    private final zzbbr f17071f;

    /* renamed from: g */
    private final zzbbh f17072g;

    C8091w6(zzbbr zzbbr, zzbbh zzbbh) {
        this.f17071f = zzbbr;
        this.f17072g = zzbbh;
    }

    public final void run() {
        zzbbr zzbbr = this.f17071f;
        try {
            zzbbr.mo27904b(this.f17072g.get());
        } catch (ExecutionException e) {
            zzbbr.mo27903a(e.getCause());
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            zzbbr.mo27903a(e2);
        } catch (Exception e3) {
            zzbbr.mo27903a(e3);
        }
    }
}
