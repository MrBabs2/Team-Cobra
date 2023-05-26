package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionAppsRequest */
public class GetPromotionAppsRequest extends C2185V7<GetPromotionAppsResponse, Body> {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionAppsRequest$Body */
    public static class Body extends BaseBody {
        private String promotionId;

        public Body(String str) {
            this.promotionId = str;
        }

        public String getPromotionId() {
            return this.promotionId;
        }
    }

    public GetPromotionAppsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    /* renamed from: of */
    public static GetPromotionAppsRequest m5358of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        return new GetPromotionAppsRequest(new Body(str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences, appBundlesVisibilityManager2);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetPromotionAppsResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getPromotionApps(30, (Body) this.body, z, this.appBundlesVisibilityManager.shouldEnableAppBundles());
    }
}
