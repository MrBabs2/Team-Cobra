package p015cm.aptoide.p016pt.timeline.view.follow;

import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;

/* renamed from: cm.aptoide.pt.timeline.view.follow.d */
/* compiled from: lambda */
public final /* synthetic */ class C4402d implements EndlessRecyclerOnScrollListener.OnEndlessFinish {

    /* renamed from: a */
    private final /* synthetic */ TimeLineFollowFragment f7561a;

    /* renamed from: b */
    private final /* synthetic */ int[] f7562b;

    public /* synthetic */ C4402d(TimeLineFollowFragment timeLineFollowFragment, int[] iArr) {
        this.f7561a = timeLineFollowFragment;
        this.f7562b = iArr;
    }

    public final void onEndlessFinish(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener) {
        this.f7561a.mo14943a(this.f7562b, endlessRecyclerOnScrollListener);
    }
}
