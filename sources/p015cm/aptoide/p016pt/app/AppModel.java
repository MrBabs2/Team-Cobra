package p015cm.aptoide.p016pt.app;

import android.os.Build;
import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.view.app.AppDeveloper;
import p015cm.aptoide.p016pt.view.app.AppFlags;
import p015cm.aptoide.p016pt.view.app.AppMedia;
import p015cm.aptoide.p016pt.view.app.AppRating;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;

/* renamed from: cm.aptoide.pt.app.AppModel */
public class AppModel {
    private static final String BDS_STORE_FLAG = "STORE_BDS";
    private final String appAdded;
    private final AppDeveloper appDeveloper;
    private final AppFlags appFlags;
    private final long appId;
    private final String appName;
    private final double appc;
    private final List<String> bdsFlags;
    private final String campaignUrl;
    private final int downloads;
    private final String editorsChoice;
    private final DetailedAppRequestResult.Error error;
    private final long fileSize;
    private final AppRating globalRating;
    private final String graphic;
    private final boolean hasAdvertising;
    private final boolean hasBilling;
    private final String icon;
    private final boolean isBeta;
    private boolean isEskills;
    private final boolean isGoodApp;
    private final boolean isLatestTrustedVersion;
    private final boolean isMature;
    private final boolean isStoreFollowed;
    private final boolean loading;
    private final Malware malware;
    private final String marketName;
    private final String md5;
    private final AppMedia media;
    private final SearchAdResult minimalAd;
    private final String modified;
    private final Obb obb;
    private final String oemId;
    private final AppViewFragment.OpenType openType;
    private final String originTag;
    private final int packageDownloads;
    private final String packageName;
    private String path;
    private final String pathAlt;
    private final AppRating rating;
    private final List<String> requiredSplits;
    private final String signature;
    private final long size;
    private final List<Split> splits;
    private final Store store;
    private final String storeTheme;
    private final List<String> tags;
    private final String uniqueName;
    private final List<String> usedFeatures;
    private final List<String> usedPermissions;
    private final int versionCode;
    private final String versionName;
    private final String webUrls;

    public AppModel(long j, String str, Store store2, String str2, boolean z, Malware malware2, AppFlags appFlags2, List<String> list, List<String> list2, List<String> list3, long j2, String str3, String str4, String str5, int i, String str6, String str7, long j3, int i2, AppRating appRating, int i3, AppRating appRating2, AppDeveloper appDeveloper2, String str8, String str9, AppMedia appMedia, String str10, String str11, Obb obb2, String str12, boolean z2, String str13, AppViewFragment.OpenType openType2, double d, SearchAdResult searchAdResult, String str14, String str15, boolean z3, String str16, boolean z4, boolean z5, List<String> list4, String str17, String str18, boolean z6, List<Split> list5, List<String> list6, String str19, boolean z7, boolean z8) {
        this.appId = j;
        this.appName = str;
        this.store = store2;
        this.storeTheme = str2;
        this.isGoodApp = z;
        this.malware = malware2;
        this.appFlags = appFlags2;
        this.tags = list;
        this.usedFeatures = list2;
        this.usedPermissions = list3;
        this.fileSize = j2;
        this.md5 = str3;
        this.path = str4;
        this.pathAlt = str5;
        this.versionCode = i;
        this.versionName = str6;
        this.packageName = str7;
        this.size = j3;
        this.downloads = i2;
        this.globalRating = appRating;
        this.packageDownloads = i3;
        this.rating = appRating2;
        this.appDeveloper = appDeveloper2;
        this.graphic = str8;
        this.icon = str9;
        this.media = appMedia;
        this.modified = str10;
        this.appAdded = str11;
        this.obb = obb2;
        this.webUrls = str12;
        this.isLatestTrustedVersion = z2;
        this.uniqueName = str13;
        this.openType = openType2;
        this.appc = d;
        this.minimalAd = searchAdResult;
        this.editorsChoice = str14;
        this.originTag = str15;
        this.isStoreFollowed = z3;
        this.marketName = str16;
        this.hasBilling = z4;
        this.hasAdvertising = z5;
        this.bdsFlags = list4;
        this.campaignUrl = str17;
        this.signature = str18;
        this.isMature = z6;
        this.splits = list5;
        this.requiredSplits = list6;
        this.isEskills = z8;
        this.loading = false;
        this.error = null;
        this.oemId = str19;
        this.isBeta = z7;
    }

    public String getAppAdded() {
        return this.appAdded;
    }

