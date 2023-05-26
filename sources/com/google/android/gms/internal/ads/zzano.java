package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

@zzard
public final class zzano implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final zzamv f18220a;

    /* renamed from: b */
    private NativeAdMapper f18221b;

    /* renamed from: c */
    private UnifiedNativeAdMapper f18222c;

    /* renamed from: d */
    private NativeCustomTemplateAd f18223d;

    public zzano(zzamv zzamv) {
        this.f18220a = zzamv;
    }

    /* renamed from: a */
    private static void m19650a(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper, NativeAdMapper nativeAdMapper) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.zza(new zzanj());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zza(videoController);
            }
            if (nativeAdMapper != null && nativeAdMapper.hasVideoContent()) {
                nativeAdMapper.zza(videoController);
            }
        }
    }

    /* renamed from: b */
    public final UnifiedNativeAdMapper mo27518b() {
        return this.f18222c;
    }

    /* renamed from: c */
    public final NativeCustomTemplateAd mo27519c() {
        return this.f18223d;
    }

    public final void onAdClicked(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClicked.");
        try {
            this.f18220a.onAdClicked();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClosed.");
        try {
            this.f18220a.onAdClosed();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, int i) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error. ");
        sb.append(i);
        zzbad.m20516a(sb.toString());
        try {
            this.f18220a.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdImpression(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f18221b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f18222c;
        if (this.f18223d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbad.m20524d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzbad.m20516a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideImpressionRecording()) {
                zzbad.m20516a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzbad.m20516a("Adapter called onAdImpression.");
        try {
            this.f18220a.onAdImpression();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLeftApplication.");
        try {
            this.f18220a.onAdLeftApplication();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLoaded.");
        try {
            this.f18220a.onAdLoaded();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdOpened.");
        try {
            this.f18220a.onAdOpened();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoEnd(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onVideoEnd.");
        try {
            this.f18220a.mo27450x();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAppEvent.");
        try {
            this.f18220a.onAppEvent(str, str2);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClicked(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClicked.");
        try {
            this.f18220a.onAdClicked();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClosed.");
        try {
            this.f18220a.onAdClosed();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzbad.m20516a(sb.toString());
        try {
            this.f18220a.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLeftApplication.");
        try {
            this.f18220a.onAdLeftApplication();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLoaded.");
        try {
            this.f18220a.onAdLoaded();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdOpened.");
        try {
            this.f18220a.onAdOpened();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        String valueOf = String.valueOf(nativeCustomTemplateAd.getCustomTemplateId());
        zzbad.m20516a(valueOf.length() != 0 ? "Adapter called onAdLoaded with template id ".concat(valueOf) : new String("Adapter called onAdLoaded with template id "));
        this.f18223d = nativeCustomTemplateAd;
        try {
            this.f18220a.onAdLoaded();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final NativeAdMapper mo27517a() {
        return this.f18221b;
    }

    public final void onAdClicked(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        NativeAdMapper nativeAdMapper = this.f18221b;
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f18222c;
        if (this.f18223d == null) {
            if (nativeAdMapper == null && unifiedNativeAdMapper == null) {
                zzbad.m20524d("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (unifiedNativeAdMapper != null && !unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzbad.m20516a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            } else if (nativeAdMapper != null && !nativeAdMapper.getOverrideClickHandling()) {
                zzbad.m20516a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzbad.m20516a("Adapter called onAdClicked.");
        try {
            this.f18220a.onAdClicked();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdClosed(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdClosed.");
        try {
            this.f18220a.onAdClosed();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, int i) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        zzbad.m20516a(sb.toString());
        try {
            this.f18220a.onAdFailedToLoad(i);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLeftApplication(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLeftApplication.");
        try {
            this.f18220a.onAdLeftApplication();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, NativeAdMapper nativeAdMapper) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLoaded.");
        this.f18221b = nativeAdMapper;
        this.f18222c = null;
        m19650a(mediationNativeAdapter, (UnifiedNativeAdMapper) null, nativeAdMapper);
        try {
            this.f18220a.onAdLoaded();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdOpened.");
        try {
            this.f18220a.onAdOpened();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void zza(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzafh) {
            try {
                this.f18220a.mo27433a(((zzafh) nativeCustomTemplateAd).mo27260a(), str);
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        } else {
            zzbad.m20523d("Unexpected native custom template ad type.");
        }
    }

    public final void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.m16042a("#008 Must be called on the main UI thread.");
        zzbad.m20516a("Adapter called onAdLoaded.");
        this.f18222c = unifiedNativeAdMapper;
        this.f18221b = null;
        m19650a(mediationNativeAdapter, unifiedNativeAdMapper, (NativeAdMapper) null);
        try {
            this.f18220a.onAdLoaded();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
