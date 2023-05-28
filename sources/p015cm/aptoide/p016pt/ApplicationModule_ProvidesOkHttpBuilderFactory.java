package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.cache.L2Cache;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesOkHttpBuilderFactory */
public final class ApplicationModule_ProvidesOkHttpBuilderFactory implements C10824b<OkHttpClient.Builder> {
    private final Provider<L2Cache> httpClientCacheProvider;
    private final ApplicationModule module;
    private final Provider<Interceptor> retrofitLogInterceptorProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesOkHttpBuilderFactory(ApplicationModule applicationModule, Provider<L2Cache> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        this.module = applicationModule;
        this.httpClientCacheProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.retrofitLogInterceptorProvider = provider3;
    }

    public static ApplicationModule_ProvidesOkHttpBuilderFactory create(ApplicationModule applicationModule, Provider<L2Cache> provider, Provider<SharedPreferences> provider2, Provider<Interceptor> provider3) {
        return new ApplicationModule_ProvidesOkHttpBuilderFactory(applicationModule, provider, provider2, provider3);
    }

    public static OkHttpClient.Builder providesOkHttpBuilder(ApplicationModule applicationModule, L2Cache l2Cache, SharedPreferences sharedPreferences, Interceptor interceptor) {
        OkHttpClient.Builder providesOkHttpBuilder = applicationModule.providesOkHttpBuilder(l2Cache, sharedPreferences, interceptor);
        C10825c.m36718a(providesOkHttpBuilder, "Cannot return null from a non-@Nullable @Provides method");
        return providesOkHttpBuilder;
    }

    public OkHttpClient.Builder get() {
        return providesOkHttpBuilder(this.module, this.httpClientCacheProvider.get(), this.sharedPreferencesProvider.get(), this.retrofitLogInterceptorProvider.get());
    }
}
