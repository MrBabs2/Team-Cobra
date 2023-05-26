package p015cm.aptoide.p016pt.search.suggestions;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListAppsRequest;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.search.suggestions.TrendingService */
public class TrendingService {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences sharedPreferences;
    private final StoreCredentialsProvider storeCredentialsProvider;
    private final TokenInvalidator tokenInvalidator;

    public TrendingService(StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor2, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.bodyInterceptor = bodyInterceptor2;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public C5368e<ListApps> getTrendingApps(int i, int i2) {
        long j = (long) i2;
        ListAppsRequest.Body body = new ListAppsRequest.Body(this.storeCredentialsProvider.get(j), i, this.sharedPreferences, ListAppsRequest.Sort.trending60d);
        body.setStoreId(j);
        return new ListAppsRequest(body, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false);
    }
}
