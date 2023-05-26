package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BiUtmAnalyticsRequest */
public class BiUtmAnalyticsRequest extends C2185V7<BaseV7Response, BiUtmAnalyticsRequestBody> {
    private final String action;
    private final String context;
    private final String name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BiUtmAnalyticsRequest(String str, String str2, String str3, BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator) {
        super(biUtmAnalyticsRequestBody, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.action = str;
        this.name = str2;
        this.context = str3;
    }

    /* renamed from: of */
    public static BiUtmAnalyticsRequest m5247of(String str, String str2, String str3, BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator) {
        return new BiUtmAnalyticsRequest(str, str2, str3, biUtmAnalyticsRequestBody, okHttpClient, factory, bodyInterceptor, sharedPreferences, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.addEvent(this.name, this.action, this.context, (BiUtmAnalyticsRequestBody) this.body);
    }
}
