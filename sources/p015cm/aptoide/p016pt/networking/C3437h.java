package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.h */
/* compiled from: lambda */
public final /* synthetic */ class C3437h implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ BodyInterceptorV7 f6416f;

    /* renamed from: g */
    private final /* synthetic */ Authentication f6417g;

    /* renamed from: h */
    private final /* synthetic */ BaseBody f6418h;

    public /* synthetic */ C3437h(BodyInterceptorV7 bodyInterceptorV7, Authentication authentication, BaseBody baseBody) {
        this.f6416f = bodyInterceptorV7;
        this.f6417g = authentication;
        this.f6418h = baseBody;
    }

    public final Object call(Object obj) {
        return this.f6416f.mo13050a(this.f6417g, this.f6418h, (String) obj);
    }
}
