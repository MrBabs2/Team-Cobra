package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class BooleanResult implements Result {

    /* renamed from: f */
    private final Status f13642f;

    /* renamed from: g */
    private final boolean f13643g;

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        return this.f13642f.equals(booleanResult.f13642f) && this.f13643g == booleanResult.f13643g;
    }

    @KeepForSdk
    public Status getStatus() {
        return this.f13642f;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.f13642f.hashCode() + 527) * 31) + (this.f13643g ? 1 : 0);
    }
}
