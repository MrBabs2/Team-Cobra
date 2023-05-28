package p015cm.aptoide.p016pt.database.room;

import java.util.List;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.EventDAO */
public interface EventDAO {
    void delete(RoomEvent roomEvent);

    C11482n<List<RoomEvent>> getAll();

    void insert(RoomEvent roomEvent);
}
