package p015cm.aptoide.p016pt.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.view.ActivityProvider;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, mo16641d2 = {"Lcm/aptoide/pt/notification/ReadyToInstallNotificationManager;", "", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "notificationIdsMapper", "Lcm/aptoide/pt/notification/NotificationIdsMapper;", "(Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/notification/NotificationIdsMapper;)V", "getInstallManager", "()Lcm/aptoide/pt/install/InstallManager;", "isNotificationDisplayed", "", "getNotificationIdsMapper", "()Lcm/aptoide/pt/notification/NotificationIdsMapper;", "buildMultiReadyToInstallNotification", "Lrx/Single;", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "buildNotification", "aptoideNotification", "Lcm/aptoide/pt/notification/AptoideNotification;", "buildSingleReadyToInstallNotification", "appName", "", "icon", "url", "getMultiAppPressIntentAction", "Landroid/app/PendingIntent;", "getNotificationChannel", "Landroid/app/NotificationChannel;", "getOnDismissAction", "getSingleAppPressIntentAction", "setIsNotificationDisplayed", "", "isActive", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.ReadyToInstallNotificationManager */
/* compiled from: ReadyToInstallNotificationManager.kt */
public final class ReadyToInstallNotificationManager {
    public static final String CHANNEL_ID = "ready_to_install_notification_channel";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ORIGIN = "ready_to_install";
    private final InstallManager installManager;
    private boolean isNotificationDisplayed;
    private final NotificationIdsMapper notificationIdsMapper;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo16641d2 = {"Lcm/aptoide/pt/notification/ReadyToInstallNotificationManager$Companion;", "", "()V", "CHANNEL_ID", "", "ORIGIN", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.notification.ReadyToInstallNotificationManager$Companion */
    /* compiled from: ReadyToInstallNotificationManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReadyToInstallNotificationManager(InstallManager installManager2, NotificationIdsMapper notificationIdsMapper2) {
        C10202j.m34178b(installManager2, "installManager");
        C10202j.m34178b(notificationIdsMapper2, "notificationIdsMapper");
        this.installManager = installManager2;
        this.notificationIdsMapper = notificationIdsMapper2;
    }

    private final Single<Notification> buildMultiReadyToInstallNotification(Context context) {
        Single<Notification> b = Single.m10126b(new C3452xb165d63f(this, context));
        C10202j.m34174a((Object) b, "Single.fromCallable {\n  …\n      notification\n    }");
        return b;
    }

    private final Single<Notification> buildSingleReadyToInstallNotification(String str, String str2, String str3, Context context) {
        Single<Notification> b = Single.m10126b(new C3453x30e4e2cc(this, context, str, str3, str2));
        C10202j.m34174a((Object) b, "Single.fromCallable {\n  …\n      notification\n    }");
        return b;
    }

    /* access modifiers changed from: private */
    public final PendingIntent getMultiAppPressIntentAction(Context context) {
        ActivityProvider activityProvider = AptoideApplication.getActivityProvider();
        C10202j.m34174a((Object) activityProvider, "AptoideApplication.getActivityProvider()");
        Intent intent = new Intent(context, activityProvider.getMainActivityFragmentClass());
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APPS, true);
        intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, true);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        C10202j.m34174a((Object) activity, "PendingIntent.getActivit…FLAG_UPDATE_CURRENT\n    )");
        return activity;
    }

    /* access modifiers changed from: private */
    public final PendingIntent getOnDismissAction(Context context) {
        int notificationId = this.notificationIdsMapper.getNotificationId(9);
        Intent intent = new Intent(context, NotificationReceiver.class);
        intent.setAction(NotificationReceiver.NOTIFICATION_DISMISSED_ACTION);
        intent.putExtra(NotificationReceiver.NOTIFICATION_NOTIFICATION_ID, notificationId);
        return PendingIntent.getBroadcast(context, notificationId, intent, 134217728);
    }

    /* access modifiers changed from: private */
    public final PendingIntent getSingleAppPressIntentAction(String str, Context context) {
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse(str), context, DeepLinkIntentReceiver.class), 134217728);
        C10202j.m34174a((Object) activity, "PendingIntent.getActivit…FLAG_UPDATE_CURRENT\n    )");
        return activity;
    }

    public final Single<Notification> buildNotification(AptoideNotification aptoideNotification, Context context) {
        C10202j.m34178b(aptoideNotification, "aptoideNotification");
        C10202j.m34178b(context, "context");
        if (this.isNotificationDisplayed) {
            return buildMultiReadyToInstallNotification(context);
        }
        String appName = aptoideNotification.getAppName();
        C10202j.m34174a((Object) appName, "aptoideNotification.appName");
        String img = aptoideNotification.getImg();
        C10202j.m34174a((Object) img, "aptoideNotification.img");
        String url = aptoideNotification.getUrl();
        C10202j.m34174a((Object) url, "aptoideNotification.url");
        return buildSingleReadyToInstallNotification(appName, img, url, context);
    }

    public final InstallManager getInstallManager() {
        return this.installManager;
    }

    public final NotificationChannel getNotificationChannel() {
        NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Install notifications", 3);
        notificationChannel.setDescription("Install");
        return notificationChannel;
    }

    public final NotificationIdsMapper getNotificationIdsMapper() {
        return this.notificationIdsMapper;
    }

    public final synchronized void setIsNotificationDisplayed(boolean z) {
        this.isNotificationDisplayed = z;
    }
}
