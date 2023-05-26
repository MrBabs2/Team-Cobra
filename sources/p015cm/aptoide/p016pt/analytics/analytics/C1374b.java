package p015cm.aptoide.p016pt.analytics.analytics;

import p015cm.aptoide.analytics.implementation.network.AnalyticsBaseBody;
import p015cm.aptoide.p016pt.networking.Authentication;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.analytics.analytics.b */
/* compiled from: lambda */
public final /* synthetic */ class C1374b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AnalyticsBodyInterceptorV7 f3837f;

    /* renamed from: g */
    private final /* synthetic */ Authentication f3838g;

    /* renamed from: h */
    private final /* synthetic */ AnalyticsBaseBody f3839h;

    public /* synthetic */ C1374b(AnalyticsBodyInterceptorV7 analyticsBodyInterceptorV7, Authentication authentication, AnalyticsBaseBody analyticsBaseBody) {
        this.f3837f = analyticsBodyInterceptorV7;
        this.f3838g = authentication;
        this.f3839h = analyticsBaseBody;
    }

    public final Object call(Object obj) {
        return this.f3837f.mo6793a(this.f3838g, this.f3839h, (String) obj);
    }
}
