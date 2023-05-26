package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzblx implements zzbls {

    /* renamed from: a */
    private final zzcxk f19143a;

    public zzblx(zzcxk zzcxk) {
        this.f19143a = zzcxk;
    }

    /* renamed from: a */
    public final void mo28258a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f19143a.mo28812a(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
