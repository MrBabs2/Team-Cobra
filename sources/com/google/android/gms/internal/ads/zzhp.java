package com.google.android.gms.internal.ads;

public abstract class zzhp implements zzgf {

    /* renamed from: a */
    private int f21968a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29340a() throws zzgd {
        zzkh.m24659b(this.f21968a == 2);
        this.f21968a = 1;
        mo29319n();
    }

    /* renamed from: a */
    public void mo29295a(int i, Object obj) throws zzgd {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29307a(long j) throws zzgd;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29320a(long j, long j2) throws zzgd;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29308a(long j, boolean z) throws zzgd {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo29323b(long j) throws zzgd;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo29324b();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29341b(long j, boolean z) throws zzgd {
        boolean z2 = true;
        if (this.f21968a != 1) {
            z2 = false;
        }
        zzkh.m24659b(z2);
        this.f21968a = 2;
        mo29308a(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29342c() {
        return this.f21968a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo29313d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29314e() throws zzgd {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo29315f() throws zzgd {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo29344g() throws zzgd {
        int i = this.f21968a;
        zzkh.m24659b((i == 2 || i == 3 || i == -2) ? false : true);
        this.f21968a = -2;
        mo29326o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo29345h() throws zzgd {
        zzkh.m24659b(this.f21968a == 2);
        this.f21968a = 3;
        mo29314e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo29346i() throws zzgd {
        zzkh.m24659b(this.f21968a == 3);
        this.f21968a = 2;
        mo29315f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract long mo29325j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo29316k() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo29317l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract long mo29318m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo29319n() throws zzgd {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo29326o() throws zzgd {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo29343c(long j) throws zzgd {
        boolean z = false;
        zzkh.m24659b(this.f21968a == 0);
        int b = mo29323b(j);
        this.f21968a = b;
        if (b == 0 || b == 1 || b == -1) {
            z = true;
        }
        zzkh.m24659b(z);
        return this.f21968a;
    }
}
