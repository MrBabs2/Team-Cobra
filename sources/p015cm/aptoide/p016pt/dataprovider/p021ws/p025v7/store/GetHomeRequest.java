package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.WindowManager;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHome;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.GetHomeRequest */
public class GetHomeRequest extends C2185V7<GetHome, GetHomeBody> {
    protected GetHomeRequest(GetHomeBody getHomeBody, String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(getHomeBody, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetHomeRequest m5362of(BaseRequestWithStore.StoreCredentials storeCredentials, Long l, StoreContext storeContext, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Resources resources, WindowManager windowManager) {
        BaseRequestWithStore.StoreCredentials storeCredentials2 = storeCredentials;
        Long l2 = l;
        GetHomeBody getHomeBody = new GetHomeBody(storeCredentials, WidgetsArgs.createDefault(resources, windowManager), l);
        StoreContext storeContext2 = storeContext;
        getHomeBody.setContext(storeContext);
        return new GetHomeRequest(getHomeBody, C2185V7.getHost(sharedPreferences), bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetHome> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getHome((GetHomeBody) this.body, z);
    }
}
