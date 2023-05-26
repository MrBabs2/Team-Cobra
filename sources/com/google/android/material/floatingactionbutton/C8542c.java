package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.content.C0394a;
import java.util.ArrayList;
import p050l.p075h.p083k.C5008h;
import p112n.p277e.p279b.p282b.C10575c;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p296y.C10631b;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* compiled from: FloatingActionButtonImplLollipop */
class C8542c extends C8529b {

    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    /* compiled from: FloatingActionButtonImplLollipop */
    static class C8543a extends C10638g {
        C8543a(C10645k kVar) {
            super(kVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    C8542c(FloatingActionButton floatingActionButton, C10631b bVar) {
        super(floatingActionButton, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31774a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        C10638g a = mo31768a();
        this.f24361b = a;
        a.setTintList(colorStateList);
        if (mode != null) {
            this.f24361b.setTintMode(mode);
        }
        this.f24361b.mo36239a(this.f24384y.getContext());
        if (i > 0) {
            this.f24363d = mo31830a(i, colorStateList);
            C8526a aVar = this.f24363d;
            C5008h.m8899a(aVar);
            C10638g gVar = this.f24361b;
            C5008h.m8899a(gVar);
            drawable = new LayerDrawable(new Drawable[]{aVar, gVar});
        } else {
            this.f24363d = null;
            drawable = this.f24361b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C10629b.m35983b(colorStateList2), drawable, (Drawable) null);
        this.f24362c = rippleDrawable;
        this.f24364e = rippleDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31787b(ColorStateList colorStateList) {
        Drawable drawable = this.f24362c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C10629b.m35983b(colorStateList));
        } else {
            super.mo31787b(colorStateList);
        }
    }

    /* renamed from: c */
    public float mo31792c() {
        return this.f24384y.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo31804l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo31806n() {
        mo31816x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo31811s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo31812t() {
        return this.f24385z.mo31746a() || !mo31813u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo31814v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31770a(float f, float f2, float f3) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f24384y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C8529b.f24349G, m27852a(f, f3));
            stateListAnimator.addState(C8529b.f24350H, m27852a(f, f2));
            stateListAnimator.addState(C8529b.f24351I, m27852a(f, f2));
            stateListAnimator.addState(C8529b.f24352J, m27852a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f24384y, "elevation", new float[]{f}).setDuration(0));
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f24384y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f24384y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C8529b.f24348F);
            stateListAnimator.addState(C8529b.f24353K, animatorSet);
            stateListAnimator.addState(C8529b.f24354L, m27852a(0.0f, 0.0f));
            this.f24384y.setStateListAnimator(stateListAnimator);
        }
        if (mo31812t()) {
            mo31816x();
        }
    }

    /* renamed from: a */
    private Animator m27852a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f24384y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f24384y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C8529b.f24348F);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31782a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f24384y.isEnabled()) {
            this.f24384y.setElevation(this.f24367h);
            if (this.f24384y.isPressed()) {
                this.f24384y.setTranslationZ(this.f24369j);
            } else if (this.f24384y.isFocused() || this.f24384y.isHovered()) {
                this.f24384y.setTranslationZ(this.f24368i);
            } else {
                this.f24384y.setTranslationZ(0.0f);
            }
        } else {
            this.f24384y.setElevation(0.0f);
            this.f24384y.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8526a mo31830a(int i, ColorStateList colorStateList) {
        Context context = this.f24384y.getContext();
        C10645k kVar = this.f24360a;
        C5008h.m8899a(kVar);
        C8526a aVar = new C8526a(kVar);
        aVar.mo31753a(C0394a.m1909a(context, C10575c.design_fab_stroke_top_outer_color), C0394a.m1909a(context, C10575c.design_fab_stroke_top_inner_color), C0394a.m1909a(context, C10575c.design_fab_stroke_end_inner_color), C0394a.m1909a(context, C10575c.design_fab_stroke_end_outer_color));
        aVar.mo31752a((float) i);
        aVar.mo31754a(colorStateList);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10638g mo31768a() {
        C10645k kVar = this.f24360a;
        C5008h.m8899a(kVar);
        return new C8543a(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31776a(Rect rect) {
        if (this.f24385z.mo31746a()) {
            super.mo31776a(rect);
        } else if (!mo31813u()) {
            int sizeDimension = (this.f24370k - this.f24384y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
