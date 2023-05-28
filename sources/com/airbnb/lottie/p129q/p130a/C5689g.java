package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.C5670j;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5719p;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.p135j.C5746c;
import com.airbnb.lottie.p133s.p135j.C5747d;
import com.airbnb.lottie.p133s.p135j.C5749f;
import com.airbnb.lottie.p133s.p136k.C5768a;
import com.airbnb.lottie.p139v.C5828e;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.List;
import p050l.p066e.C4873d;

/* renamed from: com.airbnb.lottie.q.a.g */
/* compiled from: GradientFillContent */
public class C5689g implements C5686d, C5703a.C5704a, C5692j {

    /* renamed from: a */
    private final String f10102a;

    /* renamed from: b */
    private final C5768a f10103b;

    /* renamed from: c */
    private final C4873d<LinearGradient> f10104c = new C4873d<>();

    /* renamed from: d */
    private final C4873d<RadialGradient> f10105d = new C4873d<>();

    /* renamed from: e */
    private final Matrix f10106e = new Matrix();

    /* renamed from: f */
    private final Path f10107f = new Path();

    /* renamed from: g */
    private final Paint f10108g = new Paint(1);

    /* renamed from: h */
    private final RectF f10109h = new RectF();

    /* renamed from: i */
    private final List<C5695l> f10110i = new ArrayList();

    /* renamed from: j */
    private final C5749f f10111j;

    /* renamed from: k */
    private final C5703a<C5746c, C5746c> f10112k;

    /* renamed from: l */
    private final C5703a<Integer, Integer> f10113l;

    /* renamed from: m */
    private final C5703a<PointF, PointF> f10114m;

    /* renamed from: n */
    private final C5703a<PointF, PointF> f10115n;

    /* renamed from: o */
    private C5703a<ColorFilter, ColorFilter> f10116o;

    /* renamed from: p */
    private final C5656f f10117p;

    /* renamed from: q */
    private final int f10118q;

    public C5689g(C5656f fVar, C5768a aVar, C5747d dVar) {
        this.f10103b = aVar;
        this.f10102a = dVar.mo19585e();
        this.f10117p = fVar;
        this.f10111j = dVar.mo19584d();
        this.f10107f.setFillType(dVar.mo19582b());
        this.f10118q = (int) (fVar.mo19436e().mo19396c() / 32.0f);
        C5703a<C5746c, C5746c> a = dVar.mo19583c().mo19562a();
        this.f10112k = a;
        a.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10112k);
        C5703a<Integer, Integer> a2 = dVar.mo19586f().mo19562a();
        this.f10113l = a2;
        a2.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10113l);
        C5703a<PointF, PointF> a3 = dVar.mo19587g().mo19562a();
        this.f10114m = a3;
        a3.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10114m);
        C5703a<PointF, PointF> a4 = dVar.mo19581a().mo19562a();
        this.f10115n = a4;
        a4.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10115n);
    }

    /* renamed from: b */
    private int m10914b() {
        int round = Math.round(this.f10114m.mo19512c() * ((float) this.f10118q));
        int round2 = Math.round(this.f10115n.mo19512c() * ((float) this.f10118q));
        int round3 = Math.round(this.f10112k.mo19512c() * ((float) this.f10118q));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: c */
    private LinearGradient m10915c() {
        long b = (long) m10914b();
        LinearGradient a = this.f10104c.mo16936a(b);
        if (a != null) {
            return a;
        }
        PointF d = this.f10114m.mo19513d();
        PointF d2 = this.f10115n.mo19513d();
        C5746c d3 = this.f10112k.mo19513d();
        LinearGradient linearGradient = new LinearGradient(d.x, d.y, d2.x, d2.y, d3.mo19578a(), d3.mo19579b(), Shader.TileMode.CLAMP);
        this.f10104c.mo16945c(b, linearGradient);
        return linearGradient;
    }

    /* renamed from: d */
    private RadialGradient m10916d() {
        long b = (long) m10914b();
        RadialGradient a = this.f10105d.mo16936a(b);
        if (a != null) {
            return a;
        }
        PointF d = this.f10114m.mo19513d();
        PointF d2 = this.f10115n.mo19513d();
        C5746c d3 = this.f10112k.mo19513d();
        int[] a2 = d3.mo19578a();
        float[] b2 = d3.mo19579b();
        float f = d.x;
        float f2 = d.y;
        RadialGradient radialGradient = new RadialGradient(f, f2, (float) Math.hypot((double) (d2.x - f), (double) (d2.y - f2)), a2, b2, Shader.TileMode.CLAMP);
        this.f10105d.mo16945c(b, radialGradient);
        return radialGradient;
    }

    /* renamed from: a */
    public void mo19490a() {
        this.f10117p.invalidateSelf();
    }

    public String getName() {
        return this.f10102a;
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C5684b bVar = list2.get(i);
            if (bVar instanceof C5695l) {
                this.f10110i.add((C5695l) bVar);
            }
        }
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        C5647c.m10753a("GradientFillContent#draw");
        this.f10107f.reset();
        for (int i2 = 0; i2 < this.f10110i.size(); i2++) {
            this.f10107f.addPath(this.f10110i.get(i2).getPath(), matrix);
        }
        this.f10107f.computeBounds(this.f10109h, false);
        if (this.f10111j == C5749f.Linear) {
            shader = m10915c();
        } else {
            shader = m10916d();
        }
        this.f10106e.set(matrix);
        shader.setLocalMatrix(this.f10106e);
        this.f10108g.setShader(shader);
        C5703a<ColorFilter, ColorFilter> aVar = this.f10116o;
        if (aVar != null) {
            this.f10108g.setColorFilter(aVar.mo19513d());
        }
        this.f10108g.setAlpha(C5828e.m11369a((int) ((((((float) i) / 255.0f) * ((float) this.f10113l.mo19513d().intValue())) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f10107f, this.f10108g);
        C5647c.m10755c("GradientFillContent#draw");
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        this.f10107f.reset();
        for (int i = 0; i < this.f10110i.size(); i++) {
            this.f10107f.addPath(this.f10110i.get(i).getPath(), matrix);
        }
        this.f10107f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        C5828e.m11371a(eVar, i, list, eVar2, this);
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        if (t != C5670j.f10045x) {
            return;
        }
        if (cVar == null) {
            this.f10116o = null;
            return;
        }
        C5719p pVar = new C5719p(cVar);
        this.f10116o = pVar;
        pVar.mo19509a((C5703a.C5704a) this);
        this.f10103b.mo19658a((C5703a<?, ?>) this.f10116o);
    }
}
