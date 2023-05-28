package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.updates.UpdateMapper;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdateRepositoryFactory */
public final class ApplicationModule_ProvidesUpdateRepositoryFactory implements C10824b<UpdateRepository> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorPoolV7Provider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;
    private final Provider<UpdateMapper> updateMapperProvider;
    private final Provider<UpdatePersistence> updatePersistenceProvider;

    public ApplicationModule_ProvidesUpdateRepositoryFactory(ApplicationModule applicationModule, Provider<UpdatePersistence> provider, Provider<RoomStoreRepository> provider2, Provider<IdsRepository> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<OkHttpClient> provider5, Provider<Converter.Factory> provider6, Provider<TokenInvalidator> provider7, Provider<SharedPreferences> provider8, Provider<AppBundlesVisibilityManager> provider9, Provider<UpdateMapper> provider10, Provider<AptoideInstalledAppsRepository> provider11) {
        this.module = applicationModule;
        this.updatePersistenceProvider = provider;
        this.storeRepositoryProvider = provider2;
        this.idsRepositoryProvider = provider3;
        this.bodyInterceptorPoolV7Provider = provider4;
        this.okHttpClientProvider = provider5;
        this.converterFactoryProvider = provider6;
        this.tokenInvalidatorProvider = provider7;
        this.sharedPreferencesProvider = provider8;
        this.appBundlesVisibilityManagerProvider = provider9;
        this.updateMapperProvider = provider10;
        this.aptoideInstalledAppsRepositoryProvider = provider11;
    }

    public static ApplicationModule_ProvidesUpdateRepositoryFactory create(ApplicationModule applicationModule, Provider<UpdatePersistence> provider, Provider<RoomStoreRepository> provider2, Provider<IdsRepository> provider3, Provider<BodyInterceptor<BaseBody>> provider4, Provider<OkHttpClient> provider5, Provider<Converter.Factory> provider6, Provider<TokenInvalidator> provider7, Provider<SharedPreferences> provider8, Provider<AppBundlesVisibilityManager> provider9, Provider<UpdateMapper> provider10, Provider<AptoideInstalledAppsRepository> provider11) {
        return new ApplicationModule_ProvidesUpdateRepositoryFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static UpdateRepository providesUpdateRepository(ApplicationModule applicationModule, UpdatePersistence updatePersistence, RoomStoreRepository roomStoreRepository, IdsRepository idsRepository, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager, UpdateMapper updateMapper, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        UpdateRepository providesUpdateRepository = applicationModule.providesUpdateRepository(updatePersistence, roomStoreRepository, idsRepository, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager, updateMapper, aptoideInstalledAppsRepository);
        C10825c.m36718a(providesUpdateRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdateRepository;
    }

    public UpdateRepository get() {
        return providesUpdateRepository(this.module, this.updatePersistenceProvider.get(), this.storeRepositoryProvider.get(), this.idsRepositoryProvider.get(), this.bodyInterceptorPoolV7Provider.get(), this.okHttpClientProvider.get(), this.converterFactoryProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.appBundlesVisibilityManagerProvider.get(), this.updateMapperProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get());
    }
}
