package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

@zzard
public final class zzaso implements zzasb {

    /* renamed from: a */
    private zzalj<JSONObject, JSONObject> f18501a;

    public zzaso(Context context) {
        zzalr a = zzk.zzlt().mo27371a(context, zzbai.m20531d());
        zzaln<JSONObject> zzaln = zzalo.f18180b;
        a.mo27373a("google.afma.request.getAdDictionary", zzaln, zzaln);
        zzalr a2 = zzk.zzlt().mo27371a(context, zzbai.m20531d());
        zzaln<JSONObject> zzaln2 = zzalo.f18180b;
        this.f18501a = a2.mo27373a("google.afma.sdkConstants.getSdkConstants", zzaln2, zzaln2);
    }

    /* renamed from: a */
    public final zzalj<JSONObject, JSONObject> mo27603a() {
        return this.f18501a;
    }
}
