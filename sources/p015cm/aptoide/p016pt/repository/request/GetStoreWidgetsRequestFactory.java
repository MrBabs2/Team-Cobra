package p015cm.aptoide.p016pt.repository.request;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreWidgetsRequest;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.repository.request.GetStoreWidgetsRequestFactory */
class GetStoreWidgetsRequestFactory {
    private final AptoideAccountManager accountManager;
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final AppCoinsManager appCoinsManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final String clientUniqueId;
    private final Converter.Factory converterFactory;
    private final String filters;
    private final OkHttpClient httpClient;
    private final String partnerId;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final ConnectivityManager systemService;
    private final TokenInvalidator tokenInvalidator;
    private final AdsApplicationVersionCodeProvider versionCodeProvider;
    private final WindowManager windowManager;

    public GetStoreWidgetsRequestFactory(StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, Resources resources2, WindowManager windowManager2, String str, String str2, AptoideAccountManager aptoideAccountManager, String str3, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, AppBundlesVisibilityManager appBundlesVisibilityManager2, AppCoinsManager appCoinsManager2) {
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.resources = resources2;
        this.windowManager = windowManager2;
        this.clientUniqueId = str;
        this.partnerId = str2;
        this.accountManager = aptoideAccountManager;
        this.filters = str3;
        this.systemService = connectivityManager;
        this.versionCodeProvider = adsApplicationVersionCodeProvider;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
        this.appCoinsManager = appCoinsManager2;
    }

    public GetStoreWidgetsRequest newStoreWidgets(String str, boolean z) {
        boolean booleanValue = this.accountManager.hasMatureContentEnabled().mo18669c().mo18700m().mo18562a().mo41082a().booleanValue();
        return GetStoreWidgetsRequest.ofAction(str, this.storeCredentialsProvider.fromUrl(str), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager, this.clientUniqueId, z, this.partnerId, booleanValue, this.filters, this.systemService, this.versionCodeProvider, this.appBundlesVisibilityManager, this.appCoinsManager);
    }
}
