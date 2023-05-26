package com.aptoide.authentication.network;

import com.aptoide.authentication.model.CodeAuth;
import com.aptoide.authentication.model.OAuth2;
import com.aptoide.authentication.service.AuthenticationService;
import com.squareup.moshi.C4747g;
import com.squareup.moshi.C8952r;
import com.squareup.moshi.p207v.p208a.C8980b;
import java.util.Arrays;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlinx.coroutines.C12190d;
import kotlinx.coroutines.C12310t0;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo16641d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService;", "Lcom/aptoide/authentication/service/AuthenticationService;", "authenticationBaseHost", "", "okHttpClient", "Lokhttp3/OkHttpClient;", "(Ljava/lang/String;Lokhttp3/OkHttpClient;)V", "authorizationV7", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$AuthorizationV7;", "authenticate", "Lcom/aptoide/authentication/model/OAuth2;", "magicToken", "state", "agent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AuthorizationV7", "Credentials", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: RemoteAuthenticationService.kt */
public final class RemoteAuthenticationService implements AuthenticationService {
    private final String authenticationBaseHost;
    /* access modifiers changed from: private */
    public final AuthorizationV7 authorizationV7;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JO\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ;\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, mo16641d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService$AuthorizationV7;", "", "authenticate", "Lretrofit2/Response;", "Lcom/aptoide/authentication/model/OAuth2;", "type", "Lcom/aptoide/authentication/network/Type;", "state", "", "agent", "accepted", "", "credentials", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "(Lcom/aptoide/authentication/network/Type;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMagicLink", "Lcom/aptoide/authentication/model/CodeAuth;", "(Lcom/aptoide/authentication/network/Type;[Ljava/lang/String;Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* compiled from: RemoteAuthenticationService.kt */
    public interface AuthorizationV7 {
        @POST("user/authorize")
        Object authenticate(@Query("type") Type type, @Query("state") String str, @Query("agent") String str2, @Query(encoded = true, value = "accepted[]") String[] strArr, @Body Credentials credentials, C9064d<? super Response<OAuth2>> dVar);

        @POST("user/authorize")
        Object sendMagicLink(@Query("type") Type type, @Query(encoded = true, value = "accepted[]") String[] strArr, @Body Credentials credentials, C9064d<? super Response<CodeAuth>> dVar);
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, mo16641d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "", "credential", "", "supported", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "getCredential", "()Ljava/lang/String;", "getSupported", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "equals", "", "other", "hashCode", "", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    @C4747g(generateAdapter = true)
    /* compiled from: RemoteAuthenticationService.kt */
    public static final class Credentials {
        private final String credential;
        private final String[] supported;

        public Credentials(String str, String[] strArr) {
            C10202j.m34178b(str, "credential");
            C10202j.m34178b(strArr, "supported");
            this.credential = str;
            this.supported = strArr;
        }

        public static /* synthetic */ Credentials copy$default(Credentials credentials, String str, String[] strArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = credentials.credential;
            }
            if ((i & 2) != 0) {
                strArr = credentials.supported;
            }
            return credentials.copy(str, strArr);
        }

        public final String component1() {
            return this.credential;
        }

        public final String[] component2() {
            return this.supported;
        }

        public final Credentials copy(String str, String[] strArr) {
            C10202j.m34178b(str, "credential");
            C10202j.m34178b(strArr, "supported");
            return new Credentials(str, strArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Credentials)) {
                return false;
            }
            Credentials credentials = (Credentials) obj;
            return C10202j.m34176a((Object) this.credential, (Object) credentials.credential) && C10202j.m34176a((Object) this.supported, (Object) credentials.supported);
        }

        public final String getCredential() {
            return this.credential;
        }

        public final String[] getSupported() {
            return this.supported;
        }

        public int hashCode() {
            String str = this.credential;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String[] strArr = this.supported;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            }
            return hashCode + i;
        }

        public String toString() {
            return "Credentials(credential=" + this.credential + ", supported=" + Arrays.toString(this.supported) + ")";
        }
    }

    public RemoteAuthenticationService(String str, OkHttpClient okHttpClient) {
        C10202j.m34178b(str, "authenticationBaseHost");
        C10202j.m34178b(okHttpClient, "okHttpClient");
        this.authenticationBaseHost = str;
        Retrofit.Builder baseUrl = new Retrofit.Builder().baseUrl(this.authenticationBaseHost);
        C8952r.C8953a aVar = new C8952r.C8953a();
        aVar.mo32972a(new C8980b());
        Object create = baseUrl.addConverterFactory(MoshiConverterFactory.create(aVar.mo32973a())).client(okHttpClient).build().create(AuthorizationV7.class);
        C10202j.m34174a(create, "Retrofit.Builder().baseU…horizationV7::class.java)");
        this.authorizationV7 = (AuthorizationV7) create;
    }

    public Object authenticate(String str, String str2, String str3, C9064d<? super OAuth2> dVar) {
        return C12190d.m40228a(C12310t0.m40641b(), new RemoteAuthenticationService$authenticate$2(this, str2, str3, str, (C9064d) null), dVar);
    }

    public Object sendMagicLink(String str, C9064d<? super CodeAuth> dVar) {
        return C12190d.m40228a(C12310t0.m40641b(), new RemoteAuthenticationService$sendMagicLink$2(this, str, (C9064d) null), dVar);
    }
}
