package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;

@zzard
public abstract class zzbak extends AbstractExecutorService implements zzbbl {
    /* renamed from: a */
    public final zzbbh<?> submit(Runnable runnable) throws RejectedExecutionException {
        return (zzbbh) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C7423e7(runnable, t);
    }

    /* renamed from: a */
    public final <T> zzbbh<T> submit(Callable<T> callable) throws RejectedExecutionException {
        return (zzbbh) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C7423e7(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzbbh) super.submit(runnable, obj);
    }
}
