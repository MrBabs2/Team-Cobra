package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a */
    private final ListenerHolder<L> f13768a;

    /* renamed from: b */
    private final Feature[] f13769b;

    /* renamed from: c */
    private final boolean f13770c;

    @KeepForSdk
    /* renamed from: a */
    public void mo25084a() {
        this.f13768a.mo25078a();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: a */
    public abstract void mo25085a(A a, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    /* renamed from: b */
    public ListenerHolder.ListenerKey<L> mo25086b() {
        return this.f13768a.mo25080b();
    }

    @KeepForSdk
    /* renamed from: c */
    public Feature[] mo25087c() {
        return this.f13769b;
    }

    /* renamed from: d */
    public final boolean mo25088d() {
        return this.f13770c;
    }
}
