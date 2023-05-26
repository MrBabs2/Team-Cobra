package p015cm.aptoide.p016pt.repository.request;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetRecommendedRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListAppsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListFullReviewsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetRecommendedStoresRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreWidgetsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetUserRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.ListStoresRequest;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import retrofit2.Converter;

@Deprecated
/* renamed from: cm.aptoide.pt.repository.request.RequestFactory */
public class RequestFactory {
    private final AppCoinsManager appCoinsManager;
    private final GetRecommendedRequestFactory getRecommendedRequestFactory;
    private final GetStoreRecommendedRequestFactory getStoreRecommendedRequestFactory;
    private final GetStoreRequestFactory getStoreRequestFactory;
    private final GetStoreWidgetsRequestFactory getStoreWidgetsRequestFactory;
    private final GetUserRequestFactory getUserRequestFactory;
    private final boolean googlePlayServicesAvailable;
    private final ListAppsRequestFactory listAppsRequestFactory;
    private final ListFullReviewsRequestFactory listFullReviewsRequestFactory;
    private final ListStoresRequestFactory listStoresRequestFactory;
    private final StoreCredentialsProvider storeCredentialsProvider;

    public RequestFactory(StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager, String str, String str2, AptoideAccountManager aptoideAccountManager, String str3, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider, boolean z, AppCoinsManager appCoinsManager2) {
        String str4 = str2;
        AptoideAccountManager aptoideAccountManager2 = aptoideAccountManager;
        String str5 = str3;
        ConnectivityManager connectivityManager2 = connectivityManager;
        AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider2 = adsApplicationVersionCodeProvider;
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.googlePlayServicesAvailable = z;
        this.appCoinsManager = appCoinsManager2;
        AppBundlesVisibilityManager appBundlesVisibilityManager = r1;
        AppBundlesVisibilityManager appBundlesVisibilityManager2 = r1;
        AppBundlesVisibilityManager appBundlesVisibilityManager3 = new AppBundlesVisibilityManager(AptoideUtils.isMIUIwithAABFix(), AptoideUtils.isDeviceMIUI(), new AppBundlesVisibilitySettingsProvider(sharedPreferences));
        BodyInterceptor<BaseBody> bodyInterceptor2 = bodyInterceptor;
        OkHttpClient okHttpClient2 = okHttpClient;
        Converter.Factory factory2 = factory;
        TokenInvalidator tokenInvalidator2 = tokenInvalidator;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        this.listStoresRequestFactory = new ListStoresRequestFactory(bodyInterceptor2, okHttpClient2, factory2, tokenInvalidator2, sharedPreferences2);
        OkHttpClient okHttpClient3 = okHttpClient;
        Converter.Factory factory3 = factory;
        TokenInvalidator tokenInvalidator3 = tokenInvalidator;
        SharedPreferences sharedPreferences3 = sharedPreferences;
        Resources resources2 = resources;
        WindowManager windowManager2 = windowManager;
        this.listAppsRequestFactory = new ListAppsRequestFactory(bodyInterceptor, storeCredentialsProvider2, okHttpClient3, factory3, tokenInvalidator3, sharedPreferences3, resources2, windowManager2, appBundlesVisibilityManager3);
        this.listFullReviewsRequestFactory = new ListFullReviewsRequestFactory(bodyInterceptor2, okHttpClient2, factory2, tokenInvalidator2, sharedPreferences2);
        this.getStoreRequestFactory = new GetStoreRequestFactory(storeCredentialsProvider2, bodyInterceptor, okHttpClient3, factory3, tokenInvalidator3, sharedPreferences3, resources2, windowManager2);
        this.getStoreWidgetsRequestFactory = new GetStoreWidgetsRequestFactory(storeCredentialsProvider2, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, resources, windowManager, str, str4, aptoideAccountManager2, str5, connectivityManager2, adsApplicationVersionCodeProvider2, appBundlesVisibilityManager2, this.appCoinsManager);
        GetUserRequestFactory getUserRequestFactory2 = r1;
        BodyInterceptor<BaseBody> bodyInterceptor3 = bodyInterceptor;
        OkHttpClient okHttpClient4 = okHttpClient;
        Converter.Factory factory4 = factory;
        TokenInvalidator tokenInvalidator4 = tokenInvalidator;
        GetUserRequestFactory getUserRequestFactory3 = new GetUserRequestFactory(bodyInterceptor3, okHttpClient4, factory4, tokenInvalidator4, sharedPreferences, resources, windowManager, storeCredentialsProvider2, str, str2, aptoideAccountManager, str3, connectivityManager, adsApplicationVersionCodeProvider, appBundlesVisibilityManager, appCoinsManager2);
        GetUserRequestFactory getUserRequestFactory4 = getUserRequestFactory2;
        this.getUserRequestFactory = getUserRequestFactory4;
        BodyInterceptor<BaseBody> bodyInterceptor4 = bodyInterceptor;
        OkHttpClient okHttpClient5 = okHttpClient;
        Converter.Factory factory5 = factory;
        TokenInvalidator tokenInvalidator5 = tokenInvalidator;
        SharedPreferences sharedPreferences4 = sharedPreferences;
        this.getStoreRecommendedRequestFactory = new GetStoreRecommendedRequestFactory(bodyInterceptor4, okHttpClient5, factory5, tokenInvalidator5, sharedPreferences4);
        this.getRecommendedRequestFactory = new GetRecommendedRequestFactory(bodyInterceptor4, okHttpClient5, factory5, tokenInvalidator5, sharedPreferences4);
    }

    @Deprecated
    public GetRecommendedRequest newGetRecommendedRequest(int i, String str) {
        return this.getRecommendedRequestFactory.newGetRecommendedRequest(i, str);
    }

    @Deprecated
    public GetRecommendedStoresRequest newGetRecommendedStores(String str) {
        return this.getStoreRecommendedRequestFactory.newRecommendedStore(str);
    }

    @Deprecated
    public GetUserRequest newGetUser(String str) {
        return this.getUserRequestFactory.newGetUser(str, this.googlePlayServicesAvailable);
    }

    @Deprecated
    public ListAppsRequest newListAppsRequest(String str) {
        return this.listAppsRequestFactory.newListAppsRequest(str);
    }

    @Deprecated
    public ListFullReviewsRequest newListFullReviews(String str, boolean z) {
        return this.listFullReviewsRequestFactory.newListFullReviews(str, z, this.storeCredentialsProvider.fromUrl(str));
    }

    @Deprecated
    public ListStoresRequest newListStoresRequest(int i, int i2) {
        return this.listStoresRequestFactory.newListStoresRequest(i, i2);
    }

    @Deprecated
    public GetStoreRequest newStore(String str) {
        return this.getStoreRequestFactory.newStore(str);
    }

    @Deprecated
    public GetStoreWidgetsRequest newStoreWidgets(String str) {
        return this.getStoreWidgetsRequestFactory.newStoreWidgets(str, this.googlePlayServicesAvailable);
    }

    @Deprecated
    public ListStoresRequest newListStoresRequest(String str) {
        return this.listStoresRequestFactory.newListStoresRequest(str);
    }
}
