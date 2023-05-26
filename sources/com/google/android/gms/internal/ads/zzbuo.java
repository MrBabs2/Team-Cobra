package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;

public final class zzbuo implements zzdti<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> {
    private zzbuo(zzbtv zzbtv) {
    }

    /* renamed from: a */
    public static zzbuo m21925a(zzbtv zzbtv) {
        return new zzbuo(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        zzdto.m24236a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
