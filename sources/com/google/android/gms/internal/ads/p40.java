package com.google.android.gms.internal.ads;

final class p40 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ o40 f16558f;

    p40(o40 o40) {
        this.f16558f = o40;
    }

    public final void run() {
        synchronized (this.f16558f.f16432h) {
            if (!this.f16558f.f16433i || !this.f16558f.f16434j) {
                zzbad.m20516a("App is still foreground");
            } else {
                boolean unused = this.f16558f.f16433i = false;
                zzbad.m20516a("App went background");
                for (zzut a : this.f16558f.f16435k) {
                    try {
                        a.mo26760a(false);
                    } catch (Exception e) {
                        zzbad.m20520b("", e);
                    }
                }
            }
        }
    }
}
