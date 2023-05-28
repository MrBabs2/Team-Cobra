package com.google.android.gms.internal.ads;

public final class zzccc implements zzdti<zzccb> {

    /* renamed from: a */
    private final zzdtu<String> f19936a;

    /* renamed from: b */
    private final zzdtu<zzbyn> f19937b;

    /* renamed from: c */
    private final zzdtu<zzbyt> f19938c;

    private zzccc(zzdtu<String> zzdtu, zzdtu<zzbyn> zzdtu2, zzdtu<zzbyt> zzdtu3) {
        this.f19936a = zzdtu;
        this.f19937b = zzdtu2;
        this.f19938c = zzdtu3;
    }

    /* renamed from: a */
    public static zzccc m22345a(zzdtu<String> zzdtu, zzdtu<zzbyn> zzdtu2, zzdtu<zzbyt> zzdtu3) {
        return new zzccc(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        return new zzccb(this.f19936a.get(), this.f19937b.get(), this.f19938c.get());
    }
}
