package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0153m;
import p050l.p051a.C4790a;
import p050l.p051a.C4795f;
import p050l.p075h.p076e.C4950b;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5063n;
import p050l.p075h.p084l.C5064o;
import p050l.p075h.p084l.C5065p;
import p050l.p075h.p084l.C5066q;
import p050l.p075h.p084l.C5071v;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements C0297w, C5065p, C5063n, C5064o {

    /* renamed from: K */
    static final int[] f659K = {C4790a.actionBarSize, 16842841};

    /* renamed from: A */
    private C5020d0 f660A;

    /* renamed from: B */
    private C5020d0 f661B;

    /* renamed from: C */
    private C5020d0 f662C;

    /* renamed from: D */
    private C0168d f663D;

    /* renamed from: E */
    private OverScroller f664E;

    /* renamed from: F */
    ViewPropertyAnimator f665F;

    /* renamed from: G */
    final AnimatorListenerAdapter f666G;

    /* renamed from: H */
    private final Runnable f667H;

    /* renamed from: I */
    private final Runnable f668I;

    /* renamed from: J */
    private final C5066q f669J;

    /* renamed from: f */
    private int f670f;

    /* renamed from: g */
    private int f671g;

    /* renamed from: h */
    private ContentFrameLayout f672h;

    /* renamed from: i */
    ActionBarContainer f673i;

    /* renamed from: j */
    private C0299x f674j;

    /* renamed from: k */
    private Drawable f675k;

    /* renamed from: l */
    private boolean f676l;

    /* renamed from: m */
    private boolean f677m;

    /* renamed from: n */
    private boolean f678n;

    /* renamed from: o */
    private boolean f679o;

    /* renamed from: p */
    boolean f680p;

    /* renamed from: q */
    private int f681q;

    /* renamed from: r */
    private int f682r;

    /* renamed from: s */
    private final Rect f683s;

    /* renamed from: t */
    private final Rect f684t;

    /* renamed from: u */
    private final Rect f685u;

    /* renamed from: v */
    private final Rect f686v;

    /* renamed from: w */
    private final Rect f687w;

    /* renamed from: x */
    private final Rect f688x;

    /* renamed from: y */
    private final Rect f689y;

    /* renamed from: z */
    private C5020d0 f690z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    class C0165a extends AnimatorListenerAdapter {
        C0165a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f665F = null;
            actionBarOverlayLayout.f680p = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f665F = null;
            actionBarOverlayLayout.f680p = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    class C0166b implements Runnable {
        C0166b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo944h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f665F = actionBarOverlayLayout.f673i.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f666G);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    class C0167c implements Runnable {
        C0167c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo944h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f665F = actionBarOverlayLayout.f673i.animate().translationY((float) (-ActionBarOverlayLayout.this.f673i.getHeight())).setListener(ActionBarOverlayLayout.this.f666G);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0168d {
        /* renamed from: a */
        void mo420a();

        /* renamed from: a */
        void mo423a(boolean z);

        /* renamed from: b */
        void mo424b();

        /* renamed from: c */
        void mo425c();

        /* renamed from: d */
        void mo426d();

        void onWindowVisibilityChanged(int i);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    public static class C0169e extends ViewGroup.MarginLayoutParams {
        public C0169e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0169e(int i, int i2) {
            super(i, i2);
        }

        public C0169e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m792a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f659K);
        boolean z = false;
        this.f670f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f675k = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f676l = z;
        this.f664E = new OverScroller(context);
    }

    /* renamed from: k */
    private void m795k() {
        mo944h();
        this.f668I.run();
    }

    /* renamed from: l */
    private void m796l() {
        mo944h();
        postDelayed(this.f668I, 600);
    }

    /* renamed from: m */
    private void m797m() {
        mo944h();
        postDelayed(this.f667H, 600);
    }

    /* renamed from: n */
    private void m798n() {
        mo944h();
        this.f667H.run();
    }

    /* renamed from: b */
    public void mo929b(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: c */
    public boolean mo930c() {
        mo946j();
        return this.f674j.mo1749c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0169e;
    }

    /* renamed from: d */
    public boolean mo932d() {
        mo946j();
        return this.f674j.mo1752d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f675k != null && !this.f676l) {
            int bottom = this.f673i.getVisibility() == 0 ? (int) (((float) this.f673i.getBottom()) + this.f673i.getTranslationY() + 0.5f) : 0;
            this.f675k.setBounds(0, bottom, getWidth(), this.f675k.getIntrinsicHeight() + bottom);
            this.f675k.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo934e() {
        mo946j();
        return this.f674j.mo1754e();
    }

    /* renamed from: f */
    public boolean mo935f() {
        mo946j();
        return this.f674j.mo1755f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo946j();
        boolean a = m794a((View) this.f673i, rect, true, true, false, true);
        this.f686v.set(rect);
        C0298w0.m1422a(this, this.f686v, this.f683s);
        if (!this.f687w.equals(this.f686v)) {
            this.f687w.set(this.f686v);
            a = true;
        }
        if (!this.f684t.equals(this.f683s)) {
            this.f684t.set(this.f683s);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public void mo937g() {
        mo946j();
        this.f674j.mo1756g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f673i;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f669J.mo17608a();
    }

    public CharSequence getTitle() {
        mo946j();
        return this.f674j.getTitle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo944h() {
        removeCallbacks(this.f667H);
        removeCallbacks(this.f668I);
        ViewPropertyAnimator viewPropertyAnimator = this.f665F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean mo945i() {
        return this.f677m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo946j() {
        if (this.f672h == null) {
            this.f672h = (ContentFrameLayout) findViewById(C4795f.action_bar_activity_content);
            this.f673i = (ActionBarContainer) findViewById(C4795f.action_bar_container);
            this.f674j = m791a(findViewById(C4795f.action_bar));
        }
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo946j();
        C5020d0 a = C5020d0.m8936a(windowInsets);
        boolean a2 = m794a((View) this.f673i, new Rect(a.mo17479e(), a.mo17482g(), a.mo17481f(), a.mo17478d()), true, true, false, true);
        C5071v.m9149a((View) this, a, this.f683s);
        Rect rect = this.f683s;
        C5020d0 a3 = a.mo17474a(rect.left, rect.top, rect.right, rect.bottom);
        this.f690z = a3;
        boolean z = true;
        if (!this.f660A.equals(a3)) {
            this.f660A = this.f690z;
            a2 = true;
        }
        if (!this.f684t.equals(this.f683s)) {
            this.f684t.set(this.f683s);
        } else {
            z = a2;
        }
        if (z) {
            requestLayout();
        }
        return a.mo17473a().mo17477c().mo17475b().mo17486j();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m792a(getContext());
        C5071v.m9145J(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo944h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0169e eVar = (C0169e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = eVar.leftMargin + paddingLeft;
                int i7 = eVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        mo946j();
        measureChildWithMargins(this.f673i, i, 0, i2, 0);
        C0169e eVar = (C0169e) this.f673i.getLayoutParams();
        int max = Math.max(0, this.f673i.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f673i.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f673i.getMeasuredState());
        boolean z = (C5071v.m9212x(this) & 256) != 0;
        if (z) {
            i3 = this.f670f;
            if (this.f678n && this.f673i.getTabContainer() != null) {
                i3 += this.f670f;
            }
        } else {
            i3 = this.f673i.getVisibility() != 8 ? this.f673i.getMeasuredHeight() : 0;
        }
        this.f685u.set(this.f683s);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f661B = this.f690z;
        } else {
            this.f688x.set(this.f686v);
        }
        if (!this.f677m && !z) {
            Rect rect = this.f685u;
            rect.top += i3;
            rect.bottom += 0;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f661B = this.f661B.mo17474a(0, i3, 0, 0);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            C4950b a = C4950b.m8710a(this.f661B.mo17479e(), this.f661B.mo17482g() + i3, this.f661B.mo17481f(), this.f661B.mo17478d() + 0);
            C5020d0.C5021a aVar = new C5020d0.C5021a(this.f661B);
            aVar.mo17489b(a);
            this.f661B = aVar.mo17488a();
        } else {
            Rect rect2 = this.f688x;
            rect2.top += i3;
            rect2.bottom += 0;
        }
        m794a((View) this.f672h, this.f685u, true, true, true, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.f662C.equals(this.f661B)) {
            C5020d0 d0Var = this.f661B;
            this.f662C = d0Var;
            C5071v.m9148a((View) this.f672h, d0Var);
        } else if (Build.VERSION.SDK_INT < 21 && !this.f689y.equals(this.f688x)) {
            this.f689y.set(this.f688x);
            this.f672h.mo1145a(this.f688x);
        }
        measureChildWithMargins(this.f672h, i, 0, i2, 0);
        C0169e eVar2 = (C0169e) this.f672h.getLayoutParams();
        int max3 = Math.max(max, this.f672h.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f672h.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f672h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f679o || !z) {
            return false;
        }
        if (m793a(f2)) {
            m795k();
        } else {
            m798n();
        }
        this.f680p = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f681q + i2;
        this.f681q = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f669J.mo17611a(view, view2, i);
        this.f681q = getActionBarHideOffset();
        mo944h();
        C0168d dVar = this.f663D;
        if (dVar != null) {
            dVar.mo426d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f673i.getVisibility() != 0) {
            return false;
        }
        return this.f679o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f679o && !this.f680p) {
            if (this.f681q <= this.f673i.getHeight()) {
                m797m();
            } else {
                m796l();
            }
        }
        C0168d dVar = this.f663D;
        if (dVar != null) {
            dVar.mo424b();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo946j();
        int i2 = this.f682r ^ i;
        this.f682r = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0168d dVar = this.f663D;
        if (dVar != null) {
            dVar.mo423a(!z);
            if (z2 || !z) {
                this.f663D.mo420a();
            } else {
                this.f663D.mo425c();
            }
        }
        if ((i2 & 256) != 0 && this.f663D != null) {
            C5071v.m9145J(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f671g = i;
        C0168d dVar = this.f663D;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo944h();
        this.f673i.setTranslationY((float) (-Math.max(0, Math.min(i, this.f673i.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0168d dVar) {
        this.f663D = dVar;
        if (getWindowToken() != null) {
            this.f663D.onWindowVisibilityChanged(this.f671g);
            int i = this.f682r;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C5071v.m9145J(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f678n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f679o) {
            this.f679o = z;
            if (!z) {
                mo944h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo946j();
        this.f674j.setIcon(i);
    }

    public void setLogo(int i) {
        mo946j();
        this.f674j.mo1744b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f677m = z;
        this.f676l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo946j();
        this.f674j.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo946j();
        this.f674j.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f671g = 0;
        this.f683s = new Rect();
        this.f684t = new Rect();
        this.f685u = new Rect();
        this.f686v = new Rect();
        this.f687w = new Rect();
        this.f688x = new Rect();
        this.f689y = new Rect();
        C5020d0 d0Var = C5020d0.f8875b;
        this.f690z = d0Var;
        this.f660A = d0Var;
        this.f661B = d0Var;
        this.f662C = d0Var;
        this.f666G = new C0165a();
        this.f667H = new C0166b();
        this.f668I = new C0167c();
        m792a(context);
        this.f669J = new C5066q(this);
    }

    /* renamed from: b */
    public void mo928b() {
        mo946j();
        this.f674j.mo1743b();
    }

    /* access modifiers changed from: protected */
    public C0169e generateDefaultLayoutParams() {
        return new C0169e(-1, -1);
    }

    public C0169e generateLayoutParams(AttributeSet attributeSet) {
        return new C0169e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0169e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        mo946j();
        this.f674j.setIcon(drawable);
    }

    /* renamed from: a */
    private boolean m794a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        C0169e eVar = (C0169e) view.getLayoutParams();
        if (!z || eVar.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            eVar.leftMargin = i4;
            z5 = true;
        }
        if (z2 && eVar.topMargin != (i3 = rect.top)) {
            eVar.topMargin = i3;
            z5 = true;
        }
        if (z4 && eVar.rightMargin != (i2 = rect.right)) {
            eVar.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || eVar.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        eVar.bottomMargin = i;
        return true;
    }

    /* renamed from: a */
    public void mo924a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo923a(view, i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public boolean mo927a(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: a */
    public void mo922a(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public void mo923a(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public void mo925a(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: a */
    private C0299x m791a(View view) {
        if (view instanceof C0299x) {
            return (C0299x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private boolean m793a(float f) {
        this.f664E.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f664E.getFinalY() > this.f673i.getHeight();
    }

    /* renamed from: a */
    public void mo920a(int i) {
        mo946j();
        if (i == 2) {
            this.f674j.mo1764m();
        } else if (i == 5) {
            this.f674j.mo1765n();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public boolean mo926a() {
        mo946j();
        return this.f674j.mo1742a();
    }

    /* renamed from: a */
    public void mo921a(Menu menu, C0153m.C0154a aVar) {
        mo946j();
        this.f674j.mo1736a(menu, aVar);
    }
}
