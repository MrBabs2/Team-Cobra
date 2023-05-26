package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

public final class zaw<O extends Api.ApiOptions> extends GoogleApi<O> {

    /* renamed from: i */
    private final Api.Client f13990i;

    /* renamed from: j */
    private final zaq f13991j;

    /* renamed from: k */
    private final ClientSettings f13992k;

    /* renamed from: l */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f13993l;

    public zaw(Context context, Api<O> api, Looper looper, Api.Client client, zaq zaq, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        super(context, api, looper);
        this.f13990i = client;
        this.f13991j = zaq;
        this.f13992k = clientSettings;
        this.f13993l = abstractClientBuilder;
        this.f13651h.mo25027a((GoogleApi<?>) this);
    }

    /* renamed from: a */
    public final Api.Client mo24921a(Looper looper, GoogleApiManager.zaa<O> zaa) {
        this.f13991j.mo25196a((zar) zaa);
        return this.f13990i;
    }

    /* renamed from: h */
    public final Api.Client mo25197h() {
        return this.f13990i;
    }

    /* renamed from: a */
    public final zace mo24924a(Context context, Handler handler) {
        return new zace(context, handler, this.f13992k, this.f13993l);
    }
}
