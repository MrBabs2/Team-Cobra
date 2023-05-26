package p015cm.aptoide.p016pt.install;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.AppInBackgroundTracker;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.install.DownloadService_MembersInjector */
public final class DownloadService_MembersInjector implements C10822a<DownloadService> {
    private final Provider<AppInBackgroundTracker> appInBackgroundTrackerProvider;
    private final Provider<AptoideDownloadManager> downloadManagerProvider;
    private final Provider<NotificationProvider> notificationProvider;

    public DownloadService_MembersInjector(Provider<AptoideDownloadManager> provider, Provider<AppInBackgroundTracker> provider2, Provider<NotificationProvider> provider3) {
        this.downloadManagerProvider = provider;
        this.appInBackgroundTrackerProvider = provider2;
        this.notificationProvider = provider3;
    }

    public static C10822a<DownloadService> create(Provider<AptoideDownloadManager> provider, Provider<AppInBackgroundTracker> provider2, Provider<NotificationProvider> provider3) {
        return new DownloadService_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAppInBackgroundTracker(DownloadService downloadService, AppInBackgroundTracker appInBackgroundTracker) {
        downloadService.appInBackgroundTracker = appInBackgroundTracker;
    }

    public static void injectDownloadManager(DownloadService downloadService, AptoideDownloadManager aptoideDownloadManager) {
        downloadService.downloadManager = aptoideDownloadManager;
    }

    public static void injectNotificationProvider(DownloadService downloadService, NotificationProvider notificationProvider2) {
        downloadService.notificationProvider = notificationProvider2;
    }

    public void injectMembers(DownloadService downloadService) {
        injectDownloadManager(downloadService, this.downloadManagerProvider.get());
        injectAppInBackgroundTracker(downloadService, this.appInBackgroundTrackerProvider.get());
        injectNotificationProvider(downloadService, this.notificationProvider.get());
    }
}
