package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* renamed from: a */
    private final BasePendingResult<R> f13767a;

    /* renamed from: a */
    public final R mo24963a(long j, TimeUnit timeUnit) {
        return this.f13767a.mo24963a(j, timeUnit);
    }

    /* renamed from: a */
    public final void mo24914a() {
        this.f13767a.mo24914a();
    }

    /* renamed from: a */
    public final void mo24965a(ResultCallback<? super R> resultCallback) {
        this.f13767a.mo24965a(resultCallback);
    }

    /* renamed from: a */
    public final void mo24964a(PendingResult.StatusListener statusListener) {
        this.f13767a.mo24964a(statusListener);
    }
}
