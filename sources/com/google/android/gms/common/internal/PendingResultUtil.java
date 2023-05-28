package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public class PendingResultUtil {

    /* renamed from: a */
    private static final zaa f14139a = new C7234f();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        /* renamed from: a */
        T mo24754a(R r);
    }

    public interface zaa {
        /* renamed from: a */
        ApiException mo25374a(Status status);
    }

    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result, T> Task<T> m16034a(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zaa zaa2 = f14139a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.mo24964a((PendingResult.StatusListener) new C7235g(pendingResult, taskCompletionSource, resultConverter, zaa2));
        return taskCompletionSource.mo30710a();
    }

    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result, T extends Response<R>> Task<T> m16033a(PendingResult<R> pendingResult, T t) {
        return m16034a(pendingResult, new C7236h(t));
    }
}
