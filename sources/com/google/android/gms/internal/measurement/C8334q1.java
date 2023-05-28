package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q1 */
final class C8334q1 implements C8330p1 {
    C8334q1() {
    }

    /* renamed from: a */
    public final Object mo30220a(Object obj) {
        ((zzvp) obj).mo30456c();
        return obj;
    }

    /* renamed from: b */
    public final C8326o1<?, ?> mo30222b(Object obj) {
        throw new NoSuchMethodError();
    }

    /* renamed from: c */
    public final Map<?, ?> mo30223c(Object obj) {
        return (zzvp) obj;
    }

    /* renamed from: a */
    public final Object mo30221a(Object obj, Object obj2) {
        zzvp zzvp = (zzvp) obj;
        zzvp zzvp2 = (zzvp) obj2;
        if (!zzvp2.isEmpty()) {
            if (!zzvp.mo30455b()) {
                zzvp = zzvp.mo30458e();
            }
            zzvp.mo30454a(zzvp2);
        }
        return zzvp;
    }

    /* renamed from: a */
    public final int mo30219a(int i, Object obj, Object obj2) {
        zzvp zzvp = (zzvp) obj;
        if (zzvp.isEmpty()) {
            return 0;
        }
        Iterator it = zzvp.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
