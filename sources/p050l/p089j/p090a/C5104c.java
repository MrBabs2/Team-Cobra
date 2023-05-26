package p050l.p089j.p090a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p050l.p075h.p084l.C5071v;

/* renamed from: l.j.a.c */
/* compiled from: ViewDragHelper */
public class C5104c {

    /* renamed from: w */
    private static final Interpolator f8986w = new C5105a();

    /* renamed from: a */
    private int f8987a;

    /* renamed from: b */
    private int f8988b;

    /* renamed from: c */
    private int f8989c = -1;

    /* renamed from: d */
    private float[] f8990d;

    /* renamed from: e */
    private float[] f8991e;

    /* renamed from: f */
    private float[] f8992f;

    /* renamed from: g */
    private float[] f8993g;

    /* renamed from: h */
    private int[] f8994h;

    /* renamed from: i */
    private int[] f8995i;

    /* renamed from: j */
    private int[] f8996j;

    /* renamed from: k */
    private int f8997k;

    /* renamed from: l */
    private VelocityTracker f8998l;

    /* renamed from: m */
    private float f8999m;

    /* renamed from: n */
    private float f9000n;

    /* renamed from: o */
    private int f9001o;

    /* renamed from: p */
    private int f9002p;

    /* renamed from: q */
    private OverScroller f9003q;

    /* renamed from: r */
    private final C5107c f9004r;

    /* renamed from: s */
    private View f9005s;

    /* renamed from: t */
    private boolean f9006t;

    /* renamed from: u */
    private final ViewGroup f9007u;

    /* renamed from: v */
    private final Runnable f9008v = new C5106b();

    /* renamed from: l.j.a.c$a */
    /* compiled from: ViewDragHelper */
    static class C5105a implements Interpolator {
        C5105a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: l.j.a.c$b */
    /* compiled from: ViewDragHelper */
    class C5106b implements Runnable {
        C5106b() {
        }

        public void run() {
            C5104c.this.mo17703b(0);
        }
    }

    /* renamed from: l.j.a.c$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C5107c {
        /* renamed from: a */
        public int mo17711a(int i) {
            return i;
        }

        /* renamed from: a */
        public int mo17712a(View view) {
            return 0;
        }

        /* renamed from: a */
        public abstract int mo17713a(View view, int i, int i2);

        /* renamed from: a */
        public void mo17714a(int i, int i2) {
        }

        /* renamed from: a */
        public abstract void mo17715a(View view, float f, float f2);

        /* renamed from: a */
        public void mo17716a(View view, int i) {
        }

        /* renamed from: a */
        public abstract void mo17717a(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        public int mo17718b(View view) {
            return 0;
        }

        /* renamed from: b */
        public abstract int mo17719b(View view, int i, int i2);

        /* renamed from: b */
        public void mo17720b(int i, int i2) {
        }

        /* renamed from: b */
        public boolean mo17721b(int i) {
            return false;
        }

        /* renamed from: b */
        public abstract boolean mo17722b(View view, int i);

        /* renamed from: c */
        public abstract void mo17723c(int i);
    }

