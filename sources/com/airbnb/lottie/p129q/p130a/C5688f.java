package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5759m;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.f */
/* compiled from: FillContent */
public class C5688f implements C5686d, C5703a.C5704a, C5692j {

    /* renamed from: a */
    private final Path f10093a = new Path();

    /* renamed from: b */
    private final Paint f10094b = new Paint(1);

    /* renamed from: c */
    private final C5768a f10095c;

    /* renamed from: d */
    private final String f10096d;

    /* renamed from: e */
    private final List<C5695l> f10097e = new ArrayList();

    /* renamed from: f */
    private final C5703a<Integer, Integer> f10098f;

    /* renamed from: g */
    private final C5703a<Integer, Integer> f10099g;

    /* renamed from: h */
    private C5703a<ColorFilter, ColorFilter> f10100h;

    /* renamed from: i */
    private final C5656f f10101i;

    public C5688f(C5656f fVar, C5768a aVar, C5759m mVar) {
        this.f10095c = aVar;
        this.f10096d = mVar.mo19631c();
        this.f10101i = fVar;
        if (mVar.mo19629a() == null || mVar.mo19632d() == null) {
            this.f10098f = null;
            this.f10099g = null;
            return;
        }
        this.f10093a.setFillType(mVar.mo19630b());
        C5703a<Integer, Integer> a = mVar.mo19629a().mo19562a();
        this.f10098f = a;
        a.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10098f);
        C5703a<Integer, Integer> a2 = mVar.mo19632d().mo19562a();
        this.f10099g = a2;
        a2.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10099g);
    }

    /* renamed from: a */
    public void mo19490a() {
        this.f10101i.invalidateSelf();
    }

    public String getName() {
        return this.f10096d;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C5684b bVar = list2.get(i);
            if (bVar instanceof C5695l) {
                this.f10097e.add((C5695l) bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        C5647c.m10753a("FillContent#draw");
        this.f10094b.setColor(this.f10098f.mo19513d().intValue());
        this.f10094b.setAlpha(C5828e.m11369a((int) ((((((float) i) / 255.0f) * ((float) this.f10099g.mo19513d().intValue())) / 100.0f) * 255.0f), 0, 255));
        C5703a<ColorFilter, ColorFilter> aVar = this.f10100h;
        if (aVar != null) {
            this.f10094b.setColorFilter(aVar.mo19513d());
        }
        this.f10093a.reset();
        for (int i2 = 0; i2 < this.f10097e.size(); i2++) {
            this.f10093a.addPath(this.f10097e.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.f10093a, this.f10094b);
        C5647c.m10755c("FillContent#draw");
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        this.f10093a.reset();
        for (int i = 0; i < this.f10097e.size(); i++) {
            this.f10093a.addPath(this.f10097e.get(i).getPath(), matrix);
        }
        this.f10093a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        if (t == C5670j.f10022a) {
            this.f10098f.mo19510a(cVar);
        } else if (t == C5670j.f10025d) {
            this.f10099g.mo19510a(cVar);
        } else if (t != C5670j.f10045x) {
        } else {
            if (cVar == null) {
                this.f10100h = null;
                return;
            }
            C5719p pVar = new C5719p(cVar);
            this.f10100h = pVar;
            pVar.mo19509a((C5703a.C5704a) this);
            this.f10095c.mo19658a((C5703a<?, ?>) this.f10100h);
        }
    }
}
