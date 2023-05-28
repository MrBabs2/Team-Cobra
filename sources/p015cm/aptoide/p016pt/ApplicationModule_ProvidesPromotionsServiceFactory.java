package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.promotions.PromotionsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesPromotionsServiceFactory */
public final class ApplicationModule_ProvidesPromotionsServiceFactory implements C10824b<PromotionsService> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<SplitsMapper> splitsMapperProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesPromotionsServiceFactory(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<Converter.Factory> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        this.module = applicationModule;
        this.bodyInterceptorPoolV7Provider = provider;
        this.okHttpClientProvider = provider2;
        this.tokenInvalidatorProvider = provider3;
        this.converterFactoryProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.splitsMapperProvider = provider6;
        this.appBundlesVisibilityManagerProvider = provider7;
    }

    public static ApplicationModule_ProvidesPromotionsServiceFactory create(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<TokenInvalidator> provider3, Provider<Converter.Factory> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        return new ApplicationModule_ProvidesPromotionsServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static PromotionsService providesPromotionsService(ApplicationModule applicationModule, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, Converter.Factory factory, SharedPreferences sharedPreferences, SplitsMapper splitsMapper, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        PromotionsService providesPromotionsService = applicationModule.providesPromotionsService(bodyInterceptor, okHttpClient, tokenInvalidator, factory, sharedPreferences, splitsMapper, appBundlesVisibilityManager);
        C10825c.m36718a(providesPromotionsService, "Cannot return null from a non-@Nullable @Provides method");
        return providesPromotionsService;
    }

    public PromotionsService get() {
        return providesPromotionsService(this.module, this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.tokenInvalidatorProvider.get(), this.converterFactoryProvider.get(), this.sharedPreferencesProvider.get(), this.splitsMapperProvider.get(), this.appBundlesVisibilityManagerProvider.get());
    }
}
