package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.app.view.GridAppDisplayable */
public class GridAppDisplayable extends DisplayablePojo<App> {
    private NavigationTracker navigationTracker;
    private StoreContext storeContext;
    private String tag;

    public GridAppDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(Type.APPS_GROUP.getDefaultPerLineCount(), Type.APPS_GROUP.isFixedPerLineCount());
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public StoreContext getStoreContext() {
        return this.storeContext;
    }

    public String getTag() {
        return this.tag;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_app;
    }

    public GridAppDisplayable(App app, String str, NavigationTracker navigationTracker2, StoreContext storeContext2) {
        super(app);
        this.tag = str;
        this.navigationTracker = navigationTracker2;
        this.storeContext = storeContext2;
    }
}
