package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.o6 */
final /* synthetic */ class C7795o6 implements Runnable {

    /* renamed from: f */
    private final zzban f16442f;

    /* renamed from: g */
    private final zzbbh f16443g;

    C7795o6(zzban zzban, zzbbh zzbbh) {
        this.f16442f = zzban;
        this.f16443g = zzbbh;
    }

    public final void run() {
        Throwable e;
        zzban zzban = this.f16442f;
        try {
            zzban.mo25565a(this.f16443g.get());
        } catch (ExecutionException e2) {
            e = e2.getCause();
            zzban.mo25566a(e);
        } catch (InterruptedException e3) {
            e = e3;
            Thread.currentThread().interrupt();
            zzban.mo25566a(e);
        } catch (Exception e4) {
            e = e4;
            zzban.mo25566a(e);
        }
    }
}
