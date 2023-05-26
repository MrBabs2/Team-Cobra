package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.g */
/* compiled from: lambda */
public final /* synthetic */ class C3436g implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ BodyInterceptorV7 f6414f;

    /* renamed from: g */
    private final /* synthetic */ BaseBody f6415g;

    public /* synthetic */ C3436g(BodyInterceptorV7 bodyInterceptorV7, BaseBody baseBody) {
        this.f6414f = bodyInterceptorV7;
        this.f6415g = baseBody;
    }

    public final Object call(Object obj) {
        return this.f6414f.mo13051a(this.f6415g, (Authentication) obj);
    }
}
