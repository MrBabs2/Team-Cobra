package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zze;

public class ActivityRecognition {

    /* renamed from: a */
    private static final Api.ClientKey<zzaz> f23584a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f23585b;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        C8387a aVar = new C8387a();
        f23585b = aVar;
        new Api("ActivityRecognition.API", aVar, f23584a);
        new zze();
    }

    private ActivityRecognition() {
    }
}
