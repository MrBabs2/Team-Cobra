package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.up */
final /* synthetic */ class C8036up implements zzcuz {

    /* renamed from: a */
    static final zzcuz f16971a = new C8036up();

    private C8036up() {
    }

    /* renamed from: a */
    public final void mo25833a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
