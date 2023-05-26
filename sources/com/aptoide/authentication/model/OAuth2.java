package com.aptoide.authentication.model;

import com.squareup.moshi.C4746e;
import com.squareup.moshi.C4747g;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo16641d2 = {"Lcom/aptoide/authentication/model/OAuth2;", "", "type", "", "signup", "", "data", "Lcom/aptoide/authentication/model/OAuth2$Data;", "(Ljava/lang/String;ZLcom/aptoide/authentication/model/OAuth2$Data;)V", "getData", "()Lcom/aptoide/authentication/model/OAuth2$Data;", "getSignup", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Data", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
@C4747g(generateAdapter = true)
/* compiled from: OAuth2.kt */
public final class OAuth2 {
    private final Data data;
    private final boolean signup;
    private final String type;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo16641d2 = {"Lcom/aptoide/authentication/model/OAuth2$Data;", "", "accessToken", "", "expiresIn", "", "refreshToken", "tokenType", "scope", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()I", "getRefreshToken", "getScope", "getTokenType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    @C4747g(generateAdapter = true)
    /* compiled from: OAuth2.kt */
    public static final class Data {
        private final String accessToken;
        private final int expiresIn;
        private final String refreshToken;
        private final String scope;
        private final String tokenType;

        public Data(@C4746e(name = "access_token") String str, @C4746e(name = "expires_in") int i, @C4746e(name = "refresh_token") String str2, @C4746e(name = "token_type") String str3, String str4) {
            C10202j.m34178b(str, "accessToken");
            C10202j.m34178b(str2, "refreshToken");
            C10202j.m34178b(str3, "tokenType");
            this.accessToken = str;
            this.expiresIn = i;
            this.refreshToken = str2;
            this.tokenType = str3;
            this.scope = str4;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = data.accessToken;
            }
            if ((i2 & 2) != 0) {
                i = data.expiresIn;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str2 = data.refreshToken;
            }
            String str5 = str2;
            if ((i2 & 8) != 0) {
                str3 = data.tokenType;
            }
            String str6 = str3;
            if ((i2 & 16) != 0) {
                str4 = data.scope;
            }
            return data.copy(str, i3, str5, str6, str4);
        }

        public final String component1() {
            return this.accessToken;
        }

        public final int component2() {
            return this.expiresIn;
        }

        public final String component3() {
            return this.refreshToken;
        }

        public final String component4() {
            return this.tokenType;
        }

        public final String component5() {
            return this.scope;
        }

        public final Data copy(@C4746e(name = "access_token") String str, @C4746e(name = "expires_in") int i, @C4746e(name = "refresh_token") String str2, @C4746e(name = "token_type") String str3, String str4) {
            C10202j.m34178b(str, "accessToken");
            C10202j.m34178b(str2, "refreshToken");
            C10202j.m34178b(str3, "tokenType");
            return new Data(str, i, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C10202j.m34176a((Object) this.accessToken, (Object) data.accessToken) && this.expiresIn == data.expiresIn && C10202j.m34176a((Object) this.refreshToken, (Object) data.refreshToken) && C10202j.m34176a((Object) this.tokenType, (Object) data.tokenType) && C10202j.m34176a((Object) this.scope, (Object) data.scope);
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final int getExpiresIn() {
            return this.expiresIn;
        }

        public final String getRefreshToken() {
            return this.refreshToken;
        }

        public final String getScope() {
            return this.scope;
        }

        public final String getTokenType() {
            return this.tokenType;
        }

        public int hashCode() {
            String str = this.accessToken;
            int i = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.expiresIn) * 31;
            String str2 = this.refreshToken;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.tokenType;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.scope;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "Data(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", refreshToken=" + this.refreshToken + ", tokenType=" + this.tokenType + ", scope=" + this.scope + ")";
        }
    }

    public OAuth2(String str, boolean z, Data data2) {
        C10202j.m34178b(str, "type");
        C10202j.m34178b(data2, "data");
        this.type = str;
        this.signup = z;
        this.data = data2;
    }

    public static /* synthetic */ OAuth2 copy$default(OAuth2 oAuth2, String str, boolean z, Data data2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oAuth2.type;
        }
        if ((i & 2) != 0) {
            z = oAuth2.signup;
        }
        if ((i & 4) != 0) {
            data2 = oAuth2.data;
        }
        return oAuth2.copy(str, z, data2);
    }

    public final String component1() {
        return this.type;
    }

    public final boolean component2() {
        return this.signup;
    }

    public final Data component3() {
        return this.data;
    }

    public final OAuth2 copy(String str, boolean z, Data data2) {
        C10202j.m34178b(str, "type");
        C10202j.m34178b(data2, "data");
        return new OAuth2(str, z, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuth2)) {
            return false;
        }
        OAuth2 oAuth2 = (OAuth2) obj;
        return C10202j.m34176a((Object) this.type, (Object) oAuth2.type) && this.signup == oAuth2.signup && C10202j.m34176a((Object) this.data, (Object) oAuth2.data);
    }

    public final Data getData() {
        return this.data;
    }

    public final boolean getSignup() {
        return this.signup;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.signup;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Data data2 = this.data;
        if (data2 != null) {
            i = data2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "OAuth2(type=" + this.type + ", signup=" + this.signup + ", data=" + this.data + ")";
    }
}
