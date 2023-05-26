package com.airbnb.epoxy;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p050l.p066e.C4873d;

/* renamed from: com.airbnb.epoxy.j */
/* compiled from: DiffPayload */
public class C5599j {

    /* renamed from: a */
    private final C5631s<?> f9877a;

    /* renamed from: b */
    private final C4873d<C5631s<?>> f9878b;

    C5599j(List<? extends C5631s<?>> list) {
        if (!list.isEmpty()) {
            int size = list.size();
            if (size == 1) {
                this.f9877a = (C5631s) list.get(0);
                this.f9878b = null;
                return;
            }
            this.f9877a = null;
            this.f9878b = new C4873d<>(size);
            for (C5631s sVar : list) {
                this.f9878b.mo16945c(sVar.mo19311id(), sVar);
            }
            return;
        }
        throw new IllegalStateException("Models must not be empty");
    }

    /* renamed from: a */
    public static C5631s<?> m10633a(List<Object> list, long j) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            C5599j jVar = (C5599j) it.next();
            C5631s<?> sVar = jVar.f9877a;
            if (sVar == null) {
                C5631s<?> a = jVar.f9878b.mo16936a(j);
                if (a != null) {
                    return a;
                }
            } else if (sVar.mo19311id() == j) {
                return jVar.f9877a;
            }
        }
        return null;
    }

    public C5599j(C5631s<?> sVar) {
        this((List<? extends C5631s<?>>) Collections.singletonList(sVar));
    }
}
