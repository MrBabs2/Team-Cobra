package p015cm.aptoide.p016pt.database;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.database.room.UpdateDao;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p120q.p326a.C10837a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomUpdatePersistence */
public class RoomUpdatePersistence implements UpdatePersistence {
    private final UpdateDao updateDao;

    public RoomUpdatePersistence(UpdateDao updateDao2) {
        this.updateDao = updateDao2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomUpdate m5212a(Throwable th) {
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ RoomUpdate m5213b(Throwable th) {
        return null;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5214b(RoomUpdate roomUpdate) {
        return Boolean.valueOf(roomUpdate != null);
    }

    /* renamed from: c */
    static /* synthetic */ List m5216c(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m5217d(Throwable th) {
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8086a(String str) {
        this.updateDao.deleteByPackageName(str);
    }

    public Single<Boolean> contains(String str, boolean z) {
        return C10832d.m36727a(this.updateDao.getByPackageAndExcluded(str, z)).mo18571f(C2063j1.f4751f).mo18569d(C2054g1.f4739f).mo18563b(Schedulers.m10352io());
    }

    public Single<RoomUpdate> get(String str) {
        return C10832d.m36727a(this.updateDao.get(str)).mo18571f(C2066k1.f4754f).mo18563b(Schedulers.m10352io());
    }

    public Single<List<RoomUpdate>> getAll(boolean z) {
        return C10832d.m36727a(this.updateDao.getAllByExcluded(z)).mo18571f(C2072m1.f4760f).mo18563b(Schedulers.m10352io());
    }

    public C5368e<List<RoomUpdate>> getAllSorted(boolean z) {
        return C10832d.m36729a(this.updateDao.getAllByExcludedSorted(z), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public Single<Boolean> isExcluded(String str) {
        return C10832d.m36727a(this.updateDao.getByPackageAndExcluded(str, true).mo37610b(C2069l1.f4757f)).mo18571f(C2051f1.f4735f).mo18563b(Schedulers.m10352io());
    }

    public C5328b remove(String str) {
        return C5328b.m10169d(new C2078o1(this, str)).mo18600b(Schedulers.m10352io());
    }

    public C5328b removeAll(List<RoomUpdate> list) {
        return C5328b.m10169d(new C2057h1(this, list)).mo18600b(Schedulers.m10352io());
    }

    public C5328b save(RoomUpdate roomUpdate) {
        return C5328b.m10169d(new C2060i1(this, roomUpdate)).mo18600b(Schedulers.m10352io());
    }

    public C5328b saveAll(List<RoomUpdate> list) {
        return C5328b.m10169d(new C2075n1(this, list)).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m5215c(RoomUpdate roomUpdate) throws Exception {
        return Boolean.valueOf(roomUpdate != null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8087a(List list) {
        this.updateDao.deleteAll(list);
    }

    /* renamed from: b */
    public /* synthetic */ void mo8088b(List list) {
        this.updateDao.insertAll(list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo8085a(RoomUpdate roomUpdate) {
        this.updateDao.insert(roomUpdate);
    }
}
