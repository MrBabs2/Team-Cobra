package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

public final class zzbuj implements zzdti<Set<zzbuz<AppEventListener>>> {

    /* renamed from: a */
    private final zzbtv f19498a;

    private zzbuj(zzbtv zzbtv) {
        this.f19498a = zzbtv;
    }

    /* renamed from: a */
    public static zzbuj m21920a(zzbtv zzbtv) {
        return new zzbuj(zzbtv);
    }

    public final /* synthetic */ Object get() {
        Set<zzbuz<AppEventListener>> f = this.f19498a.mo28436f();
        zzdto.m24236a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
