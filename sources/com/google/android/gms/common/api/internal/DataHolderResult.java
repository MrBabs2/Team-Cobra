package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@KeepForSdk
public class DataHolderResult implements Releasable, Result {
    @KeepForSdk

    /* renamed from: f */
    protected final Status f13716f;
    @KeepForSdk

    /* renamed from: g */
    protected final DataHolder f13717g;

    @KeepForSdk
    /* renamed from: a */
    public void mo24917a() {
        DataHolder dataHolder = this.f13717g;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @KeepForSdk
    public Status getStatus() {
        return this.f13716f;
    }
}
