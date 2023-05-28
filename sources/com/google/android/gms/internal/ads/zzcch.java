package com.google.android.gms.internal.ads;

public final class zzcch implements zzdti<zzccg> {

    /* renamed from: a */
    private final zzdtu<String> f19950a;

    /* renamed from: b */
    private final zzdtu<zzbyn> f19951b;

    /* renamed from: c */
    private final zzdtu<zzbyt> f19952c;

    private zzcch(zzdtu<String> zzdtu, zzdtu<zzbyn> zzdtu2, zzdtu<zzbyt> zzdtu3) {
        this.f19950a = zzdtu;
        this.f19951b = zzdtu2;
        this.f19952c = zzdtu3;
    }

    /* renamed from: a */
    public static zzcch m22376a(zzdtu<String> zzdtu, zzdtu<zzbyn> zzdtu2, zzdtu<zzbyt> zzdtu3) {
        return new zzcch(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzccg(this.f19950a.get(), this.f19951b.get(), this.f19952c.get());
    }
}
