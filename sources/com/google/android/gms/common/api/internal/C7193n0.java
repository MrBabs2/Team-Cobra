package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
final class C7193n0 {

    /* renamed from: a */
    private final int f13815a;

    /* renamed from: b */
    private final ConnectionResult f13816b;

    C7193n0(ConnectionResult connectionResult, int i) {
        Preconditions.m16037a(connectionResult);
        this.f13816b = connectionResult;
        this.f13815a = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ConnectionResult mo25114a() {
        return this.f13816b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo25115b() {
        return this.f13815a;
    }
}
