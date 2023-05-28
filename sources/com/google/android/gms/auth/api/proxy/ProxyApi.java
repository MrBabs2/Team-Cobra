package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

@KeepForSdk
public interface ProxyApi {

    @KeepForSdk
    public interface ProxyResult extends Result {
    }

    @KeepForSdk
    public interface SpatulaHeaderResult extends Result {
    }
}
