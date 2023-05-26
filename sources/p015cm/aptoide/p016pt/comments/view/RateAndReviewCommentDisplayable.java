package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.comments.CommentAdder;
import p015cm.aptoide.p016pt.comments.ReviewWithAppName;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.comments.view.RateAndReviewCommentDisplayable */
public class RateAndReviewCommentDisplayable extends DisplayablePojo<ReviewWithAppName> {
    private CommentAdder commentAdder;
    private int numberComments;
    private UserFeedbackAnalytics userFeedbackAnalytics;

    public RateAndReviewCommentDisplayable() {
    }

    public CommentAdder getCommentAdder() {
        return this.commentAdder;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getNumberComments() {
        return this.numberComments;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_rate_and_review;
    }

    public void sendVoteDownEvent() {
        this.userFeedbackAnalytics.sendVoteDownEvent();
    }

    public void sendVoteUpEvent() {
        this.userFeedbackAnalytics.sendVoteUpEvent();
    }

    public RateAndReviewCommentDisplayable(ReviewWithAppName reviewWithAppName, CommentAdder commentAdder2, int i, UserFeedbackAnalytics userFeedbackAnalytics2) {
        super(reviewWithAppName);
        this.commentAdder = commentAdder2;
        this.numberComments = i;
        this.userFeedbackAnalytics = userFeedbackAnalytics2;
    }
}
