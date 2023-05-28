package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.UpdateDao */
public interface UpdateDao {
    void deleteAll(List<RoomUpdate> list);

    void deleteByPackageName(String str);

    C11496w<RoomUpdate> get(String str);

    C11496w<List<RoomUpdate>> getAllByExcluded(boolean z);

    C11482n<List<RoomUpdate>> getAllByExcludedSorted(boolean z);

    C11496w<RoomUpdate> getByPackageAndExcluded(String str, boolean z);

    void insert(RoomUpdate roomUpdate);

    void insertAll(List<RoomUpdate> list);
}
