package com.airbnb.lottie.p129q.p130a;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p133s.p135j.C5746c;
import com.airbnb.lottie.p133s.p135j.C5748e;
import com.airbnb.lottie.p133s.p135j.C5749f;
import com.airbnb.lottie.p133s.p136k.C5768a;
import p050l.p066e.C4873d;

/* renamed from: com.airbnb.lottie.q.a.h */
/* compiled from: GradientStrokeContent */
public class C5690h extends C5681a {

    /* renamed from: o */
    private final String f10119o;

    /* renamed from: p */
    private final C4873d<LinearGradient> f10120p = new C4873d<>();

    /* renamed from: q */
    private final C4873d<RadialGradient> f10121q = new C4873d<>();

    /* renamed from: r */
    private final RectF f10122r = new RectF();

    /* renamed from: s */
    private final C5749f f10123s;

    /* renamed from: t */
    private final int f10124t;

    /* renamed from: u */
    private final C5703a<C5746c, C5746c> f10125u;

    /* renamed from: v */
    private final C5703a<PointF, PointF> f10126v;

    /* renamed from: w */
    private final C5703a<PointF, PointF> f10127w;

    public C5690h(C5656f fVar, C5768a aVar, C5748e eVar) {
        super(fVar, aVar, eVar.mo19588a().mo19649a(), eVar.mo19593f().mo19650a(), eVar.mo19595h(), eVar.mo19597j(), eVar.mo19599l(), eVar.mo19594g(), eVar.mo19589b());
        this.f10119o = eVar.mo19596i();
        this.f10123s = eVar.mo19592e();
        this.f10124t = (int) (fVar.mo19436e().mo19396c() / 32.0f);
        C5703a<C5746c, C5746c> a = eVar.mo19591d().mo19562a();
        this.f10125u = a;
        a.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10125u);
        C5703a<PointF, PointF> a2 = eVar.mo19598k().mo19562a();
        this.f10126v = a2;
        a2.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10126v);
        C5703a<PointF, PointF> a3 = eVar.mo19590c().mo19562a();
        this.f10127w = a3;
        a3.mo19509a((C5703a.C5704a) this);
        aVar.mo19658a((C5703a<?, ?>) this.f10127w);
    }

    /* renamed from: b */
    private int m10923b() {
        int round = Math.round(this.f10126v.mo19512c() * ((float) this.f10124t));
        int round2 = Math.round(this.f10127w.mo19512c() * ((float) this.f10124t));
        int round3 = Math.round(this.f10125u.mo19512c() * ((float) this.f10124t));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* renamed from: c */
    private LinearGradient m10924c() {
        long b = (long) m10923b();
        LinearGradient a = this.f10120p.mo16936a(b);
        if (a != null) {
            return a;
        }
        PointF d = this.f10126v.mo19513d();
        PointF d2 = this.f10127w.mo19513d();
        C5746c d3 = this.f10125u.mo19513d();
        int[] a2 = d3.mo19578a();
        float[] b2 = d3.mo19579b();
        RectF rectF = this.f10122r;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + d.x);
        RectF rectF2 = this.f10122r;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + d.y);
        RectF rectF3 = this.f10122r;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + d2.x);
        RectF rectF4 = this.f10122r;
        LinearGradient linearGradient = new LinearGradient((float) width, (float) height, (float) width2, (float) ((int) (rectF4.top + (rectF4.height() / 2.0f) + d2.y)), a2, b2, Shader.TileMode.CLAMP);
        this.f10120p.mo16945c(b, linearGradient);
        return linearGradient;
    }

    /* renamed from: d */
    private RadialGradient m10925d() {
        long b = (long) m10923b();
        RadialGradient a = this.f10121q.mo16936a(b);
        if (a != null) {
            return a;
        }
        PointF d = this.f10126v.mo19513d();
        PointF d2 = this.f10127w.mo19513d();
        C5746c d3 = this.f10125u.mo19513d();
        int[] a2 = d3.mo19578a();
        float[] b2 = d3.mo19579b();
        RectF rectF = this.f10122r;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + d.x);
        RectF rectF2 = this.f10122r;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + d.y);
        RectF rectF3 = this.f10122r;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + d2.x);
        RectF rectF4 = this.f10122r;
        RadialGradient radialGradient = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (width2 - width), (double) (((int) ((rectF4.top + (rectF4.height() / 2.0f)) + d2.y)) - height)), a2, b2, Shader.TileMode.CLAMP);
        this.f10121q.mo16945c(b, radialGradient);
        return radialGradient;
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        mo19492a(this.f10122r, matrix);
        if (this.f10123s == C5749f.Linear) {
            this.f10069i.setShader(m10924c());
        } else {
            this.f10069i.setShader(m10925d());
        }
        super.mo19491a(canvas, matrix, i);
    }

    public String getName() {
        return this.f10119o;
    }
}
