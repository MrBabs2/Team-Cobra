package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.app.migration.AppcMigrationPersistence;
import p015cm.aptoide.p016pt.database.room.MigratedAppDAO;
import p015cm.aptoide.p016pt.database.room.RoomMigratedApp;
import p120q.p326a.C10837a;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomAppcMigrationPersistence */
public class RoomAppcMigrationPersistence implements AppcMigrationPersistence {
    private MigratedAppDAO migratedAppDAO;

    public RoomAppcMigrationPersistence(MigratedAppDAO migratedAppDAO2) {
        this.migratedAppDAO = migratedAppDAO2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5159a(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    public void insert(String str) {
        new Thread(new C2049f(this, str)).start();
    }

    public C5368e<Boolean> isAppMigrated(String str) {
        return C10832d.m36729a(this.migratedAppDAO.isAppMigrated(str), C10837a.BUFFER).mo18694j(C2046e.f4727f).mo18662b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7999a(String str) {
        this.migratedAppDAO.save(new RoomMigratedApp(str));
    }
}
