package p015cm.aptoide.p016pt.database;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.database.room.StoreDao;
import p015cm.aptoide.p016pt.store.StorePersistence;
import p120q.p326a.C10837a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomStorePersistence */
public class RoomStorePersistence implements StorePersistence {
    private final StoreDao storeDao;

    public RoomStorePersistence(StoreDao storeDao2) {
        this.storeDao = storeDao2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomStore m5205a(Throwable th) {
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ RoomStore m5207b(Throwable th) {
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8073a(String str) {
        this.storeDao.removeByStoreName(str);
    }

    public Single<RoomStore> get(String str) {
        return C10832d.m36727a(this.storeDao.getByStoreName(str)).mo18571f(C2164y0.f4799f).mo18563b(Schedulers.m10352io());
    }

    public C5368e<List<RoomStore>> getAll() {
        return C10832d.m36729a(this.storeDao.getAll(), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public C5368e<Boolean> isSubscribed(long j) {
        return C10832d.m36729a(this.storeDao.isSubscribed(j), C10837a.BUFFER).mo18694j(C2036a1.f4711f).mo18662b(Schedulers.m10352io());
    }

    public C5328b remove(String str) {
        return C5328b.m10169d(new C2039b1(this, str)).mo18600b(Schedulers.m10352io());
    }

    public C5328b save(RoomStore roomStore) {
        return C5328b.m10169d(new C2166z0(this, roomStore)).mo18600b(Schedulers.m10352io());
    }

    public C5328b saveAll(List<RoomStore> list) {
        return C5328b.m10169d(new C2042c1(this, list)).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8072a(RoomStore roomStore) {
        this.storeDao.insert(roomStore);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5206a(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8074a(List list) {
        this.storeDao.saveAll(list);
    }

    public Single<RoomStore> get(long j) {
        return C10832d.m36727a(this.storeDao.getByStoreId(j)).mo18571f(C2045d1.f4726f).mo18563b(Schedulers.m10352io());
    }
}
