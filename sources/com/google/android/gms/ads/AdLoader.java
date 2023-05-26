package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzafi;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzafx;
import com.google.android.gms.internal.ads.zzagm;
import com.google.android.gms.internal.ads.zzagn;
import com.google.android.gms.internal.ads.zzago;
import com.google.android.gms.internal.ads.zzagp;
import com.google.android.gms.internal.ads.zzagq;
import com.google.android.gms.internal.ads.zzags;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzamp;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzxv;
import com.google.android.gms.internal.ads.zzyc;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzyt;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzzc;
import com.google.android.gms.internal.ads.zzzf;
import com.google.android.gms.internal.ads.zzzy;

public class AdLoader {
    private final zzyc zzaaj;
    private final zzzc zzaak;
    private final Context zzlj;

    AdLoader(Context context, zzzc zzzc) {
        this(context, zzzc, zzyc.f23015a);
    }

    private final void zza(zzaaz zzaaz) {
        try {
            this.zzaak.mo25847a(zzyc.m25642a(this.zzlj, zzaaz));
        } catch (RemoteException e) {
            zzbad.m20520b("Failed to load ad.", e);
        }
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        try {
            return this.zzaak.mo25850v();
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to get the mediation adapter class name.", e);
            return null;
        }
    }

    public boolean isLoading() {
        try {
            return this.zzaak.mo25851y();
        } catch (RemoteException e) {
            zzbad.m20522c("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zza(adRequest.zzde());
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzaak.mo25848a(zzyc.m25642a(this.zzlj, adRequest.zzde()), i);
        } catch (RemoteException e) {
            zzbad.m20520b("Failed to load ads.", e);
        }
    }

    public void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzde());
    }

    private AdLoader(Context context, zzzc zzzc, zzyc zzyc) {
        this.zzlj = context;
        this.zzaak = zzzc;
        this.zzaaj = zzyc;
    }

    public static class Builder {
        private final zzzf zzaal;
        private final Context zzlj;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(Context context, String str) {
            this(context, zzyt.m25667b().mo29919a(context, str, (zzamp) new zzamo()));
            Preconditions.m16038a(context, (Object) "context cannot be null");
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zzlj, this.zzaal.mo27054T());
            } catch (RemoteException e) {
                zzbad.m20520b("Failed to build AdLoader.", e);
                return null;
            }
        }

        @Deprecated
        public Builder forAppInstallAd(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
            try {
                this.zzaal.mo27057a((zzafi) new zzagm(onAppInstallAdLoadedListener));
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to add app install ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forContentAd(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
            try {
                this.zzaal.mo27058a((zzafl) new zzagn(onContentAdLoadedListener));
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to add content ad listener", e);
            }
            return this;
        }

        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzago zzago;
            try {
                zzzf zzzf = this.zzaal;
                zzagp zzagp = new zzagp(onCustomTemplateAdLoadedListener);
                if (onCustomClickListener == null) {
                    zzago = null;
                } else {
                    zzago = new zzago(onCustomClickListener);
                }
                zzzf.mo27063a(str, zzagp, zzago);
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forPublisherAdView(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzaal.mo27059a(new zzagq(onPublisherAdViewLoadedListener), new zzyd(this.zzlj, adSizeArr));
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to add publisher banner ad listener", e);
            }
            return this;
        }

        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzaal.mo27060a((zzafx) new zzags(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzaal.mo27064b((zzyz) new zzxv(adListener));
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withCorrelator(Correlator correlator) {
            Preconditions.m16037a(correlator);
            try {
                this.zzaal.mo27065b((zzzy) correlator.zzaar);
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to set correlator.", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzaal.mo27056a(new zzady(nativeAdOptions));
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withPublisherAdViewOptions(PublisherAdViewOptions publisherAdViewOptions) {
            try {
                this.zzaal.mo27055a(publisherAdViewOptions);
            } catch (RemoteException e) {
                zzbad.m20522c("Failed to specify DFP banner ad options", e);
            }
            return this;
        }

        private Builder(Context context, zzzf zzzf) {
            this.zzlj = context;
            this.zzaal = zzzf;
        }
    }
}
