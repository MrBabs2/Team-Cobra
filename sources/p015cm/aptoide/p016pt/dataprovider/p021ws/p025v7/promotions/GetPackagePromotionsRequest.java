package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPackagePromotionsRequest */
public class GetPackagePromotionsRequest extends C2185V7<GetPackagePromotionsResponse, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPackagePromotionsRequest$Body */
    public static class Body extends BaseBody {
        private String packageName;

        public Body(String str) {
            this.packageName = str;
        }

        public String getPackageName() {
            return this.packageName;
        }
    }

    public GetPackagePromotionsRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: of */
    public static GetPackagePromotionsRequest m5357of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new GetPackagePromotionsRequest(new Body(str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetPackagePromotionsResponse> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getPromotionsForPackage((Body) this.body, z);
    }
}
