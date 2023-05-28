package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zag<ResultT> extends zac {

    /* renamed from: a */
    private final TaskApiCall<Api.AnyClient, ResultT> f13965a;

    /* renamed from: b */
    private final TaskCompletionSource<ResultT> f13966b;

    /* renamed from: c */
    private final StatusExceptionMapper f13967c;

    /* renamed from: a */
    public final void mo25111a(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            this.f13965a.mo25089a(zaa.mo25051f(), this.f13966b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            mo25110a(zab.m15723a(e2));
        } catch (RuntimeException e3) {
            mo25112a(e3);
        }
    }

    /* renamed from: b */
    public final Feature[] mo25176b(GoogleApiManager.zaa<?> zaa) {
        return this.f13965a.mo25091b();
    }

    /* renamed from: c */
    public final boolean mo25177c(GoogleApiManager.zaa<?> zaa) {
        return this.f13965a.mo25090a();
    }

    /* renamed from: a */
    public final void mo25110a(Status status) {
        this.f13966b.mo30713b(this.f13967c.mo24991a(status));
    }

    /* renamed from: a */
    public final void mo25112a(RuntimeException runtimeException) {
        this.f13966b.mo30713b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo25166a(zaab zaab, boolean z) {
        zaab.mo25144a(this.f13966b, z);
    }
}
