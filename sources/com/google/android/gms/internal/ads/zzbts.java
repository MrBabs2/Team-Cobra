package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzbts<ListenerT> {

    /* renamed from: f */
    private final Map<ListenerT, Executor> f19469f = new HashMap();

    protected zzbts(Set<zzbuz<ListenerT>> set) {
        m21874a(set);
    }

    /* renamed from: a */
    public final synchronized void mo28427a(zzbuz<ListenerT> zzbuz) {
        mo28428a(zzbuz.f19504a, zzbuz.f19505b);
    }

    /* renamed from: a */
    public final synchronized void mo28428a(ListenerT listenert, Executor executor) {
        this.f19469f.put(listenert, executor);
    }

    /* renamed from: a */
    private final synchronized void m21874a(Set<zzbuz<ListenerT>> set) {
        for (zzbuz<ListenerT> a : set) {
            mo28427a(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo28426a(zzbtu<ListenerT> zzbtu) {
        for (Map.Entry next : this.f19469f.entrySet()) {
            ((Executor) next.getValue()).execute(new C7988te(zzbtu, next.getKey()));
        }
    }
}
