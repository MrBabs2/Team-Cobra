package p015cm.aptoide.p016pt.home.bundles.base;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.home.bundles.base.AppHomeEvent */
public class AppHomeEvent extends HomeEvent {
    private final Application app;
    private final int appPosition;

    public AppHomeEvent(Application application, int i, HomeBundle homeBundle, int i2, HomeEvent.Type type) {
        super(homeBundle, i2, type);
        this.app = application;
        this.appPosition = i;
    }

    public Application getApp() {
        return this.app;
    }

    public int getAppPosition() {
        return this.appPosition;
    }
}
