package p015cm.aptoide.p016pt.view.recycler.displayable;

import android.content.res.Resources;
import android.view.WindowManager;
import java.util.List;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.widget.WidgetFactory;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.DisplayableGroup */
public class DisplayableGroup extends Displayable {
    private final List<Displayable> children;
    private final Resources resources;
    private final WindowManager windowManager;

    public DisplayableGroup(List<Displayable> list, WindowManager windowManager2, Resources resources2) {
        this(list, true, windowManager2, resources2);
    }

    private void computeLeftSpaces() {
        int columnSize = WidgetFactory.getColumnSize(this.resources, this.windowManager);
        int i = 0;
        for (Displayable next : this.children) {
            if (next.getSpanSize(this.windowManager, this.resources) + i > columnSize) {
                i = next.getSpanSize(this.windowManager, this.resources);
            } else {
                i += next.getSpanSize(this.windowManager, this.resources);
            }
        }
        if (i < columnSize) {
            this.children.add(new EmptyDisplayable(columnSize - i));
        }
    }

    public List<Displayable> getChildren() {
        return this.children;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getDefaultPerLineCount() {
        throw new IllegalStateException("getDefaultPerLineCount() on DisplayableGroup should not be called!");
    }

    public int getViewLayout() {
        throw new IllegalStateException("getViewLayout() on DisplayableGroup should not be called!");
    }

    DisplayableGroup(List<Displayable> list, boolean z, WindowManager windowManager2, Resources resources2) {
        this.children = list;
        this.windowManager = windowManager2;
        this.resources = resources2;
        if (z) {
            computeLeftSpaces();
        }
    }
}
