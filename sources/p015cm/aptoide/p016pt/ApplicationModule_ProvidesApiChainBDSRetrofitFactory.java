package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesApiChainBDSRetrofitFactory */
public final class ApplicationModule_ProvidesApiChainBDSRetrofitFactory implements C10824b<Retrofit> {
    private final Provider<String> baseHostProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesApiChainBDSRetrofitFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<String> provider4) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.converterFactoryProvider = provider2;
        this.rxCallAdapterFactoryProvider = provider3;
        this.baseHostProvider = provider4;
    }

    public static ApplicationModule_ProvidesApiChainBDSRetrofitFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<String> provider4) {
        return new ApplicationModule_ProvidesApiChainBDSRetrofitFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Retrofit providesApiChainBDSRetrofit(ApplicationModule applicationModule, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, String str) {
        Retrofit providesApiChainBDSRetrofit = applicationModule.providesApiChainBDSRetrofit(okHttpClient, factory, factory2, str);
        C10825c.m36718a(providesApiChainBDSRetrofit, "Cannot return null from a non-@Nullable @Provides method");
        return providesApiChainBDSRetrofit;
    }

    public Retrofit get() {
        return providesApiChainBDSRetrofit(this.module, this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get(), this.baseHostProvider.get());
    }
}
