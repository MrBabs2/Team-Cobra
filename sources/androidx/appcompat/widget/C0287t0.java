package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5083w;

/* renamed from: androidx.appcompat.widget.t0 */
/* compiled from: TooltipCompatHandler */
class C0287t0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o */
    private static C0287t0 f1226o;

    /* renamed from: p */
    private static C0287t0 f1227p;

    /* renamed from: f */
    private final View f1228f;

    /* renamed from: g */
    private final CharSequence f1229g;

    /* renamed from: h */
    private final int f1230h;

    /* renamed from: i */
    private final Runnable f1231i = new C0288a();

    /* renamed from: j */
    private final Runnable f1232j = new C0289b();

    /* renamed from: k */
    private int f1233k;

    /* renamed from: l */
    private int f1234l;

    /* renamed from: m */
    private C0294u0 f1235m;

    /* renamed from: n */
    private boolean f1236n;

    /* renamed from: androidx.appcompat.widget.t0$a */
    /* compiled from: TooltipCompatHandler */
    class C0288a implements Runnable {
        C0288a() {
        }

        public void run() {
            C0287t0.this.mo1835a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.t0$b */
    /* compiled from: TooltipCompatHandler */
    class C0289b implements Runnable {
        C0289b() {
        }

        public void run() {
            C0287t0.this.mo1834a();
        }
    }

    private C0287t0(View view, CharSequence charSequence) {
        this.f1228f = view;
        this.f1229g = charSequence;
        this.f1230h = C5083w.m9255a(ViewConfiguration.get(view.getContext()));
        m1365c();
        this.f1228f.setOnLongClickListener(this);
        this.f1228f.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m1361a(View view, CharSequence charSequence) {
        C0287t0 t0Var = f1226o;
        if (t0Var != null && t0Var.f1228f == view) {
            m1362a((C0287t0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0287t0 t0Var2 = f1227p;
            if (t0Var2 != null && t0Var2.f1228f == view) {
                t0Var2.mo1834a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0287t0(view, charSequence);
    }

    /* renamed from: b */
    private void m1364b() {
        this.f1228f.removeCallbacks(this.f1231i);
    }

    /* renamed from: c */
    private void m1365c() {
        this.f1233k = Integer.MAX_VALUE;
        this.f1234l = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m1366d() {
        this.f1228f.postDelayed(this.f1231i, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1235m != null && this.f1236n) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1228f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1365c();
                mo1834a();
            }
        } else if (this.f1228f.isEnabled() && this.f1235m == null && m1363a(motionEvent)) {
            m1362a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1233k = view.getWidth() / 2;
        this.f1234l = view.getHeight() / 2;
        mo1835a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1834a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1835a(boolean z) {
        long j;
        int i;
        long j2;
        if (C5071v.m9139D(this.f1228f)) {
            m1362a((C0287t0) null);
            C0287t0 t0Var = f1227p;
            if (t0Var != null) {
                t0Var.mo1834a();
            }
            f1227p = this;
            this.f1236n = z;
            C0294u0 u0Var = new C0294u0(this.f1228f.getContext());
            this.f1235m = u0Var;
            u0Var.mo1859a(this.f1228f, this.f1233k, this.f1234l, this.f1236n, this.f1229g);
            this.f1228f.addOnAttachStateChangeListener(this);
            if (this.f1236n) {
                j = 2500;
            } else {
                if ((C5071v.m9212x(this.f1228f) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1228f.removeCallbacks(this.f1232j);
            this.f1228f.postDelayed(this.f1232j, j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1834a() {
        if (f1227p == this) {
            f1227p = null;
            C0294u0 u0Var = this.f1235m;
            if (u0Var != null) {
                u0Var.mo1858a();
                this.f1235m = null;
                m1365c();
                this.f1228f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1226o == this) {
            m1362a((C0287t0) null);
        }
        this.f1228f.removeCallbacks(this.f1232j);
    }

    /* renamed from: a */
    private static void m1362a(C0287t0 t0Var) {
        C0287t0 t0Var2 = f1226o;
        if (t0Var2 != null) {
            t0Var2.m1364b();
        }
        f1226o = t0Var;
        if (t0Var != null) {
            t0Var.m1366d();
        }
    }

    /* renamed from: a */
    private boolean m1363a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1233k) <= this.f1230h && Math.abs(y - this.f1234l) <= this.f1230h) {
            return false;
        }
        this.f1233k = x;
        this.f1234l = y;
        return true;
    }
}
