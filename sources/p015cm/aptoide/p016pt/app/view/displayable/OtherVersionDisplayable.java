package p015cm.aptoide.p016pt.app.view.displayable;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.app.view.displayable.OtherVersionDisplayable */
public class OtherVersionDisplayable extends DisplayablePojo<App> {
    private ThemeManager themeManager;

    public OtherVersionDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public int getViewLayout() {
        return C1086R.layout.other_version_row;
    }

    public OtherVersionDisplayable(App app, ThemeManager themeManager2) {
        super(app);
        this.themeManager = themeManager2;
    }
}
