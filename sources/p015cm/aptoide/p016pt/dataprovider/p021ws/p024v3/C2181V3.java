package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import java.io.IOException;
import java.lang.annotation.Annotation;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV3Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.BaseV3Response;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.ErrorResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.HttpException;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.V3 */
public abstract class C2181V3<U> extends WebService<Service, U> {
    protected static final String BASE_HOST = "https://webservices.aptoide.com/webservices/3/";
    private final String INVALID_ACCESS_TOKEN_CODE;
    private boolean accessTokenRetry;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    protected final BaseBody map;
    private final TokenInvalidator tokenInvalidator;

    protected C2181V3(String str, BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor2, TokenInvalidator tokenInvalidator2) {
        super(Service.class, new OkHttpClient(), WebService.getDefaultConverter(), str);
        this.INVALID_ACCESS_TOKEN_CODE = "invalid_token";
        this.accessTokenRetry = false;
        this.map = baseBody;
        this.bodyInterceptor = bodyInterceptor2;
        this.tokenInvalidator = tokenInvalidator2;
    }

    public static String getErrorMessage(BaseV3Response baseV3Response) {
        StringBuilder sb = new StringBuilder();
        if (baseV3Response == null || baseV3Response.getErrors() == null) {
            sb.append("Server returned null response.");
        } else {
            for (ErrorResponse errorResponse : baseV3Response.getErrors()) {
                sb.append(errorResponse.msg);
                sb.append(". ");
            }
            if (sb.length() == 0) {
                sb.append("Server failed with empty error list.");
            }
        }
        return sb.toString();
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_HOST);
        sb.append("/webservices/3/");
        return sb.toString();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo9951a(boolean z, BaseBody baseBody) {
        return super.observe(z).mo18697k(new C2183b(this, z));
    }

    public C5368e<U> observe(boolean z) {
        return this.bodyInterceptor.intercept(this.map).mo18568c(new C2182a(this, z));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo9952a(boolean z, Throwable th) {
        if (th instanceof HttpException) {
            try {
                GenericResponseV3 genericResponseV3 = (GenericResponseV3) this.converterFactory.responseBodyConverter(GenericResponseV3.class, (Annotation[]) null, (Retrofit) null).convert(((HttpException) th).response().errorBody());
                if (!"invalid_token".equals(genericResponseV3.getError())) {
                    AptoideWsV3Exception aptoideWsV3Exception = new AptoideWsV3Exception(th);
                    aptoideWsV3Exception.setBaseResponse(genericResponseV3);
                    return C5368e.m10238a((Throwable) aptoideWsV3Exception);
                } else if (!this.accessTokenRetry) {
                    this.accessTokenRetry = true;
                    return this.tokenInvalidator.invalidateAccessToken().mo18593a(observe(z));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return C5368e.m10238a(th);
    }

    protected C2181V3(BaseBody baseBody, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor2, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences) {
        super(Service.class, okHttpClient, factory, getHost(sharedPreferences));
        this.INVALID_ACCESS_TOKEN_CODE = "invalid_token";
        this.accessTokenRetry = false;
        this.map = baseBody;
        this.bodyInterceptor = bodyInterceptor2;
        this.tokenInvalidator = tokenInvalidator2;
    }

    protected C2181V3(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor2, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences) {
        this(new BaseBody(), okHttpClient, factory, bodyInterceptor2, tokenInvalidator2, sharedPreferences);
    }
}
