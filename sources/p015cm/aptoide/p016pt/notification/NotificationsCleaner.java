package p015cm.aptoide.p016pt.notification;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.notification.NotificationsCleaner */
public class NotificationsCleaner {
    public static final int MAX_NUMBER_NOTIFICATIONS_SAVED = 50;
    private AptoideAccountManager accountManager;
    private final Calendar calendar;
    private CrashReport crashReport;
    private NotificationProvider notificationProvider;
    private final RoomNotificationPersistence roomNotificationPersistence;
    private final C5383b subscriptions = new C5383b();

    public NotificationsCleaner(RoomNotificationPersistence roomNotificationPersistence2, Calendar calendar2, AptoideAccountManager aptoideAccountManager, NotificationProvider notificationProvider2, CrashReport crashReport2) {
        this.roomNotificationPersistence = roomNotificationPersistence2;
        this.calendar = calendar2;
        this.accountManager = aptoideAccountManager;
        this.notificationProvider = notificationProvider2;
        this.crashReport = crashReport2;
    }

    /* renamed from: c */
    static /* synthetic */ void m6571c(Account account) {
    }

    /* renamed from: d */
    static /* synthetic */ Iterable m6572d(List list) {
        return list;
    }

    /* renamed from: f */
    static /* synthetic */ void m6574f(List list) {
    }

    private boolean isNotificationExpired(RoomNotification roomNotification) {
        Long expire = roomNotification.getExpire();
        if (expire == null || this.calendar.getTimeInMillis() <= expire.longValue()) {
            return false;
        }
        return true;
    }

    private C5328b removeExceededLimitNotifications(int i) {
        return C5368e.m10248a(new C3488j0(this)).mo18669c().mo18689g(new C3485i0(this, i)).mo18696k();
    }

    private C5328b removeExpiredNotifications() {
        return C5368e.m10248a(new C3470d0(this)).mo18669c().mo18691h(C3526v.f6533f).mo18687f(new C3491k0(this)).mo18698l().mo18689g(new C3482h0(this)).mo18696k();
    }

    /* access modifiers changed from: private */
    /* renamed from: removeNotifications */
    public C5328b mo13195a(List<RoomNotification> list) {
        return C5368e.m10234a(list).mo18694j(C3553z.f6570f).mo18698l().mo18681d(C3459a0.f6443f).mo18689g(new C3467c0(this)).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13194a(Account account) {
        return cleanOtherUsersNotifications(account.getId());
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo13202c(List list) {
        return cleanLimitExceededNotifications(50);
    }

    public C5328b cleanLimitExceededNotifications(int i) {
        return removeExpiredNotifications().mo18587a(removeExceededLimitNotifications(i));
    }

    public C5328b cleanOtherUsersNotifications(String str) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(str);
        arrayList.add("");
        return this.roomNotificationPersistence.deleteAllExcluding(arrayList);
    }

    public void setup() {
        this.subscriptions.mo18721a(this.accountManager.accountStatus().mo18681d(C3476f0.f6460f).mo18689g(new C3544w(this)).mo18655a(C3463b0.f6447f, (C5378b<Throwable>) new C3547x(this)));
        this.subscriptions.mo18721a(this.notificationProvider.getNotifications(1).mo18689g(new C3550y(this)).mo18655a(C3473e0.f6457f, (C5378b<Throwable>) new C3479g0(this)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13198a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13201b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13197a(RoomNotification roomNotification) {
        if (isNotificationExpired(roomNotification)) {
            return C5368e.m10257c(roomNotification);
        }
        return C5368e.m10265n();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13200b() {
        return this.roomNotificationPersistence.getAllSortedDesc();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13199b(List list) {
        return this.roomNotificationPersistence.delete(list);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13196a() {
        return this.roomNotificationPersistence.getAllSortedDesc();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13193a(int i, List list) {
        if (list.size() > i) {
            return mo13195a(list.subList(i, list.size()));
        }
        return C5328b.m10170f();
    }
}
