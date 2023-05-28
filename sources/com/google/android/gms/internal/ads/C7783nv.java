package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nv */
final class C7783nv extends C7709lv {

    /* renamed from: c */
    private static final Class<?> f16404c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C7783nv() {
        super();
    }

    /* renamed from: c */
    private static <E> List<E> m17694c(Object obj, long j) {
        return (List) C7596ix.m17234f(obj, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo26220a(Object obj, long j) {
        return m17693a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo26222b(Object obj, long j) {
        Object obj2;
        List list = (List) C7596ix.m17234f(obj, j);
        if (list instanceof zzdot) {
            obj2 = ((zzdot) list).mo29157l();
        } else if (!f16404c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C7558hw) || !(list instanceof zzdoj)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzdoj zzdoj = (zzdoj) list;
                if (zzdoj.mo26833q()) {
                    zzdoj.mo26836w();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C7596ix.m17211a(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.zzdos} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.zzdos} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.zzdos} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m17693a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m17694c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzdot
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzdos r0 = new com.google.android.gms.internal.ads.zzdos
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C7558hw
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzdoj
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzdoj r0 = (com.google.android.gms.internal.ads.zzdoj) r0
            com.google.android.gms.internal.ads.zzdoj r6 = r0.mo25790c(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f16404c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzdqw
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzdos r1 = new com.google.android.gms.internal.ads.zzdos
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.zzdqw r0 = (com.google.android.gms.internal.ads.zzdqw) r0
            r1.addAll(r0)
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C7558hw
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzdoj
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.ads.zzdoj r1 = (com.google.android.gms.internal.ads.zzdoj) r1
            boolean r2 = r1.mo26833q()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.zzdoj r0 = r1.mo25790c(r0)
            com.google.android.gms.internal.ads.C7596ix.m17211a((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7783nv.m17693a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <E> void mo26221a(Object obj, Object obj2, long j) {
        List c = m17694c(obj2, j);
        List a = m17693a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C7596ix.m17211a(obj, j, (Object) c);
    }
}
