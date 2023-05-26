package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.store.view.GridStoreDisplayable */
public class GridStoreDisplayable extends DisplayablePojo<Store> {
    private String origin = "";
    private StoreAnalytics storeAnalytics;

    public GridStoreDisplayable(Store store, String str, StoreAnalytics storeAnalytics2) {
        super(store);
        this.origin = str;
        this.storeAnalytics = storeAnalytics2;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(Type.STORES_GROUP.getDefaultPerLineCount(), Type.STORES_GROUP.isFixedPerLineCount());
    }

    public String getOrigin() {
        return this.origin;
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_store;
    }

    public GridStoreDisplayable(Store store) {
        super(store);
    }

    public GridStoreDisplayable() {
    }
}
