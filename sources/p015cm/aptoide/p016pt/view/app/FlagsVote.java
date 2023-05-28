package p015cm.aptoide.p016pt.view.app;

/* renamed from: cm.aptoide.pt.view.app.FlagsVote */
public class FlagsVote {
    private final int count;
    private final VoteType voteType;

    /* renamed from: cm.aptoide.pt.view.app.FlagsVote$VoteType */
    public enum VoteType {
        FAKE,
        FREEZE,
        GOOD,
        LICENSE,
        VIRUS
    }

    public FlagsVote(int i, VoteType voteType2) {
        this.count = i;
        this.voteType = voteType2;
    }

    public int getCount() {
        return this.count;
    }

    public VoteType getVoteType() {
        return this.voteType;
    }
}
