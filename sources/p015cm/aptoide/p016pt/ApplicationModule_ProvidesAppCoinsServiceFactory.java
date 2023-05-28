package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.app.AppCoinsService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppCoinsServiceFactory */
public final class ApplicationModule_ProvidesAppCoinsServiceFactory implements C10824b<AppCoinsService> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesAppCoinsServiceFactory(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4, Provider<Converter.Factory> provider5, Provider<AppBundlesVisibilityManager> provider6) {
        this.module = applicationModule;
        this.bodyInterceptorPoolV7Provider = provider;
        this.okHttpClientProvider = provider2;
        this.tokenInvalidatorProvider = provider3;
        this.sharedPreferencesProvider = provider4;
        this.converterFactoryProvider = provider5;
        this.appBundlesVisibilityManagerProvider = provider6;
    }

    public static ApplicationModule_ProvidesAppCoinsServiceFactory create(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4, Provider<Converter.Factory> provider5, Provider<AppBundlesVisibilityManager> provider6) {
        return new ApplicationModule_ProvidesAppCoinsServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static AppCoinsService providesAppCoinsService(ApplicationModule applicationModule, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        AppCoinsService providesAppCoinsService = applicationModule.providesAppCoinsService(bodyInterceptor, okHttpClient, tokenInvalidator, sharedPreferences, factory, appBundlesVisibilityManager);
        C10825c.m36718a(providesAppCoinsService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCoinsService;
    }

    public AppCoinsService get() {
        return providesAppCoinsService(this.module, this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.converterFactoryProvider.get(), this.appBundlesVisibilityManagerProvider.get());
    }
}
