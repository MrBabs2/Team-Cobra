package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;

/* renamed from: cm.aptoide.pt.comments.view.h0 */
/* compiled from: lambda */
public final /* synthetic */ class C1984h0 implements SuccessRequestListener {

    /* renamed from: f */
    private final /* synthetic */ RateAndReviewCommentWidget f4602f;

    /* renamed from: g */
    private final /* synthetic */ long f4603g;

    /* renamed from: h */
    private final /* synthetic */ boolean f4604h;

    public /* synthetic */ C1984h0(RateAndReviewCommentWidget rateAndReviewCommentWidget, long j, boolean z) {
        this.f4602f = rateAndReviewCommentWidget;
        this.f4603g = j;
        this.f4604h = z;
    }

    public final void call(Object obj) {
        this.f4602f.mo7963a(this.f4603g, this.f4604h, (BaseV7Response) obj);
    }
}
