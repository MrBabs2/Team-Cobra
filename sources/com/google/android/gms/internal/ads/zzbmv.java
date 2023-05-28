package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzbmv implements zzdti<Set<zzbuz<zzbrx>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f19209a;

    /* renamed from: b */
    private final zzdtu<Executor> f19210b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f19211c;

    private zzbmv(zzdtu<zzbmn> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<JSONObject> zzdtu3) {
        this.f19209a = zzdtu;
        this.f19210b = zzdtu2;
        this.f19211c = zzdtu3;
    }

    /* renamed from: a */
    public static zzbmv m21377a(zzdtu<zzbmn> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<JSONObject> zzdtu3) {
        return new zzbmv(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzbmn zzbmn = this.f19209a.get();
        Executor executor = this.f19210b.get();
        if (this.f19211c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbuz(zzbmn, executor));
        }
        zzdto.m24236a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
