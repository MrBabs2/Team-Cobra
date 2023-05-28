package p015cm.aptoide.p016pt.database.room;

import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.LocalNotificationSyncDao */
public interface LocalNotificationSyncDao {
    void delete(String str);

    C11482n<RoomLocalNotificationSync> get(String str);

    void save(RoomLocalNotificationSync roomLocalNotificationSync);
}
