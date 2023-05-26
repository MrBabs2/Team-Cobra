package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreBody */
public class GetStoreBody extends BaseBodyWithStore {
    private StoreContext context;
    private final WidgetsArgs widgetsArgs;

    public GetStoreBody(BaseRequestWithStore.StoreCredentials storeCredentials, WidgetsArgs widgetsArgs2) {
        super(storeCredentials);
        this.widgetsArgs = widgetsArgs2;
    }

    public StoreContext getContext() {
        return this.context;
    }

    public WidgetsArgs getWidgetsArgs() {
        return this.widgetsArgs;
    }

    public void setContext(StoreContext storeContext) {
        this.context = storeContext;
    }
}
