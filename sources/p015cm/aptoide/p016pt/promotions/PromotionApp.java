package p015cm.aptoide.p016pt.promotions;

import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

/* renamed from: cm.aptoide.pt.promotions.PromotionApp */
public class PromotionApp {
    private final String alternativePath;
    private final String appIcon;
    private final long appId;
    private final float appcValue;
    private final String description;
    private final String downloadPath;
    private final String fiatSymbol;
    private final double fiatValue;
    private final boolean hasAppc;
    private final boolean isClaimed;
    private final String md5;
    private final String name;
    private final int numberOfDownloads;
    private final Obb obb;
    private final String packageName;
    private final String rank;
    private final float rating;
    private final List<String> requiredSplits;
    private final String signature;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final int versionCode;
    private final String versionName;

    public PromotionApp(String str, String str2, long j, String str3, String str4, String str5, String str6, long j2, float f, int i, String str7, int i2, boolean z, String str8, Obb obb2, float f2, String str9, boolean z2, List<Split> list, List<String> list2, String str10, String str11, double d, String str12) {
        this.name = str;
        this.packageName = str2;
        this.appId = j;
        this.downloadPath = str3;
        this.alternativePath = str4;
        this.appIcon = str5;
        this.description = str6;
        this.size = j2;
        this.rating = f;
        this.numberOfDownloads = i;
        this.md5 = str7;
        this.versionCode = i2;
        this.isClaimed = z;
        this.versionName = str8;
        this.obb = obb2;
        this.appcValue = f2;
        this.signature = str9;
        this.hasAppc = z2;
        this.splits = list;
        this.requiredSplits = list2;
        this.rank = str10;
        this.storeName = str11;
        this.fiatValue = d;
        this.fiatSymbol = str12;
    }

    public String getAlternativePath() {
        return this.alternativePath;
    }

    public String getAppIcon() {
        return this.appIcon;
    }

    public long getAppId() {
        return this.appId;
    }

    public float getAppcValue() {
        return this.appcValue;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDownloadPath() {
        return this.downloadPath;
    }

    public String getFiatSymbol() {
        return this.fiatSymbol;
    }

    public double getFiatValue() {
        return this.fiatValue;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfDownloads() {
        return this.numberOfDownloads;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getRank() {
        return this.rank;
    }

    public float getRating() {
        return this.rating;
    }

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public String getSignature() {
        return this.signature;
    }

    public long getSize() {
        return this.size;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    public boolean isClaimed() {
        return this.isClaimed;
    }
}
