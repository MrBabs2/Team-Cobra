package p015cm.aptoide.p016pt.home.bundles.ads;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdBundle */
public class AdBundle implements HomeBundle {
    private final List<AdClick> ads;
    private final Event event;
    private final String tag;
    private final String title;

    public AdBundle(String str, AdsTagWrapper adsTagWrapper, Event event2, String str2) {
        this.title = str;
        if (adsTagWrapper.getAds() != null) {
            this.ads = new ArrayList();
            for (GetAdsResponse.C2176Ad adClick : adsTagWrapper.getAds()) {
                this.ads.add(new AdClick(adClick, str2));
            }
        } else {
            this.ads = null;
        }
        this.event = event2;
        this.tag = str2;
    }

    public List<AdClick> getAds() {
        return this.ads;
    }

    public List<?> getContent() {
        return this.ads;
    }

    public Event getEvent() {
        return this.event;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTitle() {
        return this.title;
    }

    public HomeBundle.BundleType getType() {
        return HomeBundle.BundleType.ADS;
    }
}
