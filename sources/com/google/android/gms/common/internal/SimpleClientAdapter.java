package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Api;

public class SimpleClientAdapter<T extends IInterface> extends GmsClient<T> {

    /* renamed from: d */
    private final Api.SimpleClient<T> f14155d;

    /* access modifiers changed from: protected */
    public T createServiceInterface(IBinder iBinder) {
        return this.f14155d.createServiceInterface(iBinder);
    }

    /* renamed from: d */
    public Api.SimpleClient<T> mo25391d() {
        return this.f14155d;
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return this.f14155d.getServiceDescriptor();
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return this.f14155d.getStartServiceAction();
    }

    /* access modifiers changed from: protected */
    public void onSetConnectState(int i, T t) {
        this.f14155d.mo24907a(i, t);
    }
}
