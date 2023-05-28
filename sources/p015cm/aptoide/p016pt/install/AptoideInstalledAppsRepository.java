package p015cm.aptoide.p016pt.install;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.database.RoomInstalledPersistence;
import p015cm.aptoide.p016pt.database.room.RoomInstallation;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.FileUtils;
import p120q.p326a.C11496w;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.install.AptoideInstalledAppsRepository */
public class AptoideInstalledAppsRepository implements InstalledAppsRepository {
    private final FileUtils fileUtils;
    private final RoomInstalledPersistence installedPersistence;
    private final PackageManager packageManager;
    private boolean synced = false;

    public AptoideInstalledAppsRepository(RoomInstalledPersistence roomInstalledPersistence, PackageManager packageManager2, FileUtils fileUtils2) {
        this.installedPersistence = roomInstalledPersistence;
        this.packageManager = packageManager2;
        this.fileUtils = fileUtils2;
    }

    /* renamed from: c */
    static /* synthetic */ Iterable m6357c(List list) {
        return list;
    }

    private <T> List<T> combineLists(List<T> list, List<T> list2, C5378b<T> bVar) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        for (T next : list2) {
            if (!arrayList.contains(next)) {
                if (bVar != null) {
                    bVar.call(next);
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    static /* synthetic */ Iterable m6358d(List list) {
        return list;
    }

    /* renamed from: a */
    public /* synthetic */ List mo12642a() throws Exception {
        List<PackageInfo> allInstalledApps = AptoideUtils.SystemU.getAllInstalledApps(this.packageManager);
        Logger instance = Logger.getInstance();
        instance.mo12985v("InstalledRepository", "Found " + allInstalledApps.size() + " user installed apps.");
        Collections.sort(allInstalledApps, C3278g.f6207f);
        return allInstalledApps;
    }

    /* renamed from: b */
    public /* synthetic */ void mo12645b() {
        this.synced = true;
    }

    public boolean contains(String str) {
        return this.installedPersistence.isInstalled(str).mo18695j().mo41034a().booleanValue();
    }

    public C5368e<RoomInstalled> get(String str, int i) {
        return this.installedPersistence.get(str, i);
    }

    public C5368e<List<RoomInstalled>> getAllInstalled() {
        return this.installedPersistence.getAllInstalled();
    }

    public C5368e<List<RoomInstalled>> getAllInstalledSorted() {
        return this.installedPersistence.getAllInstalledSorted();
    }

    public C5368e<List<RoomInstalled>> getAllInstalling() {
        return this.installedPersistence.getAllInstalling();
    }

    public Single<List<RoomInstalled>> getAllSyncedInstalled() {
        if (!this.synced) {
            return syncWithDevice().mo18583a(getAllInstalled().mo18669c().mo18700m());
        }
        return getAllInstalled().mo18669c().mo18700m();
    }

    public C5368e<RoomInstalled> getAsList(String str, int i) {
        return this.installedPersistence.getAsList(str, i).mo18644a(Schedulers.m10352io()).mo18694j(C3263d.f6191f);
    }

    public C5368e<List<RoomInstallation>> getInstallationsHistory() {
        return this.installedPersistence.getInstallationsHistory();
    }

    public C5368e<RoomInstalled> getInstalled(String str) {
        return this.installedPersistence.getInstalled(str);
    }

    public C5368e<List<RoomInstalled>> getInstalledAppsFilterSystem() {
        return this.installedPersistence.getInstalledFilteringSystemApps();
    }

    public C11496w<List<String>> getInstalledAppsNames() {
        return C10832d.m36726a(getAllInstalled().mo18669c().mo18691h(C3268e.f6196f).mo18694j(C3272e3.f6201f).mo18698l().mo18700m());
    }

    public C5368e<Boolean> isInstalled(String str) {
        return this.installedPersistence.isInstalled(str);
    }

    public C5328b remove(String str, int i) {
        return this.installedPersistence.remove(str, i);
    }

    public C5328b save(RoomInstalled roomInstalled) {
        return this.installedPersistence.insert(roomInstalled);
    }

    public C5328b syncWithDevice() {
        C5368e f = C5368e.m10240a(new C3287i(this)).mo18691h(C3248a.f6175f).mo18694j(new C3283h(this)).mo18698l().mo18687f(new C3273f(this));
        RoomInstalledPersistence roomInstalledPersistence = this.installedPersistence;
        roomInstalledPersistence.getClass();
        return f.mo18689g(new C3277f3(roomInstalledPersistence)).mo18696k().mo18589a((C5377a) new C3253b(this));
    }

    /* renamed from: b */
    static /* synthetic */ RoomInstalled m6356b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomInstalled) list.get(0);
    }

    public Single<Boolean> isInstalled(String str, int i) {
        return this.installedPersistence.isInstalled(str, i);
    }

    public C5368e<List<RoomInstalled>> getAsList(String str) {
        return this.installedPersistence.getAllAsList(str);
    }

    /* renamed from: a */
    static /* synthetic */ int m6354a(PackageInfo packageInfo, PackageInfo packageInfo2) {
        return (int) ((packageInfo.firstInstallTime - packageInfo2.firstInstallTime) / 1000);
    }

    /* renamed from: a */
    public /* synthetic */ RoomInstalled mo12641a(PackageInfo packageInfo) {
        return new RoomInstalled(packageInfo, this.packageManager, this.fileUtils);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo12644a(List list) {
        return this.installedPersistence.getAll().mo18669c().mo18694j(new C3340j(this, list));
    }

    /* renamed from: a */
    public /* synthetic */ List mo12643a(List list, List list2) {
        return combineLists(list, list2, C3258c.f6185f);
    }
}
