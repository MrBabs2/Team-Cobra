package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.f */
/* compiled from: lambda */
public final /* synthetic */ class C3435f implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ BodyInterceptorV3 f6411f;

    /* renamed from: g */
    private final /* synthetic */ BaseBody f6412g;

    /* renamed from: h */
    private final /* synthetic */ Authentication f6413h;

    public /* synthetic */ C3435f(BodyInterceptorV3 bodyInterceptorV3, BaseBody baseBody, Authentication authentication) {
        this.f6411f = bodyInterceptorV3;
        this.f6412g = baseBody;
        this.f6413h = authentication;
    }

    public final Object call(Object obj) {
        return this.f6411f.mo13047a(this.f6412g, this.f6413h, (String) obj);
    }
}
