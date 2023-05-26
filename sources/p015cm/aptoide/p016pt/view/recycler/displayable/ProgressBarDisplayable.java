package p015cm.aptoide.p016pt.view.recycler.displayable;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.ProgressBarDisplayable */
public class ProgressBarDisplayable extends Displayable {
    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public int getViewLayout() {
        return C1086R.layout.row_progress_bar;
    }
}
