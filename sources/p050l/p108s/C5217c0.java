package p050l.p108s;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p050l.p075h.p084l.C5071v;

/* renamed from: l.s.c0 */
/* compiled from: ViewUtils */
class C5217c0 {

    /* renamed from: a */
    private static final C5237i0 f9253a;

    /* renamed from: b */
    static final Property<View, Float> f9254b = new C5218a(Float.class, "translationAlpha");

    /* renamed from: l.s.c0$a */
    /* compiled from: ViewUtils */
    static class C5218a extends Property<View, Float> {
        C5218a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C5217c0.m9712c(view));
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            C5217c0.m9706a(view, f.floatValue());
        }
    }

    /* renamed from: l.s.c0$b */
    /* compiled from: ViewUtils */
    static class C5219b extends Property<View, Rect> {
        C5219b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C5071v.m9198j(view);
        }

        /* renamed from: a */
        public void set(View view, Rect rect) {
            C5071v.m9160a(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f9253a = new C5235h0();
        } else if (i >= 23) {
            f9253a = new C5233g0();
        } else if (i >= 22) {
            f9253a = new C5231f0();
        } else if (i >= 21) {
            f9253a = new C5229e0();
        } else if (i >= 19) {
            f9253a = new C5223d0();
        } else {
            f9253a = new C5237i0();
        }
        new C5219b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    static void m9706a(View view, float f) {
        f9253a.mo18044a(view, f);
    }

    /* renamed from: b */
    static C5204b0 m9710b(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C5202a0(view);
        }
        return C5272z.m9924c(view);
    }

    /* renamed from: c */
    static float m9712c(View view) {
        return f9253a.mo18045b(view);
    }

    /* renamed from: d */
    static C5254m0 m9713d(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new C5246l0(view);
        }
        return new C5244k0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m9714e(View view) {
        f9253a.mo18046c(view);
    }

    /* renamed from: a */
    static void m9705a(View view) {
        f9253a.mo18043a(view);
    }

    /* renamed from: a */
    static void m9707a(View view, int i) {
        f9253a.mo18052a(view, i);
    }

    /* renamed from: a */
    static void m9709a(View view, Matrix matrix) {
        f9253a.mo18048a(view, matrix);
    }

    /* renamed from: b */
    static void m9711b(View view, Matrix matrix) {
        f9253a.mo18049b(view, matrix);
    }

    /* renamed from: a */
    static void m9708a(View view, int i, int i2, int i3, int i4) {
        f9253a.mo18050a(view, i, i2, i3, i4);
    }
}
