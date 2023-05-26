package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.store.view.StoreGridHeaderDisplayable */
public class StoreGridHeaderDisplayable extends Displayable {
    private final String marketName;
    private final Model model;
    private NavigationTracker navigationTracker;
    private final StoreTabNavigator storeTabNavigator;
    private final int textColor;
    private final GetStoreWidgets.WSWidget wsWidget;

    /* renamed from: cm.aptoide.pt.store.view.StoreGridHeaderDisplayable$Model */
    public static class Model {
        private boolean moreVisible = true;
        private final StoreContext storeContext;
        private final String storeTheme;
        private final String tag;

        Model(String str, String str2, StoreContext storeContext2) {
            this.storeTheme = str;
            this.tag = str2;
            this.storeContext = storeContext2;
        }

        public StoreContext getStoreContext() {
            return this.storeContext;
        }

        public String getStoreTheme() {
            return this.storeTheme;
        }

        public String getTag() {
            return this.tag;
        }

        public boolean isMoreVisible() {
            return this.moreVisible;
        }

        public void setMoreVisible(boolean z) {
            this.moreVisible = z;
        }
    }

    public StoreGridHeaderDisplayable() {
        this((String) null, (GetStoreWidgets.WSWidget) null, (String) null, (String) null, (StoreContext) null, (StoreTabNavigator) null, (NavigationTracker) null, 0);
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public String getMarketName() {
        return this.marketName;
    }

    public Model getModel() {
        return this.model;
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public StoreTabNavigator getStoreTabNavigator() {
        return this.storeTabNavigator;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_header;
    }

    public GetStoreWidgets.WSWidget getWsWidget() {
        return this.wsWidget;
    }

    public StoreGridHeaderDisplayable(String str, GetStoreWidgets.WSWidget wSWidget, String str2, String str3, StoreContext storeContext, StoreTabNavigator storeTabNavigator2, NavigationTracker navigationTracker2, int i) {
        this.model = new Model(str2, str3, storeContext);
        this.wsWidget = wSWidget;
        this.storeTabNavigator = storeTabNavigator2;
        this.navigationTracker = navigationTracker2;
        this.marketName = str;
        this.textColor = i;
    }

    public StoreGridHeaderDisplayable(String str, GetStoreWidgets.WSWidget wSWidget, StoreTabNavigator storeTabNavigator2, NavigationTracker navigationTracker2, int i) {
        this(str, wSWidget, (String) null, (String) null, (StoreContext) null, storeTabNavigator2, navigationTracker2, i);
    }
}
