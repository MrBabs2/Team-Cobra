package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

public abstract class ResultTransform<R extends Result, S extends Result> {
    /* renamed from: a */
    public abstract PendingResult<S> mo24973a(R r);

    /* renamed from: a */
    public Status mo24974a(Status status) {
        return status;
    }
}
