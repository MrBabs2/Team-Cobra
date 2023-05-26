package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.app.AppCoinsAdvertisingModel;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;

/* renamed from: cm.aptoide.pt.app.view.AppCoinsViewModel */
public class AppCoinsViewModel {
    private final AppCoinsAdvertisingModel advertisingModel;
    private final BonusAppcModel bonusAppcModel;
    private final boolean hasBilling;
    private final boolean loading;

    public AppCoinsViewModel(boolean z, boolean z2, AppCoinsAdvertisingModel appCoinsAdvertisingModel, BonusAppcModel bonusAppcModel2) {
        this.loading = z;
        this.hasBilling = z2;
        this.advertisingModel = appCoinsAdvertisingModel;
        this.bonusAppcModel = bonusAppcModel2;
    }

    public AppCoinsAdvertisingModel getAdvertisingModel() {
        return this.advertisingModel;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public boolean hasAdvertising() {
        AppCoinsAdvertisingModel appCoinsAdvertisingModel = this.advertisingModel;
        if (appCoinsAdvertisingModel != null) {
            return appCoinsAdvertisingModel.getHasAdvertising();
        }
        return false;
    }

    public boolean hasBilling() {
        return this.hasBilling;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public AppCoinsViewModel() {
        this.loading = false;
        this.hasBilling = false;
        this.advertisingModel = new AppCoinsAdvertisingModel();
        this.bonusAppcModel = new BonusAppcModel(false, 0);
    }
}
