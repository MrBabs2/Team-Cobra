package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideOkHttpClientFactory */
public final class ApplicationModule_ProvideOkHttpClientFactory implements C10824b<OkHttpClient> {
    private final ApplicationModule module;
    private final Provider<OkHttpClient.Builder> okHttpClientBuilderProvider;
    private final Provider<Interceptor> userAgentInterceptorProvider;

    public ApplicationModule_ProvideOkHttpClientFactory(ApplicationModule applicationModule, Provider<OkHttpClient.Builder> provider, Provider<Interceptor> provider2) {
        this.module = applicationModule;
        this.okHttpClientBuilderProvider = provider;
        this.userAgentInterceptorProvider = provider2;
    }

    public static ApplicationModule_ProvideOkHttpClientFactory create(ApplicationModule applicationModule, Provider<OkHttpClient.Builder> provider, Provider<Interceptor> provider2) {
        return new ApplicationModule_ProvideOkHttpClientFactory(applicationModule, provider, provider2);
    }

    public static OkHttpClient provideOkHttpClient(ApplicationModule applicationModule, OkHttpClient.Builder builder, Interceptor interceptor) {
        OkHttpClient provideOkHttpClient = applicationModule.provideOkHttpClient(builder, interceptor);
        C10825c.m36718a(provideOkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideOkHttpClient;
    }

    public OkHttpClient get() {
        return provideOkHttpClient(this.module, this.okHttpClientBuilderProvider.get(), this.userAgentInterceptorProvider.get());
    }
}
