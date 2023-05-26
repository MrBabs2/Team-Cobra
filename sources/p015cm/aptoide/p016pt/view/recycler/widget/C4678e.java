package p015cm.aptoide.p016pt.view.recycler.widget;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.FullReview;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.reviews.RowReviewDisplayable;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.widget.e */
/* compiled from: lambda */
public final /* synthetic */ class C4678e implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ RowReviewDisplayable f7956f;

    /* renamed from: g */
    private final /* synthetic */ FragmentNavigator f7957g;

    /* renamed from: h */
    private final /* synthetic */ GetAppMeta.App f7958h;

    /* renamed from: i */
    private final /* synthetic */ FullReview f7959i;

    public /* synthetic */ C4678e(RowReviewDisplayable rowReviewDisplayable, FragmentNavigator fragmentNavigator, GetAppMeta.App app, FullReview fullReview) {
        this.f7956f = rowReviewDisplayable;
        this.f7957g = fragmentNavigator;
        this.f7958h = app;
        this.f7959i = fullReview;
    }

    public final void call(Object obj) {
        RowReviewWidget.m7673a(this.f7956f, this.f7957g, this.f7958h, this.f7959i, (Void) obj);
    }
}
