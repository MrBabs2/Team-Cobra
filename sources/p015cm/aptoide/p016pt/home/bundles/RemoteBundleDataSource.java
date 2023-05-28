package p015cm.aptoide.p016pt.home.bundles;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.WSWidgetsUtils;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.GetHomeBundlesRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreWidgetsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.WidgetsArgs;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p015cm.aptoide.p016pt.home.bundles.base.FeaturedAppcBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.home.bundles.RemoteBundleDataSource */
public class RemoteBundleDataSource implements BundleDataSource {
    private final AptoideAccountManager accountManager;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final AppCoinsManager appCoinsManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final ConnectivityManager connectivityManager;
    private final Converter.Factory converterFactory;
    private Map<String, Boolean> error = new HashMap();
    private final String filters;
    private final IdsRepository idsRepository;
    private final boolean isGooglePlayServicesAvailable;
    private final int latestPackagesCount;
    private final int limit;
    private Map<String, Boolean> loading = new HashMap();
    private final BundlesResponseMapper mapper;
    private final OkHttpClient okHttpClient;
    private final PackageRepository packageRepository;
    private final String partnerId;
    private final int randomPackagesCount;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private Map<String, Integer> total;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WSWidgetsUtils widgetsUtils;
    private final WindowManager windowManager;

    public RemoteBundleDataSource(int i, Map<String, Integer> map, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient2, Converter.Factory factory, BundlesResponseMapper bundlesResponseMapper, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, WSWidgetsUtils wSWidgetsUtils, StoreCredentialsProvider storeCredentialsProvider2, IdsRepository idsRepository2, boolean z, String str, AptoideAccountManager aptoideAccountManager, String str2, Resources resources2, WindowManager windowManager2, ConnectivityManager connectivityManager2, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, PackageRepository packageRepository2, int i2, int i3, AppBundlesVisibilityManager appBundlesVisibilityManager2, AppCoinsManager appCoinsManager2) {
        this.limit = i;
        this.total = map;
        this.bodyInterceptor = bodyInterceptor2;
        this.okHttpClient = okHttpClient2;
        this.converterFactory = factory;
        this.mapper = bundlesResponseMapper;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.widgetsUtils = wSWidgetsUtils;
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.idsRepository = idsRepository2;
        this.isGooglePlayServicesAvailable = z;
        this.partnerId = str;
        this.accountManager = aptoideAccountManager;
        this.filters = str2;
        this.resources = resources2;
        this.windowManager = windowManager2;
        this.connectivityManager = connectivityManager2;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.packageRepository = packageRepository2;
        this.latestPackagesCount = i2;
        this.randomPackagesCount = i3;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.appCoinsManager = appCoinsManager2;
    }

    /* renamed from: a */
    static /* synthetic */ GetStoreWidgets.WSWidget m6314a(GetStoreWidgets.WSWidget wSWidget, GetStoreWidgets.WSWidget wSWidget2) {
        return wSWidget;
    }

    /* renamed from: a */
    static /* synthetic */ GetStoreWidgets m6315a(GetStoreWidgets getStoreWidgets, GetStoreWidgets.WSWidget wSWidget) {
        return getStoreWidgets;
    }

