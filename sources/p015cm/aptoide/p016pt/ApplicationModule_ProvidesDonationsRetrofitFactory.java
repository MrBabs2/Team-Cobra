package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDonationsRetrofitFactory */
public final class ApplicationModule_ProvidesDonationsRetrofitFactory implements C10824b<Retrofit> {
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;

    public ApplicationModule_ProvidesDonationsRetrofitFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.converterFactoryProvider = provider2;
        this.rxCallAdapterFactoryProvider = provider3;
    }

    public static ApplicationModule_ProvidesDonationsRetrofitFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3) {
        return new ApplicationModule_ProvidesDonationsRetrofitFactory(applicationModule, provider, provider2, provider3);
    }

    public static Retrofit providesDonationsRetrofit(ApplicationModule applicationModule, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2) {
        Retrofit providesDonationsRetrofit = applicationModule.providesDonationsRetrofit(okHttpClient, factory, factory2);
        C10825c.m36718a(providesDonationsRetrofit, "Cannot return null from a non-@Nullable @Provides method");
        return providesDonationsRetrofit;
    }

    public Retrofit get() {
        return providesDonationsRetrofit(this.module, this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get());
    }
}
