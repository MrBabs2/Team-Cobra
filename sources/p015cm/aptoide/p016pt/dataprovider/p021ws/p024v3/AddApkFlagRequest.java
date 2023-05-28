package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.GenericResponseV2;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.AddApkFlagRequest */
public class AddApkFlagRequest extends C2181V3<GenericResponseV2> {
    protected AddApkFlagRequest(BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static AddApkFlagRequest m5238of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("repo", str);
        baseBody.put("md5sum", str2);
        baseBody.put("flag", str3);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        return new AddApkFlagRequest(baseBody, bodyInterceptor, okHttpClient, WebService.getDefaultConverter(), tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<GenericResponseV2> loadDataFromNetwork(Service service, boolean z) {
        return service.addApkFlag(this.map, z);
    }
}
