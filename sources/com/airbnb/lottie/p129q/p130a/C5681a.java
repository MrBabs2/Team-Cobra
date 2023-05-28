package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p134i.C5731b;
import com.airbnb.lottie.p133s.p134i.C5733d;
import com.airbnb.lottie.p133s.p135j.C5766q;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p139v.C5829f;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.a.a */
/* compiled from: BaseStrokeContent */
public abstract class C5681a implements C5703a.C5704a, C5692j, C5686d {

    /* renamed from: a */
    private final PathMeasure f10061a = new PathMeasure();

    /* renamed from: b */
    private final Path f10062b = new Path();

    /* renamed from: c */
    private final Path f10063c = new Path();

    /* renamed from: d */
    private final RectF f10064d = new RectF();

    /* renamed from: e */
    private final C5656f f10065e;

    /* renamed from: f */
    private final C5768a f10066f;

    /* renamed from: g */
    private final List<C5683b> f10067g = new ArrayList();

    /* renamed from: h */
    private final float[] f10068h;

    /* renamed from: i */
    final Paint f10069i;

    /* renamed from: j */
    private final C5703a<?, Float> f10070j;

    /* renamed from: k */
    private final C5703a<?, Integer> f10071k;

    /* renamed from: l */
    private final List<C5703a<?, Float>> f10072l;

    /* renamed from: m */
    private final C5703a<?, Float> f10073m;

    /* renamed from: n */
    private C5703a<ColorFilter, ColorFilter> f10074n;

    /* renamed from: com.airbnb.lottie.q.a.a$b */
    /* compiled from: BaseStrokeContent */
    private static final class C5683b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C5695l> f10075a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C5702r f10076b;

