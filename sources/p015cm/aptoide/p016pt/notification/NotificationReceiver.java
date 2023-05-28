package p015cm.aptoide.p016pt.notification;

import android.content.BroadcastReceiver;
import p112n.p118g.p119b.C5305c;

/* renamed from: cm.aptoide.pt.notification.NotificationReceiver */
public class NotificationReceiver extends BroadcastReceiver {
    public static final String ACTION = "action";
    public static final String NOTIFICATION_DISMISSED_ACTION = "PUSH_NOTIFICATION_DISMISSED";
    public static final String NOTIFICATION_NOTIFICATION_ID = "PUSH_NOTIFICATION_NOTIFICATION_ID";
    public static final String NOTIFICATION_PRESSED_ACTION = "NOTIFICATION_PRESSED_ACTION";
    public static final String NOTIFICATION_TARGET_URL = "PUSH_NOTIFICATION_TARGET_URL";
    public static final String NOTIFICATION_TRACK_URL = "PUSH_NOTIFICATION_TRACK_URL";
    private C5305c<NotificationInfo> notificationPublishRelay;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            r12 = this;
            android.content.Context r0 = r13.getApplicationContext()
            cm.aptoide.pt.AptoideApplication r0 = (p015cm.aptoide.p016pt.AptoideApplication) r0
            n.g.b.c r0 = r0.getNotificationsPublishRelay()
            r12.notificationPublishRelay = r0
            android.os.Bundle r0 = r14.getExtras()
            java.lang.String r1 = "notification"
            java.lang.Object r1 = r13.getSystemService(r1)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"
            r2.<init>(r3)
            java.lang.String r3 = r14.getAction()
            int r4 = r3.hashCode()
            r5 = -1304544537(0xffffffffb23e3ae7, float:-1.1072848E-8)
            java.lang.String r6 = "android.intent.action.BOOT_COMPLETED"
            java.lang.String r7 = "PUSH_NOTIFICATION_DISMISSED"
            java.lang.String r8 = "NOTIFICATION_PRESSED_ACTION"
            r9 = 2
            r10 = 1
            r11 = -1
            if (r4 == r5) goto L_0x0050
            r5 = 542552314(0x2056b0fa, float:1.8185062E-19)
            if (r4 == r5) goto L_0x0048
            r5 = 798292259(0x2f94f923, float:2.7098065E-10)
            if (r4 == r5) goto L_0x0040
            goto L_0x0058
        L_0x0040:
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x0058
            r3 = 0
            goto L_0x0059
        L_0x0048:
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x0058
            r3 = 2
            goto L_0x0059
        L_0x0050:
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0058
            r3 = 1
            goto L_0x0059
        L_0x0058:
            r3 = -1
        L_0x0059:
            if (r3 == 0) goto L_0x00a5
            java.lang.String r4 = "PUSH_NOTIFICATION_TARGET_URL"
            java.lang.String r5 = "PUSH_NOTIFICATION_TRACK_URL"
            java.lang.String r6 = "PUSH_NOTIFICATION_NOTIFICATION_ID"
            if (r3 == r10) goto L_0x0084
            if (r3 == r9) goto L_0x0066
            goto L_0x00af
        L_0x0066:
            cm.aptoide.pt.notification.NotificationInfo r13 = new cm.aptoide.pt.notification.NotificationInfo
            int r2 = r0.getInt(r6)
            java.lang.String r3 = r0.getString(r5)
            java.lang.String r0 = r0.getString(r4)
            r13.<init>(r7, r2, r3, r0)
            int r14 = r14.getIntExtra(r6, r11)
            r1.cancel(r14)
            n.g.b.c<cm.aptoide.pt.notification.NotificationInfo> r14 = r12.notificationPublishRelay
            r14.call(r13)
            goto L_0x00af
        L_0x0084:
            cm.aptoide.pt.notification.NotificationInfo r3 = new cm.aptoide.pt.notification.NotificationInfo
            int r7 = r0.getInt(r6)
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r0 = r0.getString(r4)
            r3.<init>(r8, r7, r5, r0)
            int r14 = r14.getIntExtra(r6, r11)
            r1.cancel(r14)
            r13.sendBroadcast(r2)
            n.g.b.c<cm.aptoide.pt.notification.NotificationInfo> r13 = r12.notificationPublishRelay
            r13.call(r3)
            goto L_0x00af
        L_0x00a5:
            cm.aptoide.pt.notification.NotificationInfo r13 = new cm.aptoide.pt.notification.NotificationInfo
            r13.<init>(r6)
            n.g.b.c<cm.aptoide.pt.notification.NotificationInfo> r14 = r12.notificationPublishRelay
            r14.call(r13)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.notification.NotificationReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
