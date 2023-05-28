package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.dataprovider.interfaces.SuccessRequestListener;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.d */
/* compiled from: lambda */
public final /* synthetic */ class C4242d implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ SuccessRequestListener f7332f;

    public /* synthetic */ C4242d(SuccessRequestListener successRequestListener) {
        this.f7332f = successRequestListener;
    }

    public final void call(Object obj) {
        StoreUtils.m7275a(this.f7332f, (GetStoreMeta) obj);
    }
}
