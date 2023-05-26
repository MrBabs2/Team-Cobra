package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class zzcob implements zzdti<zzcnw> {

    /* renamed from: a */
    private final zzdtu<Context> f20677a;

    /* renamed from: b */
    private final zzdtu<Executor> f20678b;

    /* renamed from: c */
    private final zzdtu<zzcdf> f20679c;

    public zzcob(zzdtu<Context> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<zzcdf> zzdtu3) {
        this.f20677a = zzdtu;
        this.f20678b = zzdtu2;
        this.f20679c = zzdtu3;
    }

    public final /* synthetic */ Object get() {
        return new zzcnw(this.f20677a.get(), this.f20678b.get(), this.f20679c.get());
    }
}
