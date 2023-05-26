package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.Installer;
import p015cm.aptoide.p016pt.install.InstallerAnalytics;
import p015cm.aptoide.p016pt.install.RootInstallerProvider;
import p015cm.aptoide.p016pt.install.installer.InstallationProvider;
import p015cm.aptoide.p016pt.packageinstaller.AppInstaller;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideDefaultInstallerFactory */
public final class ApplicationModule_ProvideDefaultInstallerFactory implements C10824b<Installer> {
    private final Provider<AppInstaller> appInstallerProvider;
    private final Provider<AppInstallerStatusReceiver> appInstallerStatusReceiverProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<InstallationProvider> installationProvider;
    private final Provider<InstallerAnalytics> installerAnalyticsProvider;
    private final ApplicationModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<RootInstallerProvider> rootInstallerProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvideDefaultInstallerFactory(ApplicationModule applicationModule, Provider<InstallationProvider> provider, Provider<SharedPreferences> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<RootAvailabilityManager> provider4, Provider<InstallerAnalytics> provider5, Provider<AppInstaller> provider6, Provider<AppInstallerStatusReceiver> provider7, Provider<RootInstallerProvider> provider8) {
        this.module = applicationModule;
        this.installationProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.aptoideInstalledAppsRepositoryProvider = provider3;
        this.rootAvailabilityManagerProvider = provider4;
        this.installerAnalyticsProvider = provider5;
        this.appInstallerProvider = provider6;
        this.appInstallerStatusReceiverProvider = provider7;
        this.rootInstallerProvider = provider8;
    }

    public static ApplicationModule_ProvideDefaultInstallerFactory create(ApplicationModule applicationModule, Provider<InstallationProvider> provider, Provider<SharedPreferences> provider2, Provider<AptoideInstalledAppsRepository> provider3, Provider<RootAvailabilityManager> provider4, Provider<InstallerAnalytics> provider5, Provider<AppInstaller> provider6, Provider<AppInstallerStatusReceiver> provider7, Provider<RootInstallerProvider> provider8) {
        return new ApplicationModule_ProvideDefaultInstallerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static Installer provideDefaultInstaller(ApplicationModule applicationModule, InstallationProvider installationProvider2, SharedPreferences sharedPreferences, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, RootAvailabilityManager rootAvailabilityManager, InstallerAnalytics installerAnalytics, AppInstaller appInstaller, AppInstallerStatusReceiver appInstallerStatusReceiver, RootInstallerProvider rootInstallerProvider2) {
        Installer provideDefaultInstaller = applicationModule.provideDefaultInstaller(installationProvider2, sharedPreferences, aptoideInstalledAppsRepository, rootAvailabilityManager, installerAnalytics, appInstaller, appInstallerStatusReceiver, rootInstallerProvider2);
        C10825c.m36718a(provideDefaultInstaller, "Cannot return null from a non-@Nullable @Provides method");
        return provideDefaultInstaller;
    }

    public Installer get() {
        return provideDefaultInstaller(this.module, this.installationProvider.get(), this.sharedPreferencesProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.rootAvailabilityManagerProvider.get(), this.installerAnalyticsProvider.get(), this.appInstallerProvider.get(), this.appInstallerStatusReceiverProvider.get(), this.rootInstallerProvider.get());
    }
}
