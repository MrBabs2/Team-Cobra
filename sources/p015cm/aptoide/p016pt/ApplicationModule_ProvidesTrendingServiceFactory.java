package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.search.suggestions.TrendingService;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesTrendingServiceFactory */
public final class ApplicationModule_ProvidesTrendingServiceFactory implements C10824b<TrendingService> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesTrendingServiceFactory(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<SharedPreferences> provider2, Provider<TokenInvalidator> provider3, Provider<Converter.Factory> provider4, Provider<OkHttpClient> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        this.module = applicationModule;
        this.storeCredentialsProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.tokenInvalidatorProvider = provider3;
        this.converterFactoryProvider = provider4;
        this.httpClientProvider = provider5;
        this.bodyInterceptorProvider = provider6;
        this.appBundlesVisibilityManagerProvider = provider7;
    }

    public static ApplicationModule_ProvidesTrendingServiceFactory create(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<SharedPreferences> provider2, Provider<TokenInvalidator> provider3, Provider<Converter.Factory> provider4, Provider<OkHttpClient> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        return new ApplicationModule_ProvidesTrendingServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static TrendingService providesTrendingService(ApplicationModule applicationModule, StoreCredentialsProvider storeCredentialsProvider2, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, Converter.Factory factory, OkHttpClient okHttpClient, BodyInterceptor<BaseBody> bodyInterceptor, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        TrendingService providesTrendingService = applicationModule.providesTrendingService(storeCredentialsProvider2, sharedPreferences, tokenInvalidator, factory, okHttpClient, bodyInterceptor, appBundlesVisibilityManager);
        C10825c.m36718a(providesTrendingService, "Cannot return null from a non-@Nullable @Provides method");
        return providesTrendingService;
    }

    public TrendingService get() {
        return providesTrendingService(this.module, this.storeCredentialsProvider.get(), this.sharedPreferencesProvider.get(), this.tokenInvalidatorProvider.get(), this.converterFactoryProvider.get(), this.httpClientProvider.get(), this.bodyInterceptorProvider.get(), this.appBundlesVisibilityManagerProvider.get());
    }
}
