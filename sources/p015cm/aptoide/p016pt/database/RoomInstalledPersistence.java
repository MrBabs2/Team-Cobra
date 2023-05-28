package p015cm.aptoide.p016pt.database;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.InstalledDao;
import p015cm.aptoide.p016pt.database.room.RoomInstallation;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.install.InstallationPersistence;
import p015cm.aptoide.p016pt.install.InstalledPersistence;
import p120q.p326a.C10837a;
import p120q.p326a.C11450f;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomInstalledPersistence */
public class RoomInstalledPersistence implements InstalledPersistence {
    private final RoomInstallationMapper installationMapper;
    private final InstalledDao installedDao;
    private final InstallationPersistence roomInstallationPersistence;

    public RoomInstalledPersistence(InstalledDao installedDao2, RoomInstallationPersistence roomInstallationPersistence2, RoomInstallationMapper roomInstallationMapper) {
        this.installedDao = installedDao2;
        this.roomInstallationPersistence = roomInstallationPersistence2;
        this.installationMapper = roomInstallationMapper;
    }

    /* renamed from: c */
    static /* synthetic */ RoomInstalled m5187c(Throwable th) {
        return null;
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m5189d(RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled != null && roomInstalled.getStatus() == 4);
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m5190e(RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled != null && roomInstalled.getStatus() == 4);
    }

    /* access modifiers changed from: private */
    /* renamed from: filterCompleted */
    public C5368e<List<RoomInstalled>> mo8040e(List<RoomInstalled> list) {
        return C5368e.m10234a(list).mo18681d(C2074n0.f4762f).mo18698l();
    }

    /* access modifiers changed from: private */
    /* renamed from: filterInstalling */
    public C5368e<List<RoomInstalled>> mo8038c(List<RoomInstalled> list) {
        return C5368e.m10234a(list).mo18681d(C2053g0.f4738f).mo18698l();
    }

    /* renamed from: g */
    static /* synthetic */ RoomInstalled m5191g(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomInstalled) list.get(0);
    }

    private C5368e<List<RoomInstalled>> getInstalledAsList(String str) {
        return C10832d.m36729a(this.installedDao.getAsListByPackageName(str), C10837a.BUFFER).mo18699l(C2068l0.f4756f).mo18687f(new C2065k0(this)).mo18662b(Schedulers.m10352io());
    }

    /* renamed from: f */
    public /* synthetic */ void mo8041f(List list) {
        this.installedDao.removeAll();
        this.installedDao.insertAll(list);
    }

    public C5368e<RoomInstalled> get(String str, int i) {
        return C10832d.m36729a(this.installedDao.get(str, i), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstalled>> getAll() {
        return C10832d.m36729a(this.installedDao.getAll(), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstalled>> getAllAsList(String str) {
        return C10832d.m36729a(this.installedDao.getAsListByPackageName(str), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstalled>> getAllInstalled() {
        return C10832d.m36729a(this.installedDao.getAll(), C10837a.BUFFER).mo18687f(new C2059i0(this)).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstalled>> getAllInstalledSorted() {
        return C10832d.m36729a(this.installedDao.getAllSortedAsc(), C10837a.BUFFER).mo18687f(new C2062j0(this)).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstalled>> getAllInstalling() {
        return C10832d.m36729a(this.installedDao.getAll(), C10837a.BUFFER).mo18687f(new C2077o0(this)).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstalled>> getAsList(String str, int i) {
        return C10832d.m36729a(this.installedDao.getAsList(str, i), C10837a.BUFFER).mo18699l(C2083q0.f4776f).mo18662b(Schedulers.m10352io());
    }

    public C5368e<List<RoomInstallation>> getInstallationsHistory() {
        return this.roomInstallationPersistence.getInstallationsHistory();
    }

    public C5368e<RoomInstalled> getInstalled(String str) {
        return getInstalledAsList(str).mo18694j(C2044d0.f4725f);
    }

    public C5368e<List<RoomInstalled>> getInstalledFilteringSystemApps() {
        return C10832d.m36729a(this.installedDao.getAllFilteringSystemApps(), C10837a.BUFFER).mo18687f(new C2080p0(this)).mo18662b(Schedulers.m10352io());
    }

    public C5328b insert(RoomInstalled roomInstalled) {
        return C5328b.m10169d(new C2050f0(this, roomInstalled)).mo18587a(this.roomInstallationPersistence.insert(this.installationMapper.map(roomInstalled))).mo18600b(Schedulers.m10352io());
    }

    public C5368e<Boolean> isInstalled(String str) {
        return getInstalled(str).mo18694j(C2056h0.f4741f);
    }

    public C5328b remove(String str, int i) {
        return C10832d.m36728a((C11450f) this.installedDao.remove(str, i)).mo18600b(Schedulers.m10352io());
    }

    public C5328b replaceAllBy(List<RoomInstalled> list) {
        return C5328b.m10169d(new C2047e0(this, list)).mo18587a(this.roomInstallationPersistence.insertAll(this.installationMapper.map((List<? extends RoomInstalled>) list))).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: a */
    static /* synthetic */ List m5184a(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5185b(RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled.getStatus() == 4);
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m5188c(RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled.getStatus() == 3);
    }

    public Single<Boolean> isInstalled(String str, int i) {
        return C10832d.m36727a(this.installedDao.isInstalledByVersion(str, i)).mo18571f(C2085r0.f4778f).mo18569d(C2071m0.f4759f);
    }

    /* renamed from: b */
    static /* synthetic */ List m5186b(Throwable th) {
        return new ArrayList();
    }

    /* renamed from: a */
    public /* synthetic */ void mo8036a(RoomInstalled roomInstalled) {
        this.installedDao.insert(roomInstalled);
    }
}
