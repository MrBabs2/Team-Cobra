package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f24702b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C8650a extends AnimatorListenerAdapter {
        C8650a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f24702b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo32284b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo32281a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f24702b != null;
        if (z3) {
            this.f24702b.cancel();
        }
        AnimatorSet b = mo32284b(view, view2, z, z3);
        this.f24702b = b;
        b.addListener(new C8650a());
        this.f24702b.start();
        if (!z2) {
            this.f24702b.end();
        }
        return true;
    }
}
