package p015cm.aptoide.p016pt.home.bundles.base;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.ApplicationGraphic;

/* renamed from: cm.aptoide.pt.home.bundles.base.VersionPromotionalBundle */
public class VersionPromotionalBundle extends PromotionalBundle {
    private final String versionName;

    public VersionPromotionalBundle(String str, HomeBundle.BundleType bundleType, Event event, String str2, ApplicationGraphic applicationGraphic, String str3, DownloadModel downloadModel) {
        super(str, bundleType, event, str2, applicationGraphic, downloadModel);
        this.versionName = str3;
    }

    public String getVersionName() {
        return this.versionName;
    }
}
