package p015cm.aptoide.p016pt.search.model;

import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.ads.data.Payout;

/* renamed from: cm.aptoide.pt.search.model.SearchAdResult */
public class SearchAdResult {
    long adId;
    long appId;
    String appName;
    String clickPerDownloadUrl;
    String clickPerInstallUrl;
    String clickUrl;
    String cpcUrl;
    String icon;
    boolean isAppc;
    long modifiedDate;
    long networkId;
    String packageName;
    Payout payout;
    float starRating;
    long totalDownloads;

    public SearchAdResult() {
    }

    public long getAdId() {
        return this.adId;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getClickPerDownloadUrl() {
        return this.clickPerDownloadUrl;
    }

    public String getClickPerInstallUrl() {
        return this.clickPerInstallUrl;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public String getCpcUrl() {
        return this.cpcUrl;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getModifiedDate() {
        return this.modifiedDate;
    }

    public long getNetworkId() {
        return this.networkId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Payout getPayout() {
        return this.payout;
    }

    public float getStarRating() {
        return this.starRating;
    }

    public long getTotalDownloads() {
        return this.totalDownloads;
    }

    public boolean isAppc() {
        return this.isAppc;
    }

    public SearchAdResult(long j, String str, long j2, float f, long j3, String str2, String str3, String str4, String str5, String str6, String str7, long j4, long j5, boolean z, Payout payout2) {
        this.adId = j;
        this.icon = str;
        this.totalDownloads = j2;
        this.starRating = f;
        this.modifiedDate = j3;
        this.packageName = str2;
        this.cpcUrl = str3;
        this.clickPerDownloadUrl = str4;
        this.clickPerInstallUrl = str5;
        this.clickUrl = str6;
        this.appName = str7;
        this.appId = j4;
        this.networkId = j5;
        this.isAppc = z;
        this.payout = payout2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchAdResult(p015cm.aptoide.p016pt.ads.MinimalAd r29) {
        /*
            r28 = this;
            r0 = r28
            long r1 = r29.getAdId()
            java.lang.String r3 = r29.getIconPath()
            int r4 = r29.getDownloads()
            long r4 = (long) r4
            int r6 = r29.getStars()
            float r6 = (float) r6
            long r7 = r29.getModified()
            java.lang.String r9 = r29.getPackageName()
            java.lang.String r10 = r29.getCpcUrl()
            java.lang.String r11 = r29.getCpdUrl()
            java.lang.String r12 = r29.getCpiUrl()
            java.lang.String r13 = r29.getClickUrl()
            java.lang.String r14 = r29.getName()
            long r15 = r29.getAppId()
            long r17 = r29.getNetworkId()
            boolean r19 = r29.isHasAppc()
            cm.aptoide.pt.ads.data.Payout r21 = new cm.aptoide.pt.ads.data.Payout
            r20 = r21
            double r22 = r29.getAppcAmount()
            double r24 = r29.getCurrencyAmount()
            java.lang.String r26 = r29.getCurrency()
            java.lang.String r27 = r29.getCurrencySymbol()
            r21.<init>(r22, r24, r26, r27)
            r0.<init>(r1, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.model.SearchAdResult.<init>(cm.aptoide.pt.ads.MinimalAd):void");
    }

    public SearchAdResult(AptoideNativeAd aptoideNativeAd) {
        this(aptoideNativeAd.getAdId().longValue(), aptoideNativeAd.getIconUrl(), (long) aptoideNativeAd.getDownloads(), (float) aptoideNativeAd.getStars().intValue(), aptoideNativeAd.getModified().longValue(), aptoideNativeAd.getPackageName(), aptoideNativeAd.getCpcUrl(), aptoideNativeAd.getCpdUrl(), aptoideNativeAd.getCpiUrl(), aptoideNativeAd.getClickUrl(), aptoideNativeAd.getAdTitle(), aptoideNativeAd.getAppId(), aptoideNativeAd.getNetworkId().longValue(), aptoideNativeAd.hasAppcPayout(), aptoideNativeAd.getAppcPayout());
    }
}
