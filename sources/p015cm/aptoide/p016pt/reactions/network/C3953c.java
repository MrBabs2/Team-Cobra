package p015cm.aptoide.p016pt.reactions.network;

import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.reactions.network.c */
/* compiled from: lambda */
public final /* synthetic */ class C3953c implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ReactionsRemoteService f7042f;

    public /* synthetic */ C3953c(ReactionsRemoteService reactionsRemoteService) {
        this.f7042f = reactionsRemoteService;
    }

    public final Object call(Object obj) {
        return this.f7042f.mapErrorResponse((Throwable) obj);
    }
}
