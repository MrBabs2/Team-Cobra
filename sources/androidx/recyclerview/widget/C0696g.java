package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: FastScroller */
class C0696g extends RecyclerView.C0643n implements RecyclerView.C0652s {

    /* renamed from: D */
    private static final int[] f2641D = {16842919};

    /* renamed from: E */
    private static final int[] f2642E = new int[0];

    /* renamed from: A */
    int f2643A = 0;

    /* renamed from: B */
    private final Runnable f2644B = new C0697a();

    /* renamed from: C */
    private final RecyclerView.C0653t f2645C = new C0698b();

    /* renamed from: a */
    private final int f2646a;

    /* renamed from: b */
    private final int f2647b;

    /* renamed from: c */
    final StateListDrawable f2648c;

    /* renamed from: d */
    final Drawable f2649d;

    /* renamed from: e */
    private final int f2650e;

    /* renamed from: f */
    private final int f2651f;

    /* renamed from: g */
    private final StateListDrawable f2652g;

    /* renamed from: h */
    private final Drawable f2653h;

    /* renamed from: i */
    private final int f2654i;

    /* renamed from: j */
    private final int f2655j;

    /* renamed from: k */
    int f2656k;

    /* renamed from: l */
    int f2657l;

    /* renamed from: m */
    float f2658m;

    /* renamed from: n */
    int f2659n;

    /* renamed from: o */
    int f2660o;

    /* renamed from: p */
    float f2661p;

    /* renamed from: q */
    private int f2662q = 0;

    /* renamed from: r */
    private int f2663r = 0;

    /* renamed from: s */
    private RecyclerView f2664s;

    /* renamed from: t */
    private boolean f2665t = false;

    /* renamed from: u */
    private boolean f2666u = false;

    /* renamed from: v */
    private int f2667v = 0;

    /* renamed from: w */
    private int f2668w = 0;

    /* renamed from: x */
    private final int[] f2669x = new int[2];

    /* renamed from: y */
    private final int[] f2670y = new int[2];

    /* renamed from: z */
    final ValueAnimator f2671z = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* compiled from: FastScroller */
    class C0697a implements Runnable {
        C0697a() {
        }

