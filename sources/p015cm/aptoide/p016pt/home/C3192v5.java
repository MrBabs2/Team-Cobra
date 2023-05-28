package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.v5 */
/* compiled from: lambda */
public final /* synthetic */ class C3192v5 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ HomePresenter f6118f;

    /* renamed from: g */
    private final /* synthetic */ ReactionsHomeEvent f6119g;

    public /* synthetic */ C3192v5(HomePresenter homePresenter, ReactionsHomeEvent reactionsHomeEvent) {
        this.f6118f = homePresenter;
        this.f6119g = reactionsHomeEvent;
    }

    public final Object call(Object obj) {
        return this.f6118f.mo11730a(this.f6119g, (ReactionsResponse) obj);
    }
}
