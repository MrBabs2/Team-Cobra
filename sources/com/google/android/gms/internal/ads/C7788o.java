package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.o */
final class C7788o extends zzacj<Float> {
    C7788o(int i, String str, Float f) {
        super(i, str, f, (C7677l) null);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26194a(Bundle bundle) {
        String valueOf = String.valueOf(mo27154a());
        if (!bundle.containsKey(valueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) mo27156c();
        }
        String valueOf2 = String.valueOf(mo27154a());
        return Float.valueOf(bundle.getFloat(valueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(valueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26196a(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo27154a(), ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26195a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo27154a(), (double) ((Float) mo27156c()).floatValue()));
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26193a(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo27154a(), ((Float) mo27156c()).floatValue()));
    }
}
