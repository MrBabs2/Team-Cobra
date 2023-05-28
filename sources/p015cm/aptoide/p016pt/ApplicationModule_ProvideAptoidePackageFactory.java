package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideAptoidePackageFactory */
public final class ApplicationModule_ProvideAptoidePackageFactory implements C10824b<String> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideAptoidePackageFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideAptoidePackageFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideAptoidePackageFactory(applicationModule);
    }

    public static String provideAptoidePackage(ApplicationModule applicationModule) {
        String provideAptoidePackage = applicationModule.provideAptoidePackage();
        C10825c.m36718a(provideAptoidePackage, "Cannot return null from a non-@Nullable @Provides method");
        return provideAptoidePackage;
    }

    public String get() {
        return provideAptoidePackage(this.module);
    }
}
