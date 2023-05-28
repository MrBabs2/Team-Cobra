package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C8566j;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10579g;

/* renamed from: com.google.android.material.appbar.e */
/* compiled from: ViewUtilsLollipop */
class C8426e {

    /* renamed from: a */
    private static final int[] f23819a = {16843848};

    /* renamed from: a */
    static void m27067a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m27069a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray c = C8566j.m27997c(context, attributeSet, f23819a, i, i2, new int[0]);
        try {
            if (c.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, c.getResourceId(0, 0)));
            }
        } finally {
            c.recycle();
        }
    }

    /* renamed from: a */
    static void m27068a(View view, float f) {
        int integer = view.getResources().getInteger(C10579g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C10574b.state_liftable, -C10574b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
