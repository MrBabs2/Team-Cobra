package p015cm.aptoide.p016pt.notification;

import p015cm.aptoide.p016pt.database.room.LocalNotificationSyncDao;
import p015cm.aptoide.p016pt.database.room.RoomLocalNotificationSync;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSync;
import p015cm.aptoide.p016pt.sync.Sync;
import p120q.p326a.C10837a;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.notification.RoomLocalNotificationSyncPersistence */
public class RoomLocalNotificationSyncPersistence implements LocalNotificationSyncPersistence {
    private LocalNotificationSyncDao localNotificationSyncDao;
    private RoomLocalNotificationSyncMapper mapper;
    private NotificationProvider provider;

    public RoomLocalNotificationSyncPersistence(RoomLocalNotificationSyncMapper roomLocalNotificationSyncMapper, NotificationProvider notificationProvider, LocalNotificationSyncDao localNotificationSyncDao2) {
        this.mapper = roomLocalNotificationSyncMapper;
        this.provider = notificationProvider;
        this.localNotificationSyncDao = localNotificationSyncDao2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomLocalNotificationSync m6594a(Throwable th) {
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ Sync mo13229a(RoomLocalNotificationSync roomLocalNotificationSync) {
        if (roomLocalNotificationSync != null) {
            return this.mapper.map(roomLocalNotificationSync, this.provider);
        }
        return null;
    }

    public C5368e<Sync> get(String str) {
        return C10832d.m36729a(this.localNotificationSyncDao.get(str), C10837a.BUFFER).mo18662b(Schedulers.m10352io()).mo18699l(C3524u0.f6531f).mo18694j(new C3527v0(this));
    }

    public void remove(String str) {
        this.localNotificationSyncDao.delete(str);
    }

    public void save(LocalNotificationSync localNotificationSync) {
        this.localNotificationSyncDao.save(this.mapper.map(localNotificationSync));
    }
}
