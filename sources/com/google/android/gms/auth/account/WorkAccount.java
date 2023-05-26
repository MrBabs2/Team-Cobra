package com.google.android.gms.auth.account;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

public class WorkAccount {

    /* renamed from: a */
    private static final Api.ClientKey<zzr> f13425a = new Api.ClientKey<>();

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzr, Api.ApiOptions.NoOptions> f13426b;

    static {
        C7129a aVar = new C7129a();
        f13426b = aVar;
        new Api("WorkAccount.API", aVar, f13425a);
        new zzh();
    }

    private WorkAccount() {
    }
}
