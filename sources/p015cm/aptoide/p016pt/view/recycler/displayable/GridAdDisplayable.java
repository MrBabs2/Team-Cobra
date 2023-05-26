package p015cm.aptoide.p016pt.view.recycler.displayable;

import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.GridAdDisplayable */
public class GridAdDisplayable extends DisplayablePojo<MinimalAd> {
    private NavigationTracker navigationTracker;
    private String tag;

    public GridAdDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(3, false);
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public String getTag() {
        return this.tag;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_ad;
    }

    public GridAdDisplayable(MinimalAd minimalAd, String str, NavigationTracker navigationTracker2) {
        super(minimalAd);
        this.tag = str;
        this.navigationTracker = navigationTracker2;
    }
}
