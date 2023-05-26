package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

public final class zzbsu implements zzdti<zzbss> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<AdMetadataListener>>> f19458a;

    private zzbsu(zzdtu<Set<zzbuz<AdMetadataListener>>> zzdtu) {
        this.f19458a = zzdtu;
    }

    /* renamed from: a */
    public static zzbsu m21857a(zzdtu<Set<zzbuz<AdMetadataListener>>> zzdtu) {
        return new zzbsu(zzdtu);
    }

    public final /* synthetic */ Object get() {
        return new zzbss(this.f19458a.get());
    }
}
