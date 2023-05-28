package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

public abstract class Task<TResult> {
    /* renamed from: a */
    public Task<TResult> mo30704a(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract Exception mo30706a();

    /* renamed from: b */
    public abstract TResult mo30707b();

    /* renamed from: c */
    public abstract boolean mo30708c();

    /* renamed from: d */
    public abstract boolean mo30709d();

    /* renamed from: a */
    public Task<TResult> mo30705a(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
