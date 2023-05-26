package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.e */
/* compiled from: lambda */
public final /* synthetic */ class C3434e implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ BodyInterceptorV3 f6409f;

    /* renamed from: g */
    private final /* synthetic */ BaseBody f6410g;

    public /* synthetic */ C3434e(BodyInterceptorV3 bodyInterceptorV3, BaseBody baseBody) {
        this.f6409f = bodyInterceptorV3;
        this.f6410g = baseBody;
    }

    public final Object call(Object obj) {
        return this.f6409f.mo13048a(this.f6410g, (Authentication) obj);
    }
}
