package p015cm.aptoide.p016pt.comments;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Review;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.comments.c */
/* compiled from: lambda */
public final /* synthetic */ class C1958c implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ Review f4570f;

    public /* synthetic */ C1958c(Review review) {
        this.f4570f = review;
    }

    public final Object call(Object obj) {
        Review review = this.f4570f;
        Review unused = review.setCommentList((ListComments) obj);
        return review;
    }
}
