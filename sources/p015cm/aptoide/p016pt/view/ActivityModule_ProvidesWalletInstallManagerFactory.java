package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p015cm.aptoide.p016pt.wallet.WalletInstallAnalytics;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesWalletInstallManagerFactory */
public final class ActivityModule_ProvidesWalletInstallManagerFactory implements C10824b<WalletInstallManager> {
    private final Provider<AppInstallerStatusReceiver> appInstallerStatusReceiverProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final ActivityModule module;
    private final Provider<WalletAppProvider> walletAppProvider;
    private final Provider<WalletInstallAnalytics> walletInstallAnalyticsProvider;

    public ActivityModule_ProvidesWalletInstallManagerFactory(ActivityModule activityModule, Provider<InstallManager> provider, Provider<DownloadFactory> provider2, Provider<DownloadStateParser> provider3, Provider<MoPubAdsManager> provider4, Provider<WalletInstallAnalytics> provider5, Provider<AptoideInstalledAppsRepository> provider6, Provider<WalletAppProvider> provider7, Provider<AppInstallerStatusReceiver> provider8, Provider<DynamicSplitsManager> provider9) {
        this.module = activityModule;
        this.installManagerProvider = provider;
        this.downloadFactoryProvider = provider2;
        this.downloadStateParserProvider = provider3;
        this.moPubAdsManagerProvider = provider4;
        this.walletInstallAnalyticsProvider = provider5;
        this.aptoideInstalledAppsRepositoryProvider = provider6;
        this.walletAppProvider = provider7;
        this.appInstallerStatusReceiverProvider = provider8;
        this.dynamicSplitsManagerProvider = provider9;
    }

    public static ActivityModule_ProvidesWalletInstallManagerFactory create(ActivityModule activityModule, Provider<InstallManager> provider, Provider<DownloadFactory> provider2, Provider<DownloadStateParser> provider3, Provider<MoPubAdsManager> provider4, Provider<WalletInstallAnalytics> provider5, Provider<AptoideInstalledAppsRepository> provider6, Provider<WalletAppProvider> provider7, Provider<AppInstallerStatusReceiver> provider8, Provider<DynamicSplitsManager> provider9) {
        return new ActivityModule_ProvidesWalletInstallManagerFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    public static WalletInstallManager providesWalletInstallManager(ActivityModule activityModule, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, MoPubAdsManager moPubAdsManager, WalletInstallAnalytics walletInstallAnalytics, AptoideInstalledAppsRepository aptoideInstalledAppsRepository, WalletAppProvider walletAppProvider2, AppInstallerStatusReceiver appInstallerStatusReceiver, DynamicSplitsManager dynamicSplitsManager) {
        WalletInstallManager providesWalletInstallManager = activityModule.providesWalletInstallManager(installManager, downloadFactory, downloadStateParser, moPubAdsManager, walletInstallAnalytics, aptoideInstalledAppsRepository, walletAppProvider2, appInstallerStatusReceiver, dynamicSplitsManager);
        C10825c.m36718a(providesWalletInstallManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletInstallManager;
    }

    public WalletInstallManager get() {
        return providesWalletInstallManager(this.module, this.installManagerProvider.get(), this.downloadFactoryProvider.get(), this.downloadStateParserProvider.get(), this.moPubAdsManagerProvider.get(), this.walletInstallAnalyticsProvider.get(), this.aptoideInstalledAppsRepositoryProvider.get(), this.walletAppProvider.get(), this.appInstallerStatusReceiverProvider.get(), this.dynamicSplitsManagerProvider.get());
    }
}
