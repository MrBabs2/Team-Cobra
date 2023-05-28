package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5060k;
import p050l.p075h.p084l.C5062m;
import p050l.p075h.p084l.C5064o;
import p050l.p075h.p084l.C5066q;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5041e;

public class NestedScrollView extends FrameLayout implements C5064o, C5060k {

    /* renamed from: F */
    private static final C0424a f1831F = new C0424a();

    /* renamed from: G */
    private static final int[] f1832G = {16843130};

    /* renamed from: A */
    private SavedState f1833A;

    /* renamed from: B */
    private final C5066q f1834B;

    /* renamed from: C */
    private final C5062m f1835C;

    /* renamed from: D */
    private float f1836D;

    /* renamed from: E */
    private C0425b f1837E;

    /* renamed from: f */
    private long f1838f;

    /* renamed from: g */
    private final Rect f1839g;

    /* renamed from: h */
    private OverScroller f1840h;

    /* renamed from: i */
    private EdgeEffect f1841i;

    /* renamed from: j */
    private EdgeEffect f1842j;

    /* renamed from: k */
    private int f1843k;

    /* renamed from: l */
    private boolean f1844l;

    /* renamed from: m */
    private boolean f1845m;

    /* renamed from: n */
    private View f1846n;

    /* renamed from: o */
    private boolean f1847o;

    /* renamed from: p */
    private VelocityTracker f1848p;

    /* renamed from: q */
    private boolean f1849q;

    /* renamed from: r */
    private boolean f1850r;

    /* renamed from: s */
    private int f1851s;

    /* renamed from: t */
    private int f1852t;

    /* renamed from: u */
    private int f1853u;

    /* renamed from: v */
    private int f1854v;

    /* renamed from: w */
    private final int[] f1855w;

    /* renamed from: x */
    private final int[] f1856x;

    /* renamed from: y */
    private int f1857y;

    /* renamed from: z */
    private int f1858z;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0423a();

