package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ChangeStoreSubscriptionResponse */
public class ChangeStoreSubscriptionResponse extends BaseV7Response {
    private StoreSubscriptionState status;
    private Store store;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.ChangeStoreSubscriptionResponse$StoreSubscriptionState */
    public enum StoreSubscriptionState {
        UNSUBSCRIBED,
        SUBSCRIBED
    }

    public StoreSubscriptionState getStatus() {
        return this.status;
    }

    public Store getStore() {
        return this.store;
    }

    public void setStatus(StoreSubscriptionState storeSubscriptionState) {
        this.status = storeSubscriptionState;
    }

    public void setStore(Store store2) {
        this.store = store2;
    }
}
