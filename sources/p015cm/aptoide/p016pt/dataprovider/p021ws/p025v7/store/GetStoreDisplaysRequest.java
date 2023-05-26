package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreDisplays;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreDisplaysRequest */
public class GetStoreDisplaysRequest extends BaseRequestWithStore<GetStoreDisplays, Body> {
    private String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreDisplaysRequest$Body */
    public static class Body extends BaseBodyWithStore {
        public Body(BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
        }
    }

    GetStoreDisplaysRequest(String str, Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.url = str;
    }

    public static GetStoreDisplaysRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetStoreDisplaysRequest(new V7Url(str).remove("getStoreDisplays").get(), new Body(storeCredentials), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    /* access modifiers changed from: protected */
    public C5368e<GetStoreDisplays> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getStoreDisplays(this.url, (Body) this.body, z);
    }
}
