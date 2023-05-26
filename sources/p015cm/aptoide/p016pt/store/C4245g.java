package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.store.g */
/* compiled from: lambda */
public final /* synthetic */ class C4245g implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ GetStoreMetaRequest f7336f;

    /* renamed from: g */
    private final /* synthetic */ RoomStoreRepository f7337g;

    public /* synthetic */ C4245g(GetStoreMetaRequest getStoreMetaRequest, RoomStoreRepository roomStoreRepository) {
        this.f7336f = getStoreMetaRequest;
        this.f7337g = roomStoreRepository;
    }

    public final Object call(Object obj) {
        return StoreUtils.saveStore(((GetStoreMeta) obj).getData(), this.f7336f, this.f7337g).mo18593a(C5368e.m10257c((GetStoreMeta) obj));
    }
}
