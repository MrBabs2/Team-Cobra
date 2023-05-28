package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.p2 */
final class C7828p2 implements zzahw {

    /* renamed from: a */
    private final zzbbr f16546a;

    /* renamed from: b */
    private final /* synthetic */ zzamd f16547b;

    public C7828p2(zzamd zzamd, zzbbr zzbbr) {
        this.f16547b = zzamd;
        this.f16546a = zzbbr;
    }

    /* renamed from: a */
    public final void mo26069a(JSONObject jSONObject) {
        try {
            this.f16546a.mo27904b(this.f16547b.f18191a.mo25760a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f16546a.mo27904b(e);
        }
    }

    public final void onFailure(String str) {
        if (str == null) {
            try {
                this.f16546a.mo27903a(new zzali());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f16546a.mo27903a(new zzali(str));
        }
    }
}