    public AppFlags getAppFlags() {
        return this.appFlags;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public double getAppc() {
        return this.appc;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public String getCampaignUrl() {
        return this.campaignUrl;
    }

    public AppDeveloper getDeveloper() {
        return this.appDeveloper;
    }

    public int getDownloads() {
        return this.downloads;
    }

    public String getEditorsChoice() {
        return this.editorsChoice;
    }

    public DetailedAppRequestResult.Error getError() {
        return this.error;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public AppRating getGlobalRating() {
        return this.globalRating;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public Malware getMalware() {
        return this.malware;
    }

    public String getMarketName() {
        return this.marketName;
    }

    public String getMd5() {
        return this.md5;
    }

    public AppMedia getMedia() {
        return this.media;
    }

    public SearchAdResult getMinimalAd() {
        return this.minimalAd;
    }

    public String getModified() {
        return this.modified;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getOemId() {
        return this.oemId;
    }

    public AppViewFragment.OpenType getOpenType() {
        return this.openType;
    }

    public String getOriginTag() {
        return this.originTag;
    }

    public int getPackageDownloads() {
        return this.packageDownloads;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathAlt() {
        return this.pathAlt;
    }

    public AppRating getRating() {
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

    public Store getStore() {
        return this.store;
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public String getUniqueName() {
        return this.uniqueName;
    }

    public List<String> getUsedFeatures() {
        return this.usedFeatures;
    }

    public List<String> getUsedPermissions() {
        return this.usedPermissions;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public String getWebUrls() {
        return this.webUrls;
    }

    public boolean hasAdvertising() {
        return this.hasAdvertising;
    }

    public boolean hasBilling() {
        return this.hasBilling;
    }

    public boolean hasDonations() {
        List<String> list = this.bdsFlags;
        return list != null && !list.isEmpty() && this.bdsFlags.contains(BDS_STORE_FLAG) && Build.VERSION.SDK_INT >= 21;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean hasSplits() {
        List<Split> list = this.splits;
        return list != null && !list.isEmpty();
    }

    public boolean isAppCoinApp() {
        return this.hasBilling || this.hasAdvertising;
    }

    public boolean isBeta() {
        return this.isBeta;
    }

    public boolean isEskills() {
        return this.isEskills;
    }

    public boolean isFromEditorsChoice() {
        return !this.editorsChoice.isEmpty();
    }

    public boolean isGoodApp() {
        return this.isGoodApp;
    }

    public boolean isLatestTrustedVersion() {
        return this.isLatestTrustedVersion;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public boolean isMature() {
        return this.isMature;
    }

    public boolean isStoreFollowed() {
        return this.isStoreFollowed;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public AppModel(boolean z) {
        this.loading = z;
        this.appId = -1;
        this.appName = "";
        this.store = null;
        this.storeTheme = "";
        this.isGoodApp = false;
        this.malware = null;
        this.appFlags = null;
        this.tags = null;
        this.usedFeatures = null;
        this.usedPermissions = null;
        this.fileSize = -1;
        this.md5 = "";
        this.path = "";
        this.pathAlt = "";
        this.versionCode = -1;
        this.versionName = "";
        this.packageName = "";
        this.size = -1;
        this.downloads = -1;
        this.globalRating = null;
        this.packageDownloads = -1;
        this.rating = null;
        this.appDeveloper = null;
        this.graphic = null;
        this.icon = null;
        this.media = null;
        this.modified = null;
        this.appAdded = null;
        this.obb = null;
        this.webUrls = null;
        this.isLatestTrustedVersion = false;
        this.uniqueName = "";
        this.openType = null;
        this.appc = -1.0d;
        this.minimalAd = null;
        this.editorsChoice = "";
        this.originTag = "";
        this.marketName = "";
        this.isStoreFollowed = false;
        this.signature = "";
        this.error = null;
        this.hasBilling = false;
        this.hasAdvertising = false;
        this.isMature = false;
        this.bdsFlags = null;
        this.campaignUrl = "";
        this.splits = null;
        this.requiredSplits = null;
        this.oemId = null;
        this.isBeta = false;
    }

    public AppModel(DetailedAppRequestResult.Error error2) {
        this.error = error2;
        this.appId = -1;
        this.appName = "";
        Store store2 = new Store();
        this.store = store2;
        store2.setId(-1);
        this.storeTheme = "";
        this.isGoodApp = false;
        this.malware = null;
        this.appFlags = null;
        this.tags = null;
        this.usedFeatures = null;
        this.usedPermissions = null;
        this.fileSize = -1;
        this.md5 = "";
        this.path = "";
        this.pathAlt = "";
        this.versionCode = -1;
        this.versionName = "";
        this.packageName = "";
        this.size = -1;
        this.downloads = -1;
        this.globalRating = null;
        this.packageDownloads = -1;
        this.rating = null;
        this.appDeveloper = null;
        this.graphic = null;
        this.icon = null;
        this.media = null;
        this.modified = null;
        this.appAdded = null;
        this.obb = null;
        this.webUrls = null;
        this.isLatestTrustedVersion = false;
        this.uniqueName = "";
        this.openType = null;
        this.appc = -1.0d;
        this.minimalAd = null;
        this.editorsChoice = "";
        this.originTag = "";
        this.marketName = "";
        this.isStoreFollowed = false;
        this.signature = "";
        this.loading = false;
        this.hasBilling = false;
        this.hasAdvertising = false;
        this.isMature = false;
        this.bdsFlags = null;
        this.campaignUrl = "";
        this.splits = null;
        this.requiredSplits = null;
        this.oemId = null;
        this.isBeta = false;
    }
}
