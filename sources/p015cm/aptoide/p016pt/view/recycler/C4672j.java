package p015cm.aptoide.p016pt.view.recycler;

import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.j */
/* compiled from: lambda */
public final /* synthetic */ class C4672j implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ EndlessRecyclerOnScrollListener f7947f;

    public /* synthetic */ C4672j(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener) {
        this.f7947f = endlessRecyclerOnScrollListener;
    }

    public final void call(Object obj) {
        this.f7947f.handleLoadMoreErrorAfterWebRequest((Throwable) obj);
    }
}
