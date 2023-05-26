package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzbud implements zzdti<Set<zzbuz<zzbro>>> {

    /* renamed from: a */
    private final zzbtv f19492a;

    private zzbud(zzbtv zzbtv) {
        this.f19492a = zzbtv;
    }

    /* renamed from: a */
    public static zzbud m21914a(zzbtv zzbtv) {
        return new zzbud(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<zzbro>> c = this.f19492a.mo28433c();
        zzdto.m24236a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }
}
