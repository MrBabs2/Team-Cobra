package p015cm.aptoide.p016pt.store;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.store.StorePersistence */
public interface StorePersistence {
    Single<RoomStore> get(long j);

    Single<RoomStore> get(String str);

    C5368e<List<RoomStore>> getAll();

    C5368e<Boolean> isSubscribed(long j);

    C5328b remove(String str);

    C5328b save(RoomStore roomStore);

    C5328b saveAll(List<RoomStore> list);
}
