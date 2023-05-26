package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: f */
    private final Feature f13691f;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature) {
        this.f13691f = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f13691f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
