package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideUserAgentInterceptorV8Factory */
public final class ApplicationModule_ProvideUserAgentInterceptorV8Factory implements C10824b<Interceptor> {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<String> aptoidePackageProvider;
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideUserAgentInterceptorV8Factory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AuthenticationPersistence> provider3, Provider<AptoideMd5Manager> provider4) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.aptoidePackageProvider = provider2;
        this.authenticationPersistenceProvider = provider3;
        this.aptoideMd5ManagerProvider = provider4;
    }

    public static ApplicationModule_ProvideUserAgentInterceptorV8Factory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AuthenticationPersistence> provider3, Provider<AptoideMd5Manager> provider4) {
        return new ApplicationModule_ProvideUserAgentInterceptorV8Factory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static Interceptor provideUserAgentInterceptorV8(ApplicationModule applicationModule, IdsRepository idsRepository, String str, AuthenticationPersistence authenticationPersistence, AptoideMd5Manager aptoideMd5Manager) {
        Interceptor provideUserAgentInterceptorV8 = applicationModule.provideUserAgentInterceptorV8(idsRepository, str, authenticationPersistence, aptoideMd5Manager);
        C10825c.m36718a(provideUserAgentInterceptorV8, "Cannot return null from a non-@Nullable @Provides method");
        return provideUserAgentInterceptorV8;
    }

    public Interceptor get() {
        return provideUserAgentInterceptorV8(this.module, this.idsRepositoryProvider.get(), this.aptoidePackageProvider.get(), this.authenticationPersistenceProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
