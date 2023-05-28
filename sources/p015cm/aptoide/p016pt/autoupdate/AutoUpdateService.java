package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p123rx.Single;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateService;", "", "service", "Lcm/aptoide/pt/autoupdate/Service;", "packageName", "", "clientSdkVersion", "", "(Lcm/aptoide/pt/autoupdate/Service;Ljava/lang/String;I)V", "loading", "", "createErrorAutoUpdateModel", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "throwable", "", "loadAutoUpdateModel", "Lrx/Single;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateService */
/* compiled from: AutoUpdateService.kt */
public final class AutoUpdateService {
    private final int clientSdkVersion;
    /* access modifiers changed from: private */
    public boolean loading;
    /* access modifiers changed from: private */
    public final String packageName;
    private final Service service;

    public AutoUpdateService(Service service2, String str, int i) {
        C10202j.m34178b(service2, "service");
        C10202j.m34178b(str, "packageName");
        this.service = service2;
        this.packageName = str;
        this.clientSdkVersion = i;
    }

    /* access modifiers changed from: private */
    public final AutoUpdateModel createErrorAutoUpdateModel(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new AutoUpdateModel(Status.ERROR_NETWORK);
        }
        return new AutoUpdateModel(Status.ERROR_GENERIC);
    }

    public final Single<AutoUpdateModel> loadAutoUpdateModel() {
        if (this.loading) {
            Single<AutoUpdateModel> a = Single.m10119a(new AutoUpdateModel(true));
            C10202j.m34174a((Object) a, "Single.just(AutoUpdateModel(loading = true))");
            return a;
        }
        Single<R> m = this.service.getAutoUpdateResponse(this.packageName, this.clientSdkVersion).mo18663b((C5377a) new AutoUpdateService$loadAutoUpdateModel$1(this)).mo18680d((C5377a) new AutoUpdateService$loadAutoUpdateModel$2(this)).mo18673c((C5377a) new AutoUpdateService$loadAutoUpdateModel$3(this)).mo18687f(new AutoUpdateService$loadAutoUpdateModel$4(this)).mo18699l(new AutoUpdateService$loadAutoUpdateModel$5(this)).mo18700m();
        C10202j.m34174a((Object) m, "service.getAutoUpdateRes…it) }\n        .toSingle()");
        return m;
    }
}
