package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

public final class zzbmt implements zzdti<zzty> {

    /* renamed from: a */
    private final zzdtu<zzcxm> f19204a;

    /* renamed from: b */
    private final zzdtu<zzbai> f19205b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f19206c;

    /* renamed from: d */
    private final zzdtu<String> f19207d;

    private zzbmt(zzdtu<zzcxm> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<JSONObject> zzdtu3, zzdtu<String> zzdtu4) {
        this.f19204a = zzdtu;
        this.f19205b = zzdtu2;
        this.f19206c = zzdtu3;
        this.f19207d = zzdtu4;
    }

    /* renamed from: a */
    public static zzbmt m21375a(zzdtu<zzcxm> zzdtu, zzdtu<zzbai> zzdtu2, zzdtu<JSONObject> zzdtu3, zzdtu<String> zzdtu4) {
        return new zzbmt(zzdtu, zzdtu2, zzdtu3, zzdtu4);
    }

    public final /* synthetic */ Object get() {
        this.f19204a.get();
        String str = this.f19207d.get();
        boolean equals = "native".equals(str);
        zzk.zzlg();
        zzty zzty = new zzty(zzaxi.m20283b(), this.f19205b.get(), str, this.f19206c.get(), false, equals);
        zzdto.m24236a(zzty, "Cannot return null from a non-@Nullable @Provides method");
        return zzty;
    }
}
