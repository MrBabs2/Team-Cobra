package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzanp extends zzamw {

    /* renamed from: f */
    private final Adapter f18224f;

    /* renamed from: g */
    private final zzatk f18225g;

    zzanp(Adapter adapter, zzatk zzatk) {
        this.f18224f = adapter;
        this.f18225g = zzatk;
    }

    /* renamed from: J */
    public final void mo27432J() throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26037j(ObjectWrapper.m16391a(this.f18224f));
        }
    }

    /* renamed from: a */
    public final void mo27433a(zzafe zzafe, String str) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27434a(zzamy zzamy) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27435a(zzato zzato) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo27436a(zzatq zzatq) throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26033a(ObjectWrapper.m16391a(this.f18224f), new zzato(zzatq.getType(), zzatq.getAmount()));
        }
    }

    /* renamed from: c */
    public final void mo27437c(int i) throws RemoteException {
    }

    /* renamed from: i */
    public final void mo27438i(String str) throws RemoteException {
    }

    /* renamed from: j1 */
    public final void mo27439j1() throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26041x(ObjectWrapper.m16391a(this.f18224f));
        }
    }

    public final void onAdClicked() throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26032E(ObjectWrapper.m16391a(this.f18224f));
        }
    }

    public final void onAdClosed() throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26031C(ObjectWrapper.m16391a(this.f18224f));
        }
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26035c(ObjectWrapper.m16391a(this.f18224f), i);
        }
    }

    public final void onAdImpression() throws RemoteException {
    }

    public final void onAdLeftApplication() throws RemoteException {
    }

    public final void onAdLoaded() throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26039q(ObjectWrapper.m16391a(this.f18224f));
        }
    }

    public final void onAdOpened() throws RemoteException {
        zzatk zzatk = this.f18225g;
        if (zzatk != null) {
            zzatk.mo26036g(ObjectWrapper.m16391a(this.f18224f));
        }
    }

    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    public final void onVideoPause() throws RemoteException {
    }

    public final void onVideoPlay() throws RemoteException {
    }

    /* renamed from: x */
    public final void mo27450x() throws RemoteException {
    }

    public final void zzb(Bundle bundle) throws RemoteException {
    }
}
