package p015cm.aptoide.p016pt.app.migration;

import java.util.ArrayList;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/app/migration/AppcMigrationRepository;", "", "appcMigrationPersistence", "Lcm/aptoide/pt/app/migration/AppcMigrationPersistence;", "(Lcm/aptoide/pt/app/migration/AppcMigrationPersistence;)V", "getAppcMigrationPersistence", "()Lcm/aptoide/pt/app/migration/AppcMigrationPersistence;", "migrationCandidates", "Ljava/util/ArrayList;", "", "addMigrationCandidate", "", "packageName", "isAppMigrated", "Lrx/Observable;", "", "persistCandidate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.migration.AppcMigrationRepository */
/* compiled from: AppcMigrationRepository.kt */
public class AppcMigrationRepository {
    private final AppcMigrationPersistence appcMigrationPersistence;
    private final ArrayList<String> migrationCandidates = new ArrayList<>();

    public AppcMigrationRepository(AppcMigrationPersistence appcMigrationPersistence2) {
        C10202j.m34178b(appcMigrationPersistence2, "appcMigrationPersistence");
        this.appcMigrationPersistence = appcMigrationPersistence2;
    }

    public final void addMigrationCandidate(String str) {
        C10202j.m34178b(str, "packageName");
        if (!this.migrationCandidates.contains(str)) {
            this.migrationCandidates.add(str);
        }
    }

    public final AppcMigrationPersistence getAppcMigrationPersistence() {
        return this.appcMigrationPersistence;
    }

    public final C5368e<Boolean> isAppMigrated(String str) {
        C10202j.m34178b(str, "packageName");
        C5368e<Boolean> isAppMigrated = this.appcMigrationPersistence.isAppMigrated(str);
        C10202j.m34174a((Object) isAppMigrated, "appcMigrationPersistence…sAppMigrated(packageName)");
        return isAppMigrated;
    }

    public final void persistCandidate(String str) {
        C10202j.m34178b(str, "packageName");
        if (this.migrationCandidates.contains(str)) {
            this.appcMigrationPersistence.insert(str);
            this.migrationCandidates.remove(str);
        }
    }
}
