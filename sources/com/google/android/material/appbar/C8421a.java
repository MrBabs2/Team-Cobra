package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p050l.p075h.p084l.C5071v;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: HeaderBehavior */
abstract class C8421a<V extends View> extends C8424c<V> {

    /* renamed from: d */
    private Runnable f23795d;

    /* renamed from: e */
    OverScroller f23796e;

    /* renamed from: f */
    private boolean f23797f;

    /* renamed from: g */
    private int f23798g = -1;

    /* renamed from: h */
    private int f23799h;

    /* renamed from: i */
    private int f23800i = -1;

    /* renamed from: j */
    private VelocityTracker f23801j;

    /* renamed from: com.google.android.material.appbar.a$a */
    /* compiled from: HeaderBehavior */
    private class C8422a implements Runnable {

        /* renamed from: f */
        private final CoordinatorLayout f23802f;

        /* renamed from: g */
        private final V f23803g;

        C8422a(CoordinatorLayout coordinatorLayout, V v) {
            this.f23802f = coordinatorLayout;
            this.f23803g = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f23803g != null && (overScroller = C8421a.this.f23796e) != null) {
                if (overScroller.computeScrollOffset()) {
                    C8421a aVar = C8421a.this;
                    aVar.mo30867c(this.f23802f, this.f23803g, aVar.f23796e.getCurrY());
                    C5071v.m9162a((View) this.f23803g, (Runnable) this);
                    return;
                }
                C8421a.this.mo30788e(this.f23802f, this.f23803g);
            }
        }
    }

    public C8421a() {
    }

    /* renamed from: d */
    private void m27034d() {
        if (this.f23801j == null) {
            this.f23801j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo30776a(V v);

    /* renamed from: a */
    public boolean mo2147a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f23800i < 0) {
            this.f23800i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f23797f) {
            int i = this.f23798g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f23799h) > this.f23800i) {
                this.f23799h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f23798g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo30776a(v) && coordinatorLayout.mo2086a((View) v, x, y2);
            this.f23797f = z;
            if (z) {
                this.f23799h = y2;
                this.f23798g = motionEvent.getPointerId(0);
                m27034d();
                OverScroller overScroller = this.f23796e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f23796e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f23801j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo30781b(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo30782b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2152b(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f23798g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f23799h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f23798g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f23799h
            int r7 = r1 - r0
            r11.f23799h = r0
            int r8 = r11.mo30781b(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo30865a((androidx.coordinatorlayout.widget.CoordinatorLayout) r5, r6, (int) r7, (int) r8, (int) r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f23801j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f23801j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f23801j
            int r4 = r11.f23798g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo30786c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo30866a((androidx.coordinatorlayout.widget.CoordinatorLayout) r6, r7, (int) r8, (int) r9, (float) r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f23797f = r3
            r11.f23798g = r1
            android.view.VelocityTracker r13 = r11.f23801j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f23801j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f23801j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f23797f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.C8421a.mo2152b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo30785c();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo30786c(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo30867c(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo30782b(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo30788e(CoordinatorLayout coordinatorLayout, V v);

    public C8421a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo30865a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo30782b(coordinatorLayout, v, mo30785c() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo30866a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f23795d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f23795d = null;
        }
        if (this.f23796e == null) {
            this.f23796e = new OverScroller(v.getContext());
        }
        this.f23796e.fling(0, mo30876b(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f23796e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C8422a aVar = new C8422a(coordinatorLayout, v);
            this.f23795d = aVar;
            C5071v.m9162a((View) v, (Runnable) aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo30788e(coordinatorLayout, v);
        return false;
    }
}
