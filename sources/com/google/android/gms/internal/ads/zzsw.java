package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzsw implements zzso {

    /* renamed from: a */
    private boolean f22667a;

    /* renamed from: b */
    private long f22668b;

    /* renamed from: c */
    private long f22669c;

    /* renamed from: d */
    private zzln f22670d = zzln.f22206d;

    /* renamed from: a */
    public final void mo29750a() {
        if (!this.f22667a) {
            this.f22669c = SystemClock.elapsedRealtime();
            this.f22667a = true;
        }
    }

    /* renamed from: b */
    public final long mo29532b() {
        long j;
        long j2 = this.f22668b;
        if (!this.f22667a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f22669c;
        zzln zzln = this.f22670d;
        if (zzln.f22207a == 1.0f) {
            j = zzkt.m24720b(elapsedRealtime);
        } else {
            j = zzln.mo29477a(elapsedRealtime);
        }
        return j2 + j;
    }

    /* renamed from: c */
    public final zzln mo29534c() {
        return this.f22670d;
    }

    /* renamed from: d */
    public final void mo29753d() {
        if (this.f22667a) {
            mo29751a(mo29532b());
            this.f22667a = false;
        }
    }

    /* renamed from: a */
    public final void mo29751a(long j) {
        this.f22668b = j;
        if (this.f22667a) {
            this.f22669c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public final void mo29752a(zzso zzso) {
        mo29751a(zzso.mo29532b());
        this.f22670d = zzso.mo29534c();
    }

    /* renamed from: a */
    public final zzln mo29526a(zzln zzln) {
        if (this.f22667a) {
            mo29751a(mo29532b());
        }
        this.f22670d = zzln;
        return zzln;
    }
}
