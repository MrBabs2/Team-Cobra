package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzclb extends zzatl implements zzbsm {

    /* renamed from: f */
    private zzatk f20544f;

    /* renamed from: g */
    private zzbsn f20545g;

    /* renamed from: h */
    private zzbvo f20546h;

    /* renamed from: C */
    public final synchronized void mo26031C(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26031C(iObjectWrapper);
        }
    }

    /* renamed from: E */
    public final synchronized void mo26032E(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26032E(iObjectWrapper);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28729a(zzatk zzatk) {
        this.f20544f = zzatk;
    }

    /* renamed from: b */
    public final synchronized void mo26034b(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26034b(iObjectWrapper, i);
        }
        if (this.f20546h != null) {
            this.f20546h.mo25875a(i);
        }
    }

    /* renamed from: c */
    public final synchronized void mo26035c(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26035c(iObjectWrapper, i);
        }
        if (this.f20545g != null) {
            this.f20545g.onAdFailedToLoad(i);
        }
    }

    /* renamed from: g */
    public final synchronized void mo26036g(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26036g(iObjectWrapper);
        }
    }

    /* renamed from: j */
    public final synchronized void mo26037j(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26037j(iObjectWrapper);
        }
    }

    /* renamed from: o */
    public final synchronized void mo26038o(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26038o(iObjectWrapper);
        }
        if (this.f20546h != null) {
            this.f20546h.onInitializationSucceeded();
        }
    }

    /* renamed from: q */
    public final synchronized void mo26039q(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26039q(iObjectWrapper);
        }
        if (this.f20545g != null) {
            this.f20545g.onAdLoaded();
        }
    }

    /* renamed from: u */
    public final synchronized void mo26040u(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26040u(iObjectWrapper);
        }
    }

    /* renamed from: x */
    public final synchronized void mo26041x(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26041x(iObjectWrapper);
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.zzb(bundle);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28419a(zzbsn zzbsn) {
        this.f20545g = zzbsn;
    }

    /* renamed from: a */
    public final synchronized void mo28730a(zzbvo zzbvo) {
        this.f20546h = zzbvo;
    }

    /* renamed from: a */
    public final synchronized void mo26033a(IObjectWrapper iObjectWrapper, zzato zzato) throws RemoteException {
        if (this.f20544f != null) {
            this.f20544f.mo26033a(iObjectWrapper, zzato);
        }
    }
}
