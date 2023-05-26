package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetHomeBody */
public class GetHomeBody extends GetStoreBody {
    private Long userId;

    public GetHomeBody(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs, Long l) {
        super(storeCredentials, widgetsArgs);
        this.userId = l;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }
}
