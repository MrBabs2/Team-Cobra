package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.comments.CommentAdder;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.comments.view.CommentsReadMoreDisplayable */
public class CommentsReadMoreDisplayable extends Displayable {
    private final CommentAdder commentAdder;
    private final boolean isReview;
    private final int next;
    private final long resourceId;

    public CommentsReadMoreDisplayable() {
        this(-1, true, 0, (CommentAdder) null);
    }

    public CommentAdder getCommentAdder() {
        return this.commentAdder;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getNext() {
        return this.next;
    }

    public long getResourceId() {
        return this.resourceId;
    }

    public int getViewLayout() {
        return C1086R.layout.comments_read_more_layout;
    }

    public boolean isReview() {
        return this.isReview;
    }

    public CommentsReadMoreDisplayable(long j, boolean z, int i, CommentAdder commentAdder2) {
        this.commentAdder = commentAdder2;
        this.next = i;
        this.resourceId = j;
        this.isReview = z;
    }
}
