package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

public final class zzbtr implements zzdti<zzbtp> {

    /* renamed from: a */
    private final zzdtu<Set<zzbuz<AppEventListener>>> f19468a;

    private zzbtr(zzdtu<Set<zzbuz<AppEventListener>>> zzdtu) {
        this.f19468a = zzdtu;
    }

    /* renamed from: a */
    public static zzbtr m21873a(zzdtu<Set<zzbuz<AppEventListener>>> zzdtu) {
        return new zzbtr(zzdtu);
    }

    public final /* synthetic */ Object get() {
        return new zzbtp(this.f19468a.get());
    }
}
