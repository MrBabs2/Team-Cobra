package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzapx {

    /* renamed from: a */
    private final boolean f18281a;

    /* renamed from: b */
    private final boolean f18282b;

    /* renamed from: c */
    private final boolean f18283c;

    /* renamed from: d */
    private final boolean f18284d;

    /* renamed from: e */
    private final boolean f18285e;

    private zzapx(zzapz zzapz) {
        this.f18281a = zzapz.f18286a;
        this.f18282b = zzapz.f18287b;
        this.f18283c = zzapz.f18288c;
        this.f18284d = zzapz.f18289d;
        this.f18285e = zzapz.f18290e;
    }

    /* renamed from: a */
    public final JSONObject mo27547a() {
        try {
            return new JSONObject().put("sms", this.f18281a).put("tel", this.f18282b).put("calendar", this.f18283c).put("storePicture", this.f18284d).put("inlineVideo", this.f18285e);
        } catch (JSONException e) {
            zzbad.m20520b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
