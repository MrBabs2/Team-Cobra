package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zzbva extends zzbts<zzue> implements zzue {

    /* renamed from: g */
    private Map<View, zzua> f19506g = new WeakHashMap(1);

    /* renamed from: h */
    private final Context f19507h;

    /* renamed from: i */
    private final zzcxm f19508i;

    public zzbva(Context context, Set<zzbuz<zzue>> set, zzcxm zzcxm) {
        super(set);
        this.f19507h = context;
        this.f19508i = zzcxm;
    }

    /* renamed from: a */
    public final synchronized void mo25659a(zzud zzud) {
        mo28426a(new C7283af(zzud));
    }

    /* renamed from: b */
    public final synchronized void mo28455b(View view) {
        if (this.f19506g.containsKey(view)) {
            this.f19506g.get(view).mo29779b((zzue) this);
            this.f19506g.remove(view);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28454a(View view) {
        zzua zzua = this.f19506g.get(view);
        if (zzua == null) {
            zzua = new zzua(this.f19507h, view);
            zzua.mo29778a((zzue) this);
            this.f19506g.put(view, zzua);
        }
        if (this.f19508i != null && this.f19508i.f21115N) {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17866X0)).booleanValue()) {
                zzua.mo29777a(((Long) zzyt.m25670e().mo27163a(zzacu.f17862W0)).longValue());
                return;
            }
        }
        zzua.mo29776a();
    }
}
