package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;

public final class zaav implements zabd {

    /* renamed from: a */
    private final zabe f13890a;

    public zaav(zabe zabe) {
        this.f13890a = zabe;
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25151a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo25153a(int i) {
    }

    /* renamed from: a */
    public final void mo25154a(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    /* renamed from: b */
    public final void mo25156b() {
        for (Api.Client disconnect : this.f13890a.f13921k.values()) {
            disconnect.disconnect();
        }
        this.f13890a.f13929s.f13906q = Collections.emptySet();
    }

    /* renamed from: d */
    public final void mo25158d(Bundle bundle) {
    }

    public final boolean disconnect() {
        return true;
    }

    /* renamed from: a */
    public final void mo25152a() {
        this.f13890a.mo25171f();
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25155b(T t) {
        this.f13890a.f13929s.f13898i.add(t);
        return t;
    }
}
