package p015cm.aptoide.p016pt.view.recycler.displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.SelectableDisplayablePojo */
public abstract class SelectableDisplayablePojo<T> extends DisplayablePojo<T> {
    private boolean selected;

    public SelectableDisplayablePojo() {
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public SelectableDisplayablePojo(T t) {
        super(t);
    }
}
