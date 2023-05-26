package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* renamed from: com.google.android.gms.common.internal.h */
final class C7236h implements PendingResultUtil.ResultConverter<R, T> {

    /* renamed from: a */
    private final /* synthetic */ Response f14173a;

    C7236h(Response response) {
        this.f14173a = response;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo24754a(Result result) {
        this.f14173a.mo24969a(result);
        return this.f14173a;
    }
}
