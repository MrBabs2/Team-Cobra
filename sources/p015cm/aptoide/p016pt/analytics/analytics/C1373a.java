package p015cm.aptoide.p016pt.analytics.analytics;

import p015cm.aptoide.analytics.implementation.network.AnalyticsBaseBody;
import p015cm.aptoide.p016pt.networking.Authentication;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.analytics.analytics.a */
/* compiled from: lambda */
public final /* synthetic */ class C1373a implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AnalyticsBodyInterceptorV7 f3835f;

    /* renamed from: g */
    private final /* synthetic */ AnalyticsBaseBody f3836g;

    public /* synthetic */ C1373a(AnalyticsBodyInterceptorV7 analyticsBodyInterceptorV7, AnalyticsBaseBody analyticsBaseBody) {
        this.f3835f = analyticsBodyInterceptorV7;
        this.f3836g = analyticsBaseBody;
    }

    public final Object call(Object obj) {
        return this.f3835f.mo6794a(this.f3836g, (Authentication) obj);
    }
}
