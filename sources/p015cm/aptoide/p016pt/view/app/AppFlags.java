package p015cm.aptoide.p016pt.view.app;

import java.util.List;

/* renamed from: cm.aptoide.pt.view.app.AppFlags */
public class AppFlags {
    private final String review;
    private final List<FlagsVote> votes;

    public AppFlags(String str, List<FlagsVote> list) {
        this.review = str;
        this.votes = list;
    }

    public String getReview() {
        return this.review;
    }

    public List<FlagsVote> getVotes() {
        return this.votes;
    }
}
