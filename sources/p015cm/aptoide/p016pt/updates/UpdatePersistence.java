package p015cm.aptoide.p016pt.updates;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.updates.UpdatePersistence */
public interface UpdatePersistence {
    Single<Boolean> contains(String str, boolean z);

    Single<RoomUpdate> get(String str);

    Single<List<RoomUpdate>> getAll(boolean z);

    C5368e<List<RoomUpdate>> getAllSorted(boolean z);

    Single<Boolean> isExcluded(String str);

    C5328b remove(String str);

    C5328b removeAll(List<RoomUpdate> list);

    C5328b save(RoomUpdate roomUpdate);

    C5328b saveAll(List<RoomUpdate> list);
}
