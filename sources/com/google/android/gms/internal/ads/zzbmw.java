package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzbmw implements zzdti<Set<zzbuz<zzue>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f19212a;

    /* renamed from: b */
    private final zzdtu<Executor> f19213b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f19214c;

    private zzbmw(zzdtu<zzbmn> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<JSONObject> zzdtu3) {
        this.f19212a = zzdtu;
        this.f19213b = zzdtu2;
        this.f19214c = zzdtu3;
    }

    /* renamed from: a */
    public static zzbmw m21378a(zzdtu<zzbmn> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<JSONObject> zzdtu3) {
        return new zzbmw(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzbmn zzbmn = this.f19212a.get();
        Executor executor = this.f19213b.get();
        if (this.f19214c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbuz(zzbmn, executor));
        }
        zzdto.m24236a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
