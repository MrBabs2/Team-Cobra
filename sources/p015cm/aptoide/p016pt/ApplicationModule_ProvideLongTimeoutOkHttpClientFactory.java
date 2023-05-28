package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideLongTimeoutOkHttpClientFactory */
public final class ApplicationModule_ProvideLongTimeoutOkHttpClientFactory implements C10824b<OkHttpClient> {
    private final ApplicationModule module;
    private final Provider<Interceptor> retrofitLogInterceptorProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<Interceptor> userAgentInterceptorProvider;

    public ApplicationModule_ProvideLongTimeoutOkHttpClientFactory(ApplicationModule applicationModule, Provider<Interceptor> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        this.module = applicationModule;
        this.userAgentInterceptorProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.retrofitLogInterceptorProvider = provider3;
    }

    public static ApplicationModule_ProvideLongTimeoutOkHttpClientFactory create(ApplicationModule applicationModule, Provider<Interceptor> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        return new ApplicationModule_ProvideLongTimeoutOkHttpClientFactory(applicationModule, provider, provider2, provider3);
    }

    public static OkHttpClient provideLongTimeoutOkHttpClient(ApplicationModule applicationModule, Interceptor interceptor, SharedPreferences sharedPreferences, Interceptor interceptor2) {
        OkHttpClient provideLongTimeoutOkHttpClient = applicationModule.provideLongTimeoutOkHttpClient(interceptor, sharedPreferences, interceptor2);
        C10825c.m36718a(provideLongTimeoutOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideLongTimeoutOkHttpClient;
    }

    public OkHttpClient get() {
        return provideLongTimeoutOkHttpClient(this.module, this.userAgentInterceptorProvider.get(), this.sharedPreferencesProvider.get(), this.retrofitLogInterceptorProvider.get());
    }
}
