package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.wallet.WalletInstallAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesWalletInstallAnalyticsFactory */
public final class ActivityModule_ProvidesWalletInstallAnalyticsFactory implements C10824b<WalletInstallAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final ActivityModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public ActivityModule_ProvidesWalletInstallAnalyticsFactory(ActivityModule activityModule, Provider<DownloadAnalytics> provider, Provider<NotificationAnalytics> provider2, Provider<InstallAnalytics> provider3, Provider<DownloadStateParser> provider4, Provider<AnalyticsManager> provider5, Provider<NavigationTracker> provider6, Provider<SplitAnalyticsMapper> provider7) {
        this.module = activityModule;
        this.downloadAnalyticsProvider = provider;
        this.notificationAnalyticsProvider = provider2;
        this.installAnalyticsProvider = provider3;
        this.downloadStateParserProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.navigationTrackerProvider = provider6;
        this.splitAnalyticsMapperProvider = provider7;
    }

    public static ActivityModule_ProvidesWalletInstallAnalyticsFactory create(ActivityModule activityModule, Provider<DownloadAnalytics> provider, Provider<NotificationAnalytics> provider2, Provider<InstallAnalytics> provider3, Provider<DownloadStateParser> provider4, Provider<AnalyticsManager> provider5, Provider<NavigationTracker> provider6, Provider<SplitAnalyticsMapper> provider7) {
        return new ActivityModule_ProvidesWalletInstallAnalyticsFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static WalletInstallAnalytics providesWalletInstallAnalytics(ActivityModule activityModule, DownloadAnalytics downloadAnalytics, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, DownloadStateParser downloadStateParser, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, SplitAnalyticsMapper splitAnalyticsMapper) {
        WalletInstallAnalytics providesWalletInstallAnalytics = activityModule.providesWalletInstallAnalytics(downloadAnalytics, notificationAnalytics, installAnalytics, downloadStateParser, analyticsManager, navigationTracker, splitAnalyticsMapper);
        C10825c.m36718a(providesWalletInstallAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletInstallAnalytics;
    }

    public WalletInstallAnalytics get() {
        return providesWalletInstallAnalytics(this.module, this.downloadAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.downloadStateParserProvider.get(), this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
