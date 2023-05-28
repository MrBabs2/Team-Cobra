package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppCoinsCampaignsRequest */
public class GetAppCoinsCampaignsRequest extends C2185V7<ListAppCoinsCampaigns, Body> {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;

    public GetAppCoinsCampaignsRequest(Body body, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20191202/");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public C5368e<ListAppCoinsCampaigns> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        B b = this.body;
        return interfaces.getAppCoinsAds((Body) b, z, ((Body) b).getLimit().intValue(), this.appBundlesVisibilityManager.shouldEnableAppBundles());
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppCoinsCampaignsRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private int limit;
        private int offset;
        private String packageName;
        private Integer vercode;

        public Body(int i, int i2) {
            this.offset = i;
            this.limit = i2;
        }

        public Integer getLimit() {
            return Integer.valueOf(this.limit);
        }

        public int getOffset() {
            return this.offset;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public Integer getVercode() {
            return this.vercode;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public Body(String str, int i) {
            this.packageName = str;
            this.vercode = Integer.valueOf(i);
            this.limit = 5;
            this.offset = 0;
        }
    }
}
