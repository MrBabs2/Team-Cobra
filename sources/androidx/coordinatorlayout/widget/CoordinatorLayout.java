package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p050l.p074g.C4942a;
import p050l.p074g.C4943b;
import p050l.p074g.C4944c;
import p050l.p075h.p083k.C5003c;
import p050l.p075h.p083k.C5005e;
import p050l.p075h.p083k.C5007g;
import p050l.p075h.p084l.C5019d;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5063n;
import p050l.p075h.p084l.C5064o;
import p050l.p075h.p084l.C5066q;
import p050l.p075h.p084l.C5067r;
import p050l.p075h.p084l.C5071v;

public class CoordinatorLayout extends ViewGroup implements C5063n, C5064o {

    /* renamed from: A */
    static final Class<?>[] f1585A = {Context.class, AttributeSet.class};

    /* renamed from: B */
    static final ThreadLocal<Map<String, Constructor<C0343c>>> f1586B = new ThreadLocal<>();

    /* renamed from: C */
    static final Comparator<View> f1587C;

    /* renamed from: D */
    private static final C5005e<Rect> f1588D = new C5007g(12);

    /* renamed from: z */
    static final String f1589z;

    /* renamed from: f */
    private final List<View> f1590f;

    /* renamed from: g */
    private final C0349a<View> f1591g;

    /* renamed from: h */
    private final List<View> f1592h;

    /* renamed from: i */
    private final List<View> f1593i;

    /* renamed from: j */
    private Paint f1594j;

    /* renamed from: k */
    private final int[] f1595k;

    /* renamed from: l */
    private final int[] f1596l;

    /* renamed from: m */
    private boolean f1597m;

    /* renamed from: n */
    private boolean f1598n;

    /* renamed from: o */
    private int[] f1599o;

    /* renamed from: p */
    private View f1600p;

    /* renamed from: q */
    private View f1601q;

    /* renamed from: r */
    private C0347g f1602r;

    /* renamed from: s */
    private boolean f1603s;

    /* renamed from: t */
    private C5020d0 f1604t;

    /* renamed from: u */
    private boolean f1605u;

    /* renamed from: v */
    private Drawable f1606v;

    /* renamed from: w */
    ViewGroup.OnHierarchyChangeListener f1607w;

    /* renamed from: x */
    private C5067r f1608x;

