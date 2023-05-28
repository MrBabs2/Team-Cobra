package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class zzcfk implements zzczz {

    /* renamed from: f */
    private final Map<zzczs, Long> f20110f = new HashMap();

    /* renamed from: g */
    private final zzcfi f20111g;

    /* renamed from: h */
    private final Clock f20112h;

    /* renamed from: i */
    private final Map<zzczs, C7581ii> f20113i = new HashMap();

    public zzcfk(zzcfi zzcfi, Set<C7581ii> set, Clock clock) {
        this.f20111g = zzcfi;
        for (C7581ii next : set) {
            this.f20113i.put(next.f15665c, next);
        }
        this.f20112h = clock;
    }

    /* renamed from: a */
    public final void mo28668a(zzczs zzczs, String str, Throwable th) {
        if (this.f20110f.containsKey(zzczs)) {
            long c = this.f20112h.mo25499c() - this.f20110f.get(zzczs).longValue();
            Map<String, String> a = this.f20111g.mo28673a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(c));
            a.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.f20113i.containsKey(zzczs)) {
            m22471a(zzczs, false);
        }
    }

    /* renamed from: b */
    public final void mo28669b(zzczs zzczs, String str) {
        this.f20110f.put(zzczs, Long.valueOf(this.f20112h.mo25499c()));
    }

    /* renamed from: c */
    public final void mo28670c(zzczs zzczs, String str) {
    }

    /* renamed from: a */
    public final void mo28667a(zzczs zzczs, String str) {
        if (this.f20110f.containsKey(zzczs)) {
            long c = this.f20112h.mo25499c() - this.f20110f.get(zzczs).longValue();
            Map<String, String> a = this.f20111g.mo28673a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(c));
            a.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.f20113i.containsKey(zzczs)) {
            m22471a(zzczs, true);
        }
    }

    /* renamed from: a */
    private final void m22471a(zzczs zzczs, boolean z) {
        zzczs b = this.f20113i.get(zzczs).f15664b;
        String str = z ? "s." : "f.";
        if (this.f20110f.containsKey(b)) {
            long c = this.f20112h.mo25499c() - this.f20110f.get(b).longValue();
            Map<String, String> a = this.f20111g.mo28673a();
            String valueOf = String.valueOf(this.f20113i.get(zzczs).f15663a);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(c));
            a.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }
}
