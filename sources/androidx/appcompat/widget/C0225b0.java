package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.C0158p;

/* renamed from: androidx.appcompat.widget.b0 */
/* compiled from: ForwardingListener */
public abstract class C0225b0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    private final float f977f;

    /* renamed from: g */
    private final int f978g;

    /* renamed from: h */
    private final int f979h;

    /* renamed from: i */
    final View f980i;

    /* renamed from: j */
    private Runnable f981j;

    /* renamed from: k */
    private Runnable f982k;

    /* renamed from: l */
    private boolean f983l;

    /* renamed from: m */
    private int f984m;

    /* renamed from: n */
    private final int[] f985n = new int[2];

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* compiled from: ForwardingListener */
    private class C0226a implements Runnable {
        C0226a() {
        }

        public void run() {
            ViewParent parent = C0225b0.this.f980i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$b */
    /* compiled from: ForwardingListener */
    private class C0227b implements Runnable {
        C0227b() {
        }

        public void run() {
            C0225b0.this.mo1424d();
        }
    }

    public C0225b0(View view) {
        this.f980i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f977f = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f978g = tapTimeout;
        this.f979h = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private boolean m1053a(MotionEvent motionEvent) {
        C0302z zVar;
        View view = this.f980i;
        C0158p a = mo469a();
        if (a == null || !a.mo570a() || (zVar = (C0302z) a.mo579e()) == null || !zVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m1055a(view, obtainNoHistory);
        m1057b(zVar, obtainNoHistory);
        boolean a2 = zVar.mo1865a(obtainNoHistory, this.f984m);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!a2 || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m1056b(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f980i
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f984m
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f977f
            boolean r6 = m1054a(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m1058e()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m1058e()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f984m = r6
            java.lang.Runnable r6 = r5.f981j
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.b0$a r6 = new androidx.appcompat.widget.b0$a
            r6.<init>()
            r5.f981j = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f981j
            int r1 = r5.f978g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f982k
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.b0$b r6 = new androidx.appcompat.widget.b0$b
            r6.<init>()
            r5.f982k = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f982k
            int r1 = r5.f979h
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0225b0.m1056b(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    private void m1058e() {
        Runnable runnable = this.f982k;
        if (runnable != null) {
            this.f980i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f981j;
        if (runnable2 != null) {
            this.f980i.removeCallbacks(runnable2);
        }
    }

    /* renamed from: a */
    public abstract C0158p mo469a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo470b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo997c() {
        C0158p a = mo469a();
        if (a == null || !a.mo570a()) {
            return true;
        }
        a.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1424d() {
        m1058e();
        View view = this.f980i;
        if (view.isEnabled() && !view.isLongClickable() && mo470b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f983l = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f983l;
        if (z2) {
            z = m1053a(motionEvent) || !mo997c();
        } else {
            z = m1056b(motionEvent) && mo470b();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f980i.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f983l = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f983l = false;
        this.f984m = -1;
        Runnable runnable = this.f981j;
        if (runnable != null) {
            this.f980i.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    private static boolean m1054a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m1055a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f985n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: b */
    private boolean m1057b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f985n;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }
}
