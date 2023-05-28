package p015cm.aptoide.p016pt.store;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.store.RoomStoreRepository */
public class RoomStoreRepository {
    private final StorePersistence storePersistence;

    public RoomStoreRepository(StorePersistence storePersistence2) {
        this.storePersistence = storePersistence2;
    }

    public Single<RoomStore> get(Long l) {
        return this.storePersistence.get(l.longValue());
    }

    public C5368e<List<RoomStore>> getAll() {
        return this.storePersistence.getAll();
    }

    public C5368e<Boolean> isSubscribed(long j) {
        return this.storePersistence.isSubscribed(j);
    }

    public C5328b remove(String str) {
        return this.storePersistence.remove(str);
    }

    public C5328b save(RoomStore roomStore) {
        return this.storePersistence.save(roomStore);
    }

    public C5328b saveAll(List<RoomStore> list) {
        return this.storePersistence.saveAll(list);
    }

    public Single<RoomStore> get(String str) {
        return this.storePersistence.get(str);
    }
}
