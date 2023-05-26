package p050l.p075h.p084l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: l.h.l.z */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C5086z {

    /* renamed from: a */
    private WeakReference<View> f8952a;

    /* renamed from: b */
    Runnable f8953b = null;

    /* renamed from: c */
    Runnable f8954c = null;

    /* renamed from: d */
    int f8955d = -1;

    /* renamed from: l.h.l.z$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C5087a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5012a0 f8956a;

        /* renamed from: b */
        final /* synthetic */ View f8957b;

        C5087a(C5086z zVar, C5012a0 a0Var, View view) {
            this.f8956a = a0Var;
            this.f8957b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f8956a.onAnimationCancel(this.f8957b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f8956a.onAnimationEnd(this.f8957b);
        }

        public void onAnimationStart(Animator animator) {
            this.f8956a.onAnimationStart(this.f8957b);
        }
    }

    /* renamed from: l.h.l.z$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C5088b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C5018c0 f8958a;

        /* renamed from: b */
        final /* synthetic */ View f8959b;

        C5088b(C5086z zVar, C5018c0 c0Var, View view) {
            this.f8958a = c0Var;
            this.f8959b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f8958a.mo434a(this.f8959b);
        }
    }

    /* renamed from: l.h.l.z$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C5089c implements C5012a0 {

        /* renamed from: a */
        C5086z f8960a;

        /* renamed from: b */
        boolean f8961b;

        C5089c(C5086z zVar) {
            this.f8960a = zVar;
        }

        public void onAnimationCancel(View view) {
            Object tag = view.getTag(2113929216);
            C5012a0 a0Var = tag instanceof C5012a0 ? (C5012a0) tag : null;
            if (a0Var != null) {
                a0Var.onAnimationCancel(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: l.h.l.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationEnd(android.view.View r4) {
            /*
                r3 = this;
                l.h.l.z r0 = r3.f8960a
                int r0 = r0.f8955d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                l.h.l.z r0 = r3.f8960a
                r0.f8955d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f8961b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                l.h.l.z r0 = r3.f8960a
                java.lang.Runnable r1 = r0.f8954c
                if (r1 == 0) goto L_0x0024
                r0.f8954c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof p050l.p075h.p084l.C5012a0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                l.h.l.a0 r2 = (p050l.p075h.p084l.C5012a0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.onAnimationEnd(r4)
            L_0x0036:
                r4 = 1
                r3.f8961b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p084l.C5086z.C5089c.onAnimationEnd(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: l.h.l.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onAnimationStart(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f8961b = r0
                l.h.l.z r0 = r3.f8960a
                int r0 = r0.f8955d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                l.h.l.z r0 = r3.f8960a
                java.lang.Runnable r2 = r0.f8953b
                if (r2 == 0) goto L_0x001a
                r0.f8953b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof p050l.p075h.p084l.C5012a0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                l.h.l.a0 r1 = (p050l.p075h.p084l.C5012a0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.onAnimationStart(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p084l.C5086z.C5089c.onAnimationStart(android.view.View):void");
        }
    }

    C5086z(View view) {
        this.f8952a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C5086z mo17638a(long j) {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: b */
    public C5086z mo17644b(float f) {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: c */
    public void mo17646c() {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C5086z mo17637a(float f) {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public long mo17643b() {
        View view = (View) this.f8952a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: a */
    public C5086z mo17639a(Interpolator interpolator) {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C5086z mo17645b(long j) {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: a */
    public void mo17642a() {
        View view = (View) this.f8952a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public C5086z mo17640a(C5012a0 a0Var) {
        View view = (View) this.f8952a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m9268a(view, a0Var);
            } else {
                view.setTag(2113929216, a0Var);
                m9268a(view, new C5089c(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m9268a(View view, C5012a0 a0Var) {
        if (a0Var != null) {
            view.animate().setListener(new C5087a(this, a0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public C5086z mo17641a(C5018c0 c0Var) {
        View view = (View) this.f8952a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C5088b bVar = null;
            if (c0Var != null) {
                bVar = new C5088b(this, c0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }
}
