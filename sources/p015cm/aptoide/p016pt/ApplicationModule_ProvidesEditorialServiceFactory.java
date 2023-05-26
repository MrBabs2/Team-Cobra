package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.editorial.EditorialService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesEditorialServiceFactory */
public final class ApplicationModule_ProvidesEditorialServiceFactory implements C10824b<EditorialService> {
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<SplitsMapper> splitsMapperProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesEditorialServiceFactory(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6) {
        this.module = applicationModule;
        this.bodyInterceptorPoolV7Provider = provider;
        this.okHttpClientProvider = provider2;
        this.converterFactoryProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.splitsMapperProvider = provider6;
    }

    public static ApplicationModule_ProvidesEditorialServiceFactory create(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<SplitsMapper> provider6) {
        return new ApplicationModule_ProvidesEditorialServiceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static EditorialService providesEditorialService(ApplicationModule applicationModule, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, SplitsMapper splitsMapper) {
        EditorialService providesEditorialService = applicationModule.providesEditorialService(bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, splitsMapper);
        C10825c.m36718a(providesEditorialService, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialService;
    }

    public EditorialService get() {
        return providesEditorialService(this.module, this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.converterFactoryProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.splitsMapperProvider.get());
    }
}
