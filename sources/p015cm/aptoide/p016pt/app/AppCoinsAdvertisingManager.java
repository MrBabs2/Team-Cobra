package p015cm.aptoide.p016pt.app;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.AppCoinsAdvertisingManager */
public class AppCoinsAdvertisingManager {
    private final AppCoinsService appCoinsService;

    public AppCoinsAdvertisingManager(AppCoinsService appCoinsService2) {
        this.appCoinsService = appCoinsService2;
    }

    public Single<AppCoinsAdvertisingModel> getAdvertising(String str, int i) {
        return this.appCoinsService.getValidCampaign(str, i);
    }
}
