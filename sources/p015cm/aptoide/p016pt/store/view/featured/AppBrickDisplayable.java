package p015cm.aptoide.p016pt.store.view.featured;

import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.store.view.featured.AppBrickDisplayable */
public class AppBrickDisplayable extends DisplayablePojo<App> {
    private NavigationTracker navigationTracker;
    private String tag;

    public AppBrickDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(2, true);
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public String getTag() {
        return this.tag;
    }

    public int getViewLayout() {
        return C1086R.layout.brick_app_item;
    }

    public AppBrickDisplayable(App app, String str, NavigationTracker navigationTracker2) {
        super(app);
        this.tag = str;
        this.navigationTracker = navigationTracker2;
    }
}
