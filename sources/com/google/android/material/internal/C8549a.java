package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.material.internal.C8559g;
import p050l.p075h.p079g.C4968a;
import p050l.p075h.p082j.C4993e;
import p050l.p075h.p083k.C5008h;
import p050l.p075h.p084l.C5019d;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p294w.C10617a;
import p112n.p277e.p279b.p282b.p294w.C10621d;
import p112n.p277e.p279b.p282b.p294w.C10625f;

/* renamed from: com.google.android.material.internal.a */
/* compiled from: CollapsingTextHelper */
public final class C8549a {

    /* renamed from: Z */
    private static final boolean f24422Z = (Build.VERSION.SDK_INT < 18);

    /* renamed from: a0 */
    private static final Paint f24423a0;

    /* renamed from: A */
    private boolean f24424A;

    /* renamed from: B */
    private Bitmap f24425B;

    /* renamed from: C */
    private Paint f24426C;

    /* renamed from: D */
    private float f24427D;

    /* renamed from: E */
    private float f24428E;

    /* renamed from: F */
    private int[] f24429F;

    /* renamed from: G */
    private boolean f24430G;

    /* renamed from: H */
    private final TextPaint f24431H;

    /* renamed from: I */
    private final TextPaint f24432I;

    /* renamed from: J */
    private TimeInterpolator f24433J;

    /* renamed from: K */
    private TimeInterpolator f24434K;

    /* renamed from: L */
    private float f24435L;

    /* renamed from: M */
    private float f24436M;

    /* renamed from: N */
    private float f24437N;

    /* renamed from: O */
    private ColorStateList f24438O;

    /* renamed from: P */
    private float f24439P;

    /* renamed from: Q */
    private float f24440Q;

    /* renamed from: R */
    private float f24441R;

    /* renamed from: S */
    private ColorStateList f24442S;

    /* renamed from: T */
    private StaticLayout f24443T;

    /* renamed from: U */
    private float f24444U;

    /* renamed from: V */
    private float f24445V;

    /* renamed from: W */
    private float f24446W;

    /* renamed from: X */
    private CharSequence f24447X;

    /* renamed from: Y */
    private int f24448Y = 1;

    /* renamed from: a */
    private final View f24449a;

    /* renamed from: b */
    private boolean f24450b;

    /* renamed from: c */
    private float f24451c;

    /* renamed from: d */
    private final Rect f24452d;

    /* renamed from: e */
    private final Rect f24453e;

    /* renamed from: f */
    private final RectF f24454f;

    /* renamed from: g */
    private int f24455g = 16;

    /* renamed from: h */
    private int f24456h = 16;

    /* renamed from: i */
    private float f24457i = 15.0f;

    /* renamed from: j */
    private float f24458j = 15.0f;

    /* renamed from: k */
    private ColorStateList f24459k;

    /* renamed from: l */
    private ColorStateList f24460l;

    /* renamed from: m */
    private float f24461m;

    /* renamed from: n */
    private float f24462n;

    /* renamed from: o */
    private float f24463o;

    /* renamed from: p */
    private float f24464p;

    /* renamed from: q */
    private float f24465q;

    /* renamed from: r */
    private float f24466r;

    /* renamed from: s */
    private Typeface f24467s;

    /* renamed from: t */
    private Typeface f24468t;

    /* renamed from: u */
    private Typeface f24469u;

    /* renamed from: v */
    private C10617a f24470v;

    /* renamed from: w */
    private C10617a f24471w;

    /* renamed from: x */
    private CharSequence f24472x;

    /* renamed from: y */
    private CharSequence f24473y;

