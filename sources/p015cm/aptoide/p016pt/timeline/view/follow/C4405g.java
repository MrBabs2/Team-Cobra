package p015cm.aptoide.p016pt.timeline.view.follow;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;

/* renamed from: cm.aptoide.pt.timeline.view.follow.g */
/* compiled from: lambda */
public final /* synthetic */ class C4405g implements EndlessRecyclerOnScrollListener.BooleanAction {

    /* renamed from: a */
    private final /* synthetic */ TimeLineFollowingFragment f7568a;

    /* renamed from: b */
    private final /* synthetic */ List f7569b;

    public /* synthetic */ C4405g(TimeLineFollowingFragment timeLineFollowingFragment, List list) {
        this.f7568a = timeLineFollowingFragment;
        this.f7569b = list;
    }

    public final boolean call(BaseV7Response baseV7Response) {
        return this.f7568a.mo14955a(this.f7569b, (GetFollowers) baseV7Response);
    }
}
