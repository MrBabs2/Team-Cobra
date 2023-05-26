package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class zzcqa implements zzbrl, zzbrs {

    /* renamed from: f */
    private zzatw f20781f;

    /* renamed from: g */
    private zzaue f20782g;

    /* renamed from: a */
    public final synchronized void mo28767a(zzatw zzatw) {
        this.f20781f = zzatw;
    }

    /* renamed from: c */
    public final synchronized void mo28407c(int i) {
        if (this.f20781f != null) {
            try {
                this.f20781f.mo27651r(i);
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void onAdClosed() {
        if (this.f20781f != null) {
            try {
                this.f20781f.mo27648O();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void onAdLeftApplication() {
    }

    public final synchronized void onAdOpened() {
        if (this.f20781f != null) {
            try {
                this.f20781f.mo27649V();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized void onRewardedVideoCompleted() {
    }

    public final synchronized void onRewardedVideoStarted() {
    }

    /* renamed from: a */
    public final synchronized void mo28768a(zzaue zzaue) {
        this.f20782g = zzaue;
    }

    /* renamed from: a */
    public final synchronized void mo28260a(zzasr zzasr, String str, String str2) {
        if (this.f20781f != null) {
            try {
                this.f20781f.mo27650a(new zzaup(zzasr.getType(), zzasr.getAmount()));
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
        if (this.f20782g != null) {
            try {
                this.f20782g.mo27655a(new zzaup(zzasr.getType(), zzasr.getAmount()), str, str2);
            } catch (RemoteException e2) {
                zzbad.m20524d("#007 Could not call remote method.", e2);
            }
        }
    }
}
