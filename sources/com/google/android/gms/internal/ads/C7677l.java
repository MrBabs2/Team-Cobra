package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.l */
final class C7677l extends zzacj<Boolean> {
    C7677l(int i, String str, Boolean bool) {
        super(i, str, bool, (C7677l) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26194a(Bundle bundle) {
        String valueOf = String.valueOf(mo27154a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Boolean) mo27156c();
        }
        String valueOf2 = String.valueOf(mo27154a());
        return Boolean.valueOf(bundle.getBoolean(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26196a(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo27154a(), ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26195a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo27154a(), ((Boolean) mo27156c()).booleanValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26193a(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo27154a(), ((Boolean) mo27156c()).booleanValue()));
    }
}
