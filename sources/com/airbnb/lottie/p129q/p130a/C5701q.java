package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p133s.p135j.C5762p;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p140w.C5832c;

/* renamed from: com.airbnb.lottie.q.a.q */
/* compiled from: StrokeContent */
public class C5701q extends C5681a {

    /* renamed from: o */
    private final C5768a f10173o;

    /* renamed from: p */
    private final String f10174p;

    /* renamed from: q */
    private final C5703a<Integer, Integer> f10175q;

    /* renamed from: r */
    private C5703a<ColorFilter, ColorFilter> f10176r;

    public C5701q(C5656f fVar, C5768a aVar, C5762p pVar) {
        super(fVar, aVar, pVar.mo19640a().mo19649a(), pVar.mo19643d().mo19650a(), pVar.mo19645f(), pVar.mo19647h(), pVar.mo19648i(), pVar.mo19644e(), pVar.mo19642c());
        this.f10173o = aVar;
        this.f10174p = pVar.mo19646g();
        C5703a<Integer, Integer> a = pVar.mo19641b().mo19562a();
        this.f10175q = a;
        a.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10175q);
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        this.f10069i.setColor(this.f10175q.mo19513d().intValue());
        C5703a<ColorFilter, ColorFilter> aVar = this.f10176r;
        if (aVar != null) {
            this.f10069i.setColorFilter(aVar.mo19513d());
        }
        super.mo19491a(canvas, matrix, i);
    }

    public String getName() {
        return this.f10174p;
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        super.mo19494a(t, cVar);
        if (t == C5670j.f10023b) {
            this.f10175q.mo19510a(cVar);
        } else if (t != C5670j.f10045x) {
        } else {
            if (cVar == null) {
                this.f10176r = null;
                return;
            }
            C5719p pVar = new C5719p(cVar);
            this.f10176r = pVar;
            pVar.mo19509a((C5703a.C5704a) this);
            this.f10173o.mo19658a((C5703a<?, ?>) this.f10175q);
        }
    }
}
