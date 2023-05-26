package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class zzbul implements zzdti<Set<zzbuz<zzue>>> {
    private zzbul(zzbtv zzbtv) {
    }

    /* renamed from: a */
    public static zzbul m21922a(zzbtv zzbtv) {
        return new zzbul(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzdto.m24236a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
