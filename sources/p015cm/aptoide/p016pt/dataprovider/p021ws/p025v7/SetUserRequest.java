package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetUserRequest */
public class SetUserRequest extends C2185V7<BaseV7Response, Body> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetUserRequest$Body */
    public static class Body extends BaseBody {
        public UserProperties userProperties;
        public String user_access;

        public Body(String str, String str2) {
            this.user_access = str;
            this.userProperties = new UserProperties(str2);
        }

        public UserProperties getUserProperties() {
            return this.userProperties;
        }

        public String getUser_access() {
            return this.user_access;
        }

        public void setUserProperties(UserProperties userProperties2) {
            this.userProperties = userProperties2;
        }

        public void setUser_access(String str) {
            this.user_access = str;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.SetUserRequest$UserProperties */
    public static class UserProperties {
        private String name;

        public UserProperties(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    protected SetUserRequest(Body body, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(body, getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_WRITE_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    /* renamed from: of */
    public static SetUserRequest m5274of(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new SetUserRequest(new Body(str, (String) null), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    public static SetUserRequest ofWithName(String str, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        return new SetUserRequest(new Body((String) null, str), bodyInterceptor, okHttpClient, factory, tokenInvalidator, sharedPreferences);
    }

    /* access modifiers changed from: protected */
    public C5368e<BaseV7Response> loadDataFromNetwork(C2185V7.Interfaces interfaces, boolean z) {
        return interfaces.setUser((Body) this.body);
    }
}
