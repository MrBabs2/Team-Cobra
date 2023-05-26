package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.ClaimPromotionRequest */
public class ClaimPromotionRequest extends C2185V7<BaseV7Response, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.ClaimPromotionRequest$Body */
    public static class Body extends BaseBody {
        private final String packageName;
        private final String promotionId;
        private final String walletAddress;

        public Body(String str, String str2, String str3) {
            this.walletAddress = str;
            this.packageName = str2;
            this.promotionId = str3;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getPromotionId() {
            return this.promotionId;
        }

        public String getWalletAddress() {
            return this.walletAddress;
        }
    }

    public ClaimPromotionRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
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
    public static ClaimPromotionRequest m5356of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new ClaimPromotionRequest(new Body(str, str2, str3), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.claimPromotion((Body) this.body, true);
    }
}
