package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.V7Url;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetStoreRequest */
public class GetStoreRequest extends BaseRequestWithStore<GetStore, GetStoreBody> {
    private final String url;

    private GetStoreRequest(String str, GetStoreBody getStoreBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(getStoreBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.url = str;
    }

    /* renamed from: of */
    public static GetStoreRequest m5367of(BaseRequestWithStore.StoreCredentials storeCredentials, StoreContext storeContext, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        BaseRequestWithStore.StoreCredentials storeCredentials2 = storeCredentials;
        GetStoreBody getStoreBody = new GetStoreBody(storeCredentials, WidgetsArgs.createDefault(resources, windowManager));
        StoreContext storeContext2 = storeContext;
        getStoreBody.setContext(storeContext);
        return new GetStoreRequest("", getStoreBody, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static GetStoreRequest ofAction(String str, BaseRequestWithStore.StoreCredentials storeCredentials, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        BaseRequestWithStore.StoreCredentials storeCredentials2 = storeCredentials;
        String str2 = str;
        return new GetStoreRequest(new V7Url(str).remove("getStore").get(), new GetStoreBody(storeCredentials, WidgetsArgs.createDefault(resources, windowManager)), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetStore> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getStore(this.url, (GetStoreBody) this.body, z);
    }
}
