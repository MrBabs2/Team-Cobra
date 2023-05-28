package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final class zabp<O extends Api.ApiOptions> extends zaag {

    /* renamed from: c */
    private final GoogleApi<O> f13932c;

    public zabp(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f13932c = googleApi;
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo24940a(T t) {
        this.f13932c.mo24923a(t);
        return t;
    }

    /* renamed from: a */
    public final void mo24942a(zacm zacm) {
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo24946b(T t) {
        this.f13932c.mo24925b(t);
        return t;
    }

    /* renamed from: e */
    public final Context mo24950e() {
        return this.f13932c.mo24928d();
    }

    /* renamed from: f */
    public final Looper mo24951f() {
        return this.f13932c.mo24930f();
    }
}
