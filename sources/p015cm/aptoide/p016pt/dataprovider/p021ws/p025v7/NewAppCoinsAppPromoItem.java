package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.NewAppCoinsAppPromoItem */
public class NewAppCoinsAppPromoItem extends AppPromoItem {
    private final BonusAppcModel bonusAppcModel;

    public NewAppCoinsAppPromoItem(GetApp getApp, BonusAppcModel bonusAppcModel2) {
        super(getApp);
        this.bonusAppcModel = bonusAppcModel2;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }
}
