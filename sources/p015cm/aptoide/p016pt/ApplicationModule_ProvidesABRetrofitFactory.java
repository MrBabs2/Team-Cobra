package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABRetrofitFactory */
public final class ApplicationModule_ProvidesABRetrofitFactory implements C10824b<Retrofit> {
    private final Provider<String> baseHostProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesABRetrofitFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        this.module = applicationModule;
        this.baseHostProvider = provider;
        this.httpClientProvider = provider2;
        this.converterFactoryProvider = provider3;
        this.rxCallAdapterFactoryProvider = provider4;
    }

    public static ApplicationModule_ProvidesABRetrofitFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        return new ApplicationModule_ProvidesABRetrofitFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Retrofit providesABRetrofit(ApplicationModule applicationModule, String str, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit providesABRetrofit = applicationModule.providesABRetrofit(str, okHttpClient, factory, factory2);
        C10825c.m36718a(providesABRetrofit, "Cannot return null from a non-@Nullable @Provides method");
        return providesABRetrofit;
    }

    public Retrofit get() {
        return providesABRetrofit(this.module, this.baseHostProvider.get(), this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get());
    }
}
