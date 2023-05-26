package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbub implements zzdti<Set<zzbuz<zzbto>>> {
    private zzbub(zzbtv zzbtv) {
    }

    /* renamed from: a */
    public static zzbub m21912a(zzbtv zzbtv) {
        return new zzbub(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzdto.m24236a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
