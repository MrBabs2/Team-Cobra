package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.internal.safetynet.zzy;

public final class SafetyNet {

    /* renamed from: a */
    private static final Api.ClientKey<zzx> f23666a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> f23667b;
    @Deprecated

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f23668c;
    @Deprecated

    /* renamed from: d */
    public static final SafetyNetApi f23669d = new zzk();

    static {
        C8395a aVar = new C8395a();
        f23667b = aVar;
        f23668c = new Api<>("SafetyNet.API", aVar, f23666a);
        new zzy();
    }

    private SafetyNet() {
    }

    /* renamed from: a */
    public static SafetyNetClient m26859a(Context context) {
        return new SafetyNetClient(context);
    }
}
