package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.comments.view.CommentsAdapter;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.comments.view.ItemCommentAdderView */
public interface ItemCommentAdderView<Titem, Tadapter extends CommentsAdapter> extends CommentAdderView<Tadapter> {
    Displayable createReadMoreDisplayable(int i, Titem titem);
}
