package p015cm.aptoide.p016pt.home.bundles.base;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.ApplicationGraphic;

/* renamed from: cm.aptoide.pt.home.bundles.base.BonusPromotionalBundle */
public class BonusPromotionalBundle extends PromotionalBundle {
    private final int bonusPercentage;

    public BonusPromotionalBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ApplicationGraphic applicationGraphic, DownloadModel downloadModel, int i) {
        super(str, bundleType, event, str2, applicationGraphic, downloadModel);
        this.bonusPercentage = i;
    }

    public int getBonusPercentage() {
        return this.bonusPercentage;
    }
}
