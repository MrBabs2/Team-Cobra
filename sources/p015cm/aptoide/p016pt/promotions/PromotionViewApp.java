package p015cm.aptoide.p016pt.promotions;

import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

/* renamed from: cm.aptoide.pt.promotions.PromotionViewApp */
public class PromotionViewApp {
    private final String alternativePath;
    private final String appIcon;
    private final long appId;
    private final float appcValue;
    private final String description;
    private DownloadModel downloadModel;
    private final String downloadPath;
    private String fiatSymbol;
    private double fiatValue;
    private final boolean hasAppc;
    private boolean isClaimed;
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

    public PromotionViewApp(DownloadModel downloadModel2, String str, String str2, long j, String str3, String str4, String str5, boolean z, String str6, long j2, float f, int i, String str7, int i2, String str8, Obb obb2, float f2, String str9, boolean z2, List<Split> list, List<String> list2, String str10, String str11, double d, String str12) {
        this.downloadModel = downloadModel2;
        this.name = str;
        this.packageName = str2;
        this.appId = j;
        this.downloadPath = str3;
        this.alternativePath = str4;
        this.appIcon = str5;
        this.isClaimed = z;
        this.description = str6;
        this.size = j2;
        this.rating = f;
        this.numberOfDownloads = i;
        this.md5 = str7;
        this.versionCode = i2;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PromotionViewApp.class != obj.getClass()) {
            return false;
        }
        String str = this.md5;
        String str2 = ((PromotionViewApp) obj).md5;
        return str == null ? str2 == null : str.equals(str2);
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

    public DownloadModel getDownloadModel() {
        return this.downloadModel;
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

    public boolean hasSplits() {
        List<Split> list = this.splits;
        return list != null && !list.isEmpty();
    }

    public int hashCode() {
        DownloadModel downloadModel2 = this.downloadModel;
        int i = 0;
        int hashCode = (downloadModel2 != null ? downloadModel2.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.packageName;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        long j = this.appId;
        int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str3 = this.downloadPath;
        int hashCode4 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.alternativePath;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.appIcon;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.isClaimed ? 1 : 0)) * 31;
        String str6 = this.description;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        long j2 = this.size;
        int i3 = (((hashCode6 + hashCode7) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        float f = this.rating;
        int floatToIntBits = (((i3 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.numberOfDownloads) * 31;
        String str7 = this.md5;
        int hashCode8 = (((floatToIntBits + (str7 != null ? str7.hashCode() : 0)) * 31) + this.versionCode) * 31;
        String str8 = this.versionName;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Obb obb2 = this.obb;
        if (obb2 != null) {
            i = obb2.hashCode();
        }
        return hashCode9 + i;
    }

    public boolean isClaimed() {
        return this.isClaimed;
    }

    public void setClaimed() {
        this.isClaimed = true;
    }

    public void setDownloadModel(DownloadModel downloadModel2) {
        this.downloadModel = downloadModel2;
    }
}
