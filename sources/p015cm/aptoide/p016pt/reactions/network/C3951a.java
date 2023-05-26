package p015cm.aptoide.p016pt.reactions.network;

import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.reactions.network.a */
/* compiled from: lambda */
public final /* synthetic */ class C3951a implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ReactionsRemoteService f7040f;

    public /* synthetic */ C3951a(ReactionsRemoteService reactionsRemoteService) {
        this.f7040f = reactionsRemoteService;
    }

    public final Object call(Object obj) {
        return this.f7040f.mapToTopReactionsList((TopReactionsResponse) obj);
    }
}
