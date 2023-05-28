package p015cm.aptoide.p016pt.install;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.core.app.C0373i;
import java.util.Locale;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.AppInBackgroundTracker;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.BaseService;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.downloadmanager.AptoideDownloadManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.notification.NotificationProvider;

/* renamed from: cm.aptoide.pt.install.DownloadService */
public class DownloadService extends BaseService implements DownloadsNotification {
    public static final String ACTION_INSTALL_FINISHED = "INSTALL_FINISHED";
    public static final String ACTION_STOP_INSTALL = "STOP_INSTALL";
    public static final String DOWNLOAD_APP_ACTION = "DOWNLOAD_APP";
    public static final String EXTRA_INSTALLATION_MD5 = "INSTALLATION_MD5";
    private static final int NOTIFICATION_ID = 8;
    public static final int PROGRESS_MAX_VALUE = 100;
    public static final String TAG = "InstallService";
    private final int OPEN_APPVIEW_REQUEST_CODE = 333;
    private final int OPEN_DOWNLOAD_MANAGER_REQUEST_CODE = 222;
    private final int PAUSE_DOWNLOAD_REQUEST_CODE = 111;
    @Inject
    AppInBackgroundTracker appInBackgroundTracker;
    @Inject
    AptoideDownloadManager downloadManager;
    private DownloadsNotificationsPresenter downloadsNotificationsPresenter;
    private InstallManager installManager;
    @Inject
    NotificationProvider notificationProvider;
    private Notification progressNotification;

    private Notification buildNotification(String str, int i, boolean z, C0373i.C0374a aVar, C0373i.C0374a aVar2, PendingIntent pendingIntent) {
        C0373i.C0377d dVar = new C0373i.C0377d(this);
        dVar.mo2254c(17301633);
        dVar.mo2252b((CharSequence) String.format(Locale.ENGLISH, getResources().getString(C1086R.string.aptoide_downloading), new Object[]{getString(C1086R.string.app_name)}));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" - ");
        sb.append(getString(C1086R.string.download_progress));
        dVar.mo2246a((CharSequence) sb);
        dVar.mo2242a(pendingIntent);
        dVar.mo2239a(100, i, z);
        dVar.mo2244a(aVar);
        dVar.mo2244a(aVar2);
        return dVar.mo2237a();
    }

    private Intent createDeeplinkingIntent() {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(), AptoideApplication.getActivityProvider().getMainActivityFragmentClass());
        intent.setFlags(276824064);
        return intent;
    }

    private C0373i.C0374a getAction(int i, String str, PendingIntent pendingIntent) {
        return new C0373i.C0374a(i, (CharSequence) str, pendingIntent);
    }

    private PendingIntent getAppViewOpeningPendingIntent(String str) {
        Intent createDeeplinkingIntent = createDeeplinkingIntent();
        Bundle bundle = new Bundle();
        bundle.putBoolean(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        bundle.putString("md5", str);
        createDeeplinkingIntent.putExtras(bundle);
        return PendingIntent.getActivity(this, 333, createDeeplinkingIntent, 134217728);
    }

    private C0373i.C0374a getDownloadManagerAction(int i) {
        return getAction(C1086R.C1087drawable.ic_manager, getString(C1086R.string.open_apps_manager), getOpenDownloadManagerPendingIntent(i));
    }

    private PendingIntent getOpenDownloadManagerPendingIntent(int i) {
        Intent createDeeplinkingIntent = createDeeplinkingIntent();
        createDeeplinkingIntent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.FROM_DOWNLOAD_NOTIFICATION, true);
        return PendingIntent.getActivity(this, 222, createDeeplinkingIntent, 134217728);
    }

    private C0373i.C0374a getPauseAction(String str) {
        return getAction(C1086R.C1087drawable.media_pause, getString(C1086R.string.pause_download), getPausePendingIntent(str));
    }

    private PendingIntent getPausePendingIntent(String str) {
        Intent intent = new Intent(this, DownloadService.class);
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString(EXTRA_INSTALLATION_MD5, str);
            intent.putExtras(bundle);
        }
        intent.setAction(ACTION_STOP_INSTALL);
        return PendingIntent.getService(this, 111, intent, 134217728);
    }

    public static Intent newInstanceForDownloads(Context context) {
        Intent intent = new Intent(context, DownloadService.class);
        intent.setAction(DOWNLOAD_APP_ACTION);
        return intent;
    }

    private void pauseDownload(String str) {
        this.progressNotification = null;
        this.downloadManager.pauseDownload(str).mo18609d();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        getApplicationComponent().inject(this);
        Logger.getInstance().mo12975d(TAG, "Install service is starting");
        this.installManager = ((AptoideApplication) getApplicationContext()).getInstallManager();
        DownloadsNotificationsPresenter downloadsNotificationsPresenter2 = new DownloadsNotificationsPresenter(this, this.installManager, this.appInBackgroundTracker, this.notificationProvider);
        this.downloadsNotificationsPresenter = downloadsNotificationsPresenter2;
        downloadsNotificationsPresenter2.present();
    }

    public void onDestroy() {
        Logger.getInstance().mo12975d(DownloadService.class.getName(), "InstallService.onDestroy");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !ACTION_STOP_INSTALL.equals(intent.getAction())) {
            return 1;
        }
        String stringExtra = intent.getStringExtra(EXTRA_INSTALLATION_MD5);
        Logger instance = Logger.getInstance();
        instance.mo12975d(TAG, "received intent pausing download: " + stringExtra);
        pauseDownload(stringExtra);
        return 1;
    }

    public void removeProgressNotificationAndStop() {
        this.downloadsNotificationsPresenter.onDestroy();
        this.progressNotification = null;
        stopForeground(true);
        stopSelf();
    }

    public void setupProgressNotification(String str, String str2, int i, boolean z) {
        C0373i.C0374a downloadManagerAction = getDownloadManagerAction(str.hashCode());
        PendingIntent appViewOpeningPendingIntent = getAppViewOpeningPendingIntent(str);
        C0373i.C0374a pauseAction = getPauseAction(str);
        Notification notification = this.progressNotification;
        if (notification == null) {
            this.progressNotification = buildNotification(str2, i, z, pauseAction, downloadManagerAction, appViewOpeningPendingIntent);
        } else {
            long j = notification.when;
            Notification buildNotification = buildNotification(str2, i, z, pauseAction, downloadManagerAction, appViewOpeningPendingIntent);
            this.progressNotification = buildNotification;
            buildNotification.when = j;
        }
        startForeground(8, this.progressNotification);
    }
}
