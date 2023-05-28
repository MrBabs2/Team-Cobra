package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.CheckUserCredentialsJson;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.CheckUserCredentialsRequest */
public class CheckUserCredentialsRequest extends C2181V3<CheckUserCredentialsJson> {
    private static final String CREATE_REPO_VALUE = "1";
    private static final String DEFAULT_AUTH_MODE = "aptoide";
    private static final String OAUTH_CREATE_REPO_VALUE = "true";
    private final boolean createStore;

    private CheckUserCredentialsRequest(BaseBody baseBody, boolean z, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
        this.createStore = z;
    }

    public static CheckUserCredentialsRequest toCreateStore(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("createRepo", "1");
        baseBody.put("oauthCreateRepo", "true");
        baseBody.put("repo", str);
        baseBody.setAuthMode(DEFAULT_AUTH_MODE);
        return new CheckUserCredentialsRequest(baseBody, true, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<CheckUserCredentialsJson> loadDataFromNetwork(Service service, boolean z) {
        if (this.createStore) {
            return service.checkUserCredentials(this.map, z);
        }
        return service.getUserInfo(this.map, z);
    }
}
