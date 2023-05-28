package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.comments.CommentAdder;
import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;

/* renamed from: cm.aptoide.pt.comments.view.t0 */
/* compiled from: lambda */
public final /* synthetic */ class C2015t0 implements SuccessRequestListener {

    /* renamed from: f */
    private final /* synthetic */ RateAndReviewCommentWidget f4657f;

    /* renamed from: g */
    private final /* synthetic */ CommentAdder f4658g;

    public /* synthetic */ C2015t0(RateAndReviewCommentWidget rateAndReviewCommentWidget, CommentAdder commentAdder) {
        this.f4657f = rateAndReviewCommentWidget;
        this.f4658g = commentAdder;
    }

    public final void call(Object obj) {
        this.f4657f.mo7966a(this.f4658g, (ListComments) obj);
    }
}
