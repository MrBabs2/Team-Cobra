package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.download.view.DownloadDialogProvider;
import p015cm.aptoide.p016pt.download.view.DownloadNavigator;
import p015cm.aptoide.p016pt.download.view.DownloadViewActionPresenter;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesDownloadViewActionPresenterFactory */
public final class FragmentModule_ProvidesDownloadViewActionPresenterFactory implements C10824b<DownloadViewActionPresenter> {
    private final Provider<AppcMigrationManager> appcMigrationManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadDialogProvider> downloadDialogProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadNavigator> downloadNavigatorProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<PermissionManager> permissionManagerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public FragmentModule_ProvidesDownloadViewActionPresenterFactory(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<MoPubAdsManager> provider2, Provider<PermissionManager> provider3, Provider<AppcMigrationManager> provider4, Provider<DownloadDialogProvider> provider5, Provider<DownloadNavigator> provider6, Provider<DownloadFactory> provider7, Provider<DownloadAnalytics> provider8, Provider<InstallAnalytics> provider9, Provider<NotificationAnalytics> provider10, Provider<CrashReport> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13) {
        this.module = fragmentModule;
        this.installManagerProvider = provider;
        this.moPubAdsManagerProvider = provider2;
        this.permissionManagerProvider = provider3;
        this.appcMigrationManagerProvider = provider4;
        this.downloadDialogProvider = provider5;
        this.downloadNavigatorProvider = provider6;
        this.downloadFactoryProvider = provider7;
        this.downloadAnalyticsProvider = provider8;
        this.installAnalyticsProvider = provider9;
        this.notificationAnalyticsProvider = provider10;
        this.crashReportProvider = provider11;
        this.dynamicSplitsManagerProvider = provider12;
        this.splitAnalyticsMapperProvider = provider13;
    }

    public static FragmentModule_ProvidesDownloadViewActionPresenterFactory create(FragmentModule fragmentModule, Provider<InstallManager> provider, Provider<MoPubAdsManager> provider2, Provider<PermissionManager> provider3, Provider<AppcMigrationManager> provider4, Provider<DownloadDialogProvider> provider5, Provider<DownloadNavigator> provider6, Provider<DownloadFactory> provider7, Provider<DownloadAnalytics> provider8, Provider<InstallAnalytics> provider9, Provider<NotificationAnalytics> provider10, Provider<CrashReport> provider11, Provider<DynamicSplitsManager> provider12, Provider<SplitAnalyticsMapper> provider13) {
        return new FragmentModule_ProvidesDownloadViewActionPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static DownloadViewActionPresenter providesDownloadViewActionPresenter(FragmentModule fragmentModule, InstallManager installManager, MoPubAdsManager moPubAdsManager, PermissionManager permissionManager, AppcMigrationManager appcMigrationManager, DownloadDialogProvider downloadDialogProvider2, DownloadNavigator downloadNavigator, DownloadFactory downloadFactory, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, NotificationAnalytics notificationAnalytics, CrashReport crashReport, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        DownloadViewActionPresenter providesDownloadViewActionPresenter = fragmentModule.providesDownloadViewActionPresenter(installManager, moPubAdsManager, permissionManager, appcMigrationManager, downloadDialogProvider2, downloadNavigator, downloadFactory, downloadAnalytics, installAnalytics, notificationAnalytics, crashReport, dynamicSplitsManager, splitAnalyticsMapper);
        C10825c.m36718a(providesDownloadViewActionPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadViewActionPresenter;
    }

    public DownloadViewActionPresenter get() {
        return providesDownloadViewActionPresenter(this.module, this.installManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.permissionManagerProvider.get(), this.appcMigrationManagerProvider.get(), this.downloadDialogProvider.get(), this.downloadNavigatorProvider.get(), this.downloadFactoryProvider.get(), this.downloadAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.notificationAnalyticsProvider.get(), this.crashReportProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
