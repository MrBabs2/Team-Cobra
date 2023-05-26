package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

public class HashAccumulator {
    @VisibleForTesting

    /* renamed from: b */
    private static int f13577b = 31;

    /* renamed from: a */
    private int f13578a = 1;

    @KeepForSdk
    /* renamed from: a */
    public HashAccumulator mo24784a(Object obj) {
        this.f13578a = (f13577b * this.f13578a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final HashAccumulator mo24785a(boolean z) {
        this.f13578a = (f13577b * this.f13578a) + (z ? 1 : 0);
        return this;
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo24783a() {
        return this.f13578a;
    }
}
