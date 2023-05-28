package p015cm.aptoide.p016pt.notification.sync;

import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.NotificationService;

/* renamed from: cm.aptoide.pt.notification.sync.NotificationSyncFactory */
public class NotificationSyncFactory {
    public static final String CAMPAIGN_NOTIFICATION_SYNC_IMMEDIATE = "CAMPAIGN_IMMEDIATE";
    public static final String CAMPAIGN_NOTIFICATION_SYNC_PERIODIC = "CAMPAIGN";
    private final NotificationProvider notificationPersistence;
    private final NotificationService notificationService;

    public NotificationSyncFactory(NotificationService notificationService2, NotificationProvider notificationProvider) {
        this.notificationService = notificationService2;
        this.notificationPersistence = notificationProvider;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p015cm.aptoide.p016pt.sync.Sync create(java.lang.String r14) {
        /*
            r13 = this;
            int r0 = r14.hashCode()
            r1 = 642707728(0x264ef110, float:7.179731E-16)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1203674914(0x47be9f22, float:97598.266)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "CAMPAIGN_IMMEDIATE"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "CAMPAIGN"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x0052
            if (r0 != r2) goto L_0x003b
            cm.aptoide.pt.notification.sync.CampaignNotificationSync r0 = new cm.aptoide.pt.notification.sync.CampaignNotificationSync
            cm.aptoide.pt.notification.NotificationService r5 = r13.notificationService
            cm.aptoide.pt.notification.NotificationProvider r6 = r13.notificationPersistence
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r3 = r0
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            return r0
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid sync "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x0052:
            cm.aptoide.pt.notification.sync.CampaignNotificationSync r0 = new cm.aptoide.pt.notification.sync.CampaignNotificationSync
            cm.aptoide.pt.notification.NotificationService r3 = r13.notificationService
            cm.aptoide.pt.notification.NotificationProvider r4 = r13.notificationPersistence
            r5 = 1
            r6 = 0
            r7 = 43200000(0x2932e00, double:2.1343636E-316)
            r9 = 0
            r1 = r0
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.notification.sync.NotificationSyncFactory.create(java.lang.String):cm.aptoide.pt.sync.Sync");
    }
}
