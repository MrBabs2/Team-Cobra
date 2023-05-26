package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

@KeepForSdk
public abstract class PendingResult<R extends Result> {

    @KeepForSdk
    public interface StatusListener {
        @KeepForSdk
        /* renamed from: a */
        void mo24966a(Status status);
    }

    /* renamed from: a */
    public abstract R mo24963a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    public abstract void mo24914a();

    @KeepForSdk
    /* renamed from: a */
    public void mo24964a(StatusListener statusListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo24965a(ResultCallback<? super R> resultCallback);
}
