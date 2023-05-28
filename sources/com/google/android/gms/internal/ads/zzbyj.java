package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

public final class zzbyj implements zzdti<zzty> {

    /* renamed from: a */
    private final zzdtu<zzbai> f19670a;

    /* renamed from: b */
    private final zzdtu<String> f19671b;

    public zzbyj(zzdtu<zzbai> zzdtu, zzdtu<String> zzdtu2) {
        this.f19670a = zzdtu;
        this.f19671b = zzdtu2;
    }

    public final /* synthetic */ Object get() {
        zzk.zzlg();
        zzty zzty = new zzty(zzaxi.m20283b(), this.f19670a.get(), this.f19671b.get(), new JSONObject(), false, true);
        zzdto.m24236a(zzty, "Cannot return null from a non-@Nullable @Provides method");
        return zzty;
    }
}
