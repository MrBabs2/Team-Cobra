package com.airbnb.epoxy;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.epoxy.m0 */
/* compiled from: ViewTypeManager */
class C5606m0 {

    /* renamed from: b */
    private static final Map<Class, Integer> f9888b = new HashMap();

    /* renamed from: a */
    private C5631s<?> f9889a;

    C5606m0() {
    }

    /* renamed from: b */
    static int m10651b(C5631s<?> sVar) {
        int viewType = sVar.getViewType();
        if (viewType != 0) {
            return viewType;
        }
        Class<?> cls = sVar.getClass();
        Integer num = f9888b.get(cls);
        if (num == null) {
            num = Integer.valueOf((-f9888b.size()) - 1);
            f9888b.put(cls, num);
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo19228a(C5631s<?> sVar) {
        this.f9889a = sVar;
        return m10651b(sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5631s<?> mo19229a(C5583d dVar, int i) {
        C5631s<?> sVar = this.f9889a;
        if (sVar != null && m10651b(sVar) == i) {
            return this.f9889a;
        }
        dVar.mo19194a((RuntimeException) new IllegalStateException("Last model did not match expected view type"));
        for (C5631s<?> sVar2 : dVar.mo19200c()) {
            if (m10651b(sVar2) == i) {
                return sVar2;
            }
        }
        C5639x xVar = new C5639x();
        if (i == xVar.getViewType()) {
            return xVar;
        }
        throw new IllegalStateException("Could not find model for view type: " + i);
    }
}
