package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

public final class zzjz {

    /* renamed from: a */
    private final ExecutorService f22140a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public n00 f22141b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f22142c;

    public zzjz(String str) {
        this.f22140a = zzkq.m24688a(str);
    }

    /* renamed from: a */
    public final void mo29407a(zzkc zzkc, zzka zzka) {
        Looper myLooper = Looper.myLooper();
        zzkh.m24659b(myLooper != null);
        zzkh.m24659b(!this.f22142c);
        this.f22142c = true;
        n00 n00 = new n00(this, myLooper, zzkc, zzka, 0);
        this.f22141b = n00;
        this.f22140a.submit(n00);
    }

    /* renamed from: b */
    public final void mo29409b() {
        if (this.f22142c) {
            mo29410c();
        }
        this.f22140a.shutdown();
    }

    /* renamed from: c */
    public final void mo29410c() {
        zzkh.m24659b(this.f22142c);
        this.f22141b.mo26299a();
    }

    /* renamed from: a */
    public final boolean mo29408a() {
        return this.f22142c;
    }
}
