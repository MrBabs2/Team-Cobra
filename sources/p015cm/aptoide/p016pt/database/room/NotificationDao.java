package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.NotificationDao */
public interface NotificationDao {
    void deleteAllByType(int i);

    void deleteAllExcluding(List<String> list);

    void deleteByKey(List<String> list);

    C11482n<List<RoomNotification>> getAll();

    C11482n<List<RoomNotification>> getAllSortedDesc();

    C11496w<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr);

    C11496w<List<RoomNotification>> getDismissed(Integer[] numArr, long j, long j2);

    void insert(RoomNotification roomNotification);

    void insertAll(List<RoomNotification> list);
}
