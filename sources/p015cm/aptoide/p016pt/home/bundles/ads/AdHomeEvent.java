package p015cm.aptoide.p016pt.home.bundles.ads;

import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdHomeEvent */
public class AdHomeEvent extends HomeEvent {
    private final AdClick adClick;
    private final int position;

    public AdHomeEvent(AdClick adClick2, int i, HomeBundle homeBundle, int i2, HomeEvent.Type type) {
        super(homeBundle, i2, type);
        this.adClick = adClick2;
        this.position = i;
    }

    public AdClick getAdClick() {
        return this.adClick;
    }

    public int getPosition() {
        return this.position;
    }
}
