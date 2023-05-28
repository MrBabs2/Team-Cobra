package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.view.WindowManager;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.home.bundles.BundleDataSource;
import p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRemoteBundleDataSourceFactory */
public final class ApplicationModule_ProvidesRemoteBundleDataSourceFactory implements C10824b<BundleDataSource> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<AdsApplicationVersionCodeProvider> adsApplicationVersionCodeProvider;
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final Provider<Converter.Factory> converterProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final Provider<BundlesResponseMapper> mapperProvider;
    private final ApplicationModule module;
    private final Provider<OemidProvider> oemidProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<PackageRepository> packageRepositoryProvider;
    private final Provider<QManager> qManagerProvider;
    private final Provider<Resources> resourcesProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;
    private final Provider<WindowManager> windowManagerProvider;

    public ApplicationModule_ProvidesRemoteBundleDataSourceFactory(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<BundlesResponseMapper> provider4, Provider<TokenInvalidator> provider5, Provider<SharedPreferences> provider6, Provider<AptoideAccountManager> provider7, Provider<PackageRepository> provider8, Provider<IdsRepository> provider9, Provider<QManager> provider10, Provider<Resources> provider11, Provider<WindowManager> provider12, Provider<ConnectivityManager> provider13, Provider<AdsApplicationVersionCodeProvider> provider14, Provider<OemidProvider> provider15, Provider<AppBundlesVisibilityManager> provider16, Provider<StoreCredentialsProvider> provider17, Provider<AppCoinsManager> provider18) {
        this.module = applicationModule;
        this.bodyInterceptorPoolV7Provider = provider;
        this.okHttpClientProvider = provider2;
        this.converterProvider = provider3;
        this.mapperProvider = provider4;
        this.tokenInvalidatorProvider = provider5;
        this.sharedPreferencesProvider = provider6;
        this.accountManagerProvider = provider7;
        this.packageRepositoryProvider = provider8;
        this.idsRepositoryProvider = provider9;
        this.qManagerProvider = provider10;
        this.resourcesProvider = provider11;
        this.windowManagerProvider = provider12;
        this.connectivityManagerProvider = provider13;
        this.adsApplicationVersionCodeProvider = provider14;
        this.oemidProvider = provider15;
        this.appBundlesVisibilityManagerProvider = provider16;
        this.storeCredentialsProvider = provider17;
        this.appCoinsManagerProvider = provider18;
    }

    public static ApplicationModule_ProvidesRemoteBundleDataSourceFactory create(ApplicationModule applicationModule, Provider<BodyInterceptor<BaseBody>> provider, Provider<OkHttpClient> provider2, Provider<Converter.Factory> provider3, Provider<BundlesResponseMapper> provider4, Provider<TokenInvalidator> provider5, Provider<SharedPreferences> provider6, Provider<AptoideAccountManager> provider7, Provider<PackageRepository> provider8, Provider<IdsRepository> provider9, Provider<QManager> provider10, Provider<Resources> provider11, Provider<WindowManager> provider12, Provider<ConnectivityManager> provider13, Provider<AdsApplicationVersionCodeProvider> provider14, Provider<OemidProvider> provider15, Provider<AppBundlesVisibilityManager> provider16, Provider<StoreCredentialsProvider> provider17, Provider<AppCoinsManager> provider18) {
        return new ApplicationModule_ProvidesRemoteBundleDataSourceFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18);
    }

    public static BundleDataSource providesRemoteBundleDataSource(ApplicationModule applicationModule, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, BundlesResponseMapper bundlesResponseMapper, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AptoideAccountManager aptoideAccountManager, PackageRepository packageRepository, IdsRepository idsRepository, QManager qManager, Resources resources, WindowManager windowManager, ConnectivityManager connectivityManager, AdsApplicationVersionCodeProvider adsApplicationVersionCodeProvider2, OemidProvider oemidProvider2, AppBundlesVisibilityManager appBundlesVisibilityManager, StoreCredentialsProvider storeCredentialsProvider2, AppCoinsManager appCoinsManager) {
        BundleDataSource providesRemoteBundleDataSource = applicationModule.providesRemoteBundleDataSource(bodyInterceptor, okHttpClient, factory, bundlesResponseMapper, tokenInvalidator, sharedPreferences, aptoideAccountManager, packageRepository, idsRepository, qManager, resources, windowManager, connectivityManager, adsApplicationVersionCodeProvider2, oemidProvider2, appBundlesVisibilityManager, storeCredentialsProvider2, appCoinsManager);
        C10825c.m36718a(providesRemoteBundleDataSource, "Cannot return null from a non-@Nullable @Provides method");
        return providesRemoteBundleDataSource;
    }

    public BundleDataSource get() {
        return providesRemoteBundleDataSource(this.module, this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.converterProvider.get(), this.mapperProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.accountManagerProvider.get(), this.packageRepositoryProvider.get(), this.idsRepositoryProvider.get(), this.qManagerProvider.get(), this.resourcesProvider.get(), this.windowManagerProvider.get(), this.connectivityManagerProvider.get(), this.adsApplicationVersionCodeProvider.get(), this.oemidProvider.get(), this.appBundlesVisibilityManagerProvider.get(), this.storeCredentialsProvider.get(), this.appCoinsManagerProvider.get());
    }
}