        /* renamed from: f */
        public int f1859f;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        class C0423a implements Parcelable.Creator<SavedState> {
            C0423a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1859f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1859f);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1859f = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public interface C0425b {
        /* renamed from: a */
        void mo165a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m2044a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: e */
    private void m2061e() {
        VelocityTracker velocityTracker = this.f1848p;
        if (velocityTracker == null) {
            this.f1848p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: g */
    private void m2063g() {
        if (this.f1848p == null) {
            this.f1848p = VelocityTracker.obtain();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1836D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1836D = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1836D;
    }

    /* renamed from: h */
    private void m2065h() {
        VelocityTracker velocityTracker = this.f1848p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1848p = null;
        }
    }

    /* renamed from: a */
    public void mo2377a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f1835C.mo17593a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo927a(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo929b(View view, View view2, int i, int i2) {
        this.f1834B.mo17612a(view, view2, i, i2);
        mo2391c(2, i2);
    }

    /* renamed from: c */
    public boolean mo2391c(int i, int i2) {
        return this.f1835C.mo17599a(i, i2);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f1840h.isFinished()) {
            this.f1840h.computeScrollOffset();
            int currY = this.f1840h.getCurrY();
            int i = currY - this.f1858z;
            this.f1858z = currY;
            int[] iArr = this.f1856x;
            boolean z = false;
            iArr[1] = 0;
            mo2382a(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f1856x[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo2381a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f1856x;
                iArr2[1] = 0;
                mo2377a(0, scrollY2, 0, i3, this.f1855w, 1, iArr2);
                i2 = i3 - this.f1856x[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m2059d();
                    if (i2 < 0) {
                        if (this.f1841i.isFinished()) {
                            this.f1841i.onAbsorb((int) this.f1840h.getCurrVelocity());
                        }
                    } else if (this.f1842j.isFinished()) {
                        this.f1842j.onAbsorb((int) this.f1840h.getCurrVelocity());
                    }
                }
                m2046a();
            }
            if (!this.f1840h.isFinished()) {
                C5071v.m9144I(this);
            } else {
                mo2407f(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean mo2399d(int i) {
        return this.f1835C.mo17598a(i);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo2383a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f1835C.mo17597a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f1835C.mo17596a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo2382a(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f1835C.mo17600a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1841i != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f1841i.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f1841i.setSize(width, height);
                if (this.f1841i.draw(canvas)) {
                    C5071v.m9144I(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f1842j.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f1842j.setSize(width2, height2);
                if (this.f1842j.draw(canvas)) {
                    C5071v.m9144I(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* renamed from: f */
    public void mo2407f(int i) {
        this.f1835C.mo17607c(i);
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1834B.mo17608a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return mo2399d(0);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1835C.mo17604b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1845m = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1847o) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f1847o) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f1854v;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f1843k) > this.f1851s && (2 & getNestedScrollAxes()) == 0) {
                                this.f1847o = true;
                                this.f1843k = y;
                                m2063g();
                                this.f1848p.addMovement(motionEvent);
                                this.f1857y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m2048a(motionEvent);
                    }
                }
            }
            this.f1847o = false;
            this.f1854v = -1;
            m2065h();
            if (this.f1840h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C5071v.m9144I(this);
            }
            mo2407f(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m2060d((int) motionEvent.getX(), y2)) {
                this.f1847o = false;
                m2065h();
            } else {
                this.f1843k = y2;
                this.f1854v = motionEvent.getPointerId(0);
                m2061e();
                this.f1848p.addMovement(motionEvent);
                this.f1840h.computeScrollOffset();
                this.f1847o = !this.f1840h.isFinished();
                mo2391c(2, 0);
            }
        }
        return this.f1847o;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1844l = false;
        View view = this.f1846n;
        if (view != null && m2053a(view, (View) this)) {
            m2055b(this.f1846n);
        }
        this.f1846n = null;
        if (!this.f1845m) {
            if (this.f1833A != null) {
                scrollTo(getScrollX(), this.f1833A.f1859f);
                this.f1833A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m2044a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1845m = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1849q && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo2388b((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo925a(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m2047a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo929b(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m2051a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1833A = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1859f = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0425b bVar = this.f1837E;
        if (bVar != null) {
            bVar.mo165a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m2052a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f1839g);
            offsetDescendantRectToMyCoords(findFocus, this.f1839g);
            m2064g(mo2375a(this.f1839g));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo927a(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo922a(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        m2063g();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1857y = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f1857y);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1848p;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f1853u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1854v);
                if (Math.abs(yVelocity) >= this.f1852t) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo2388b(i);
                    }
                } else if (this.f1840h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C5071v.m9144I(this);
                }
                this.f1854v = -1;
                m2058c();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f1854v);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1854v + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f1843k - y;
                    if (!this.f1847o && Math.abs(i2) > this.f1851s) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1847o = true;
                        i2 = i2 > 0 ? i2 - this.f1851s : i2 + this.f1851s;
                    }
                    int i3 = i2;
                    if (this.f1847o) {
                        if (mo2382a(0, i3, this.f1856x, this.f1855w, 0)) {
                            i3 -= this.f1856x[1];
                            this.f1857y += this.f1855w[1];
                        }
                        int i4 = i3;
                        this.f1843k = y - this.f1855w[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i5 = scrollRange;
                        if (mo2381a(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !mo2399d(0)) {
                            this.f1848p.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f1856x;
                        iArr[1] = 0;
                        mo2377a(0, scrollY2, 0, i4 - scrollY2, this.f1855w, 0, iArr);
                        int i6 = this.f1843k;
                        int[] iArr2 = this.f1855w;
                        this.f1843k = i6 - iArr2[1];
                        this.f1857y += iArr2[1];
                        if (z) {
                            int i7 = i4 - this.f1856x[1];
                            m2059d();
                            int i8 = scrollY + i7;
                            if (i8 < 0) {
                                C0431d.m2131a(this.f1841i, ((float) i7) / ((float) getHeight()), motionEvent2.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.f1842j.isFinished()) {
                                    this.f1842j.onRelease();
                                }
                            } else if (i8 > i5) {
                                C0431d.m2131a(this.f1842j, ((float) i7) / ((float) getHeight()), 1.0f - (motionEvent2.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.f1841i.isFinished()) {
                                    this.f1841i.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f1841i;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f1842j.isFinished())) {
                                C5071v.m9144I(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1847o && getChildCount() > 0 && this.f1840h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C5071v.m9144I(this);
                }
                this.f1854v = -1;
                m2058c();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1843k = (int) motionEvent2.getY(actionIndex);
                this.f1854v = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m2048a(motionEvent);
                this.f1843k = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f1854v));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f1840h.isFinished();
            this.f1847o = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1840h.isFinished()) {
                m2046a();
            }
            this.f1843k = (int) motionEvent.getY();
            this.f1854v = motionEvent2.getPointerId(0);
            mo2391c(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f1848p;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1844l) {
            m2055b(view2);
        } else {
            this.f1846n = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m2050a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m2065h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f1844l = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int a = m2044a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int a2 = m2044a(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1849q) {
            this.f1849q = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f1835C.mo17594a(z);
    }

    public void setOnScrollChangeListener(C0425b bVar) {
        this.f1837E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1850r = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo2391c(i, 0);
    }

    public void stopNestedScroll() {
        mo2407f(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    private boolean m2060d(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m2062f() {
        this.f1840h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1851s = viewConfiguration.getScaledTouchSlop();
        this.f1852t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1853u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public boolean mo2382a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f1835C.mo17603a(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: c */
    public boolean mo2390c(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1839g;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1839g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1839g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1839g;
        return m2057b(i, rect3.top, rect3.bottom);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1839g = new Rect();
        this.f1844l = true;
        this.f1845m = false;
        this.f1846n = null;
        this.f1847o = false;
        this.f1850r = true;
        this.f1854v = -1;
        this.f1855w = new int[2];
        this.f1856x = new int[2];
        m2062f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1832G, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1834B = new C5066q(this);
        this.f1835C = new C5062m(this);
        setNestedScrollingEnabled(true);
        C5071v.m9165a((View) this, (C5010a) f1831F);
    }

    /* renamed from: b */
    private boolean m2056b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m2064g(int i) {
        if (i == 0) {
            return;
        }
        if (this.f1850r) {
            mo2376a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: a */
    public void mo924a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m2047a(i4, i5, iArr);
    }

    /* renamed from: a */
    private void m2047a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1835C.mo17593a(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: e */
    public boolean mo2406e(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1839g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1839g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1839g.top = getScrollY() - height;
            Rect rect2 = this.f1839g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1839g;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m2057b(i, i2, i3);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    private boolean m2057b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m2045a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m2064g(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: d */
    private void m2059d() {
        if (getOverScrollMode() == 2) {
            this.f1841i = null;
            this.f1842j = null;
        } else if (this.f1841i == null) {
            Context context = getContext();
            this.f1841i = new EdgeEffect(context);
            this.f1842j = new EdgeEffect(context);
        }
    }

    /* renamed from: a */
    public void mo922a(View view, int i) {
        this.f1834B.mo17610a(view, i);
        mo2407f(i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: c */
    private void m2058c() {
        this.f1847o = false;
        m2065h();
        mo2407f(0);
        EdgeEffect edgeEffect = this.f1841i;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f1842j.onRelease();
        }
    }

    /* renamed from: a */
    public void mo923a(View view, int i, int i2, int i3, int i4, int i5) {
        m2047a(i4, i5, (int[]) null);
    }

    /* renamed from: a */
    public void mo925a(View view, int i, int i2, int[] iArr, int i3) {
        mo2382a(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: b */
    private void m2054b(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1838f > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1840h;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m2049a(z);
            } else {
                if (!this.f1840h.isFinished()) {
                    m2046a();
                }
                scrollBy(i, i2);
            }
            this.f1838f = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public boolean mo2383a(KeyEvent keyEvent) {
        this.f1839g.setEmpty();
        int i = 130;
        if (!m2056b()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo2406e(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo2380a(130);
                } else {
                    return mo2390c(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo2380a(33);
            } else {
                return mo2390c(33);
            }
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0424a extends C5010a {
        C0424a() {
        }

        /* renamed from: a */
        public boolean mo2446a(View view, int i, Bundle bundle) {
            if (super.mo2446a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo2379a(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo2379a(0, min, true);
            return true;
        }

        /* renamed from: b */
        public void mo2447b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2447b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C5041e.m9080a(accessibilityEvent, nestedScrollView.getScrollX());
            C5041e.m9082b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            int scrollRange;
            super.mo2445a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo17510a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo17551k(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo17513a(C5034c.C5035a.f8902g);
                    cVar.mo17513a(C5034c.C5035a.f8906k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo17513a(C5034c.C5035a.f8901f);
                    cVar.mo17513a(C5034c.C5035a.f8907l);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2048a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1854v) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1843k = (int) motionEvent.getY(i);
            this.f1854v = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1848p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: b */
    public final void mo2389b(int i, int i2) {
        mo2378a(i, i2, 250, false);
    }

    /* renamed from: b */
    private void m2055b(View view) {
        view.getDrawingRect(this.f1839g);
        offsetDescendantRectToMyCoords(view, this.f1839g);
        int a = mo2375a(this.f1839g);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: b */
    public void mo2388b(int i) {
        if (getChildCount() > 0) {
            this.f1840h.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m2049a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2381a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo2399d(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f1840h
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo2381a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private View m2045a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public boolean mo2380a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m2052a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m2064g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1839g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1839g);
            m2064g(mo2375a(this.f1839g));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m2051a(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: a */
    private boolean m2051a(View view) {
        return !m2052a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m2052a(View view, int i, int i2) {
        view.getDrawingRect(this.f1839g);
        offsetDescendantRectToMyCoords(view, this.f1839g);
        return this.f1839g.bottom + i >= getScrollY() && this.f1839g.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo2376a(int i, int i2) {
        m2054b(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2379a(int i, int i2, boolean z) {
        mo2378a(i, i2, 250, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2378a(int i, int i2, int i3, boolean z) {
        m2054b(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: a */
    private void m2049a(boolean z) {
        if (z) {
            mo2391c(2, 1);
        } else {
            mo2407f(1);
        }
        this.f1858z = getScrollY();
        C5071v.m9144I(this);
    }

    /* renamed from: a */
    private void m2046a() {
        this.f1840h.abortAnimation();
        mo2407f(1);
    }

    /* renamed from: a */
    private boolean m2050a(Rect rect, boolean z) {
        int a = mo2375a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo2376a(0, a);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2375a(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* renamed from: a */
    private static boolean m2053a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m2053a((View) parent, view2)) {
            return false;
        }
        return true;
    }
}
