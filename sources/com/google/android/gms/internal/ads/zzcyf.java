package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

public final class zzcyf implements zzdti<Clock> {
    public zzcyf(zzcye zzcye) {
    }

    public final /* synthetic */ Object get() {
        Clock d = DefaultClock.m16265d();
        zzdto.m24236a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
