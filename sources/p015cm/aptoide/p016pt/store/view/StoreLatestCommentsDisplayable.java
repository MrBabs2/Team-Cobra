package p015cm.aptoide.p016pt.store.view;

import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.store.view.StoreLatestCommentsDisplayable */
public class StoreLatestCommentsDisplayable extends Displayable {
    private final List<Comment> comments;
    private final long storeId;
    private String storeName;
    private ThemeManager themeManager;

    public StoreLatestCommentsDisplayable() {
        this.storeId = -1;
        this.comments = Collections.emptyList();
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_latest_store_comments;
    }

    public StoreLatestCommentsDisplayable(long j, String str, List<Comment> list, ThemeManager themeManager2) {
        this.storeId = j;
        this.storeName = str;
        this.comments = list;
        this.themeManager = themeManager2;
    }
}
