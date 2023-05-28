package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbye implements zzdti<JSONObject> {

    /* renamed from: a */
    private final zzbyc f19664a;

    public zzbye(zzbyc zzbyc) {
        this.f19664a = zzbyc;
    }

    public final /* synthetic */ Object get() {
        JSONObject a = this.f19664a.mo28492a();
        zzdto.m24236a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
