package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BaseBodyWithStore */
public class BaseBodyWithStore extends BaseBody {
    private Long storeId;
    private String storeName;
    private String storePassSha1;
    private String storeUser;

    public BaseBodyWithStore() {
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStorePassSha1() {
        return this.storePassSha1;
    }

    public String getStoreUser() {
        return this.storeUser;
    }

    public BaseBodyWithStore(BaseRequestWithStore.StoreCredentials storeCredentials) {
        this.storeId = storeCredentials.getId();
        this.storeName = storeCredentials.getName();
        this.storeUser = storeCredentials.getUsername();
        this.storePassSha1 = storeCredentials.getPasswordSha1();
    }
}
