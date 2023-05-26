package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbk;
import com.google.android.gms.internal.location.zzq;

public class LocationServices {

    /* renamed from: a */
    private static final Api.ClientKey<zzaz> f23622a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f23623b;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        C8388b bVar = new C8388b();
        f23623b = bVar;
        new Api("LocationServices.API", bVar, f23622a);
        new zzq();
        new zzaf();
        new zzbk();
    }

    private LocationServices() {
    }
}
