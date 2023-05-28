package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzcqc implements zzbrl, zzbro, zzbsr {

    /* renamed from: f */
    private zzatb f20784f;

    /* renamed from: g */
    private zzasu f20785g;

    /* renamed from: a */
    public final synchronized void mo28771a(zzatb zzatb) {
        this.f20784f = zzatb;
    }

    public final synchronized void onAdClosed() {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoAdClosed();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdClosed.", e);
            }
        }
    }

    public final synchronized void onAdFailedToLoad(int i) {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoAdFailedToLoad(i);
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    public final synchronized void onAdLeftApplication() {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoAdLeftApplication();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    public final synchronized void onAdLoaded() {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoAdLoaded();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    public final synchronized void onAdOpened() {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoAdOpened();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAdOpened.", e);
            }
        }
    }

    public final synchronized void onRewardedVideoCompleted() {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoCompleted();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void onRewardedVideoStarted() {
        if (this.f20784f != null) {
            try {
                this.f20784f.onRewardedVideoStarted();
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onRewardedVideoStarted.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo28770a(zzasu zzasu) {
        this.f20785g = zzasu;
    }

    /* renamed from: a */
    public final synchronized void mo28260a(zzasr zzasr, String str, String str2) {
        if (this.f20784f != null) {
            try {
                this.f20784f.mo27627a(zzasr);
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onRewarded.", e);
            }
        }
        if (this.f20785g != null) {
            try {
                this.f20785g.mo27625a(zzasr, str, str2);
            } catch (RemoteException e2) {
                zzbad.m20524d("#007 Could not call remote method.", e2);
            }
        }
    }
}
