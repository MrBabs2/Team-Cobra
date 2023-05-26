package com.google.android.gms.internal.ads;

public final class zzsm {

    /* renamed from: a */
    private boolean f22648a;

    /* renamed from: a */
    public final synchronized void mo29715a() throws InterruptedException {
        while (!this.f22648a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo29716b() {
        if (this.f22648a) {
            return false;
        }
        this.f22648a = true;
        notifyAll();
        return true;
    }

    /* renamed from: c */
    public final synchronized boolean mo29717c() {
        boolean z;
        z = this.f22648a;
        this.f22648a = false;
        return z;
    }
}
