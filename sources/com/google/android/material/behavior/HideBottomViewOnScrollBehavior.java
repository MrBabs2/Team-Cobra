package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p112n.p277e.p279b.p282b.p283m.C10585a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0343c<V> {

    /* renamed from: a */
    private int f23848a = 0;

    /* renamed from: b */
    private int f23849b = 2;

    /* renamed from: c */
    private int f23850c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f23851d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C8429a extends AnimatorListenerAdapter {
        C8429a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f23851d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: b */
    public void mo30912b(V v) {
        if (this.f23849b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f23851d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f23849b = 2;
            m27119a(v, 0, 225, C10585a.f28459d);
        }
    }

    /* renamed from: b */
    public boolean mo2155b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: a */
    public boolean mo2143a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f23848a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2143a(coordinatorLayout, v, i);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo30911a(V v, int i) {
        this.f23850c = i;
        if (this.f23849b == 1) {
            v.setTranslationY((float) (this.f23848a + i));
        }
    }

    /* renamed from: a */
    public void mo2137a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo30910a(v);
        } else if (i2 < 0) {
            mo30912b(v);
        }
    }

    /* renamed from: a */
    public void mo30910a(V v) {
        if (this.f23849b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f23851d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f23849b = 1;
            m27119a(v, this.f23848a + this.f23850c, 175, C10585a.f28458c);
        }
    }

    /* renamed from: a */
    private void m27119a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f23851d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C8429a());
    }
}
