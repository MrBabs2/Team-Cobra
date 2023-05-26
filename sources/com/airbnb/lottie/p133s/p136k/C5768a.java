package com.airbnb.lottie.p133s.p136k;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.C5656f;
import com.airbnb.lottie.p129q.p130a.C5684b;
import com.airbnb.lottie.p129q.p130a.C5686d;
import com.airbnb.lottie.p129q.p131b.C5703a;
import com.airbnb.lottie.p129q.p131b.C5706c;
import com.airbnb.lottie.p129q.p131b.C5710g;
import com.airbnb.lottie.p129q.p131b.C5718o;
import com.airbnb.lottie.p133s.C5726e;
import com.airbnb.lottie.p133s.C5727f;
import com.airbnb.lottie.p133s.p135j.C5750g;
import com.airbnb.lottie.p133s.p135j.C5758l;
import com.airbnb.lottie.p133s.p136k.C5774d;
import com.airbnb.lottie.p140w.C5832c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.s.k.a */
/* compiled from: BaseLayer */
public abstract class C5768a implements C5686d, C5703a.C5704a, C5727f {

    /* renamed from: a */
    private final Path f10370a = new Path();

    /* renamed from: b */
    private final Matrix f10371b = new Matrix();

    /* renamed from: c */
    private final Paint f10372c = new Paint(1);

    /* renamed from: d */
    private final Paint f10373d = new Paint(1);

    /* renamed from: e */
    private final Paint f10374e = new Paint(1);

    /* renamed from: f */
    private final Paint f10375f = new Paint(1);

    /* renamed from: g */
    private final Paint f10376g = new Paint();

    /* renamed from: h */
    private final RectF f10377h = new RectF();

    /* renamed from: i */
    private final RectF f10378i = new RectF();

    /* renamed from: j */
    private final RectF f10379j = new RectF();

    /* renamed from: k */
    private final RectF f10380k = new RectF();

    /* renamed from: l */
    private final String f10381l;

    /* renamed from: m */
    final Matrix f10382m = new Matrix();

    /* renamed from: n */
    final C5656f f10383n;

    /* renamed from: o */
    final C5774d f10384o;

    /* renamed from: p */
    private C5710g f10385p;

    /* renamed from: q */
    private C5768a f10386q;

    /* renamed from: r */
    private C5768a f10387r;

    /* renamed from: s */
    private List<C5768a> f10388s;

    /* renamed from: t */
    private final List<C5703a<?, ?>> f10389t = new ArrayList();

    /* renamed from: u */
    final C5718o f10390u;

    /* renamed from: v */
    private boolean f10391v = true;

    /* renamed from: com.airbnb.lottie.s.k.a$a */
    /* compiled from: BaseLayer */
    class C5769a implements C5703a.C5704a {

        /* renamed from: a */
        final /* synthetic */ C5706c f10392a;

        C5769a(C5706c cVar) {
            this.f10392a = cVar;
        }

        /* renamed from: a */
        public void mo19490a() {
            C5768a.this.m11175a(((Float) this.f10392a.mo19513d()).floatValue() == 1.0f);
        }
    }

