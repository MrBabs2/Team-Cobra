package com.airbnb.lottie.p129q.p130a;

import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.p135j.C5766q;
import com.airbnb.lottie.p133s.p136k.C5768a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.r */
/* compiled from: TrimPathContent */
public class C5702r implements C5684b, C5703a.C5704a {

    /* renamed from: a */
    private final String f10177a;

    /* renamed from: b */
    private final List<C5703a.C5704a> f10178b = new ArrayList();

    /* renamed from: c */
    private final C5766q.C5767a f10179c;

    /* renamed from: d */
    private final C5703a<?, Float> f10180d;

    /* renamed from: e */
    private final C5703a<?, Float> f10181e;

    /* renamed from: f */
    private final C5703a<?, Float> f10182f;

    public C5702r(C5768a aVar, C5766q qVar) {
        this.f10177a = qVar.mo19652b();
        this.f10179c = qVar.mo19655e();
        this.f10180d = qVar.mo19654d().mo19562a();
        this.f10181e = qVar.mo19651a().mo19562a();
        this.f10182f = qVar.mo19653c().mo19562a();
        aVar.mo19658a((C5703a<?, ?>) this.f10180d);
        aVar.mo19658a((C5703a<?, ?>) this.f10181e);
        aVar.mo19658a((C5703a<?, ?>) this.f10182f);
        this.f10180d.mo19509a((C5703a.C5704a) this);
        this.f10181e.mo19509a((C5703a.C5704a) this);
        this.f10182f.mo19509a((C5703a.C5704a) this);
    }

    /* renamed from: a */
    public void mo19490a() {
        for (int i = 0; i < this.f10178b.size(); i++) {
            this.f10178b.get(i).mo19490a();
        }
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
    }

    /* renamed from: b */
    public C5703a<?, Float> mo19502b() {
        return this.f10181e;
    }

    /* renamed from: c */
    public C5703a<?, Float> mo19503c() {
        return this.f10182f;
    }

    /* renamed from: d */
    public C5703a<?, Float> mo19504d() {
        return this.f10180d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C5766q.C5767a mo19505e() {
        return this.f10179c;
    }

    public String getName() {
        return this.f10177a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19501a(C5703a.C5704a aVar) {
        this.f10178b.add(aVar);
    }
}
