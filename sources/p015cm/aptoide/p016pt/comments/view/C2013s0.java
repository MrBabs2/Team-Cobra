package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;

/* renamed from: cm.aptoide.pt.comments.view.s0 */
/* compiled from: lambda */
public final /* synthetic */ class C2013s0 implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ RateAndReviewCommentWidget f4653a;

    public /* synthetic */ C2013s0(RateAndReviewCommentWidget rateAndReviewCommentWidget) {
        this.f4653a = rateAndReviewCommentWidget;
    }

    public final void onError(Throwable th) {
        this.f4653a.mo7969a(th);
    }
}
