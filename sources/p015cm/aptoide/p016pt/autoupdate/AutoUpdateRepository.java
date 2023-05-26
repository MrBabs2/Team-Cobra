package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo16641d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateRepository;", "", "autoUpdateService", "Lcm/aptoide/pt/autoupdate/AutoUpdateService;", "(Lcm/aptoide/pt/autoupdate/AutoUpdateService;)V", "autoUpdateModel", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "loadAndSaveAutoUpdateModel", "Lrx/Single;", "loadAutoUpdateModel", "loadFreshAutoUpdateModel", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateRepository */
/* compiled from: AutoUpdateRepository.kt */
public final class AutoUpdateRepository {
    /* access modifiers changed from: private */
    public AutoUpdateModel autoUpdateModel;
    private final AutoUpdateService autoUpdateService;

    public AutoUpdateRepository(AutoUpdateService autoUpdateService2) {
        C10202j.m34178b(autoUpdateService2, "autoUpdateService");
        this.autoUpdateService = autoUpdateService2;
    }

    public static final /* synthetic */ AutoUpdateModel access$getAutoUpdateModel$p(AutoUpdateRepository autoUpdateRepository) {
        AutoUpdateModel autoUpdateModel2 = autoUpdateRepository.autoUpdateModel;
        if (autoUpdateModel2 != null) {
            return autoUpdateModel2;
        }
        C10202j.m34181d("autoUpdateModel");
        throw null;
    }

    private final Single<AutoUpdateModel> loadAndSaveAutoUpdateModel() {
        Single<AutoUpdateModel> b = this.autoUpdateService.loadAutoUpdateModel().mo18564b(new AutoUpdateRepository$loadAndSaveAutoUpdateModel$1(this));
        C10202j.m34174a((Object) b, "autoUpdateService.loadAu… { autoUpdateModel = it }");
        return b;
    }

    public final Single<AutoUpdateModel> loadAutoUpdateModel() {
        AutoUpdateModel autoUpdateModel2 = this.autoUpdateModel;
        if (autoUpdateModel2 == null) {
            return loadAndSaveAutoUpdateModel();
        }
        if (autoUpdateModel2 != null) {
            Single<AutoUpdateModel> a = Single.m10119a(autoUpdateModel2);
            C10202j.m34174a((Object) a, "Single.just(autoUpdateModel)");
            return a;
        }
        C10202j.m34181d("autoUpdateModel");
        throw null;
    }

    public final Single<AutoUpdateModel> loadFreshAutoUpdateModel() {
        return loadAndSaveAutoUpdateModel();
    }
}
