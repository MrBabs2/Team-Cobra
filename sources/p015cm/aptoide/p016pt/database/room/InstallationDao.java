package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.InstallationDao */
public interface InstallationDao {
    C11482n<List<RoomInstallation>> getAll();

    void insert(RoomInstallation roomInstallation);

    void insertAll(List<RoomInstallation> list);
}
