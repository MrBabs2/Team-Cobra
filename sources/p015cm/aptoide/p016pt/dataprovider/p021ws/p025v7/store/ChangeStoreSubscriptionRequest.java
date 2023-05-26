package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ChangeStoreSubscriptionResponse;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.ChangeStoreSubscriptionRequest */
public class ChangeStoreSubscriptionRequest extends C2185V7<ChangeStoreSubscriptionResponse, Body> {
    protected ChangeStoreSubscriptionRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_WRITE_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static ChangeStoreSubscriptionRequest m5360of(String str, ChangeStoreSubscriptionResponse.StoreSubscriptionState storeSubscriptionState, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ChangeStoreSubscriptionRequest(new Body(str, storeSubscriptionState, str2, str3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<ChangeStoreSubscriptionResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.changeStoreSubscription(z, (Body) this.body);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.ChangeStoreSubscriptionRequest$Body */
    public static class Body extends BaseBody {
        private final ChangeStoreSubscriptionResponse.StoreSubscriptionState status;
        private final String storeName;
        private String storePassSha1;
        private String storeUser;

        public Body(String str, ChangeStoreSubscriptionResponse.StoreSubscriptionState storeSubscriptionState) {
            this.storeName = str;
            this.status = storeSubscriptionState;
        }

        public ChangeStoreSubscriptionResponse.StoreSubscriptionState getStatus() {
            return this.status;
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

        public Body(String str, ChangeStoreSubscriptionResponse.StoreSubscriptionState storeSubscriptionState, String str2, String str3) {
            this.storeName = str;
            this.storePassSha1 = str3;
            this.status = storeSubscriptionState;
            this.storeUser = str2;
        }
    }
}
