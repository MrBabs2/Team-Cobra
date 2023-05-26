package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.s6 */
final /* synthetic */ class C7943s6 implements Runnable {

    /* renamed from: f */
    private final zzbbh f16829f;

    /* renamed from: g */
    private final AtomicInteger f16830g;

    /* renamed from: h */
    private final Runnable f16831h;

    /* renamed from: i */
    private final zzbbr f16832i;

    C7943s6(zzbbh zzbbh, AtomicInteger atomicInteger, Runnable runnable, zzbbr zzbbr) {
        this.f16829f = zzbbh;
        this.f16830g = atomicInteger;
        this.f16831h = runnable;
        this.f16832i = zzbbr;
    }

    public final void run() {
        zzbbh zzbbh = this.f16829f;
        AtomicInteger atomicInteger = this.f16830g;
        Runnable runnable = this.f16831h;
        zzbbr zzbbr = this.f16832i;
        try {
            zzbbh.get();
            if (atomicInteger.decrementAndGet() == 0) {
                runnable.run();
            }
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
