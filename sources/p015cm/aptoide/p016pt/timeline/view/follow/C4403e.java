package p015cm.aptoide.p016pt.timeline.view.follow;

import java.util.LinkedList;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.timeline.view.follow.e */
/* compiled from: lambda */
public final /* synthetic */ class C4403e implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ TimeLineFollowFragment f7563f;

    /* renamed from: g */
    private final /* synthetic */ int[] f7564g;

    /* renamed from: h */
    private final /* synthetic */ LinkedList f7565h;

    public /* synthetic */ C4403e(TimeLineFollowFragment timeLineFollowFragment, int[] iArr, LinkedList linkedList) {
        this.f7563f = timeLineFollowFragment;
        this.f7564g = iArr;
        this.f7565h = linkedList;
    }

    public final void call(Object obj) {
        this.f7563f.mo14944a(this.f7564g, this.f7565h, (GetFollowers) obj);
    }
}
