package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListAppsRequest */
public class ListAppsRequest extends C2185V7<ListApps, Body> {
    private static final int LINES_PER_REQUEST = 6;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListAppsRequest$Sort */
    public enum Sort {
        latest,
        trending7d,
        trending60d
    }

    public ListAppsRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_CACHE_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    public static ListAppsRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        BaseRequestWithStore.StoreCredentials storeCredentials2 = storeCredentials;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String str2 = str;
        V7Url remove = new V7Url(str).remove("listApps");
        if (remove.containsLimit()) {
            return new ListAppsRequest(remove.get(), new Body(storeCredentials, sharedPreferences2), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager2);
        }
        return new ListAppsRequest(remove.get(), new Body(storeCredentials, Type.APPS_GROUP.getPerLineCount(resources, windowManager) * 6, sharedPreferences2), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager2);
    }

    /* access modifiers changed from: protected */
    public C5368e<ListApps> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        String str = this.url;
        if (str == null) {
            str = "";
        }
        return interfaces.listApps(str, z ? "no-cache" : null, getQueryStringMapper().map((Body) this.body, this.appBundlesVisibilityManager.shouldEnableAppBundles()));
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ListAppsRequest$Body */
    public static class Body extends BaseBody implements Endless {
        private Long groupId;
        private Integer limit;
        private String notApkTags;
        private int offset;
        private Sort sort;
        private Long storeId;
        private String storePassSha1;
        private String storeUser;

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, SharedPreferences sharedPreferences) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            setNotApkTags(sharedPreferences);
        }

        private void setNotApkTags(SharedPreferences sharedPreferences) {
            if (ManagerPreferences.getUpdatesFilterAlphaBetaKey(sharedPreferences)) {
                this.notApkTags = "alpha,beta";
            }
        }

        public Long getGroupId() {
            return this.groupId;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public String getNotApkTags() {
            return this.notApkTags;
        }

        public int getOffset() {
            return this.offset;
        }

        public Sort getSort() {
            return this.sort;
        }

        public Long getStoreId() {
            return this.storeId;
        }

        public String getStorePassSha1() {
            return this.storePassSha1;
        }

        public String getStoreUser() {
            return this.storeUser;
        }

        public void setGroupId(Long l) {
            this.groupId = l;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setSort(Sort sort2) {
            this.sort = sort2;
        }

        public void setStoreId(long j) {
            this.storeId = Long.valueOf(j);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, int i, SharedPreferences sharedPreferences) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            this.limit = Integer.valueOf(i);
            setNotApkTags(sharedPreferences);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, int i, SharedPreferences sharedPreferences, Sort sort2) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            this.limit = Integer.valueOf(i);
            this.sort = sort2;
            setNotApkTags(sharedPreferences);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, Long l, int i, SharedPreferences sharedPreferences, Sort sort2) {
            this.storeUser = storeCredentials.getUsername();
            this.storePassSha1 = storeCredentials.getPasswordSha1();
            this.groupId = l;
            this.limit = Integer.valueOf(i);
            this.sort = sort2;
            setNotApkTags(sharedPreferences);
        }
    }

    public ListAppsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }
}
