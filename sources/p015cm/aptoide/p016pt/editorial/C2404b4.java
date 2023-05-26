package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.reactions.ReactionEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorial.b4 */
/* compiled from: lambda */
public final /* synthetic */ class C2404b4 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ EditorialPresenter f5132f;

    /* renamed from: g */
    private final /* synthetic */ ReactionEvent f5133g;

    public /* synthetic */ C2404b4(EditorialPresenter editorialPresenter, ReactionEvent reactionEvent) {
        this.f5132f = editorialPresenter;
        this.f5133g = reactionEvent;
    }

    public final Object call(Object obj) {
        return this.f5132f.mo11156a(this.f5133g, (ReactionsResponse) obj);
    }
}
