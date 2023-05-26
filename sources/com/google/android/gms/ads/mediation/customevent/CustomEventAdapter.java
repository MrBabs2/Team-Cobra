package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbad;

@KeepName
@KeepForSdkWithMembers
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    @VisibleForTesting
    private CustomEventBanner zzent;
    @VisibleForTesting
    private CustomEventInterstitial zzenu;
    @VisibleForTesting
    private CustomEventNative zzenv;
    private View zzmx;

    @VisibleForTesting
    static final class zza implements CustomEventBannerListener {
        private final CustomEventAdapter zzenw;
        private final MediationBannerListener zzenx;

        public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
            this.zzenw = customEventAdapter;
            this.zzenx = mediationBannerListener;
        }

        public final void onAdClicked() {
            zzbad.m20516a("Custom event adapter called onAdClicked.");
            this.zzenx.onAdClicked(this.zzenw);
        }

        public final void onAdClosed() {
            zzbad.m20516a("Custom event adapter called onAdClosed.");
            this.zzenx.onAdClosed(this.zzenw);
        }

        public final void onAdFailedToLoad(int i) {
            zzbad.m20516a("Custom event adapter called onAdFailedToLoad.");
            this.zzenx.onAdFailedToLoad(this.zzenw, i);
        }

        public final void onAdLeftApplication() {
            zzbad.m20516a("Custom event adapter called onAdLeftApplication.");
            this.zzenx.onAdLeftApplication(this.zzenw);
        }

        public final void onAdLoaded(View view) {
            zzbad.m20516a("Custom event adapter called onAdLoaded.");
            this.zzenw.zza(view);
            this.zzenx.onAdLoaded(this.zzenw);
        }

        public final void onAdOpened() {
            zzbad.m20516a("Custom event adapter called onAdOpened.");
            this.zzenx.onAdOpened(this.zzenw);
        }
    }

    @VisibleForTesting
    class zzb implements CustomEventInterstitialListener {
        private final CustomEventAdapter zzenw;
        private final MediationInterstitialListener zzeny;

        public zzb(CustomEventAdapter customEventAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.zzenw = customEventAdapter;
            this.zzeny = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            zzbad.m20516a("Custom event adapter called onAdClicked.");
            this.zzeny.onAdClicked(this.zzenw);
        }

        public final void onAdClosed() {
            zzbad.m20516a("Custom event adapter called onAdClosed.");
            this.zzeny.onAdClosed(this.zzenw);
        }

        public final void onAdFailedToLoad(int i) {
            zzbad.m20516a("Custom event adapter called onFailedToReceiveAd.");
            this.zzeny.onAdFailedToLoad(this.zzenw, i);
        }

        public final void onAdLeftApplication() {
            zzbad.m20516a("Custom event adapter called onAdLeftApplication.");
            this.zzeny.onAdLeftApplication(this.zzenw);
        }

        public final void onAdLoaded() {
            zzbad.m20516a("Custom event adapter called onReceivedAd.");
            this.zzeny.onAdLoaded(CustomEventAdapter.this);
        }

        public final void onAdOpened() {
            zzbad.m20516a("Custom event adapter called onAdOpened.");
            this.zzeny.onAdOpened(this.zzenw);
        }
    }

    /* access modifiers changed from: private */
    public final void zza(View view) {
        this.zzmx = view;
    }

    private static <T> T zzaj(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzbad.m20523d(sb.toString());
            return null;
        }
    }

    public final View getBannerView() {
        return this.zzmx;
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.zzent;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.zzenu;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.zzenv;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.zzent;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.zzenu;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.zzenv;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.zzent;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.zzenu;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.zzenv;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public final void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) zzaj(bundle.getString("class_name"));
        this.zzent = customEventBanner;
        if (customEventBanner == null) {
            mediationBannerListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        Context context2 = context;
        this.zzent.requestBannerAd(context2, new zza(this, mediationBannerListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), adSize, mediationAdRequest, bundle3);
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) zzaj(bundle.getString("class_name"));
        this.zzenu = customEventInterstitial;
        if (customEventInterstitial == null) {
            mediationInterstitialListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        Context context2 = context;
        this.zzenu.requestInterstitialAd(context2, new zzb(this, mediationInterstitialListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), mediationAdRequest, bundle3);
    }

    public final void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) zzaj(bundle.getString("class_name"));
        this.zzenv = customEventNative;
        if (customEventNative == null) {
            mediationNativeListener.onAdFailedToLoad(this, 0);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        Context context2 = context;
        this.zzenv.requestNativeAd(context2, new zzc(this, mediationNativeListener), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), nativeMediationAdRequest, bundle3);
    }

    public final void showInterstitial() {
        this.zzenu.showInterstitial();
    }

    @VisibleForTesting
    static class zzc implements CustomEventNativeListener {
        private final CustomEventAdapter zzenw;
        private final MediationNativeListener zzeoa;

        public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
            this.zzenw = customEventAdapter;
            this.zzeoa = mediationNativeListener;
        }

        public final void onAdClicked() {
            zzbad.m20516a("Custom event adapter called onAdClicked.");
            this.zzeoa.onAdClicked(this.zzenw);
        }

        public final void onAdClosed() {
            zzbad.m20516a("Custom event adapter called onAdClosed.");
            this.zzeoa.onAdClosed(this.zzenw);
        }

        public final void onAdFailedToLoad(int i) {
            zzbad.m20516a("Custom event adapter called onAdFailedToLoad.");
            this.zzeoa.onAdFailedToLoad(this.zzenw, i);
        }

        public final void onAdImpression() {
            zzbad.m20516a("Custom event adapter called onAdImpression.");
            this.zzeoa.onAdImpression(this.zzenw);
        }

        public final void onAdLeftApplication() {
            zzbad.m20516a("Custom event adapter called onAdLeftApplication.");
            this.zzeoa.onAdLeftApplication(this.zzenw);
        }

        public final void onAdLoaded(NativeAdMapper nativeAdMapper) {
            zzbad.m20516a("Custom event adapter called onAdLoaded.");
            this.zzeoa.onAdLoaded((MediationNativeAdapter) this.zzenw, nativeAdMapper);
        }

        public final void onAdOpened() {
            zzbad.m20516a("Custom event adapter called onAdOpened.");
            this.zzeoa.onAdOpened(this.zzenw);
        }

        public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
            zzbad.m20516a("Custom event adapter called onAdLoaded.");
            this.zzeoa.onAdLoaded((MediationNativeAdapter) this.zzenw, unifiedNativeAdMapper);
        }
    }
}
