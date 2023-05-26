package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0414a;
import com.google.android.material.internal.C8556f;
import java.util.ArrayList;
import java.util.Iterator;
import p050l.p075h.p083k.C5008h;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10573a;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p283m.C10586b;
import p112n.p277e.p279b.p282b.p283m.C10590f;
import p112n.p277e.p279b.p282b.p283m.C10591g;
import p112n.p277e.p279b.p282b.p283m.C10592h;
import p112n.p277e.p279b.p282b.p295x.C10626a;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p296y.C10631b;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10642h;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: FloatingActionButtonImpl */
class C8529b {

    /* renamed from: F */
    static final TimeInterpolator f24348F = C10585a.f28458c;

    /* renamed from: G */
    static final int[] f24349G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f24350H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f24351I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f24352J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f24353K = {16842910};

    /* renamed from: L */
    static final int[] f24354L = new int[0];

    /* renamed from: A */
    private final Rect f24355A = new Rect();

    /* renamed from: B */
    private final RectF f24356B = new RectF();

    /* renamed from: C */
    private final RectF f24357C = new RectF();

    /* renamed from: D */
    private final Matrix f24358D = new Matrix();

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f24359E;

    /* renamed from: a */
    C10645k f24360a;

    /* renamed from: b */
    C10638g f24361b;

    /* renamed from: c */
    Drawable f24362c;

    /* renamed from: d */
    C8526a f24363d;

    /* renamed from: e */
    Drawable f24364e;

    /* renamed from: f */
    boolean f24365f;

    /* renamed from: g */
    boolean f24366g = true;

    /* renamed from: h */
    float f24367h;

    /* renamed from: i */
    float f24368i;

    /* renamed from: j */
    float f24369j;

    /* renamed from: k */
    int f24370k;

    /* renamed from: l */
    private final C8556f f24371l;

    /* renamed from: m */
    private C10592h f24372m;

    /* renamed from: n */
    private C10592h f24373n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Animator f24374o;

    /* renamed from: p */
    private C10592h f24375p;

    /* renamed from: q */
    private C10592h f24376q;

    /* renamed from: r */
    private float f24377r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f24378s = 1.0f;

    /* renamed from: t */
    private int f24379t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f24380u = 0;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f24381v;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f24382w;

    /* renamed from: x */
    private ArrayList<C8538i> f24383x;

    /* renamed from: y */
    final FloatingActionButton f24384y;

    /* renamed from: z */
    final C10631b f24385z;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* compiled from: FloatingActionButtonImpl */
    class C8530a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f24386a;

        /* renamed from: b */
        final /* synthetic */ boolean f24387b;

        /* renamed from: c */
        final /* synthetic */ C8539j f24388c;

