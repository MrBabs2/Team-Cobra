package p015cm.aptoide.p016pt.app;

/* renamed from: cm.aptoide.pt.app.ReviewStats */
public class ReviewStats {
    private final long comments;
    private final long likes;
    private final long points;
    private final float rating;

    public ReviewStats(long j, long j2, long j3, float f) {
        this.comments = j;
        this.likes = j2;
        this.points = j3;
        this.rating = f;
    }

    public long getComments() {
        return this.comments;
    }

    public long getLikes() {
        return this.likes;
    }

    public long getPoints() {
        return this.points;
    }

    public float getRating() {
        return this.rating;
    }
}
