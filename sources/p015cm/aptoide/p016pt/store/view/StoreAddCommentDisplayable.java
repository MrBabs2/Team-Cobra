package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.themes.StoreTheme;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.store.view.StoreAddCommentDisplayable */
public class StoreAddCommentDisplayable extends Displayable {
    private final int raisedButtonDrawable;
    private final long storeId;
    private final String storeName;
    private final StoreTheme storeTheme;

    public StoreAddCommentDisplayable() {
        this.storeId = -1;
        this.storeName = "";
        this.storeTheme = StoreTheme.DEFAULT;
        this.raisedButtonDrawable = C1086R.C1087drawable.aptoide_gradient_rounded;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getRaisedButtonDrawable() {
        return this.raisedButtonDrawable;
    }

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public StoreTheme getStoreTheme() {
        return this.storeTheme;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_add_store_comment;
    }

    public StoreAddCommentDisplayable(long j, String str, StoreTheme storeTheme2, int i) {
        this.storeId = j;
        this.storeName = str;
        this.storeTheme = storeTheme2;
        this.raisedButtonDrawable = i;
    }
}
