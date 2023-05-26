package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

@KeepForSdk
public class StatusCallback extends IStatusCallback.Stub {
    @KeepForSdk

    /* renamed from: f */
    private final BaseImplementation.ResultHolder<Status> f13771f;

    @KeepForSdk
    /* renamed from: d */
    public void mo25059d(Status status) {
        this.f13771f.mo25006a(status);
    }
}
