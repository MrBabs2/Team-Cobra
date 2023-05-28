package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ov */
final class C7820ov extends C7709lv {
    private C7820ov() {
        super();
    }

    /* renamed from: c */
    private static <E> zzdoj<E> m17831c(Object obj, long j) {
        return (zzdoj) C7596ix.m17234f(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo26220a(Object obj, long j) {
        zzdoj c = m17831c(obj, j);
        if (c.mo26833q()) {
            return c;
        }
        int size = c.size();
        zzdoj c2 = c.mo25790c(size == 0 ? 10 : size << 1);
        C7596ix.m17211a(obj, j, (Object) c2);
        return c2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo26222b(Object obj, long j) {
        m17831c(obj, j).mo26836w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo26221a(Object obj, Object obj2, long j) {
        zzdoj c = m17831c(obj, j);
        zzdoj c2 = m17831c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo26833q()) {
                c = c.mo25790c(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C7596ix.m17211a(obj, j, (Object) c2);
    }
}
