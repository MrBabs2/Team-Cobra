package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.StoreDao */
public interface StoreDao {
    C11482n<List<RoomStore>> getAll();

    C11496w<RoomStore> getByStoreId(long j);

    C11496w<RoomStore> getByStoreName(String str);

    void insert(RoomStore roomStore);

    C11482n<Integer> isSubscribed(long j);

    void removeByStoreName(String str);

    void saveAll(List<RoomStore> list);
}
