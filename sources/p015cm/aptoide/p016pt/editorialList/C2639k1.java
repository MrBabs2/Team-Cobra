package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.k1 */
/* compiled from: lambda */
public final /* synthetic */ class C2639k1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialListPresenter f5470f;

    /* renamed from: g */
    private final /* synthetic */ EditorialHomeEvent f5471g;

    public /* synthetic */ C2639k1(EditorialListPresenter editorialListPresenter, EditorialHomeEvent editorialHomeEvent) {
        this.f5470f = editorialListPresenter;
        this.f5471g = editorialHomeEvent;
    }

    public final Object call(Object obj) {
        return this.f5470f.mo11432a(this.f5471g, (ReactionsResponse) obj);
    }
}
