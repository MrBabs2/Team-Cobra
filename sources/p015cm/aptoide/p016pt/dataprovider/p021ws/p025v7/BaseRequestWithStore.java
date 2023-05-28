package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.content.SharedPreferences;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBodyWithStore;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BaseRequestWithStore */
public abstract class BaseRequestWithStore<U, B extends BaseBodyWithStore> extends C2185V7<U, B> {
    public BaseRequestWithStore(B b, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences) {
        super(b, C2185V7.getHost(sharedPreferences), okHttpClient, factory, bodyInterceptor, tokenInvalidator);
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BaseRequestWithStore$StoreCredentials */
    public static class StoreCredentials {

        /* renamed from: id */
        private final Long f4878id;
        private final String name;
        private final String passwordSha1;
        private final String username;

        public StoreCredentials() {
            this.name = null;
            this.f4878id = null;
            this.username = null;
            this.passwordSha1 = null;
        }

        public Long getId() {
            return this.f4878id;
        }

        public String getName() {
            return this.name;
        }

        public String getPasswordSha1() {
            return this.passwordSha1;
        }

        public String getUsername() {
            return this.username;
        }

        public StoreCredentials(long j, String str, String str2) {
            this.name = null;
            this.f4878id = Long.valueOf(j);
            this.username = str;
            this.passwordSha1 = str2;
        }

        public StoreCredentials(String str, String str2, String str3) {
            this.f4878id = null;
            this.name = str;
            this.username = str2;
            this.passwordSha1 = str3;
        }

        public StoreCredentials(long j, String str, String str2, String str3) {
            this.f4878id = Long.valueOf(j);
            this.name = str;
            this.username = str2;
            this.passwordSha1 = str3;
        }
    }
}
