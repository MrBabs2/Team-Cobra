package p112n.p277e.p279b.p282b.p297z;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p112n.p277e.p279b.p282b.C10584l;

/* renamed from: n.e.b.b.z.k */
/* compiled from: ShapeAppearanceModel */
public class C10645k {

    /* renamed from: m */
    public static final C10634c f28609m = new C10643i(0.5f);

    /* renamed from: a */
    C10635d f28610a;

    /* renamed from: b */
    C10635d f28611b;

    /* renamed from: c */
    C10635d f28612c;

    /* renamed from: d */
    C10635d f28613d;

    /* renamed from: e */
    C10634c f28614e;

    /* renamed from: f */
    C10634c f28615f;

    /* renamed from: g */
    C10634c f28616g;

    /* renamed from: h */
    C10634c f28617h;

    /* renamed from: i */
    C10637f f28618i;

    /* renamed from: j */
    C10637f f28619j;

    /* renamed from: k */
    C10637f f28620k;

    /* renamed from: l */
    C10637f f28621l;

    /* renamed from: n.e.b.b.z.k$b */
    /* compiled from: ShapeAppearanceModel */
    public static final class C10647b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C10635d f28622a = C10642h.m36064a();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C10635d f28623b = C10642h.m36064a();
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C10635d f28624c = C10642h.m36064a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C10635d f28625d = C10642h.m36064a();
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C10634c f28626e = new C10632a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C10634c f28627f = new C10632a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C10634c f28628g = new C10632a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C10634c f28629h = new C10632a(0.0f);
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C10637f f28630i = C10642h.m36069b();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C10637f f28631j = C10642h.m36069b();
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C10637f f28632k = C10642h.m36069b();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public C10637f f28633l = C10642h.m36069b();

        public C10647b() {
        }

        /* renamed from: a */
        public C10647b mo36298a(float f) {
            mo36311d(f);
            mo36315e(f);
            mo36307c(f);
            mo36303b(f);
            return this;
        }

        /* renamed from: b */
        public C10647b mo36305b(C10634c cVar) {
            this.f28628g = cVar;
            return this;
        }

        /* renamed from: c */
        public C10647b mo36309c(C10634c cVar) {
            this.f28626e = cVar;
            return this;
        }

        /* renamed from: d */
        public C10647b mo36311d(float f) {
            this.f28626e = new C10632a(f);
            return this;
        }

        /* renamed from: e */
        public C10647b mo36315e(float f) {
            this.f28627f = new C10632a(f);
            return this;
        }

        /* renamed from: e */
        private static float m36100e(C10635d dVar) {
            if (dVar instanceof C10644j) {
                return ((C10644j) dVar).f28608a;
            }
            if (dVar instanceof C10636e) {
                return ((C10636e) dVar).f28558a;
            }
            return -1.0f;
        }

        /* renamed from: b */
        public C10647b mo36303b(float f) {
            this.f28629h = new C10632a(f);
            return this;
        }

        /* renamed from: c */
        public C10647b mo36307c(float f) {
            this.f28628g = new C10632a(f);
            return this;
        }

        /* renamed from: d */
        public C10647b mo36313d(C10634c cVar) {
            this.f28627f = cVar;
            return this;
        }

        /* renamed from: b */
        public C10647b mo36304b(int i, C10634c cVar) {
            mo36306b(C10642h.m36065a(i));
            mo36305b(cVar);
            return this;
        }

        /* renamed from: c */
        public C10647b mo36308c(int i, C10634c cVar) {
            mo36310c(C10642h.m36065a(i));
            mo36309c(cVar);
            return this;
        }

        /* renamed from: d */
        public C10647b mo36312d(int i, C10634c cVar) {
            mo36314d(C10642h.m36065a(i));
            mo36313d(cVar);
            return this;
        }

        /* renamed from: a */
        public C10647b mo36300a(C10634c cVar) {
            this.f28629h = cVar;
            return this;
        }

