package p015cm.aptoide.p016pt.notification.policies;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.InstalledAppsRepository;
import p015cm.aptoide.p016pt.notification.Policy;
import p120q.p326a.C11478j;
import p123rx.Single;
import p322p.p323a.p324a.p325a.C10832d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/notification/policies/CampaignPolicy;", "Lcm/aptoide/pt/notification/Policy;", "whitelistedPackages", "", "", "installedAppsRepository", "Lcm/aptoide/pt/install/InstalledAppsRepository;", "(Ljava/util/List;Lcm/aptoide/pt/install/InstalledAppsRepository;)V", "getCommonPackages", "Lio/reactivex/Maybe;", "installed", "shouldShow", "Lrx/Single;", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.notification.policies.CampaignPolicy */
/* compiled from: CampaignPolicy.kt */
public final class CampaignPolicy implements Policy {
    private final InstalledAppsRepository installedAppsRepository;
    private final List<String> whitelistedPackages;

    public CampaignPolicy(List<String> list, InstalledAppsRepository installedAppsRepository2) {
        C10202j.m34178b(list, "whitelistedPackages");
        C10202j.m34178b(installedAppsRepository2, "installedAppsRepository");
        this.whitelistedPackages = list;
        this.installedAppsRepository = installedAppsRepository2;
    }

    /* access modifiers changed from: private */
    public final C11478j<String> getCommonPackages(String str) {
        for (String str2 : this.whitelistedPackages) {
            if (C10202j.m34176a((Object) str, (Object) str2)) {
                C11478j<String> a = C11478j.m37572a(str2);
                C10202j.m34174a((Object) a, "Maybe.just(it)");
                return a;
            }
        }
        C11478j<String> c = C11478j.m37574c();
        C10202j.m34174a((Object) c, "Maybe.empty()");
        return c;
    }

    public Single<Boolean> shouldShow() {
        if (this.whitelistedPackages.isEmpty()) {
            Single<Boolean> a = Single.m10119a(true);
            C10202j.m34174a((Object) a, "Single.just(true)");
            return a;
        }
        Single<Boolean> a2 = C10832d.m36727a(this.installedAppsRepository.getInstalledAppsNames().mo37613d().flatMapIterable(CampaignPolicy$shouldShow$1.INSTANCE).flatMapMaybe(new CampaignPolicy$shouldShow$2(this)).toList().mo37607a(CampaignPolicy$shouldShow$3.INSTANCE));
        C10202j.m34174a((Object) a2, "RxJavaInterop.toV1Single…tEmpty())\n        }\n    )");
        return a2;
    }
}