    private HomeBundlesModel createErrorAppsList(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new HomeBundlesModel(HomeBundlesModel.Error.NETWORK);
        }
        return new HomeBundlesModel(HomeBundlesModel.Error.GENERIC);
    }

    private Single<HomeBundlesModel> getEventBundles(String str, boolean z, String str2, int i, int i2) {
        if (isLoading(str2)) {
            return Single.m10119a(new HomeBundlesModel(true));
        }
        return getMoreBundlesRequest(str.replace(C2185V7.getHost(this.sharedPreferences), ""), i, i2).observe(z, false).mo18663b((C5377a) new C2907g(this, str2)).mo18680d((C5377a) new C2915m(this, str2)).mo18673c((C5377a) new C2918o(this, str2)).mo18687f(new C2914l(this, str2)).mo18700m().mo18571f(new C2920q(this, str2));
    }

    private C5368e<HomeBundlesModel> getHomeBundles(int i, int i2, boolean z, String str, boolean z2) {
        if (isLoading(str)) {
            return C5368e.m10257c(new HomeBundlesModel(true));
        }
        return this.accountManager.hasMatureContentEnabled().mo18669c().mo18687f(new C2929w(this, i2, i, z, str, z2));
    }

    private Single<List<String>> getPackages() {
        return C5368e.m10242a(this.packageRepository.getLatestInstalledPackages(this.latestPackagesCount), this.packageRepository.getRandomInstalledPackages(this.randomPackagesCount)).mo18698l().mo18700m();
    }

    private int getTotal(String str) {
        if (this.total.containsKey(str)) {
            return this.total.get(str).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean isComplete(List<HomeBundle> list) {
        for (HomeBundle next : list) {
            if (next.getContent() == null) {
                return false;
            }
            if ((next instanceof FeaturedAppcBundle) && ((FeaturedAppcBundle) next).getBonusPercentage() == -1) {
                return false;
            }
        }
        return !list.isEmpty();
    }

    private boolean isError(String str) {
        return this.error.containsKey(str) && this.error.get(str).booleanValue();
    }

    private boolean isLoading(String str) {
        return this.loading.containsKey(str) && this.loading.get(str).booleanValue();
    }

    private C5368e<GetStoreWidgets> loadAppsInBundles(boolean z, boolean z2, List<String> list, GetStoreWidgets getStoreWidgets, boolean z3, String str) {
        return C5368e.m10234a(getStoreWidgets.getDataList().getList()).mo18644a(Schedulers.m10352io()).mo18687f(new C2922s(this, z2, str, z, z3, list)).mo18694j(new C2913k(getStoreWidgets));
    }

    /* access modifiers changed from: private */
    /* renamed from: mapHomeResponse */
    public C5368e<HomeBundlesModel> mo12217b(GetStoreWidgets getStoreWidgets, String str) {
        if (!getStoreWidgets.isOk()) {
            return C5368e.m10238a((Throwable) new IllegalStateException("Could not obtain home bundles from server."));
        }
        List<HomeBundle> fromWidgetsToBundles = this.mapper.fromWidgetsToBundles(getStoreWidgets.getDataList().getList());
        boolean isComplete = isComplete(fromWidgetsToBundles);
        List<HomeBundle> removeEmptyBundles = removeEmptyBundles(fromWidgetsToBundles);
        this.total.put(str, Integer.valueOf(getStoreWidgets.getDataList().getTotal()));
        return C5368e.m10257c(new HomeBundlesModel(removeEmptyBundles, false, getStoreWidgets.getDataList().getNext(), isComplete));
    }

    private List<HomeBundle> removeEmptyBundles(List<HomeBundle> list) {
        ArrayList arrayList = new ArrayList();
        for (HomeBundle next : list) {
            if (next.getContent() == null || (next.getType().isApp() && !next.getContent().isEmpty())) {
                arrayList.add(next);
            } else if (!next.getType().isApp()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12211a(int i, int i2, boolean z, String str, boolean z2, Boolean bool) {
        return this.idsRepository.getUniqueIdentifier().mo18567c().mo18687f(new C2912j(this, i, i2, z, bool, str, z2));
    }

    /* renamed from: c */
    public /* synthetic */ void mo12219c(String str) {
        this.loading.put(str, false);
    }

    /* renamed from: d */
    public /* synthetic */ void mo12220d(String str) {
        this.loading.put(str, true);
        this.error.put(str, false);
    }

    /* renamed from: e */
    public /* synthetic */ void mo12221e(String str) {
        this.loading.put(str, false);
    }

    /* renamed from: f */
    public /* synthetic */ void mo12222f(String str) {
        this.loading.put(str, false);
    }

    public GetStoreWidgetsRequest getMoreBundlesRequest(String str, int i, int i2) {
        String str2 = str;
        boolean booleanValue = this.accountManager.hasMatureContentEnabled().mo18669c().mo18700m().mo18562a().mo41082a().booleanValue();
        BaseRequestWithStore.StoreCredentials fromUrl = this.storeCredentialsProvider.fromUrl(str2);
        BaseRequestWithStore.StoreCredentials storeCredentials = fromUrl;
        GetStoreWidgetsRequest.Body body = r3;
        GetStoreWidgetsRequest.Body body2 = new GetStoreWidgetsRequest.Body(fromUrl, WidgetsArgs.createWithLineMultiplier(this.resources, this.windowManager, 3), i2);
        body2.setOffset(i);
        boolean z = this.isGooglePlayServicesAvailable;
        String str3 = this.partnerId;
        String str4 = this.filters;
        Resources resources2 = this.resources;
        WindowManager windowManager2 = this.windowManager;
        ConnectivityManager connectivityManager2 = this.connectivityManager;
        AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider = this.versionCodeProvider;
        WSWidgetsUtils wSWidgetsUtils = r1;
        WSWidgetsUtils wSWidgetsUtils2 = new WSWidgetsUtils();
        return new GetStoreWidgetsRequest(new V7Url(str2).remove("getStoreWidgets").get(), body, this.bodyInterceptor, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, storeCredentials, this.idsRepository.getUniqueIdentifier().mo18562a().mo41082a(), z, str3, booleanValue, str4, resources2, windowManager2, connectivityManager2, adsApplicationVersionCodeProvider, wSWidgetsUtils, this.appBundlesVisibilityManager, this.appCoinsManager);
    }

    public boolean hasMore(Integer num, String str) {
        return num.intValue() < getTotal(str) && !isLoading(str) && !isError(str);
    }

    public Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2) {
        return getEventBundles(str, true, str2, 0, this.limit);
    }

    public C5368e<HomeBundlesModel> loadFreshHomeBundles(String str) {
        return getHomeBundles(0, this.limit, true, str, false);
    }

    public Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i, String str2, int i2) {
        return getEventBundles(str, false, str2, i, i2);
    }

    public C5368e<HomeBundlesModel> loadNextHomeBundles(int i, int i2, String str, boolean z) {
        return getHomeBundles(i, i2, false, str, z);
    }

    /* renamed from: b */
    public /* synthetic */ HomeBundlesModel mo12216b(String str, Throwable th) {
        th.printStackTrace();
        this.loading.put(str, false);
        this.error.put(str, true);
        return createErrorAppsList(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12210a(int i, int i2, boolean z, Boolean bool, String str, boolean z2, String str2) {
        return getPackages().mo18567c().mo18687f(new C2927u(this, i, i2, z, bool, str2, str, z2));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12209a(int i, int i2, boolean z, Boolean bool, String str, String str2, boolean z2, List list) {
        String str3 = str2;
        boolean z3 = z;
        return GetHomeBundlesRequest.m5345of(i, i2, this.okHttpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager).observe(z3, false).mo18687f(new C2917n(this, bool, z3, list, str)).mo18663b((C5377a) new C2930x(this, str3)).mo18680d((C5377a) new C2919p(this, str3)).mo18673c((C5377a) new C2909i(this, str3)).mo18687f(new C2908h(this, str3)).mo18681d(new C2921r(z2)).mo18705q(C2931y.f5864f).mo18699l(new C2923t(this, str3));
    }

    /* renamed from: b */
    public /* synthetic */ void mo12218b(String str) {
        this.loading.put(str, false);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12212a(Boolean bool, boolean z, List list, String str, GetStoreWidgets getStoreWidgets) {
        return C5368e.m10254b(C5368e.m10257c(getStoreWidgets), (C5368e) loadAppsInBundles(bool.booleanValue(), z, list, getStoreWidgets, false, str));
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6316a(boolean z, HomeBundlesModel homeBundlesModel) {
        return Boolean.valueOf(z || homeBundlesModel.isComplete());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12214a(boolean z, String str, boolean z2, boolean z3, List list, GetStoreWidgets.WSWidget wSWidget) {
        WSWidgetsUtils wSWidgetsUtils = this.widgetsUtils;
        BaseRequestWithStore.StoreCredentials fromUrl = this.storeCredentialsProvider.fromUrl("");
        boolean z4 = this.isGooglePlayServicesAvailable;
        String str2 = this.partnerId;
        BodyInterceptor<BaseBody> bodyInterceptor2 = this.bodyInterceptor;
        OkHttpClient okHttpClient2 = this.okHttpClient;
        Converter.Factory factory = this.converterFactory;
        String str3 = this.filters;
        TokenInvalidator tokenInvalidator2 = this.tokenInvalidator;
        SharedPreferences sharedPreferences2 = this.sharedPreferences;
        Resources resources2 = this.resources;
        WSWidgetsUtils wSWidgetsUtils2 = wSWidgetsUtils;
        WindowManager windowManager2 = this.windowManager;
        WindowManager windowManager3 = windowManager2;
        ConnectivityManager connectivityManager2 = this.connectivityManager;
        AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider = this.versionCodeProvider;
        int perLineCount = Type.ADS.getPerLineCount(resources2, windowManager2) * 3;
        return wSWidgetsUtils2.loadWidgetNode(wSWidget, fromUrl, z, str, z4, str2, z2, bodyInterceptor2, okHttpClient2, factory, str3, tokenInvalidator2, sharedPreferences2, resources2, windowManager3, connectivityManager2, adsApplicationVersionCodeProvider, z3, perLineCount, list, this.appBundlesVisibilityManager, this.appCoinsManager).mo18694j(new C2928v(wSWidget));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12215a(String str) {
        this.loading.put(str, true);
        this.error.put(str, false);
    }

    /* renamed from: a */
    public /* synthetic */ HomeBundlesModel mo12208a(String str, Throwable th) {
        this.error.put(str, true);
        return createErrorAppsList(th);
    }
}