    /* renamed from: z */
    private boolean f24474z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    class C8550a implements C10617a.C10618a {
        C8550a() {
        }

        /* renamed from: a */
        public void mo31913a(Typeface typeface) {
            C8549a.this.mo31885a(typeface);
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    /* compiled from: CollapsingTextHelper */
    class C8551b implements C10617a.C10618a {
        C8551b() {
        }

        /* renamed from: a */
        public void mo31913a(Typeface typeface) {
            C8549a.this.mo31895b(typeface);
        }
    }

    static {
        Paint paint = null;
        f24423a0 = paint;
        if (paint != null) {
            paint.setAntiAlias(true);
            f24423a0.setColor(-65281);
        }
    }

    public C8549a(View view) {
        this.f24449a = view;
        this.f24431H = new TextPaint(129);
        this.f24432I = new TextPaint(this.f24431H);
        this.f24453e = new Rect();
        this.f24452d = new Rect();
        this.f24454f = new RectF();
    }

    /* renamed from: e */
    private boolean m27902e(Typeface typeface) {
        C10617a aVar = this.f24470v;
        if (aVar != null) {
            aVar.mo36203a();
        }
        if (this.f24468t == typeface) {
            return false;
        }
        this.f24468t = typeface;
        return true;
    }

    /* renamed from: p */
    private void m27906p() {
        float f;
        float f2;
        StaticLayout staticLayout;
        float f3 = this.f24428E;
        m27899d(this.f24458j);
        CharSequence charSequence = this.f24473y;
        if (!(charSequence == null || (staticLayout = this.f24443T) == null)) {
            this.f24447X = TextUtils.ellipsize(charSequence, this.f24431H, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f24447X;
        float f4 = 0.0f;
        float measureText = charSequence2 != null ? this.f24431H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int a = C5019d.m8933a(this.f24456h, this.f24474z ? 1 : 0);
        StaticLayout staticLayout2 = this.f24443T;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        int i = a & 112;
        if (i == 48) {
            this.f24462n = ((float) this.f24453e.top) - this.f24431H.ascent();
        } else if (i != 80) {
            float descent = (this.f24431H.descent() - this.f24431H.ascent()) / 2.0f;
            float descent2 = descent - this.f24431H.descent();
            if (m27912v()) {
                f2 = ((float) this.f24453e.centerY()) - descent;
            } else {
                f2 = descent2 + ((float) this.f24453e.centerY());
            }
            this.f24462n = f2;
        } else {
            this.f24462n = (float) this.f24453e.bottom;
        }
        int i2 = a & 8388615;
        if (i2 == 1) {
            this.f24464p = ((float) this.f24453e.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f24464p = (float) this.f24453e.left;
        } else {
            this.f24464p = ((float) this.f24453e.right) - measureText;
        }
        m27899d(this.f24457i);
        CharSequence charSequence3 = this.f24473y;
        float measureText2 = charSequence3 != null ? this.f24431H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f24443T;
        if (staticLayout3 != null && this.f24448Y > 1 && !this.f24474z) {
            measureText2 = staticLayout3.getLineWidth(0);
        }
        StaticLayout staticLayout4 = this.f24443T;
        this.f24446W = staticLayout4 != null ? staticLayout4.getLineLeft(0) : 0.0f;
        int a2 = C5019d.m8933a(this.f24455g, this.f24474z ? 1 : 0);
        int i3 = a2 & 112;
        if (i3 == 48) {
            this.f24461m = ((float) this.f24452d.top) - this.f24431H.ascent();
        } else if (i3 != 80) {
            float descent3 = ((this.f24431H.descent() - this.f24431H.ascent()) / 2.0f) - this.f24431H.descent();
            if (m27912v()) {
                f = ((float) this.f24452d.centerY()) - (height / 2.0f);
            } else {
                f = descent3 + ((float) this.f24452d.centerY());
            }
            this.f24461m = f;
        } else {
            if (m27912v()) {
                f4 = height - this.f24431H.descent();
            }
            this.f24461m = ((float) this.f24452d.bottom) - f4;
        }
        int i4 = a2 & 8388615;
        if (i4 == 1) {
            this.f24463o = ((float) this.f24452d.centerX()) - (measureText2 / 2.0f);
        } else if (i4 != 5) {
            this.f24463o = (float) this.f24452d.left;
        } else {
            this.f24463o = ((float) this.f24452d.right) - measureText2;
        }
        m27908r();
        m27905h(f3);
    }

    /* renamed from: q */
    private void m27907q() {
        m27898c(this.f24451c);
    }

    /* renamed from: r */
    private void m27908r() {
        Bitmap bitmap = this.f24425B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f24425B = null;
        }
    }

    /* renamed from: s */
    private void m27909s() {
        if (this.f24425B == null && !this.f24452d.isEmpty() && !TextUtils.isEmpty(this.f24473y)) {
            m27898c(0.0f);
            int width = this.f24443T.getWidth();
            int height = this.f24443T.getHeight();
            if (width > 0 && height > 0) {
                this.f24425B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f24443T.draw(new Canvas(this.f24425B));
                if (this.f24426C == null) {
                    this.f24426C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: t */
    private int m27910t() {
        return m27897c(this.f24459k);
    }

    /* renamed from: u */
    private boolean m27911u() {
        return C5071v.m9204p(this.f24449a) == 1;
    }

    /* renamed from: v */
    private boolean m27912v() {
        return this.f24448Y > 1 && !this.f24474z && !this.f24424A;
    }

    /* renamed from: a */
    public void mo31880a(TimeInterpolator timeInterpolator) {
        this.f24433J = timeInterpolator;
        mo31912o();
    }

    /* renamed from: b */
    public void mo31892b(TimeInterpolator timeInterpolator) {
        this.f24434K = timeInterpolator;
        mo31912o();
    }

    /* renamed from: c */
    public int mo31896c() {
        return this.f24456h;
    }

    /* renamed from: d */
    public float mo31899d() {
        m27891a(this.f24432I);
        return -this.f24432I.ascent();
    }

    /* renamed from: f */
    public int mo31903f() {
        return m27897c(this.f24460l);
    }

    /* renamed from: g */
    public int mo31904g() {
        return this.f24455g;
    }

    /* renamed from: h */
    public float mo31905h() {
        m27895b(this.f24432I);
        return -this.f24432I.ascent();
    }

    /* renamed from: i */
    public Typeface mo31906i() {
        Typeface typeface = this.f24468t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: j */
    public float mo31907j() {
        return this.f24451c;
    }

    /* renamed from: k */
    public int mo31908k() {
        return this.f24448Y;
    }

    /* renamed from: l */
    public CharSequence mo31909l() {
        return this.f24472x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f24459k;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo31910m() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f24460l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f24459k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C8549a.mo31910m():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo31911n() {
        this.f24450b = this.f24453e.width() > 0 && this.f24453e.height() > 0 && this.f24452d.width() > 0 && this.f24452d.height() > 0;
    }

    /* renamed from: o */
    public void mo31912o() {
        if (this.f24449a.getHeight() > 0 && this.f24449a.getWidth() > 0) {
            m27906p();
            m27907q();
        }
    }

    /* renamed from: f */
    private void m27903f(float f) {
        this.f24444U = f;
        C5071v.m9144I(this.f24449a);
    }

    /* renamed from: g */
    private void m27904g(float f) {
        this.f24445V = f;
        C5071v.m9144I(this.f24449a);
    }

    /* renamed from: c */
    public void mo31897c(int i) {
        C10621d dVar = new C10621d(this.f24449a.getContext(), i);
        ColorStateList colorStateList = dVar.f28509b;
        if (colorStateList != null) {
            this.f24459k = colorStateList;
        }
        float f = dVar.f28508a;
        if (f != 0.0f) {
            this.f24457i = f;
        }
        ColorStateList colorStateList2 = dVar.f28515h;
        if (colorStateList2 != null) {
            this.f24442S = colorStateList2;
        }
        this.f24440Q = dVar.f28516i;
        this.f24441R = dVar.f28517j;
        this.f24439P = dVar.f28518k;
        C10617a aVar = this.f24470v;
        if (aVar != null) {
            aVar.mo36203a();
        }
        this.f24470v = new C10617a(new C8551b(), dVar.mo36204a());
        dVar.mo36207a(this.f24449a.getContext(), (C10625f) this.f24470v);
        mo31912o();
    }

    /* renamed from: h */
    private void m27905h(float f) {
        m27899d(f);
        boolean z = f24422Z && this.f24427D != 1.0f;
        this.f24424A = z;
        if (z) {
            m27909s();
        }
        C5071v.m9144I(this.f24449a);
    }

    /* renamed from: a */
    public void mo31877a(float f) {
        if (this.f24457i != f) {
            this.f24457i = f;
            mo31912o();
        }
    }

    /* renamed from: b */
    public void mo31893b(ColorStateList colorStateList) {
        if (this.f24459k != colorStateList) {
            this.f24459k = colorStateList;
            mo31912o();
        }
    }

    /* renamed from: d */
    public void mo31900d(int i) {
        if (this.f24455g != i) {
            this.f24455g = i;
            mo31912o();
        }
    }

    /* renamed from: e */
    public Typeface mo31901e() {
        Typeface typeface = this.f24467s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: d */
    private boolean m27900d(Typeface typeface) {
        C10617a aVar = this.f24471w;
        if (aVar != null) {
            aVar.mo36203a();
        }
        if (this.f24467s == typeface) {
            return false;
        }
        this.f24467s = typeface;
        return true;
    }

    /* renamed from: e */
    private void m27901e(float f) {
        this.f24454f.left = m27886a((float) this.f24452d.left, (float) this.f24453e.left, f, this.f24433J);
        this.f24454f.top = m27886a(this.f24461m, this.f24462n, f, this.f24433J);
        this.f24454f.right = m27886a((float) this.f24452d.right, (float) this.f24453e.right, f, this.f24433J);
        this.f24454f.bottom = m27886a((float) this.f24452d.bottom, (float) this.f24453e.bottom, f, this.f24433J);
    }

    /* renamed from: a */
    public void mo31881a(ColorStateList colorStateList) {
        if (this.f24460l != colorStateList) {
            this.f24460l = colorStateList;
            mo31912o();
        }
    }

    /* renamed from: b */
    public void mo31891b(int i, int i2, int i3, int i4) {
        if (!m27893a(this.f24452d, i, i2, i3, i4)) {
            this.f24452d.set(i, i2, i3, i4);
            this.f24430G = true;
            mo31911n();
        }
    }

    /* renamed from: a */
    public void mo31879a(int i, int i2, int i3, int i4) {
        if (!m27893a(this.f24453e, i, i2, i3, i4)) {
            this.f24453e.set(i, i2, i3, i4);
            this.f24430G = true;
            mo31911n();
        }
    }

    /* renamed from: d */
    private void m27899d(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f24472x != null) {
            float width = (float) this.f24453e.width();
            float width2 = (float) this.f24452d.width();
            boolean z3 = false;
            int i = 1;
            if (m27892a(f, this.f24458j)) {
                f2 = this.f24458j;
                this.f24427D = 1.0f;
                Typeface typeface = this.f24469u;
                Typeface typeface2 = this.f24467s;
                if (typeface != typeface2) {
                    this.f24469u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f24457i;
                Typeface typeface3 = this.f24469u;
                Typeface typeface4 = this.f24468t;
                if (typeface3 != typeface4) {
                    this.f24469u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m27892a(f, this.f24457i)) {
                    this.f24427D = 1.0f;
                } else {
                    this.f24427D = f / this.f24457i;
                }
                float f4 = this.f24458j / this.f24457i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f24428E != f2 || this.f24430G || z;
                this.f24428E = f2;
                this.f24430G = false;
            }
            if (this.f24473y == null || z) {
                this.f24431H.setTextSize(this.f24428E);
                this.f24431H.setTypeface(this.f24469u);
                TextPaint textPaint = this.f24431H;
                if (this.f24427D != 1.0f) {
                    z3 = true;
                }
                textPaint.setLinearText(z3);
                this.f24474z = m27896b(this.f24472x);
                if (m27912v()) {
                    i = this.f24448Y;
                }
                StaticLayout a = m27889a(i, width, this.f24474z);
                this.f24443T = a;
                this.f24473y = a.getText();
            }
        }
    }

    /* renamed from: b */
    public void mo31894b(Rect rect) {
        mo31891b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    private float m27894b(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) + (mo31876a() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f24474z ? rectF.left + mo31876a() : (float) this.f24453e.right : this.f24474z ? (float) this.f24453e.right : rectF.left + mo31876a();
    }

    /* renamed from: a */
    public void mo31883a(Rect rect) {
        mo31879a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: e */
    public void mo31902e(int i) {
        if (i != this.f24448Y) {
            this.f24448Y = i;
            m27908r();
            mo31912o();
        }
    }

    /* renamed from: b */
    private void m27895b(TextPaint textPaint) {
        textPaint.setTextSize(this.f24457i);
        textPaint.setTypeface(this.f24468t);
    }

    /* renamed from: a */
    public void mo31884a(RectF rectF, int i, int i2) {
        this.f24474z = m27896b(this.f24472x);
        rectF.left = m27887a(i, i2);
        rectF.top = (float) this.f24453e.top;
        rectF.right = m27894b(rectF, i, i2);
        rectF.bottom = ((float) this.f24453e.top) + mo31899d();
    }

    /* renamed from: b */
    public void mo31890b(int i) {
        if (this.f24456h != i) {
            this.f24456h = i;
            mo31912o();
        }
    }

    /* renamed from: c */
    public void mo31898c(Typeface typeface) {
        boolean d = m27900d(typeface);
        boolean e = m27902e(typeface);
        if (d || e) {
            mo31912o();
        }
    }

    /* renamed from: a */
    private float m27887a(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (((float) i) / 2.0f) - (mo31876a() / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f24474z ? (float) this.f24453e.left : ((float) this.f24453e.right) - mo31876a() : this.f24474z ? ((float) this.f24453e.right) - mo31876a() : (float) this.f24453e.left;
    }

    /* renamed from: b */
    public void mo31895b(Typeface typeface) {
        if (m27902e(typeface)) {
            mo31912o();
        }
    }

    /* renamed from: c */
    private void m27898c(float f) {
        m27901e(f);
        this.f24465q = m27886a(this.f24463o, this.f24464p, f, this.f24433J);
        this.f24466r = m27886a(this.f24461m, this.f24462n, f, this.f24433J);
        m27905h(m27886a(this.f24457i, this.f24458j, f, this.f24434K));
        m27903f(1.0f - m27886a(0.0f, 1.0f, 1.0f - f, C10585a.f28457b));
        m27904g(m27886a(1.0f, 0.0f, f, C10585a.f28457b));
        if (this.f24460l != this.f24459k) {
            this.f24431H.setColor(m27888a(m27910t(), mo31903f(), f));
        } else {
            this.f24431H.setColor(mo31903f());
        }
        this.f24431H.setShadowLayer(m27886a(this.f24439P, this.f24435L, f, (TimeInterpolator) null), m27886a(this.f24440Q, this.f24436M, f, (TimeInterpolator) null), m27886a(this.f24441R, this.f24437N, f, (TimeInterpolator) null), m27888a(m27897c(this.f24442S), m27897c(this.f24438O), f));
        C5071v.m9144I(this.f24449a);
    }

    /* renamed from: b */
    public void mo31889b(float f) {
        float a = C4968a.m8800a(f, 0.0f, 1.0f);
        if (a != this.f24451c) {
            this.f24451c = a;
            m27907q();
        }
    }

    /* renamed from: a */
    public float mo31876a() {
        if (this.f24472x == null) {
            return 0.0f;
        }
        m27891a(this.f24432I);
        TextPaint textPaint = this.f24432I;
        CharSequence charSequence = this.f24472x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    private void m27891a(TextPaint textPaint) {
        textPaint.setTextSize(this.f24458j);
        textPaint.setTypeface(this.f24467s);
    }

    /* renamed from: b */
    private boolean m27896b(CharSequence charSequence) {
        return (m27911u() ? C4993e.f8852d : C4993e.f8851c).mo17447a(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public void mo31878a(int i) {
        C10621d dVar = new C10621d(this.f24449a.getContext(), i);
        ColorStateList colorStateList = dVar.f28509b;
        if (colorStateList != null) {
            this.f24460l = colorStateList;
        }
        float f = dVar.f28508a;
        if (f != 0.0f) {
            this.f24458j = f;
        }
        ColorStateList colorStateList2 = dVar.f28515h;
        if (colorStateList2 != null) {
            this.f24438O = colorStateList2;
        }
        this.f24436M = dVar.f28516i;
        this.f24437N = dVar.f28517j;
        this.f24435L = dVar.f28518k;
        C10617a aVar = this.f24471w;
        if (aVar != null) {
            aVar.mo36203a();
        }
        this.f24471w = new C10617a(new C8550a(), dVar.mo36204a());
        dVar.mo36207a(this.f24449a.getContext(), (C10625f) this.f24471w);
        mo31912o();
    }

    /* renamed from: b */
    public ColorStateList mo31888b() {
        return this.f24460l;
    }

    /* renamed from: a */
    public void mo31885a(Typeface typeface) {
        if (m27900d(typeface)) {
            mo31912o();
        }
    }

    /* renamed from: c */
    private int m27897c(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f24429F;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: a */
    public final boolean mo31887a(int[] iArr) {
        this.f24429F = iArr;
        if (!mo31910m()) {
            return false;
        }
        mo31912o();
        return true;
    }

    /* renamed from: a */
    public void mo31882a(Canvas canvas) {
        int save = canvas.save();
        if (this.f24473y != null && this.f24450b) {
            float lineLeft = (this.f24465q + this.f24443T.getLineLeft(0)) - (this.f24446W * 2.0f);
            this.f24431H.setTextSize(this.f24428E);
            float f = this.f24465q;
            float f2 = this.f24466r;
            boolean z = this.f24424A && this.f24425B != null;
            float lineAscent = (float) this.f24443T.getLineAscent(0);
            float f3 = this.f24427D;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f24425B, f, f2 + lineAscent, this.f24426C);
                canvas.restoreToCount(save);
                return;
            }
            if (m27912v()) {
                m27890a(canvas, lineLeft, f, f2, lineAscent);
            } else {
                canvas.translate(f, f2 + lineAscent);
                this.f24443T.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: a */
    private void m27890a(Canvas canvas, float f, float f2, float f3, float f4) {
        int alpha = this.f24431H.getAlpha();
        canvas.translate(f, f3);
        float f5 = (float) alpha;
        this.f24431H.setAlpha((int) (this.f24445V * f5));
        this.f24443T.draw(canvas);
        canvas.translate(f2 - f, 0.0f);
        this.f24431H.setAlpha((int) (this.f24444U * f5));
        CharSequence charSequence = this.f24447X;
        float f6 = -f4;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6 / this.f24427D, this.f24431H);
        String trim = this.f24447X.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f24431H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f24443T.getLineEnd(0), str.length()), 0.0f, f6 / this.f24427D, this.f24431H);
    }

    /* renamed from: a */
    private StaticLayout m27889a(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            C8559g a = C8559g.m27965a(this.f24472x, this.f24431H, (int) f);
            a.mo31939a(TextUtils.TruncateAt.END);
            a.mo31941b(z);
            a.mo31938a(Layout.Alignment.ALIGN_NORMAL);
            a.mo31940a(false);
            a.mo31937a(i);
            staticLayout = a.mo31936a();
        } catch (C8559g.C8560a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        C5008h.m8899a(staticLayout);
        return staticLayout;
    }

    /* renamed from: a */
    public void mo31886a(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f24472x, charSequence)) {
            this.f24472x = charSequence;
            this.f24473y = null;
            m27908r();
            mo31912o();
        }
    }

    /* renamed from: a */
    private static boolean m27892a(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: a */
    private static int m27888a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: a */
    private static float m27886a(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C10585a.m35867a(f, f2, f3);
    }

    /* renamed from: a */
    private static boolean m27893a(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }
}
