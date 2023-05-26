package p015cm.aptoide.p016pt.comments.view;

import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.comments.CommentAdder;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;

/* renamed from: cm.aptoide.pt.comments.view.ConcreteItemCommentAdder */
public class ConcreteItemCommentAdder<T> extends CommentAdder {
    private final ItemCommentAdderView commentAdderView;
    private final T review;

    public ConcreteItemCommentAdder(int i, ItemCommentAdderView itemCommentAdderView, T t) {
        super(i);
        this.commentAdderView = itemCommentAdderView;
        this.review = t;
    }

    public void addComment(List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        this.commentAdderView.createDisplayableComments(list, arrayList);
        int itemPosition = this.commentAdderView.getAdapter().getItemPosition(this.itemIndex);
        if (list.size() > 2) {
            arrayList.add(this.commentAdderView.createReadMoreDisplayable(itemPosition, this.review));
        }
        this.commentAdderView.getAdapter().addDisplayables(itemPosition + 1, arrayList);
    }

    public void collapseComments() {
        CommentsAdapter adapter = this.commentAdderView.getAdapter();
        int itemPosition = adapter.getItemPosition(this.itemIndex);
        int itemPosition2 = adapter.getItemPosition(this.itemIndex + 1);
        if (itemPosition2 == -1) {
            itemPosition2 = this.commentAdderView.getAdapter().getItemCount();
        }
        adapter.removeDisplayables(itemPosition + 1, itemPosition2 - 1);
    }
}
