package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.install.PackageRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesPackageRepositoryFactory */
public final class ApplicationModule_ProvidesPackageRepositoryFactory implements C10824b<PackageRepository> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPackageRepositoryFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesPackageRepositoryFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesPackageRepositoryFactory(applicationModule);
    }

    public static PackageRepository providesPackageRepository(ApplicationModule applicationModule) {
        PackageRepository providesPackageRepository = applicationModule.providesPackageRepository();
        C10825c.m36718a(providesPackageRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesPackageRepository;
    }

    public PackageRepository get() {
        return providesPackageRepository(this.module);
    }
}
