package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C2634j0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialListPresenter f5464f;

    /* renamed from: g */
    private final /* synthetic */ ReactionsHomeEvent f5465g;

    public /* synthetic */ C2634j0(EditorialListPresenter editorialListPresenter, ReactionsHomeEvent reactionsHomeEvent) {
        this.f5464f = editorialListPresenter;
        this.f5465g = reactionsHomeEvent;
    }

    public final Object call(Object obj) {
        return this.f5464f.mo11433a(this.f5465g, (ReactionsResponse) obj);
    }
}
