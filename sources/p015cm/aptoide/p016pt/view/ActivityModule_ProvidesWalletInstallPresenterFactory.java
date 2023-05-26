package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.wallet.WalletInstallAnalytics;
import p015cm.aptoide.p016pt.wallet.WalletInstallConfiguration;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p015cm.aptoide.p016pt.wallet.WalletInstallNavigator;
import p015cm.aptoide.p016pt.wallet.WalletInstallPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesWalletInstallPresenterFactory */
public final class ActivityModule_ProvidesWalletInstallPresenterFactory implements C10824b<WalletInstallPresenter> {
    private final Provider<WalletInstallConfiguration> configurationProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final ActivityModule module;
    private final Provider<WalletInstallAnalytics> walletInstallAnalyticsProvider;
    private final Provider<WalletInstallManager> walletInstallManagerProvider;
    private final Provider<WalletInstallNavigator> walletInstallNavigatorProvider;

    public ActivityModule_ProvidesWalletInstallPresenterFactory(ActivityModule activityModule, Provider<WalletInstallConfiguration> provider, Provider<WalletInstallNavigator> provider2, Provider<WalletInstallManager> provider3, Provider<WalletInstallAnalytics> provider4, Provider<MoPubAdsManager> provider5) {
        this.module = activityModule;
        this.configurationProvider = provider;
        this.walletInstallNavigatorProvider = provider2;
        this.walletInstallManagerProvider = provider3;
        this.walletInstallAnalyticsProvider = provider4;
        this.moPubAdsManagerProvider = provider5;
    }

    public static ActivityModule_ProvidesWalletInstallPresenterFactory create(ActivityModule activityModule, Provider<WalletInstallConfiguration> provider, Provider<WalletInstallNavigator> provider2, Provider<WalletInstallManager> provider3, Provider<WalletInstallAnalytics> provider4, Provider<MoPubAdsManager> provider5) {
        return new ActivityModule_ProvidesWalletInstallPresenterFactory(activityModule, provider, provider2, provider3, provider4, provider5);
    }

    public static WalletInstallPresenter providesWalletInstallPresenter(ActivityModule activityModule, WalletInstallConfiguration walletInstallConfiguration, WalletInstallNavigator walletInstallNavigator, WalletInstallManager walletInstallManager, WalletInstallAnalytics walletInstallAnalytics, MoPubAdsManager moPubAdsManager) {
        WalletInstallPresenter providesWalletInstallPresenter = activityModule.providesWalletInstallPresenter(walletInstallConfiguration, walletInstallNavigator, walletInstallManager, walletInstallAnalytics, moPubAdsManager);
        C10825c.m36718a(providesWalletInstallPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletInstallPresenter;
    }

    public WalletInstallPresenter get() {
        return providesWalletInstallPresenter(this.module, this.configurationProvider.get(), this.walletInstallNavigatorProvider.get(), this.walletInstallManagerProvider.get(), this.walletInstallAnalyticsProvider.get(), this.moPubAdsManagerProvider.get());
    }
}
