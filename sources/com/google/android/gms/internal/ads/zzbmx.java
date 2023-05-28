package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzbmx implements zzdti<Set<zzbuz<zzo>>> {

    /* renamed from: a */
    private final zzdtu<zzbmn> f19215a;

    /* renamed from: b */
    private final zzdtu<Executor> f19216b;

    /* renamed from: c */
    private final zzdtu<JSONObject> f19217c;

    private zzbmx(zzdtu<zzbmn> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<JSONObject> zzdtu3) {
        this.f19215a = zzdtu;
        this.f19216b = zzdtu2;
        this.f19217c = zzdtu3;
    }

    /* renamed from: a */
    public static zzbmx m21379a(zzdtu<zzbmn> zzdtu, zzdtu<Executor> zzdtu2, zzdtu<JSONObject> zzdtu3) {
        return new zzbmx(zzdtu, zzdtu2, zzdtu3);
    }

    public final /* synthetic */ Object get() {
        Set set;
        zzbmn zzbmn = this.f19215a.get();
        Executor executor = this.f19216b.get();
        if (this.f19217c.get() == null) {
            set = Collections.emptySet();
        } else {
            set = Collections.singleton(new zzbuz(zzbmn, executor));
        }
        zzdto.m24236a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
