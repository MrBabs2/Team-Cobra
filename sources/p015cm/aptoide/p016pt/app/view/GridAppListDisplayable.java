package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.app.view.GridAppListDisplayable */
public class GridAppListDisplayable extends DisplayablePojo<App> {
    private String tag;

    public GridAppListDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public String getTag() {
        return this.tag;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_list_app;
    }

    public GridAppListDisplayable(App app, String str) {
        super(app);
        this.tag = str;
    }
}
