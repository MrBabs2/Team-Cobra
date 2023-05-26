package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreDisplays;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.store.view.GridDisplayDisplayable */
public class GridDisplayDisplayable extends DisplayablePojo<GetStoreDisplays.EventImage> {
    private AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private StoreContext storeContext;
    private String storeName;
    private String storeTheme;
    private String tag;

    public GridDisplayDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(2, true);
    }

    public AptoideInstalledAppsRepository getInstalledRepository() {
        return this.aptoideInstalledAppsRepository;
    }

    public StoreContext getStoreContext() {
        return this.storeContext;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public String getTag() {
        return this.tag;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_display;
    }

    public GridDisplayDisplayable(GetStoreDisplays.EventImage eventImage, String str, String str2, StoreContext storeContext2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2) {
        super(eventImage);
        this.storeTheme = str;
        this.tag = str2;
        this.storeContext = storeContext2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
    }
}
