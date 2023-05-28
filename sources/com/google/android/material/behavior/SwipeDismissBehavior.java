package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5042f;
import p050l.p089j.p090a.C5104c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.C0343c<V> {

    /* renamed from: a */
    C5104c f23853a;

    /* renamed from: b */
    C8432c f23854b;

    /* renamed from: c */
    private boolean f23855c;

    /* renamed from: d */
    private float f23856d = 0.0f;

    /* renamed from: e */
    private boolean f23857e;

    /* renamed from: f */
    int f23858f = 2;

    /* renamed from: g */
    float f23859g = 0.5f;

    /* renamed from: h */
    float f23860h = 0.0f;

    /* renamed from: i */
    float f23861i = 0.5f;

    /* renamed from: j */
    private final C5104c.C5107c f23862j = new C8430a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C8431b implements C5042f {
        C8431b() {
        }

        /* renamed from: a */
        public boolean mo17588a(View view, C5042f.C5043a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo30917a(view)) {
                return false;
            }
            boolean z2 = C5071v.m9204p(view) == 1;
            if ((SwipeDismissBehavior.this.f23858f == 0 && z2) || (SwipeDismissBehavior.this.f23858f == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C5071v.m9187d(view, width);
            view.setAlpha(0.0f);
            C8432c cVar = SwipeDismissBehavior.this.f23854b;
            if (cVar != null) {
                cVar.mo30920a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C8432c {
        /* renamed from: a */
        void mo30919a(int i);

        /* renamed from: a */
        void mo30920a(View view);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C8433d implements Runnable {

        /* renamed from: f */
        private final View f23867f;

        /* renamed from: g */
        private final boolean f23868g;

        C8433d(View view, boolean z) {
            this.f23867f = view;
            this.f23868g = z;
        }

        public void run() {
            C8432c cVar;
            C5104c cVar2 = SwipeDismissBehavior.this.f23853a;
            if (cVar2 != null && cVar2.mo17701a(true)) {
                C5071v.m9162a(this.f23867f, (Runnable) this);
            } else if (this.f23868g && (cVar = SwipeDismissBehavior.this.f23854b) != null) {
                cVar.mo30920a(this.f23867f);
            }
        }
    }

    /* renamed from: b */
    static float m27129b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public void mo30916a(C8432c cVar) {
        this.f23854b = cVar;
    }

    /* renamed from: a */
    public boolean mo30917a(View view) {
        return true;
    }

    /* renamed from: b */
    public void mo30918b(float f) {
        this.f23860h = m27126a(0.0f, f, 1.0f);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C8430a extends C5104c.C5107c {

        /* renamed from: a */
        private int f23863a;

        /* renamed from: b */
        private int f23864b = -1;

        C8430a() {
        }

        /* renamed from: a */
        public void mo17716a(View view, int i) {
            this.f23864b = i;
            this.f23863a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: b */
        public boolean mo17722b(View view, int i) {
            int i2 = this.f23864b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo30917a(view);
        }

        /* renamed from: c */
        public void mo17723c(int i) {
            C8432c cVar = SwipeDismissBehavior.this.f23854b;
            if (cVar != null) {
                cVar.mo30919a(i);
            }
        }

        /* renamed from: b */
        public int mo17719b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: a */
        public void mo17715a(View view, float f, float f2) {
            boolean z;
            int i;
            C8432c cVar;
            this.f23864b = -1;
            int width = view.getWidth();
            if (m27139a(view, f)) {
                int left = view.getLeft();
                int i2 = this.f23863a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f23863a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f23853a.mo17708c(i, view.getTop())) {
                C5071v.m9162a(view, (Runnable) new C8433d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f23854b) != null) {
                cVar.mo30920a(view);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0034 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m27139a(android.view.View r6, float r7) {
            /*
                r5 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0036
                int r6 = p050l.p075h.p084l.C5071v.m9204p(r6)
                if (r6 != r2) goto L_0x000f
                r6 = 1
                goto L_0x0010
            L_0x000f:
                r6 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r3 = r3.f23858f
                r4 = 2
                if (r3 != r4) goto L_0x0018
                return r2
            L_0x0018:
                if (r3 != 0) goto L_0x0027
                if (r6 == 0) goto L_0x0021
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0026
                goto L_0x0025
            L_0x0021:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0026
            L_0x0025:
                r1 = 1
            L_0x0026:
                return r1
            L_0x0027:
                if (r3 != r2) goto L_0x0035
                if (r6 == 0) goto L_0x0030
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 <= 0) goto L_0x0035
                goto L_0x0034
            L_0x0030:
                int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r6 >= 0) goto L_0x0035
            L_0x0034:
                r1 = 1
            L_0x0035:
                return r1
            L_0x0036:
                int r7 = r6.getLeft()
                int r0 = r5.f23863a
                int r7 = r7 - r0
                int r6 = r6.getWidth()
                float r6 = (float) r6
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f23859g
                float r6 = r6 * r0
                int r6 = java.lang.Math.round(r6)
                int r7 = java.lang.Math.abs(r7)
                if (r7 < r6) goto L_0x0053
                r1 = 1
            L_0x0053:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C8430a.m27139a(android.view.View, float):boolean");
        }

        /* renamed from: a */
        public int mo17712a(View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public int mo17713a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = C5071v.m9204p(view) == 1;
            int i5 = SwipeDismissBehavior.this.f23858f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f23863a - view.getWidth();
                    i4 = view.getWidth() + this.f23863a;
                } else if (z) {
                    i3 = this.f23863a;
                    width = view.getWidth();
                } else {
                    i3 = this.f23863a - view.getWidth();
                    i4 = this.f23863a;
                }
                return SwipeDismissBehavior.m27127a(i3, i, i4);
            } else if (z) {
                i3 = this.f23863a - view.getWidth();
                i4 = this.f23863a;
                return SwipeDismissBehavior.m27127a(i3, i, i4);
            } else {
                i3 = this.f23863a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m27127a(i3, i, i4);
        }

        /* renamed from: a */
        public void mo17717a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f23863a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f23860h);
            float width2 = ((float) this.f23863a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f23861i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m27126a(0.0f, 1.0f - SwipeDismissBehavior.m27129b(width, width2, f), 1.0f));
            }
        }
    }

    /* renamed from: a */
    public void mo30915a(int i) {
        this.f23858f = i;
    }

    /* renamed from: b */
    public boolean mo2152b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C5104c cVar = this.f23853a;
        if (cVar == null) {
            return false;
        }
        cVar.mo17697a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public void mo30914a(float f) {
        this.f23861i = m27126a(0.0f, f, 1.0f);
    }

    /* renamed from: b */
    private void m27130b(View view) {
        C5071v.m9191f(view, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
        if (mo30917a(view)) {
            C5071v.m9167a(view, C5034c.C5035a.f8905j, (CharSequence) null, new C8431b());
        }
    }

    /* renamed from: a */
    public boolean mo2143a(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean a = super.mo2143a(coordinatorLayout, v, i);
        if (C5071v.m9202n(v) == 0) {
            C5071v.m9195h(v, 1);
            m27130b((View) v);
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo2147a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f23855c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2086a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f23855c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f23855c = false;
        }
        if (!z) {
            return false;
        }
        m27128a((ViewGroup) coordinatorLayout);
        return this.f23853a.mo17705b(motionEvent);
    }

    /* renamed from: a */
    private void m27128a(ViewGroup viewGroup) {
        C5104c cVar;
        if (this.f23853a == null) {
            if (this.f23857e) {
                cVar = C5104c.m9348a(viewGroup, this.f23856d, this.f23862j);
            } else {
                cVar = C5104c.m9349a(viewGroup, this.f23862j);
            }
            this.f23853a = cVar;
        }
    }

    /* renamed from: a */
    static float m27126a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: a */
    static int m27127a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }
}
