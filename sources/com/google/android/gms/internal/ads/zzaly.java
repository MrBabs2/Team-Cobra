package com.google.android.gms.internal.ads;

@zzard
public final class zzaly {

    /* renamed from: a */
    private zzakh f18189a;

    /* renamed from: b */
    private zzbbr<zzalf> f18190b;

    zzaly(zzakh zzakh) {
        this.f18189a = zzakh;
    }

    /* renamed from: a */
    private final void m19393a() {
        if (this.f18190b == null) {
            zzbbr<zzalf> zzbbr = new zzbbr<>();
            this.f18190b = zzbbr;
            this.f18189a.mo27362b((zzdh) null).mo27910a(new C7606j2(zzbbr), new C7680l2(zzbbr));
        }
    }

    /* renamed from: b */
    public final void mo27377b(String str, zzaho<? super zzalf> zzaho) {
        this.f18190b = (zzbbr) zzbar.m20543a(this.f18190b, new C7754n2(str, zzaho), zzbbm.f18749b);
    }

    /* renamed from: a */
    public final zzamd mo27375a(String str, zzalm zzalm, zzall zzall) {
        m19393a();
        return new zzamd(this.f18190b, str, zzalm, zzall);
    }

    /* renamed from: a */
    public final void mo27376a(String str, zzaho<? super zzalf> zzaho) {
        m19393a();
        this.f18190b = (zzbbr) zzbar.m20542a(this.f18190b, new C7717m2(str, zzaho), zzbbm.f18749b);
    }
}
