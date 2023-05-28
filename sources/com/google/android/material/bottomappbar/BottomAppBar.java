package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0414a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C8567k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.p283m.C10595k;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10642h;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0342b {
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final int f23870U;

    /* renamed from: V */
    private final C10638g f23871V;

    /* renamed from: W */
    private Animator f23872W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Animator f23873a0;

    /* renamed from: b0 */
    private int f23874b0;

    /* renamed from: c0 */
    private int f23875c0;

    /* renamed from: d0 */
    private boolean f23876d0;

    /* renamed from: e0 */
    private int f23877e0;

    /* renamed from: f0 */
    private ArrayList<C8442f> f23878f0;

    /* renamed from: g0 */
    private boolean f23879g0;

    /* renamed from: h0 */
    private Behavior f23880h0;

    /* renamed from: i0 */
    private int f23881i0;

    /* renamed from: j0 */
    private int f23882j0;

    /* renamed from: k0 */
    private int f23883k0;

    /* renamed from: l0 */
    AnimatorListenerAdapter f23884l0;

    /* renamed from: m0 */
    C10595k<FloatingActionButton> f23885m0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8435a();

        /* renamed from: h */
        int f23891h;

        /* renamed from: i */
        boolean f23892i;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        static class C8435a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8435a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23891h);
            parcel.writeInt(this.f23892i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23891h = parcel.readInt();
            this.f23892i = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C8436a extends AnimatorListenerAdapter {
        C8436a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m27173m();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m27174n();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C8437b extends FloatingActionButton.C8523b {

        /* renamed from: a */
        final /* synthetic */ int f23894a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C8438a extends FloatingActionButton.C8523b {
            C8438a() {
            }

            /* renamed from: b */
            public void mo30950b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m27173m();
            }
        }

        C8437b(int i) {
            this.f23894a = i;
        }

        /* renamed from: a */
        public void mo30949a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m27162c(this.f23894a));
            floatingActionButton.mo31679b((FloatingActionButton.C8523b) new C8438a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C8439c extends AnimatorListenerAdapter {
        C8439c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m27173m();
            Animator unused = BottomAppBar.this.f23873a0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m27174n();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C8440d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f23898a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f23899b;

        /* renamed from: c */
        final /* synthetic */ int f23900c;

        /* renamed from: d */
        final /* synthetic */ boolean f23901d;

        C8440d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f23899b = actionMenuView;
            this.f23900c = i;
            this.f23901d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f23898a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f23898a) {
                BottomAppBar.this.m27160b(this.f23899b, this.f23900c, this.f23901d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C8441e extends AnimatorListenerAdapter {
        C8441e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f23884l0.onAnimationStart(animator);
            FloatingActionButton d = BottomAppBar.this.m27175o();
            if (d != null) {
                d.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    interface C8442f {
        /* renamed from: a */
        void mo30956a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo30957b(BottomAppBar bottomAppBar);
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f23881i0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m27162c(this.f23874b0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo30961c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f23883k0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f23882j0;
    }

    private C8443a getTopEdgeTreatment() {
        return (C8443a) this.f23871V.mo36264l().mo36292h();
    }

    /* renamed from: l */
    private void m27172l() {
        Animator animator = this.f23873a0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f23872W;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m27173m() {
        ArrayList<C8442f> arrayList;
        int i = this.f23877e0 - 1;
        this.f23877e0 = i;
        if (i == 0 && (arrayList = this.f23878f0) != null) {
            Iterator<C8442f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo30957b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m27174n() {
        ArrayList<C8442f> arrayList;
        int i = this.f23877e0;
        this.f23877e0 = i + 1;
        if (i == 0 && (arrayList = this.f23878f0) != null) {
            Iterator<C8442f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo30956a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public FloatingActionButton m27175o() {
        View p = m27176p();
        if (p instanceof FloatingActionButton) {
            return (FloatingActionButton) p;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m27176p() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo2091c((android.view.View) r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m27176p():android.view.View");
    }

    /* renamed from: q */
    private boolean m27177q() {
        FloatingActionButton o = m27175o();
        return o != null && o.mo31682c();
    }

    /* renamed from: r */
    private void m27178r() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m27177q()) {
                m27160b(actionMenuView, 0, false);
            } else {
                m27160b(actionMenuView, this.f23874b0, this.f23879g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public void m27179s() {
        getTopEdgeTreatment().mo30965e(getFabTranslationX());
        View p = m27176p();
        this.f23871V.mo36249c((!this.f23879g0 || !m27177q()) ? 0.0f : 1.0f);
        if (p != null) {
            p.setTranslationY(getFabTranslationY());
            p.setTranslationX(getFabTranslationX());
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f23871V.mo36265m();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo30961c();
    }

    public int getFabAlignmentMode() {
        return this.f23874b0;
    }

    public int getFabAnimationMode() {
        return this.f23875c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo30964e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo30966f();
    }

    public boolean getHideOnScroll() {
        return this.f23876d0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10642h.m36068a((View) this, this.f23871V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m27172l();
            m27179s();
        }
        m27178r();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        this.f23874b0 = savedState.f23891h;
        this.f23879g0 = savedState.f23892i;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23891h = this.f23874b0;
        savedState.f23892i = this.f23879g0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0414a.m2014a((Drawable) this.f23871V, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo30958a(f);
            this.f23871V.invalidateSelf();
            m27179s();
        }
    }

    public void setElevation(float f) {
        this.f23871V.mo36245b(f);
        getBehavior().mo30911a(this, this.f23871V.mo36263k() - this.f23871V.mo36262j());
    }

    public void setFabAlignmentMode(int i) {
        m27165d(i);
        m27153a(i, this.f23879g0);
        this.f23874b0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f23875c0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo30960b(f);
            this.f23871V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo30962c(f);
            this.f23871V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f23876d0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f23886e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f23887f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f23888g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f23889h = new C8434a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C8434a implements View.OnLayoutChangeListener {
            C8434a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f23887f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo31678b(Behavior.this.f23886e);
                int height = Behavior.this.f23886e.height();
                bottomAppBar.mo30924b(height);
                CoordinatorLayout.C0346f fVar = (CoordinatorLayout.C0346f) view.getLayoutParams();
                if (Behavior.this.f23888g == 0) {
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C10576d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    fVar.leftMargin = bottomAppBar.getLeftInset();
                    fVar.rightMargin = bottomAppBar.getRightInset();
                    if (C8567k.m28003b(floatingActionButton)) {
                        fVar.leftMargin += bottomAppBar.f23870U;
                    } else {
                        fVar.rightMargin += bottomAppBar.f23870U;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: a */
        public boolean mo2143a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f23887f = new WeakReference<>(bottomAppBar);
            View j = bottomAppBar.m27176p();
            if (j != null && !C5071v.m9140E(j)) {
                CoordinatorLayout.C0346f fVar = (CoordinatorLayout.C0346f) j.getLayoutParams();
                fVar.f1616d = 49;
                this.f23888g = fVar.bottomMargin;
                if (j instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) j;
                    floatingActionButton.addOnLayoutChangeListener(this.f23889h);
                    bottomAppBar.m27158a(floatingActionButton);
                }
                bottomAppBar.m27179s();
            }
            coordinatorLayout.mo2093c((View) bottomAppBar, i);
            return super.mo2143a(coordinatorLayout, bottomAppBar, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public boolean mo2155b(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2155b(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public float m27162c(int i) {
        boolean b = C8567k.m28003b(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f23870U + (b ? this.f23883k0 : this.f23882j0));
        if (b) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: d */
    private void m27165d(int i) {
        if (this.f23874b0 != i && C5071v.m9140E(this)) {
            Animator animator = this.f23872W;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f23875c0 == 1) {
                m27159b(i, arrayList);
            } else {
                mo30923a(i, (List<Animator>) arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f23872W = animatorSet;
            animatorSet.addListener(new C8436a());
            this.f23872W.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo30924b(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo30967g()) {
            return false;
        }
        getTopEdgeTreatment().mo30963d(f);
        this.f23871V.invalidateSelf();
        return true;
    }

    public Behavior getBehavior() {
        if (this.f23880h0 == null) {
            this.f23880h0 = new Behavior();
        }
        return this.f23880h0;
    }

    /* renamed from: b */
    private void m27159b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m27175o(), "translationX", new float[]{m27162c(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30923a(int i, List<Animator> list) {
        FloatingActionButton o = m27175o();
        if (o != null && !o.mo31681b()) {
            m27174n();
            o.mo31672a((FloatingActionButton.C8523b) new C8437b(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m27160b(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo30922a(actionMenuView, i, z));
    }

    /* renamed from: a */
    private void m27153a(int i, boolean z) {
        if (C5071v.m9140E(this)) {
            Animator animator = this.f23873a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m27177q()) {
                i = 0;
                z = false;
            }
            m27154a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f23873a0 = animatorSet;
            animatorSet.addListener(new C8439c());
            this.f23873a0.start();
        }
    }

    /* renamed from: a */
    private void m27154a(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo30922a(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C8440d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo30922a(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean b = C8567k.m28003b(this);
        int measuredWidth = b ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0217e) && (((Toolbar.C0217e) childAt.getLayoutParams()).f215a & 8388615) == 8388611) {
                if (b) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((b ? actionMenuView.getRight() : actionMenuView.getLeft()) + (b ? this.f23882j0 : -this.f23883k0));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27158a(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo31671a((Animator.AnimatorListener) this.f23884l0);
        floatingActionButton.mo31677b((Animator.AnimatorListener) new C8441e());
        floatingActionButton.mo31674a((C10595k<? extends FloatingActionButton>) this.f23885m0);
    }
}
