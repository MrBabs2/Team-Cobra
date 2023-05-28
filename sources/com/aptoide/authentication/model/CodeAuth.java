package com.aptoide.authentication.model;

import com.squareup.moshi.C4747g;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001#B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006$"}, mo16641d2 = {"Lcom/aptoide/authentication/model/CodeAuth;", "", "type", "", "state", "agent", "signup", "", "data", "Lcom/aptoide/authentication/model/CodeAuth$Data;", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/aptoide/authentication/model/CodeAuth$Data;Ljava/lang/String;)V", "getAgent", "()Ljava/lang/String;", "getData", "()Lcom/aptoide/authentication/model/CodeAuth$Data;", "getEmail", "setEmail", "(Ljava/lang/String;)V", "getSignup", "()Z", "getState", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Data", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
@C4747g(generateAdapter = true)
/* compiled from: CodeAuth.kt */
public final class CodeAuth {
    private final String agent;
    private final Data data;
    private String email;
    private final boolean signup;
    private final String state;
    private final String type;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo16641d2 = {"Lcom/aptoide/authentication/model/CodeAuth$Data;", "", "type", "", "method", "(Ljava/lang/String;Ljava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    @C4747g(generateAdapter = true)
    /* compiled from: CodeAuth.kt */
    public static final class Data {
        private final String method;
        private final String type;

        public Data(String str, String str2) {
            C10202j.m34178b(str, "type");
            C10202j.m34178b(str2, "method");
            this.type = str;
            this.method = str2;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.type;
            }
            if ((i & 2) != 0) {
                str2 = data.method;
            }
            return data.copy(str, str2);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.method;
        }

        public final Data copy(String str, String str2) {
            C10202j.m34178b(str, "type");
            C10202j.m34178b(str2, "method");
            return new Data(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C10202j.m34176a((Object) this.type, (Object) data.type) && C10202j.m34176a((Object) this.method, (Object) data.method);
        }

        public final String getMethod() {
            return this.method;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.method;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Data(type=" + this.type + ", method=" + this.method + ")";
        }
    }

    public CodeAuth(String str, String str2, String str3, boolean z, Data data2, String str4) {
        C10202j.m34178b(str, "type");
        C10202j.m34178b(str2, "state");
        C10202j.m34178b(data2, "data");
        this.type = str;
        this.state = str2;
        this.agent = str3;
        this.signup = z;
        this.data = data2;
        this.email = str4;
    }

    public static /* synthetic */ CodeAuth copy$default(CodeAuth codeAuth, String str, String str2, String str3, boolean z, Data data2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeAuth.type;
        }
        if ((i & 2) != 0) {
            str2 = codeAuth.state;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = codeAuth.agent;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = codeAuth.signup;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            data2 = codeAuth.data;
        }
        Data data3 = data2;
        if ((i & 32) != 0) {
            str4 = codeAuth.email;
        }
        return codeAuth.copy(str, str5, str6, z2, data3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.state;
    }

    public final String component3() {
        return this.agent;
    }

    public final boolean component4() {
        return this.signup;
    }

    public final Data component5() {
        return this.data;
    }

    public final String component6() {
        return this.email;
    }

    public final CodeAuth copy(String str, String str2, String str3, boolean z, Data data2, String str4) {
        C10202j.m34178b(str, "type");
        C10202j.m34178b(str2, "state");
        C10202j.m34178b(data2, "data");
        return new CodeAuth(str, str2, str3, z, data2, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeAuth)) {
            return false;
        }
        CodeAuth codeAuth = (CodeAuth) obj;
        return C10202j.m34176a((Object) this.type, (Object) codeAuth.type) && C10202j.m34176a((Object) this.state, (Object) codeAuth.state) && C10202j.m34176a((Object) this.agent, (Object) codeAuth.agent) && this.signup == codeAuth.signup && C10202j.m34176a((Object) this.data, (Object) codeAuth.data) && C10202j.m34176a((Object) this.email, (Object) codeAuth.email);
    }

    public final String getAgent() {
        return this.agent;
    }

    public final Data getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getSignup() {
        return this.signup;
    }

    public final String getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.state;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.agent;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.signup;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        Data data2 = this.data;
        int hashCode4 = (i2 + (data2 != null ? data2.hashCode() : 0)) * 31;
        String str4 = this.email;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public String toString() {
        return "CodeAuth(type=" + this.type + ", state=" + this.state + ", agent=" + this.agent + ", signup=" + this.signup + ", data=" + this.data + ", email=" + this.email + ")";
    }
}
