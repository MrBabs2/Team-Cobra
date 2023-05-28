package p015cm.aptoide.p016pt.store;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;

/* renamed from: cm.aptoide.pt.store.StoreCredentialsProvider */
public interface StoreCredentialsProvider {
    BaseRequestWithStore.StoreCredentials fromUrl(String str);

    BaseRequestWithStore.StoreCredentials get(long j);

    BaseRequestWithStore.StoreCredentials get(String str);
}
