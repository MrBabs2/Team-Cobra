package p015cm.aptoide.p016pt.view.recycler.displayable;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.DisplayablePojo */
public abstract class DisplayablePojo<T> extends Displayable {
    private T pojo;

    public DisplayablePojo() {
    }

    public T getPojo() {
        return this.pojo;
    }

    public DisplayablePojo<T> setPojo(T t) {
        this.pojo = t;
        return this;
    }

    public DisplayablePojo(T t) {
        this.pojo = t;
    }
}
