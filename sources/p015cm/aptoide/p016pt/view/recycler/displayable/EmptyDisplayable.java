package p015cm.aptoide.p016pt.view.recycler.displayable;

import android.content.res.Resources;
import android.view.WindowManager;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.EmptyDisplayable */
public class EmptyDisplayable extends Displayable {
    private int spanSize = 1;

    public EmptyDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getDefaultPerLineCount() {
        return 1;
    }

    public int getSpanSize(WindowManager windowManager, Resources resources) {
        return this.spanSize;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_empty;
    }

    public EmptyDisplayable(int i) {
        this.spanSize = i;
    }
}
