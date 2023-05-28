package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.PostReviewRequest */
public class PostReviewRequest extends C2185V7<BaseV7Response, Body> {
    protected PostReviewRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
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
    public static PostReviewRequest m5270of(String str, String str2, String str3, Integer num, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, boolean z, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new PostReviewRequest(new Body(str, str2, str3, num, z), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.postReview((Body) this.body, true);
    }

    /* renamed from: of */
    public static PostReviewRequest m5269of(String str, String str2, Integer num, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, boolean z, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new PostReviewRequest(new Body(str, str2, num, z), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.PostReviewRequest$Body */
    public static class Body extends BaseBody {
        private final boolean appInstalled;
        private String body;
        private String packageName;
        private Integer rating;
        private String storeName;

        public Body(String str, String str2, Integer num, boolean z) {
            this.packageName = str;
            this.body = str2;
            this.rating = num;
            this.appInstalled = z;
        }

        public String getBody() {
            return this.body;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public Integer getRating() {
            return this.rating;
        }

        public String getStoreName() {
            return this.storeName;
        }

        public boolean isAppInstalled() {
            return this.appInstalled;
        }

        public void setBody(String str) {
            this.body = str;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setRating(Integer num) {
            this.rating = num;
        }

        public void setStoreName(String str) {
            this.storeName = str;
        }

        public Body(String str, String str2, String str3, Integer num, boolean z) {
            this.storeName = str;
            this.packageName = str2;
            this.body = str3;
            this.rating = num;
            this.appInstalled = z;
        }
    }
}
