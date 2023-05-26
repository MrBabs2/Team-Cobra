package p015cm.aptoide.p016pt.comments;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;

/* renamed from: cm.aptoide.pt.comments.CommentAdder */
public abstract class CommentAdder {
    protected final int itemIndex;

    public CommentAdder(int i) {
        this.itemIndex = i;
    }

    public abstract void addComment(List<Comment> list);

    public void collapseComments() {
    }
}
