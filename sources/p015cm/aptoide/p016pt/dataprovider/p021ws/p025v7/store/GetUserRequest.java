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
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.WSWidgetsUtils;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetUserRequest */
public class GetUserRequest extends C2185V7<GetStore, Body> {
    private final boolean accountMature;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final AppCoinsManager appCoinsManager;
    private boolean bypassServerCache;
    private final String clientUniqueId;
    private final ConnectivityManager connectivityManager;
    private final String filters;
    private final OkHttpClient httpClient;
    private final boolean isGooglePlayServicesAvailable;
    private final String partnerId;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final BaseRequestWithStore.StoreCredentials storeCredentials;
    private final TokenInvalidator tokenInvalidator;
    private String url;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WindowManager windowManager;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetUserRequest$Body */
    public static class Body extends BaseBody {
        private WidgetsArgs widgetsArgs;

        public Body(WidgetsArgs widgetsArgs2) {
            this.widgetsArgs = widgetsArgs2;
        }

        public WidgetsArgs getWidgetsArgs() {
            return this.widgetsArgs;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetUserRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, BaseRequestWithStore.StoreCredentials storeCredentials2, String str2, boolean z, String str3, boolean z2, String str4, SharedPreferences sharedPreferences3, Resources resources2, WindowManager windowManager2, ConnectivityManager connectivityManager2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppBundlesVisibilityManager appBundlesVisibilityManager2, AppCoinsManager appCoinsManager2) {
        super(body, C2185V7.getHost(sharedPreferences2), okHttpClient, factory, bodyInterceptor, tokenInvalidator2);
        this.url = str;
        this.httpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator2;
        this.storeCredentials = storeCredentials2;
        this.clientUniqueId = str2;
        this.isGooglePlayServicesAvailable = z;
        this.partnerId = str3;
        this.accountMature = z2;
        this.filters = str4;
        this.sharedPreferences = sharedPreferences3;
        this.resources = resources2;
        this.windowManager = windowManager2;
        this.connectivityManager = connectivityManager2;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.appCoinsManager = appCoinsManager2;
    }

    /* renamed from: a */
    static /* synthetic */ GetStore m5372a(GetStore getStore, List list) {
        return getStore;
    }

    /* renamed from: of */
    public static GetUserRequest m5374of(String str, BaseRequestWithStore.StoreCredentials storeCredentials2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, Resources resources2, WindowManager windowManager2, String str2, boolean z, String str3, boolean z2, String str4, ConnectivityManager connectivityManager2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppBundlesVisibilityManager appBundlesVisibilityManager2, AppCoinsManager appCoinsManager2) {
        BodyInterceptor<BaseBody> bodyInterceptor2 = bodyInterceptor;
        OkHttpClient okHttpClient2 = okHttpClient;
        Converter.Factory factory2 = factory;
        TokenInvalidator tokenInvalidator3 = tokenInvalidator2;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        String str5 = str2;
        boolean z3 = z;
        String str6 = str3;
        boolean z4 = z2;
        String str7 = str4;
        Body body = r0;
        Body body2 = new Body(WidgetsArgs.createDefault(resources2, windowManager2));
        return new GetUserRequest(new V7Url(str).remove("user/get").get(), body, bodyInterceptor2, okHttpClient2, factory2, tokenInvalidator3, sharedPreferences3, storeCredentials2, str5, z3, str6, z4, str7, sharedPreferences2, resources2, windowManager2, connectivityManager2, adsApplicationVersionCodeProvider, appBundlesVisibilityManager2, appCoinsManager2);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10480a(GetStore getStore) {
        return loadGetStoreWidgets(getStore).mo18694j(new C2255e(getStore));
    }

    /* access modifiers changed from: protected */
    public C5368e<List<GetStoreWidgets.WSWidget>> loadGetStoreWidgets(GetStore getStore) {
        return C5368e.m10234a(getStore.getNodes().getWidgets().getDataList().getList()).mo18644a(Schedulers.m10352io()).mo18687f(new C2256f(this)).mo18698l().mo18691h(new C2258h(getStore)).mo18698l().mo18669c();
    }

    public C5368e<GetStore> observe(boolean z, boolean z2) {
        this.bypassServerCache = z2;
        return super.observe(z, z2);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10479a(GetStoreWidgets.WSWidget wSWidget) {
        GetStoreWidgets.WSWidget wSWidget2 = wSWidget;
        WSWidgetsUtils wSWidgetsUtils = r3;
        WSWidgetsUtils wSWidgetsUtils2 = new WSWidgetsUtils();
        BaseRequestWithStore.StoreCredentials storeCredentials2 = this.storeCredentials;
        String str = this.clientUniqueId;
        boolean z = this.isGooglePlayServicesAvailable;
        String str2 = this.partnerId;
        boolean z2 = this.accountMature;
        BodyInterceptor bodyInterceptor = this.bodyInterceptor;
        OkHttpClient okHttpClient = this.httpClient;
        Converter.Factory factory = this.converterFactory;
        String str3 = this.filters;
        TokenInvalidator tokenInvalidator2 = this.tokenInvalidator;
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        Resources resources2 = this.resources;
        WSWidgetsUtils wSWidgetsUtils3 = wSWidgetsUtils;
        WindowManager windowManager2 = this.windowManager;
        WindowManager windowManager3 = windowManager2;
        ConnectivityManager connectivityManager2 = this.connectivityManager;
        AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider = this.versionCodeProvider;
        boolean z3 = this.bypassServerCache;
        int perLineCount = Type.ADS.getPerLineCount(resources2, windowManager2);
        return wSWidgetsUtils3.loadWidgetNode(wSWidget2, storeCredentials2, false, str, z, str2, z2, bodyInterceptor, okHttpClient, factory, str3, tokenInvalidator2, sharedPreferences2, resources2, windowManager3, connectivityManager2, adsApplicationVersionCodeProvider, z3, perLineCount, Collections.emptyList(), this.appBundlesVisibilityManager, this.appCoinsManager);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetStore> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getUser(this.url, (Body) this.body, z).mo18687f(new C2257g(this));
    }
}
