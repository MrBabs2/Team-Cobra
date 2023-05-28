package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.C6481y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.m */
/* compiled from: ProfileCache */
final class C6535m {

    /* renamed from: a */
    private final SharedPreferences f12112a = C4716f.m7696e().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    C6535m() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21224a(Profile profile) {
        C6481y.m13556a((Object) profile, "profile");
        JSONObject a = profile.mo20866a();
        if (a != null) {
            this.f12112a.edit().putString("com.facebook.ProfileManager.CachedProfile", a.toString()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Profile mo21225b() {
        String string = this.f12112a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo21223a() {
        this.f12112a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
}
