package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class zzbxh implements zzdti<zzbxg> {

    /* renamed from: a */
    private final zzdtu<zzavf> f19591a;

    /* renamed from: b */
    private final zzdtu<Context> f19592b;

    /* renamed from: c */
    private final zzdtu<zzavg> f19593c;

    /* renamed from: d */
    private final zzdtu<View> f19594d;

    /* renamed from: e */
    private final zzdtu<Integer> f19595e;

    private zzbxh(zzdtu<zzavf> zzdtu, zzdtu<Context> zzdtu2, zzdtu<zzavg> zzdtu3, zzdtu<View> zzdtu4, zzdtu<Integer> zzdtu5) {
        this.f19591a = zzdtu;
        this.f19592b = zzdtu2;
        this.f19593c = zzdtu3;
        this.f19594d = zzdtu4;
        this.f19595e = zzdtu5;
    }

    /* renamed from: a */
    public static zzbxh m22003a(zzdtu<zzavf> zzdtu, zzdtu<Context> zzdtu2, zzdtu<zzavg> zzdtu3, zzdtu<View> zzdtu4, zzdtu<Integer> zzdtu5) {
        return new zzbxh(zzdtu, zzdtu2, zzdtu3, zzdtu4, zzdtu5);
    }

    public final /* synthetic */ Object get() {
        return new zzbxg(this.f19591a.get(), this.f19592b.get(), this.f19593c.get(), this.f19594d.get(), this.f19595e.get().intValue());
    }
}
