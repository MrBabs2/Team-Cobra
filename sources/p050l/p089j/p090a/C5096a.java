package p050l.p089j.p090a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p050l.p066e.C4882h;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5085y;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5038d;
import p050l.p075h.p084l.p085e0.C5041e;
import p050l.p089j.p090a.C5100b;

/* renamed from: l.j.a.a */
/* compiled from: ExploreByTouchHelper */
public abstract class C5096a extends C5010a {

    /* renamed from: n */
    private static final Rect f8968n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final C5100b.C5101a<C5034c> f8969o = new C5097a();

    /* renamed from: p */
    private static final C5100b.C5102b<C4882h<C5034c>, C5034c> f8970p = new C5098b();

    /* renamed from: d */
    private final Rect f8971d = new Rect();

    /* renamed from: e */
    private final Rect f8972e = new Rect();

    /* renamed from: f */
    private final Rect f8973f = new Rect();

    /* renamed from: g */
    private final int[] f8974g = new int[2];

    /* renamed from: h */
    private final AccessibilityManager f8975h;

    /* renamed from: i */
    private final View f8976i;

    /* renamed from: j */
    private C5099c f8977j;

    /* renamed from: k */
    int f8978k = Integer.MIN_VALUE;

    /* renamed from: l */
    int f8979l = Integer.MIN_VALUE;

    /* renamed from: m */
    private int f8980m = Integer.MIN_VALUE;

    /* renamed from: l.j.a.a$a */
    /* compiled from: ExploreByTouchHelper */
    static class C5097a implements C5100b.C5101a<C5034c> {
        C5097a() {
        }

        /* renamed from: a */
        public void mo17688a(C5034c cVar, Rect rect) {
            cVar.mo17507a(rect);
        }
    }

