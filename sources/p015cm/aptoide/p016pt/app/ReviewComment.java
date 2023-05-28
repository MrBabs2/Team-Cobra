package p015cm.aptoide.p016pt.app;

/* renamed from: cm.aptoide.pt.app.ReviewComment */
public class ReviewComment {
    private final long total;
    private final String view;

    public ReviewComment(String str, long j) {
        this.view = str;
        this.total = j;
    }

    public long getTotal() {
        return this.total;
    }

    public String getView() {
        return this.view;
    }
}
