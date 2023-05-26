package p015cm.aptoide.p016pt.home.bundles;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.bundles.s */
/* compiled from: lambda */
public final /* synthetic */ class C2922s implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RemoteBundleDataSource f5833f;

    /* renamed from: g */
    private final /* synthetic */ boolean f5834g;

    /* renamed from: h */
    private final /* synthetic */ String f5835h;

    /* renamed from: i */
    private final /* synthetic */ boolean f5836i;

    /* renamed from: j */
    private final /* synthetic */ boolean f5837j;

    /* renamed from: k */
    private final /* synthetic */ List f5838k;

    public /* synthetic */ C2922s(RemoteBundleDataSource remoteBundleDataSource, boolean z, String str, boolean z2, boolean z3, List list) {
        this.f5833f = remoteBundleDataSource;
        this.f5834g = z;
        this.f5835h = str;
        this.f5836i = z2;
        this.f5837j = z3;
        this.f5838k = list;
    }

    public final Object call(Object obj) {
        return this.f5833f.mo12214a(this.f5834g, this.f5835h, this.f5836i, this.f5837j, this.f5838k, (GetStoreWidgets.WSWidget) obj);
    }
}