        private C5683b(C5702r rVar) {
            this.f10075a = new ArrayList();
            this.f10076b = rVar;
        }
    }

    C5681a(C5656f fVar, C5768a aVar, Paint.Cap cap, Paint.Join join, float f, C5733d dVar, C5731b bVar, List<C5731b> list, C5731b bVar2) {
        Paint paint = new Paint(1);
        this.f10069i = paint;
        this.f10065e = fVar;
        this.f10066f = aVar;
        paint.setStyle(Paint.Style.STROKE);
        this.f10069i.setStrokeCap(cap);
        this.f10069i.setStrokeJoin(join);
        this.f10069i.setStrokeMiter(f);
        this.f10071k = dVar.mo19562a();
        this.f10070j = bVar.mo19562a();
        if (bVar2 == null) {
            this.f10073m = null;
        } else {
            this.f10073m = bVar2.mo19562a();
        }
        this.f10072l = new ArrayList(list.size());
        this.f10068h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f10072l.add(list.get(i).mo19562a());
        }
        aVar.mo19658a((C5703a<?, ?>) this.f10071k);
        aVar.mo19658a((C5703a<?, ?>) this.f10070j);
        for (int i2 = 0; i2 < this.f10072l.size(); i2++) {
            aVar.mo19658a((C5703a<?, ?>) this.f10072l.get(i2));
        }
        C5703a<?, Float> aVar2 = this.f10073m;
        if (aVar2 != null) {
            aVar.mo19658a((C5703a<?, ?>) aVar2);
        }
        this.f10071k.mo19509a((C5703a.C5704a) this);
        this.f10070j.mo19509a((C5703a.C5704a) this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f10072l.get(i3).mo19509a((C5703a.C5704a) this);
        }
        C5703a<?, Float> aVar3 = this.f10073m;
        if (aVar3 != null) {
            aVar3.mo19509a((C5703a.C5704a) this);
        }
    }

    /* renamed from: a */
    public void mo19490a() {
        this.f10065e.invalidateSelf();
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        C5702r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C5684b bVar = list.get(size);
            if (bVar instanceof C5702r) {
                C5702r rVar2 = (C5702r) bVar;
                if (rVar2.mo19505e() == C5766q.C5767a.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.mo19501a(this);
        }
        C5683b bVar2 = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C5684b bVar3 = list2.get(size2);
            if (bVar3 instanceof C5702r) {
                C5702r rVar3 = (C5702r) bVar3;
                if (rVar3.mo19505e() == C5766q.C5767a.Individually) {
                    if (bVar2 != null) {
                        this.f10067g.add(bVar2);
                    }
                    bVar2 = new C5683b(rVar3);
                    rVar3.mo19501a(this);
                }
            }
            if (bVar3 instanceof C5695l) {
                if (bVar2 == null) {
                    bVar2 = new C5683b(rVar);
                }
                bVar2.f10075a.add((C5695l) bVar3);
            }
        }
        if (bVar2 != null) {
            this.f10067g.add(bVar2);
        }
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        C5647c.m10753a("StrokeContent#draw");
        this.f10069i.setAlpha(C5828e.m11369a((int) ((((((float) i) / 255.0f) * ((float) this.f10071k.mo19513d().intValue())) / 100.0f) * 255.0f), 0, 255));
        this.f10069i.setStrokeWidth(this.f10070j.mo19513d().floatValue() * C5829f.m11377a(matrix));
        if (this.f10069i.getStrokeWidth() <= 0.0f) {
            C5647c.m10755c("StrokeContent#draw");
            return;
        }
        m10881a(matrix);
        C5703a<ColorFilter, ColorFilter> aVar = this.f10074n;
        if (aVar != null) {
            this.f10069i.setColorFilter(aVar.mo19513d());
        }
        for (int i2 = 0; i2 < this.f10067g.size(); i2++) {
            C5683b bVar = this.f10067g.get(i2);
            if (bVar.f10076b != null) {
                m10880a(canvas, bVar, matrix);
            } else {
                C5647c.m10753a("StrokeContent#buildPath");
                this.f10062b.reset();
                for (int size = bVar.f10075a.size() - 1; size >= 0; size--) {
                    this.f10062b.addPath(((C5695l) bVar.f10075a.get(size)).getPath(), matrix);
                }
                C5647c.m10755c("StrokeContent#buildPath");
                C5647c.m10753a("StrokeContent#drawPath");
                canvas.drawPath(this.f10062b, this.f10069i);
                C5647c.m10755c("StrokeContent#drawPath");
            }
        }
        C5647c.m10755c("StrokeContent#draw");
    }

    /* renamed from: a */
    private void m10880a(Canvas canvas, C5683b bVar, Matrix matrix) {
        C5647c.m10753a("StrokeContent#applyTrimPath");
        if (bVar.f10076b == null) {
            C5647c.m10755c("StrokeContent#applyTrimPath");
            return;
        }
        this.f10062b.reset();
        for (int size = bVar.f10075a.size() - 1; size >= 0; size--) {
            this.f10062b.addPath(((C5695l) bVar.f10075a.get(size)).getPath(), matrix);
        }
        this.f10061a.setPath(this.f10062b, false);
        float length = this.f10061a.getLength();
        while (this.f10061a.nextContour()) {
            length += this.f10061a.getLength();
        }
        float floatValue = (bVar.f10076b.mo19503c().mo19513d().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f10076b.mo19504d().mo19513d().floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((bVar.f10076b.mo19502b().mo19513d().floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = bVar.f10075a.size() - 1; size2 >= 0; size2--) {
            this.f10063c.set(((C5695l) bVar.f10075a.get(size2)).getPath());
            this.f10063c.transform(matrix);
            this.f10061a.setPath(this.f10063c, false);
            float length2 = this.f10061a.getLength();
            float f2 = 1.0f;
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f + length2 && f < f3) {
                    C5829f.m11380a(this.f10063c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f10063c, this.f10069i);
                    f += length2;
                }
            }
            float f4 = f + length2;
            if (f4 >= floatValue2 && f <= floatValue3) {
                if (f4 > floatValue3 || floatValue2 >= f) {
                    float f5 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                    if (floatValue3 <= f4) {
                        f2 = (floatValue3 - f) / length2;
                    }
                    C5829f.m11380a(this.f10063c, f5, f2, 0.0f);
                    canvas.drawPath(this.f10063c, this.f10069i);
                } else {
                    canvas.drawPath(this.f10063c, this.f10069i);
                }
            }
            f += length2;
        }
        C5647c.m10755c("StrokeContent#applyTrimPath");
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        C5647c.m10753a("StrokeContent#getBounds");
        this.f10062b.reset();
        for (int i = 0; i < this.f10067g.size(); i++) {
            C5683b bVar = this.f10067g.get(i);
            for (int i2 = 0; i2 < bVar.f10075a.size(); i2++) {
                this.f10062b.addPath(((C5695l) bVar.f10075a.get(i2)).getPath(), matrix);
            }
        }
        this.f10062b.computeBounds(this.f10064d, false);
        float floatValue = this.f10070j.mo19513d().floatValue();
        RectF rectF2 = this.f10064d;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f10064d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C5647c.m10755c("StrokeContent#getBounds");
    }

    /* renamed from: a */
    private void m10881a(Matrix matrix) {
        C5647c.m10753a("StrokeContent#applyDashPattern");
        if (this.f10072l.isEmpty()) {
            C5647c.m10755c("StrokeContent#applyDashPattern");
            return;
        }
        float a = C5829f.m11377a(matrix);
        for (int i = 0; i < this.f10072l.size(); i++) {
            this.f10068h[i] = ((Float) this.f10072l.get(i).mo19513d()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f10068h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f10068h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f10068h;
            fArr3[i] = fArr3[i] * a;
        }
        C5703a<?, Float> aVar = this.f10073m;
        this.f10069i.setPathEffect(new DashPathEffect(this.f10068h, aVar == null ? 0.0f : aVar.mo19513d().floatValue()));
        C5647c.m10755c("StrokeContent#applyDashPattern");
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        if (t == C5670j.f10025d) {
            this.f10071k.mo19510a(cVar);
        } else if (t == C5670j.f10032k) {
            this.f10070j.mo19510a(cVar);
        } else if (t != C5670j.f10045x) {
        } else {
            if (cVar == null) {
                this.f10074n = null;
                return;
            }
            C5719p pVar = new C5719p(cVar);
            this.f10074n = pVar;
            pVar.mo19509a((C5703a.C5704a) this);
            this.f10066f.mo19658a((C5703a<?, ?>) this.f10074n);
        }
    }
}
