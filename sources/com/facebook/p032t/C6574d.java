package com.facebook.p032t;

import android.content.Context;
import com.facebook.C4716f;
import com.facebook.internal.C6372a;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.t.d */
/* compiled from: AppEventCollection */
class C6574d {

    /* renamed from: a */
    private final HashMap<C6564a, C6600o> f12209a = new HashMap<>();

    /* renamed from: a */
    public synchronized void mo21314a(C6597n nVar) {
        if (nVar != null) {
            for (C6564a next : nVar.mo21343a()) {
                C6600o b = m13940b(next);
                for (C6570c a : nVar.mo21346b(next)) {
                    b.mo21349a(a);
                }
            }
        }
    }

    /* renamed from: b */
    public synchronized Set<C6564a> mo21315b() {
        return this.f12209a.keySet();
    }

    /* renamed from: b */
    private synchronized C6600o m13940b(C6564a aVar) {
        C6600o oVar;
        oVar = this.f12209a.get(aVar);
        if (oVar == null) {
            Context e = C4716f.m7696e();
            oVar = new C6600o(C6372a.m13215d(e), C4728g.m7723a(e));
        }
        this.f12209a.put(aVar, oVar);
        return oVar;
    }

    /* renamed from: a */
    public synchronized void mo21313a(C6564a aVar, C6570c cVar) {
        m13940b(aVar).mo21349a(cVar);
    }

    /* renamed from: a */
    public synchronized C6600o mo21312a(C6564a aVar) {
        return this.f12209a.get(aVar);
    }

    /* renamed from: a */
    public synchronized int mo21311a() {
        int i;
        i = 0;
        for (C6600o a : this.f12209a.values()) {
            i += a.mo21347a();
        }
        return i;
    }
}