    /* renamed from: y */
    private final C5066q f1609y;

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    class C0341a implements C5067r {
        C0341a() {
        }

        /* renamed from: a */
        public C5020d0 mo342a(View view, C5020d0 d0Var) {
            CoordinatorLayout.this.mo2078a(d0Var);
            return d0Var;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0342b {
        C0343c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class C0343c<V extends View> {
        public C0343c() {
        }

        /* renamed from: a */
        public C5020d0 mo2130a(CoordinatorLayout coordinatorLayout, V v, C5020d0 d0Var) {
            return d0Var;
        }

        /* renamed from: a */
        public void mo2131a() {
        }

        /* renamed from: a */
        public void mo2132a(C0346f fVar) {
        }

        /* renamed from: a */
        public void mo2133a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2135a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2138a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        @Deprecated
        /* renamed from: a */
        public void mo2140a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: a */
        public boolean mo2142a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2156c(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: a */
        public boolean mo2143a(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2144a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2145a(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2146a(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2147a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2148a(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2149a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2150a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: b */
        public int mo2151b(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: b */
        public boolean mo2152b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2153b(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        @Deprecated
        /* renamed from: b */
        public boolean mo2154b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2155b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2154b(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        /* renamed from: c */
        public float mo2156c(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: c */
        public void mo2157c(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: d */
        public Parcelable mo2158d(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: d */
        public void mo2159d(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public C0343c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public void mo2141a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2140a(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: a */
        public void mo2134a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2159d(coordinatorLayout, v, view);
            }
        }

        @Deprecated
        /* renamed from: a */
        public void mo2136a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2135a(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo2137a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2136a(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public void mo2139a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2138a(coordinatorLayout, v, view, i, i2, iArr);
            }
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0344d {
        Class<? extends C0343c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class C0345e implements ViewGroup.OnHierarchyChangeListener {
        C0345e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1607w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2080a(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1607w;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    class C0347g implements ViewTreeObserver.OnPreDrawListener {
        C0347g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2080a(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    static class C0348h implements Comparator<View> {
        C0348h() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float y = C5071v.m9213y(view);
            float y2 = C5071v.m9213y(view2);
            if (y > y2) {
                return -1;
            }
            return y < y2 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f1589z = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            r0.<init>()
            f1587C = r0
            goto L_0x0021
        L_0x001f:
            f1587C = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1585A = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1586B = r0
            l.h.k.g r0 = new l.h.k.g
            r1 = 12
            r0.<init>(r1)
            f1588D = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m1653a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m1655a(Rect rect) {
        rect.setEmpty();
        f1588D.mo17457a(rect);
    }

    /* renamed from: b */
    private int m1663b(int i) {
        int[] iArr = this.f1599o;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
    }

    /* renamed from: c */
    private static int m1666c(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: d */
    private static int m1667d(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: d */
    private static Rect m1668d() {
        Rect a = f1588D.mo17456a();
        return a == null ? new Rect() : a;
    }

    /* renamed from: e */
    private static int m1670e(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private void m1671e() {
        this.f1590f.clear();
        this.f1591g.mo2183a();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0346f d = mo2096d(childAt);
            d.mo2163a(this, childAt);
            this.f1591g.mo2184a(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (d.mo2170a(this, childAt, childAt2)) {
                        if (!this.f1591g.mo2187b(childAt2)) {
                            this.f1591g.mo2184a(childAt2);
                        }
                        this.f1591g.mo2185a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1590f.addAll(this.f1591g.mo2186b());
        Collections.reverse(this.f1590f);
    }

    /* renamed from: f */
    private void m1675f(View view, int i) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        int i2 = fVar.f1622j;
        if (i2 != i) {
            C5071v.m9189e(view, i - i2);
            fVar.f1622j = i;
        }
    }

    /* renamed from: c */
    public void mo2093c(View view, int i) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        if (!fVar.mo2168a()) {
            View view2 = fVar.f1623k;
            if (view2 != null) {
                m1658a(view, view2, i);
                return;
            }
            int i2 = fVar.f1617e;
            if (i2 >= 0) {
                m1665b(view, i2, i);
            } else {
                m1669d(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0346f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        C0343c cVar = fVar.f1613a;
        if (cVar != null) {
            float c = cVar.mo2156c(this, view);
            if (c > 0.0f) {
                if (this.f1594j == null) {
                    this.f1594j = new Paint();
                }
                this.f1594j.setColor(fVar.f1613a.mo2151b(this, view));
                this.f1594j.setAlpha(m1653a(Math.round(c * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1594j);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1606v;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m1671e();
        return Collections.unmodifiableList(this.f1590f);
    }

    public final C5020d0 getLastWindowInsets() {
        return this.f1604t;
    }

    public int getNestedScrollAxes() {
        return this.f1609y.mo17608a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1606v;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1661a(false);
        if (this.f1603s) {
            if (this.f1602r == null) {
                this.f1602r = new C0347g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1602r);
        }
        if (this.f1604t == null && C5071v.m9201m(this)) {
            C5071v.m9145J(this);
        }
        this.f1598n = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1661a(false);
        if (this.f1603s && this.f1602r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1602r);
        }
        View view = this.f1601q;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1598n = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1605u && this.f1606v != null) {
            C5020d0 d0Var = this.f1604t;
            int g = d0Var != null ? d0Var.mo17482g() : 0;
            if (g > 0) {
                this.f1606v.setBounds(0, 0, getWidth(), g);
                this.f1606v.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1661a(true);
        }
        boolean a = m1662a(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1661a(true);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0343c d;
        int p = C5071v.m9204p(this);
        int size = this.f1590f.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1590f.get(i5);
            if (view.getVisibility() != 8 && ((d = ((C0346f) view.getLayoutParams()).mo2175d()) == null || !d.mo2143a(this, view, p))) {
                mo2093c(view, p);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2144a(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.m1671e()
            r30.mo2088b()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p050l.p075h.p084l.C5071v.m9204p(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            l.h.l.d0 r3 = r7.f1604t
            if (r3 == 0) goto L_0x004b
            boolean r3 = p050l.p075h.p084l.C5071v.m9201m(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f1590f
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f1590f
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0346f) r1
            int r0 = r1.f1617e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.m1663b((int) r0)
            int r11 = r1.f1615c
            int r11 = m1670e((int) r11)
            int r11 = p050l.p075h.p084l.C5019d.m8933a(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p050l.p075h.p084l.C5071v.m9201m(r20)
            if (r0 != 0) goto L_0x00f1
            l.h.l.d0 r0 = r7.f1604t
            int r0 = r0.mo17479e()
            l.h.l.d0 r2 = r7.f1604t
            int r2 = r2.mo17481f()
            int r0 = r0 + r2
            l.h.l.d0 r2 = r7.f1604t
            int r2 = r2.mo17482g()
            l.h.l.d0 r11 = r7.f1604t
            int r11 = r11.mo17478d()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.mo2175d()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo2144a((androidx.coordinatorlayout.widget.CoordinatorLayout) r1, r2, (int) r3, (int) r4, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo2082a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        C0343c d;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0346f fVar = (C0346f) childAt.getLayoutParams();
                if (fVar.mo2169a(0) && (d = fVar.mo2175d()) != null) {
                    z2 |= d.mo2150a(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2080a(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        C0343c d;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0346f fVar = (C0346f) childAt.getLayoutParams();
                if (fVar.mo2169a(0) && (d = fVar.mo2175d()) != null) {
                    z |= d.mo2149a(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo925a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo923a(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo929b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        SparseArray<Parcelable> sparseArray = savedState.f1610h;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0343c d = mo2096d(childAt).mo2175d();
            if (!(id == -1 || d == null || (parcelable2 = sparseArray.get(id)) == null)) {
                d.mo2133a(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable d;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            C0343c d2 = ((C0346f) childAt.getLayoutParams()).mo2175d();
            if (!(id == -1 || d2 == null || (d = d2.mo2158d(this, childAt)) == null)) {
                sparseArray.append(id, d);
            }
        }
        savedState.f1610h = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo927a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo922a(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1600p
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1662a((android.view.MotionEvent) r1, (int) r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1600p
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0346f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2175d()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1600p
            boolean r6 = r6.mo2152b((androidx.coordinatorlayout.widget.CoordinatorLayout) r0, r7, (android.view.MotionEvent) r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1600p
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1661a((boolean) r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        C0343c d = ((C0346f) view.getLayoutParams()).mo2175d();
        if (d == null || !d.mo2146a(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1597m) {
            m1661a(false);
            this.f1597m = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1674f();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1607w = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1606v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1606v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1606v.setState(getDrawableState());
                }
                C0414a.m2020a(this.f1606v, C5071v.m9204p(this));
                this.f1606v.setVisible(getVisibility() == 0, false);
                this.f1606v.setCallback(this);
            }
            C5071v.m9144I(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0394a.m1917c(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1606v;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1606v.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1606v;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4942a.coordinatorLayoutStyle);
    }

    /* access modifiers changed from: protected */
    public C0346f generateDefaultLayoutParams() {
        return new C0346f(-2, -2);
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0346f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0343c f1613a;

        /* renamed from: b */
        boolean f1614b = false;

        /* renamed from: c */
        public int f1615c = 0;

        /* renamed from: d */
        public int f1616d = 0;

        /* renamed from: e */
        public int f1617e = -1;

        /* renamed from: f */
        int f1618f = -1;

        /* renamed from: g */
        public int f1619g = 0;

        /* renamed from: h */
        public int f1620h = 0;

        /* renamed from: i */
        int f1621i;

        /* renamed from: j */
        int f1622j;

        /* renamed from: k */
        View f1623k;

        /* renamed from: l */
        View f1624l;

        /* renamed from: m */
        private boolean f1625m;

        /* renamed from: n */
        private boolean f1626n;

        /* renamed from: o */
        private boolean f1627o;

        /* renamed from: p */
        private boolean f1628p;

        /* renamed from: q */
        final Rect f1629q = new Rect();

        public C0346f(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public void mo2166a(C0343c cVar) {
            C0343c cVar2 = this.f1613a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2131a();
                }
                this.f1613a = cVar;
                this.f1614b = true;
                if (cVar != null) {
                    cVar.mo2132a(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2172b() {
            if (this.f1613a == null) {
                this.f1625m = false;
            }
            return this.f1625m;
        }

        /* renamed from: c */
        public int mo2174c() {
            return this.f1618f;
        }

        /* renamed from: d */
        public C0343c mo2175d() {
            return this.f1613a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo2176e() {
            return this.f1628p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Rect mo2177f() {
            return this.f1629q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo2178g() {
            this.f1628p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo2179h() {
            this.f1625m = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2173b(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1625m;
            if (z) {
                return true;
            }
            C0343c cVar = this.f1613a;
            boolean a = (cVar != null ? cVar.mo2142a(coordinatorLayout, view) : false) | z;
            this.f1625m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2165a(Rect rect) {
            this.f1629q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2168a() {
            return this.f1623k == null && this.f1618f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2171b(int i) {
            mo2164a(i, false);
        }

        /* renamed from: b */
        private boolean m1733b(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1623k.getId() != this.f1618f) {
                return false;
            }
            View view2 = this.f1623k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1624l = null;
                    this.f1623k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1624l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2164a(int i, boolean z) {
            if (i == 0) {
                this.f1626n = z;
            } else if (i == 1) {
                this.f1627o = z;
            }
        }

        C0346f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4944c.CoordinatorLayout_Layout);
            this.f1615c = obtainStyledAttributes.getInteger(C4944c.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f1618f = obtainStyledAttributes.getResourceId(C4944c.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f1616d = obtainStyledAttributes.getInteger(C4944c.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f1617e = obtainStyledAttributes.getInteger(C4944c.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f1619g = obtainStyledAttributes.getInt(C4944c.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f1620h = obtainStyledAttributes.getInt(C4944c.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(C4944c.CoordinatorLayout_Layout_layout_behavior);
            this.f1614b = hasValue;
            if (hasValue) {
                this.f1613a = CoordinatorLayout.m1654a(context, attributeSet, obtainStyledAttributes.getString(C4944c.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            C0343c cVar = this.f1613a;
            if (cVar != null) {
                cVar.mo2132a(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2169a(int i) {
            if (i == 0) {
                return this.f1626n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1627o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2167a(boolean z) {
            this.f1628p = z;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f1613a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo2170a(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f1624l
                if (r4 == r0) goto L_0x001b
                int r0 = p050l.p075h.p084l.C5071v.m9204p(r2)
                boolean r0 = r1.m1732a((android.view.View) r4, (int) r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1613a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo2148a((androidx.coordinatorlayout.widget.CoordinatorLayout) r2, r3, (android.view.View) r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0346f.mo2170a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo2163a(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1618f == -1) {
                this.f1624l = null;
                this.f1623k = null;
                return null;
            }
            if (this.f1623k == null || !m1733b(view, coordinatorLayout)) {
                m1731a(view, coordinatorLayout);
            }
            return this.f1623k;
        }

        /* renamed from: a */
        private void m1731a(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1618f);
            this.f1623k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f1624l = null;
                            this.f1623k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1624l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f1624l = null;
                    this.f1623k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f1624l = null;
                this.f1623k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1618f) + " to anchor view " + view);
            }
        }

        public C0346f(C0346f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        private boolean m1732a(View view, int i) {
            int a = C5019d.m8933a(((C0346f) view.getLayoutParams()).f1619g, i);
            return a != 0 && (C5019d.m8933a(this.f1620h, i) & a) == a;
        }

        public C0346f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0346f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.f1590f = new ArrayList();
        this.f1591g = new C0349a<>();
        this.f1592h = new ArrayList();
        this.f1593i = new ArrayList();
        this.f1595k = new int[2];
        this.f1596l = new int[2];
        this.f1609y = new C5066q(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, C4944c.CoordinatorLayout, 0, C4943b.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, C4944c.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, C4944c.CoordinatorLayout, attributeSet, typedArray, 0, C4943b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, C4944c.CoordinatorLayout, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(C4944c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1599o = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1599o.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f1599o;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f1606v = typedArray.getDrawable(C4944c.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        m1674f();
        super.setOnHierarchyChangeListener(new C0345e());
        if (C5071v.m9202n(this) == 0) {
            C5071v.m9195h(this, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5020d0 mo2078a(C5020d0 d0Var) {
        if (!C5003c.m8889a(this.f1604t, d0Var)) {
            this.f1604t = d0Var;
            boolean z = true;
            boolean z2 = d0Var != null && d0Var.mo17482g() > 0;
            this.f1605u = z2;
            if (z2 || getBackground() != null) {
                z = false;
            }
            setWillNotDraw(z);
            m1664b(d0Var);
            requestLayout();
        }
        return d0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0346f mo2096d(View view) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        if (!fVar.f1614b) {
            if (view instanceof C0342b) {
                C0343c behavior = ((C0342b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo2166a(behavior);
                fVar.f1614b = true;
            } else {
                C0344d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (C0344d) cls.getAnnotation(C0344d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2166a((C0343c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                fVar.f1614b = true;
            }
        }
        return fVar;
    }

    public C0346f generateLayoutParams(AttributeSet attributeSet) {
        return new C0346f(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0346f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0346f) {
            return new C0346f((C0346f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0346f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0346f(layoutParams);
    }

    /* renamed from: f */
    private void m1674f() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C5071v.m9201m(this)) {
                if (this.f1608x == null) {
                    this.f1608x = new C0341a();
                }
                C5071v.m9169a((View) this, this.f1608x);
                setSystemUiVisibility(1280);
                return;
            }
            C5071v.m9169a((View) this, (C5067r) null);
        }
    }

    /* renamed from: b */
    private C5020d0 m1664b(C5020d0 d0Var) {
        C0343c d;
        if (d0Var.mo17485i()) {
            return d0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C5071v.m9201m(childAt) && (d = ((C0346f) childAt.getLayoutParams()).mo2175d()) != null) {
                d.mo2130a(this, childAt, d0Var);
                if (d0Var.mo17485i()) {
                    break;
                }
            }
        }
        return d0Var;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0340a();

        /* renamed from: h */
        SparseArray<Parcelable> f1610h;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        static class C0340a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0340a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1610h = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1610h.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1610h;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1610h.keyAt(i2);
                parcelableArr[i2] = this.f1610h.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: a */
    private void m1661a(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0343c d = ((C0346f) childAt.getLayoutParams()).mo2175d();
            if (d != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    d.mo2147a(this, childAt, obtain);
                } else {
                    d.mo2152b(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0346f) getChildAt(i2).getLayoutParams()).mo2179h();
        }
        this.f1600p = null;
        this.f1597m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2094c(View view, Rect rect) {
        ((C0346f) view.getLayoutParams()).mo2165a(rect);
    }

    /* renamed from: c */
    public List<View> mo2091c(View view) {
        List c = this.f1591g.mo2188c(view);
        this.f1593i.clear();
        if (c != null) {
            this.f1593i.addAll(c);
        }
        return this.f1593i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2090b(View view, Rect rect) {
        rect.set(((C0346f) view.getLayoutParams()).mo2177f());
    }

    /* renamed from: e */
    private void m1672e(View view, int i) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        int i2 = fVar.f1621i;
        if (i2 != i) {
            C5071v.m9187d(view, i - i2);
            fVar.f1621i = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2092c() {
        if (this.f1598n && this.f1602r != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1602r);
        }
        this.f1603s = false;
    }

    /* renamed from: b */
    private void m1665b(View view, int i, int i2) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        int a = C5019d.m8933a(m1670e(fVar.f1615c), i2);
        int i3 = a & 7;
        int i4 = a & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int b = m1663b(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            b += measuredWidth / 2;
        } else if (i3 == 5) {
            b += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: d */
    private void m1669d(View view, int i) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        Rect d = m1668d();
        d.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f1604t != null && C5071v.m9201m(this) && !C5071v.m9201m(view)) {
            d.left += this.f1604t.mo17479e();
            d.top += this.f1604t.mo17482g();
            d.right -= this.f1604t.mo17481f();
            d.bottom -= this.f1604t.mo17478d();
        }
        Rect d2 = m1668d();
        C5019d.m8934a(m1667d(fVar.f1615c), view.getMeasuredWidth(), view.getMeasuredHeight(), d, d2, i);
        view.layout(d2.left, d2.top, d2.right, d2.bottom);
        m1655a(d);
        m1655a(d2);
    }

    /* renamed from: e */
    private boolean m1673e(View view) {
        return this.f1591g.mo2190e(view);
    }

    /* renamed from: a */
    private void m1660a(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1587C;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: a */
    private boolean m1662a(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1592h;
        m1660a(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0346f fVar = (C0346f) view.getLayoutParams();
            C0343c d = fVar.mo2175d();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && d != null) {
                    if (i2 == 0) {
                        z = d.mo2147a(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = d.mo2152b(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f1600p = view;
                    }
                }
                boolean b = fVar.mo2172b();
                boolean b2 = fVar.mo2173b(this, view);
                z2 = b2 && !b;
                if (b2 && !z2) {
                    break;
                }
            } else if (d != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    d.mo2147a(this, view, motionEvent3);
                } else if (i2 == 1) {
                    d.mo2152b(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: b */
    public List<View> mo2087b(View view) {
        List<View> d = this.f1591g.mo2189d(view);
        this.f1593i.clear();
        if (d != null) {
            this.f1593i.addAll(d);
        }
        return this.f1593i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2088b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1673e(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1603s) {
            return;
        }
        if (z) {
            mo2079a();
        } else {
            mo2092c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2089b(View view, int i) {
        C0343c d;
        View view2 = view;
        C0346f fVar = (C0346f) view.getLayoutParams();
        if (fVar.f1623k != null) {
            Rect d2 = m1668d();
            Rect d3 = m1668d();
            Rect d4 = m1668d();
            mo2084a(fVar.f1623k, d2);
            boolean z = false;
            mo2085a(view2, false, d3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            m1656a(view, i, d2, d4, fVar, measuredWidth, measuredHeight);
            if (!(d4.left == d3.left && d4.top == d3.top)) {
                z = true;
            }
            m1659a(fVar, d4, measuredWidth, i2);
            int i3 = d4.left - d3.left;
            int i4 = d4.top - d3.top;
            if (i3 != 0) {
                C5071v.m9187d(view2, i3);
            }
            if (i4 != 0) {
                C5071v.m9189e(view2, i4);
            }
            if (z && (d = fVar.mo2175d()) != null) {
                d.mo2153b(this, view2, fVar.f1623k);
            }
            m1655a(d2);
            m1655a(d3);
            m1655a(d4);
        }
    }

    /* renamed from: a */
    static C0343c m1654a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f1589z)) {
            str = f1589z + '.' + str;
        }
        try {
            Map map = f1586B.get();
            if (map == null) {
                map = new HashMap();
                f1586B.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1585A);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (C0343c) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2084a(View view, Rect rect) {
        C0350b.m1763a((ViewGroup) this, view, rect);
    }

    /* renamed from: a */
    public void mo2082a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2085a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2084a(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: b */
    public void mo929b(View view, View view2, int i, int i2) {
        C0343c d;
        this.f1609y.mo17612a(view, view2, i, i2);
        this.f1601q = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0346f fVar = (C0346f) childAt.getLayoutParams();
            if (fVar.mo2169a(i2) && (d = fVar.mo2175d()) != null) {
                d.mo2141a(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: a */
    private void m1656a(View view, int i, Rect rect, Rect rect2, C0346f fVar, int i2, int i3) {
        int i4;
        int i5;
        int a = C5019d.m8933a(m1666c(fVar.f1615c), i);
        int a2 = C5019d.m8933a(m1667d(fVar.f1616d), i);
        int i6 = a & 7;
        int i7 = a & 112;
        int i8 = a2 & 7;
        int i9 = a2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    /* renamed from: a */
    private void m1659a(C0346f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2083a(View view, int i, Rect rect, Rect rect2) {
        C0346f fVar = (C0346f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1656a(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m1659a(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* renamed from: a */
    private void m1658a(View view, View view2, int i) {
        Rect d = m1668d();
        Rect d2 = m1668d();
        try {
            mo2084a(view2, d);
            mo2083a(view, i, d, d2);
            view.layout(d2.left, d2.top, d2.right, d2.bottom);
        } finally {
            m1655a(d);
            m1655a(d2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2080a(int i) {
        boolean z;
        int i2 = i;
        int p = C5071v.m9204p(this);
        int size = this.f1590f.size();
        Rect d = m1668d();
        Rect d2 = m1668d();
        Rect d3 = m1668d();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f1590f.get(i3);
            C0346f fVar = (C0346f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f1624l == this.f1590f.get(i4)) {
                        mo2089b(view, p);
                    }
                }
                mo2085a(view, true, d2);
                if (fVar.f1619g != 0 && !d2.isEmpty()) {
                    int a = C5019d.m8933a(fVar.f1619g, p);
                    int i5 = a & 112;
                    if (i5 == 48) {
                        d.top = Math.max(d.top, d2.bottom);
                    } else if (i5 == 80) {
                        d.bottom = Math.max(d.bottom, getHeight() - d2.top);
                    }
                    int i6 = a & 7;
                    if (i6 == 3) {
                        d.left = Math.max(d.left, d2.right);
                    } else if (i6 == 5) {
                        d.right = Math.max(d.right, getWidth() - d2.left);
                    }
                }
                if (fVar.f1620h != 0 && view.getVisibility() == 0) {
                    m1657a(view, d, p);
                }
                if (i2 != 2) {
                    mo2090b(view, d3);
                    if (!d3.equals(d2)) {
                        mo2094c(view, d2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f1590f.get(i7);
                    C0346f fVar2 = (C0346f) view2.getLayoutParams();
                    C0343c d4 = fVar2.mo2175d();
                    if (d4 != null && d4.mo2148a(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo2176e()) {
                            if (i2 != 2) {
                                z = d4.mo2153b(this, view2, view);
                            } else {
                                d4.mo2157c(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo2167a(z);
                            }
                        } else {
                            fVar2.mo2178g();
                        }
                    }
                }
            }
        }
        m1655a(d);
        m1655a(d2);
        m1655a(d3);
    }

    /* renamed from: a */
    private void m1657a(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C5071v.m9140E(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0346f fVar = (C0346f) view.getLayoutParams();
            C0343c d = fVar.mo2175d();
            Rect d2 = m1668d();
            Rect d3 = m1668d();
            d3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (d == null || !d.mo2145a(this, view, d2)) {
                d2.set(d3);
            } else if (!d3.contains(d2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + d2.toShortString() + " | Bounds:" + d3.toShortString());
            }
            m1655a(d3);
            if (d2.isEmpty()) {
                m1655a(d2);
                return;
            }
            int a = C5019d.m8933a(fVar.f1620h, i);
            boolean z3 = true;
            if ((a & 48) != 48 || (i6 = (d2.top - fVar.topMargin) - fVar.f1622j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m1675f(view, i7 - i6);
                z = true;
            }
            if ((a & 80) == 80 && (height = ((getHeight() - d2.bottom) - fVar.bottomMargin) + fVar.f1622j) < (i5 = rect.bottom)) {
                m1675f(view, height - i5);
                z = true;
            }
            if (!z) {
                m1675f(view, 0);
            }
            if ((a & 3) != 3 || (i3 = (d2.left - fVar.leftMargin) - fVar.f1621i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m1672e(view, i4 - i3);
                z2 = true;
            }
            if ((a & 5) != 5 || (width = ((getWidth() - d2.right) - fVar.rightMargin) + fVar.f1621i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m1672e(view, width - i2);
            }
            if (!z3) {
                m1672e(view, 0);
            }
            m1655a(d2);
        }
    }

    /* renamed from: a */
    public void mo2081a(View view) {
        List c = this.f1591g.mo2188c(view);
        if (c != null && !c.isEmpty()) {
            for (int i = 0; i < c.size(); i++) {
                View view2 = (View) c.get(i);
                C0343c d = ((C0346f) view2.getLayoutParams()).mo2175d();
                if (d != null) {
                    d.mo2153b(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2079a() {
        if (this.f1598n) {
            if (this.f1602r == null) {
                this.f1602r = new C0347g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1602r);
        }
        this.f1603s = true;
    }

    /* renamed from: a */
    public boolean mo2086a(View view, int i, int i2) {
        Rect d = m1668d();
        mo2084a(view, d);
        try {
            return d.contains(i, i2);
        } finally {
            m1655a(d);
        }
    }

    /* renamed from: a */
    public boolean mo927a(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0346f fVar = (C0346f) childAt.getLayoutParams();
                C0343c d = fVar.mo2175d();
                if (d != null) {
                    boolean b = d.mo2155b(this, childAt, view, view2, i, i2);
                    z |= b;
                    fVar.mo2164a(i3, b);
                } else {
                    fVar.mo2164a(i3, false);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo922a(View view, int i) {
        this.f1609y.mo17610a(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0346f fVar = (C0346f) childAt.getLayoutParams();
            if (fVar.mo2169a(i)) {
                C0343c d = fVar.mo2175d();
                if (d != null) {
                    d.mo2134a(this, childAt, view, i);
                }
                fVar.mo2171b(i);
                fVar.mo2178g();
            }
        }
        this.f1601q = null;
    }

    /* renamed from: a */
    public void mo923a(View view, int i, int i2, int i3, int i4, int i5) {
        mo924a(view, i, i2, i3, i4, 0, this.f1596l);
    }

    /* renamed from: a */
    public void mo924a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C0343c d;
        int i6;
        int i7;
        int childCount = getChildCount();
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0346f fVar = (C0346f) childAt.getLayoutParams();
                if (fVar.mo2169a(i5) && (d = fVar.mo2175d()) != null) {
                    int[] iArr2 = this.f1595k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    d.mo2137a(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f1595k;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        i7 = Math.max(i9, this.f1595k[1]);
                    } else {
                        i7 = Math.min(i9, this.f1595k[1]);
                    }
                    i9 = i7;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z) {
            mo2080a(1);
        }
    }

    /* renamed from: a */
    public void mo925a(View view, int i, int i2, int[] iArr, int i3) {
        C0343c d;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0346f fVar = (C0346f) childAt.getLayoutParams();
                if (fVar.mo2169a(i3) && (d = fVar.mo2175d()) != null) {
                    int[] iArr2 = this.f1595k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    d.mo2139a(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1595k;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.f1595k;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            mo2080a(1);
        }
    }
}
