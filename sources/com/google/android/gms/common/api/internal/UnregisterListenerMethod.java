package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {
    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract void mo25092a(A a, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
