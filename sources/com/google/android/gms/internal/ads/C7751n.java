package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n */
final class C7751n extends zzacj<Long> {
    C7751n(int i, String str, Long l) {
        super(i, str, l, (C7677l) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26194a(Bundle bundle) {
        String valueOf = String.valueOf(mo27154a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Long) mo27156c();
        }
        String valueOf2 = String.valueOf(mo27154a());
        return Long.valueOf(bundle.getLong(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26196a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo27154a(), ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26195a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo27154a(), ((Long) mo27156c()).longValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26193a(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo27154a(), ((Long) mo27156c()).longValue()));
    }
}
