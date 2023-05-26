package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.graphics.drawable.C0415b;
import com.google.android.material.internal.C8561h;
import com.google.android.material.internal.C8566j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p076e.C4949a;
import p050l.p075h.p082j.C4985a;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10592h;
import p112n.p277e.p279b.p282b.p284n.C10596a;
import p112n.p277e.p279b.p282b.p289r.C10610a;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p294w.C10621d;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p297z.C10638g;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C8482a extends C10638g implements C0415b, Drawable.Callback, C8561h.C8563b {

    /* renamed from: N0 */
    private static final int[] f24139N0 = {16842910};

    /* renamed from: O0 */
    private static final ShapeDrawable f24140O0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f24141A0 = 255;

    /* renamed from: B0 */
    private ColorFilter f24142B0;

    /* renamed from: C0 */
    private PorterDuffColorFilter f24143C0;

    /* renamed from: D */
    private ColorStateList f24144D;

    /* renamed from: D0 */
    private ColorStateList f24145D0;

    /* renamed from: E */
    private ColorStateList f24146E;

    /* renamed from: E0 */
    private PorterDuff.Mode f24147E0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: F */
    private float f24148F;

    /* renamed from: F0 */
    private int[] f24149F0;

    /* renamed from: G */
    private float f24150G = -1.0f;

    /* renamed from: G0 */
    private boolean f24151G0;

    /* renamed from: H */
    private ColorStateList f24152H;

    /* renamed from: H0 */
    private ColorStateList f24153H0;

    /* renamed from: I */
    private float f24154I;

    /* renamed from: I0 */
    private WeakReference<C8483a> f24155I0;

    /* renamed from: J */
    private ColorStateList f24156J;

    /* renamed from: J0 */
    private TextUtils.TruncateAt f24157J0;

    /* renamed from: K */
    private CharSequence f24158K;

    /* renamed from: K0 */
    private boolean f24159K0;

    /* renamed from: L */
    private boolean f24160L;

    /* renamed from: L0 */
    private int f24161L0;

    /* renamed from: M */
    private Drawable f24162M;

    /* renamed from: M0 */
    private boolean f24163M0;

    /* renamed from: N */
    private ColorStateList f24164N;

    /* renamed from: O */
    private float f24165O;

    /* renamed from: P */
    private boolean f24166P;

    /* renamed from: Q */
    private boolean f24167Q;

    /* renamed from: R */
    private Drawable f24168R;

    /* renamed from: S */
    private Drawable f24169S;

    /* renamed from: T */
    private ColorStateList f24170T;

    /* renamed from: U */
    private float f24171U;

    /* renamed from: V */
    private CharSequence f24172V;

    /* renamed from: W */
    private boolean f24173W;

    /* renamed from: X */
    private boolean f24174X;

    /* renamed from: Y */
    private Drawable f24175Y;

    /* renamed from: Z */
    private ColorStateList f24176Z;

    /* renamed from: a0 */
    private C10592h f24177a0;

    /* renamed from: b0 */
    private C10592h f24178b0;

    /* renamed from: c0 */
    private float f24179c0;

    /* renamed from: d0 */
    private float f24180d0;

    /* renamed from: e0 */
    private float f24181e0;

    /* renamed from: f0 */
    private float f24182f0;

    /* renamed from: g0 */
    private float f24183g0;

    /* renamed from: h0 */
    private float f24184h0;

    /* renamed from: i0 */
    private float f24185i0;

    /* renamed from: j0 */
    private float f24186j0;

    /* renamed from: k0 */
    private final Context f24187k0;

    /* renamed from: l0 */
    private final Paint f24188l0 = new Paint(1);

    /* renamed from: m0 */
    private final Paint f24189m0;

    /* renamed from: n0 */
    private final Paint.FontMetrics f24190n0 = new Paint.FontMetrics();

    /* renamed from: o0 */
    private final RectF f24191o0 = new RectF();

    /* renamed from: p0 */
    private final PointF f24192p0 = new PointF();

    /* renamed from: q0 */
    private final Path f24193q0 = new Path();

    /* renamed from: r0 */
    private final C8561h f24194r0;

    /* renamed from: s0 */
    private int f24195s0;

    /* renamed from: t0 */
    private int f24196t0;

    /* renamed from: u0 */
    private int f24197u0;

    /* renamed from: v0 */
    private int f24198v0;

    /* renamed from: w0 */
    private int f24199w0;

    /* renamed from: x0 */
    private int f24200x0;

    /* renamed from: y0 */
    private boolean f24201y0;

    /* renamed from: z0 */
    private int f24202z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C8483a {
        /* renamed from: a */
        void mo31256a();
    }

    private C8482a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Paint paint = null;
        this.f24155I0 = new WeakReference<>(paint);
        mo36239a(context);
        this.f24187k0 = context;
        C8561h hVar = new C8561h(this);
        this.f24194r0 = hVar;
        this.f24158K = "";
        hVar.mo31948b().density = context.getResources().getDisplayMetrics().density;
        this.f24189m0 = paint;
        if (paint != null) {
            paint.setStyle(Paint.Style.STROKE);
        }
        setState(f24139N0);
        mo31476a(f24139N0);
        this.f24159K0 = true;
        if (C10629b.f28531a) {
            f24140O0.setTint(-1);
        }
    }

    /* renamed from: a */
    public static C8482a m27477a(Context context, AttributeSet attributeSet, int i, int i2) {
        C8482a aVar = new C8482a(context, attributeSet, i, i2);
        aVar.m27480a(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: b */
    private void m27483b(Canvas canvas, Rect rect) {
        if (!this.f24163M0) {
            this.f24188l0.setColor(this.f24196t0);
            this.f24188l0.setStyle(Paint.Style.FILL);
            this.f24188l0.setColorFilter(m27500h0());
            this.f24191o0.set(rect);
            canvas.drawRoundRect(this.f24191o0, mo31555z(), mo31555z(), this.f24188l0);
        }
    }

    /* renamed from: c */
    private void m27486c(Canvas canvas, Rect rect) {
        if (m27505j0()) {
            m27479a(rect, this.f24191o0);
            RectF rectF = this.f24191o0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f24162M.setBounds(0, 0, (int) this.f24191o0.width(), (int) this.f24191o0.height());
            this.f24162M.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: d */
    private void m27488d(Canvas canvas, Rect rect) {
        if (this.f24154I > 0.0f && !this.f24163M0) {
            this.f24188l0.setColor(this.f24198v0);
            this.f24188l0.setStyle(Paint.Style.STROKE);
            if (!this.f24163M0) {
                this.f24188l0.setColorFilter(m27500h0());
            }
            RectF rectF = this.f24191o0;
            float f = this.f24154I;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f24150G - (this.f24154I / 2.0f);
            canvas.drawRoundRect(this.f24191o0, f2, f2, this.f24188l0);
        }
    }

    /* renamed from: e */
    private void m27491e(Canvas canvas, Rect rect) {
        if (!this.f24163M0) {
            this.f24188l0.setColor(this.f24195s0);
            this.f24188l0.setStyle(Paint.Style.FILL);
            this.f24191o0.set(rect);
            canvas.drawRoundRect(this.f24191o0, mo31555z(), mo31555z(), this.f24188l0);
        }
    }

    /* renamed from: f */
    private void m27494f(Canvas canvas, Rect rect) {
        if (m27506k0()) {
            m27487c(rect, this.f24191o0);
            RectF rectF = this.f24191o0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f24168R.setBounds(0, 0, (int) this.f24191o0.width(), (int) this.f24191o0.height());
            if (C10629b.f28531a) {
                this.f24169S.setBounds(this.f24168R.getBounds());
                this.f24169S.jumpToCurrentState();
                this.f24169S.draw(canvas);
            } else {
                this.f24168R.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: f0 */
    private float m27496f0() {
        this.f24194r0.mo31948b().getFontMetrics(this.f24190n0);
        Paint.FontMetrics fontMetrics = this.f24190n0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: g0 */
    private boolean m27498g0() {
        return this.f24174X && this.f24175Y != null && this.f24173W;
    }

    /* renamed from: h */
    private void m27499h(Canvas canvas, Rect rect) {
        Paint paint = this.f24189m0;
        if (paint != null) {
            paint.setColor(C4949a.m8709d(-16777216, 127));
            canvas.drawRect(rect, this.f24189m0);
            if (m27505j0() || m27503i0()) {
                m27479a(rect, this.f24191o0);
                canvas.drawRect(this.f24191o0, this.f24189m0);
            }
            if (this.f24158K != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f24189m0);
            }
            if (m27506k0()) {
                m27487c(rect, this.f24191o0);
                canvas.drawRect(this.f24191o0, this.f24189m0);
            }
            this.f24189m0.setColor(C4949a.m8709d(-65536, 127));
            m27484b(rect, this.f24191o0);
            canvas.drawRect(this.f24191o0, this.f24189m0);
            this.f24189m0.setColor(C4949a.m8709d(-16711936, 127));
            m27489d(rect, this.f24191o0);
            canvas.drawRect(this.f24191o0, this.f24189m0);
        }
    }

    /* renamed from: h0 */
    private ColorFilter m27500h0() {
        ColorFilter colorFilter = this.f24142B0;
        return colorFilter != null ? colorFilter : this.f24143C0;
    }

    /* renamed from: i */
    private void m27501i(Canvas canvas, Rect rect) {
        if (this.f24158K != null) {
            Paint.Align a = mo31468a(rect, this.f24192p0);
            m27492e(rect, this.f24191o0);
            if (this.f24194r0.mo31943a() != null) {
                this.f24194r0.mo31948b().drawableState = getState();
                this.f24194r0.mo31944a(this.f24187k0);
            }
            this.f24194r0.mo31948b().setTextAlign(a);
            int i = 0;
            boolean z = Math.round(this.f24194r0.mo31942a(mo31463V().toString())) > Math.round(this.f24191o0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f24191o0);
            }
            CharSequence charSequence = this.f24158K;
            if (z && this.f24157J0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f24194r0.mo31948b(), this.f24191o0.width(), this.f24157J0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f24192p0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f24194r0.mo31948b());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: i0 */
    private boolean m27503i0() {
        return this.f24174X && this.f24175Y != null && this.f24201y0;
    }

    /* renamed from: j */
    private void m27504j(ColorStateList colorStateList) {
        if (this.f24144D != colorStateList) {
            this.f24144D = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: j0 */
    private boolean m27505j0() {
        return this.f24160L && this.f24162M != null;
    }

    /* renamed from: k0 */
    private boolean m27506k0() {
        return this.f24167Q && this.f24168R != null;
    }

    /* renamed from: l0 */
    private void m27507l0() {
        this.f24153H0 = this.f24151G0 ? C10629b.m35983b(this.f24156J) : null;
    }

    @TargetApi(21)
    /* renamed from: m0 */
    private void m27508m0() {
        this.f24169S = new RippleDrawable(C10629b.m35983b(mo31461T()), this.f24168R, f24140O0);
    }

    /* renamed from: A */
    public void mo31438A(int i) {
        mo31513h(C4800a.m7935b(this.f24187k0, i));
    }

    /* renamed from: B */
    public Drawable mo31439B() {
        Drawable drawable = this.f24162M;
        if (drawable != null) {
            return C0414a.m2028h(drawable);
        }
        return null;
    }

    /* renamed from: C */
    public void mo31442C(int i) {
        mo31475a(new C10621d(this.f24187k0, i));
    }

    /* renamed from: D */
    public ColorStateList mo31443D() {
        return this.f24164N;
    }

    /* renamed from: E */
    public float mo31445E() {
        return this.f24148F;
    }

    /* renamed from: F */
    public float mo31447F() {
        return this.f24179c0;
    }

    /* renamed from: G */
    public ColorStateList mo31448G() {
        return this.f24152H;
    }

    /* renamed from: H */
    public float mo31449H() {
        return this.f24154I;
    }

    /* renamed from: I */
    public Drawable mo31450I() {
        Drawable drawable = this.f24168R;
        if (drawable != null) {
            return C0414a.m2028h(drawable);
        }
        return null;
    }

    /* renamed from: J */
    public CharSequence mo31451J() {
        return this.f24172V;
    }

    /* renamed from: K */
    public float mo31452K() {
        return this.f24185i0;
    }

    /* renamed from: L */
    public float mo31453L() {
        return this.f24171U;
    }

    /* renamed from: M */
    public float mo31454M() {
        return this.f24184h0;
    }

    /* renamed from: N */
    public int[] mo31455N() {
        return this.f24149F0;
    }

    /* renamed from: O */
    public ColorStateList mo31456O() {
        return this.f24170T;
    }

    /* renamed from: P */
    public TextUtils.TruncateAt mo31457P() {
        return this.f24157J0;
    }

    /* renamed from: Q */
    public C10592h mo31458Q() {
        return this.f24178b0;
    }

    /* renamed from: R */
    public float mo31459R() {
        return this.f24181e0;
    }

    /* renamed from: S */
    public float mo31460S() {
        return this.f24180d0;
    }

    /* renamed from: T */
    public ColorStateList mo31461T() {
        return this.f24156J;
    }

    /* renamed from: U */
    public C10592h mo31462U() {
        return this.f24177a0;
    }

    /* renamed from: V */
    public CharSequence mo31463V() {
        return this.f24158K;
    }

    /* renamed from: W */
    public C10621d mo31464W() {
        return this.f24194r0.mo31943a();
    }

    /* renamed from: X */
    public float mo31465X() {
        return this.f24183g0;
    }

    /* renamed from: Y */
    public float mo31466Y() {
        return this.f24182f0;
    }

    /* renamed from: Z */
    public boolean mo31467Z() {
        return this.f24151G0;
    }

    /* renamed from: a0 */
    public boolean mo31477a0() {
        return this.f24173W;
    }

    /* renamed from: b0 */
    public boolean mo31482b0() {
        return m27493e(this.f24168R);
    }

    /* renamed from: c0 */
    public boolean mo31487c0() {
        return this.f24167Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo31491d0() {
        C8483a aVar = (C8483a) this.f24155I0.get();
        if (aVar != null) {
            aVar.mo31256a();
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f24141A0;
            if (i2 < 255) {
                i = C10596a.m35897a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m27491e(canvas, bounds);
            m27483b(canvas, bounds);
            if (this.f24163M0) {
                super.draw(canvas);
            }
            m27488d(canvas, bounds);
            m27497g(canvas, bounds);
            m27486c(canvas, bounds);
            m27478a(canvas, bounds);
            if (this.f24159K0) {
                m27501i(canvas, bounds);
            }
            m27494f(canvas, bounds);
            m27499h(canvas, bounds);
            if (this.f24141A0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public boolean mo31496e0() {
        return this.f24159K0;
    }

    /* renamed from: g */
    public void mo31504g(boolean z) {
        if (this.f24151G0 != z) {
            this.f24151G0 = z;
            m27507l0();
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f24141A0;
    }

    public ColorFilter getColorFilter() {
        return this.f24142B0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f24148F;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f24179c0 + mo31544u() + this.f24182f0 + this.f24194r0.mo31942a(mo31463V().toString()) + this.f24183g0 + mo31547v() + this.f24186j0), this.f24161L0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f24163M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f24150G);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f24150G);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m27502i(this.f24144D) || m27502i(this.f24146E) || m27502i(this.f24152H) || (this.f24151G0 && m27502i(this.f24153H0)) || m27485b(this.f24194r0.mo31943a()) || m27498g0() || m27493e(this.f24162M) || m27493e(this.f24175Y) || m27502i(this.f24145D0);
    }

    /* renamed from: k */
    public void mo31520k(float f) {
        if (this.f24154I != f) {
            this.f24154I = f;
            this.f24188l0.setStrokeWidth(f);
            if (this.f24163M0) {
                super.mo36253e(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: l */
    public void mo31523l(int i) {
        mo31494e(C4800a.m7935b(this.f24187k0, i));
    }

    /* renamed from: m */
    public void mo31525m(int i) {
        mo31490d(this.f24187k0.getResources().getBoolean(i));
    }

    /* renamed from: n */
    public void mo31527n(int i) {
        mo31514i(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: o */
    public void mo31529o(int i) {
        mo31518j(this.f24187k0.getResources().getDimension(i));
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m27505j0()) {
            onLayoutDirectionChanged |= C0414a.m2020a(this.f24162M, i);
        }
        if (m27503i0()) {
            onLayoutDirectionChanged |= C0414a.m2020a(this.f24175Y, i);
        }
        if (m27506k0()) {
            onLayoutDirectionChanged |= C0414a.m2020a(this.f24168R, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m27505j0()) {
            onLevelChange |= this.f24162M.setLevel(i);
        }
        if (m27503i0()) {
            onLevelChange |= this.f24175Y.setLevel(i);
        }
        if (m27506k0()) {
            onLevelChange |= this.f24168R.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f24163M0) {
            super.onStateChange(iArr);
        }
        return m27482a(iArr, mo31455N());
    }

    /* renamed from: p */
    public void mo31533p(int i) {
        mo31499f(C4800a.m7935b(this.f24187k0, i));
    }

    /* renamed from: q */
    public void mo31535q(int i) {
        mo31520k(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: r */
    public void mo31536r(float f) {
        if (this.f24182f0 != f) {
            this.f24182f0 = f;
            invalidateSelf();
            mo31491d0();
        }
    }

    /* renamed from: s */
    public void mo31538s(int i) {
        mo31485c(C4800a.m7936c(this.f24187k0, i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f24141A0 != i) {
            this.f24141A0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f24142B0 != colorFilter) {
            this.f24142B0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f24145D0 != colorStateList) {
            this.f24145D0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f24147E0 != mode) {
            this.f24147E0 = mode;
            this.f24143C0 = C10610a.m35929a(this, this.f24145D0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m27505j0()) {
            visible |= this.f24162M.setVisible(z, z2);
        }
        if (m27503i0()) {
            visible |= this.f24175Y.setVisible(z, z2);
        }
        if (m27506k0()) {
            visible |= this.f24168R.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t */
    public void mo31543t(int i) {
        mo31524m(this.f24187k0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public float mo31544u() {
        if (m27505j0() || m27503i0()) {
            return this.f24180d0 + this.f24165O + this.f24181e0;
        }
        return 0.0f;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public float mo31547v() {
        if (m27506k0()) {
            return this.f24184h0 + this.f24171U + this.f24185i0;
        }
        return 0.0f;
    }

    /* renamed from: w */
    public Drawable mo31549w() {
        return this.f24175Y;
    }

    /* renamed from: x */
    public ColorStateList mo31551x() {
        return this.f24176Z;
    }

    /* renamed from: y */
    public ColorStateList mo31553y() {
        return this.f24146E;
    }

    /* renamed from: z */
    public float mo31555z() {
        return this.f24163M0 ? mo36267n() : this.f24150G;
    }

    /* renamed from: A */
    public float mo31437A() {
        return this.f24186j0;
    }

    /* renamed from: B */
    public void mo31440B(int i) {
        mo31480b(C10592h.m35878a(this.f24187k0, i));
    }

    /* renamed from: C */
    public float mo31441C() {
        return this.f24165O;
    }

    /* renamed from: D */
    public void mo31444D(int i) {
        mo31534q(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: E */
    public void mo31446E(int i) {
        mo31536r(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: l */
    public void mo31522l(float f) {
        if (this.f24185i0 != f) {
            this.f24185i0 = f;
            invalidateSelf();
            if (m27506k0()) {
                mo31491d0();
            }
        }
    }

    /* renamed from: m */
    public void mo31524m(float f) {
        if (this.f24171U != f) {
            this.f24171U = f;
            invalidateSelf();
            if (m27506k0()) {
                mo31491d0();
            }
        }
    }

    /* renamed from: n */
    public void mo31526n(float f) {
        if (this.f24184h0 != f) {
            this.f24184h0 = f;
            invalidateSelf();
            if (m27506k0()) {
                mo31491d0();
            }
        }
    }

    /* renamed from: o */
    public void mo31528o(float f) {
        if (this.f24181e0 != f) {
            float u = mo31544u();
            this.f24181e0 = f;
            float u2 = mo31544u();
            invalidateSelf();
            if (u != u2) {
                mo31491d0();
            }
        }
    }

    /* renamed from: p */
    public void mo31532p(float f) {
        if (this.f24180d0 != f) {
            float u = mo31544u();
            this.f24180d0 = f;
            float u2 = mo31544u();
            invalidateSelf();
            if (u != u2) {
                mo31491d0();
            }
        }
    }

    /* renamed from: q */
    public void mo31534q(float f) {
        if (this.f24183g0 != f) {
            this.f24183g0 = f;
            invalidateSelf();
            mo31491d0();
        }
    }

    /* renamed from: w */
    public void mo31550w(int i) {
        mo31474a(C10592h.m35878a(this.f24187k0, i));
    }

    /* renamed from: x */
    public void mo31552x(int i) {
        mo31528o(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: y */
    public void mo31554y(int i) {
        mo31532p(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: z */
    public void mo31556z(int i) {
        this.f24161L0 = i;
    }

    /* renamed from: a */
    private void m27480a(AttributeSet attributeSet, int i, int i2) {
        TypedArray c = C8566j.m27997c(this.f24187k0, attributeSet, C10584l.Chip, i, i2, new int[0]);
        this.f24163M0 = c.hasValue(C10584l.Chip_shapeAppearance);
        m27504j(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_chipSurfaceColor));
        mo31489d(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_chipBackgroundColor));
        mo31514i(c.getDimension(C10584l.Chip_chipMinHeight, 0.0f));
        if (c.hasValue(C10584l.Chip_chipCornerRadius)) {
            mo31497f(c.getDimension(C10584l.Chip_chipCornerRadius, 0.0f));
        }
        mo31499f(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_chipStrokeColor));
        mo31520k(c.getDimension(C10584l.Chip_chipStrokeWidth, 0.0f));
        mo31513h(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_rippleColor));
        mo31479b(c.getText(C10584l.Chip_android_text));
        mo31475a(C10620c.m35960c(this.f24187k0, c, C10584l.Chip_android_textAppearance));
        int i3 = c.getInt(C10584l.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            mo31471a(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            mo31471a(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            mo31471a(TextUtils.TruncateAt.END);
        }
        mo31490d(c.getBoolean(C10584l.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo31490d(c.getBoolean(C10584l.Chip_chipIconEnabled, false));
        }
        mo31478b(C10620c.m35959b(this.f24187k0, c, C10584l.Chip_chipIcon));
        if (c.hasValue(C10584l.Chip_chipIconTint)) {
            mo31494e(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_chipIconTint));
        }
        mo31511h(c.getDimension(C10584l.Chip_chipIconSize, 0.0f));
        mo31495e(c.getBoolean(C10584l.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo31495e(c.getBoolean(C10584l.Chip_closeIconEnabled, false));
        }
        mo31485c(C10620c.m35959b(this.f24187k0, c, C10584l.Chip_closeIcon));
        mo31503g(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_closeIconTint));
        mo31524m(c.getDimension(C10584l.Chip_closeIconSize, 0.0f));
        mo31481b(c.getBoolean(C10584l.Chip_android_checkable, false));
        mo31486c(c.getBoolean(C10584l.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo31486c(c.getBoolean(C10584l.Chip_checkedIconEnabled, false));
        }
        mo31470a(C10620c.m35959b(this.f24187k0, c, C10584l.Chip_checkedIcon));
        if (c.hasValue(C10584l.Chip_checkedIconTint)) {
            mo31484c(C10620c.m35957a(this.f24187k0, c, C10584l.Chip_checkedIconTint));
        }
        mo31480b(C10592h.m35879a(this.f24187k0, c, C10584l.Chip_showMotionSpec));
        mo31474a(C10592h.m35879a(this.f24187k0, c, C10584l.Chip_hideMotionSpec));
        mo31518j(c.getDimension(C10584l.Chip_chipStartPadding, 0.0f));
        mo31532p(c.getDimension(C10584l.Chip_iconStartPadding, 0.0f));
        mo31528o(c.getDimension(C10584l.Chip_iconEndPadding, 0.0f));
        mo31536r(c.getDimension(C10584l.Chip_textStartPadding, 0.0f));
        mo31534q(c.getDimension(C10584l.Chip_textEndPadding, 0.0f));
        mo31526n(c.getDimension(C10584l.Chip_closeIconStartPadding, 0.0f));
        mo31522l(c.getDimension(C10584l.Chip_closeIconEndPadding, 0.0f));
        mo31501g(c.getDimension(C10584l.Chip_chipEndPadding, 0.0f));
        mo31556z(c.getDimensionPixelSize(C10584l.Chip_android_maxWidth, Integer.MAX_VALUE));
        c.recycle();
    }

    /* renamed from: u */
    public void mo31545u(int i) {
        mo31526n(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: v */
    public void mo31548v(int i) {
        mo31503g(C4800a.m7935b(this.f24187k0, i));
    }

    /* renamed from: j */
    public void mo31519j(int i) {
        mo31478b(C4800a.m7936c(this.f24187k0, i));
    }

    /* renamed from: g */
    private void m27497g(Canvas canvas, Rect rect) {
        this.f24188l0.setColor(this.f24199w0);
        this.f24188l0.setStyle(Paint.Style.FILL);
        this.f24191o0.set(rect);
        if (!this.f24163M0) {
            canvas.drawRoundRect(this.f24191o0, mo31555z(), mo31555z(), this.f24188l0);
            return;
        }
        mo36242a(new RectF(rect), this.f24193q0);
        super.mo36241a(canvas, this.f24188l0, this.f24193q0, mo36250d());
    }

    /* renamed from: j */
    public void mo31518j(float f) {
        if (this.f24179c0 != f) {
            this.f24179c0 = f;
            invalidateSelf();
            mo31491d0();
        }
    }

    /* renamed from: r */
    public void mo31537r(int i) {
        mo31522l(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: e */
    private void m27492e(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f24158K != null) {
            float u = this.f24179c0 + mo31544u() + this.f24182f0;
            float v = this.f24186j0 + mo31547v() + this.f24183g0;
            if (C0414a.m2025e(this) == 0) {
                rectF.left = ((float) rect.left) + u;
                rectF.right = ((float) rect.right) - v;
            } else {
                rectF.left = ((float) rect.left) + v;
                rectF.right = ((float) rect.right) - u;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: b */
    private void m27484b(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m27506k0()) {
            float f = this.f24186j0 + this.f24185i0 + this.f24171U + this.f24184h0 + this.f24183g0;
            if (C0414a.m2025e(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: k */
    public void mo31521k(int i) {
        mo31511h(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: c */
    private void m27487c(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27506k0()) {
            float f = this.f24186j0 + this.f24185i0;
            if (C0414a.m2025e(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f24171U;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f24171U;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f24171U;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: d */
    private void m27489d(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27506k0()) {
            float f = this.f24186j0 + this.f24185i0 + this.f24171U + this.f24184h0 + this.f24183g0;
            if (C0414a.m2025e(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: g */
    public void mo31502g(int i) {
        mo31489d(C4800a.m7935b(this.f24187k0, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f28509b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m27485b(p112n.p277e.p279b.p282b.p294w.C10621d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f28509b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C8482a.m27485b(n.e.b.b.w.d):boolean");
    }

    /* renamed from: f */
    private void m27495f(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: g */
    public void mo31503g(ColorStateList colorStateList) {
        if (this.f24170T != colorStateList) {
            this.f24170T = colorStateList;
            if (m27506k0()) {
                C0414a.m2014a(this.f24168R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Deprecated
    /* renamed from: f */
    public void mo31497f(float f) {
        if (this.f24150G != f) {
            this.f24150G = f;
            setShapeAppearanceModel(mo36264l().mo36283a(f));
        }
    }

    /* renamed from: b */
    public void mo31479b(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f24158K, charSequence)) {
            this.f24158K = charSequence;
            this.f24194r0.mo31947a(true);
            invalidateSelf();
            mo31491d0();
        }
    }

    /* renamed from: e */
    private static boolean m27493e(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: f */
    public void mo31499f(ColorStateList colorStateList) {
        if (this.f24152H != colorStateList) {
            this.f24152H = colorStateList;
            if (this.f24163M0) {
                mo36247b(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public void mo31494e(ColorStateList colorStateList) {
        this.f24166P = true;
        if (this.f24164N != colorStateList) {
            this.f24164N = colorStateList;
            if (m27505j0()) {
                C0414a.m2014a(this.f24162M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: g */
    public void mo31501g(float f) {
        if (this.f24186j0 != f) {
            this.f24186j0 = f;
            invalidateSelf();
            mo31491d0();
        }
    }

    /* renamed from: d */
    private void m27490d(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0414a.m2020a(drawable, C0414a.m2025e(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f24168R) {
                if (drawable.isStateful()) {
                    drawable.setState(mo31455N());
                }
                C0414a.m2014a(drawable, this.f24170T);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f24162M;
            if (drawable == drawable2 && this.f24166P) {
                C0414a.m2014a(drawable2, this.f24164N);
            }
        }
    }

    /* renamed from: c */
    public void mo31485c(Drawable drawable) {
        Drawable I = mo31450I();
        if (I != drawable) {
            float v = mo31547v();
            this.f24168R = drawable != null ? C0414a.m2029i(drawable).mutate() : null;
            if (C10629b.f28531a) {
                m27508m0();
            }
            float v2 = mo31547v();
            m27495f(I);
            if (m27506k0()) {
                m27490d(this.f24168R);
            }
            invalidateSelf();
            if (v != v2) {
                mo31491d0();
            }
        }
    }

    /* renamed from: i */
    private static boolean m27502i(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: b */
    public void mo31478b(Drawable drawable) {
        Drawable B = mo31439B();
        if (B != drawable) {
            float u = mo31544u();
            this.f24162M = drawable != null ? C0414a.m2029i(drawable).mutate() : null;
            float u2 = mo31544u();
            m27495f(B);
            if (m27505j0()) {
                m27490d(this.f24162M);
            }
            invalidateSelf();
            if (u != u2) {
                mo31491d0();
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public void mo31512h(int i) {
        mo31497f(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: h */
    public void mo31513h(ColorStateList colorStateList) {
        if (this.f24156J != colorStateList) {
            this.f24156J = colorStateList;
            m27507l0();
            onStateChange(getState());
        }
    }

    /* renamed from: i */
    public void mo31514i(float f) {
        if (this.f24148F != f) {
            this.f24148F = f;
            invalidateSelf();
            mo31491d0();
        }
    }

    /* renamed from: f */
    public void mo31498f(int i) {
        mo31486c(this.f24187k0.getResources().getBoolean(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo31500f(boolean z) {
        this.f24159K0 = z;
    }

    /* renamed from: e */
    public void mo31495e(boolean z) {
        if (this.f24167Q != z) {
            boolean k0 = m27506k0();
            this.f24167Q = z;
            boolean k02 = m27506k0();
            if (k0 != k02) {
                if (k02) {
                    m27490d(this.f24168R);
                } else {
                    m27495f(this.f24168R);
                }
                invalidateSelf();
                mo31491d0();
            }
        }
    }

    /* renamed from: h */
    public void mo31511h(float f) {
        if (this.f24165O != f) {
            float u = mo31544u();
            this.f24165O = f;
            float u2 = mo31544u();
            invalidateSelf();
            if (u != u2) {
                mo31491d0();
            }
        }
    }

    /* renamed from: i */
    public void mo31515i(int i) {
        mo31501g(this.f24187k0.getResources().getDimension(i));
    }

    /* renamed from: b */
    public void mo31481b(boolean z) {
        if (this.f24173W != z) {
            this.f24173W = z;
            float u = mo31544u();
            if (!z && this.f24201y0) {
                this.f24201y0 = false;
            }
            float u2 = mo31544u();
            invalidateSelf();
            if (u != u2) {
                mo31491d0();
            }
        }
    }

    /* renamed from: c */
    public void mo31483c(int i) {
        mo31481b(this.f24187k0.getResources().getBoolean(i));
    }

    /* renamed from: c */
    public void mo31486c(boolean z) {
        if (this.f24174X != z) {
            boolean i0 = m27503i0();
            this.f24174X = z;
            boolean i02 = m27503i0();
            if (i0 != i02) {
                if (i02) {
                    m27490d(this.f24175Y);
                } else {
                    m27495f(this.f24175Y);
                }
                invalidateSelf();
                mo31491d0();
            }
        }
    }

    /* renamed from: d */
    public void mo31489d(ColorStateList colorStateList) {
        if (this.f24146E != colorStateList) {
            this.f24146E = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: e */
    public void mo31493e(int i) {
        mo31484c(C4800a.m7935b(this.f24187k0, i));
    }

    /* renamed from: d */
    public void mo31490d(boolean z) {
        if (this.f24160L != z) {
            boolean j0 = m27505j0();
            this.f24160L = z;
            boolean j02 = m27505j0();
            if (j0 != j02) {
                if (j02) {
                    m27490d(this.f24162M);
                } else {
                    m27495f(this.f24162M);
                }
                invalidateSelf();
                mo31491d0();
            }
        }
    }

    /* renamed from: b */
    public void mo31480b(C10592h hVar) {
        this.f24177a0 = hVar;
    }

    /* renamed from: c */
    public void mo31484c(ColorStateList colorStateList) {
        if (this.f24176Z != colorStateList) {
            this.f24176Z = colorStateList;
            if (m27498g0()) {
                C0414a.m2014a(this.f24175Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d */
    public void mo31488d(int i) {
        mo31470a(C4800a.m7936c(this.f24187k0, i));
    }

    /* renamed from: a */
    public void mo31472a(C8483a aVar) {
        this.f24155I0 = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public void mo31469a(RectF rectF) {
        m27489d(getBounds(), rectF);
    }

    /* renamed from: a */
    private void m27478a(Canvas canvas, Rect rect) {
        if (m27503i0()) {
            m27479a(rect, this.f24191o0);
            RectF rectF = this.f24191o0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f24175Y.setBounds(0, 0, (int) this.f24191o0.width(), (int) this.f24191o0.height());
            this.f24175Y.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: a */
    private void m27479a(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27505j0() || m27503i0()) {
            float f = this.f24179c0 + this.f24180d0;
            if (C0414a.m2025e(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f24165O;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f24165O;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f24165O;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Paint.Align mo31468a(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f24158K != null) {
            float u = this.f24179c0 + mo31544u() + this.f24182f0;
            if (C0414a.m2025e(this) == 0) {
                pointF.x = ((float) rect.left) + u;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - u;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m27496f0();
        }
        return align;
    }

    /* renamed from: a */
    public boolean mo31476a(int[] iArr) {
        if (Arrays.equals(this.f24149F0, iArr)) {
            return false;
        }
        this.f24149F0 = iArr;
        if (m27506k0()) {
            return m27482a(getState(), iArr);
        }
        return false;
    }

    /* renamed from: a */
    public void mo30883a() {
        mo31491d0();
        invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m27482a(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f24144D
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f24195s0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f24195s0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f24195s0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f24146E
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f24196t0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f24196t0
            if (r5 == r3) goto L_0x002c
            r6.f24196t0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p112n.p277e.p279b.p282b.p288q.C10609a.m35922a((int) r1, (int) r3)
            int r3 = r6.f24197u0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo36254f()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.f24197u0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo36240a((android.content.res.ColorStateList) r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.f24152H
            if (r1 == 0) goto L_0x0058
            int r3 = r6.f24198v0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.f24198v0
            if (r3 == r1) goto L_0x0060
            r6.f24198v0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.f24153H0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p112n.p277e.p279b.p282b.p295x.C10629b.m35982a((int[]) r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.f24153H0
            int r3 = r6.f24199w0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.f24199w0
            if (r3 == r1) goto L_0x007f
            r6.f24199w0 = r1
            boolean r1 = r6.f24151G0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.h r1 = r6.f24194r0
            n.e.b.b.w.d r1 = r1.mo31943a()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.h r1 = r6.f24194r0
            n.e.b.b.w.d r1 = r1.mo31943a()
            android.content.res.ColorStateList r1 = r1.f28509b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.h r1 = r6.f24194r0
            n.e.b.b.w.d r1 = r1.mo31943a()
            android.content.res.ColorStateList r1 = r1.f28509b
            int r3 = r6.f24200x0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.f24200x0
            if (r3 == r1) goto L_0x00a8
            r6.f24200x0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m27481a((int[]) r1, (int) r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.f24173W
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.f24201y0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.f24175Y
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.mo31544u()
            r6.f24201y0 = r1
            float r1 = r6.mo31544u()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.f24145D0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.f24202z0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.f24202z0
            if (r5 == r3) goto L_0x00f4
            r6.f24202z0 = r3
            android.content.res.ColorStateList r0 = r6.f24145D0
            android.graphics.PorterDuff$Mode r3 = r6.f24147E0
            android.graphics.PorterDuffColorFilter r0 = p112n.p277e.p279b.p282b.p289r.C10610a.m35929a(r6, r0, r3)
            r6.f24143C0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.f24162M
            boolean r0 = m27493e((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.f24162M
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.f24175Y
            boolean r0 = m27493e((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.f24175Y
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.f24168R
            boolean r0 = m27493e((android.graphics.drawable.Drawable) r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f24168R
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = p112n.p277e.p279b.p282b.p295x.C10629b.f28531a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f24169S
            boolean r7 = m27493e((android.graphics.drawable.Drawable) r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f24169S
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.mo31491d0()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C8482a.m27482a(int[], int[]):boolean");
    }

    /* renamed from: a */
    private static boolean m27481a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo31475a(C10621d dVar) {
        this.f24194r0.mo31946a(dVar, this.f24187k0);
    }

    /* renamed from: a */
    public void mo31471a(TextUtils.TruncateAt truncateAt) {
        this.f24157J0 = truncateAt;
    }

    /* renamed from: a */
    public void mo31473a(CharSequence charSequence) {
        if (this.f24172V != charSequence) {
            this.f24172V = C4985a.m8840b().mo17412a(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo31470a(Drawable drawable) {
        if (this.f24175Y != drawable) {
            float u = mo31544u();
            this.f24175Y = drawable;
            float u2 = mo31544u();
            m27495f(this.f24175Y);
            m27490d(this.f24175Y);
            invalidateSelf();
            if (u != u2) {
                mo31491d0();
            }
        }
    }

    /* renamed from: a */
    public void mo31474a(C10592h hVar) {
        this.f24178b0 = hVar;
    }
}
