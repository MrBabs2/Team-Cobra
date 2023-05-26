package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesWalletAppProviderFactory */
public final class ApplicationModule_ProvidesWalletAppProviderFactory implements C10824b<WalletAppProvider> {
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesWalletAppProviderFactory(ApplicationModule applicationModule, Provider<AppCenter> provider, Provider<AptoideInstalledAppsRepository> provider2, Provider<InstallManager> provider3, Provider<DownloadStateParser> provider4) {
        this.module = applicationModule;
        this.appCenterProvider = provider;
        this.aptoideInstalledAppsRepositoryProvider = provider2;
        this.installManagerProvider = provider3;
        this.downloadStateParserProvider = provider4;
    }

    public static ApplicationModule_ProvidesWalletAppProviderFactory create(ApplicationModule applicationModule, Provider<AppCenter> provider, Provider<AptoideInstalledAppsRepository> provider2, Provider<InstallManager> provider3, Provider<DownloadStateParser> provider4) {
        return new ApplicationModule_ProvidesWalletAppProviderFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static WalletAppProvider providesWalletAppProvider(ApplicationModule applicationModule, AppCenter appCenter, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, InstallManager installManager, DownloadStateParser downloadStateParser) {
        WalletAppProvider providesWalletAppProvider = applicationModule.providesWalletAppProvider(appCenter, aptoideInstalledAppsRepository, installManager, downloadStateParser);
        C10825c.m36718a(providesWalletAppProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletAppProvider;
    }

    public WalletAppProvider get() {
        return providesWalletAppProvider(this.module, this.appCenterProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.installManagerProvider.get(), this.downloadStateParserProvider.get());
    }
}
