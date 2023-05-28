package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAdsRepositoryFactory */
public final class ApplicationModule_ProvideAdsRepositoryFactory implements C10824b<AdsRepository> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AdsApplicationVersionCodeProvider> adsApplicationVersionCodeProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<OemidProvider> oemidProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<QManager> qManagerProvider;

    public ApplicationModule_ProvideAdsRepositoryFactory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AptoideAccountManager> provider2, Provider<OkHttpClient> provider3, Provider<QManager> provider4, Provider<SharedPreferences> provider5, Provider<AdsApplicationVersionCodeProvider> provider6, Provider<ConnectivityManager> provider7, Provider<OemidProvider> provider8) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.accountManagerProvider = provider2;
        this.okHttpClientProvider = provider3;
        this.qManagerProvider = provider4;
        this.defaultSharedPreferencesProvider = provider5;
        this.adsApplicationVersionCodeProvider = provider6;
        this.connectivityManagerProvider = provider7;
        this.oemidProvider = provider8;
    }

    public static ApplicationModule_ProvideAdsRepositoryFactory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AptoideAccountManager> provider2, Provider<OkHttpClient> provider3, Provider<QManager> provider4, Provider<SharedPreferences> provider5, Provider<AdsApplicationVersionCodeProvider> provider6, Provider<ConnectivityManager> provider7, Provider<OemidProvider> provider8) {
        return new ApplicationModule_ProvideAdsRepositoryFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static AdsRepository provideAdsRepository(ApplicationModule applicationModule, IdsRepository idsRepository, AptoideAccountManager aptoideAccountManager, OkHttpClient okHttpClient, QManager qManager, SharedPreferences sharedPreferences, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider2, ConnectivityManager connectivityManager, OemidProvider oemidProvider2) {
        AdsRepository provideAdsRepository = applicationModule.provideAdsRepository(idsRepository, aptoideAccountManager, okHttpClient, qManager, sharedPreferences, adsApplicationVersionCodeProvider2, connectivityManager, oemidProvider2);
        C10825c.m36718a(provideAdsRepository, "Cannot return null from a non-@Nullable @Provides method");
        return provideAdsRepository;
    }

    public AdsRepository get() {
        return provideAdsRepository(this.module, this.idsRepositoryProvider.get(), this.accountManagerProvider.get(), this.okHttpClientProvider.get(), this.qManagerProvider.get(), this.defaultSharedPreferencesProvider.get(), this.adsApplicationVersionCodeProvider.get(), this.connectivityManagerProvider.get(), this.oemidProvider.get());
    }
}
