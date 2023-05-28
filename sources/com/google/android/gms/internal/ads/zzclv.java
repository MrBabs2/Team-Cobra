package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzclv implements zzcjz<zzams, zzcla> {

    /* renamed from: a */
    private final zzclc f20571a;

    public zzclv(zzclc zzclc) {
        this.f20571a = zzclc;
    }

    /* renamed from: a */
    public final zzcjy<zzams, zzcla> mo28720a(String str, JSONObject jSONObject) throws Throwable {
        zzams a = this.f20571a.mo28731a(str, jSONObject);
        if (a == null) {
            return null;
        }
        return new zzcjy<>(a, new zzcla(), str);
    }
}
