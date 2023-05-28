package p015cm.aptoide.p016pt.app.view;

/* renamed from: cm.aptoide.pt.app.view.Scrollable */
public interface Scrollable {

    /* renamed from: cm.aptoide.pt.app.view.Scrollable$Position */
    public enum Position {
        FIRST,
        LAST
    }

    void itemAdded(int i);

    void itemChanged(int i);

    void itemRemoved(int i);

    void scroll(Position position);
}
