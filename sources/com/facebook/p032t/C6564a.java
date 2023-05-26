package com.facebook.p032t;

import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.internal.C6476x;
import java.io.Serializable;

/* renamed from: com.facebook.t.a */
/* compiled from: AccessTokenAppIdPair */
class C6564a implements Serializable {

    /* renamed from: f */
    private final String f12187f;

    /* renamed from: g */
    private final String f12188g;

    /* renamed from: com.facebook.t.a$b */
    /* compiled from: AccessTokenAppIdPair */
    static class C6566b implements Serializable {

        /* renamed from: f */
        private final String f12189f;

        /* renamed from: g */
        private final String f12190g;

        private Object readResolve() {
            return new C6564a(this.f12189f, this.f12190g);
        }

        private C6566b(String str, String str2) {
            this.f12189f = str;
            this.f12190g = str2;
        }
    }

    public C6564a(AccessToken accessToken) {
        this(accessToken.mo20788k(), C4716f.m7697f());
    }

    private Object writeReplace() {
        return new C6566b(this.f12187f, this.f12188g);
    }

    /* renamed from: a */
    public String mo21300a() {
        return this.f12187f;
    }

    /* renamed from: b */
    public String mo21301b() {
        return this.f12188g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6564a)) {
            return false;
        }
        C6564a aVar = (C6564a) obj;
        if (!C6476x.m13515a(aVar.f12187f, this.f12187f) || !C6476x.m13515a(aVar.f12188g, this.f12188g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f12187f;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f12188g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public C6564a(String str, String str2) {
        this.f12187f = C6476x.m13533d(str) ? null : str;
        this.f12188g = str2;
    }
}