        /* renamed from: b */
        public C10647b mo36306b(C10635d dVar) {
            this.f28624c = dVar;
            float e = m36100e(dVar);
            if (e != -1.0f) {
                mo36307c(e);
            }
            return this;
        }

        /* renamed from: c */
        public C10647b mo36310c(C10635d dVar) {
            this.f28622a = dVar;
            float e = m36100e(dVar);
            if (e != -1.0f) {
                mo36311d(e);
            }
            return this;
        }

        /* renamed from: d */
        public C10647b mo36314d(C10635d dVar) {
            this.f28623b = dVar;
            float e = m36100e(dVar);
            if (e != -1.0f) {
                mo36315e(e);
            }
            return this;
        }

        /* renamed from: a */
        public C10647b mo36299a(int i, C10634c cVar) {
            mo36301a(C10642h.m36065a(i));
            mo36300a(cVar);
            return this;
        }

        /* renamed from: a */
        public C10647b mo36301a(C10635d dVar) {
            this.f28625d = dVar;
            float e = m36100e(dVar);
            if (e != -1.0f) {
                mo36303b(e);
            }
            return this;
        }

        /* renamed from: a */
        public C10645k mo36302a() {
            return new C10645k(this);
        }

        public C10647b(C10645k kVar) {
            this.f28622a = kVar.f28610a;
            this.f28623b = kVar.f28611b;
            this.f28624c = kVar.f28612c;
            this.f28625d = kVar.f28613d;
            this.f28626e = kVar.f28614e;
            this.f28627f = kVar.f28615f;
            this.f28628g = kVar.f28616g;
            this.f28629h = kVar.f28617h;
            this.f28630i = kVar.f28618i;
            this.f28631j = kVar.f28619j;
            this.f28632k = kVar.f28620k;
            this.f28633l = kVar.f28621l;
        }
    }

    /* renamed from: n.e.b.b.z.k$c */
    /* compiled from: ShapeAppearanceModel */
    public interface C10648c {
        /* renamed from: a */
        C10634c mo36277a(C10634c cVar);
    }

    /* renamed from: a */
    public static C10647b m36076a(Context context, AttributeSet attributeSet, int i, int i2) {
        return m36077a(context, attributeSet, i, i2, 0);
    }

    /* renamed from: n */
    public static C10647b m36079n() {
        return new C10647b();
    }

    /* renamed from: b */
    public C10635d mo36286b() {
        return this.f28613d;
    }

    /* renamed from: c */
    public C10634c mo36287c() {
        return this.f28617h;
    }

    /* renamed from: d */
    public C10635d mo36288d() {
        return this.f28612c;
    }

    /* renamed from: e */
    public C10634c mo36289e() {
        return this.f28616g;
    }

    /* renamed from: f */
    public C10637f mo36290f() {
        return this.f28621l;
    }

    /* renamed from: g */
    public C10637f mo36291g() {
        return this.f28619j;
    }

    /* renamed from: h */
    public C10637f mo36292h() {
        return this.f28618i;
    }

    /* renamed from: i */
    public C10635d mo36293i() {
        return this.f28610a;
    }

    /* renamed from: j */
    public C10634c mo36294j() {
        return this.f28614e;
    }

    /* renamed from: k */
    public C10635d mo36295k() {
        return this.f28611b;
    }

    /* renamed from: l */
    public C10634c mo36296l() {
        return this.f28615f;
    }

    /* renamed from: m */
    public C10647b mo36297m() {
        return new C10647b(this);
    }

    private C10645k(C10647b bVar) {
        this.f28610a = bVar.f28622a;
        this.f28611b = bVar.f28623b;
        this.f28612c = bVar.f28624c;
        this.f28613d = bVar.f28625d;
        this.f28614e = bVar.f28626e;
        this.f28615f = bVar.f28627f;
        this.f28616g = bVar.f28628g;
        this.f28617h = bVar.f28629h;
        this.f28618i = bVar.f28630i;
        this.f28619j = bVar.f28631j;
        this.f28620k = bVar.f28632k;
        this.f28621l = bVar.f28633l;
    }

    /* renamed from: a */
    public static C10647b m36077a(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return m36078a(context, attributeSet, i, i2, (C10634c) new C10632a((float) i3));
    }

    /* renamed from: a */
    public static C10647b m36078a(Context context, AttributeSet attributeSet, int i, int i2, C10634c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C10584l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C10584l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m36075a(context, resourceId, resourceId2, cVar);
    }

    /* renamed from: a */
    public static C10647b m36073a(Context context, int i, int i2) {
        return m36074a(context, i, i2, 0);
    }

    /* renamed from: a */
    private static C10647b m36074a(Context context, int i, int i2, int i3) {
        return m36075a(context, i, i2, (C10634c) new C10632a((float) i3));
    }

    /* renamed from: a */
    private static C10647b m36075a(Context context, int i, int i2, C10634c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10584l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C10584l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C10584l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C10584l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C10584l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C10584l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            C10634c a = m36072a(obtainStyledAttributes, C10584l.ShapeAppearance_cornerSize, cVar);
            C10634c a2 = m36072a(obtainStyledAttributes, C10584l.ShapeAppearance_cornerSizeTopLeft, a);
            C10634c a3 = m36072a(obtainStyledAttributes, C10584l.ShapeAppearance_cornerSizeTopRight, a);
            C10634c a4 = m36072a(obtainStyledAttributes, C10584l.ShapeAppearance_cornerSizeBottomRight, a);
            C10634c a5 = m36072a(obtainStyledAttributes, C10584l.ShapeAppearance_cornerSizeBottomLeft, a);
            C10647b bVar = new C10647b();
            bVar.mo36308c(i4, a2);
            bVar.mo36312d(i5, a3);
            bVar.mo36304b(i6, a4);
            bVar.mo36299a(i7, a5);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public C10645k() {
        this.f28610a = C10642h.m36064a();
        this.f28611b = C10642h.m36064a();
        this.f28612c = C10642h.m36064a();
        this.f28613d = C10642h.m36064a();
        this.f28614e = new C10632a(0.0f);
        this.f28615f = new C10632a(0.0f);
        this.f28616g = new C10632a(0.0f);
        this.f28617h = new C10632a(0.0f);
        this.f28618i = C10642h.m36069b();
        this.f28619j = C10642h.m36069b();
        this.f28620k = C10642h.m36069b();
        this.f28621l = C10642h.m36069b();
    }

    /* renamed from: a */
    private static C10634c m36072a(TypedArray typedArray, int i, C10634c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C10632a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C10643i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    /* renamed from: a */
    public C10637f mo36282a() {
        return this.f28620k;
    }

    /* renamed from: a */
    public C10645k mo36283a(float f) {
        C10647b m = mo36297m();
        m.mo36298a(f);
        return m.mo36302a();
    }

    /* renamed from: a */
    public C10645k mo36284a(C10648c cVar) {
        C10647b m = mo36297m();
        m.mo36309c(cVar.mo36277a(mo36294j()));
        m.mo36313d(cVar.mo36277a(mo36296l()));
        m.mo36300a(cVar.mo36277a(mo36287c()));
        m.mo36305b(cVar.mo36277a(mo36289e()));
        return m.mo36302a();
    }

    /* renamed from: a */
    public boolean mo36285a(RectF rectF) {
        Class<C10637f> cls = C10637f.class;
        boolean z = this.f28621l.getClass().equals(cls) && this.f28619j.getClass().equals(cls) && this.f28618i.getClass().equals(cls) && this.f28620k.getClass().equals(cls);
        float a = this.f28614e.mo36226a(rectF);
        boolean z2 = this.f28615f.mo36226a(rectF) == a && this.f28617h.mo36226a(rectF) == a && this.f28616g.mo36226a(rectF) == a;
        boolean z3 = (this.f28611b instanceof C10644j) && (this.f28610a instanceof C10644j) && (this.f28612c instanceof C10644j) && (this.f28613d instanceof C10644j);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
