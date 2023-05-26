package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.database.room.AptoideInstallDao;
import p015cm.aptoide.p016pt.database.room.RoomAptoideInstallApp;
import p015cm.aptoide.p016pt.install.AptoideInstallPersistence;
import p123rx.Single;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomAptoideInstallPersistence */
public class RoomAptoideInstallPersistence implements AptoideInstallPersistence {
    private final AptoideInstallDao aptoideInstallDao;

    public RoomAptoideInstallPersistence(AptoideInstallDao aptoideInstallDao2) {
        this.aptoideInstallDao = aptoideInstallDao2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5161a(RoomAptoideInstallApp roomAptoideInstallApp) {
        return true;
    }

    public void insert(String str) {
        new Thread(new C2052g(this, str)).start();
    }

    public Single<Boolean> isInstalledWithAptoide(String str) {
        return C10832d.m36727a(this.aptoideInstallDao.get(str)).mo18569d(C2055h.f4740f).mo18571f(C2058i.f4744f).mo18563b(Schedulers.m10352io());
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5162a(Throwable th) {
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8000a(String str) {
        this.aptoideInstallDao.insert(new RoomAptoideInstallApp(str));
    }
}
