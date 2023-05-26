package com.airbnb.lottie.p129q.p130a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5756j;
import com.airbnb.lottie.p133s.p135j.C5766q;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.n */
/* compiled from: RectangleContent */
public class C5698n implements C5703a.C5704a, C5692j, C5695l {

    /* renamed from: a */
    private final Path f10149a = new Path();

    /* renamed from: b */
    private final RectF f10150b = new RectF();

    /* renamed from: c */
    private final String f10151c;

    /* renamed from: d */
    private final C5656f f10152d;

    /* renamed from: e */
    private final C5703a<?, PointF> f10153e;

    /* renamed from: f */
    private final C5703a<?, PointF> f10154f;

    /* renamed from: g */
    private final C5703a<?, Float> f10155g;

    /* renamed from: h */
    private C5702r f10156h;

    /* renamed from: i */
    private boolean f10157i;

    public C5698n(C5656f fVar, C5768a aVar, C5756j jVar) {
        this.f10151c = jVar.mo19616b();
        this.f10152d = fVar;
        this.f10153e = jVar.mo19617c().mo19562a();
        this.f10154f = jVar.mo19618d().mo19562a();
        this.f10155g = jVar.mo19615a().mo19562a();
        aVar.mo19658a((C5703a<?, ?>) this.f10153e);
        aVar.mo19658a((C5703a<?, ?>) this.f10154f);
        aVar.mo19658a((C5703a<?, ?>) this.f10155g);
        this.f10153e.mo19509a((C5703a.C5704a) this);
        this.f10154f.mo19509a((C5703a.C5704a) this);
        this.f10155g.mo19509a((C5703a.C5704a) this);
    }

    /* renamed from: b */
    private void m10939b() {
        this.f10157i = false;
        this.f10152d.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19490a() {
        m10939b();
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
    }

    public String getName() {
        return this.f10151c;
    }

    public Path getPath() {
        if (this.f10157i) {
            return this.f10149a;
        }
        this.f10149a.reset();
        PointF d = this.f10154f.mo19513d();
        float f = d.x / 2.0f;
        float f2 = d.y / 2.0f;
        C5703a<?, Float> aVar = this.f10155g;
        float floatValue = aVar == null ? 0.0f : aVar.mo19513d().floatValue();
        float min = Math.min(f, f2);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF d2 = this.f10153e.mo19513d();
        this.f10149a.moveTo(d2.x + f, (d2.y - f2) + floatValue);
        this.f10149a.lineTo(d2.x + f, (d2.y + f2) - floatValue);
        if (floatValue > 0.0f) {
            RectF rectF = this.f10150b;
            float f3 = d2.x;
            float f4 = floatValue * 2.0f;
            float f5 = d2.y;
            rectF.set((f3 + f) - f4, (f5 + f2) - f4, f3 + f, f5 + f2);
            this.f10149a.arcTo(this.f10150b, 0.0f, 90.0f, false);
        }
        this.f10149a.lineTo((d2.x - f) + floatValue, d2.y + f2);
        if (floatValue > 0.0f) {
            RectF rectF2 = this.f10150b;
            float f6 = d2.x;
            float f7 = d2.y;
            float f8 = floatValue * 2.0f;
            rectF2.set(f6 - f, (f7 + f2) - f8, (f6 - f) + f8, f7 + f2);
            this.f10149a.arcTo(this.f10150b, 90.0f, 90.0f, false);
        }
        this.f10149a.lineTo(d2.x - f, (d2.y - f2) + floatValue);
        if (floatValue > 0.0f) {
            RectF rectF3 = this.f10150b;
            float f9 = d2.x;
            float f10 = d2.y;
            float f11 = floatValue * 2.0f;
            rectF3.set(f9 - f, f10 - f2, (f9 - f) + f11, (f10 - f2) + f11);
            this.f10149a.arcTo(this.f10150b, 180.0f, 90.0f, false);
        }
        this.f10149a.lineTo((d2.x + f) - floatValue, d2.y - f2);
        if (floatValue > 0.0f) {
            RectF rectF4 = this.f10150b;
            float f12 = d2.x;
            float f13 = floatValue * 2.0f;
            float f14 = d2.y;
            rectF4.set((f12 + f) - f13, f14 - f2, f12 + f, (f14 - f2) + f13);
            this.f10149a.arcTo(this.f10150b, 270.0f, 90.0f, false);
        }
        this.f10149a.close();
        C5829f.m11381a(this.f10149a, this.f10156h);
        this.f10157i = true;
        return this.f10149a;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5684b bVar = list.get(i);
            if (bVar instanceof C5702r) {
                C5702r rVar = (C5702r) bVar;
                if (rVar.mo19505e() == C5766q.C5767a.Simultaneously) {
                    this.f10156h = rVar;
                    rVar.mo19501a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }
}
