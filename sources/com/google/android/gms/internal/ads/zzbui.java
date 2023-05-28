package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

public final class zzbui implements zzdti<Set<zzbuz<AdMetadataListener>>> {

    /* renamed from: a */
    private final zzbtv f19497a;

    private zzbui(zzbtv zzbtv) {
        this.f19497a = zzbtv;
    }

    /* renamed from: a */
    public static zzbui m21919a(zzbtv zzbtv) {
        return new zzbui(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<AdMetadataListener>> e = this.f19497a.mo28435e();
        zzdto.m24236a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
