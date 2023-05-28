package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionsRequest */
public class GetPromotionsRequest extends C2185V7<GetPromotionsResponse, Body> {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionsRequest$Body */
    public static class Body extends BaseBody {
        private String type;

        public Body(String str) {
            this.type = str;
        }

        public String getType() {
            return this.type;
        }
    }

    public GetPromotionsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7.20190625/");
        return sb.toString();
    }

    /* renamed from: of */
    public static GetPromotionsRequest m5359of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        return new GetPromotionsRequest(new Body(str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager2);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetPromotionsResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getPromotions((Body) this.body, z, this.appBundlesVisibilityManager.shouldEnableAppBundles());
    }
}
