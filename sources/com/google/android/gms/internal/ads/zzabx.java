package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzabx extends zzasx {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzatb f17751f;

    /* renamed from: B */
    public final void mo27121B(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: F */
    public final void mo27122F(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27123a(zzasu zzasu) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27125a(zzath zzath) throws RemoteException {
        zzbad.m20519b("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazt.f18727b.post(new C7603j(this));
    }

    /* renamed from: a */
    public final void mo27126a(zzzp zzzp) throws RemoteException {
    }

    public final void destroy() throws RemoteException {
    }

    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    /* renamed from: k */
    public final void mo27131k(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: o */
    public final void mo27132o(String str) {
    }

    public final void pause() throws RemoteException {
    }

    public final void resume() throws RemoteException {
    }

    public final void setCustomData(String str) throws RemoteException {
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
    }

    public final void setUserId(String str) throws RemoteException {
    }

    public final void show() throws RemoteException {
    }

    /* renamed from: v */
    public final void mo27139v(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27124a(zzatb zzatb) throws RemoteException {
        this.f17751f = zzatb;
    }
}
