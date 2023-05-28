package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public final class PendingResults {

    /* renamed from: com.google.android.gms.common.api.PendingResults$a */
    private static final class C7160a<R extends Result> extends BasePendingResult<R> {

        /* renamed from: q */
        private final R f13676q;

        public C7160a(GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.f13676q = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final R mo24797a(Status status) {
            return this.f13676q;
        }
    }

    @KeepForSdk
    private PendingResults() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static PendingResult<Status> m15361a(Status status, GoogleApiClient googleApiClient) {
        Preconditions.m16038a(status, (Object) "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.mo25012a(status);
        return statusPendingResult;
    }

    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result> PendingResult<R> m15360a(R r, GoogleApiClient googleApiClient) {
        Preconditions.m16038a(r, (Object) "Result must not be null");
        Preconditions.m16044a(!r.getStatus().mo24986q(), (Object) "Status code must not be SUCCESS");
        C7160a aVar = new C7160a(googleApiClient, r);
        aVar.mo25012a(r);
        return aVar;
    }
}
