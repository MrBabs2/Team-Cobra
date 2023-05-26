package p015cm.aptoide.p016pt.view.app;

import java.util.List;

/* renamed from: cm.aptoide.pt.view.app.AppRating */
public class AppRating {
    private final float average;
    private final int total;
    private final List<RatingVote> votes;

    public AppRating(float f, int i, List<RatingVote> list) {
        this.average = f;
        this.total = i;
        this.votes = list;
    }

    public float getAverage() {
        return this.average;
    }

    public int getTotal() {
        return this.total;
    }

    public List<RatingVote> getVotes() {
        return this.votes;
    }
}
