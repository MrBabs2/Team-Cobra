package p015cm.aptoide.p016pt.repository.request;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListAppsRequest;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.repository.request.ListAppsRequestFactory */
class ListAppsRequestFactory {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;
    private final WindowManager windowManager;

    public ListAppsRequestFactory(BodyInterceptor<BaseBody> bodyInterceptor2, StoreCredentialsProvider storeCredentialsProvider2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, Resources resources2, WindowManager windowManager2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.resources = resources2;
        this.windowManager = windowManager2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public ListAppsRequest newListAppsRequest(String str) {
        return ListAppsRequest.ofAction(str, this.storeCredentialsProvider.fromUrl(str), this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.resources, this.windowManager, this.appBundlesVisibilityManager);
    }
}
