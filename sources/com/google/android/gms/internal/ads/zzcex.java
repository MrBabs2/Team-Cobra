package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzcex implements zzczz {

    /* renamed from: f */
    private Map<zzczs, zzcez> f20085f;

    /* renamed from: g */
    private zzwj f20086g;

    zzcex(zzwj zzwj, Map<zzczs, zzcez> map) {
        this.f20085f = map;
        this.f20086g = zzwj;
    }

    /* renamed from: a */
    public final void mo28668a(zzczs zzczs, String str, Throwable th) {
        if (this.f20085f.containsKey(zzczs)) {
            this.f20086g.mo29859a(this.f20085f.get(zzczs).f20089c);
        }
    }

    /* renamed from: b */
    public final void mo28669b(zzczs zzczs, String str) {
        if (this.f20085f.containsKey(zzczs)) {
            this.f20086g.mo29859a(this.f20085f.get(zzczs).f20087a);
        }
    }

    /* renamed from: c */
    public final void mo28670c(zzczs zzczs, String str) {
    }

    /* renamed from: a */
    public final void mo28667a(zzczs zzczs, String str) {
        if (this.f20085f.containsKey(zzczs)) {
            this.f20086g.mo29859a(this.f20085f.get(zzczs).f20088b);
        }
    }
}
