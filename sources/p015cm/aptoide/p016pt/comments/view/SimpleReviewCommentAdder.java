package p015cm.aptoide.p016pt.comments.view;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.comments.CommentAdder;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;

/* renamed from: cm.aptoide.pt.comments.view.SimpleReviewCommentAdder */
public class SimpleReviewCommentAdder extends CommentAdder {
    private final CommentAdderView commentAdderView;

    public SimpleReviewCommentAdder(int i, CommentAdderView commentAdderView2) {
        super(i);
        this.commentAdderView = commentAdderView2;
    }

    public void addComment(List<Comment> list) {
        int itemPosition = this.commentAdderView.getAdapter().getItemPosition(this.itemIndex + 1);
        if (itemPosition == -1) {
            itemPosition = this.commentAdderView.getAdapter().getItemCount();
        }
        int i = itemPosition - 1;
        this.commentAdderView.getAdapter().removeDisplayable(i);
        ArrayList arrayList = new ArrayList();
        this.commentAdderView.createDisplayableComments(list, arrayList);
        this.commentAdderView.getAdapter().addDisplayables(i, arrayList);
    }
}
