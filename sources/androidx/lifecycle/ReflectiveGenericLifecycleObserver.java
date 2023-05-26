package androidx.lifecycle;

import androidx.lifecycle.C0507a;
import androidx.lifecycle.C0514f;

class ReflectiveGenericLifecycleObserver implements C0519h {

    /* renamed from: a */
    private final Object f2156a;

    /* renamed from: b */
    private final C0507a.C0508a f2157b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2156a = obj;
        this.f2157b = C0507a.f2159c.mo3018a(obj.getClass());
    }

    /* renamed from: a */
    public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
        this.f2157b.mo3020a(jVar, aVar, this.f2156a);
    }
}
