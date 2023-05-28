package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetHomeMetaRequest */
public class GetHomeMetaRequest extends BaseRequestWithStore<GetHomeMeta, Body> {
    private final String url;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetHomeMetaRequest$Body */
    public static class Body extends BaseBodyWithStore {
        public Body(BaseRequestWithStore.StoreCredentials storeCredentials) {
            super(storeCredentials);
        }
    }

    private GetHomeMetaRequest(Body body, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.url = str;
    }

    /* renamed from: of */
    public static GetHomeMetaRequest m5361of(BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetHomeMetaRequest(new Body(storeCredentials), (String) null, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static GetHomeMetaRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetHomeMetaRequest(new Body(storeCredentials), new V7Url(str).remove("home/getMeta").get(), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public C5368e<GetHomeMeta> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        String str = this.url;
        if (str == null) {
            str = "";
        }
        return interfaces.getHomeMeta(str, (Body) this.body, z);
    }
}