    /* renamed from: com.airbnb.lottie.s.k.a$b */
    /* compiled from: BaseLayer */
    static /* synthetic */ class C5770b {

        /* renamed from: a */
        static final /* synthetic */ int[] f10394a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10395b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        static {
            /*
                com.airbnb.lottie.s.j.g$a[] r0 = com.airbnb.lottie.p133s.p135j.C5750g.C5751a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10395b = r0
                r1 = 1
                com.airbnb.lottie.s.j.g$a r2 = com.airbnb.lottie.p133s.p135j.C5750g.C5751a.MaskModeSubtract     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10395b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.s.j.g$a r3 = com.airbnb.lottie.p133s.p135j.C5750g.C5751a.MaskModeIntersect     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f10395b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.s.j.g$a r4 = com.airbnb.lottie.p133s.p135j.C5750g.C5751a.MaskModeAdd     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.airbnb.lottie.s.k.d$a[] r3 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f10394a = r3
                com.airbnb.lottie.s.k.d$a r4 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.Shape     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f10394a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.airbnb.lottie.s.k.d$a r3 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.PreComp     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f10394a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.airbnb.lottie.s.k.d$a r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.Solid     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f10394a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.airbnb.lottie.s.k.d$a r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.Image     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f10394a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.airbnb.lottie.s.k.d$a r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.Null     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f10394a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.airbnb.lottie.s.k.d$a r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.Text     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f10394a     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.airbnb.lottie.s.k.d$a r1 = com.airbnb.lottie.p133s.p136k.C5774d.C5775a.Unknown     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p133s.p136k.C5768a.C5770b.<clinit>():void");
        }
    }

    C5768a(C5656f fVar, C5774d dVar) {
        this.f10383n = fVar;
        this.f10384o = dVar;
        this.f10381l = dVar.mo19673g() + "#draw";
        this.f10376g.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f10373d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f10374e.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (dVar.mo19672f() == C5774d.C5776b.Invert) {
            this.f10375f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.f10375f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C5718o a = dVar.mo19688u().mo19564a();
        this.f10390u = a;
        a.mo19522a((C5703a.C5704a) this);
        if (dVar.mo19671e() != null && !dVar.mo19671e().isEmpty()) {
            C5710g gVar = new C5710g(dVar.mo19671e());
            this.f10385p = gVar;
            for (C5703a<C5758l, Path> a2 : gVar.mo19516a()) {
                a2.mo19509a((C5703a.C5704a) this);
            }
            for (C5703a next : this.f10385p.mo19518c()) {
                mo19658a((C5703a<?, ?>) next);
                next.mo19509a((C5703a.C5704a) this);
            }
        }
        m11181g();
    }

    /* renamed from: c */
    private void m11178c(RectF rectF, Matrix matrix) {
        if (mo19665d() && this.f10384o.mo19672f() != C5774d.C5776b.Invert) {
            this.f10386q.mo19492a(this.f10379j, matrix);
            rectF.set(Math.max(rectF.left, this.f10379j.left), Math.max(rectF.top, this.f10379j.top), Math.min(rectF.right, this.f10379j.right), Math.min(rectF.bottom, this.f10379j.bottom));
        }
    }

    /* renamed from: e */
    private void m11179e() {
        if (this.f10388s == null) {
            if (this.f10387r == null) {
                this.f10388s = Collections.emptyList();
                return;
            }
            this.f10388s = new ArrayList();
            for (C5768a aVar = this.f10387r; aVar != null; aVar = aVar.f10387r) {
                this.f10388s.add(aVar);
            }
        }
    }

    /* renamed from: f */
    private void m11180f() {
        this.f10383n.invalidateSelf();
    }

    /* renamed from: g */
    private void m11181g() {
        boolean z = true;
        if (!this.f10384o.mo19669c().isEmpty()) {
            C5706c cVar = new C5706c(this.f10384o.mo19669c());
            cVar.mo19515f();
            cVar.mo19509a((C5703a.C5704a) new C5769a(cVar));
            if (((Float) cVar.mo19513d()).floatValue() != 1.0f) {
                z = false;
            }
            m11175a(z);
            mo19658a((C5703a<?, ?>) cVar);
            return;
        }
        m11175a(true);
    }

    /* renamed from: a */
    public void mo19495a(List<C5684b> list, List<C5684b> list2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5774d mo19660b() {
        return this.f10384o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo19661b(Canvas canvas, Matrix matrix, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19662b(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo19665d() {
        return this.f10386q != null;
    }

    public String getName() {
        return this.f10384o.mo19673g();
    }

    /* renamed from: a */
    static C5768a m11169a(C5774d dVar, C5656f fVar, C5648d dVar2) {
        switch (C5770b.f10394a[dVar.mo19670d().ordinal()]) {
            case 1:
                return new C5778f(fVar, dVar);
            case 2:
                return new C5771b(fVar, dVar, dVar2.mo19394b(dVar.mo19677k()), dVar2);
            case 3:
                return new C5779g(fVar, dVar);
            case 4:
                return new C5773c(fVar, dVar);
            case 5:
                return new C5777e(fVar, dVar);
            case 6:
                return new C5780h(fVar, dVar);
            default:
                C5647c.m10756d("Unknown layer type " + dVar.mo19670d());
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19663b(C5768a aVar) {
        this.f10387r = aVar;
    }

    /* renamed from: b */
    private void m11176b(float f) {
        this.f10383n.mo19436e().mo19403j().mo19484a(this.f10384o.mo19673g(), f);
    }

    /* renamed from: b */
    private void m11177b(RectF rectF, Matrix matrix) {
        this.f10378i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (mo19664c()) {
            int size = this.f10385p.mo19517b().size();
            int i = 0;
            while (i < size) {
                this.f10370a.set((Path) this.f10385p.mo19516a().get(i).mo19513d());
                this.f10370a.transform(matrix);
                int i2 = C5770b.f10395b[this.f10385p.mo19517b().get(i).mo19600a().ordinal()];
                if (i2 != 1 && i2 != 2) {
                    this.f10370a.computeBounds(this.f10380k, false);
                    if (i == 0) {
                        this.f10378i.set(this.f10380k);
                    } else {
                        RectF rectF2 = this.f10378i;
                        rectF2.set(Math.min(rectF2.left, this.f10380k.left), Math.min(this.f10378i.top, this.f10380k.top), Math.max(this.f10378i.right, this.f10380k.right), Math.max(this.f10378i.bottom, this.f10380k.bottom));
                    }
                    i++;
                } else {
                    return;
                }
            }
            rectF.set(Math.max(rectF.left, this.f10378i.left), Math.max(rectF.top, this.f10378i.top), Math.min(rectF.right, this.f10378i.right), Math.min(rectF.bottom, this.f10378i.bottom));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo19664c() {
        C5710g gVar = this.f10385p;
        return gVar != null && !gVar.mo19516a().isEmpty();
    }

    /* renamed from: a */
    public void mo19490a() {
        m11180f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19659a(C5768a aVar) {
        this.f10386q = aVar;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    private void m11173a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    /* renamed from: a */
    public void mo19658a(C5703a<?, ?> aVar) {
        this.f10389t.add(aVar);
    }

    /* renamed from: a */
    public void mo19492a(RectF rectF, Matrix matrix) {
        this.f10382m.set(matrix);
        this.f10382m.preConcat(this.f10390u.mo19525b());
    }

    /* renamed from: a */
    public void mo19491a(Canvas canvas, Matrix matrix, int i) {
        C5647c.m10753a(this.f10381l);
        if (!this.f10391v) {
            C5647c.m10755c(this.f10381l);
            return;
        }
        m11179e();
        C5647c.m10753a("Layer#parentMatrix");
        this.f10371b.reset();
        this.f10371b.set(matrix);
        for (int size = this.f10388s.size() - 1; size >= 0; size--) {
            this.f10371b.preConcat(this.f10388s.get(size).f10390u.mo19525b());
        }
        C5647c.m10755c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i) / 255.0f) * ((float) this.f10390u.mo19527c().mo19513d().intValue())) / 100.0f) * 255.0f);
        if (mo19665d() || mo19664c()) {
            C5647c.m10753a("Layer#computeBounds");
            this.f10377h.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo19492a(this.f10377h, this.f10371b);
            m11178c(this.f10377h, this.f10371b);
            this.f10371b.preConcat(this.f10390u.mo19525b());
            m11177b(this.f10377h, this.f10371b);
            this.f10377h.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            C5647c.m10755c("Layer#computeBounds");
            C5647c.m10753a("Layer#saveLayer");
            m11173a(canvas, this.f10377h, this.f10372c, true);
            C5647c.m10755c("Layer#saveLayer");
            m11170a(canvas);
            C5647c.m10753a("Layer#drawLayer");
            mo19661b(canvas, this.f10371b, intValue);
            C5647c.m10755c("Layer#drawLayer");
            if (mo19664c()) {
                m11171a(canvas, this.f10371b);
            }
            if (mo19665d()) {
                C5647c.m10753a("Layer#drawMatte");
                C5647c.m10753a("Layer#saveLayer");
                m11173a(canvas, this.f10377h, this.f10375f, false);
                C5647c.m10755c("Layer#saveLayer");
                m11170a(canvas);
                this.f10386q.mo19491a(canvas, matrix, intValue);
                C5647c.m10753a("Layer#restoreLayer");
                canvas.restore();
                C5647c.m10755c("Layer#restoreLayer");
                C5647c.m10755c("Layer#drawMatte");
            }
            C5647c.m10753a("Layer#restoreLayer");
            canvas.restore();
            C5647c.m10755c("Layer#restoreLayer");
            m11176b(C5647c.m10755c(this.f10381l));
            return;
        }
        this.f10371b.preConcat(this.f10390u.mo19525b());
        C5647c.m10753a("Layer#drawLayer");
        mo19661b(canvas, this.f10371b, intValue);
        C5647c.m10755c("Layer#drawLayer");
        m11176b(C5647c.m10755c(this.f10381l));
    }

    /* renamed from: a */
    private void m11170a(Canvas canvas) {
        C5647c.m10753a("Layer#clearLayer");
        RectF rectF = this.f10377h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f10376g);
        C5647c.m10755c("Layer#clearLayer");
    }

    /* renamed from: a */
    private void m11171a(Canvas canvas, Matrix matrix) {
        m11172a(canvas, matrix, C5750g.C5751a.MaskModeAdd);
        m11172a(canvas, matrix, C5750g.C5751a.MaskModeIntersect);
        m11172a(canvas, matrix, C5750g.C5751a.MaskModeSubtract);
    }

    /* renamed from: a */
    private void m11172a(Canvas canvas, Matrix matrix, C5750g.C5751a aVar) {
        Paint paint;
        boolean z = true;
        if (C5770b.f10395b[aVar.ordinal()] != 1) {
            paint = this.f10373d;
        } else {
            paint = this.f10374e;
        }
        int size = this.f10385p.mo19517b().size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (this.f10385p.mo19517b().get(i).mo19600a() == aVar) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C5647c.m10753a("Layer#drawMask");
            C5647c.m10753a("Layer#saveLayer");
            m11173a(canvas, this.f10377h, paint, false);
            C5647c.m10755c("Layer#saveLayer");
            m11170a(canvas);
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f10385p.mo19517b().get(i2).mo19600a() == aVar) {
                    this.f10370a.set((Path) this.f10385p.mo19516a().get(i2).mo19513d());
                    this.f10370a.transform(matrix);
                    int alpha = this.f10372c.getAlpha();
                    this.f10372c.setAlpha((int) (((float) ((Integer) this.f10385p.mo19518c().get(i2).mo19513d()).intValue()) * 2.55f));
                    canvas.drawPath(this.f10370a, this.f10372c);
                    this.f10372c.setAlpha(alpha);
                }
            }
            C5647c.m10753a("Layer#restoreLayer");
            canvas.restore();
            C5647c.m10755c("Layer#restoreLayer");
            C5647c.m10755c("Layer#drawMask");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11175a(boolean z) {
        if (z != this.f10391v) {
            this.f10391v = z;
            m11180f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19657a(float f) {
        this.f10390u.mo19526b(f);
        if (this.f10385p != null) {
            for (int i = 0; i < this.f10385p.mo19516a().size(); i++) {
                this.f10385p.mo19516a().get(i).mo19508a(f);
            }
        }
        if (this.f10384o.mo19686t() != 0.0f) {
            f /= this.f10384o.mo19686t();
        }
        C5768a aVar = this.f10386q;
        if (aVar != null) {
            this.f10386q.mo19657a(aVar.f10384o.mo19686t() * f);
        }
        for (int i2 = 0; i2 < this.f10389t.size(); i2++) {
            this.f10389t.get(i2).mo19508a(f);
        }
    }

    /* renamed from: a */
    public void mo19493a(C5726e eVar, int i, List<C5726e> list, C5726e eVar2) {
        if (eVar.mo19553c(getName(), i)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.mo19549a(getName());
                if (eVar.mo19551a(getName(), i)) {
                    list.add(eVar2.mo19548a((C5727f) this));
                }
            }
            if (eVar.mo19554d(getName(), i)) {
                mo19662b(eVar, i + eVar.mo19552b(getName(), i), list, eVar2);
            }
        }
    }

    /* renamed from: a */
    public <T> void mo19494a(T t, C5832c<T> cVar) {
        this.f10390u.mo19524a(t, cVar);
    }
}
