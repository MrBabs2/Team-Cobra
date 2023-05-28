package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.comments.view.c0 */
/* compiled from: lambda */
public final /* synthetic */ class C1969c0 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ CommentsReadMoreDisplayable f4580f;

    public /* synthetic */ C1969c0(CommentsReadMoreDisplayable commentsReadMoreDisplayable) {
        this.f4580f = commentsReadMoreDisplayable;
    }

    public final void call(Object obj) {
        this.f4580f.getCommentAdder().addComment(((ListComments) obj).getDataList().getList());
    }
}
