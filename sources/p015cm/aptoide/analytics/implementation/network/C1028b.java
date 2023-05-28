package p015cm.aptoide.analytics.implementation.network;

import p015cm.aptoide.analytics.implementation.data.Event;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.analytics.implementation.network.b */
/* compiled from: lambda */
public final /* synthetic */ class C1028b implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RetrofitAptoideBiService f3416f;

    /* renamed from: g */
    private final /* synthetic */ Event f3417g;

    public /* synthetic */ C1028b(RetrofitAptoideBiService retrofitAptoideBiService, Event event) {
        this.f3416f = retrofitAptoideBiService;
        this.f3417g = event;
    }

    public final Object call(Object obj) {
        return this.f3416f.mo5199a(this.f3417g, obj);
    }
}
