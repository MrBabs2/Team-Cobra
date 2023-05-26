package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.p188authapiphone.zzi;

public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {

    /* renamed from: i */
    private static final Api.ClientKey<zzi> f13510i = new Api.ClientKey<>();

    /* renamed from: j */
    private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> f13511j;

    static {
        C7141a aVar = new C7141a();
        f13511j = aVar;
        new Api("SmsRetriever.API", aVar, f13510i);
    }
}
