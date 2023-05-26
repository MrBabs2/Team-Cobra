package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.abtesting.ABTestServiceProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesABTestServiceProviderFactory */
public final class ApplicationModule_ProvidesABTestServiceProviderFactory implements C10824b<ABTestServiceProvider> {
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<CallAdapter.Factory> rxCallAdapterFactoryProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesABTestServiceProviderFactory(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<SharedPreferences> provider4) {
        this.module = applicationModule;
        this.httpClientProvider = provider;
        this.converterFactoryProvider = provider2;
        this.rxCallAdapterFactoryProvider = provider3;
        this.sharedPreferencesProvider = provider4;
    }

    public static ApplicationModule_ProvidesABTestServiceProviderFactory create(ApplicationModule applicationModule, Provider<OkHttpClient> provider, Provider<Converter.Factory> provider2, Provider<CallAdapter.Factory> provider3, Provider<SharedPreferences> provider4) {
        return new ApplicationModule_ProvidesABTestServiceProviderFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static ABTestServiceProvider providesABTestServiceProvider(ApplicationModule applicationModule, OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, SharedPreferences sharedPreferences) {
        ABTestServiceProvider providesABTestServiceProvider = applicationModule.providesABTestServiceProvider(okHttpClient, factory, factory2, sharedPreferences);
        C10825c.m36718a(providesABTestServiceProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesABTestServiceProvider;
    }

    public ABTestServiceProvider get() {
        return providesABTestServiceProvider(this.module, this.httpClientProvider.get(), this.converterFactoryProvider.get(), this.rxCallAdapterFactoryProvider.get(), this.sharedPreferencesProvider.get());
    }
}
