package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

public interface zabd {
    /* renamed from: a */
    <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25151a(T t);

    /* renamed from: a */
    void mo25152a();

    /* renamed from: a */
    void mo25153a(int i);

    /* renamed from: a */
    void mo25154a(ConnectionResult connectionResult, Api<?> api, boolean z);

    /* renamed from: b */
    <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25155b(T t);

    /* renamed from: b */
    void mo25156b();

    /* renamed from: d */
    void mo25158d(Bundle bundle);

    boolean disconnect();
}
