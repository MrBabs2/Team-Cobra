package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.m */
final class C7714m extends zzacj<Integer> {
    C7714m(int i, String str, Integer num) {
        super(i, str, num, (C7677l) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26194a(Bundle bundle) {
        String valueOf = String.valueOf(mo27154a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Integer) mo27156c();
        }
        String valueOf2 = String.valueOf(mo27154a());
        return Integer.valueOf(bundle.getInt(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26196a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo27154a(), ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26195a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo27154a(), ((Integer) mo27156c()).intValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26193a(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo27154a(), ((Integer) mo27156c()).intValue()));
    }
}
