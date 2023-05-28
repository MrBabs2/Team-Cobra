package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesV7SecondaryRetrofitFactory */
public final class ApplicationModule_ProvidesV7SecondaryRetrofitFactory implements C10824b<Retrofit> {
    private final Provider<String> baseHostProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesV7SecondaryRetrofitFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<String> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.baseHostProvider = provider2;
        this.converterFactoryProvider = provider3;
        this.rxCallAdapterFactoryProvider = provider4;
    }

    public static ApplicationModule_ProvidesV7SecondaryRetrofitFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<String> provider2, Provider<Converter.Factory> provider3, Provider<CallAdapter.Factory> provider4) {
        return new ApplicationModule_ProvidesV7SecondaryRetrofitFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Retrofit providesV7SecondaryRetrofit(ApplicationModule applicationModule, OkHttpClient okHttpClient, String str, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit providesV7SecondaryRetrofit = applicationModule.providesV7SecondaryRetrofit(okHttpClient, str, factory, factory2);
        C10825c.m36718a(providesV7SecondaryRetrofit, "Cannot return null from a non-@Nullable @Provides method");
        return providesV7SecondaryRetrofit;
    }

    public Retrofit get() {
        return providesV7SecondaryRetrofit(this.module, this.httpClientProvider.get(), this.baseHostProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get());
    }
}
