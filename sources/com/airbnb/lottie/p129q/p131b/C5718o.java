package com.airbnb.lottie.p129q.p131b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.p134i.C5741l;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p140w.C5832c;
import com.airbnb.lottie.p140w.C5833d;

/* renamed from: com.airbnb.lottie.q.b.o */
/* compiled from: TransformKeyframeAnimation */
public class C5718o {

    /* renamed from: a */
    private final Matrix f10204a = new Matrix();

    /* renamed from: b */
    private final C5703a<PointF, PointF> f10205b;

    /* renamed from: c */
    private final C5703a<?, PointF> f10206c;

    /* renamed from: d */
    private final C5703a<C5833d, C5833d> f10207d;

    /* renamed from: e */
    private final C5703a<Float, Float> f10208e;

    /* renamed from: f */
    private final C5703a<Integer, Integer> f10209f;

    /* renamed from: g */
    private final C5703a<?, Float> f10210g;

    /* renamed from: h */
    private final C5703a<?, Float> f10211h;

    public C5718o(C5741l lVar) {
        this.f10205b = lVar.mo19565b().mo19562a();
        this.f10206c = lVar.mo19568e().mo19562a();
        this.f10207d = lVar.mo19570g().mo19562a();
        this.f10208e = lVar.mo19569f().mo19562a();
        this.f10209f = lVar.mo19567d().mo19562a();
        if (lVar.mo19571h() != null) {
            this.f10210g = lVar.mo19571h().mo19562a();
        } else {
            this.f10210g = null;
        }
        if (lVar.mo19566c() != null) {
            this.f10211h = lVar.mo19566c().mo19562a();
        } else {
            this.f10211h = null;
        }
    }

    /* renamed from: a */
    public void mo19523a(C5768a aVar) {
        aVar.mo19658a((C5703a<?, ?>) this.f10205b);
        aVar.mo19658a((C5703a<?, ?>) this.f10206c);
        aVar.mo19658a((C5703a<?, ?>) this.f10207d);
        aVar.mo19658a((C5703a<?, ?>) this.f10208e);
        aVar.mo19658a((C5703a<?, ?>) this.f10209f);
        C5703a<?, Float> aVar2 = this.f10210g;
        if (aVar2 != null) {
            aVar.mo19658a((C5703a<?, ?>) aVar2);
        }
        C5703a<?, Float> aVar3 = this.f10211h;
        if (aVar3 != null) {
            aVar.mo19658a((C5703a<?, ?>) aVar3);
        }
    }

    /* renamed from: b */
    public void mo19526b(float f) {
        this.f10205b.mo19508a(f);
        this.f10206c.mo19508a(f);
        this.f10207d.mo19508a(f);
        this.f10208e.mo19508a(f);
        this.f10209f.mo19508a(f);
        C5703a<?, Float> aVar = this.f10210g;
        if (aVar != null) {
            aVar.mo19508a(f);
        }
        C5703a<?, Float> aVar2 = this.f10211h;
        if (aVar2 != null) {
            aVar2.mo19508a(f);
        }
    }

    /* renamed from: c */
    public C5703a<?, Integer> mo19527c() {
        return this.f10209f;
    }

    /* renamed from: d */
    public C5703a<?, Float> mo19528d() {
        return this.f10210g;
    }

    /* renamed from: a */
    public void mo19522a(C5703a.C5704a aVar) {
        this.f10205b.mo19509a(aVar);
        this.f10206c.mo19509a(aVar);
        this.f10207d.mo19509a(aVar);
        this.f10208e.mo19509a(aVar);
        this.f10209f.mo19509a(aVar);
        C5703a<?, Float> aVar2 = this.f10210g;
        if (aVar2 != null) {
            aVar2.mo19509a(aVar);
        }
        C5703a<?, Float> aVar3 = this.f10211h;
        if (aVar3 != null) {
            aVar3.mo19509a(aVar);
        }
    }

    /* renamed from: b */
    public Matrix mo19525b() {
        this.f10204a.reset();
        PointF d = this.f10206c.mo19513d();
        if (!(d.x == 0.0f && d.y == 0.0f)) {
            this.f10204a.preTranslate(d.x, d.y);
        }
        float floatValue = this.f10208e.mo19513d().floatValue();
        if (floatValue != 0.0f) {
            this.f10204a.preRotate(floatValue);
        }
        C5833d d2 = this.f10207d.mo19513d();
        if (!(d2.mo19747a() == 1.0f && d2.mo19748b() == 1.0f)) {
            this.f10204a.preScale(d2.mo19747a(), d2.mo19748b());
        }
        PointF d3 = this.f10205b.mo19513d();
        if (!(d3.x == 0.0f && d3.y == 0.0f)) {
            this.f10204a.preTranslate(-d3.x, -d3.y);
        }
        return this.f10204a;
    }

    /* renamed from: a */
    public C5703a<?, Float> mo19521a() {
        return this.f10211h;
    }

    /* renamed from: a */
    public Matrix mo19520a(float f) {
        PointF d = this.f10206c.mo19513d();
        PointF d2 = this.f10205b.mo19513d();
        C5833d d3 = this.f10207d.mo19513d();
        float floatValue = this.f10208e.mo19513d().floatValue();
        this.f10204a.reset();
        this.f10204a.preTranslate(d.x * f, d.y * f);
        double d4 = (double) f;
        this.f10204a.preScale((float) Math.pow((double) d3.mo19747a(), d4), (float) Math.pow((double) d3.mo19748b(), d4));
        this.f10204a.preRotate(floatValue * f, d2.x, d2.y);
        return this.f10204a;
    }

    /* renamed from: a */
    public <T> boolean mo19524a(T t, C5832c<T> cVar) {
        C5703a<?, Float> aVar;
        C5703a<?, Float> aVar2;
        if (t == C5670j.f10026e) {
            this.f10205b.mo19510a(cVar);
            return true;
        } else if (t == C5670j.f10027f) {
            this.f10206c.mo19510a(cVar);
            return true;
        } else if (t == C5670j.f10030i) {
            this.f10207d.mo19510a(cVar);
            return true;
        } else if (t == C5670j.f10031j) {
            this.f10208e.mo19510a(cVar);
            return true;
        } else if (t == C5670j.f10024c) {
            this.f10209f.mo19510a(cVar);
            return true;
        } else if (t == C5670j.f10042u && (aVar2 = this.f10210g) != null) {
            aVar2.mo19510a((C5832c<Float>) cVar);
            return true;
        } else if (t != C5670j.f10043v || (aVar = this.f10211h) == null) {
            return false;
        } else {
            aVar.mo19510a((C5832c<Float>) cVar);
            return true;
        }
    }
}
