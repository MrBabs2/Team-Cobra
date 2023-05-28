package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateManager;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateRepository;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.install.InstallManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideAutoUpdateManagerFactory */
public final class ActivityModule_ProvideAutoUpdateManagerFactory implements C10824b<AutoUpdateManager> {
    private final Provider<AutoUpdateRepository> autoUpdateRepositoryProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<Integer> localVersionCodeProvider;
    private final ActivityModule module;
    private final Provider<PermissionManager> permissionManagerProvider;

    public ActivityModule_ProvideAutoUpdateManagerFactory(ActivityModule activityModule, Provider<DownloadFactory> provider, Provider<PermissionManager> provider2, Provider<InstallManager> provider3, Provider<DownloadAnalytics> provider4, Provider<Integer> provider5, Provider<AutoUpdateRepository> provider6) {
        this.module = activityModule;
        this.downloadFactoryProvider = provider;
        this.permissionManagerProvider = provider2;
        this.installManagerProvider = provider3;
        this.downloadAnalyticsProvider = provider4;
        this.localVersionCodeProvider = provider5;
        this.autoUpdateRepositoryProvider = provider6;
    }

    public static ActivityModule_ProvideAutoUpdateManagerFactory create(ActivityModule activityModule, Provider<DownloadFactory> provider, Provider<PermissionManager> provider2, Provider<InstallManager> provider3, Provider<DownloadAnalytics> provider4, Provider<Integer> provider5, Provider<AutoUpdateRepository> provider6) {
        return new ActivityModule_ProvideAutoUpdateManagerFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static AutoUpdateManager provideAutoUpdateManager(ActivityModule activityModule, DownloadFactory downloadFactory, PermissionManager permissionManager, InstallManager installManager, DownloadAnalytics downloadAnalytics, int i, AutoUpdateRepository autoUpdateRepository) {
        AutoUpdateManager provideAutoUpdateManager = activityModule.provideAutoUpdateManager(downloadFactory, permissionManager, installManager, downloadAnalytics, i, autoUpdateRepository);
        C10825c.m36718a(provideAutoUpdateManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideAutoUpdateManager;
    }

    public AutoUpdateManager get() {
        return provideAutoUpdateManager(this.module, this.downloadFactoryProvider.get(), this.permissionManagerProvider.get(), this.installManagerProvider.get(), this.downloadAnalyticsProvider.get(), this.localVersionCodeProvider.get().intValue(), this.autoUpdateRepositoryProvider.get());
    }
}
