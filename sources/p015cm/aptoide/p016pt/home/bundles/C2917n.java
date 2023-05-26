package p015cm.aptoide.p016pt.home.bundles;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.bundles.n */
/* compiled from: lambda */
public final /* synthetic */ class C2917n implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RemoteBundleDataSource f5821f;

    /* renamed from: g */
    private final /* synthetic */ Boolean f5822g;

    /* renamed from: h */
    private final /* synthetic */ boolean f5823h;

    /* renamed from: i */
    private final /* synthetic */ List f5824i;

    /* renamed from: j */
    private final /* synthetic */ String f5825j;

    public /* synthetic */ C2917n(RemoteBundleDataSource remoteBundleDataSource, Boolean bool, boolean z, List list, String str) {
        this.f5821f = remoteBundleDataSource;
        this.f5822g = bool;
        this.f5823h = z;
        this.f5824i = list;
        this.f5825j = str;
    }

    public final Object call(Object obj) {
        return this.f5821f.mo12212a(this.f5822g, this.f5823h, this.f5824i, this.f5825j, (GetStoreWidgets) obj);
    }
}
