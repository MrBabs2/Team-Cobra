package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import com.fasterxml.jackson.annotation.JsonProperty;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SimpleSetStoreRequest */
public class SimpleSetStoreRequest extends C2185V7<BaseV7Response, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SimpleSetStoreRequest$Body */
    public static class Body extends BaseBody {
        private String storeName;
        private StoreProperties storeProperties;

        public Body(String str, String str2, String str3) {
            this.storeName = str;
            this.storeProperties = new StoreProperties(str2, str3);
        }

        public String getStoreName() {
            return this.storeName;
        }

        public StoreProperties getStoreProperties() {
            return this.storeProperties;
        }

        public void setStoreName(String str) {
            this.storeName = str;
        }

        public void setStoreProperties(StoreProperties storeProperties2) {
            this.storeProperties = storeProperties2;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SimpleSetStoreRequest$StoreProperties */
    public static class StoreProperties {
        @JsonProperty("description")
        private String description;
        @JsonProperty("theme")
        private String theme;

        public StoreProperties(String str, String str2) {
            this.theme = str;
            this.description = str2;
        }

        public String getDescription() {
            return this.description;
        }

        public String getTheme() {
            return this.theme;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setTheme(String str) {
            this.theme = str;
        }
    }

    private SimpleSetStoreRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
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
    public static SimpleSetStoreRequest m5276of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new SimpleSetStoreRequest(new Body(str, str2, str3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.editStore((Body) this.body);
    }
}
