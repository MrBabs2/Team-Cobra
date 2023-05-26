package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideNoAuthenticationBodyInterceptorV3Factory */
public final class C1076xcbc5ac1 implements C10824b<BodyInterceptor<BaseBody>> {
    private final Provider<AptoideMd5Manager> aptoideMd5ManagerProvider;
    private final Provider<String> aptoidePackageProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;

    public C1076xcbc5ac1(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AptoideMd5Manager> provider3) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.aptoidePackageProvider = provider2;
        this.aptoideMd5ManagerProvider = provider3;
    }

    public static C1076xcbc5ac1 create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<String> provider2, Provider<AptoideMd5Manager> provider3) {
        return new C1076xcbc5ac1(applicationModule, provider, provider2, provider3);
    }

    public static BodyInterceptor<BaseBody> provideNoAuthenticationBodyInterceptorV3(ApplicationModule applicationModule, IdsRepository idsRepository, String str, AptoideMd5Manager aptoideMd5Manager) {
        BodyInterceptor<BaseBody> provideNoAuthenticationBodyInterceptorV3 = applicationModule.provideNoAuthenticationBodyInterceptorV3(idsRepository, str, aptoideMd5Manager);
        C10825c.m36718a(provideNoAuthenticationBodyInterceptorV3, "Cannot return null from a non-@Nullable @Provides method");
        return provideNoAuthenticationBodyInterceptorV3;
    }

    public BodyInterceptor<BaseBody> get() {
        return provideNoAuthenticationBodyInterceptorV3(this.module, this.idsRepositoryProvider.get(), this.aptoidePackageProvider.get(), this.aptoideMd5ManagerProvider.get());
    }
}
