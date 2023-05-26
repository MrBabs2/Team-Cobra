package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import com.google.android.gms.common.api.internal.GoogleApiManager;

public final class zae<A extends BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient>> extends zab {

    /* renamed from: a */
    private final A f13962a;

    public zae(int i, A a) {
        super(i);
        this.f13962a = a;
    }

    /* renamed from: a */
    public final void mo25111a(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.f13962a.mo25007b(zaa.mo25051f());
        } catch (RuntimeException e) {
            mo25112a(e);
        }
    }

    /* renamed from: a */
    public final void mo25110a(Status status) {
        this.f13962a.mo25009c(status);
    }

    /* renamed from: a */
    public final void mo25112a(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f13962a.mo25009c(new Status(10, sb.toString()));
    }

    /* renamed from: a */
    public final void mo25166a(zaab zaab, boolean z) {
        zaab.mo25143a((BasePendingResult<? extends Result>) this.f13962a, z);
    }
}