    public C5096a(View view) {
        if (view != null) {
            this.f8976i = view;
            this.f8975h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C5071v.m9202n(view) == 0) {
                C5071v.m9195h(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: d */
    private boolean m9287d() {
        int i = this.f8979l;
        return i != Integer.MIN_VALUE && mo17680a(i, 16, (Bundle) null);
    }

    /* renamed from: e */
    private AccessibilityEvent m9289e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f8976i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: f */
    private C4882h<C5034c> m9291f() {
        ArrayList arrayList = new ArrayList();
        mo17675a((List<Integer>) arrayList);
        C4882h<C5034c> hVar = new C4882h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo17050c(i, m9292f(i));
        }
        return hVar;
    }

    /* renamed from: g */
    private static int m9293g(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: h */
    private boolean m9294h(int i) {
        int i2;
        if (!this.f8975h.isEnabled() || !this.f8975h.isTouchExplorationEnabled() || (i2 = this.f8978k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m9288d(i2);
        }
        this.f8978k = i;
        this.f8976i.invalidate();
        mo17679a(i, 32768);
        return true;
    }

    /* renamed from: i */
    private void m9295i(int i) {
        int i2 = this.f8980m;
        if (i2 != i) {
            this.f8980m = i;
            mo17679a(i, 128);
            mo17679a(i2, 256);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo17670a(float f, float f2);

    /* renamed from: a */
    public C5038d mo4266a(View view) {
        if (this.f8977j == null) {
            this.f8977j = new C5099c();
        }
        return this.f8977j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17671a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17672a(int i, C5034c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17673a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17674a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo17675a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17676a(C5034c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo17680a(int i, int i2, Bundle bundle);

    /* renamed from: b */
    public final int mo17683b() {
        return this.f8978k;
    }

    /* renamed from: c */
    public final int mo17686c() {
        return this.f8979l;
    }

    /* renamed from: l.j.a.a$b */
    /* compiled from: ExploreByTouchHelper */
    static class C5098b implements C5100b.C5102b<C4882h<C5034c>, C5034c> {
        C5098b() {
        }

        /* renamed from: a */
        public C5034c mo17692a(C4882h<C5034c> hVar, int i) {
            return hVar.mo17053e(i);
        }

        /* renamed from: a */
        public int mo17690a(C4882h<C5034c> hVar) {
            return hVar.mo17048c();
        }
    }

    /* renamed from: b */
    private boolean m9284b(int i, Rect rect) {
        C5034c cVar;
        C5034c cVar2;
        C4882h<C5034c> f = m9291f();
        int i2 = this.f8979l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = f.mo17043a(i2);
        }
        C5034c cVar3 = cVar;
        if (i == 1 || i == 2) {
            cVar2 = (C5034c) C5100b.m9328a(f, f8970p, f8969o, cVar3, i, C5071v.m9204p(this.f8976i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f8979l;
            if (i4 != Integer.MIN_VALUE) {
                m9280a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m9279a(this.f8976i, i, rect2);
            }
            cVar2 = (C5034c) C5100b.m9329a(f, f8970p, f8969o, cVar3, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i3 = f.mo17049c(f.mo17042a(cVar2));
        }
        return mo17687c(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m9285c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C5034c b = mo17684b(i);
        obtain.getText().add(b.mo17547i());
        obtain.setContentDescription(b.mo17537f());
        obtain.setScrollable(b.mo17562s());
        obtain.setPassword(b.mo17561r());
        obtain.setEnabled(b.mo17557n());
        obtain.setChecked(b.mo17554l());
        mo17671a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo17529d());
            C5041e.m9081a(obtain, this.f8976i, i);
            obtain.setPackageName(this.f8976i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: d */
    private boolean m9288d(int i) {
        if (this.f8978k != i) {
            return false;
        }
        this.f8978k = Integer.MIN_VALUE;
        this.f8976i.invalidate();
        mo17679a(i, 65536);
        return true;
    }

    /* renamed from: l.j.a.a$c */
    /* compiled from: ExploreByTouchHelper */
    private class C5099c extends C5038d {
        C5099c() {
        }

        /* renamed from: a */
        public C5034c mo17581a(int i) {
            return C5034c.m8991a(C5096a.this.mo17684b(i));
        }

        /* renamed from: b */
        public C5034c mo17583b(int i) {
            int i2 = i == 2 ? C5096a.this.f8978k : C5096a.this.f8979l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo17581a(i2);
        }

        /* renamed from: a */
        public boolean mo17582a(int i, int i2, Bundle bundle) {
            return C5096a.this.mo17685b(i, i2, bundle);
        }
    }

    /* renamed from: e */
    private C5034c m9290e() {
        C5034c d = C5034c.m8997d(this.f8976i);
        C5071v.m9168a(this.f8976i, d);
        ArrayList arrayList = new ArrayList();
        mo17675a((List<Integer>) arrayList);
        if (d.mo17524c() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d.mo17509a(this.f8976i, ((Integer) arrayList.get(i)).intValue());
            }
            return d;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: a */
    public final boolean mo17682a(MotionEvent motionEvent) {
        if (!this.f8975h.isEnabled() || !this.f8975h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int a = mo17670a(motionEvent.getX(), motionEvent.getY());
            m9295i(a);
            if (a != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f8980m == Integer.MIN_VALUE) {
            return false;
        } else {
            m9295i(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: f */
    private C5034c m9292f(int i) {
        C5034c z = C5034c.m9003z();
        z.mo17539f(true);
        z.mo17542g(true);
        z.mo17510a((CharSequence) "android.view.View");
        z.mo17525c(f8968n);
        z.mo17530d(f8968n);
        z.mo17508a(this.f8976i);
        mo17672a(i, z);
        if (z.mo17547i() == null && z.mo17537f() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        z.mo17507a(this.f8972e);
        if (!this.f8972e.equals(f8968n)) {
            int b = z.mo17516b();
            if ((b & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((b & 128) == 0) {
                z.mo17534e((CharSequence) this.f8976i.getContext().getPackageName());
                z.mo17526c(this.f8976i, i);
                if (this.f8978k == i) {
                    z.mo17514a(true);
                    z.mo17506a(128);
                } else {
                    z.mo17514a(false);
                    z.mo17506a(64);
                }
                boolean z2 = this.f8979l == i;
                if (z2) {
                    z.mo17506a(2);
                } else if (z.mo17558o()) {
                    z.mo17506a(1);
                }
                z.mo17545h(z2);
                this.f8976i.getLocationOnScreen(this.f8974g);
                z.mo17518b(this.f8971d);
                if (this.f8971d.equals(f8968n)) {
                    z.mo17507a(this.f8971d);
                    if (z.f8898b != -1) {
                        C5034c z3 = C5034c.m9003z();
                        for (int i2 = z.f8898b; i2 != -1; i2 = z3.f8898b) {
                            z3.mo17519b(this.f8976i, -1);
                            z3.mo17525c(f8968n);
                            mo17672a(i2, z3);
                            z3.mo17507a(this.f8972e);
                            Rect rect = this.f8971d;
                            Rect rect2 = this.f8972e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        z3.mo17566v();
                    }
                    this.f8971d.offset(this.f8974g[0] - this.f8976i.getScrollX(), this.f8974g[1] - this.f8976i.getScrollY());
                }
                if (this.f8976i.getLocalVisibleRect(this.f8973f)) {
                    this.f8973f.offset(this.f8974g[0] - this.f8976i.getScrollX(), this.f8974g[1] - this.f8976i.getScrollY());
                    if (this.f8971d.intersect(this.f8973f)) {
                        z.mo17530d(this.f8971d);
                        if (m9282a(this.f8971d)) {
                            z.mo17555m(true);
                        }
                    }
                }
                return z;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: a */
    public final boolean mo17681a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g = m9293g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m9284b(g, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m9287d();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m9284b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m9284b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: c */
    private boolean m9286c(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo17687c(i);
        }
        if (i2 == 2) {
            return mo17678a(i);
        }
        if (i2 == 64) {
            return m9294h(i);
        }
        if (i2 != 128) {
            return mo17680a(i, i2, bundle);
        }
        return m9288d(i);
    }

    /* renamed from: b */
    private AccessibilityEvent m9283b(int i, int i2) {
        if (i != -1) {
            return m9285c(i, i2);
        }
        return m9289e(i2);
    }

    /* renamed from: b */
    public void mo2447b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2447b(view, accessibilityEvent);
        mo17674a(accessibilityEvent);
    }

    /* renamed from: c */
    public final boolean mo17687c(int i) {
        int i2;
        if ((!this.f8976i.isFocused() && !this.f8976i.requestFocus()) || (i2 = this.f8979l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo17678a(i2);
        }
        this.f8979l = i;
        mo17673a(i, true);
        mo17679a(i, 8);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5034c mo17684b(int i) {
        if (i == -1) {
            return m9290e();
        }
        return m9292f(i);
    }

    /* renamed from: a */
    public final void mo17677a(boolean z, int i, Rect rect) {
        int i2 = this.f8979l;
        if (i2 != Integer.MIN_VALUE) {
            mo17678a(i2);
        }
        if (z) {
            m9284b(i, rect);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17685b(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m9286c(i, i2, bundle);
        }
        return m9281a(i2, bundle);
    }

    /* renamed from: a */
    private void m9280a(int i, Rect rect) {
        mo17684b(i).mo17507a(rect);
    }

    /* renamed from: a */
    private static Rect m9279a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: a */
    public final boolean mo17679a(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f8975h.isEnabled() || (parent = this.f8976i.getParent()) == null) {
            return false;
        }
        return C5085y.m9266a(parent, this.f8976i, m9283b(i, i2));
    }

    /* renamed from: a */
    public void mo2445a(View view, C5034c cVar) {
        super.mo2445a(view, cVar);
        mo17676a(cVar);
    }

    /* renamed from: a */
    private boolean m9281a(int i, Bundle bundle) {
        return C5071v.m9172a(this.f8976i, i, bundle);
    }

    /* renamed from: a */
    private boolean m9282a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f8976i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f8976i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo17678a(int i) {
        if (this.f8979l != i) {
            return false;
        }
        this.f8979l = Integer.MIN_VALUE;
        mo17673a(i, false);
        mo17679a(i, 8);
        return true;
    }
}
