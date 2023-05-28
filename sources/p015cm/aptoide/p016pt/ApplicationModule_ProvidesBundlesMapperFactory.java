package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferCardManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p015cm.aptoide.p016pt.home.bundles.BundlesResponseMapper;
import p015cm.aptoide.p016pt.install.InstallManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBundlesMapperFactory */
public final class ApplicationModule_ProvidesBundlesMapperFactory implements C10824b<BundlesResponseMapper> {
    private final Provider<AppComingSoonRegistrationManager> appComingSoonRegistrationManagerProvider;
    private final Provider<BlacklistManager> blacklistManagerProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;
    private final Provider<WalletAdsOfferCardManager> walletAdsOfferCardManagerProvider;

    public ApplicationModule_ProvidesBundlesMapperFactory(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<WalletAdsOfferCardManager> provider2, Provider<BlacklistManager> provider3, Provider<DownloadStateParser> provider4, Provider<AppComingSoonRegistrationManager> provider5) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
        this.walletAdsOfferCardManagerProvider = provider2;
        this.blacklistManagerProvider = provider3;
        this.downloadStateParserProvider = provider4;
        this.appComingSoonRegistrationManagerProvider = provider5;
    }

    public static ApplicationModule_ProvidesBundlesMapperFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider, Provider<WalletAdsOfferCardManager> provider2, Provider<BlacklistManager> provider3, Provider<DownloadStateParser> provider4, Provider<AppComingSoonRegistrationManager> provider5) {
        return new ApplicationModule_ProvidesBundlesMapperFactory(applicationModule, provider, provider2, provider3, provider4, provider5);
    }

    public static BundlesResponseMapper providesBundlesMapper(ApplicationModule applicationModule, InstallManager installManager, WalletAdsOfferCardManager walletAdsOfferCardManager, BlacklistManager blacklistManager, DownloadStateParser downloadStateParser, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        BundlesResponseMapper providesBundlesMapper = applicationModule.providesBundlesMapper(installManager, walletAdsOfferCardManager, blacklistManager, downloadStateParser, appComingSoonRegistrationManager);
        C10825c.m36718a(providesBundlesMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesBundlesMapper;
    }

    public BundlesResponseMapper get() {
        return providesBundlesMapper(this.module, this.installManagerProvider.get(), this.walletAdsOfferCardManagerProvider.get(), this.blacklistManagerProvider.get(), this.downloadStateParserProvider.get(), this.appComingSoonRegistrationManagerProvider.get());
    }
}
