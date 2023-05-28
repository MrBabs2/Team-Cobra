package com.airbnb.lottie;

import java.util.Arrays;

/* renamed from: com.airbnb.lottie.k */
/* compiled from: LottieResult */
public final class C5671k<V> {

    /* renamed from: a */
    private final V f10046a;

    /* renamed from: b */
    private final Throwable f10047b;

    public C5671k(V v) {
        this.f10046a = v;
        this.f10047b = null;
    }

    /* renamed from: a */
    public Throwable mo19474a() {
        return this.f10047b;
    }

    /* renamed from: b */
    public V mo19475b() {
        return this.f10046a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5671k)) {
            return false;
        }
        C5671k kVar = (C5671k) obj;
        if (mo19475b() != null && mo19475b().equals(kVar.mo19475b())) {
            return true;
        }
        if (mo19474a() == null || kVar.mo19474a() == null) {
            return false;
        }
        return mo19474a().toString().equals(mo19474a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{mo19475b(), mo19474a()});
    }

    public C5671k(Throwable th) {
        this.f10047b = th;
        this.f10046a = null;
    }
}
