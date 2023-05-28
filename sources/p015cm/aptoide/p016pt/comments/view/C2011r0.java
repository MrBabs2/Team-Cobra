package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.ErrorRequestListener;

/* renamed from: cm.aptoide.pt.comments.view.r0 */
/* compiled from: lambda */
public final /* synthetic */ class C2011r0 implements ErrorRequestListener {

    /* renamed from: a */
    private final /* synthetic */ RateAndReviewCommentWidget f4650a;

    public /* synthetic */ C2011r0(RateAndReviewCommentWidget rateAndReviewCommentWidget) {
        this.f4650a = rateAndReviewCommentWidget;
    }

    public final void onError(Throwable th) {
        this.f4650a.mo7972b(th);
    }
}
