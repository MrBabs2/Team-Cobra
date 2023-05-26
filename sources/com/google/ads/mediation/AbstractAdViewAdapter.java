package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAdViewHolder;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyt;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@zzard
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza, MediationRewardedVideoAdAdapter, zzbjl {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmd;
    private InterstitialAd zzme;
    private AdLoader zzmf;
    private Context zzmg;
    /* access modifiers changed from: private */
    public InterstitialAd zzmh;
    /* access modifiers changed from: private */
    public MediationRewardedVideoAdListener zzmi;
    @VisibleForTesting
    private final RewardedVideoAdListener zzmj = new C7122f(this);

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$a */
    static class C7105a extends NativeAppInstallAdMapper {

        /* renamed from: a */
        private final NativeAppInstallAd f13381a;

        public C7105a(NativeAppInstallAd nativeAppInstallAd) {
            this.f13381a = nativeAppInstallAd;
            setHeadline(nativeAppInstallAd.getHeadline().toString());
            setImages(nativeAppInstallAd.getImages());
            setBody(nativeAppInstallAd.getBody().toString());
            setIcon(nativeAppInstallAd.getIcon());
            setCallToAction(nativeAppInstallAd.getCallToAction().toString());
            if (nativeAppInstallAd.getStarRating() != null) {
                setStarRating(nativeAppInstallAd.getStarRating().doubleValue());
            }
            if (nativeAppInstallAd.getStore() != null) {
                setStore(nativeAppInstallAd.getStore().toString());
            }
            if (nativeAppInstallAd.getPrice() != null) {
                setPrice(nativeAppInstallAd.getPrice().toString());
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeAppInstallAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f13381a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f13381a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$b */
    static class C7106b extends NativeContentAdMapper {

        /* renamed from: a */
        private final NativeContentAd f13382a;

        public C7106b(NativeContentAd nativeContentAd) {
            this.f13382a = nativeContentAd;
            setHeadline(nativeContentAd.getHeadline().toString());
            setImages(nativeContentAd.getImages());
            setBody(nativeContentAd.getBody().toString());
            if (nativeContentAd.getLogo() != null) {
                setLogo(nativeContentAd.getLogo());
            }
            setCallToAction(nativeContentAd.getCallToAction().toString());
            setAdvertiser(nativeContentAd.getAdvertiser().toString());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(nativeContentAd.getVideoController());
        }

        public final void trackView(View view) {
            if (view instanceof NativeAdView) {
                ((NativeAdView) view).setNativeAd(this.f13382a);
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd((NativeAd) this.f13382a);
            }
        }
    }

    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$c */
    static class C7107c extends UnifiedNativeAdMapper {

        /* renamed from: a */
        private final UnifiedNativeAd f13383a;

        public C7107c(UnifiedNativeAd unifiedNativeAd) {
            this.f13383a = unifiedNativeAd;
            setHeadline(unifiedNativeAd.getHeadline());
            setImages(unifiedNativeAd.getImages());
            setBody(unifiedNativeAd.getBody());
            setIcon(unifiedNativeAd.getIcon());
            setCallToAction(unifiedNativeAd.getCallToAction());
            setAdvertiser(unifiedNativeAd.getAdvertiser());
            setStarRating(unifiedNativeAd.getStarRating());
            setStore(unifiedNativeAd.getStore());
            setPrice(unifiedNativeAd.getPrice());
            zzp(unifiedNativeAd.zzkv());
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            zza(unifiedNativeAd.getVideoController());
        }

        public final void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof UnifiedNativeAdView) {
                ((UnifiedNativeAdView) view).setNativeAd(this.f13383a);
                return;
            }
            NativeAdViewHolder nativeAdViewHolder = NativeAdViewHolder.zzbql.get(view);
            if (nativeAdViewHolder != null) {
                nativeAdViewHolder.setNativeAd(this.f13383a);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$d */
    static final class C7108d extends AdListener implements AppEventListener, zzxr {
        @VisibleForTesting

        /* renamed from: f */
        private final AbstractAdViewAdapter f13384f;
        @VisibleForTesting

        /* renamed from: g */
        private final MediationBannerListener f13385g;

        public C7108d(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
            this.f13384f = abstractAdViewAdapter;
            this.f13385g = mediationBannerListener;
        }

        public final void onAdClicked() {
            this.f13385g.onAdClicked(this.f13384f);
        }

        public final void onAdClosed() {
            this.f13385g.onAdClosed(this.f13384f);
        }

        public final void onAdFailedToLoad(int i) {
            this.f13385g.onAdFailedToLoad(this.f13384f, i);
        }

        public final void onAdLeftApplication() {
            this.f13385g.onAdLeftApplication(this.f13384f);
        }

        public final void onAdLoaded() {
            this.f13385g.onAdLoaded(this.f13384f);
        }

        public final void onAdOpened() {
            this.f13385g.onAdOpened(this.f13384f);
        }

        public final void onAppEvent(String str, String str2) {
            this.f13385g.zza(this.f13384f, str, str2);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$e */
    static final class C7109e extends AdListener implements zzxr {
        @VisibleForTesting

        /* renamed from: f */
        private final AbstractAdViewAdapter f13386f;
        @VisibleForTesting

        /* renamed from: g */
        private final MediationInterstitialListener f13387g;

        public C7109e(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
            this.f13386f = abstractAdViewAdapter;
            this.f13387g = mediationInterstitialListener;
        }

        public final void onAdClicked() {
            this.f13387g.onAdClicked(this.f13386f);
        }

        public final void onAdClosed() {
            this.f13387g.onAdClosed(this.f13386f);
        }

        public final void onAdFailedToLoad(int i) {
            this.f13387g.onAdFailedToLoad(this.f13386f, i);
        }

        public final void onAdLeftApplication() {
            this.f13387g.onAdLeftApplication(this.f13386f);
        }

        public final void onAdLoaded() {
            this.f13387g.onAdLoaded(this.f13386f);
        }

        public final void onAdOpened() {
            this.f13387g.onAdOpened(this.f13386f);
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.AbstractAdViewAdapter$f */
    static final class C7110f extends AdListener implements NativeAppInstallAd.OnAppInstallAdLoadedListener, NativeContentAd.OnContentAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener, UnifiedNativeAd.OnUnifiedNativeAdLoadedListener {
        @VisibleForTesting

        /* renamed from: f */
        private final AbstractAdViewAdapter f13388f;
        @VisibleForTesting

        /* renamed from: g */
        private final MediationNativeListener f13389g;

        public C7110f(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
            this.f13388f = abstractAdViewAdapter;
            this.f13389g = mediationNativeListener;
        }

        public final void onAdClicked() {
            this.f13389g.onAdClicked(this.f13388f);
        }

        public final void onAdClosed() {
            this.f13389g.onAdClosed(this.f13388f);
        }

        public final void onAdFailedToLoad(int i) {
            this.f13389g.onAdFailedToLoad(this.f13388f, i);
        }

        public final void onAdImpression() {
            this.f13389g.onAdImpression(this.f13388f);
        }

        public final void onAdLeftApplication() {
            this.f13389g.onAdLeftApplication(this.f13388f);
        }

        public final void onAdLoaded() {
        }

        public final void onAdOpened() {
            this.f13389g.onAdOpened(this.f13388f);
        }

        public final void onAppInstallAdLoaded(NativeAppInstallAd nativeAppInstallAd) {
            this.f13389g.onAdLoaded((MediationNativeAdapter) this.f13388f, (NativeAdMapper) new C7105a(nativeAppInstallAd));
        }

        public final void onContentAdLoaded(NativeContentAd nativeContentAd) {
            this.f13389g.onAdLoaded((MediationNativeAdapter) this.f13388f, (NativeAdMapper) new C7106b(nativeContentAd));
        }

        public final void onCustomClick(NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
            this.f13389g.zza(this.f13388f, nativeCustomTemplateAd, str);
        }

        public final void onCustomTemplateAdLoaded(NativeCustomTemplateAd nativeCustomTemplateAd) {
            this.f13389g.zza(this.f13388f, nativeCustomTemplateAd);
        }

        public final void onUnifiedNativeAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            this.f13389g.onAdLoaded((MediationNativeAdapter) this.f13388f, (UnifiedNativeAdMapper) new C7107c(unifiedNativeAd));
        }
    }

    private final AdRequest zza(Context context, MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Date birthday = mediationAdRequest.getBirthday();
        if (birthday != null) {
            builder.setBirthday(birthday);
        }
        int gender = mediationAdRequest.getGender();
        if (gender != 0) {
            builder.setGender(gender);
        }
        Set<String> keywords = mediationAdRequest.getKeywords();
        if (keywords != null) {
            for (String addKeyword : keywords) {
                builder.addKeyword(addKeyword);
            }
        }
        Location location = mediationAdRequest.getLocation();
        if (location != null) {
            builder.setLocation(location);
        }
        if (mediationAdRequest.isTesting()) {
            zzyt.m25666a();
            builder.addTestDevice(zzazt.m20467a(context));
        }
        if (mediationAdRequest.taggedForChildDirectedTreatment() != -1) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            builder.tagForChildDirectedTreatment(z);
        }
        builder.setIsDesignedForFamilies(mediationAdRequest.isDesignedForFamilies());
        builder.addNetworkExtrasBundle(AdMobAdapter.class, zza(bundle, bundle2));
        return builder.build();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzmd;
    }

    public Bundle getInterstitialAdapterInfo() {
        return new MediationAdapter.zza().zzdj(1).zzacc();
    }

    public zzaar getVideoController() {
        VideoController videoController;
        AdView adView = this.zzmd;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.zzdh();
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.zzmg = context.getApplicationContext();
        this.zzmi = mediationRewardedVideoAdListener;
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    public boolean isInitialized() {
        return this.zzmi != null;
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        Context context = this.zzmg;
        if (context == null || this.zzmi == null) {
            zzbad.m20519b("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzmh = interstitialAd;
        interstitialAd.zzc(true);
        this.zzmh.setAdUnitId(getAdUnitId(bundle));
        this.zzmh.setRewardedVideoAdListener(this.zzmj);
        this.zzmh.setAdMetadataListener(new C7123g(this));
        this.zzmh.loadAd(zza(this.zzmg, mediationAdRequest, bundle2, bundle));
    }

    public void onDestroy() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.destroy();
            this.zzmd = null;
        }
        if (this.zzme != null) {
            this.zzme = null;
        }
        if (this.zzmf != null) {
            this.zzmf = null;
        }
        if (this.zzmh != null) {
            this.zzmh = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd = this.zzme;
        if (interstitialAd != null) {
            interstitialAd.setImmersiveMode(z);
        }
        InterstitialAd interstitialAd2 = this.zzmh;
        if (interstitialAd2 != null) {
            interstitialAd2.setImmersiveMode(z);
        }
    }

    public void onPause() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.pause();
        }
    }

    public void onResume() {
        AdView adView = this.zzmd;
        if (adView != null) {
            adView.resume();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmd = adView;
        adView.setAdSize(new AdSize(adSize.getWidth(), adSize.getHeight()));
        this.zzmd.setAdUnitId(getAdUnitId(bundle));
        this.zzmd.setAdListener(new C7108d(this, mediationBannerListener));
        this.zzmd.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        InterstitialAd interstitialAd = new InterstitialAd(context);
        this.zzme = interstitialAd;
        interstitialAd.setAdUnitId(getAdUnitId(bundle));
        this.zzme.setAdListener(new C7109e(this, mediationInterstitialListener));
        this.zzme.loadAd(zza(context, mediationAdRequest, bundle2, bundle));
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        C7110f fVar = new C7110f(this, mediationNativeListener);
        AdLoader.Builder withAdListener = new AdLoader.Builder(context, bundle.getString(AD_UNIT_ID_PARAMETER)).withAdListener(fVar);
        NativeAdOptions nativeAdOptions = nativeMediationAdRequest.getNativeAdOptions();
        if (nativeAdOptions != null) {
            withAdListener.withNativeAdOptions(nativeAdOptions);
        }
        if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            withAdListener.forUnifiedNativeAd(fVar);
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested()) {
            withAdListener.forAppInstallAd(fVar);
        }
        if (nativeMediationAdRequest.isContentAdRequested()) {
            withAdListener.forContentAd(fVar);
        }
        if (nativeMediationAdRequest.zzsu()) {
            for (String next : nativeMediationAdRequest.zzsv().keySet()) {
                withAdListener.forCustomTemplateAd(next, fVar, nativeMediationAdRequest.zzsv().get(next).booleanValue() ? fVar : null);
            }
        }
        AdLoader build = withAdListener.build();
        this.zzmf = build;
        build.loadAd(zza(context, nativeMediationAdRequest, bundle2, bundle));
    }

    public void showInterstitial() {
        this.zzme.show();
    }

    public void showVideo() {
        this.zzmh.show();
    }

    /* access modifiers changed from: protected */
    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
