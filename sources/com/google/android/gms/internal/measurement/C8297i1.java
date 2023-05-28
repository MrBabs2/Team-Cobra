package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i1 */
final class C8297i1 extends C8287g1 {

    /* renamed from: c */
    private static final Class<?> f23265c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C8297i1() {
        super();
    }

    /* renamed from: b */
    private static <E> List<E> m26015b(Object obj, long j) {
        return (List) C8367y2.m26320f(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30112a(Object obj, long j) {
        Object obj2;
        List list = (List) C8367y2.m26320f(obj, j);
        if (list instanceof zzve) {
            obj2 = ((zzve) list).mo30449i();
        } else if (!f23265c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C8258a2) || !(list instanceof zzuu)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzuu zzuu = (zzuu) list;
                if (zzuu.mo30094H()) {
                    zzuu.mo30101s();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C8367y2.m26298a(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.measurement.zzvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.measurement.zzvd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.measurement.zzvd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m26014a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m26015b(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzve
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.zzvd r0 = new com.google.android.gms.internal.measurement.zzvd
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C8258a2
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzuu
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.zzuu r0 = (com.google.android.gms.internal.measurement.zzuu) r0
            com.google.android.gms.internal.measurement.zzuu r6 = r0.mo30071b(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C8367y2.m26298a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f23265c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C8367y2.m26298a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzxg
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.zzvd r1 = new com.google.android.gms.internal.measurement.zzvd
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.measurement.zzxg r0 = (com.google.android.gms.internal.measurement.zzxg) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C8367y2.m26298a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C8258a2
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.zzuu
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.zzuu r1 = (com.google.android.gms.internal.measurement.zzuu) r1
            boolean r2 = r1.mo30094H()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.zzuu r0 = r1.mo30071b(r0)
            com.google.android.gms.internal.measurement.C8367y2.m26298a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C8297i1.m26014a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo30113a(Object obj, Object obj2, long j) {
        List b = m26015b(obj2, j);
        List a = m26014a(obj, j, b.size());
        int size = a.size();
        int size2 = b.size();
        if (size > 0 && size2 > 0) {
            a.addAll(b);
        }
        if (size > 0) {
            b = a;
        }
        C8367y2.m26298a(obj, j, (Object) b);
    }
}
