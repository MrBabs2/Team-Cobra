package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.g */
final class C7235g implements PendingResult.StatusListener {

    /* renamed from: a */
    private final /* synthetic */ PendingResult f14169a;

    /* renamed from: b */
    private final /* synthetic */ TaskCompletionSource f14170b;

    /* renamed from: c */
    private final /* synthetic */ PendingResultUtil.ResultConverter f14171c;

    /* renamed from: d */
    private final /* synthetic */ PendingResultUtil.zaa f14172d;

    C7235g(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, PendingResultUtil.zaa zaa) {
        this.f14169a = pendingResult;
        this.f14170b = taskCompletionSource;
        this.f14171c = resultConverter;
        this.f14172d = zaa;
    }

    /* renamed from: a */
    public final void mo24966a(Status status) {
        if (status.mo24986q()) {
            this.f14170b.mo30712a(this.f14171c.mo24754a(this.f14169a.mo24963a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f14170b.mo30711a((Exception) this.f14172d.mo25374a(status));
    }
}
