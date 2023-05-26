package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p050l.p075h.p079g.C4968a;
import p050l.p075h.p084l.C5019d;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5071v;

/* renamed from: com.google.android.material.appbar.b */
/* compiled from: HeaderScrollingViewBehavior */
abstract class C8423b extends C8424c<View> {

    /* renamed from: d */
    final Rect f23805d = new Rect();

    /* renamed from: e */
    final Rect f23806e = new Rect();

    /* renamed from: f */
    private int f23807f = 0;

    /* renamed from: g */
    private int f23808g;

    public C8423b() {
    }

    /* renamed from: c */
    private static int m27046c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract View mo30794a(List<View> list);

    /* renamed from: a */
    public boolean mo2144a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a;
        C5020d0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (a = mo30794a(coordinatorLayout.mo2087b(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C5071v.m9201m(a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo17482g() + lastWindowInsets.mo17478d();
        }
        int c = size + mo30796c(a);
        int measuredHeight = a.getMeasuredHeight();
        if (mo30874e()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            c -= measuredHeight;
        }
        coordinatorLayout.mo2082a(view, i, i2, View.MeasureSpec.makeMeasureSpec(c, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract float mo30795b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30871b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo30794a(coordinatorLayout.mo2087b(view));
        if (a != null) {
            CoordinatorLayout.C0346f fVar = (CoordinatorLayout.C0346f) view.getLayoutParams();
            Rect rect = this.f23805d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, a.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C5020d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C5071v.m9201m(coordinatorLayout) && !C5071v.m9201m(view)) {
                rect.left += lastWindowInsets.mo17479e();
                rect.right -= lastWindowInsets.mo17481f();
            }
            Rect rect2 = this.f23806e;
            C5019d.m8934a(m27046c(fVar.f1615c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = mo30869a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            this.f23807f = rect2.top - a.getBottom();
            return;
        }
        super.mo30871b(coordinatorLayout, view, i);
        this.f23807f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo30796c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo30873d() {
        return this.f23807f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo30874e() {
        return false;
    }

    /* renamed from: c */
    public final int mo30872c() {
        return this.f23808g;
    }

    public C8423b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo30869a(View view) {
        if (this.f23808g == 0) {
            return 0;
        }
        float b = mo30795b(view);
        int i = this.f23808g;
        return C4968a.m8801a((int) (b * ((float) i)), 0, i);
    }

    /* renamed from: b */
    public final void mo30870b(int i) {
        this.f23808g = i;
    }
}
