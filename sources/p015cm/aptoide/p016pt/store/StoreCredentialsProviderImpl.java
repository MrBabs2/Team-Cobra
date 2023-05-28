package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;

/* renamed from: cm.aptoide.pt.store.StoreCredentialsProviderImpl */
public class StoreCredentialsProviderImpl implements StoreCredentialsProvider {
    private final RoomStoreRepository storeRepository;

    public StoreCredentialsProviderImpl(RoomStoreRepository roomStoreRepository) {
        this.storeRepository = roomStoreRepository;
    }

    public BaseRequestWithStore.StoreCredentials fromUrl(String str) {
        V7Url v7Url = new V7Url(str);
        Long storeId = v7Url.getStoreId();
        String storeName = v7Url.getStoreName();
        if (storeId != null) {
            return get(storeId.longValue());
        }
        if (storeName != null) {
            return get(storeName);
        }
        return new BaseRequestWithStore.StoreCredentials();
    }

    public BaseRequestWithStore.StoreCredentials get(long j) {
        RoomStore a = this.storeRepository.get(Long.valueOf(j)).mo18562a().mo41082a();
        if (a == null) {
            return new BaseRequestWithStore.StoreCredentials(j, (String) null, (String) null);
        }
        return new BaseRequestWithStore.StoreCredentials(j, a.getStoreName(), a.getUsername(), a.getPasswordSha1());
    }

    public BaseRequestWithStore.StoreCredentials get(String str) {
        RoomStore a = this.storeRepository.get(str).mo18562a().mo41082a();
        if (a == null) {
            return new BaseRequestWithStore.StoreCredentials(str, (String) null, (String) null);
        }
        return new BaseRequestWithStore.StoreCredentials(a.getStoreId(), str, a.getUsername(), a.getPasswordSha1());
    }
}
