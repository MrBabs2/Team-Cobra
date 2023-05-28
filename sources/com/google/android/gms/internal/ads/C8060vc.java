package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vc */
final /* synthetic */ class C8060vc implements Runnable {

    /* renamed from: f */
    private final zzbgz f17019f;

    /* renamed from: g */
    private final JSONObject f17020g;

    C8060vc(zzbgz zzbgz, JSONObject jSONObject) {
        this.f17019f = zzbgz;
        this.f17020g = jSONObject;
    }

    public final void run() {
        this.f17019f.mo25675b("AFMA_updateActiveView", this.f17020g);
    }
}
