package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* renamed from: com.google.android.gms.internal.ads.e3 */
final class C7419e3 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationRewardedAdCallback {

    /* renamed from: a */
    private zzamv f15054a;

    C7419e3(zzamv zzamv) {
        this.f15054a = zzamv;
    }

    public final void onAdClosed() {
        try {
            this.f15054a.onAdClosed();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            String valueOf = String.valueOf(str);
            zzbad.m20523d(valueOf.length() != 0 ? "Mediated ad failed to show: ".concat(valueOf) : new String("Mediated ad failed to show: "));
            this.f15054a.mo27437c(0);
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.f15054a.onAdLeftApplication();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.f15054a.onAdOpened();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(RewardItem rewardItem) {
        try {
            this.f15054a.mo27436a((zzatq) new zzaup(rewardItem));
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.f15054a.mo27450x();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
    }

    public final void onVideoPlay() {
        try {
            this.f15054a.onVideoPlay();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.f15054a.mo27432J();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.f15054a.onAdClicked();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
    }
}
