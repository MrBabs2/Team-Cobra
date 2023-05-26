package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.C0414a;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p297z.C10635d;
import p112n.p277e.p279b.p282b.p297z.C10636e;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10644j;
import p112n.p277e.p279b.p282b.p297z.C10645k;

/* renamed from: com.google.android.material.card.a */
/* compiled from: MaterialCardViewHelper */
class C8472a {

    /* renamed from: t */
    private static final int[] f24082t = {16842912};

    /* renamed from: u */
    private static final double f24083u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    private final MaterialCardView f24084a;

    /* renamed from: b */
    private final Rect f24085b = new Rect();

    /* renamed from: c */
    private final C10638g f24086c;

    /* renamed from: d */
    private final C10638g f24087d;

    /* renamed from: e */
    private final int f24088e;

    /* renamed from: f */
    private final int f24089f;

    /* renamed from: g */
    private int f24090g;

    /* renamed from: h */
    private Drawable f24091h;

    /* renamed from: i */
    private Drawable f24092i;

    /* renamed from: j */
    private ColorStateList f24093j;

    /* renamed from: k */
    private ColorStateList f24094k;

    /* renamed from: l */
    private C10645k f24095l;

    /* renamed from: m */
    private ColorStateList f24096m;

    /* renamed from: n */
    private Drawable f24097n;

    /* renamed from: o */
    private LayerDrawable f24098o;

    /* renamed from: p */
    private C10638g f24099p;

    /* renamed from: q */
    private C10638g f24100q;

    /* renamed from: r */
    private boolean f24101r = false;

    /* renamed from: s */
    private boolean f24102s;

    /* renamed from: com.google.android.material.card.a$a */
    /* compiled from: MaterialCardViewHelper */
    class C8473a extends InsetDrawable {
        C8473a(C8472a aVar, Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public C8472a(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f24084a = materialCardView;
        C10638g gVar = new C10638g(materialCardView.getContext(), attributeSet, i, i2);
        this.f24086c = gVar;
        gVar.mo36239a(materialCardView.getContext());
        this.f24086c.mo36237a(-12303292);
        C10645k.C10647b m = this.f24086c.mo36264l().mo36297m();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C10584l.CardView, i, C10583k.CardView);
        if (obtainStyledAttributes.hasValue(C10584l.CardView_cardCornerRadius)) {
            m.mo36298a(obtainStyledAttributes.getDimension(C10584l.CardView_cardCornerRadius, 0.0f));
        }
        this.f24087d = new C10638g();
        mo31225a(m.mo36302a());
        Resources resources = materialCardView.getResources();
        this.f24088e = resources.getDimensionPixelSize(C10576d.mtrl_card_checked_icon_margin);
        this.f24089f = resources.getDimensionPixelSize(C10576d.mtrl_card_checked_icon_size);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    private Drawable m27372A() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C10638g C = m27374C();
        this.f24099p = C;
        C.mo36240a(this.f24093j);
        stateListDrawable.addState(new int[]{16842919}, this.f24099p);
        return stateListDrawable;
    }

    /* renamed from: B */
    private Drawable m27373B() {
        if (!C10629b.f28531a) {
            return m27372A();
        }
        this.f24100q = m27374C();
        return new RippleDrawable(this.f24093j, (Drawable) null, this.f24100q);
    }

    /* renamed from: C */
    private C10638g m27374C() {
        return new C10638g(this.f24095l);
    }

