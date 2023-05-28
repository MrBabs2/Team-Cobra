package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.view.app.AppService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppServiceFactory */
public final class ApplicationModule_ProvidesAppServiceFactory implements C10824b<AppService> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<SplitsMapper> splitsMapperProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesAppServiceFactory(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<OkHttpClient> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        this.module = applicationModule;
        this.storeCredentialsProvider = provider;
        this.bodyInterceptorPoolV7Provider = provider2;
        this.okHttpClientProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.splitsMapperProvider = provider6;
        this.appBundlesVisibilityManagerProvider = provider7;
    }

    public static ApplicationModule_ProvidesAppServiceFactory create(ApplicationModule applicationModule, Provider<StoreCredentialsProvider> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<OkHttpClient> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        return new ApplicationModule_ProvidesAppServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AppService providesAppService(ApplicationModule applicationModule, StoreCredentialsProvider storeCredentialsProvider2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, SplitsMapper splitsMapper, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        AppService providesAppService = applicationModule.providesAppService(storeCredentialsProvider2, bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences, splitsMapper, appBundlesVisibilityManager);
        C10825c.m36718a(providesAppService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppService;
    }

    public AppService get() {
        return providesAppService(this.module, this.storeCredentialsProvider.get(), this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.splitsMapperProvider.get(), this.appBundlesVisibilityManagerProvider.get());
    }
}
