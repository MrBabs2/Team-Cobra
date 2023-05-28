package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideTokenInvalidatorFactory */
public final class ApplicationModule_ProvideTokenInvalidatorFactory implements C10824b<TokenInvalidator> {
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final Provider<String> extraIdProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideTokenInvalidatorFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<SharedPreferences> provider2, Provider<AuthenticationPersistence> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<String> provider5) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.authenticationPersistenceProvider = provider3;
        this.bodyInterceptorProvider = provider4;
        this.extraIdProvider = provider5;
    }

    public static ApplicationModule_ProvideTokenInvalidatorFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<SharedPreferences> provider2, Provider<AuthenticationPersistence> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<String> provider5) {
        return new ApplicationModule_ProvideTokenInvalidatorFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static TokenInvalidator provideTokenInvalidator(ApplicationModule applicationModule, OkHttpClient okHttpClient, SharedPreferences sharedPreferences, AuthenticationPersistence authenticationPersistence, BodyInterceptor<BaseBody> bodyInterceptor, String str) {
        TokenInvalidator provideTokenInvalidator = applicationModule.provideTokenInvalidator(okHttpClient, sharedPreferences, authenticationPersistence, bodyInterceptor, str);
        C10825c.m36718a(provideTokenInvalidator, "Cannot return null from a non-@Nullable @Provides method");
        return provideTokenInvalidator;
    }

    public TokenInvalidator get() {
        return provideTokenInvalidator(this.module, this.httpClientProvider.get(), this.sharedPreferencesProvider.get(), this.authenticationPersistenceProvider.get(), this.bodyInterceptorProvider.get(), this.extraIdProvider.get());
    }
}
