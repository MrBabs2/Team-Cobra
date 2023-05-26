package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p112n.p277e.p279b.p282b.p283m.C10586b;
import p112n.p277e.p279b.p282b.p283m.C10593i;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C10593i f24719c = new C10593i(75, 150);

    /* renamed from: d */
    private final C10593i f24720d = new C10593i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C8656a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f24721a;

        /* renamed from: b */
        final /* synthetic */ View f24722b;

        C8656a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f24721a = z;
            this.f24722b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24721a) {
                this.f24722b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24721a) {
                this.f24722b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: a */
    public boolean mo2148a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    /* renamed from: b */
    public boolean mo2152b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2152b(coordinatorLayout, view, motionEvent);
    }

    /* renamed from: a */
    private void m28276a(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C10593i iVar = z ? this.f24719c : this.f24720d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo36144a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo32284b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m28276a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C10586b.m35868a(animatorSet, arrayList);
        animatorSet.addListener(new C8656a(this, z, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
