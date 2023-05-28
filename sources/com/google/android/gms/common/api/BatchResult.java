package com.google.android.gms.common.api;

public final class BatchResult implements Result {

    /* renamed from: f */
    private final Status f13641f;

    BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f13641f = status;
    }

    public final Status getStatus() {
        return this.f13641f;
    }
}
