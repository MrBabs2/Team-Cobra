package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.NetworkOperatorManager;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBodyInterceptorV3Factory */
public final class ApplicationModule_ProvidesBodyInterceptorV3Factory implements C10824b<BodyInterceptor<BaseBody>> {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<String> aptoidePackageProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<NetworkOperatorManager> networkOperatorManagerProvider;
    private final Provider<QManager> qManagerProvider;

    public ApplicationModule_ProvidesBodyInterceptorV3Factory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<QManager> provider2, Provider<SharedPreferences> provider3, Provider<NetworkOperatorManager> provider4, Provider<AuthenticationPersistence> provider5, Provider<String> provider6, Provider<AptoideMd5Manager> provider7) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.qManagerProvider = provider2;
        this.defaultSharedPreferencesProvider = provider3;
        this.networkOperatorManagerProvider = provider4;
        this.authenticationPersistenceProvider = provider5;
        this.aptoidePackageProvider = provider6;
        this.aptoideMd5ManagerProvider = provider7;
    }

    public static ApplicationModule_ProvidesBodyInterceptorV3Factory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<QManager> provider2, Provider<SharedPreferences> provider3, Provider<NetworkOperatorManager> provider4, Provider<AuthenticationPersistence> provider5, Provider<String> provider6, Provider<AptoideMd5Manager> provider7) {
        return new ApplicationModule_ProvidesBodyInterceptorV3Factory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static BodyInterceptor<BaseBody> providesBodyInterceptorV3(ApplicationModule applicationModule, IdsRepository idsRepository, QManager qManager, SharedPreferences sharedPreferences, NetworkOperatorManager networkOperatorManager, AuthenticationPersistence authenticationPersistence, String str, AptoideMd5Manager aptoideMd5Manager) {
        BodyInterceptor<BaseBody> providesBodyInterceptorV3 = applicationModule.providesBodyInterceptorV3(idsRepository, qManager, sharedPreferences, networkOperatorManager, authenticationPersistence, str, aptoideMd5Manager);
        C10825c.m36718a(providesBodyInterceptorV3, "Cannot return null from a non-@Nullable @Provides method");
        return providesBodyInterceptorV3;
    }

    public BodyInterceptor<BaseBody> get() {
        return providesBodyInterceptorV3(this.module, this.idsRepositoryProvider.get(), this.qManagerProvider.get(), this.defaultSharedPreferencesProvider.get(), this.networkOperatorManagerProvider.get(), this.authenticationPersistenceProvider.get(), this.aptoidePackageProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
