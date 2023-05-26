package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcxg implements zzcuz<JSONObject> {

    /* renamed from: a */
    private final Map<String, Object> f21095a;

    public zzcxg(Map<String, Object> map) {
        this.f21095a = map;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", zzk.zzlg().mo27797a((Map<String, ?>) this.f21095a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawz.m20167e(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
