package p015cm.aptoide.p016pt.app.migration;

import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.app.migration.AppcMigrationManager */
public class AppcMigrationManager {
    private static final long BDS_STORE_ID = 1966380;
    private AppcMigrationRepository appcMigrationRepository;
    private AptoideInstalledAppsRepository repository;

    public AppcMigrationManager(AptoideInstalledAppsRepository aptoideInstalledAppsRepository, AppcMigrationRepository appcMigrationRepository2) {
        this.repository = aptoideInstalledAppsRepository;
        this.appcMigrationRepository = appcMigrationRepository2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4599a(String str, int i, long j, boolean z, RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled != null && str != null && roomInstalled.getSignature() != null && !str.equals(roomInstalled.getSignature()) && roomInstalled.getVersionCode() <= i && j == BDS_STORE_ID && z);
    }

    public void addMigrationCandidate(String str) {
        this.appcMigrationRepository.addMigrationCandidate(str);
    }

    public C5368e<Boolean> isAppMigrated(String str) {
        return this.appcMigrationRepository.isAppMigrated(str);
    }

    public C5368e<Boolean> isMigrationApp(String str, String str2, int i, long j, boolean z) {
        return this.repository.getInstalled(str).mo18694j(new C1411a(str2, i, j, z));
    }

    public void persistCandidate(String str) {
        this.appcMigrationRepository.persistCandidate(str);
    }
}
