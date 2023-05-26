package p015cm.aptoide.p016pt.view.recycler.displayable;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.FooterRowDisplayable */
public class FooterRowDisplayable extends DisplayablePojo<String> {
    public FooterRowDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_footer_text;
    }

    public FooterRowDisplayable(String str) {
        super(str);
    }
}
