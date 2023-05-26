package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;

/* renamed from: cm.aptoide.pt.view.AppViewConfiguration */
public class AppViewConfiguration {
    private final long appId;
    private final double appc;
    private final String campaignUrl;
    private final String editorsChoice;
    private final boolean isEskillsAppView;
    private final String md5;
    private final SearchAdResult minimalAd;
    private final String oemId;
    private final String originTag;
    private final String packageName;
    private final AppViewFragment.OpenType shouldInstall;
    private final String storeName;
    private final String storeTheme;
    private final String uniqueName;

    public AppViewConfiguration(long j, String str, String str2, String str3, SearchAdResult searchAdResult, AppViewFragment.OpenType openType, String str4, String str5, double d, String str6, String str7, String str8, String str9, boolean z) {
        this.appId = j;
        this.packageName = str;
        this.storeName = str2;
        this.storeTheme = str3;
        this.minimalAd = searchAdResult;
        this.shouldInstall = openType;
        this.md5 = str4;
        this.uniqueName = str5;
        this.appc = d;
        this.editorsChoice = str6;
        this.originTag = str7;
        this.campaignUrl = str8;
        this.oemId = str9;
        this.isEskillsAppView = z;
    }

    public long getAppId() {
        return this.appId;
    }

    public double getAppc() {
        return this.appc;
    }

    public String getCampaignUrl() {
        return this.campaignUrl;
    }

    public String getEditorsChoice() {
        return this.editorsChoice;
    }

    public String getMd5() {
        return this.md5;
    }

    public SearchAdResult getMinimalAd() {
        return this.minimalAd;
    }

    public String getOemId() {
        return this.oemId;
    }

    public String getOriginTag() {
        return this.originTag;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public String getUniqueName() {
        return this.uniqueName;
    }

    public boolean hasMd5() {
        String str = this.md5;
        return str != null && !str.isEmpty();
    }

    public boolean hasUniqueName() {
        String str = this.uniqueName;
        return str != null && !str.isEmpty();
    }

    public boolean isEskillsAppView() {
        return this.isEskillsAppView;
    }

    public AppViewFragment.OpenType shouldInstall() {
        return this.shouldInstall;
    }
}
