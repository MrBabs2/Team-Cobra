package p015cm.aptoide.p016pt.ads;

import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;
import p015cm.aptoide.p016pt.dataprovider.model.MinimalAdInterface;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;

/* renamed from: cm.aptoide.pt.ads.MinimalAdMapper */
public class MinimalAdMapper {
    public MinimalAd map(GetAdsResponse.C2176Ad ad) {
        String str;
        int i;
        String str2;
        String str3;
        double d;
        double d2;
        boolean z;
        GetAdsResponse.Partner partner = ad.getPartner();
        if (partner != null) {
            int id = partner.getInfo().getId();
            str = partner.getData().getClickUrl();
            i = id;
        } else {
            str = null;
            i = 0;
        }
        GetAdsResponse.Info.Payout payout = ad.getInfo().getPayout();
        if (payout != null) {
            double appc = payout.getAppc();
            double amount = payout.getFiat().getAmount();
            str3 = payout.getFiat().getCurrency();
            str2 = payout.getFiat().getSymbol();
            d2 = appc;
            d = amount;
            z = true;
        } else {
            str3 = "";
            str2 = str3;
            d2 = -1.0d;
            d = -1.0d;
            z = false;
        }
        return new MinimalAd(ad.getData().getPackageName(), (long) i, str, ad.getInfo().getCpcUrl(), ad.getInfo().getCpdUrl(), ad.getData().getId(), ad.getInfo().getAdId(), ad.getInfo().getCpiUrl(), ad.getData().getName(), ad.getData().getIcon(), ad.getData().getDescription(), ad.getData().getDownloads(), ad.getData().getStars(), ad.getData().getModified().getTime(), z, d2, d, str3, str2);
    }

    public RoomStoredMinimalAd map(SearchAdResult searchAdResult, String str) {
        return new RoomStoredMinimalAd(searchAdResult.getPackageName(), str, searchAdResult.getCpcUrl(), searchAdResult.getClickPerDownloadUrl(), searchAdResult.getClickPerInstallUrl(), Long.valueOf(searchAdResult.getAdId()));
    }

    public MinimalAdInterface map(final RoomStoredMinimalAd roomStoredMinimalAd) {
        return new MinimalAdInterface() {
            public String cpdUrl;

            public String getCpcUrl() {
                return roomStoredMinimalAd.getCpcUrl();
            }

            public String getCpdUrl() {
                String str = this.cpdUrl;
                return str == null ? roomStoredMinimalAd.getCpdUrl() : str;
            }

            public String getCpiUrl() {
                return roomStoredMinimalAd.getCpiUrl();
            }

            public void setCpdUrl(String str) {
                this.cpdUrl = str;
            }
        };
    }

    public MinimalAdInterface map(final SearchAdResult searchAdResult) {
        return new MinimalAdInterface() {
            public String cpdUrl;

            public String getCpcUrl() {
                return searchAdResult.getCpcUrl();
            }

            public String getCpdUrl() {
                String str = this.cpdUrl;
                return str == null ? searchAdResult.getClickPerDownloadUrl() : str;
            }

            public String getCpiUrl() {
                return searchAdResult.getClickPerInstallUrl();
            }

            public void setCpdUrl(String str) {
                this.cpdUrl = str;
            }
        };
    }
}
