package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.BaseV3Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.CreateUserRequest */
public class CreateUserRequest extends C2181V3<BaseV3Response> {
    private final MultipartBody.Part multipartBodyFile;
    private final HashMapNotNull<String, RequestBody> multipartRequestBody = null;

    public CreateUserRequest(MultipartBody.Part part, BaseBody baseBody, OkHttpClient okHttpClient, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, WebService.getDefaultConverter(), bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.multipartBodyFile = part;
    }

    private static void addBaseParameters(String str, BaseBody baseBody, String str2, String str3) {
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        baseBody.put("email", str);
        baseBody.put("passhash", str2);
        if (!TextUtils.isEmpty(str3)) {
            baseBody.put("oem_id", str3);
        }
        baseBody.put("accepts", "tos,privacy");
    }

    /* renamed from: of */
    public static CreateUserRequest m5239of(String str, String str2, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str3) {
        BaseBody baseBody = new BaseBody();
        String computeSha1 = AptoideUtils.AlgorithmU.computeSha1(str2);
        addBaseParameters(str, baseBody, computeSha1, str3);
        baseBody.put("hmac", AptoideUtils.AlgorithmU.computeHmacSha1(str + computeSha1, "bazaar_hmac"));
        return new CreateUserRequest((MultipartBody.Part) null, baseBody, okHttpClient, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV3Response> loadDataFromNetwork(Service service, boolean z) {
        MultipartBody.Part part = this.multipartBodyFile;
        if (part != null) {
            return service.createUserWithFile(part, this.multipartRequestBody, z);
        }
        return service.createUser(this.map, z);
    }
}
