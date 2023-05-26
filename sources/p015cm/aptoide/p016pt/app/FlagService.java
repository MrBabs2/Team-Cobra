package p015cm.aptoide.p016pt.app;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2.GenericResponseV2;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.AddApkFlagRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.FlagService */
public class FlagService {
    private final BodyInterceptor<BaseBody> bodyInterceptorV3;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final TokenInvalidator tokenInvalidator;

    public FlagService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient2, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2) {
        this.bodyInterceptorV3 = bodyInterceptor;
        this.okHttpClient = okHttpClient2;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
    }

    public Single<GenericResponseV2> doApkFlagRequest(String str, String str2, String str3) {
        return AddApkFlagRequest.m5238of(str, str2, str3, this.bodyInterceptorV3, this.okHttpClient, this.tokenInvalidator, this.sharedPreferences).observe(true).mo18700m();
    }
}
