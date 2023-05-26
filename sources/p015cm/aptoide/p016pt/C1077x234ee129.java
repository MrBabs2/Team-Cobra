package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.AdsApplicationVersionCodeProvider;
import p015cm.aptoide.p016pt.install.PackageRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAdsApplicationVersionCodeProviderFactory */
public final class C1077x234ee129 implements C10824b<AdsApplicationVersionCodeProvider> {
    private final ApplicationModule module;
    private final Provider<PackageRepository> packageRepositoryProvider;

    public C1077x234ee129(ApplicationModule applicationModule, Provider<PackageRepository> provider) {
        this.module = applicationModule;
        this.packageRepositoryProvider = provider;
    }

    public static C1077x234ee129 create(ApplicationModule applicationModule, Provider<PackageRepository> provider) {
        return new C1077x234ee129(applicationModule, provider);
    }

    public static AdsApplicationVersionCodeProvider providesAdsApplicationVersionCodeProvider(ApplicationModule applicationModule, PackageRepository packageRepository) {
        AdsApplicationVersionCodeProvider providesAdsApplicationVersionCodeProvider = applicationModule.providesAdsApplicationVersionCodeProvider(packageRepository);
        C10825c.m36718a(providesAdsApplicationVersionCodeProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesAdsApplicationVersionCodeProvider;
    }

    public AdsApplicationVersionCodeProvider get() {
        return providesAdsApplicationVersionCodeProvider(this.module, this.packageRepositoryProvider.get());
    }
}
