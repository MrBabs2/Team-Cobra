package p015cm.aptoide.p016pt.timeline.view.follow;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;

/* renamed from: cm.aptoide.pt.timeline.view.follow.f */
/* compiled from: lambda */
public final /* synthetic */ class C4404f implements EndlessRecyclerOnScrollListener.BooleanAction {

    /* renamed from: a */
    private final /* synthetic */ TimeLineFollowersFragment f7566a;

    /* renamed from: b */
    private final /* synthetic */ List f7567b;

    public /* synthetic */ C4404f(TimeLineFollowersFragment timeLineFollowersFragment, List list) {
        this.f7566a = timeLineFollowersFragment;
        this.f7567b = list;
    }

    public final boolean call(BaseV7Response baseV7Response) {
        return this.f7566a.mo14952a(this.f7567b, (GetFollowers) baseV7Response);
    }
}
