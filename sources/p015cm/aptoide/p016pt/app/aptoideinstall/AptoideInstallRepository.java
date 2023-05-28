package p015cm.aptoide.p016pt.app.aptoideinstall;

import java.util.ArrayList;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.AptoideInstallPersistence;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;", "", "aptoideInstallPersistence", "Lcm/aptoide/pt/install/AptoideInstallPersistence;", "(Lcm/aptoide/pt/install/AptoideInstallPersistence;)V", "aptoideInstallCandidates", "Ljava/util/ArrayList;", "", "getAptoideInstallPersistence", "()Lcm/aptoide/pt/install/AptoideInstallPersistence;", "addAptoideInstallCandidate", "", "packageName", "isInstalledWithAptoide", "Lrx/Single;", "", "persistCandidate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.aptoideinstall.AptoideInstallRepository */
/* compiled from: AptoideInstallRepository.kt */
public final class AptoideInstallRepository {
    private final ArrayList<String> aptoideInstallCandidates = new ArrayList<>();
    private final AptoideInstallPersistence aptoideInstallPersistence;

    public AptoideInstallRepository(AptoideInstallPersistence aptoideInstallPersistence2) {
        C10202j.m34178b(aptoideInstallPersistence2, "aptoideInstallPersistence");
        this.aptoideInstallPersistence = aptoideInstallPersistence2;
    }

    public final void addAptoideInstallCandidate(String str) {
        C10202j.m34178b(str, "packageName");
        if (!this.aptoideInstallCandidates.contains(str)) {
            this.aptoideInstallCandidates.add(str);
        }
    }

    public final AptoideInstallPersistence getAptoideInstallPersistence() {
        return this.aptoideInstallPersistence;
    }

    public final Single<Boolean> isInstalledWithAptoide(String str) {
        C10202j.m34178b(str, "packageName");
        Single<Boolean> isInstalledWithAptoide = this.aptoideInstallPersistence.isInstalledWithAptoide(str);
        C10202j.m34174a((Object) isInstalledWithAptoide, "aptoideInstallPersistenc…dWithAptoide(packageName)");
        return isInstalledWithAptoide;
    }

    public final void persistCandidate(String str) {
        C10202j.m34178b(str, "packageName");
        if (this.aptoideInstallCandidates.contains(str)) {
            this.aptoideInstallPersistence.insert(str);
            this.aptoideInstallCandidates.remove(str);
        }
    }
}
