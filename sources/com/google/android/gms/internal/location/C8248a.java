package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.zzv;

/* renamed from: com.google.android.gms.internal.location.a */
final class C8248a extends zzv {

    /* renamed from: f */
    private final ListenerHolder<LocationCallback> f23152f;

    /* renamed from: a */
    public final void mo30011a(LocationAvailability locationAvailability) {
        this.f23152f.mo25079a(new C8250c(this, locationAvailability));
    }

    /* renamed from: a */
    public final void mo30012a(LocationResult locationResult) {
        this.f23152f.mo25079a(new C8249b(this, locationResult));
    }
}
