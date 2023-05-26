package com.google.android.gms.internal.ads;

public final class zzbnr implements zzdti<zzbnf> {

    /* renamed from: a */
    private final zzbnk f19253a;

    /* renamed from: b */
    private final zzdtu<C8171yc> f19254b;

    public zzbnr(zzbnk zzbnk, zzdtu<C8171yc> zzdtu) {
        this.f19253a = zzbnk;
        this.f19254b = zzdtu;
    }

    /* renamed from: a */
    public static zzbnf m21411a(zzbnk zzbnk, Object obj) {
        C8171yc ycVar = (C8171yc) obj;
        zzdto.m24236a(ycVar, "Cannot return null from a non-@Nullable @Provides method");
        return ycVar;
    }

    public final /* synthetic */ Object get() {
        return m21411a(this.f19253a, this.f19254b.get());
    }
}
