package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.p */
final class C7825p extends zzacj<String> {
    C7825p(int i, String str, String str2) {
        super(i, str, str2, (C7677l) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26194a(Bundle bundle) {
        String valueOf = String.valueOf(mo27154a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (String) mo27156c();
        }
        String valueOf2 = String.valueOf(mo27154a());
        return bundle.getString(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26196a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo27154a(), (String) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26195a(JSONObject jSONObject) {
        return jSONObject.optString(mo27154a(), (String) mo27156c());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26193a(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo27154a(), (String) mo27156c());
    }
}