        C8530a(boolean z, C8539j jVar) {
            this.f24387b = z;
            this.f24388c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f24386a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C8529b.this.f24380u = 0;
            Animator unused2 = C8529b.this.f24374o = null;
            if (!this.f24386a) {
                C8529b.this.f24384y.mo31954a(this.f24387b ? 8 : 4, this.f24387b);
                C8539j jVar = this.f24388c;
                if (jVar != null) {
                    jVar.mo31743b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C8529b.this.f24384y.mo31954a(0, this.f24387b);
            int unused = C8529b.this.f24380u = 1;
            Animator unused2 = C8529b.this.f24374o = animator;
            this.f24386a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    /* compiled from: FloatingActionButtonImpl */
    class C8531b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24390a;

        /* renamed from: b */
        final /* synthetic */ C8539j f24391b;

        C8531b(boolean z, C8539j jVar) {
            this.f24390a = z;
            this.f24391b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C8529b.this.f24380u = 0;
            Animator unused2 = C8529b.this.f24374o = null;
            C8539j jVar = this.f24391b;
            if (jVar != null) {
                jVar.mo31742a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C8529b.this.f24384y.mo31954a(0, this.f24390a);
            int unused = C8529b.this.f24380u = 2;
            Animator unused2 = C8529b.this.f24374o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    /* compiled from: FloatingActionButtonImpl */
    class C8532c extends C10591g {
        C8532c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C8529b.this.f24378s = f;
            return super.mo31822a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    /* compiled from: FloatingActionButtonImpl */
    class C8533d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f24394a = new FloatEvaluator();

        C8533d(C8529b bVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f24394a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    /* compiled from: FloatingActionButtonImpl */
    class C8534e implements ViewTreeObserver.OnPreDrawListener {
        C8534e() {
        }

        public boolean onPreDraw() {
            C8529b.this.mo31808p();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C8535f extends C8541l {
        C8535f(C8529b bVar) {
            super(bVar, (C8530a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31827a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    /* compiled from: FloatingActionButtonImpl */
    private class C8536g extends C8541l {
        C8536g() {
            super(C8529b.this, (C8530a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31827a() {
            C8529b bVar = C8529b.this;
            return bVar.f24367h + bVar.f24368i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C8537h extends C8541l {
        C8537h() {
            super(C8529b.this, (C8530a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31827a() {
            C8529b bVar = C8529b.this;
            return bVar.f24367h + bVar.f24369j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    /* compiled from: FloatingActionButtonImpl */
    interface C8538i {
        /* renamed from: a */
        void mo31747a();

        /* renamed from: b */
        void mo31748b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    /* compiled from: FloatingActionButtonImpl */
    interface C8539j {
        /* renamed from: a */
        void mo31742a();

        /* renamed from: b */
        void mo31743b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    /* compiled from: FloatingActionButtonImpl */
    private class C8540k extends C8541l {
        C8540k() {
            super(C8529b.this, (C8530a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo31827a() {
            return C8529b.this.f24367h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C8541l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f24399a;

        /* renamed from: b */
        private float f24400b;

        /* renamed from: c */
        private float f24401c;

        private C8541l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo31827a();

        public void onAnimationEnd(Animator animator) {
            C8529b.this.mo31797e((float) ((int) this.f24401c));
            this.f24399a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f24399a) {
                C10638g gVar = C8529b.this.f24361b;
                this.f24400b = gVar == null ? 0.0f : gVar.mo36252e();
                this.f24401c = mo31827a();
                this.f24399a = true;
            }
            C8529b bVar = C8529b.this;
            float f = this.f24400b;
            bVar.mo31797e((float) ((int) (f + ((this.f24401c - f) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ C8541l(C8529b bVar, C8530a aVar) {
            this();
        }
    }

    C8529b(FloatingActionButton floatingActionButton, C10631b bVar) {
        this.f24384y = floatingActionButton;
        this.f24385z = bVar;
        C8556f fVar = new C8556f();
        this.f24371l = fVar;
        fVar.mo31934a(f24349G, m27787a((C8541l) new C8537h()));
        this.f24371l.mo31934a(f24350H, m27787a((C8541l) new C8536g()));
        this.f24371l.mo31934a(f24351I, m27787a((C8541l) new C8536g()));
        this.f24371l.mo31934a(f24352J, m27787a((C8541l) new C8536g()));
        this.f24371l.mo31934a(f24353K, m27787a((C8541l) new C8540k()));
        this.f24371l.mo31934a(f24354L, m27787a((C8541l) new C8535f(this)));
        this.f24377r = this.f24384y.getRotation();
    }

    /* renamed from: A */
    private ViewTreeObserver.OnPreDrawListener m27781A() {
        if (this.f24359E == null) {
            this.f24359E = new C8534e();
        }
        return this.f24359E;
    }

    /* renamed from: B */
    private boolean m27782B() {
        return C5071v.m9140E(this.f24384y) && !this.f24384y.isInEditMode();
    }

    /* renamed from: y */
    private C10592h m27790y() {
        if (this.f24373n == null) {
            this.f24373n = C10592h.m35878a(this.f24384y.getContext(), C10573a.design_fab_hide_motion_spec);
        }
        C10592h hVar = this.f24373n;
        C5008h.m8899a(hVar);
        return hVar;
    }

    /* renamed from: z */
    private C10592h m27791z() {
        if (this.f24372m == null) {
            this.f24372m = C10592h.m35878a(this.f24384y.getContext(), C10573a.design_fab_show_motion_spec);
        }
        C10592h hVar = this.f24372m;
        C5008h.m8899a(hVar);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31785b(int i) {
        this.f24370k = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo31792c() {
        return this.f24367h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31794d(float f) {
        if (this.f24369j != f) {
            this.f24369j = f;
            mo31770a(this.f24367h, this.f24368i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C10592h mo31796e() {
        return this.f24376q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo31798f() {
        return this.f24368i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo31799g() {
        return this.f24369j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C10645k mo31800h() {
        return this.f24360a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C10592h mo31801i() {
        return this.f24375p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo31802j() {
        if (this.f24384y.getVisibility() == 0) {
            if (this.f24380u == 1) {
                return true;
            }
            return false;
        } else if (this.f24380u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo31803k() {
        if (this.f24384y.getVisibility() != 0) {
            if (this.f24380u == 2) {
                return true;
            }
            return false;
        } else if (this.f24380u != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo31804l() {
        this.f24371l.mo31932a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo31805m() {
        C10638g gVar = this.f24361b;
        if (gVar != null) {
            C10642h.m36068a((View) this.f24384y, gVar);
        }
        if (mo31811s()) {
            this.f24384y.getViewTreeObserver().addOnPreDrawListener(m27781A());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo31806n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo31807o() {
        ViewTreeObserver viewTreeObserver = this.f24384y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f24359E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f24359E = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo31808p() {
        float rotation = this.f24384y.getRotation();
        if (this.f24377r != rotation) {
            this.f24377r = rotation;
            mo31814v();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo31809q() {
        ArrayList<C8538i> arrayList = this.f24383x;
        if (arrayList != null) {
            Iterator<C8538i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo31748b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo31810r() {
        ArrayList<C8538i> arrayList = this.f24383x;
        if (arrayList != null) {
            Iterator<C8538i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo31747a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo31811s() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo31812t() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo31813u() {
        return !this.f24365f || this.f24384y.getSizeDimension() >= this.f24370k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo31814v() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f24377r % 90.0f != 0.0f) {
                if (this.f24384y.getLayerType() != 1) {
                    this.f24384y.setLayerType(1, (Paint) null);
                }
            } else if (this.f24384y.getLayerType() != 0) {
                this.f24384y.setLayerType(0, (Paint) null);
            }
        }
        C10638g gVar = this.f24361b;
        if (gVar != null) {
            gVar.mo36246b((int) this.f24377r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo31815w() {
        mo31793c(this.f24378s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo31816x() {
        Rect rect = this.f24355A;
        mo31776a(rect);
        mo31788b(rect);
        this.f24385z.mo31744a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31787b(ColorStateList colorStateList) {
        Drawable drawable = this.f24362c;
        if (drawable != null) {
            C0414a.m2014a(drawable, C10629b.m35983b(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo31793c(float f) {
        this.f24378s = f;
        Matrix matrix = this.f24358D;
        m27788a(f, matrix);
        this.f24384y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo31797e(float f) {
        C10638g gVar = this.f24361b;
        if (gVar != null) {
            gVar.mo36245b(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31774a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C10638g a = mo31768a();
        this.f24361b = a;
        a.setTintList(colorStateList);
        if (mode != null) {
            this.f24361b.setTintMode(mode);
        }
        this.f24361b.mo36237a(-12303292);
        this.f24361b.mo36239a(this.f24384y.getContext());
        C10626a aVar = new C10626a(this.f24361b.mo36264l());
        aVar.setTintList(C10629b.m35983b(colorStateList2));
        this.f24362c = aVar;
        C10638g gVar = this.f24361b;
        C5008h.m8899a(gVar);
        this.f24364e = new LayerDrawable(new Drawable[]{gVar, aVar});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo31795d() {
        return this.f24365f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31784b(float f) {
        if (this.f24368i != f) {
            this.f24368i = f;
            mo31770a(this.f24367h, f, this.f24369j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31790b(C10592h hVar) {
        this.f24375p = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31791b(boolean z) {
        this.f24366g = z;
        mo31816x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31786b(Animator.AnimatorListener animatorListener) {
        if (this.f24381v == null) {
            this.f24381v = new ArrayList<>();
        }
        this.f24381v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31789b(C8539j jVar, boolean z) {
        if (!mo31803k()) {
            Animator animator = this.f24374o;
            if (animator != null) {
                animator.cancel();
            }
            if (m27782B()) {
                if (this.f24384y.getVisibility() != 0) {
                    this.f24384y.setAlpha(0.0f);
                    this.f24384y.setScaleY(0.0f);
                    this.f24384y.setScaleX(0.0f);
                    mo31793c(0.0f);
                }
                C10592h hVar = this.f24375p;
                if (hVar == null) {
                    hVar = m27791z();
                }
                AnimatorSet a = m27786a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C8531b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f24381v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f24384y.mo31954a(0, z);
            this.f24384y.setAlpha(1.0f);
            this.f24384y.setScaleY(1.0f);
            this.f24384y.setScaleX(1.0f);
            mo31793c(1.0f);
            if (jVar != null) {
                jVar.mo31742a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31773a(ColorStateList colorStateList) {
        C10638g gVar = this.f24361b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        C8526a aVar = this.f24363d;
        if (aVar != null) {
            aVar.mo31754a(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31775a(PorterDuff.Mode mode) {
        C10638g gVar = this.f24361b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31769a(float f) {
        if (this.f24367h != f) {
            this.f24367h = f;
            mo31770a(f, this.f24368i, this.f24369j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31771a(int i) {
        if (this.f24379t != i) {
            this.f24379t = i;
            mo31815w();
        }
    }

    /* renamed from: a */
    private void m27788a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f24384y.getDrawable();
        if (drawable != null && this.f24379t != 0) {
            RectF rectF = this.f24356B;
            RectF rectF2 = this.f24357C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f24379t;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f24379t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31780a(C10645k kVar) {
        this.f24360a = kVar;
        C10638g gVar = this.f24361b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f24362c;
        if (drawable instanceof C10660n) {
            ((C10660n) drawable).setShapeAppearanceModel(kVar);
        }
        C8526a aVar = this.f24363d;
        if (aVar != null) {
            aVar.mo31755a(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Drawable mo31783b() {
        return this.f24364e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31788b(Rect rect) {
        C5008h.m8900a(this.f24364e, (Object) "Didn't initialize content background");
        if (mo31812t()) {
            this.f24385z.mo31745a(new InsetDrawable(this.f24364e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f24385z.mo31745a(this.f24364e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo31779a(C10592h hVar) {
        this.f24376q = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31781a(boolean z) {
        this.f24365f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31770a(float f, float f2, float f3) {
        mo31816x();
        mo31797e(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31782a(int[] iArr) {
        this.f24371l.mo31933a(iArr);
    }

    /* renamed from: a */
    public void mo31772a(Animator.AnimatorListener animatorListener) {
        if (this.f24382w == null) {
            this.f24382w = new ArrayList<>();
        }
        this.f24382w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31778a(C8539j jVar, boolean z) {
        if (!mo31802j()) {
            Animator animator = this.f24374o;
            if (animator != null) {
                animator.cancel();
            }
            if (m27782B()) {
                C10592h hVar = this.f24376q;
                if (hVar == null) {
                    hVar = m27790y();
                }
                AnimatorSet a = m27786a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C8530a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f24382w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener(it.next());
                    }
                }
                a.start();
                return;
            }
            this.f24384y.mo31954a(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo31743b();
            }
        }
    }

    /* renamed from: a */
    private AnimatorSet m27786a(C10592h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f24384y, View.ALPHA, new float[]{f});
        hVar.mo36136a("opacity").mo36144a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f24384y, View.SCALE_X, new float[]{f2});
        hVar.mo36136a("scale").mo36144a((Animator) ofFloat2);
        m27789a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f24384y, View.SCALE_Y, new float[]{f2});
        hVar.mo36136a("scale").mo36144a((Animator) ofFloat3);
        m27789a(ofFloat3);
        arrayList.add(ofFloat3);
        m27788a(f3, this.f24358D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f24384y, new C10590f(), new C8532c(), new Matrix[]{new Matrix(this.f24358D)});
        hVar.mo36136a("iconScale").mo36144a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C10586b.m35868a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private void m27789a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C8533d(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31777a(C8538i iVar) {
        if (this.f24383x == null) {
            this.f24383x = new ArrayList<>();
        }
        this.f24383x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31776a(Rect rect) {
        int sizeDimension = this.f24365f ? (this.f24370k - this.f24384y.getSizeDimension()) / 2 : 0;
        float c = this.f24366g ? mo31792c() + this.f24369j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) c));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (c * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10638g mo31768a() {
        C10645k kVar = this.f24360a;
        C5008h.m8899a(kVar);
        return new C10638g(kVar);
    }

    /* renamed from: a */
    private ValueAnimator m27787a(C8541l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f24348F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }
}