        public void run() {
            C0696g.this.mo4208a(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* compiled from: FastScroller */
    class C0698b extends RecyclerView.C0653t {
        C0698b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C0696g.this.mo4209a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    /* compiled from: FastScroller */
    private class C0699c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2674a = false;

        C0699c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f2674a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2674a) {
                this.f2674a = false;
            } else if (((Float) C0696g.this.f2671z.getAnimatedValue()).floatValue() == 0.0f) {
                C0696g gVar = C0696g.this;
                gVar.f2643A = 0;
                gVar.mo4213b(0);
            } else {
                C0696g gVar2 = C0696g.this;
                gVar2.f2643A = 2;
                gVar2.mo4207a();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    /* compiled from: FastScroller */
    private class C0700d implements ValueAnimator.AnimatorUpdateListener {
        C0700d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0696g.this.f2648c.setAlpha(floatValue);
            C0696g.this.f2649d.setAlpha(floatValue);
            C0696g.this.mo4207a();
        }
    }

    C0696g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f2648c = stateListDrawable;
        this.f2649d = drawable;
        this.f2652g = stateListDrawable2;
        this.f2653h = drawable2;
        this.f2650e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f2651f = Math.max(i, drawable.getIntrinsicWidth());
        this.f2654i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f2655j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2646a = i2;
        this.f2647b = i3;
        this.f2648c.setAlpha(255);
        this.f2649d.setAlpha(255);
        this.f2671z.addListener(new C0699c());
        this.f2671z.addUpdateListener(new C0700d());
        mo4210a(recyclerView);
    }

    /* renamed from: c */
    private void m3288c() {
        this.f2664s.removeCallbacks(this.f2644B);
    }

    /* renamed from: d */
    private void m3290d() {
        this.f2664s.removeItemDecoration(this);
        this.f2664s.removeOnItemTouchListener(this);
        this.f2664s.removeOnScrollListener(this.f2645C);
        m3288c();
    }

    /* renamed from: e */
    private int[] m3291e() {
        int[] iArr = this.f2670y;
        int i = this.f2647b;
        iArr[0] = i;
        iArr[1] = this.f2662q - i;
        return iArr;
    }

    /* renamed from: f */
    private int[] m3292f() {
        int[] iArr = this.f2669x;
        int i = this.f2647b;
        iArr[0] = i;
        iArr[1] = this.f2663r - i;
        return iArr;
    }

    /* renamed from: g */
    private boolean m3293g() {
        return C5071v.m9204p(this.f2664s) == 1;
    }

    /* renamed from: h */
    private void m3294h() {
        this.f2664s.addItemDecoration(this);
        this.f2664s.addOnItemTouchListener(this);
        this.f2664s.addOnScrollListener(this.f2645C);
    }

    /* renamed from: a */
    public void mo4210a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2664s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3290d();
            }
            this.f2664s = recyclerView;
            if (recyclerView != null) {
                m3294h();
            }
        }
    }

    /* renamed from: a */
    public void mo3966a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4213b(int i) {
        if (i == 2 && this.f2667v != 2) {
            this.f2648c.setState(f2641D);
            m3288c();
        }
        if (i == 0) {
            mo4207a();
        } else {
            mo4212b();
        }
        if (this.f2667v == 2 && i != 2) {
            this.f2648c.setState(f2642E);
            m3289c(1200);
        } else if (i == 1) {
            m3289c(1500);
        }
        this.f2667v = i;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        if (this.f2662q != this.f2664s.getWidth() || this.f2663r != this.f2664s.getHeight()) {
            this.f2662q = this.f2664s.getWidth();
            this.f2663r = this.f2664s.getHeight();
            mo4213b(0);
        } else if (this.f2643A != 0) {
            if (this.f2665t) {
                m3287b(canvas);
            }
            if (this.f2666u) {
                m3285a(canvas);
            }
        }
    }

    /* renamed from: c */
    private void m3289c(int i) {
        m3288c();
        this.f2664s.postDelayed(this.f2644B, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4207a() {
        this.f2664s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4208a(int i) {
        int i2 = this.f2643A;
        if (i2 == 1) {
            this.f2671z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f2643A = 3;
        ValueAnimator valueAnimator = this.f2671z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f2671z.setDuration((long) i);
        this.f2671z.start();
    }

    /* renamed from: b */
    public void mo4212b() {
        int i = this.f2643A;
        if (i != 0) {
            if (i == 3) {
                this.f2671z.cancel();
            } else {
                return;
            }
        }
        this.f2643A = 1;
        ValueAnimator valueAnimator = this.f2671z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f2671z.setDuration(500);
        this.f2671z.setStartDelay(0);
        this.f2671z.start();
    }

    /* renamed from: a */
    private void m3285a(Canvas canvas) {
        int i = this.f2663r;
        int i2 = this.f2654i;
        int i3 = i - i2;
        int i4 = this.f2660o;
        int i5 = this.f2659n;
        int i6 = i4 - (i5 / 2);
        this.f2652g.setBounds(0, 0, i5, i2);
        this.f2653h.setBounds(0, 0, this.f2662q, this.f2655j);
        canvas.translate(0.0f, (float) i3);
        this.f2653h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f2652g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: b */
    private void m3287b(Canvas canvas) {
        int i = this.f2662q;
        int i2 = this.f2650e;
        int i3 = i - i2;
        int i4 = this.f2657l;
        int i5 = this.f2656k;
        int i6 = i4 - (i5 / 2);
        this.f2648c.setBounds(0, 0, i2, i5);
        this.f2649d.setBounds(0, 0, this.f2651f, this.f2663r);
        if (m3293g()) {
            this.f2649d.draw(canvas);
            canvas.translate((float) this.f2650e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f2648c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f2650e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f2649d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f2648c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4209a(int i, int i2) {
        int computeVerticalScrollRange = this.f2664s.computeVerticalScrollRange();
        int i3 = this.f2663r;
        this.f2665t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f2646a;
        int computeHorizontalScrollRange = this.f2664s.computeHorizontalScrollRange();
        int i4 = this.f2662q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f2646a;
        this.f2666u = z;
        if (this.f2665t || z) {
            if (this.f2665t) {
                float f = (float) i3;
                this.f2657l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f2656k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f2666u) {
                float f2 = (float) i4;
                this.f2660o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f2659n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f2667v;
            if (i5 == 0 || i5 == 1) {
                mo4213b(1);
            }
        } else if (this.f2667v != 0) {
            mo4213b(0);
        }
    }

    /* renamed from: b */
    public boolean mo3967b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f2667v;
        if (i == 1) {
            boolean b = mo4214b(motionEvent.getX(), motionEvent.getY());
            boolean a = mo4211a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b && !a) {
                return false;
            }
            if (a) {
                this.f2668w = 1;
                this.f2661p = (float) ((int) motionEvent.getX());
            } else if (b) {
                this.f2668w = 2;
                this.f2658m = (float) ((int) motionEvent.getY());
            }
            mo4213b(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo3965a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2667v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = mo4214b(motionEvent.getX(), motionEvent.getY());
                boolean a = mo4211a(motionEvent.getX(), motionEvent.getY());
                if (b || a) {
                    if (a) {
                        this.f2668w = 1;
                        this.f2661p = (float) ((int) motionEvent.getX());
                    } else if (b) {
                        this.f2668w = 2;
                        this.f2658m = (float) ((int) motionEvent.getY());
                    }
                    mo4213b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f2667v == 2) {
                this.f2658m = 0.0f;
                this.f2661p = 0.0f;
                mo4213b(1);
                this.f2668w = 0;
            } else if (motionEvent.getAction() == 2 && this.f2667v == 2) {
                mo4212b();
                if (this.f2668w == 1) {
                    m3284a(motionEvent.getX());
                }
                if (this.f2668w == 2) {
                    m3286b(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    private void m3286b(float f) {
        int[] f2 = m3292f();
        float max = Math.max((float) f2[0], Math.min((float) f2[1], f));
        if (Math.abs(((float) this.f2657l) - max) >= 2.0f) {
            int a = m3283a(this.f2658m, max, f2, this.f2664s.computeVerticalScrollRange(), this.f2664s.computeVerticalScrollOffset(), this.f2663r);
            if (a != 0) {
                this.f2664s.scrollBy(0, a);
            }
            this.f2658m = max;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4214b(float f, float f2) {
        if (!m3293g() ? f >= ((float) (this.f2662q - this.f2650e)) : f <= ((float) (this.f2650e / 2))) {
            int i = this.f2657l;
            int i2 = this.f2656k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* renamed from: a */
    private void m3284a(float f) {
        int[] e = m3291e();
        float max = Math.max((float) e[0], Math.min((float) e[1], f));
        if (Math.abs(((float) this.f2660o) - max) >= 2.0f) {
            int a = m3283a(this.f2661p, max, e, this.f2664s.computeHorizontalScrollRange(), this.f2664s.computeHorizontalScrollOffset(), this.f2662q);
            if (a != 0) {
                this.f2664s.scrollBy(a, 0);
            }
            this.f2661p = max;
        }
    }

    /* renamed from: a */
    private int m3283a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4211a(float f, float f2) {
        if (f2 >= ((float) (this.f2663r - this.f2654i))) {
            int i = this.f2660o;
            int i2 = this.f2659n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }
}
