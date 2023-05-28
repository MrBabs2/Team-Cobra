package p015cm.aptoide.p016pt.home.bundles.base;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.home.bundles.base.AppBundle */
public class AppBundle implements HomeBundle {
    private final String actionTag;
    private final List<Application> apps;
    private final Event event;
    private final String tag;
    private final String title;
    private final HomeBundle.BundleType type;

    public AppBundle(String str, List<Application> list, HomeBundle.BundleType bundleType, Event event2, String str2, String str3) {
        this.title = str;
        this.apps = list;
        this.type = bundleType;
        this.event = event2;
        this.tag = str2;
        this.actionTag = str3;
    }

    public String getActionTag() {
        return this.actionTag;
    }

    public List<Application> getApps() {
        return this.apps;
    }

    public List<?> getContent() {
        return this.apps;
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
