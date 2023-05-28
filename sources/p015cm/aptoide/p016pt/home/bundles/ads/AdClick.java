package p015cm.aptoide.p016pt.home.bundles.ads;

import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdClick */
public class AdClick {

    /* renamed from: ad */
    private final ApplicationAd f5725ad;
    private final String tag;

    public AdClick(GetAdsResponse.C2176Ad ad, String str) {
        this.f5725ad = new AptoideNativeAd(ad);
        this.tag = str;
    }

    public ApplicationAd getAd() {
        return this.f5725ad;
    }

    public String getTag() {
        return this.tag;
    }

    public AdClick(ApplicationAd applicationAd, String str) {
        this.f5725ad = applicationAd;
        this.tag = str;
    }
}
