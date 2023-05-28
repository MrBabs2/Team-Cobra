package p015cm.aptoide.p016pt.home.bundles.base;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.base.ActionBundle */
public class ActionBundle implements HomeBundle {
    private final ActionItem actionItem;
    private final Event event;
    private final String tag;
    private final String title;
    private final HomeBundle.BundleType type;

    public ActionBundle(String str, HomeBundle.BundleType bundleType, Event event2, String str2, ActionItem actionItem2) {
        this.title = str;
        this.type = bundleType;
        this.event = event2;
        this.tag = str2;
        this.actionItem = actionItem2;
    }

    public ActionItem getActionItem() {
        return this.actionItem;
    }

    public List<?> getContent() {
        if (this.actionItem != null) {
            return Collections.emptyList();
        }
        return null;
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
