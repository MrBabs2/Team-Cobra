package com.airbnb.lottie.p129q.p130a;

import android.graphics.Path;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.p135j.C5758l;
import com.airbnb.lottie.p133s.p135j.C5761o;
import com.airbnb.lottie.p133s.p135j.C5766q;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5829f;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.p */
/* compiled from: ShapeContent */
public class C5700p implements C5695l, C5703a.C5704a {

    /* renamed from: a */
    private final Path f10167a = new Path();

    /* renamed from: b */
    private final String f10168b;

    /* renamed from: c */
    private final C5656f f10169c;

    /* renamed from: d */
    private final C5703a<?, Path> f10170d;

    /* renamed from: e */
    private boolean f10171e;

    /* renamed from: f */
    private C5702r f10172f;

    public C5700p(C5656f fVar, C5768a aVar, C5761o oVar) {
        this.f10168b = oVar.mo19637a();
        this.f10169c = fVar;
        C5703a<C5758l, Path> a = oVar.mo19638b().mo19562a();
        this.f10170d = a;
        aVar.mo19658a((C5703a<?, ?>) a);
        this.f10170d.mo19509a((C5703a.C5704a) this);
    }

    /* renamed from: b */
    private void m10951b() {
        this.f10171e = false;
        this.f10169c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19490a() {
        m10951b();
    }

    public String getName() {
        return this.f10168b;
    }

    public Path getPath() {
        if (this.f10171e) {
            return this.f10167a;
        }
        this.f10167a.reset();
        this.f10167a.set(this.f10170d.mo19513d());
        this.f10167a.setFillType(Path.FillType.EVEN_ODD);
        C5829f.m11381a(this.f10167a, this.f10172f);
        this.f10171e = true;
        return this.f10167a;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5684b bVar = list.get(i);
            if (bVar instanceof C5702r) {
                C5702r rVar = (C5702r) bVar;
                if (rVar.mo19505e() == C5766q.C5767a.Simultaneously) {
                    this.f10172f = rVar;
                    rVar.mo19501a(this);
                }
            }
        }
    }
}
