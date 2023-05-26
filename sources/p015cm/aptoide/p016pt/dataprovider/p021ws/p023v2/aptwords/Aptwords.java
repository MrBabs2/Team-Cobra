package p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.model.p018v2.GetAdsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.aptwords.RegisterAdRefererRequest;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.Aptwords */
abstract class Aptwords<U> extends WebService<Interfaces, U> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v2.aptwords.Aptwords$Interfaces */
    interface Interfaces {
        @FormUrlEncoded
        @POST("getAds")
        C5368e<GetAdsResponse> getAds(@FieldMap HashMapNotNull<String, String> hashMapNotNull, @Header("X-Bypass-Cache") boolean z);

        @FormUrlEncoded
        @POST("registerAdReferer")
        C5368e<RegisterAdRefererRequest.DefaultResponse> load(@FieldMap HashMapNotNull<String, String> hashMapNotNull);
    }

    Aptwords(OkHttpClient okHttpClient, Converter.Factory factory, SharedPreferences sharedPreferences) {
        super(Interfaces.class, okHttpClient, factory, getHost(sharedPreferences));
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_APTWORDS_HOST);
        sb.append("/api/2/");
        return sb.toString();
    }
}
