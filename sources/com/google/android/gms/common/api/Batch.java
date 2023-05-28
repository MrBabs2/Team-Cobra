package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

public final class Batch extends BasePendingResult<BatchResult> {

    /* renamed from: q */
    private final PendingResult<?>[] f13640q;

    public static final class Builder {
    }

    /* renamed from: a */
    public final void mo24914a() {
        super.mo24914a();
        for (PendingResult<?> a : this.f13640q) {
            a.mo24914a();
        }
    }

    /* renamed from: a */
    public final BatchResult m15308a(Status status) {
        return new BatchResult(status, this.f13640q);
    }
}
