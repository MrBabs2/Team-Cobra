package p015cm.aptoide.p016pt.app.aptoideinstall;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo16641d2 = {"Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallManager;", "", "aptoideInstalledAppsRepository", "Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "aptoideInstallRepository", "Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;", "(Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;)V", "getAptoideInstallRepository", "()Lcm/aptoide/pt/app/aptoideinstall/AptoideInstallRepository;", "getAptoideInstalledAppsRepository", "()Lcm/aptoide/pt/install/AptoideInstalledAppsRepository;", "addAptoideInstallCandidate", "", "packageName", "", "isInstalledWithAptoide", "Lrx/Single;", "", "isSplitInstalledWithAptoide", "persistCandidate", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.aptoideinstall.AptoideInstallManager */
/* compiled from: AptoideInstallManager.kt */
public final class AptoideInstallManager {
    private final AptoideInstallRepository aptoideInstallRepository;
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;

    public AptoideInstallManager(AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, AptoideInstallRepository aptoideInstallRepository2) {
        C10202j.m34178b(aptoideInstalledAppsRepository2, "aptoideInstalledAppsRepository");
        C10202j.m34178b(aptoideInstallRepository2, "aptoideInstallRepository");
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.aptoideInstallRepository = aptoideInstallRepository2;
    }

    private final boolean isSplitInstalledWithAptoide(String str) {
        return false;
    }

    public final void addAptoideInstallCandidate(String str) {
        C10202j.m34178b(str, "packageName");
        this.aptoideInstallRepository.addAptoideInstallCandidate(str);
    }

    public final AptoideInstallRepository getAptoideInstallRepository() {
        return this.aptoideInstallRepository;
    }

    public final AptoideInstalledAppsRepository getAptoideInstalledAppsRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public final Single<Boolean> isInstalledWithAptoide(String str) {
        C10202j.m34178b(str, "packageName");
        if (!isSplitInstalledWithAptoide(str)) {
            return this.aptoideInstallRepository.isInstalledWithAptoide(str);
        }
        Single<Boolean> a = Single.m10119a(true);
        C10202j.m34174a((Object) a, "Single.just(true)");
        return a;
    }

    public final void persistCandidate(String str) {
        C10202j.m34178b(str, "packageName");
        this.aptoideInstallRepository.persistCandidate(str);
    }
}
