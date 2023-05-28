package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.store.k */
/* compiled from: lambda */
public final /* synthetic */ class C4249k implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ StoreUtilsProxy f7344f;

    /* renamed from: g */
    private final /* synthetic */ GetStoreMetaRequest f7345g;

    public /* synthetic */ C4249k(StoreUtilsProxy storeUtilsProxy, GetStoreMetaRequest getStoreMetaRequest) {
        this.f7344f = storeUtilsProxy;
        this.f7345g = getStoreMetaRequest;
    }

    public final Object call(Object obj) {
        return this.f7344f.mo14595a(this.f7345g, (GetStoreMeta) obj);
    }
}
