package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.preload.C5621c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p220g0.C9146c;
import kotlin.p262y.C10507e0;

/* renamed from: com.airbnb.epoxy.preload.d */
/* compiled from: PreloadTargetProvider.kt */
public final class C5622d<P extends C5621c> {

    /* renamed from: a */
    private final ArrayDeque<P> f9910a;

    public C5622d(int i, C9102a<? extends P> aVar) {
        C10202j.m34178b(aVar, "requestHolderFactory");
        C9146c d = C9150f.m29854d(0, i);
        ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            ((C10507e0) it).mo33492a();
            arrayList.add((C5621c) aVar.invoke());
        }
        this.f9910a = new ArrayDeque<>(arrayList);
    }

    /* renamed from: a */
    public final void mo19293a() {
        for (P clear : this.f9910a) {
            clear.clear();
        }
    }

    /* renamed from: b */
    public final P mo19294b() {
        P p = (C5621c) this.f9910a.poll();
        this.f9910a.offer(p);
        p.clear();
        C10202j.m34174a((Object) p, "result");
        return p;
    }
}
