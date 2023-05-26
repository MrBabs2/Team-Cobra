package p015cm.aptoide.p016pt.home.bundles.base;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.ApplicationGraphic;

/* renamed from: cm.aptoide.pt.home.bundles.base.PromotionalBundle */
public class PromotionalBundle implements HomeBundle {
    private final ApplicationGraphic app;
    private final DownloadModel downloadModel;
    private final Event event;
    private final String tag;
    private final String title;
    private final HomeBundle.BundleType type;

    public PromotionalBundle(String str, HomeBundle.BundleType bundleType, Event event2, String str2, ApplicationGraphic applicationGraphic, DownloadModel downloadModel2) {
        this.title = str;
        this.type = bundleType;
        this.event = event2;
        this.tag = str2;
        this.app = applicationGraphic;
        this.downloadModel = downloadModel2;
    }

    public ApplicationGraphic getApp() {
        return this.app;
    }

    public List<?> getContent() {
        if (this.app != null) {
            return Collections.emptyList();
        }
        return null;
    }

    public DownloadModel getDownloadModel() {
        return this.downloadModel;
    }

    public Event getEvent() {
        return this.event;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTitle() {
        return this.title;
    }

    public HomeBundle.BundleType getType() {
        return this.type;
    }
}
