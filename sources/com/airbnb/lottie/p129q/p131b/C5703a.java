package com.airbnb.lottie.p129q.p131b;

import com.airbnb.lottie.p140w.C5830a;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.a */
/* compiled from: BaseKeyframeAnimation */
public abstract class C5703a<K, A> {

    /* renamed from: a */
    final List<C5704a> f10183a = new ArrayList();

    /* renamed from: b */
    private boolean f10184b = false;

    /* renamed from: c */
    private final List<? extends C5830a<K>> f10185c;

    /* renamed from: d */
    private float f10186d = 0.0f;

    /* renamed from: e */
    protected C5832c<A> f10187e;

    /* renamed from: f */
    private C5830a<K> f10188f;

    /* renamed from: com.airbnb.lottie.q.b.a$a */
    /* compiled from: BaseKeyframeAnimation */
    public interface C5704a {
        /* renamed from: a */
        void mo19490a();
    }

    C5703a(List<? extends C5830a<K>> list) {
        this.f10185c = list;
    }

    /* renamed from: g */
    private C5830a<K> m10963g() {
        C5830a<K> aVar = this.f10188f;
        if (aVar != null && aVar.mo19739a(this.f10186d)) {
            return this.f10188f;
        }
        List<? extends C5830a<K>> list = this.f10185c;
        C5830a<K> aVar2 = (C5830a) list.get(list.size() - 1);
        if (this.f10186d < aVar2.mo19740b()) {
            for (int size = this.f10185c.size() - 1; size >= 0; size--) {
                aVar2 = (C5830a) this.f10185c.get(size);
                if (aVar2.mo19739a(this.f10186d)) {
                    break;
                }
            }
        }
        this.f10188f = aVar2;
        return aVar2;
    }

    /* renamed from: h */
    private float m10964h() {
        C5830a g = m10963g();
        if (g.mo19741c()) {
            return 0.0f;
        }
        return g.f10503d.getInterpolation(mo19511b());
    }

    /* renamed from: i */
    private float m10965i() {
        if (this.f10185c.isEmpty()) {
            return 0.0f;
        }
        return ((C5830a) this.f10185c.get(0)).mo19740b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract A mo19507a(C5830a<K> aVar, float f);

    /* renamed from: a */
    public void mo19509a(C5704a aVar) {
        this.f10183a.add(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo19511b() {
        if (this.f10184b) {
            return 0.0f;
        }
        C5830a g = m10963g();
        if (g.mo19741c()) {
            return 0.0f;
        }
        return (this.f10186d - g.mo19740b()) / (g.mo19738a() - g.mo19740b());
    }

    /* renamed from: c */
    public float mo19512c() {
        return this.f10186d;
    }

    /* renamed from: d */
    public A mo19513d() {
        return mo19507a(m10963g(), m10964h());
    }

    /* renamed from: e */
    public void mo19514e() {
        for (int i = 0; i < this.f10183a.size(); i++) {
            this.f10183a.get(i).mo19490a();
        }
    }

    /* renamed from: f */
    public void mo19515f() {
        this.f10184b = true;
    }

    /* renamed from: a */
    public void mo19508a(float f) {
        if (f < m10965i()) {
            f = m10965i();
        } else if (f > mo19506a()) {
            f = mo19506a();
        }
        if (f != this.f10186d) {
            this.f10186d = f;
            mo19514e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo19506a() {
        if (this.f10185c.isEmpty()) {
            return 1.0f;
        }
        List<? extends C5830a<K>> list = this.f10185c;
        return ((C5830a) list.get(list.size() - 1)).mo19738a();
    }

    /* renamed from: a */
    public void mo19510a(C5832c<A> cVar) {
        C5832c<A> cVar2 = this.f10187e;
        if (cVar2 != null) {
            cVar2.mo19746a((C5703a<?, ?>) null);
        }
        this.f10187e = cVar;
        if (cVar != null) {
            cVar.mo19746a((C5703a<?, ?>) this);
        }
    }
}