    private C5104c(Context context, ViewGroup viewGroup, C5107c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f9007u = viewGroup;
            this.f9004r = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f9001o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f8988b = viewConfiguration.getScaledTouchSlop();
            this.f8999m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f9000n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f9003q = new OverScroller(context, f8986w);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: a */
    public static C5104c m9349a(ViewGroup viewGroup, C5107c cVar) {
        return new C5104c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: d */
    private void m9363d(int i) {
        float[] fArr = this.f8990d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            float[] fArr6 = this.f8990d;
            if (fArr6 != null) {
                System.arraycopy(fArr6, 0, fArr2, 0, fArr6.length);
                float[] fArr7 = this.f8991e;
                System.arraycopy(fArr7, 0, fArr3, 0, fArr7.length);
                float[] fArr8 = this.f8992f;
                System.arraycopy(fArr8, 0, fArr4, 0, fArr8.length);
                float[] fArr9 = this.f8993g;
                System.arraycopy(fArr9, 0, fArr5, 0, fArr9.length);
                int[] iArr4 = this.f8994h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f8995i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f8996j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f8990d = fArr2;
            this.f8991e = fArr3;
            this.f8992f = fArr4;
            this.f8993g = fArr5;
            this.f8994h = iArr;
            this.f8995i = iArr2;
            this.f8996j = iArr3;
        }
    }

    /* renamed from: e */
    private boolean m9364e(int i) {
        if (mo17699a(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: b */
    public int mo17702b() {
        return this.f8988b;
    }

    /* renamed from: c */
    public boolean mo17708c(int i, int i2) {
        if (this.f9006t) {
            return m9357b(i, i2, (int) this.f8998l.getXVelocity(this.f8989c), (int) this.f8998l.getYVelocity(this.f8989c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* renamed from: a */
    public static C5104c m9348a(ViewGroup viewGroup, float f, C5107c cVar) {
        C5104c a = m9349a(viewGroup, cVar);
        a.f8988b = (int) (((float) a.f8988b) * (1.0f / f));
        return a;
    }

    /* renamed from: b */
    public boolean mo17707b(View view, int i, int i2) {
        this.f9005s = view;
        this.f8989c = -1;
        boolean b = m9357b(i, i2, 0, 0);
        if (!b && this.f8987a == 0 && this.f9005s != null) {
            this.f9005s = null;
        }
        return b;
    }

    /* renamed from: a */
    public void mo17698a(View view, int i) {
        if (view.getParent() == this.f9007u) {
            this.f9005s = view;
            this.f8989c = i;
            this.f9004r.mo17716a(view, i);
            mo17703b(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f9007u + ")");
    }

    /* renamed from: b */
    private boolean m9357b(int i, int i2, int i3, int i4) {
        int left = this.f9005s.getLeft();
        int top = this.f9005s.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f9003q.abortAnimation();
            mo17703b(0);
            return false;
        }
        this.f9003q.startScroll(left, top, i5, i6, m9347a(this.f9005s, i5, i6, i3, i4));
        mo17703b(2);
        return true;
    }

    /* renamed from: c */
    private void m9358c() {
        float[] fArr = this.f8990d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f8991e, 0.0f);
            Arrays.fill(this.f8992f, 0.0f);
            Arrays.fill(this.f8993g, 0.0f);
            Arrays.fill(this.f8994h, 0);
            Arrays.fill(this.f8995i, 0);
            Arrays.fill(this.f8996j, 0);
            this.f8997k = 0;
        }
    }

    /* renamed from: a */
    public void mo17696a() {
        this.f8989c = -1;
        m9358c();
        VelocityTracker velocityTracker = this.f8998l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8998l = null;
        }
    }

    /* renamed from: b */
    private int m9355b(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f9007u.getWidth();
        float f = (float) (width / 2);
        float a = f + (m9344a(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: a */
    private int m9347a(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int a = m9346a(i3, (int) this.f9000n, (int) this.f8999m);
        int a2 = m9346a(i4, (int) this.f9000n, (int) this.f8999m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(a);
        int abs4 = Math.abs(a2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (a != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (a2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m9355b(i, a, this.f9004r.mo17712a(view))) * f5) + (((float) m9355b(i2, a2, this.f9004r.mo17718b(view))) * f6));
    }

    /* renamed from: c */
    private void m9359c(int i) {
        if (this.f8990d != null && mo17699a(i)) {
            this.f8990d[i] = 0.0f;
            this.f8991e[i] = 0.0f;
            this.f8992f[i] = 0.0f;
            this.f8993g[i] = 0.0f;
            this.f8994h[i] = 0;
            this.f8995i[i] = 0;
            this.f8996j[i] = 0;
            this.f8997k = ((1 << i) ^ -1) & this.f8997k;
        }
    }

    /* renamed from: b */
    private void m9356b(float f, float f2, int i) {
        m9363d(i);
        float[] fArr = this.f8990d;
        this.f8992f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f8991e;
        this.f8993g[i] = f2;
        fArr2[i] = f2;
        this.f8994h[i] = m9361d((int) f, (int) f2);
        this.f8997k |= 1 << i;
    }

    /* renamed from: a */
    private int m9346a(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    /* renamed from: a */
    private float m9345a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        if (abs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    /* renamed from: d */
    private void m9362d() {
        this.f8998l.computeCurrentVelocity(1000, this.f8999m);
        m9350a(m9345a(this.f8998l.getXVelocity(this.f8989c), this.f9000n, this.f8999m), m9345a(this.f8998l.getYVelocity(this.f8989c), this.f9000n, this.f8999m));
    }

    /* renamed from: a */
    private float m9344a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: c */
    private void m9360c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m9364e(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f8992f[pointerId] = x;
                this.f8993g[pointerId] = y;
            }
        }
    }

    /* renamed from: a */
    public boolean mo17701a(boolean z) {
        if (this.f8987a == 2) {
            boolean computeScrollOffset = this.f9003q.computeScrollOffset();
            int currX = this.f9003q.getCurrX();
            int currY = this.f9003q.getCurrY();
            int left = currX - this.f9005s.getLeft();
            int top = currY - this.f9005s.getTop();
            if (left != 0) {
                C5071v.m9187d(this.f9005s, left);
            }
            if (top != 0) {
                C5071v.m9189e(this.f9005s, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f9004r.mo17717a(this.f9005s, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f9003q.getFinalX() && currY == this.f9003q.getFinalY()) {
                this.f9003q.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f9007u.post(this.f9008v);
                } else {
                    mo17703b(0);
                }
            }
        }
        if (this.f8987a == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17703b(int i) {
        this.f9007u.removeCallbacks(this.f9008v);
        if (this.f8987a != i) {
            this.f8987a = i;
            this.f9004r.mo17723c(i);
            if (this.f8987a == 0) {
                this.f9005s = null;
            }
        }
    }

    /* renamed from: d */
    private int m9361d(int i, int i2) {
        int i3 = i < this.f9007u.getLeft() + this.f9001o ? 1 : 0;
        if (i2 < this.f9007u.getTop() + this.f9001o) {
            i3 |= 4;
        }
        if (i > this.f9007u.getRight() - this.f9001o) {
            i3 |= 2;
        }
        return i2 > this.f9007u.getBottom() - this.f9001o ? i3 | 8 : i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo17706b(View view, int i) {
        if (view == this.f9005s && this.f8989c == i) {
            return true;
        }
        if (view == null || !this.f9004r.mo17722b(view, i)) {
            return false;
        }
        this.f8989c = i;
        mo17698a(view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17705b(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo17696a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f8998l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f8998l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f8998l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.m9359c((int) r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.m9356b((float) r7, (float) r1, (int) r2)
            int r3 = r0.f8987a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f8994h
            r1 = r1[r2]
            int r3 = r0.f9002p
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            l.j.a.c$c r4 = r0.f9004r
            r1 = r1 & r3
            r4.mo17720b((int) r1, (int) r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo17695a((int) r3, (int) r1)
            android.view.View r3 = r0.f9005s
            if (r1 != r3) goto L_0x0031
            r0.mo17706b((android.view.View) r1, (int) r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f8990d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f8991e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m9364e(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f8990d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f8991e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo17695a((int) r7, (int) r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.m9354a((android.view.View) r7, (float) r9, (float) r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            l.j.a.c$c r14 = r0.f9004r
            int r12 = r14.mo17713a((android.view.View) r7, (int) r13, (int) r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            l.j.a.c$c r5 = r0.f9004r
            int r5 = r5.mo17719b(r7, r15, r14)
            l.j.a.c$c r14 = r0.f9004r
            int r14 = r14.mo17712a((android.view.View) r7)
            l.j.a.c$c r15 = r0.f9004r
            int r15 = r15.mo17718b((android.view.View) r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.m9351a((float) r9, (float) r10, (int) r4)
            int r5 = r0.f8987a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo17706b((android.view.View) r7, (int) r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.m9360c((android.view.MotionEvent) r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo17696a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.m9356b((float) r2, (float) r3, (int) r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo17695a((int) r2, (int) r3)
            android.view.View r3 = r0.f9005s
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f8987a
            if (r3 != r4) goto L_0x0125
            r0.mo17706b((android.view.View) r2, (int) r1)
        L_0x0125:
            int[] r2 = r0.f8994h
            r2 = r2[r1]
            int r3 = r0.f9002p
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            l.j.a.c$c r4 = r0.f9004r
            r2 = r2 & r3
            r4.mo17720b((int) r2, (int) r1)
        L_0x0135:
            int r1 = r0.f8987a
            if (r1 != r6) goto L_0x013a
            r5 = 1
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p089j.p090a.C5104c.mo17705b(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m9350a(float f, float f2) {
        this.f9006t = true;
        this.f9004r.mo17715a(this.f9005s, f, f2);
        this.f9006t = false;
        if (this.f8987a == 1) {
            mo17703b(0);
        }
    }

    /* renamed from: a */
    public boolean mo17699a(int i) {
        return ((1 << i) & this.f8997k) != 0;
    }

    /* renamed from: a */
    public void mo17697a(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo17696a();
        }
        if (this.f8998l == null) {
            this.f8998l = VelocityTracker.obtain();
        }
        this.f8998l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View a = mo17695a((int) x, (int) y);
            m9356b(x, y, pointerId);
            mo17706b(a, pointerId);
            int i3 = this.f8994h[pointerId];
            int i4 = this.f9002p;
            if ((i3 & i4) != 0) {
                this.f9004r.mo17720b(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f8987a == 1) {
                m9362d();
            }
            mo17696a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f8987a == 1) {
                    m9350a(0.0f, 0.0f);
                }
                mo17696a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                m9356b(x2, y2, pointerId2);
                if (this.f8987a == 0) {
                    mo17706b(mo17695a((int) x2, (int) y2), pointerId2);
                    int i5 = this.f8994h[pointerId2];
                    int i6 = this.f9002p;
                    if ((i5 & i6) != 0) {
                        this.f9004r.mo17720b(i5 & i6, pointerId2);
                    }
                } else if (mo17704b((int) x2, (int) y2)) {
                    mo17706b(this.f9005s, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f8987a == 1 && pointerId3 == this.f8989c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f8989c) {
                            View a2 = mo17695a((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f9005s;
                            if (a2 == view && mo17706b(view, pointerId4)) {
                                i = this.f8989c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        m9362d();
                    }
                }
                m9359c(pointerId3);
            }
        } else if (this.f8987a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (m9364e(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f8990d[pointerId5];
                    float f2 = y3 - this.f8991e[pointerId5];
                    m9351a(f, f2, pointerId5);
                    if (this.f8987a != 1) {
                        View a3 = mo17695a((int) x3, (int) y3);
                        if (m9354a(a3, f, f2) && mo17706b(a3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            m9360c(motionEvent);
        } else if (m9364e(this.f8989c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f8989c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f8992f;
            int i7 = this.f8989c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f8993g[i7]);
            m9352a(this.f9005s.getLeft() + i8, this.f9005s.getTop() + i9, i8, i9);
            m9360c(motionEvent);
        }
    }

    /* renamed from: b */
    public boolean mo17704b(int i, int i2) {
        return mo17700a(this.f9005s, i, i2);
    }

    /* renamed from: a */
    private void m9351a(float f, float f2, int i) {
        int i2 = 1;
        if (!m9353a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m9353a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m9353a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m9353a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f8995i;
            iArr[i] = iArr[i] | i2;
            this.f9004r.mo17714a(i2, i);
        }
    }

    /* renamed from: a */
    private boolean m9353a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f8994h[i] & i2) != i2 || (this.f9002p & i2) == 0 || (this.f8996j[i] & i2) == i2 || (this.f8995i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f8988b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f9004r.mo17721b(i2)) {
            int[] iArr = this.f8996j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f8995i[i] & i2) != 0 || abs <= ((float) this.f8988b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private boolean m9354a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f9004r.mo17712a(view) > 0;
        boolean z2 = this.f9004r.mo17718b(view) > 0;
        if (z && z2) {
            int i = this.f8988b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f8988b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f8988b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private void m9352a(int i, int i2, int i3, int i4) {
        int left = this.f9005s.getLeft();
        int top = this.f9005s.getTop();
        if (i3 != 0) {
            i = this.f9004r.mo17713a(this.f9005s, i, i3);
            C5071v.m9187d(this.f9005s, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f9004r.mo17719b(this.f9005s, i2, i4);
            C5071v.m9189e(this.f9005s, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f9004r.mo17717a(this.f9005s, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: a */
    public boolean mo17700a(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public View mo17695a(int i, int i2) {
        for (int childCount = this.f9007u.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f9007u;
            this.f9004r.mo17711a(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }
}
