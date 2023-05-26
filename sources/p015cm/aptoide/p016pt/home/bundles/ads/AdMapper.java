package p015cm.aptoide.p016pt.home.bundles.ads;

import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.ads.data.Payout;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdMapper */
public class AdMapper {
    public SearchAdNavigationResult mapAdToSearchAd(AdClick adClick) {
        if (adClick == null) {
            return new SearchAdNavigationResult("", new SearchAdResult());
        }
        AptoideNativeAd aptoideNativeAd = (AptoideNativeAd) adClick.getAd();
        String tag = adClick.getTag();
        SearchAdResult searchAdResult = r3;
        SearchAdResult searchAdResult2 = new SearchAdResult(aptoideNativeAd.getAdId().longValue(), aptoideNativeAd.getIconUrl(), (long) aptoideNativeAd.getDownloads(), (float) aptoideNativeAd.getStars().intValue(), aptoideNativeAd.getModified().longValue(), aptoideNativeAd.getPackageName(), aptoideNativeAd.getCpcUrl(), aptoideNativeAd.getCpdUrl(), aptoideNativeAd.getCpiUrl(), aptoideNativeAd.getClickUrl(), aptoideNativeAd.getAdTitle(), aptoideNativeAd.getAppId(), aptoideNativeAd.getNetworkId().longValue(), false, (Payout) null);
        return new SearchAdNavigationResult(tag, searchAdResult);
    }
}
