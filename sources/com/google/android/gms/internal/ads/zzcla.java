package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;

public final class zzcla extends zzamw implements zzbsm {

    /* renamed from: f */
    private zzamv f20542f;

    /* renamed from: g */
    private zzbsn f20543g;

    /* renamed from: J */
    public final synchronized void mo27432J() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27432J();
        }
    }

    /* renamed from: a */
    public final synchronized void mo28728a(zzamv zzamv) {
        this.f20542f = zzamv;
    }

    /* renamed from: c */
    public final synchronized void mo27437c(int i) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27437c(i);
        }
    }

    /* renamed from: i */
    public final synchronized void mo27438i(String str) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27438i(str);
        }
    }

    /* renamed from: j1 */
    public final synchronized void mo27439j1() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27439j1();
        }
    }

    public final synchronized void onAdClicked() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdClicked();
        }
    }

    public final synchronized void onAdClosed() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdClosed();
        }
    }

    public final synchronized void onAdFailedToLoad(int i) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdFailedToLoad(i);
        }
        if (this.f20543g != null) {
            this.f20543g.onAdFailedToLoad(i);
        }
    }

    public final synchronized void onAdImpression() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdImpression();
        }
    }

    public final synchronized void onAdLeftApplication() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdLeftApplication();
        }
    }

    public final synchronized void onAdLoaded() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdLoaded();
        }
        if (this.f20543g != null) {
            this.f20543g.onAdLoaded();
        }
    }

    public final synchronized void onAdOpened() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAdOpened();
        }
    }

    public final synchronized void onAppEvent(String str, String str2) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onAppEvent(str, str2);
        }
    }

    public final synchronized void onVideoPause() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onVideoPause();
        }
    }

    public final synchronized void onVideoPlay() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.onVideoPlay();
        }
    }

    /* renamed from: x */
    public final synchronized void mo27450x() throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27450x();
        }
    }

    public final synchronized void zzb(Bundle bundle) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.zzb(bundle);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28419a(zzbsn zzbsn) {
        this.f20543g = zzbsn;
    }

    /* renamed from: a */
    public final synchronized void mo27434a(zzamy zzamy) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27434a(zzamy);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27433a(zzafe zzafe, String str) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27433a(zzafe, str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27435a(zzato zzato) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27435a(zzato);
        }
    }

    /* renamed from: a */
    public final synchronized void mo27436a(zzatq zzatq) throws RemoteException {
        if (this.f20542f != null) {
            this.f20542f.mo27436a(zzatq);
        }
    }
}
