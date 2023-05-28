package androidx.lifecycle;

import androidx.lifecycle.C0514f;

class CompositeGeneratedAdaptersObserver implements C0519h {

    /* renamed from: a */
    private final C0512d[] f2134a;

    CompositeGeneratedAdaptersObserver(C0512d[] dVarArr) {
        this.f2134a = dVarArr;
    }

    /* renamed from: a */
    public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
        C0528o oVar = new C0528o();
        for (C0512d a : this.f2134a) {
            a.mo3037a(jVar, aVar, false, oVar);
        }
        for (C0512d a2 : this.f2134a) {
            a2.mo3037a(jVar, aVar, true, oVar);
        }
    }
}
