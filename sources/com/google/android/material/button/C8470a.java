package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.graphics.drawable.C0414a;
import com.google.android.material.internal.C8567k;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p295x.C10626a;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

/* renamed from: com.google.android.material.button.a */
/* compiled from: MaterialButtonHelper */
class C8470a {

    /* renamed from: s */
    private static final boolean f24054s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f24055a;

    /* renamed from: b */
    private C10645k f24056b;

    /* renamed from: c */
    private int f24057c;

    /* renamed from: d */
    private int f24058d;

    /* renamed from: e */
    private int f24059e;

    /* renamed from: f */
    private int f24060f;

    /* renamed from: g */
    private int f24061g;

    /* renamed from: h */
    private int f24062h;

    /* renamed from: i */
    private PorterDuff.Mode f24063i;

    /* renamed from: j */
    private ColorStateList f24064j;

    /* renamed from: k */
    private ColorStateList f24065k;

    /* renamed from: l */
    private ColorStateList f24066l;

    /* renamed from: m */
    private Drawable f24067m;

    /* renamed from: n */
    private boolean f24068n = false;

    /* renamed from: o */
    private boolean f24069o = false;

    /* renamed from: p */
    private boolean f24070p = false;

    /* renamed from: q */
    private boolean f24071q;

    /* renamed from: r */
    private LayerDrawable f24072r;

    C8470a(MaterialButton materialButton, C10645k kVar) {
        this.f24055a = materialButton;
        this.f24056b = kVar;
    }

