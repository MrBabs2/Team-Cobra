package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    /* renamed from: a */
    private final Feature[] f13772a = null;

    /* renamed from: b */
    private final boolean f13773b = false;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private Builder() {
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract void mo25089a(A a, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    /* renamed from: a */
    public boolean mo25090a() {
        return this.f13773b;
    }

    /* renamed from: b */
    public final Feature[] mo25091b() {
        return this.f13772a;
    }
}
