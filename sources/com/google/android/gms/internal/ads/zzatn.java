package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzatn implements MediationRewardedVideoAdListener {

    /* renamed from: a */
    private final zzatk f18517a;

    public zzatn(zzatk zzatk) {
        this.f18517a = zzatk;
    }

    public final void onAdClicked(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClicked.");
        try {
            this.f18517a.mo26032E(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClosed.");
        try {
            this.f18517a.mo26031C(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdFailedToLoad.");
        try {
            this.f18517a.mo26035c(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLeftApplication.");
        try {
            this.f18517a.mo26040u(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLoaded.");
        try {
            this.f18517a.mo26039q(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdOpened.");
        try {
            this.f18517a.mo26036g(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onInitializationFailed(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onInitializationFailed.");
        try {
            this.f18517a.mo26034b(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onInitializationSucceeded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onInitializationSucceeded.");
        try {
            this.f18517a.mo26038o(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onRewarded(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, RewardItem rewardItem) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onRewarded.");
        if (rewardItem != null) {
            try {
                this.f18517a.mo26033a(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter), new zzato(rewardItem));
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        } else {
            this.f18517a.mo26033a(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter), new zzato("", 1));
        }
    }

    public final void onVideoCompleted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onVideoCompleted.");
        try {
            this.f18517a.mo26041x(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStarted(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onVideoStarted.");
        try {
            this.f18517a.mo26037j(ObjectWrapper.m16391a(mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void zzb(Bundle bundle) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdMetadataChanged.");
        try {
            this.f18517a.zzb(bundle);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
