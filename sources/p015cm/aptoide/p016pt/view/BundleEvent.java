package p015cm.aptoide.p016pt.view;

/* renamed from: cm.aptoide.pt.view.BundleEvent */
public class BundleEvent {
    private final String action;
    private final String title;

    public BundleEvent(String str, String str2) {
        this.title = str;
        this.action = str2;
    }

    public String getAction() {
        return this.action;
    }

    public String getTitle() {
        return this.title;
    }
}
