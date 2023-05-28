package p015cm.aptoide.p016pt.notification;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.notification.NotificationCenter */
public class NotificationCenter {
    private NotificationAnalytics notificationAnalytics;
    private NotificationPolicyFactory notificationPolicyFactory;
    private NotificationProvider notificationProvider;
    private NotificationSyncScheduler notificationSyncScheduler;

    public NotificationCenter(NotificationProvider notificationProvider2, NotificationSyncScheduler notificationSyncScheduler2, NotificationPolicyFactory notificationPolicyFactory2, NotificationAnalytics notificationAnalytics2) {
        this.notificationSyncScheduler = notificationSyncScheduler2;
        this.notificationProvider = notificationProvider2;
        this.notificationPolicyFactory = notificationPolicyFactory2;
        this.notificationAnalytics = notificationAnalytics2;
    }

    /* renamed from: a */
    static /* synthetic */ Iterable m6548a(List list) {
        return list;
    }

    /* renamed from: c */
    static /* synthetic */ Iterable m6553c(List list) {
        return list;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13149a(AptoideNotification aptoideNotification) {
        if (!(aptoideNotification.getType() == 7 || aptoideNotification.getType() == 8 || aptoideNotification.getType() == 9)) {
            this.notificationAnalytics.sendPushNotificationReceivedEvent(aptoideNotification.getType(), aptoideNotification.getAbTestingGroup(), aptoideNotification.getCampaignId(), aptoideNotification.getUrl());
        }
        aptoideNotification.setProcessed(true);
        return this.notificationProvider.save(aptoideNotification).mo18582a(aptoideNotification);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13152b(AptoideNotification aptoideNotification) {
        return this.notificationPolicyFactory.getPolicy(aptoideNotification).shouldShow().mo18568c(new C3458a(aptoideNotification));
    }

    public C5368e<List<AptoideNotification>> getInboxNotifications(int i) {
        return this.notificationProvider.getNotifications(i);
    }

    public C5368e<AptoideNotification> getNewNotifications() {
        return this.notificationProvider.getAptoideNotifications().mo18691h(C3466c.f6450f).mo18681d(C3487j.f6474f).mo18692i(new C3484i(this)).mo18687f(new C3478g(this)).mo18697k(C3469d.f6453f);
    }

    public C5368e<Boolean> haveNotifications() {
        return this.notificationProvider.getNotifications(1).mo18694j(C3472e.f6456f);
    }

    public C5328b notificationDismissed(Integer[] numArr) {
        return this.notificationProvider.getLastShowed(numArr).mo18566b(new C3481h(this));
    }

    public C5328b setAllNotificationsRead() {
        return this.notificationProvider.getNotifications().mo18669c().mo18691h(C3475f.f6459f).mo18689g(new C3462b(this)).mo18696k();
    }

    public void setup() {
        this.notificationSyncScheduler.schedule();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13151b(RoomNotification roomNotification) {
        if (roomNotification.getDismissed() != -1) {
            return C5328b.m10170f();
        }
        roomNotification.setDismissed(System.currentTimeMillis());
        return this.notificationProvider.save(roomNotification);
    }

    /* renamed from: a */
    static /* synthetic */ C5368e m6549a(AptoideNotification aptoideNotification, Boolean bool) {
        if (bool.booleanValue()) {
            return C5368e.m10257c(aptoideNotification);
        }
        return C5368e.m10265n();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13150a(RoomNotification roomNotification) {
        roomNotification.setDismissed(System.currentTimeMillis());
        return this.notificationProvider.save(roomNotification);
    }
}
