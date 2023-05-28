package com.facebook.p032t.p181u;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C4716f;

/* renamed from: com.facebook.t.u.l */
/* compiled from: SourceApplicationInfo */
class C6668l {

    /* renamed from: a */
    private String f12426a;

    /* renamed from: b */
    private boolean f12427b;

    private C6668l(String str, boolean z) {
        this.f12426a = str;
        this.f12427b = z;
    }

    /* renamed from: b */
    public static void m14242b() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e()).edit();
        edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
        edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
        edit.apply();
    }

    /* renamed from: c */
    public static C6668l m14243c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e());
        if (!defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
            return null;
        }
        return new C6668l(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", (String) null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
    }

    /* renamed from: a */
    public void mo21429a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4716f.m7696e()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f12426a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f12427b);
        edit.apply();
    }

    public String toString() {
        String str = this.f12427b ? "Applink" : "Unclassified";
        if (this.f12426a == null) {
            return str;
        }
        return str + "(" + this.f12426a + ")";
    }
}
