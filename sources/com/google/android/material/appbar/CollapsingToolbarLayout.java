package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C8549a;
import com.google.android.material.internal.C8552b;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import p050l.p051a.C4798i;
import p050l.p075h.p079g.C4968a;
import p050l.p075h.p083k.C5003c;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5067r;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10585a;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: C */
    private static final int f23765C = C10583k.Widget_Design_CollapsingToolbar;

    /* renamed from: A */
    int f23766A;

    /* renamed from: B */
    C5020d0 f23767B;

    /* renamed from: f */
    private boolean f23768f;

    /* renamed from: g */
    private int f23769g;

    /* renamed from: h */
    private Toolbar f23770h;

    /* renamed from: i */
    private View f23771i;

    /* renamed from: j */
    private View f23772j;

    /* renamed from: k */
    private int f23773k;

    /* renamed from: l */
    private int f23774l;

    /* renamed from: m */
    private int f23775m;

    /* renamed from: n */
    private int f23776n;

    /* renamed from: o */
    private final Rect f23777o;

    /* renamed from: p */
    final C8549a f23778p;

    /* renamed from: q */
    private boolean f23779q;

    /* renamed from: r */
    private boolean f23780r;

    /* renamed from: s */
    private Drawable f23781s;

    /* renamed from: t */
    Drawable f23782t;

    /* renamed from: u */
    private int f23783u;

    /* renamed from: v */
    private boolean f23784v;

    /* renamed from: w */
    private ValueAnimator f23785w;

    /* renamed from: x */
    private long f23786x;

    /* renamed from: y */
    private int f23787y;

    /* renamed from: z */
    private AppBarLayout.C8416e f23788z;

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    class C8417a implements C5067r {
        C8417a() {
        }

        /* renamed from: a */
        public C5020d0 mo342a(View view, C5020d0 d0Var) {
            return CollapsingToolbarLayout.this.mo30802a(d0Var);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    class C8418b implements ValueAnimator.AnimatorUpdateListener {
        C8418b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    private class C8420d implements AppBarLayout.C8416e {
        C8420d() {
        }

        public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f23766A = i;
            C5020d0 d0Var = collapsingToolbarLayout.f23767B;
            int g = d0Var != null ? d0Var.mo17482g() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                C8419c cVar = (C8419c) childAt.getLayoutParams();
                C8425d d = CollapsingToolbarLayout.m27024d(childAt);
                int i3 = cVar.f23791a;
                if (i3 == 1) {
                    d.mo30880b(C4968a.m8801a(-i, 0, CollapsingToolbarLayout.this.mo30801a(childAt)));
                } else if (i3 == 2) {
                    d.mo30880b(Math.round(((float) (-i)) * cVar.f23792b));
                }
            }
            CollapsingToolbarLayout.this.mo30803a();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f23782t != null && g > 0) {
                C5071v.m9144I(collapsingToolbarLayout2);
            }
            CollapsingToolbarLayout.this.f23778p.mo31889b(((float) Math.abs(i)) / ((float) ((CollapsingToolbarLayout.this.getHeight() - C5071v.m9205q(CollapsingToolbarLayout.this)) - g)));
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27021b() {
        /*
            r6 = this;
            boolean r0 = r6.f23768f
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f23770h = r0
            r6.f23771i = r0
            int r1 = r6.f23769g
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
            r6.f23770h = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.m27020b(r1)
            r6.f23771i = r1
        L_0x001f:
            androidx.appcompat.widget.Toolbar r1 = r6.f23770h
            r2 = 0
            if (r1 != 0) goto L_0x003c
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003a
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 == 0) goto L_0x0037
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            goto L_0x003a
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003a:
            r6.f23770h = r0
        L_0x003c:
            r6.m27025d()
            r6.f23768f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.m27021b():void");
    }

    /* renamed from: c */
    private static int m27022c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: d */
    private void m27025d() {
        View view;
        if (!this.f23779q && (view = this.f23772j) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f23772j);
            }
        }
        if (this.f23779q && this.f23770h != null) {
            if (this.f23772j == null) {
                this.f23772j = new View(getContext());
            }
            if (this.f23772j.getParent() == null) {
                this.f23770h.addView(this.f23772j, -1, -1);
            }
        }
    }

    /* renamed from: e */
    private boolean m27026e(View view) {
        View view2 = this.f23771i;
        if (view2 == null || view2 == this) {
            if (view == this.f23770h) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5020d0 mo30802a(C5020d0 d0Var) {
        C5020d0 d0Var2 = C5071v.m9201m(this) ? d0Var : null;
        if (!C5003c.m8889a(this.f23767B, d0Var2)) {
            this.f23767B = d0Var2;
            requestLayout();
        }
        return d0Var.mo17477c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8419c;
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        m27021b();
        if (this.f23770h == null && (drawable = this.f23781s) != null && this.f23783u > 0) {
            drawable.mutate().setAlpha(this.f23783u);
            this.f23781s.draw(canvas);
        }
        if (this.f23779q && this.f23780r) {
            this.f23778p.mo31882a(canvas);
        }
        if (this.f23782t != null && this.f23783u > 0) {
            C5020d0 d0Var = this.f23767B;
            int g = d0Var != null ? d0Var.mo17482g() : 0;
            if (g > 0) {
                this.f23782t.setBounds(0, -this.f23766A, getWidth(), g - this.f23766A);
                this.f23782t.mutate().setAlpha(this.f23783u);
                this.f23782t.draw(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f23781s == null || this.f23783u <= 0 || !m27026e(view)) {
            z = false;
        } else {
            this.f23781s.mutate().setAlpha(this.f23783u);
            this.f23781s.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23782t;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f23781s;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C8549a aVar = this.f23778p;
        if (aVar != null) {
            z |= aVar.mo31887a(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCollapsedTitleGravity() {
        return this.f23778p.mo31896c();
    }

    public Typeface getCollapsedTitleTypeface() {
        return this.f23778p.mo31901e();
    }

    public Drawable getContentScrim() {
        return this.f23781s;
    }

    public int getExpandedTitleGravity() {
        return this.f23778p.mo31904g();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f23776n;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f23775m;
    }

    public int getExpandedTitleMarginStart() {
        return this.f23773k;
    }

    public int getExpandedTitleMarginTop() {
        return this.f23774l;
    }

    public Typeface getExpandedTitleTypeface() {
        return this.f23778p.mo31906i();
    }

    public int getMaxLines() {
        return this.f23778p.mo31908k();
    }

    /* access modifiers changed from: package-private */
    public int getScrimAlpha() {
        return this.f23783u;
    }

    public long getScrimAnimationDuration() {
        return this.f23786x;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f23787y;
        if (i >= 0) {
            return i;
        }
        C5020d0 d0Var = this.f23767B;
        int g = d0Var != null ? d0Var.mo17482g() : 0;
        int q = C5071v.m9205q(this);
        if (q > 0) {
            return Math.min((q * 2) + g, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f23782t;
    }

    public CharSequence getTitle() {
        if (this.f23779q) {
            return this.f23778p.mo31909l();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            C5071v.m9179b((View) this, C5071v.m9201m((View) parent));
            if (this.f23788z == null) {
                this.f23788z = new C8420d();
            }
            ((AppBarLayout) parent).mo30728a(this.f23788z);
            C5071v.m9145J(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C8416e eVar = this.f23788z;
        if (eVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo30734b(eVar);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        super.onLayout(z, i, i2, i3, i4);
        C5020d0 d0Var = this.f23767B;
        if (d0Var != null) {
            int g = d0Var.mo17482g();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!C5071v.m9201m(childAt) && childAt.getTop() < g) {
                    C5071v.m9189e(childAt, g);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m27024d(getChildAt(i6)).mo30882d();
        }
        if (this.f23779q && (view = this.f23772j) != null) {
            boolean z2 = true;
            boolean z3 = C5071v.m9139D(view) && this.f23772j.getVisibility() == 0;
            this.f23780r = z3;
            if (z3) {
                if (C5071v.m9204p(this) != 1) {
                    z2 = false;
                }
                View view2 = this.f23771i;
                if (view2 == null) {
                    view2 = this.f23770h;
                }
                int a = mo30801a(view2);
                C8552b.m27952a((ViewGroup) this, this.f23772j, this.f23777o);
                this.f23778p.mo31879a(this.f23777o.left + (z2 ? this.f23770h.getTitleMarginEnd() : this.f23770h.getTitleMarginStart()), this.f23777o.top + a + this.f23770h.getTitleMarginTop(), this.f23777o.right + (z2 ? this.f23770h.getTitleMarginStart() : this.f23770h.getTitleMarginEnd()), (this.f23777o.bottom + a) - this.f23770h.getTitleMarginBottom());
                this.f23778p.mo31891b(z2 ? this.f23775m : this.f23773k, this.f23777o.top + this.f23774l, (i3 - i) - (z2 ? this.f23773k : this.f23775m), (i4 - i2) - this.f23776n);
                this.f23778p.mo31912o();
            }
        }
        if (this.f23770h != null) {
            if (this.f23779q && TextUtils.isEmpty(this.f23778p.mo31909l())) {
                setTitle(this.f23770h.getTitle());
            }
            View view3 = this.f23771i;
            if (view3 == null || view3 == this) {
                setMinimumHeight(m27022c(this.f23770h));
            } else {
                setMinimumHeight(m27022c(view3));
            }
        }
        mo30803a();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m27024d(getChildAt(i7)).mo30877a();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m27021b();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C5020d0 d0Var = this.f23767B;
        int g = d0Var != null ? d0Var.mo17482g() : 0;
        if (mode == 0 && g > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + g, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f23781s;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.f23778p.mo31890b(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.f23778p.mo31878a(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.f23778p.mo31885a(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f23781s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f23781s = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.f23781s.setCallback(this);
                this.f23781s.setAlpha(this.f23783u);
            }
            C5071v.m9144I(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C0394a.m1917c(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f23778p.mo31900d(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f23776n = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f23775m = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f23773k = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f23774l = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.f23778p.mo31897c(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.f23778p.mo31893b(colorStateList);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.f23778p.mo31895b(typeface);
    }

    public void setMaxLines(int i) {
        this.f23778p.mo31902e(i);
    }

    /* access modifiers changed from: package-private */
    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.f23783u) {
            if (!(this.f23781s == null || (toolbar = this.f23770h) == null)) {
                C5071v.m9144I(toolbar);
            }
            this.f23783u = i;
            C5071v.m9144I(this);
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.f23786x = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.f23787y != i) {
            this.f23787y = i;
            mo30803a();
        }
    }

    public void setScrimsShown(boolean z) {
        mo30804a(z, C5071v.m9140E(this) && !isInEditMode());
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.f23782t;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f23782t = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f23782t.setState(getDrawableState());
                }
                C0414a.m2020a(this.f23782t, C5071v.m9204p(this));
                this.f23782t.setVisible(getVisibility() == 0, false);
                this.f23782t.setCallback(this);
                this.f23782t.setAlpha(this.f23783u);
            }
            C5071v.m9144I(this);
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C0394a.m1917c(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.f23778p.mo31886a(charSequence);
        m27023c();
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f23779q) {
            this.f23779q = z;
            m27023c();
            m27025d();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f23782t;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f23782t.setVisible(z, false);
        }
        Drawable drawable2 = this.f23781s;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f23781s.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23781s || drawable == this.f23782t;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f23778p.mo31881a(colorStateList);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f23765C), attributeSet, i);
        this.f23768f = true;
        this.f23777o = new Rect();
        this.f23787y = -1;
        Context context2 = getContext();
        C8549a aVar = new C8549a(this);
        this.f23778p = aVar;
        aVar.mo31892b(C10585a.f28460e);
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.CollapsingToolbarLayout, i, f23765C, new int[0]);
        this.f23778p.mo31900d(c.getInt(C10584l.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        this.f23778p.mo31890b(c.getInt(C10584l.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = c.getDimensionPixelSize(C10584l.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.f23776n = dimensionPixelSize;
        this.f23775m = dimensionPixelSize;
        this.f23774l = dimensionPixelSize;
        this.f23773k = dimensionPixelSize;
        if (c.hasValue(C10584l.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f23773k = c.getDimensionPixelSize(C10584l.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (c.hasValue(C10584l.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.f23775m = c.getDimensionPixelSize(C10584l.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (c.hasValue(C10584l.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.f23774l = c.getDimensionPixelSize(C10584l.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (c.hasValue(C10584l.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.f23776n = c.getDimensionPixelSize(C10584l.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.f23779q = c.getBoolean(C10584l.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(c.getText(C10584l.CollapsingToolbarLayout_title));
        this.f23778p.mo31897c(C10583k.TextAppearance_Design_CollapsingToolbar_Expanded);
        this.f23778p.mo31878a(C4798i.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (c.hasValue(C10584l.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            this.f23778p.mo31897c(c.getResourceId(C10584l.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (c.hasValue(C10584l.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            this.f23778p.mo31878a(c.getResourceId(C10584l.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.f23787y = c.getDimensionPixelSize(C10584l.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (c.hasValue(C10584l.CollapsingToolbarLayout_maxLines)) {
            this.f23778p.mo31902e(c.getInt(C10584l.CollapsingToolbarLayout_maxLines, 1));
        }
        this.f23786x = (long) c.getInt(C10584l.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(c.getDrawable(C10584l.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(c.getDrawable(C10584l.CollapsingToolbarLayout_statusBarScrim));
        this.f23769g = c.getResourceId(C10584l.CollapsingToolbarLayout_toolbarId, -1);
        c.recycle();
        setWillNotDraw(false);
        C5071v.m9169a((View) this, (C5067r) new C8417a());
    }

    /* access modifiers changed from: protected */
    public C8419c generateDefaultLayoutParams() {
        return new C8419c(-1, -1);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C8419c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C8419c(layoutParams);
    }

    /* renamed from: c */
    private void m27023c() {
        setContentDescription(getTitle());
    }

    /* renamed from: a */
    public void mo30804a(boolean z, boolean z2) {
        if (this.f23784v != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                m27019a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f23784v = z;
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public static class C8419c extends FrameLayout.LayoutParams {

        /* renamed from: a */
        int f23791a = 0;

        /* renamed from: b */
        float f23792b = 0.5f;

        public C8419c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.CollapsingToolbarLayout_Layout);
            this.f23791a = obtainStyledAttributes.getInt(C10584l.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo30862a(obtainStyledAttributes.getFloat(C10584l.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo30862a(float f) {
            this.f23792b = f;
        }

        public C8419c(int i, int i2) {
            super(i, i2);
        }

        public C8419c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    private void m27019a(int i) {
        m27021b();
        ValueAnimator valueAnimator = this.f23785w;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f23785w = valueAnimator2;
            valueAnimator2.setDuration(this.f23786x);
            this.f23785w.setInterpolator(i > this.f23783u ? C10585a.f28458c : C10585a.f28459d);
            this.f23785w.addUpdateListener(new C8418b());
        } else if (valueAnimator.isRunning()) {
            this.f23785w.cancel();
        }
        this.f23785w.setIntValues(new int[]{this.f23783u, i});
        this.f23785w.start();
    }

    /* renamed from: d */
    static C8425d m27024d(View view) {
        C8425d dVar = (C8425d) view.getTag(C10578f.view_offset_helper);
        if (dVar != null) {
            return dVar;
        }
        C8425d dVar2 = new C8425d(view);
        view.setTag(C10578f.view_offset_helper, dVar2);
        return dVar2;
    }

    /* renamed from: b */
    private View m27020b(View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo30803a() {
        if (this.f23781s != null || this.f23782t != null) {
            setScrimsShown(getHeight() + this.f23766A < getScrimVisibleHeightTrigger());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo30801a(View view) {
        return ((getHeight() - m27024d(view).mo30879b()) - view.getHeight()) - ((C8419c) view.getLayoutParams()).bottomMargin;
    }
}
