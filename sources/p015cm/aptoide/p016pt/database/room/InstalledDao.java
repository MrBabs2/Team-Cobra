package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C10839b;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.InstalledDao */
public interface InstalledDao {
    C11482n<RoomInstalled> get(String str, int i);

    C11482n<List<RoomInstalled>> getAll();

    C11482n<List<RoomInstalled>> getAllFilteringSystemApps();

    C11482n<List<RoomInstalled>> getAllSortedAsc();

    C11482n<List<RoomInstalled>> getAsList(String str, int i);

    C11482n<List<RoomInstalled>> getAsListByPackageName(String str);

    void insert(RoomInstalled roomInstalled);

    void insertAll(List<RoomInstalled> list);

    C11496w<RoomInstalled> isInstalledByVersion(String str, int i);

    C10839b remove(String str, int i);

    void removeAll();
}
