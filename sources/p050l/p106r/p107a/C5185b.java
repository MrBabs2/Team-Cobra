package p050l.p106r.p107a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p050l.p075h.p083k.C5008h;
import p050l.p091k.p092a.p093a.C5109b;

/* renamed from: l.r.a.b */
/* compiled from: CircularProgressDrawable */
public class C5185b extends Drawable implements Animatable {

    /* renamed from: l */
    private static final Interpolator f9175l = new LinearInterpolator();

    /* renamed from: m */
    private static final Interpolator f9176m = new C5109b();

    /* renamed from: n */
    private static final int[] f9177n = {-16777216};

    /* renamed from: f */
    private final C5188c f9178f;

    /* renamed from: g */
    private float f9179g;

    /* renamed from: h */
    private Resources f9180h;

    /* renamed from: i */
    private Animator f9181i;

    /* renamed from: j */
    float f9182j;

    /* renamed from: k */
    boolean f9183k;

    /* renamed from: l.r.a.b$a */
    /* compiled from: CircularProgressDrawable */
    class C5186a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5188c f9184a;

        C5186a(C5188c cVar) {
            this.f9184a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C5185b.this.mo17890a(floatValue, this.f9184a);
            C5185b.this.mo17891a(floatValue, this.f9184a, false);
            C5185b.this.invalidateSelf();
        }
    }

    /* renamed from: l.r.a.b$b */
    /* compiled from: CircularProgressDrawable */
    class C5187b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C5188c f9186a;

        C5187b(C5188c cVar) {
            this.f9186a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C5185b.this.mo17891a(1.0f, this.f9186a, true);
            this.f9186a.mo17936l();
            this.f9186a.mo17934j();
            C5185b bVar = C5185b.this;
            if (bVar.f9183k) {
                bVar.f9183k = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f9186a.mo17917a(false);
                return;
            }
            bVar.f9182j += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C5185b.this.f9182j = 0.0f;
        }
    }

    /* renamed from: l.r.a.b$c */
    /* compiled from: CircularProgressDrawable */
    private static class C5188c {

        /* renamed from: a */
        final RectF f9188a = new RectF();

        /* renamed from: b */
        final Paint f9189b = new Paint();

        /* renamed from: c */
        final Paint f9190c = new Paint();

        /* renamed from: d */
        final Paint f9191d = new Paint();

        /* renamed from: e */
        float f9192e = 0.0f;

        /* renamed from: f */
        float f9193f = 0.0f;

        /* renamed from: g */
        float f9194g = 0.0f;

        /* renamed from: h */
        float f9195h = 5.0f;

        /* renamed from: i */
        int[] f9196i;

        /* renamed from: j */
        int f9197j;

        /* renamed from: k */
        float f9198k;

        /* renamed from: l */
        float f9199l;

        /* renamed from: m */
        float f9200m;

        /* renamed from: n */
        boolean f9201n;

        /* renamed from: o */
        Path f9202o;

        /* renamed from: p */
        float f9203p = 1.0f;

        /* renamed from: q */
        float f9204q;

        /* renamed from: r */
        int f9205r;

        /* renamed from: s */
        int f9206s;

        /* renamed from: t */
        int f9207t = 255;

        /* renamed from: u */
        int f9208u;

        C5188c() {
            this.f9189b.setStrokeCap(Paint.Cap.SQUARE);
            this.f9189b.setAntiAlias(true);
            this.f9189b.setStyle(Paint.Style.STROKE);
            this.f9190c.setStyle(Paint.Style.FILL);
            this.f9190c.setAntiAlias(true);
            this.f9191d.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17912a(float f, float f2) {
            this.f9205r = (int) f;
            this.f9206s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17921b(int i) {
            this.f9208u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo17924c(int i) {
            this.f9197j = i;
            this.f9208u = this.f9196i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo17925d() {
            return (this.f9197j + 1) % this.f9196i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo17928e(float f) {
            this.f9192e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo17930f(float f) {
            this.f9195h = f;
            this.f9189b.setStrokeWidth(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo17931g() {
            return this.f9199l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public float mo17932h() {
            return this.f9200m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo17933i() {
            return this.f9198k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo17934j() {
            mo17924c(mo17925d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo17935k() {
            this.f9198k = 0.0f;
            this.f9199l = 0.0f;
            this.f9200m = 0.0f;
            mo17928e(0.0f);
            mo17923c(0.0f);
            mo17926d(0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo17936l() {
            this.f9198k = this.f9192e;
            this.f9199l = this.f9193f;
            this.f9200m = this.f9194g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo17919b() {
            return this.f9193f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo17926d(float f) {
            this.f9194g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public float mo17927e() {
            return this.f9192e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17915a(Canvas canvas, Rect rect) {
            RectF rectF = this.f9188a;
            float f = this.f9204q;
            float f2 = (this.f9195h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f9205r) * this.f9203p) / 2.0f, this.f9195h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f9192e;
            float f4 = this.f9194g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f9193f + f4) * 360.0f) - f5;
            this.f9189b.setColor(this.f9208u);
            this.f9189b.setAlpha(this.f9207t);
            float f7 = this.f9195h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f9191d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f9189b);
            mo17914a(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo17920b(float f) {
            this.f9204q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo17922c() {
            return this.f9196i[mo17925d()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo17929f() {
            return this.f9196i[this.f9197j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo17923c(float f) {
            this.f9193f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17914a(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f9201n) {
                Path path = this.f9202o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f9202o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f9202o.moveTo(0.0f, 0.0f);
                this.f9202o.lineTo(((float) this.f9205r) * this.f9203p, 0.0f);
                Path path3 = this.f9202o;
                float f3 = this.f9203p;
                path3.lineTo((((float) this.f9205r) * f3) / 2.0f, ((float) this.f9206s) * f3);
                this.f9202o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f9205r) * this.f9203p) / 2.0f), rectF.centerY() + (this.f9195h / 2.0f));
                this.f9202o.close();
                this.f9190c.setColor(this.f9208u);
                this.f9190c.setAlpha(this.f9207t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f9202o, this.f9190c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17918a(int[] iArr) {
            this.f9196i = iArr;
            mo17924c(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17916a(ColorFilter colorFilter) {
            this.f9189b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17913a(int i) {
            this.f9207t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo17910a() {
            return this.f9207t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17917a(boolean z) {
            if (this.f9201n != z) {
                this.f9201n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17911a(float f) {
            if (f != this.f9203p) {
                this.f9203p = f;
            }
        }
    }

    public C5185b(Context context) {
        C5008h.m8899a(context);
        this.f9180h = context.getResources();
        C5188c cVar = new C5188c();
        this.f9178f = cVar;
        cVar.mo17918a(f9177n);
        mo17896c(2.5f);
        m9630a();
    }

    /* renamed from: a */
    private int m9629a(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: a */
    private void m9631a(float f, float f2, float f3, float f4) {
        C5188c cVar = this.f9178f;
        float f5 = this.f9180h.getDisplayMetrics().density;
        cVar.mo17930f(f2 * f5);
        cVar.mo17920b(f * f5);
        cVar.mo17924c(0);
        cVar.mo17912a(f3 * f5, f4 * f5);
    }

    /* renamed from: d */
    private void m9633d(float f) {
        this.f9179g = f;
    }

    /* renamed from: b */
    public void mo17895b(float f) {
        this.f9178f.mo17926d(f);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo17896c(float f) {
        this.f9178f.mo17930f(f);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f9179g, bounds.exactCenterX(), bounds.exactCenterY());
        this.f9178f.mo17915a(canvas, bounds);
        canvas.restore();
    }

    public int getAlpha() {
        return this.f9178f.mo17910a();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f9181i.isRunning();
    }

    public void setAlpha(int i) {
        this.f9178f.mo17913a(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9178f.mo17916a(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f9181i.cancel();
        this.f9178f.mo17936l();
        if (this.f9178f.mo17919b() != this.f9178f.mo17927e()) {
            this.f9183k = true;
            this.f9181i.setDuration(666);
            this.f9181i.start();
            return;
        }
        this.f9178f.mo17924c(0);
        this.f9178f.mo17935k();
        this.f9181i.setDuration(1332);
        this.f9181i.start();
    }

    public void stop() {
        this.f9181i.cancel();
        m9633d(0.0f);
        this.f9178f.mo17917a(false);
        this.f9178f.mo17924c(0);
        this.f9178f.mo17935k();
        invalidateSelf();
    }

    /* renamed from: b */
    private void m9632b(float f, C5188c cVar) {
        mo17890a(f, cVar);
        cVar.mo17928e(cVar.mo17933i() + (((cVar.mo17931g() - 0.01f) - cVar.mo17933i()) * f));
        cVar.mo17923c(cVar.mo17931g());
        cVar.mo17926d(cVar.mo17932h() + ((((float) (Math.floor((double) (cVar.mo17932h() / 0.8f)) + 1.0d)) - cVar.mo17932h()) * f));
    }

    /* renamed from: a */
    public void mo17892a(int i) {
        if (i == 0) {
            m9631a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m9631a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo17893a(boolean z) {
        this.f9178f.mo17917a(z);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo17888a(float f) {
        this.f9178f.mo17911a(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo17889a(float f, float f2) {
        this.f9178f.mo17928e(f);
        this.f9178f.mo17923c(f2);
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo17894a(int... iArr) {
        this.f9178f.mo17918a(iArr);
        this.f9178f.mo17924c(0);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17890a(float f, C5188c cVar) {
        if (f > 0.75f) {
            cVar.mo17921b(m9629a((f - 0.75f) / 0.25f, cVar.mo17929f(), cVar.mo17922c()));
        } else {
            cVar.mo17921b(cVar.mo17929f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17891a(float f, C5188c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f9183k) {
            m9632b(f, cVar);
        } else if (f != 1.0f || z) {
            float h = cVar.mo17932h();
            if (f < 0.5f) {
                f2 = cVar.mo17933i();
                f3 = (f9176m.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float i = cVar.mo17933i() + 0.79f;
                float f4 = i;
                f2 = i - (((1.0f - f9176m.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo17928e(f2);
            cVar.mo17923c(f3);
            cVar.mo17926d(h + (0.20999998f * f));
            m9633d((f + this.f9182j) * 216.0f);
        }
    }

    /* renamed from: a */
    private void m9630a() {
        C5188c cVar = this.f9178f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C5186a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f9175l);
        ofFloat.addListener(new C5187b(cVar));
        this.f9181i = ofFloat;
    }
}
