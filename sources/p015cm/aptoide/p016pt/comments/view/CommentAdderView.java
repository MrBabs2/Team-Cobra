package p015cm.aptoide.p016pt.comments.view;

import java.util.List;
import p015cm.aptoide.p016pt.comments.view.CommentsAdapter;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Comment;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.comments.view.CommentAdderView */
public interface CommentAdderView<Tadapter extends CommentsAdapter> {
    void createDisplayableComments(List<Comment> list, List<Displayable> list2);

    Tadapter getAdapter();
}
