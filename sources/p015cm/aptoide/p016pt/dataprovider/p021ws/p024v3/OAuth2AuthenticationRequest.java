package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import android.content.SharedPreferences;
import android.text.TextUtils;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.account.FacebookSignUpAdapter;
import p015cm.aptoide.p016pt.account.GoogleSignUpAdapter;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.OAuth;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.OAuth2AuthenticationRequest */
public class OAuth2AuthenticationRequest extends C2181V3<OAuth> {
    public OAuth2AuthenticationRequest(BaseBody baseBody, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(baseBody, okHttpClient, factory, bodyInterceptor, tokenInvalidator, sharedPreferences);
    }

    /* renamed from: of */
    public static OAuth2AuthenticationRequest m5242of(String str, String str2, String str3, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str5;
        BaseBody baseBody = new BaseBody();
        baseBody.put("grant_type", "code");
        baseBody.put("client_id", BuildConfig.MARKET_NAME);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        if (str8 != null) {
            char c = 65535;
            switch (str3.hashCode()) {
                case -71469216:
                    if (str3.equals(AptoideAccountManager.APTOIDE_SIGN_UP_TYPE)) {
                        c = 0;
                        break;
                    }
                    break;
                case 2001934:
                    if (str3.equals("ABAN")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1279756998:
                    if (str3.equals(FacebookSignUpAdapter.TYPE)) {
                        c = 2;
                        break;
                    }
                    break;
                case 2108052025:
                    if (str3.equals(GoogleSignUpAdapter.TYPE)) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                baseBody.put("username", str);
                baseBody.put("code", str2);
            } else if (c == 1 || c == 2) {
                baseBody.put("authMode", str9);
                baseBody.put("oauthToken", str2);
            } else if (c == 3) {
                baseBody.put("oauthUserName", str);
                baseBody.put("oauthToken", str2);
                baseBody.put("authMode", str9);
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            baseBody.put("oem_id", str4);
        }
        return new OAuth2AuthenticationRequest(baseBody, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<OAuth> loadDataFromNetwork(Service service, boolean z) {
        return service.oauth2Authentication(this.map, z);
    }

    /* renamed from: of */
    public static OAuth2AuthenticationRequest m5241of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, String str2) {
        BaseBody baseBody = new BaseBody();
        baseBody.put("grant_type", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN);
        baseBody.put("client_id", BuildConfig.MARKET_NAME);
        baseBody.put("mode", BodyInterceptorV3.RESPONSE_MODE_JSON);
        if (!TextUtils.isEmpty(str2)) {
            baseBody.put("oem_id", str2);
        }
        baseBody.put(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, str);
        return new OAuth2AuthenticationRequest(baseBody, bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }
}
