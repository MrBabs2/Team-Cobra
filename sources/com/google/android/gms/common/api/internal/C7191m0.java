package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
abstract class C7191m0<T> extends zac {

    /* renamed from: a */
    protected final TaskCompletionSource<T> f13812a;

    public C7191m0(int i, TaskCompletionSource<T> taskCompletionSource) {
        super(i);
        this.f13812a = taskCompletionSource;
    }

    /* renamed from: a */
    public void mo25110a(Status status) {
        this.f13812a.mo30713b((Exception) new ApiException(status));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo25113d(GoogleApiManager.zaa<?> zaa) throws RemoteException;

    /* renamed from: a */
    public void mo25112a(RuntimeException runtimeException) {
        this.f13812a.mo30713b((Exception) runtimeException);
    }

    /* renamed from: a */
    public final void mo25111a(GoogleApiManager.zaa<?> zaa) throws DeadObjectException {
        try {
            mo25113d(zaa);
        } catch (DeadObjectException e) {
            mo25110a(zab.m15723a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            mo25110a(zab.m15723a(e2));
        } catch (RuntimeException e3) {
            mo25112a(e3);
        }
    }
}
