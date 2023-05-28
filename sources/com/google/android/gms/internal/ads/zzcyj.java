package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzcyj implements zzdti<zzcyi> {

    /* renamed from: a */
    private final zzdtu<Context> f21202a;

    /* renamed from: b */
    private final zzdtu<zzawu> f21203b;

    private zzcyj(zzdtu<Context> zzdtu, zzdtu<zzawu> zzdtu2) {
        this.f21202a = zzdtu;
        this.f21203b = zzdtu2;
    }

    /* renamed from: a */
    public static zzcyj m23119a(zzdtu<Context> zzdtu, zzdtu<zzawu> zzdtu2) {
        return new zzcyj(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcyi(this.f21202a.get(), this.f21203b.get());
    }
}