    /* renamed from: D */
    private Drawable m27375D() {
        if (this.f24097n == null) {
            this.f24097n = m27373B();
        }
        if (this.f24098o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f24097n, this.f24087d, m27387z()});
            this.f24098o = layerDrawable;
            layerDrawable.setId(2, C10578f.mtrl_card_checked_layer_id);
        }
        return this.f24098o;
    }

    /* renamed from: E */
    private float m27376E() {
        if (!this.f24084a.getPreventCornerOverlap()) {
            return 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 21 && !this.f24084a.getUseCompatPadding()) {
            return 0.0f;
        }
        double d = 1.0d - f24083u;
        double cardViewRadius = (double) this.f24084a.getCardViewRadius();
        Double.isNaN(cardViewRadius);
        return (float) (d * cardViewRadius);
    }

    /* renamed from: F */
    private boolean m27377F() {
        return this.f24084a.getPreventCornerOverlap() && !m27386y();
    }

    /* renamed from: G */
    private boolean m27378G() {
        return this.f24084a.getPreventCornerOverlap() && m27386y() && this.f24084a.getUseCompatPadding();
    }

    /* renamed from: H */
    private void m27379H() {
        Drawable drawable;
        if (!C10629b.f28531a || (drawable = this.f24097n) == null) {
            C10638g gVar = this.f24099p;
            if (gVar != null) {
                gVar.mo36240a(this.f24093j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f24093j);
    }

    /* renamed from: v */
    private float m27383v() {
        return Math.max(Math.max(m27380a(this.f24095l.mo36293i(), this.f24086c.mo36267n()), m27380a(this.f24095l.mo36295k(), this.f24086c.mo36268o())), Math.max(m27380a(this.f24095l.mo36288d(), this.f24086c.mo36248c()), m27380a(this.f24095l.mo36286b(), this.f24086c.mo36244b())));
    }

    /* renamed from: w */
    private float m27384w() {
        return this.f24084a.getMaxCardElevation() + (m27378G() ? m27383v() : 0.0f);
    }

    /* renamed from: x */
    private float m27385x() {
        return (this.f24084a.getMaxCardElevation() * 1.5f) + (m27378G() ? m27383v() : 0.0f);
    }

    /* renamed from: y */
    private boolean m27386y() {
        return Build.VERSION.SDK_INT >= 21 && this.f24086c.mo36273s();
    }

    /* renamed from: z */
    private Drawable m27387z() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f24092i;
        if (drawable != null) {
            stateListDrawable.addState(f24082t, drawable);
        }
        return stateListDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31223a(TypedArray typedArray) {
        ColorStateList a = C10620c.m35957a(this.f24084a.getContext(), typedArray, C10584l.MaterialCardView_strokeColor);
        this.f24096m = a;
        if (a == null) {
            this.f24096m = ColorStateList.valueOf(-1);
        }
        this.f24090g = typedArray.getDimensionPixelSize(C10584l.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(C10584l.MaterialCardView_android_checkable, false);
        this.f24102s = z;
        this.f24084a.setLongClickable(z);
        this.f24094k = C10620c.m35957a(this.f24084a.getContext(), typedArray, C10584l.MaterialCardView_checkedIconTint);
        mo31224a(C10620c.m35959b(this.f24084a.getContext(), typedArray, C10584l.MaterialCardView_checkedIcon));
        ColorStateList a2 = C10620c.m35957a(this.f24084a.getContext(), typedArray, C10584l.MaterialCardView_rippleColor);
        this.f24093j = a2;
        if (a2 == null) {
            this.f24093j = ColorStateList.valueOf(C10609a.m35926a((View) this.f24084a, C10574b.colorControlHighlight));
        }
        mo31229b(C10620c.m35957a(this.f24084a.getContext(), typedArray, C10584l.MaterialCardView_cardForegroundColor));
        m27379H();
        mo31250s();
        mo31252u();
        this.f24084a.setBackgroundInternal(m27381b((Drawable) this.f24086c));
        Drawable D = this.f24084a.isClickable() ? m27375D() : this.f24087d;
        this.f24091h = D;
        this.f24084a.setForeground(m27381b(D));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10638g mo31227b() {
        return this.f24086c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo31231c() {
        return this.f24086c.mo36254f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo31233d() {
        return this.f24087d.mo36254f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo31236e(ColorStateList colorStateList) {
        if (this.f24096m != colorStateList) {
            this.f24096m = colorStateList;
            mo31252u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo31237f() {
        return this.f24094k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo31238g() {
        return this.f24086c.mo36267n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo31239h() {
        return this.f24086c.mo36255g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ColorStateList mo31240i() {
        return this.f24093j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10645k mo31241j() {
        return this.f24095l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo31242k() {
        ColorStateList colorStateList = this.f24096m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public ColorStateList mo31243l() {
        return this.f24096m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo31244m() {
        return this.f24090g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Rect mo31245n() {
        return this.f24085b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo31246o() {
        return this.f24101r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo31247p() {
        return this.f24102s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo31248q() {
        Drawable drawable = this.f24091h;
        Drawable D = this.f24084a.isClickable() ? m27375D() : this.f24087d;
        this.f24091h = D;
        if (drawable != D) {
            m27382c(D);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo31249r() {
        int v = (int) ((m27377F() || m27378G() ? m27383v() : 0.0f) - m27376E());
        MaterialCardView materialCardView = this.f24084a;
        Rect rect = this.f24085b;
        materialCardView.mo31179b(rect.left + v, rect.top + v, rect.right + v, rect.bottom + v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo31250s() {
        this.f24086c.mo36245b(this.f24084a.getCardElevation());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo31251t() {
        if (!mo31246o()) {
            this.f24084a.setBackgroundInternal(m27381b((Drawable) this.f24086c));
        }
        this.f24084a.setForeground(m27381b(this.f24091h));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo31252u() {
        this.f24087d.mo36236a((float) this.f24090g, this.f24096m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31229b(ColorStateList colorStateList) {
        C10638g gVar = this.f24087d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.mo36240a(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31232c(ColorStateList colorStateList) {
        this.f24094k = colorStateList;
        Drawable drawable = this.f24092i;
        if (drawable != null) {
            C0414a.m2014a(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo31234d(ColorStateList colorStateList) {
        this.f24093j = colorStateList;
        m27379H();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable mo31235e() {
        return this.f24092i;
    }

    /* renamed from: c */
    private void m27382c(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f24084a.getForeground() instanceof InsetDrawable)) {
            this.f24084a.setForeground(m27381b(drawable));
        } else {
            ((InsetDrawable) this.f24084a.getForeground()).setDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31228b(float f) {
        this.f24086c.mo36249c(f);
        C10638g gVar = this.f24087d;
        if (gVar != null) {
            gVar.mo36249c(f);
        }
        C10638g gVar2 = this.f24100q;
        if (gVar2 != null) {
            gVar2.mo36249c(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31230b(boolean z) {
        this.f24102s = z;
    }

    /* renamed from: b */
    private Drawable m27381b(Drawable drawable) {
        int i;
        int i2;
        if ((Build.VERSION.SDK_INT < 21) || this.f24084a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) m27385x());
            i2 = (int) Math.ceil((double) m27384w());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C8473a(this, drawable, i2, i, i2, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31226a(boolean z) {
        this.f24101r = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31219a(int i) {
        if (i != this.f24090g) {
            this.f24090g = i;
            mo31252u();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31222a(ColorStateList colorStateList) {
        this.f24086c.mo36240a(colorStateList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31221a(int i, int i2, int i3, int i4) {
        this.f24085b.set(i, i2, i3, i4);
        mo31249r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31218a(float f) {
        mo31225a(this.f24095l.mo36283a(f));
        this.f24091h.invalidateSelf();
        if (m27378G() || m27377F()) {
            mo31249r();
        }
        if (m27378G()) {
            mo31251t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31224a(Drawable drawable) {
        this.f24092i = drawable;
        if (drawable != null) {
            Drawable i = C0414a.m2029i(drawable.mutate());
            this.f24092i = i;
            C0414a.m2014a(i, this.f24094k);
        }
        if (this.f24098o != null) {
            this.f24098o.setDrawableByLayerId(C10578f.mtrl_card_checked_layer_id, m27387z());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31220a(int i, int i2) {
        int i3;
        int i4;
        if (this.f24098o != null) {
            int i5 = this.f24088e;
            int i6 = this.f24089f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if ((Build.VERSION.SDK_INT < 21) || this.f24084a.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (m27385x() * 2.0f));
                i7 -= (int) Math.ceil((double) (m27384w() * 2.0f));
            }
            int i9 = i8;
            int i10 = this.f24088e;
            if (C5071v.m9204p(this.f24084a) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            this.f24098o.setLayerInset(2, i4, this.f24088e, i3, i9);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31217a() {
        Drawable drawable = this.f24097n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f24097n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f24097n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31225a(C10645k kVar) {
        this.f24095l = kVar;
        this.f24086c.setShapeAppearanceModel(kVar);
        C10638g gVar = this.f24086c;
        gVar.mo36243a(!gVar.mo36273s());
        C10638g gVar2 = this.f24087d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        C10638g gVar3 = this.f24100q;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        C10638g gVar4 = this.f24099p;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: a */
    private float m27380a(C10635d dVar, float f) {
        if (dVar instanceof C10644j) {
            double d = (double) f;
            Double.isNaN(d);
            return (float) ((1.0d - f24083u) * d);
        } else if (dVar instanceof C10636e) {
            return f / 2.0f;
        } else {
            return 0.0f;
        }
    }
}
