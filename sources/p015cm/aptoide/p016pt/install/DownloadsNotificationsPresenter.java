package p015cm.aptoide.p016pt.install;

import android.os.Build;
import p015cm.aptoide.p016pt.AppInBackgroundTracker;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.install.DownloadsNotificationsPresenter */
public class DownloadsNotificationsPresenter implements Presenter {
    private static final String TAG = "DownloadsNotificationsPresenter";
    private AppInBackgroundTracker appInBackgroundTracker;
    private InstallManager installManager;
    private NotificationProvider notificationProvider;
    private DownloadsNotification service;
    private C5383b subscriptions = new C5383b();

    public DownloadsNotificationsPresenter(DownloadsNotification downloadsNotification, InstallManager installManager2, AppInBackgroundTracker appInBackgroundTracker2, NotificationProvider notificationProvider2) {
        this.service = downloadsNotification;
        this.installManager = installManager2;
        this.appInBackgroundTracker = appInBackgroundTracker2;
        this.notificationProvider = notificationProvider2;
    }

    /* renamed from: b */
    static /* synthetic */ void m6366b(Boolean bool) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6367b(Throwable th) {
        th.printStackTrace();
        Logger.getInstance().mo12975d(TAG, "error on getCurrentInstallation");
    }

    private void handleCurrentInstallation() {
        this.subscriptions.mo18721a(this.installManager.getCurrentInstallation().mo18649a((C5378b<? super Throwable>) C3364p.f6334f).mo18664b(new C3392u(this)).mo18674c(C3282g3.f6212f).mo18687f(new C3384s(this)).mo18674c(C3344k.f6300f).mo18692i(new C3388t(this)).mo18655a(C3372r.f6343f, (C5378b<Throwable>) new C3360o(this)));
    }

    private Single<Boolean> hasNextDownload() {
        return this.installManager.hasNextDownload();
    }

    private C5328b saveReadyToInstallNotification(int i, String str, String str2, String str3, String str4) {
        if (Build.VERSION.SDK_INT < 29 || !this.appInBackgroundTracker.isAppInBackground() || i != 1) {
            return C5328b.m10170f();
        }
        NotificationProvider notificationProvider2 = this.notificationProvider;
        return notificationProvider2.save(new AptoideNotification(str, str2, "aptoideinstall://package=" + str3 + "&store=" + str4 + "&open_type=open_and_install&origin=" + ReadyToInstallNotificationManager.ORIGIN, str, 9));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12678a(Install install) {
        if (!install.isIndeterminate()) {
            this.service.setupProgressNotification(install.getMd5(), install.getAppName(), install.getProgress(), install.isIndeterminate());
        }
    }

    public void onDestroy() {
        this.subscriptions.unsubscribe();
    }

    public void present() {
        handleCurrentInstallation();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo12681b(Install install) {
        return this.installManager.getDownload(install.getMd5()).mo18567c();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo12676a(RoomDownload roomDownload) {
        Install.InstallationStatus mapDownloadState = this.installManager.mo12751b(roomDownload);
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "Received the state " + mapDownloadState);
        if (mapDownloadState == Install.InstallationStatus.DOWNLOADING || roomDownload.getOverallDownloadStatus() == 14 || roomDownload.getOverallDownloadStatus() == 15) {
            return Single.m10119a(null);
        }
        return hasNextDownload().mo18559a(new C3356n(this, roomDownload)).mo18564b(new C3368q(this));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo12677a(RoomDownload roomDownload, Boolean bool) {
        return saveReadyToInstallNotification(roomDownload.getOverallDownloadStatus(), roomDownload.getIcon(), roomDownload.getAppName(), roomDownload.getPackageName(), roomDownload.getStoreName()).mo18583a(Single.m10119a(bool));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12679a(Boolean bool) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "Has next downloads: " + bool);
        if (!bool.booleanValue()) {
            this.service.removeProgressNotificationAndStop();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12680a(Throwable th) {
        this.service.removeProgressNotificationAndStop();
        th.printStackTrace();
    }
}
