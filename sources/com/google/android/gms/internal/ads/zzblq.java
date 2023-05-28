package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzblq implements zzbal<zzcxu, zzcxu> {

    /* renamed from: a */
    private Map<String, zzbls> f19137a;

    public zzblq(Map<String, zzbls> map) {
        this.f19137a = map;
    }

    public final /* synthetic */ zzbbh zzf(Object obj) throws Exception {
        zzcxu zzcxu = (zzcxu) obj;
        for (zzcxt next : zzcxu.f21163b.f21159c) {
            if (this.f19137a.containsKey(next.f21160a)) {
                this.f19137a.get(next.f21160a).mo28258a(next.f21161b);
            }
        }
        return zzbar.m20539a(zzcxu);
    }
}
