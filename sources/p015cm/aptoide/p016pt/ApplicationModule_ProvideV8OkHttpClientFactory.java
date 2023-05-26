package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideV8OkHttpClientFactory */
public final class ApplicationModule_ProvideV8OkHttpClientFactory implements C10824b<OkHttpClient> {
    private final ApplicationModule module;
    private final Provider<OkHttpClient.Builder> okHttpClientBuilderProvider;
    private final Provider<Interceptor> userAgentInterceptorV8Provider;

    public ApplicationModule_ProvideV8OkHttpClientFactory(ApplicationModule applicationModule, Provider<OkHttpClient.Builder> provider, Provider<Interceptor> provider2) {
        this.module = applicationModule;
        this.okHttpClientBuilderProvider = provider;
        this.userAgentInterceptorV8Provider = provider2;
    }

    public static ApplicationModule_ProvideV8OkHttpClientFactory create(ApplicationModule applicationModule, Provider<OkHttpClient.Builder> provider, Provider<Interceptor> provider2) {
        return new ApplicationModule_ProvideV8OkHttpClientFactory(applicationModule, provider, provider2);
    }

    public static OkHttpClient provideV8OkHttpClient(ApplicationModule applicationModule, OkHttpClient.Builder builder, Interceptor interceptor) {
        OkHttpClient provideV8OkHttpClient = applicationModule.provideV8OkHttpClient(builder, interceptor);
        C10825c.m36718a(provideV8OkHttpClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideV8OkHttpClient;
    }

    public OkHttpClient get() {
        return provideV8OkHttpClient(this.module, this.okHttpClientBuilderProvider.get(), this.userAgentInterceptorV8Provider.get());
    }
}
