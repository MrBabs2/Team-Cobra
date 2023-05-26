package com.airbnb.lottie.p129q.p130a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5744a;
import com.airbnb.lottie.p133s.p135j.C5766q;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5832c;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.e */
/* compiled from: EllipseContent */
public class C5687e implements C5695l, C5703a.C5704a, C5692j {

    /* renamed from: a */
    private final Path f10085a = new Path();

    /* renamed from: b */
    private final String f10086b;

    /* renamed from: c */
    private final C5656f f10087c;

    /* renamed from: d */
    private final C5703a<?, PointF> f10088d;

    /* renamed from: e */
    private final C5703a<?, PointF> f10089e;

    /* renamed from: f */
    private final C5744a f10090f;

    /* renamed from: g */
    private C5702r f10091g;

    /* renamed from: h */
    private boolean f10092h;

    public C5687e(C5656f fVar, C5768a aVar, C5744a aVar2) {
        this.f10086b = aVar2.mo19573a();
        this.f10087c = fVar;
        this.f10088d = aVar2.mo19575c().mo19562a();
        this.f10089e = aVar2.mo19574b().mo19562a();
        this.f10090f = aVar2;
        aVar.mo19658a((C5703a<?, ?>) this.f10088d);
        aVar.mo19658a((C5703a<?, ?>) this.f10089e);
        this.f10088d.mo19509a((C5703a.C5704a) this);
        this.f10089e.mo19509a((C5703a.C5704a) this);
    }

    /* renamed from: b */
    private void m10903b() {
        this.f10092h = false;
        this.f10087c.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19490a() {
        m10903b();
    }

    public String getName() {
        return this.f10086b;
    }

    public Path getPath() {
        if (this.f10092h) {
            return this.f10085a;
        }
        this.f10085a.reset();
        PointF d = this.f10088d.mo19513d();
        float f = d.x / 2.0f;
        float f2 = d.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f10085a.reset();
        if (this.f10090f.mo19576d()) {
            float f5 = -f2;
            this.f10085a.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.f10085a.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            float f10 = f5;
            this.f10085a.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f11 = f3 + 0.0f;
            this.f10085a.cubicTo(f11, f2, f, f9, f, 0.0f);
            this.f10085a.cubicTo(f, f8, f11, f10, 0.0f, f10);
        } else {
            float f12 = -f2;
            this.f10085a.moveTo(0.0f, f12);
            float f13 = f3 + 0.0f;
            float f14 = 0.0f - f4;
            this.f10085a.cubicTo(f13, f12, f, f14, f, 0.0f);
            float f15 = f4 + 0.0f;
            this.f10085a.cubicTo(f, f15, f13, f2, 0.0f, f2);
            float f16 = 0.0f - f3;
            float f17 = -f;
            this.f10085a.cubicTo(f16, f2, f17, f15, f17, 0.0f);
            float f18 = f12;
            this.f10085a.cubicTo(f17, f14, f16, f18, 0.0f, f18);
        }
        PointF d2 = this.f10089e.mo19513d();
        this.f10085a.offset(d2.x, d2.y);
        this.f10085a.close();
        C5829f.m11381a(this.f10085a, this.f10091g);
        this.f10092h = true;
        return this.f10085a;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < list.size(); i++) {
            C5684b bVar = list.get(i);
            if (bVar instanceof C5702r) {
                C5702r rVar = (C5702r) bVar;
                if (rVar.mo19505e() == C5766q.C5767a.Simultaneously) {
                    this.f10091g = rVar;
                    rVar.mo19501a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        if (t == C5670j.f10028g) {
            this.f10088d.mo19510a(cVar);
        } else if (t == C5670j.f10029h) {
            this.f10089e.mo19510a(cVar);
        }
    }
}
