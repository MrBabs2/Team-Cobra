package p015cm.aptoide.p016pt.view.recycler;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessResponse;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.h */
/* compiled from: lambda */
public final /* synthetic */ class C4670h implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ EndlessRecyclerOnScrollListener f7944f;

    /* renamed from: g */
    private final /* synthetic */ boolean f7945g;

    public /* synthetic */ C4670h(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener, boolean z) {
        this.f7944f = endlessRecyclerOnScrollListener;
        this.f7945g = z;
    }

    public final void call(Object obj) {
        this.f7944f.mo15656a(this.f7945g, (BaseV7EndlessResponse) obj);
    }
}
