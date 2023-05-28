package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.GetAppMetaRequest */
public class GetAppMetaRequest extends C2185V7<GetApp, BaseBody> {
    private final String url;

    public GetAppMetaRequest(String str, BaseBody baseBody, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator) {
        super(baseBody, str, okHttpClient, factory, bodyInterceptor, tokenInvalidator);
        this.url = str2;
    }

    public static GetAppMetaRequest ofAction(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        if (str.contains("getApp")) {
            str = str.split("getApp/")[1];
        }
        return new GetAppMetaRequest(C2185V7.getHost(sharedPreferences), new BaseBody(), str, bodyInterceptor, okHttpClient, factory, tokenInvalidator);
    }

    /* access modifiers changed from: protected */
    public C5368e<GetApp> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.getAppMeta(z, this.url);
    }
}
