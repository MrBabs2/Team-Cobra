package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
final class C8302j1 extends C8287g1 {
    private C8302j1() {
        super();
    }

    /* renamed from: b */
    private static <E> zzuu<E> m26021b(Object obj, long j) {
        return (zzuu) C8367y2.m26320f(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30112a(Object obj, long j) {
        m26021b(obj, j).mo30101s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo30113a(Object obj, Object obj2, long j) {
        zzuu b = m26021b(obj, j);
        zzuu b2 = m26021b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.mo30094H()) {
                b = b.mo30071b(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        C8367y2.m26298a(obj, j, (Object) b2);
    }
}
