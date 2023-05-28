package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* renamed from: com.google.android.gms.common.internal.service.c */
final class C7243c extends zaa {

    /* renamed from: f */
    private final BaseImplementation.ResultHolder<Status> f14191f;

    public C7243c(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f14191f = resultHolder;
    }

    /* renamed from: i */
    public final void mo25409i(int i) throws RemoteException {
        this.f14191f.mo25006a(new Status(i));
    }
}
