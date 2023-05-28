package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzcpw implements zzbrl, zzbro, zzbrw, zzbsr, zzxr {

    /* renamed from: f */
    private zzyz f20777f;

    /* renamed from: a */
    public final void mo28260a(zzasr zzasr, String str, String str2) {
    }

    /* renamed from: a */
    public final synchronized void mo28762a(zzyz zzyz) {
        this.f20777f = zzyz;
    }

    public final synchronized void onAdClicked() {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdClicked();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdClicked.", e);
            }
        }
    }

    public final synchronized void onAdClosed() {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdClosed();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdClosed.", e);
            }
        }
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    public final synchronized void onAdImpression() {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdImpression();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdImpression.", e);
            }
        }
    }

    public final synchronized void onAdLeftApplication() {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdLeftApplication();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdLoaded();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    public final synchronized void onAdOpened() {
        if (this.f20777f != null) {
            try {
                this.f20777f.onAdOpened();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdOpened.", e);
            }
        }
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    /* renamed from: a */
    public final synchronized zzyz mo28761a() {
        return this.f20777f;
    }
}
