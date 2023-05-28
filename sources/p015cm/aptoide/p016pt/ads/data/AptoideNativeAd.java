package p015cm.aptoide.p016pt.ads.data;

import android.view.View;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.ads.data.AptoideNativeAd */
public class AptoideNativeAd extends Application implements ApplicationAd {
    private Long adId;
    private String clickUrl;
    private String cpcUrl;
    private String cpdUrl;
    private String cpiUrl;
    private String description;
    private Long modified;
    private Long networkId;
    private Payout payout;
    private Integer stars;

    public AptoideNativeAd(MinimalAd minimalAd) {
        super(minimalAd.getName(), minimalAd.getIconPath(), 0.0f, minimalAd.getDownloads(), minimalAd.getPackageName(), minimalAd.getAppId(), "", minimalAd.isHasAppc());
        this.networkId = Long.valueOf(minimalAd.getNetworkId());
        this.clickUrl = minimalAd.getClickUrl();
        this.cpcUrl = minimalAd.getCpcUrl();
        this.cpdUrl = minimalAd.getCpdUrl();
        this.adId = Long.valueOf(minimalAd.getAdId());
        this.cpiUrl = minimalAd.getCpiUrl();
        this.description = minimalAd.getDescription();
        this.stars = Integer.valueOf(minimalAd.getStars());
        this.modified = Long.valueOf(minimalAd.getModified());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptoideNativeAd)) {
            return false;
        }
        AptoideNativeAd aptoideNativeAd = (AptoideNativeAd) obj;
        if (!aptoideNativeAd.modified.equals(this.modified) || !aptoideNativeAd.stars.equals(this.stars) || !Integer.valueOf(aptoideNativeAd.getDownloads()).equals(Integer.valueOf(getDownloads())) || !aptoideNativeAd.description.equals(this.description) || !aptoideNativeAd.getIcon().equals(getIcon()) || !aptoideNativeAd.getName().equals(getName()) || !aptoideNativeAd.cpiUrl.equals(this.cpiUrl) || !aptoideNativeAd.adId.equals(this.adId) || !aptoideNativeAd.cpdUrl.equals(this.cpdUrl) || !aptoideNativeAd.cpcUrl.equals(this.cpcUrl) || !Long.valueOf(aptoideNativeAd.getAppId()).equals(Long.valueOf(getAppId())) || !aptoideNativeAd.clickUrl.equals(this.clickUrl) || !aptoideNativeAd.networkId.equals(this.networkId) || !aptoideNativeAd.getPackageName().equals(getPackageName())) {
            return false;
        }
        return true;
    }

    public Long getAdId() {
        return this.adId;
    }

    public String getAdTitle() {
        return super.getName();
    }

    public Payout getAppcPayout() {
        return this.payout;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCpcUrl() {
        return this.cpcUrl;
    }

    public String getCpdUrl() {
        return this.cpdUrl;
    }

    public String getCpiUrl() {
        return this.cpiUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public String getIconUrl() {
        return super.getIcon();
    }

    public Long getModified() {
        return this.modified;
    }

    public ApplicationAd.Network getNetwork() {
        return ApplicationAd.Network.SERVER;
    }

    public Long getNetworkId() {
        return this.networkId;
    }

    public String getPackageName() {
        return super.getPackageName();
    }

    public Integer getStars() {
        return this.stars;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r5.payout;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasAppcPayout() {
        /*
            r5 = this;
            boolean r0 = r5.hasAppcBilling()
            if (r0 == 0) goto L_0x0016
            cm.aptoide.pt.ads.data.Payout r0 = r5.payout
            if (r0 == 0) goto L_0x0016
            double r0 = r0.getFiatAmount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.ads.data.AptoideNativeAd.hasAppcPayout():boolean");
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.cpdUrl.hashCode() * 31) + this.description.hashCode()) * 31) + getPackageName().hashCode()) * 31) + this.clickUrl.hashCode()) * 31) + this.cpcUrl.hashCode()) * 31) + this.cpiUrl.hashCode()) * 31) + getName().hashCode()) * 31) + getIcon().hashCode()) * 31) + Integer.valueOf(getDownloads()).hashCode()) * 31) + this.stars.hashCode()) * 31) + ((int) (this.networkId.longValue() ^ (this.networkId.longValue() >>> 32)))) * 31) + ((int) (getAppId() ^ (getAppId() >>> 32)))) * 31) + ((int) (this.adId.longValue() ^ (this.adId.longValue() >>> 32)))) * 31) + ((int) (this.modified.longValue() ^ (this.modified.longValue() >>> 32)));
    }

    public void registerClickableView(View view) {
    }

    public void setAdView(View view) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AptoideNativeAd(GetAdsResponse.C2176Ad ad) {
        super(ad.getData().getName(), ad.getData().getIcon(), 0.0f, ad.getData().getDownloads(), ad.getData().getPackageName(), ad.getData().getId(), "", (ad.getInfo().getPayout() == null || ad.getInfo().getPayout().getFiat() == null || ad.getInfo().getPayout().getFiat().getAmount() <= 0.0d) ? false : true);
        int i = 0;
        GetAdsResponse.Partner partner = ad.getPartner();
        String str = null;
        if (partner != null) {
            i = partner.getInfo().getId();
            str = partner.getData().getClickUrl();
        }
        this.networkId = Long.valueOf((long) i);
        this.clickUrl = str;
        this.cpcUrl = ad.getInfo().getCpcUrl();
        this.cpdUrl = ad.getInfo().getCpdUrl();
        this.adId = Long.valueOf(ad.getInfo().getAdId());
        this.cpiUrl = ad.getInfo().getCpiUrl();
        this.description = ad.getData().getDescription();
        this.stars = Integer.valueOf(ad.getData().getStars());
        this.modified = Long.valueOf(ad.getData().getModified().getTime());
        GetAdsResponse.Info.Payout payout2 = ad.getInfo().getPayout();
        if (payout2 != null) {
            GetAdsResponse.Info.Fiat fiat = payout2.getFiat();
            this.payout = new Payout(payout2.getAppc(), fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol());
        }
    }
}
