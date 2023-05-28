package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.internal.Preconditions;

@zzard
public final class zzauo implements MediationRewardedAdCallback {

    /* renamed from: a */
    private final zzamv f18527a;

    public zzauo(zzamv zzamv) {
        this.f18527a = zzamv;
    }

    public final void onAdClosed() {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClosed.");
        try {
            this.f18527a.onAdClosed();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(String str) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdFailedToShow.");
        String valueOf = String.valueOf(str);
        zzbad.m20523d(valueOf.length() != 0 ? "Mediation ad failed to show: ".concat(valueOf) : new String("Mediation ad failed to show: "));
        try {
            this.f18527a.mo27437c(0);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened() {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdOpened.");
        try {
            this.f18527a.onAdOpened();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onUserEarnedReward.");
        try {
            this.f18527a.mo27436a((zzatq) new zzaup(rewardItem));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoComplete() {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onVideoComplete.");
        try {
            this.f18527a.mo27439j1();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStart() {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onVideoStart.");
        try {
            this.f18527a.mo27432J();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdClicked() {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called reportAdClicked.");
        try {
            this.f18527a.onAdClicked();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdImpression() {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called reportAdImpression.");
        try {
            this.f18527a.onAdImpression();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
