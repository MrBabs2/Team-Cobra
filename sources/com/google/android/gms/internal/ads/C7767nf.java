package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nf */
final class C7767nf implements zzbpe<zzbph> {

    /* renamed from: a */
    private final Map<String, zzcjv<zzbph>> f16379a;

    /* renamed from: b */
    private final Map<String, zzcjv<zzbyn>> f16380b;

    /* renamed from: c */
    private final Map<String, zzclw<zzbyn>> f16381c;

    /* renamed from: d */
    private final zzdtu<zzbpe<zzbnf>> f16382d;

    /* renamed from: e */
    private final zzbzc f16383e;

    C7767nf(Map<String, zzcjv<zzbph>> map, Map<String, zzcjv<zzbyn>> map2, Map<String, zzclw<zzbyn>> map3, zzdtu<zzbpe<zzbnf>> zzdtu, zzbzc zzbzc) {
        this.f16379a = map;
        this.f16380b = map2;
        this.f16381c = map3;
        this.f16382d = zzdtu;
        this.f16383e = zzbzc;
    }

    /* renamed from: a */
    public final zzcjv<zzbph> mo26320a(int i, String str) {
        zzcjv a;
        zzcjv<zzbph> zzcjv = this.f16379a.get(str);
        if (zzcjv != null) {
            return zzcjv;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzclw zzclw = this.f16381c.get(str);
            if (zzclw != null) {
                return zzbph.m21760a((zzclw<? extends zzbpc>) zzclw);
            }
            zzcjv zzcjv2 = this.f16380b.get(str);
            if (zzcjv2 != null) {
                return zzbph.m21759a((zzcjv<? extends zzbpc>) zzcjv2);
            }
            return null;
        } else if (this.f16383e.mo28569d() == null || (a = this.f16382d.get().mo26320a(i, str)) == null) {
            return null;
        } else {
            return zzbph.m21759a((zzcjv<? extends zzbpc>) a);
        }
    }
}
