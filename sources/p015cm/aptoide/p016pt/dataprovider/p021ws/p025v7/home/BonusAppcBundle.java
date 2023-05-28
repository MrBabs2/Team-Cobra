package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home;

import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.BonusAppcBundle */
public class BonusAppcBundle {
    private final BonusAppcModel bonusAppcModel;
    private final ListApps listApps;

    public BonusAppcBundle(ListApps listApps2, BonusAppcModel bonusAppcModel2) {
        this.listApps = listApps2;
        this.bonusAppcModel = bonusAppcModel2;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public ListApps getListApps() {
        return this.listApps;
    }
}