    /* renamed from: m */
    private Drawable m27339m() {
        C10638g gVar = new C10638g(this.f24056b);
        gVar.mo36239a(this.f24055a.getContext());
        C0414a.m2014a((Drawable) gVar, this.f24064j);
        PorterDuff.Mode mode = this.f24063i;
        if (mode != null) {
            C0414a.m2017a((Drawable) gVar, mode);
        }
        gVar.mo36236a((float) this.f24062h, this.f24065k);
        C10638g gVar2 = new C10638g(this.f24056b);
        gVar2.setTint(0);
        gVar2.mo36235a((float) this.f24062h, this.f24068n ? C10609a.m35926a((View) this.f24055a, C10574b.colorSurface) : 0);
        if (f24054s) {
            C10638g gVar3 = new C10638g(this.f24056b);
            this.f24067m = gVar3;
            C0414a.m2022b(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C10629b.m35983b(this.f24066l), m27336a((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f24067m);
            this.f24072r = rippleDrawable;
            return rippleDrawable;
        }
        C10626a aVar = new C10626a(this.f24056b);
        this.f24067m = aVar;
        C0414a.m2014a((Drawable) aVar, C10629b.m35983b(this.f24066l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f24067m});
        this.f24072r = layerDrawable;
        return m27336a((Drawable) layerDrawable);
    }

    /* renamed from: n */
    private C10638g m27340n() {
        return m27338c(true);
    }

    /* renamed from: o */
    private void m27341o() {
        C10638g c = mo31167c();
        C10638g n = m27340n();
        if (c != null) {
            c.mo36236a((float) this.f24062h, this.f24065k);
            if (n != null) {
                n.mo36235a((float) this.f24062h, this.f24068n ? C10609a.m35926a((View) this.f24055a, C10574b.colorSurface) : 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31159a(TypedArray typedArray) {
        this.f24057c = typedArray.getDimensionPixelOffset(C10584l.MaterialButton_android_insetLeft, 0);
        this.f24058d = typedArray.getDimensionPixelOffset(C10584l.MaterialButton_android_insetRight, 0);
        this.f24059e = typedArray.getDimensionPixelOffset(C10584l.MaterialButton_android_insetTop, 0);
        this.f24060f = typedArray.getDimensionPixelOffset(C10584l.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(C10584l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(C10584l.MaterialButton_cornerRadius, -1);
            this.f24061g = dimensionPixelSize;
            mo31161a(this.f24056b.mo36283a((float) dimensionPixelSize));
            this.f24070p = true;
        }
        this.f24062h = typedArray.getDimensionPixelSize(C10584l.MaterialButton_strokeWidth, 0);
        this.f24063i = C8567k.m28001a(typedArray.getInt(C10584l.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f24064j = C10620c.m35957a(this.f24055a.getContext(), typedArray, C10584l.MaterialButton_backgroundTint);
        this.f24065k = C10620c.m35957a(this.f24055a.getContext(), typedArray, C10584l.MaterialButton_strokeColor);
        this.f24066l = C10620c.m35957a(this.f24055a.getContext(), typedArray, C10584l.MaterialButton_rippleColor);
        this.f24071q = typedArray.getBoolean(C10584l.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C10584l.MaterialButton_elevation, 0);
        int u = C5071v.m9209u(this.f24055a);
        int paddingTop = this.f24055a.getPaddingTop();
        int t = C5071v.m9208t(this.f24055a);
        int paddingBottom = this.f24055a.getPaddingBottom();
        if (typedArray.hasValue(C10584l.MaterialButton_android_background)) {
            mo31178l();
        } else {
            this.f24055a.setInternalBackground(m27339m());
            C10638g c = mo31167c();
            if (c != null) {
                c.mo36245b((float) dimensionPixelSize2);
            }
        }
        C5071v.m9156a(this.f24055a, u + this.f24057c, paddingTop + this.f24059e, t + this.f24058d, paddingBottom + this.f24060f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31166b(boolean z) {
        this.f24068n = z;
        m27341o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31169c(ColorStateList colorStateList) {
        if (this.f24064j != colorStateList) {
            this.f24064j = colorStateList;
            if (mo31167c() != null) {
                C0414a.m2014a((Drawable) mo31167c(), this.f24064j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo31170d() {
        return this.f24066l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C10645k mo31171e() {
        return this.f24056b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo31172f() {
        return this.f24065k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo31173g() {
        return this.f24062h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo31174h() {
        return this.f24064j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public PorterDuff.Mode mo31175i() {
        return this.f24063i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo31176j() {
        return this.f24069o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo31177k() {
        return this.f24071q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo31178l() {
        this.f24069o = true;
        this.f24055a.setSupportBackgroundTintList(this.f24064j);
        this.f24055a.setSupportBackgroundTintMode(this.f24063i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31165b(ColorStateList colorStateList) {
        if (this.f24065k != colorStateList) {
            this.f24065k = colorStateList;
            m27341o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31168c(int i) {
        if (this.f24062h != i) {
            this.f24062h = i;
            m27341o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31164b(int i) {
        if (!this.f24070p || this.f24061g != i) {
            this.f24061g = i;
            this.f24070p = true;
            mo31161a(this.f24056b.mo36283a((float) i));
        }
    }

    /* renamed from: c */
    private C10638g m27338c(boolean z) {
        LayerDrawable layerDrawable = this.f24072r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f24054s) {
            return (C10638g) ((LayerDrawable) ((InsetDrawable) this.f24072r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C10638g) this.f24072r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: b */
    private void m27337b(C10645k kVar) {
        if (mo31167c() != null) {
            mo31167c().setShapeAppearanceModel(kVar);
        }
        if (m27340n() != null) {
            m27340n().setShapeAppearanceModel(kVar);
        }
        if (mo31163b() != null) {
            mo31163b().setShapeAppearanceModel(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10638g mo31167c() {
        return m27338c(false);
    }

    /* renamed from: b */
    public C10660n mo31163b() {
        LayerDrawable layerDrawable = this.f24072r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f24072r.getNumberOfLayers() > 2) {
            return (C10660n) this.f24072r.getDrawable(2);
        }
        return (C10660n) this.f24072r.getDrawable(1);
    }

    /* renamed from: a */
    private InsetDrawable m27336a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f24057c, this.f24059e, this.f24058d, this.f24060f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31160a(PorterDuff.Mode mode) {
        if (this.f24063i != mode) {
            this.f24063i = mode;
            if (mo31167c() != null && this.f24063i != null) {
                C0414a.m2017a((Drawable) mo31167c(), this.f24063i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31157a(int i, int i2) {
        Drawable drawable = this.f24067m;
        if (drawable != null) {
            drawable.setBounds(this.f24057c, this.f24059e, i2 - this.f24058d, i - this.f24060f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31156a(int i) {
        if (mo31167c() != null) {
            mo31167c().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31158a(ColorStateList colorStateList) {
        if (this.f24066l != colorStateList) {
            this.f24066l = colorStateList;
            if (f24054s && (this.f24055a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f24055a.getBackground()).setColor(C10629b.m35983b(colorStateList));
            } else if (!f24054s && (this.f24055a.getBackground() instanceof C10626a)) {
                ((C10626a) this.f24055a.getBackground()).setTintList(C10629b.m35983b(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31155a() {
        return this.f24061g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31162a(boolean z) {
        this.f24071q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31161a(C10645k kVar) {
        this.f24056b = kVar;
        m27337b(kVar);
    }
}
