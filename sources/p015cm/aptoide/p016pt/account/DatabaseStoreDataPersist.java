package p015cm.aptoide.p016pt.account;

import java.util.List;
import p015cm.aptoide.accountmanager.Store;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.account.DatabaseStoreDataPersist */
public class DatabaseStoreDataPersist {
    private final DatabaseStoreMapper databaseStoreMapper;
    private final RoomStoreRepository storeRepository;

    /* renamed from: cm.aptoide.pt.account.DatabaseStoreDataPersist$DatabaseStoreMapper */
    public static class DatabaseStoreMapper {
        public Store fromDatabase(RoomStore roomStore) {
            return new Store(roomStore.getDownloads(), roomStore.getIconPath(), roomStore.getStoreId(), roomStore.getStoreName(), roomStore.getTheme(), roomStore.getUsername(), roomStore.getPasswordSha1(), true);
        }

        public RoomStore toDatabase(Store store) {
            RoomStore roomStore = new RoomStore();
            roomStore.setDownloads(store.getDownloadCount());
            roomStore.setIconPath(store.getAvatar());
            roomStore.setStoreId(store.getId());
            roomStore.setStoreName(store.getName());
            roomStore.setTheme(store.getTheme());
            roomStore.setUsername(store.getUsername());
            roomStore.setPasswordSha1(store.getPassword());
            return roomStore;
        }
    }

    public DatabaseStoreDataPersist(DatabaseStoreMapper databaseStoreMapper2, RoomStoreRepository roomStoreRepository) {
        this.storeRepository = roomStoreRepository;
        this.databaseStoreMapper = databaseStoreMapper2;
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m4334b(List list) {
        return list;
    }

    /* renamed from: c */
    static /* synthetic */ void m4335c(List list) {
        Logger instance = Logger.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("nr stores= ");
        sb.append(list != null ? list.size() : 0);
        instance.mo12975d("DatabaseStoreDataPersist", sb.toString());
    }

    /* renamed from: a */
    public /* synthetic */ RoomStore mo6251a(Store store) {
        return this.databaseStoreMapper.toDatabase(store);
    }

    public Single<List<Store>> get() {
        return this.storeRepository.getAll().mo18669c().mo18691h(C1130k0.f3556f).mo18694j(new C1132l0(this)).mo18698l().mo18700m().mo18564b(C1128j0.f3554f);
    }

    public C5328b persist(List<Store> list) {
        return C5368e.m10234a(list).mo18694j(new C1134m0(this)).mo18698l().mo18689g(new C1136n0(this)).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo6252a(List list) {
        return this.storeRepository.saveAll(list);
    }

    /* renamed from: a */
    public /* synthetic */ Store mo6250a(RoomStore roomStore) {
        return this.databaseStoreMapper.fromDatabase(roomStore);
    }
}
