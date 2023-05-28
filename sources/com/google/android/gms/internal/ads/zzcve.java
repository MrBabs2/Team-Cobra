package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzcve<T> implements zzdti<zzcvb<T>> {

    /* renamed from: a */
    private final zzdtu<Executor> f21005a;

    /* renamed from: b */
    private final zzdtu<Set<zzcva<? extends zzcuz<T>>>> f21006b;

    private zzcve(zzdtu<Executor> zzdtu, zzdtu<Set<zzcva<? extends zzcuz<T>>>> zzdtu2) {
        this.f21005a = zzdtu;
        this.f21006b = zzdtu2;
    }

    /* renamed from: a */
    public static <T> zzcve<T> m23016a(zzdtu<Executor> zzdtu, zzdtu<Set<zzcva<? extends zzcuz<T>>>> zzdtu2) {
        return new zzcve<>(zzdtu, zzdtu2);
    }

    public final /* synthetic */ Object get() {
        return new zzcvb(this.f21005a.get(), this.f21006b.get());
    }
}
