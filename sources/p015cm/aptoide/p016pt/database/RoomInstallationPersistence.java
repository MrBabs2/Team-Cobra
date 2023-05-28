package p015cm.aptoide.p016pt.database;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.InstallationDao;
import p015cm.aptoide.p016pt.database.room.RoomInstallation;
import p015cm.aptoide.p016pt.install.InstallationPersistence;
import p120q.p326a.C10837a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomInstallationPersistence */
public class RoomInstallationPersistence implements InstallationPersistence {
    private InstallationDao installationDao;

    public RoomInstallationPersistence(InstallationDao installationDao2) {
        this.installationDao = installationDao2;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8031a(List list) {
        this.installationDao.insertAll(list);
    }

    public C5368e<List<RoomInstallation>> getInstallationsHistory() {
        return C10832d.m36729a(this.installationDao.getAll(), C10837a.BUFFER).mo18662b(Schedulers.m10352io());
    }

    public C5328b insert(RoomInstallation roomInstallation) {
        return C5328b.m10169d(new C2038b0(this, roomInstallation)).mo18600b(Schedulers.m10352io());
    }

    public C5328b insertAll(List<RoomInstallation> list) {
        return C5328b.m10169d(new C2041c0(this, list)).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ void mo8030a(RoomInstallation roomInstallation) {
        this.installationDao.insert(roomInstallation);
    }
}
