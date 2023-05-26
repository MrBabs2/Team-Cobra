package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzy;

/* renamed from: com.google.android.gms.internal.location.e */
final class C8252e extends zzy {

    /* renamed from: f */
    private final ListenerHolder<LocationListener> f23155f;

    /* renamed from: a */
    public final synchronized void mo30013a(Location location) {
        this.f23155f.mo25079a(new C8253f(this, location));
    }
}
