package p015cm.aptoide.p016pt.app.appsflyer;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/app/appsflyer/AppsFlyerManager;", "", "appsFlyerRepository", "Lcm/aptoide/pt/app/appsflyer/AppsFlyerRepository;", "(Lcm/aptoide/pt/app/appsflyer/AppsFlyerRepository;)V", "registerImpression", "Lrx/Single;", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.appsflyer.AppsFlyerManager */
/* compiled from: AppsFlyerManager.kt */
public final class AppsFlyerManager {
    private final AppsFlyerRepository appsFlyerRepository;

    public AppsFlyerManager(AppsFlyerRepository appsFlyerRepository2) {
        C10202j.m34178b(appsFlyerRepository2, "appsFlyerRepository");
        this.appsFlyerRepository = appsFlyerRepository2;
    }

    public final Single<Boolean> registerImpression() {
        return this.appsFlyerRepository.registerImpression();
    }
}
