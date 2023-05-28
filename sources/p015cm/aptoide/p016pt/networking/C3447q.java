package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.networking.q */
/* compiled from: lambda */
public final /* synthetic */ class C3447q implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ NoAuthenticationBodyInterceptorV3 f6436f;

    /* renamed from: g */
    private final /* synthetic */ BaseBody f6437g;

    public /* synthetic */ C3447q(NoAuthenticationBodyInterceptorV3 noAuthenticationBodyInterceptorV3, BaseBody baseBody) {
        this.f6436f = noAuthenticationBodyInterceptorV3;
        this.f6437g = baseBody;
    }

    public final Object call(Object obj) {
        return this.f6436f.mo13065a(this.f6437g, (String) obj);
    }
}
