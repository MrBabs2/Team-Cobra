package com.airbnb.lottie.p133s.p135j;

import android.graphics.PointF;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.p133s.C5722a;
import com.airbnb.lottie.p139v.C5828e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.j.l */
/* compiled from: ShapeData */
public class C5758l {

    /* renamed from: a */
    private final List<C5722a> f10330a;

    /* renamed from: b */
    private PointF f10331b;

    /* renamed from: c */
    private boolean f10332c;

    public C5758l(PointF pointF, boolean z, List<C5722a> list) {
        ArrayList arrayList = new ArrayList();
        this.f10330a = arrayList;
        this.f10331b = pointF;
        this.f10332c = z;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    private void m11134a(float f, float f2) {
        if (this.f10331b == null) {
            this.f10331b = new PointF();
        }
        this.f10331b.set(f, f2);
    }

    /* renamed from: b */
    public PointF mo19626b() {
        return this.f10331b;
    }

    /* renamed from: c */
    public boolean mo19627c() {
        return this.f10332c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f10330a.size() + "closed=" + this.f10332c + '}';
    }

    /* renamed from: a */
    public List<C5722a> mo19624a() {
        return this.f10330a;
    }

    /* renamed from: a */
    public void mo19625a(C5758l lVar, C5758l lVar2, float f) {
        if (this.f10331b == null) {
            this.f10331b = new PointF();
        }
        this.f10332c = lVar.mo19627c() || lVar2.mo19627c();
        if (lVar.mo19624a().size() != lVar2.mo19624a().size()) {
            C5647c.m10756d("Curves must have the same number of control points. Shape 1: " + lVar.mo19624a().size() + "\tShape 2: " + lVar2.mo19624a().size());
        }
        if (this.f10330a.isEmpty()) {
            int min = Math.min(lVar.mo19624a().size(), lVar2.mo19624a().size());
            for (int i = 0; i < min; i++) {
                this.f10330a.add(new C5722a());
            }
        }
        PointF b = lVar.mo19626b();
        PointF b2 = lVar2.mo19626b();
        m11134a(C5828e.m11375c(b.x, b2.x, f), C5828e.m11375c(b.y, b2.y, f));
        for (int size = this.f10330a.size() - 1; size >= 0; size--) {
            C5722a aVar = lVar.mo19624a().get(size);
            C5722a aVar2 = lVar2.mo19624a().get(size);
            PointF a = aVar.mo19535a();
            PointF b3 = aVar.mo19537b();
            PointF c = aVar.mo19539c();
            PointF a2 = aVar2.mo19535a();
            PointF b4 = aVar2.mo19537b();
            PointF c2 = aVar2.mo19539c();
            this.f10330a.get(size).mo19536a(C5828e.m11375c(a.x, a2.x, f), C5828e.m11375c(a.y, a2.y, f));
            this.f10330a.get(size).mo19538b(C5828e.m11375c(b3.x, b4.x, f), C5828e.m11375c(b3.y, b4.y, f));
            this.f10330a.get(size).mo19540c(C5828e.m11375c(c.x, c2.x, f), C5828e.m11375c(c.y, c2.y, f));
        }
    }

    public C5758l() {
        this.f10330a = new ArrayList();
    }
}
