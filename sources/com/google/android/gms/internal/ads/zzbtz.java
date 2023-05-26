package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbtz implements zzdti<Set<zzbuz<zzbsr>>> {

    /* renamed from: a */
    private final zzbtv f19490a;

    private zzbtz(zzbtv zzbtv) {
        this.f19490a = zzbtv;
    }

    /* renamed from: a */
    public static zzbtz m21909a(zzbtv zzbtv) {
        return new zzbtz(zzbtv);
    }

    /* renamed from: b */
    public static Set<zzbuz<zzbsr>> m21910b(zzbtv zzbtv) {
        Set<zzbuz<zzbsr>> emptySet = Collections.emptySet();
        zzdto.m24236a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }

    public final /* synthetic */ Object get() {
        return m21910b(this.f19490a);
    }
}
