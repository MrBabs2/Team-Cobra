package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;

public final class zzbvw implements zzdti<zzbvq> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> f19520a;

    private zzbvw(zzdtu<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> zzdtu) {
        this.f19520a = zzdtu;
    }

    /* renamed from: a */
    public static zzbvw m21954a(zzdtu<Set<zzbuz<VideoController.VideoLifecycleCallbacks>>> zzdtu) {
        return new zzbvw(zzdtu);
    }

    public final /* synthetic */ Object get() {
        return new zzbvq(this.f19520a.get());
    }
}
