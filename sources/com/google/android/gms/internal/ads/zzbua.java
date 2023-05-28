package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;

public final class zzbua implements zzdti<Set<zzbuz<zzo>>> {
    private zzbua(zzbtv zzbtv) {
    }

    /* renamed from: a */
    public static zzbua m21911a(zzbtv zzbtv) {
        return new zzbua(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzdto.m24236a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
