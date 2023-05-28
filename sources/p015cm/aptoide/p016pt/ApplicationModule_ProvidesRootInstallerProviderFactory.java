package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.install.RootInstallerProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRootInstallerProviderFactory */
public final class ApplicationModule_ProvidesRootInstallerProviderFactory implements C10824b<RootInstallerProvider> {
    private final Provider<InstallerAnalytics> installerAnalyticsProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRootInstallerProviderFactory(ApplicationModule applicationModule, Provider<InstallerAnalytics> provider) {
        this.module = applicationModule;
        this.installerAnalyticsProvider = provider;
    }

    public static ApplicationModule_ProvidesRootInstallerProviderFactory create(ApplicationModule applicationModule, Provider<InstallerAnalytics> provider) {
        return new ApplicationModule_ProvidesRootInstallerProviderFactory(applicationModule, provider);
    }

    public static RootInstallerProvider providesRootInstallerProvider(ApplicationModule applicationModule, InstallerAnalytics installerAnalytics) {
        RootInstallerProvider providesRootInstallerProvider = applicationModule.providesRootInstallerProvider(installerAnalytics);
        C10825c.m36718a(providesRootInstallerProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesRootInstallerProvider;
    }

    public RootInstallerProvider get() {
        return providesRootInstallerProvider(this.module, this.installerAnalyticsProvider.get());
    }
}
