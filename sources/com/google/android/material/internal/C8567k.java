package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5067r;
import p050l.p075h.p084l.C5071v;

/* renamed from: com.google.android.material.internal.k */
/* compiled from: ViewUtils */
public class C8567k {

    /* renamed from: com.google.android.material.internal.k$a */
    /* compiled from: ViewUtils */
    static class C8568a implements C5067r {

        /* renamed from: a */
        final /* synthetic */ C8570c f24519a;

        /* renamed from: b */
        final /* synthetic */ C8571d f24520b;

        C8568a(C8570c cVar, C8571d dVar) {
            this.f24519a = cVar;
            this.f24520b = dVar;
        }

        /* renamed from: a */
        public C5020d0 mo342a(View view, C5020d0 d0Var) {
            this.f24519a.mo31009a(view, d0Var, new C8571d(this.f24520b));
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.k$b */
    /* compiled from: ViewUtils */
    static class C8569b implements View.OnAttachStateChangeListener {
        C8569b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C5071v.m9145J(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.k$c */
    /* compiled from: ViewUtils */
    public interface C8570c {
        /* renamed from: a */
        C5020d0 mo31009a(View view, C5020d0 d0Var, C8571d dVar);
    }

    /* renamed from: a */
    public static PorterDuff.Mode m28001a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: b */
    public static boolean m28003b(View view) {
        return C5071v.m9204p(view) == 1;
    }

    /* renamed from: c */
    public static void m28004c(View view) {
        if (C5071v.m9139D(view)) {
            C5071v.m9145J(view);
        } else {
            view.addOnAttachStateChangeListener(new C8569b());
        }
    }

    /* renamed from: com.google.android.material.internal.k$d */
    /* compiled from: ViewUtils */
    public static class C8571d {

        /* renamed from: a */
        public int f24521a;

        /* renamed from: b */
        public int f24522b;

        /* renamed from: c */
        public int f24523c;

        /* renamed from: d */
        public int f24524d;

        public C8571d(int i, int i2, int i3, int i4) {
            this.f24521a = i;
            this.f24522b = i2;
            this.f24523c = i3;
            this.f24524d = i4;
        }

        /* renamed from: a */
        public void mo31953a(View view) {
            C5071v.m9156a(view, this.f24521a, this.f24522b, this.f24523c, this.f24524d);
        }

        public C8571d(C8571d dVar) {
            this.f24521a = dVar.f24521a;
            this.f24522b = dVar.f24522b;
            this.f24523c = dVar.f24523c;
            this.f24524d = dVar.f24524d;
        }
    }

    /* renamed from: a */
    public static float m27999a(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static void m28002a(View view, C8570c cVar) {
        C5071v.m9169a(view, (C5067r) new C8568a(cVar, new C8571d(C5071v.m9209u(view), view.getPaddingTop(), C5071v.m9208t(view), view.getPaddingBottom())));
        m28004c(view);
    }

    /* renamed from: a */
    public static float m28000a(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C5071v.m9200l((View) parent);
        }
        return f;
    }
}
