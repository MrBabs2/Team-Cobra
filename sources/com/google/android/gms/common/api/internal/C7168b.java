package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.b */
final class C7168b implements PendingResult.StatusListener {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f13777a;

    /* renamed from: b */
    private final /* synthetic */ zaab f13778b;

    C7168b(zaab zaab, BasePendingResult basePendingResult) {
        this.f13778b = zaab;
        this.f13777a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo24966a(Status status) {
        this.f13778b.f13862a.remove(this.f13777a);
    }
}
