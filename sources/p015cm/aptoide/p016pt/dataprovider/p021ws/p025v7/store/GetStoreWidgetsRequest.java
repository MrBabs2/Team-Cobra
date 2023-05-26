package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.WSWidgetsUtils;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreWidgetsRequest */
public class GetStoreWidgetsRequest extends BaseRequestWithStore<GetStoreWidgets, Body> {
    private final boolean accountMature;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final AppCoinsManager appCoinsManager;
    private boolean bypassServerCache;
    private final String clientUniqueId;
    private final ConnectivityManager connectivityManager;
    private final String filters;
    private final boolean isGooglePlayServicesAvailable;
    private final String partnerId;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final BaseRequestWithStore.StoreCredentials storeCredentials;
    private final String url;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WSWidgetsUtils widgetsUtils;
    private final WindowManager windowManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetStoreWidgetsRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences2, BaseRequestWithStore.StoreCredentials storeCredentials2, String str2, boolean z, String str3, boolean z2, String str4, Resources resources2, WindowManager windowManager2, ConnectivityManager connectivityManager2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, WSWidgetsUtils wSWidgetsUtils, AppBundlesVisibilityManager appBundlesVisibilityManager2, AppCoinsManager appCoinsManager2) {
        super(body, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences2);
        this.url = str;
        this.storeCredentials = storeCredentials2;
        this.clientUniqueId = str2;
        this.isGooglePlayServicesAvailable = z;
        this.partnerId = str3;
        this.accountMature = z2;
        this.filters = str4;
        this.resources = resources2;
        this.windowManager = windowManager2;
        this.connectivityManager = connectivityManager2;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.sharedPreferences = sharedPreferences2;
        this.widgetsUtils = wSWidgetsUtils;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.appCoinsManager = appCoinsManager2;
    }

    /* renamed from: a */
    static /* synthetic */ GetStoreWidgets m5368a(GetStoreWidgets getStoreWidgets, List list) {
        return getStoreWidgets;
    }

    private C5368e<List<GetStoreWidgets.WSWidget>> loadGetStoreWidgets(GetStoreWidgets getStoreWidgets, boolean z) {
        return C5368e.m10234a(getStoreWidgets.getDataList().getList()).mo18644a(Schedulers.m10352io()).mo18687f(new C2252b(this, z)).mo18698l().mo18691h(new C2253c(getStoreWidgets)).mo18698l().mo18669c();
    }

    public static GetStoreWidgetsRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences2, Resources resources2, WindowManager windowManager2, String str2, boolean z, String str3, boolean z2, String str4, ConnectivityManager connectivityManager2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppBundlesVisibilityManager appBundlesVisibilityManager2, AppCoinsManager appCoinsManager2) {
        BodyInterceptor<BaseBody> bodyInterceptor2 = bodyInterceptor;
        OkHttpClient okHttpClient2 = okHttpClient;
        Converter.Factory factory2 = factory;
        TokenInvalidator tokenInvalidator2 = tokenInvalidator;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        String str5 = str2;
        boolean z3 = z;
        String str6 = str3;
        boolean z4 = z2;
        String str7 = str4;
        Body body = r0;
        Body body2 = new Body(storeCredentials2, WidgetsArgs.createDefault(resources2, windowManager2));
        String str8 = new V7Url(str).remove("getStoreWidgets").get();
        WSWidgetsUtils wSWidgetsUtils = r2;
        WSWidgetsUtils wSWidgetsUtils2 = new WSWidgetsUtils();
        return new GetStoreWidgetsRequest(str8, body, bodyInterceptor2, okHttpClient2, factory2, tokenInvalidator2, sharedPreferences3, storeCredentials2, str5, z3, str6, z4, str7, resources2, windowManager2, connectivityManager2, adsApplicationVersionCodeProvider, wSWidgetsUtils, appBundlesVisibilityManager2, appCoinsManager2);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10474a(boolean z, GetStoreWidgets getStoreWidgets) {
        return loadGetStoreWidgets(getStoreWidgets, z).mo18694j(new C2251a(getStoreWidgets));
    }

    public String getUrl() {
        return this.url;
    }

    public C5368e<GetStoreWidgets> observe(boolean z, boolean z2) {
        this.bypassServerCache = z2;
        return super.observe(z, z2);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10473a(boolean z, GetStoreWidgets.WSWidget wSWidget) {
        boolean z2 = z;
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        WSWidgetsUtils wSWidgetsUtils = this.widgetsUtils;
        BaseRequestWithStore.StoreCredentials storeCredentials2 = this.storeCredentials;
        String str = this.clientUniqueId;
        boolean z3 = this.isGooglePlayServicesAvailable;
        String str2 = this.partnerId;
        boolean z4 = this.accountMature;
        BodyInterceptor bodyInterceptor = this.bodyInterceptor;
        OkHttpClient httpClient = getHttpClient();
        Converter.Factory factory = this.converterFactory;
        String str3 = this.filters;
        TokenInvalidator tokenInvalidator = getTokenInvalidator();
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        Resources resources2 = this.resources;
        WSWidgetsUtils wSWidgetsUtils2 = wSWidgetsUtils;
        WindowManager windowManager2 = this.windowManager;
        return wSWidgetsUtils2.loadWidgetNode(wSWidget2, storeCredentials2, z2, str, z3, str2, z4, bodyInterceptor, httpClient, factory, str3, tokenInvalidator, sharedPreferences2, resources2, windowManager2, this.connectivityManager, this.versionCodeProvider, this.bypassServerCache, Type.ADS.getPerLineCount(resources2, windowManager2), Collections.emptyList(), this.appBundlesVisibilityManager, this.appCoinsManager);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetStoreWidgets> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getStoreWidgets(this.url, (Body) this.body, z).mo18687f(new C2254d(this, z));
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreWidgetsRequest$Body */
    public static class Body extends BaseBodyWithStore implements Endless {
        private StoreContext context;
        private Integer limit;
        private int offset;
        private String storeName;
        private WidgetsArgs widgetsArgs;

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs2) {
            super(storeCredentials);
            this.widgetsArgs = widgetsArgs2;
            this.limit = 5;
        }

        public StoreContext getContext() {
            return this.context;
        }

        public Integer getLimit() {
            return this.limit;
        }

        public int getOffset() {
            return this.offset;
        }

        public String getStoreName() {
            return this.storeName;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs2, int i) {
            super(storeCredentials);
            this.widgetsArgs = widgetsArgs2;
            this.limit = Integer.valueOf(i);
        }

        public Body(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs2, StoreContext storeContext, String str) {
            super(storeCredentials);
            this.widgetsArgs = widgetsArgs2;
            this.context = storeContext;
            this.storeName = str;
        }
    }
}
