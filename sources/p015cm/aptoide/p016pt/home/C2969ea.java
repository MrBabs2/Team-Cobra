package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.ea */
/* compiled from: lambda */
public final /* synthetic */ class C2969ea implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ HomePresenter f5902f;

    /* renamed from: g */
    private final /* synthetic */ EditorialHomeEvent f5903g;

    public /* synthetic */ C2969ea(HomePresenter homePresenter, EditorialHomeEvent editorialHomeEvent) {
        this.f5902f = homePresenter;
        this.f5903g = editorialHomeEvent;
    }

    public final Object call(Object obj) {
        return this.f5902f.mo11729a(this.f5903g, (ReactionsResponse) obj);
    }
}
