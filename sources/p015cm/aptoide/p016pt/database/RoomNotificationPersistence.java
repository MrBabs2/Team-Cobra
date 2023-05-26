package p015cm.aptoide.p016pt.database;

import java.util.Iterator;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.NotificationDao;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p120q.p326a.C10837a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomNotificationPersistence */
public class RoomNotificationPersistence {
    private NotificationDao notificationDao;

    public RoomNotificationPersistence(NotificationDao notificationDao2) {
        this.notificationDao = notificationDao2;
    }

    /* renamed from: d */
    static /* synthetic */ Single m5199d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RoomNotification roomNotification = (RoomNotification) it.next();
            if (!roomNotification.isDismissed()) {
                return Single.m10119a(roomNotification);
            }
        }
        return Single.m10119a(null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8059a(List list) {
        this.notificationDao.deleteByKey(list);
    }

    /* renamed from: b */
    public /* synthetic */ void mo8060b(List list) {
        this.notificationDao.deleteAllExcluding(list);
    }

    /* renamed from: c */
    public /* synthetic */ void mo8061c(List list) {
        this.notificationDao.insertAll(list);
    }

    public C5328b delete(List<String> list) {
        return C5328b.m10169d(new C2158v0(this, list)).mo18600b(Schedulers.m10352io());
    }

    public C5328b deleteAllExcluding(List<String> list) {
        return C5328b.m10169d(new C2152s0(this, list)).mo18600b(Schedulers.m10352io());
    }

    public C5328b deleteAllOfType(int i) {
        return C5328b.m10169d(new C2160w0(this, i)).mo18600b(Schedulers.m10352io());
    }

    public C5368e<List<RoomNotification>> getAll() {
        return C10832d.m36729a(this.notificationDao.getAll(), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomNotification>> getAllSortedDesc() {
        return C10832d.m36729a(this.notificationDao.getAllSortedDesc(), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public Single<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr) {
        return C10832d.m36727a(this.notificationDao.getAllSortedDescByType(numArr)).mo18563b(Schedulers.m10352io());
    }

    public Single<List<RoomNotification>> getDismissed(Integer[] numArr, long j, long j2) {
        return C10832d.m36727a(this.notificationDao.getDismissed(numArr, j, j2)).mo18563b(Schedulers.m10352io());
    }

    public Single<RoomNotification> getLastShowed(Integer[] numArr) {
        return getAllSortedDescByType(numArr).mo18559a(C2162x0.f4797f);
    }

    public C5328b insert(RoomNotification roomNotification) {
        return C5328b.m10169d(new C2154t0(this, roomNotification)).mo18600b(Schedulers.m10352io());
    }

    public C5328b insertAll(List<RoomNotification> list) {
        return C5328b.m10169d(new C2156u0(this, list)).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8057a(int i) {
        this.notificationDao.deleteAllByType(i);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8058a(RoomNotification roomNotification) {
        this.notificationDao.insert(roomNotification);
    }
}
