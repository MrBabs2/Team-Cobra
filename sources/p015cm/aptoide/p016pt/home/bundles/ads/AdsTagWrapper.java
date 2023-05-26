package p015cm.aptoide.p016pt.home.bundles.ads;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdsTagWrapper */
public class AdsTagWrapper {
    private final List<GetAdsResponse.C2176Ad> ads;
    private final String tag;

    public AdsTagWrapper(List<GetAdsResponse.C2176Ad> list, String str) {
        this.ads = list;
        this.tag = str;
    }

    public List<GetAdsResponse.C2176Ad> getAds() {
        return this.ads;
    }

    public String getTag() {
        return this.tag;
    }
}
