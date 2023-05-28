package com.google.android.gms.internal.ads;

import java.util.Map;
import p050l.p066e.C4868a;

public final class zzcac implements zzbrw {

    /* renamed from: f */
    private final zzbyt f19828f;

    /* renamed from: g */
    private final zzbyx f19829g;

    public zzcac(zzbyt zzbyt, zzbyx zzbyx) {
        this.f19828f = zzbyt;
        this.f19829g = zzbyx;
    }

    public final void onAdImpression() {
        if (this.f19828f.mo28553t() != null) {
            zzbgz s = this.f19828f.mo28552s();
            zzbgz r = this.f19828f.mo28551r();
            if (s == null) {
                s = r != null ? r : null;
            }
            if (this.f19829g.mo28563d() && s != null) {
                s.mo25665a("onSdkImpression", (Map<String, ?>) new C4868a());
            }
        }
    }
}
