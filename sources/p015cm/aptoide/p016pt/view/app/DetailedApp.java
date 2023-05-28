package p015cm.aptoide.p016pt.view.app;

import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.view.app.DetailedApp */
public class DetailedApp {
    private final String added;
    private final AppDeveloper appDeveloper;
    private final AppFlags appFlags;
    private List<String> bdsFlags;
    private final long fileSize;
    private final String graphic;
    private boolean hasAdvertising;
    private boolean hasBilling;
    private final String icon;

    /* renamed from: id */
    private long f7733id;
    private final boolean isBeta;
    private final boolean isGoodApp;
    private final boolean isLatestTrustedVersion;
    private boolean isMature;
    private final Malware malware;
    private final String md5;
    private final AppMedia media;
    private final String modified;
    private final String name;
    private final Obb obb;
    private final String packageName;
    private String path;
    private final String pathAlt;
    private final List<String> requiredSplits;
    private String signature;
    private final long size;
    private final List<Split> splits;
    private final AppStats stats;
    private final Store store;
    private final List<String> tags;
    private final String uniqueName;
    private final List<String> usedFeatures;
    private final List<String> usedPermissions;
    private final int versionCode;
    private final String versionName;
    private final String webUrls;

    public DetailedApp(long j, String str, String str2, long j2, String str3, String str4, String str5, String str6, boolean z, Malware malware2, AppFlags appFlags2, List<String> list, List<String> list2, List<String> list3, long j3, String str7, String str8, String str9, int i, String str10, AppDeveloper appDeveloper2, Store store2, AppMedia appMedia, AppStats appStats, Obb obb2, String str11, boolean z2, String str12, boolean z3, boolean z4, List<String> list4, boolean z5, String str13, List<Split> list5, List<String> list6, boolean z6) {
        this.f7733id = j;
        this.name = str;
        this.packageName = str2;
        this.size = j2;
        this.icon = str3;
        this.graphic = str4;
        this.added = str5;
        this.modified = str6;
        this.isGoodApp = z;
        this.malware = malware2;
        this.appFlags = appFlags2;
        this.tags = list;
        this.usedFeatures = list2;
        this.usedPermissions = list3;
        this.fileSize = j3;
        this.md5 = str7;
        this.path = str8;
        this.pathAlt = str9;
        this.versionCode = i;
        this.versionName = str10;
        this.appDeveloper = appDeveloper2;
        this.store = store2;
        this.media = appMedia;
        this.stats = appStats;
        this.obb = obb2;
        this.webUrls = str11;
        this.hasBilling = z3;
        this.hasAdvertising = z4;
        this.bdsFlags = list4;
        this.isMature = z5;
        this.splits = list5;
        this.requiredSplits = list6;
        this.signature = str13;
        this.isLatestTrustedVersion = z2;
        this.uniqueName = str12;
        this.isBeta = z6;
    }

    public String getAdded() {
        return this.added;
    }

    public AppFlags getAppFlags() {
        return this.appFlags;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public AppDeveloper getDeveloper() {
        return this.appDeveloper;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f7733id;
    }

    public Malware getMalware() {
        return this.malware;
    }

    public String getMd5() {
        return this.md5;
    }

    public AppMedia getMedia() {
        return this.media;
    }

    public String getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Obb getObb() {
        return this.obb;
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

    public AppStats getStats() {
        return this.stats;
    }

    public Store getStore() {
        return this.store;
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

    public boolean isBeta() {
        return this.isBeta;
    }

    public boolean isGoodApp() {
        return this.isGoodApp;
    }

    public boolean isLatestTrustedVersion() {
        return this.isLatestTrustedVersion;
    }

    public boolean isMature() {
        return this.isMature;
    }

    public void setBdsFlags(List<String> list) {
        this.bdsFlags = list;
    }

    public void setId(long j) {
        this.f7733id = j;
    }

    public void setPath(String str) {
        this.path = str;
    }
}
