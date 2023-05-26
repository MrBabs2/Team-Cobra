package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home;

import p015cm.aptoide.p016pt.bonus.BonusAppcModel;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.home.EditorialActionItem */
public class EditorialActionItem {
    private ActionItemResponse actionItemResponse;
    private BonusAppcModel bonusAppcModel;

    public EditorialActionItem(ActionItemResponse actionItemResponse2, BonusAppcModel bonusAppcModel2) {
        this.actionItemResponse = actionItemResponse2;
        this.bonusAppcModel = bonusAppcModel2;
    }

    public ActionItemResponse getActionItemResponse() {
        return this.actionItemResponse;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }
}
