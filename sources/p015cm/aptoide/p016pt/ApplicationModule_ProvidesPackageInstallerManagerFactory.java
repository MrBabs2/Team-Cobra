package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.install.PackageInstallerManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesPackageInstallerManagerFactory */
public final class ApplicationModule_ProvidesPackageInstallerManagerFactory implements C10824b<PackageInstallerManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesPackageInstallerManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesPackageInstallerManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesPackageInstallerManagerFactory(applicationModule);
    }

    public static PackageInstallerManager providesPackageInstallerManager(ApplicationModule applicationModule) {
        PackageInstallerManager providesPackageInstallerManager = applicationModule.providesPackageInstallerManager();
        C10825c.m36718a(providesPackageInstallerManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesPackageInstallerManager;
    }

    public PackageInstallerManager get() {
        return providesPackageInstallerManager(this.module);
    }
}
