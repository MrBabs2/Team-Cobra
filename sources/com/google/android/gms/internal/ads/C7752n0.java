package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n0 */
final class C7752n0 implements zzahw {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f16263a;

    C7752n0(zzahu zzahu, zzbbr zzbbr) {
        this.f16263a = zzbbr;
    }

    /* renamed from: a */
    public final void mo26069a(JSONObject jSONObject) {
        this.f16263a.mo27904b(jSONObject);
    }

    public final void onFailure(String str) {
        this.f16263a.mo27903a(new zzali(str));
    }
}
