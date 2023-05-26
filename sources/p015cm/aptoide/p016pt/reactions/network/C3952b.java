package p015cm.aptoide.p016pt.reactions.network;

import p123rx.p126m.C5379n;
import retrofit2.Response;

/* renamed from: cm.aptoide.pt.reactions.network.b */
/* compiled from: lambda */
public final /* synthetic */ class C3952b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ ReactionsRemoteService f7041f;

    public /* synthetic */ C3952b(ReactionsRemoteService reactionsRemoteService) {
        this.f7041f = reactionsRemoteService;
    }

    public final Object call(Object obj) {
        return this.f7041f.mapResponse((Response) obj);
    }
}
