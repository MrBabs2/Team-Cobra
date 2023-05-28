package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C6481y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a */
/* compiled from: AccessTokenCache */
class C6351a {

    /* renamed from: a */
    private final SharedPreferences f11669a;

    /* renamed from: b */
    private final C6352a f11670b;

    /* renamed from: c */
    private C6493k f11671c;

    /* renamed from: com.facebook.a$a */
    /* compiled from: AccessTokenCache */
    static class C6352a {
        C6352a() {
        }

        /* renamed from: a */
        public C6493k mo20878a() {
            return new C6493k(C4716f.m7696e());
        }
    }

    C6351a(SharedPreferences sharedPreferences, C6352a aVar) {
        this.f11669a = sharedPreferences;
        this.f11670b = aVar;
    }

    /* renamed from: c */
    private AccessToken m13157c() {
        String string = this.f11669a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string != null) {
            try {
                return AccessToken.m13031a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private AccessToken m13158d() {
        Bundle b = m13159e().mo21071b();
        if (b == null || !C6493k.m13607d(b)) {
            return null;
        }
        return AccessToken.m13029a(b);
    }

    /* renamed from: e */
    private C6493k m13159e() {
        if (this.f11671c == null) {
            synchronized (this) {
                if (this.f11671c == null) {
                    this.f11671c = this.f11670b.mo20878a();
                }
            }
        }
        return this.f11671c;
    }

    /* renamed from: f */
    private boolean m13160f() {
        return this.f11669a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: g */
    private boolean m13161g() {
        return C4716f.m7714w();
    }

    /* renamed from: a */
    public void mo20876a(AccessToken accessToken) {
        C6481y.m13556a((Object) accessToken, "accessToken");
        try {
            this.f11669a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.mo20791p().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: b */
    public AccessToken mo20877b() {
        if (m13160f()) {
            return m13157c();
        }
        if (!m13161g()) {
            return null;
        }
        AccessToken d = m13158d();
        if (d == null) {
            return d;
        }
        mo20876a(d);
        m13159e().mo21070a();
        return d;
    }

    public C6351a() {
        this(C4716f.m7696e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new C6352a());
    }

    /* renamed from: a */
    public void mo20875a() {
        this.f11669a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m13161g()) {
            m13159e().mo21070a();
        }
    }
}
