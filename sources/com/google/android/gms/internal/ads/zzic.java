package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzic implements zzip {

    /* renamed from: a */
    private final C8009tz f22004a;

    /* renamed from: b */
    private final zzhm f22005b = new zzhm(0);

    /* renamed from: c */
    private boolean f22006c = true;

    /* renamed from: d */
    private long f22007d = Long.MIN_VALUE;

    /* renamed from: e */
    private volatile long f22008e = Long.MIN_VALUE;

    /* renamed from: f */
    private volatile zzhj f22009f;

    public zzic(zzjl zzjl) {
        this.f22004a = new C8009tz(zzjl);
    }

    /* renamed from: f */
    private final boolean m24547f() {
        boolean a = this.f22004a.mo26632a(this.f22005b);
        if (this.f22006c) {
            while (a && !this.f22005b.mo29339b()) {
                this.f22004a.mo26633b();
                a = this.f22004a.mo26632a(this.f22005b);
            }
        }
        if (!a) {
            return false;
        }
        long j = this.f22007d;
        if (j == Long.MIN_VALUE || this.f22005b.f21965e < j) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo29373a() {
        this.f22004a.mo26628a();
        this.f22006c = true;
        this.f22007d = Long.MIN_VALUE;
        this.f22008e = Long.MIN_VALUE;
    }

    /* renamed from: b */
    public final boolean mo29378b() {
        return !m24547f();
    }

    /* renamed from: c */
    public final boolean mo29380c() {
        return this.f22009f != null;
    }

    /* renamed from: d */
    public final zzhj mo29381d() {
        return this.f22009f;
    }

    /* renamed from: e */
    public final long mo29382e() {
        return this.f22008e;
    }

    /* renamed from: b */
    public final boolean mo29379b(long j) {
        return this.f22004a.mo26631a(j);
    }

    /* renamed from: a */
    public final boolean mo29377a(zzhm zzhm) {
        if (!m24547f()) {
            return false;
        }
        this.f22004a.mo26634b(zzhm);
        this.f22006c = false;
        long j = zzhm.f21965e;
        return true;
    }

    /* renamed from: a */
    public final void mo29374a(long j) {
        while (this.f22004a.mo26632a(this.f22005b) && this.f22005b.f21965e < j) {
            this.f22004a.mo26633b();
            this.f22006c = true;
        }
    }

    /* renamed from: a */
    public final void mo29375a(zzhj zzhj) {
        this.f22009f = zzhj;
    }

    /* renamed from: a */
    public final int mo29372a(zzie zzie, int i) throws IOException, InterruptedException {
        return this.f22004a.mo26627a(zzie, i);
    }

    /* renamed from: a */
    public final void mo29376a(zzkm zzkm, int i) {
        this.f22004a.mo26630a(zzkm, i);
    }

    /* renamed from: a */
    public void mo26563a(long j, int i, int i2, int i3, byte[] bArr) {
        this.f22008e = Math.max(this.f22008e, j);
        C8009tz tzVar = this.f22004a;
        int i4 = i2;
        tzVar.mo26629a(j, i, (tzVar.mo26635c() - ((long) i4)) - ((long) i3), i4, bArr);
    }
}
