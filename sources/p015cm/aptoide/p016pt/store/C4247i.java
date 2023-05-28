package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.store.i */
/* compiled from: lambda */
public final /* synthetic */ class C4247i implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ AptoideAccountManager f7341f;

    /* renamed from: g */
    private final /* synthetic */ BaseRequestWithStore.StoreCredentials f7342g;

    public /* synthetic */ C4247i(AptoideAccountManager aptoideAccountManager, BaseRequestWithStore.StoreCredentials storeCredentials) {
        this.f7341f = aptoideAccountManager;
        this.f7342g = storeCredentials;
    }

    public final Object call(Object obj) {
        return StoreUtilsProxy.m7276a(this.f7341f, this.f7342g, (GetStoreMeta) obj);
    }
}
