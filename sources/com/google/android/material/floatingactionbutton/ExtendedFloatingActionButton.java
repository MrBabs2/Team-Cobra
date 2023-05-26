package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C8552b;
import java.util.List;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10592h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0342b {

    /* renamed from: A */
    private final CoordinatorLayout.C0343c<ExtendedFloatingActionButton> f24291A;

    /* renamed from: B */
    private boolean f24292B;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public final C8544d f24293w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C8544d f24294x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C8544d f24295y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C8544d f24296z;

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0343c<T> {

        /* renamed from: a */
        private Rect f24297a;

        /* renamed from: b */
        private C8521d f24298b;

        /* renamed from: c */
        private C8521d f24299c;

        /* renamed from: d */
        private boolean f24300d;

        /* renamed from: e */
        private boolean f24301e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f24300d = false;
            this.f24301e = true;
        }

        /* renamed from: b */
        private boolean m27720b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m27718a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0346f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo31659b(extendedFloatingActionButton);
                return true;
            }
            mo31655a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo2145a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo2145a(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f24300d = obtainStyledAttributes.getBoolean(C10584l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f24301e = obtainStyledAttributes.getBoolean(C10584l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2132a(CoordinatorLayout.C0346f fVar) {
            if (fVar.f1620h == 0) {
                fVar.f1620h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo2153b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m27719a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m27717a(view)) {
                return false;
            } else {
                m27720b(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo31659b(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C8544d dVar;
            C8521d dVar2 = this.f24301e ? this.f24299c : this.f24298b;
            if (this.f24301e) {
                dVar = extendedFloatingActionButton.f24293w;
            } else {
                dVar = extendedFloatingActionButton.f24296z;
            }
            extendedFloatingActionButton.m27712a(dVar, dVar2);
        }

        /* renamed from: a */
        private static boolean m27717a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0346f) {
                return ((CoordinatorLayout.C0346f) layoutParams).mo2175d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m27718a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0346f fVar = (CoordinatorLayout.C0346f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f24300d || this.f24301e) && fVar.mo2174c() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m27719a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m27718a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f24297a == null) {
                this.f24297a = new Rect();
            }
            Rect rect = this.f24297a;
            C8552b.m27952a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo31659b(extendedFloatingActionButton);
                return true;
            }
            mo31655a(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo31655a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C8544d dVar;
            C8521d dVar2 = this.f24301e ? this.f24299c : this.f24298b;
            if (this.f24301e) {
                dVar = extendedFloatingActionButton.f24294x;
            } else {
                dVar = extendedFloatingActionButton.f24295y;
            }
            extendedFloatingActionButton.m27712a(dVar, dVar2);
        }

        /* renamed from: a */
        public boolean mo2143a(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> b = coordinatorLayout.mo2087b((View) extendedFloatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m27717a(view) && m27720b(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m27719a(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2093c((View) extendedFloatingActionButton, i);
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C8518a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f24302a;

        /* renamed from: b */
        final /* synthetic */ C8544d f24303b;

        /* renamed from: c */
        final /* synthetic */ C8521d f24304c;

        C8518a(C8544d dVar, C8521d dVar2) {
            this.f24303b = dVar;
            this.f24304c = dVar2;
        }

        public void onAnimationCancel(Animator animator) {
            this.f24302a = true;
            this.f24303b.mo31831a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f24303b.mo31837e();
            if (!this.f24302a) {
                this.f24303b.mo31832a(this.f24304c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f24303b.onAnimationStart(animator);
            this.f24302a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class C8521d {
    }

    static {
        Class<Float> cls = Float.class;
        new C8519b(cls, "width");
        new C8520c(cls, "height");
    }

    public CoordinatorLayout.C0343c<ExtendedFloatingActionButton> getBehavior() {
        return this.f24291A;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C5071v.m9209u(this), C5071v.m9208t(this)) * 2) + getIconSize();
    }

    public C10592h getExtendMotionSpec() {
        return this.f24294x.mo31835c();
    }

    public C10592h getHideMotionSpec() {
        return this.f24296z.mo31835c();
    }

    public C10592h getShowMotionSpec() {
        return this.f24295y.mo31835c();
    }

    public C10592h getShrinkMotionSpec() {
        return this.f24293w.mo31835c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24292B && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f24292B = false;
            this.f24293w.mo31834b();
        }
    }

    public void setExtendMotionSpec(C10592h hVar) {
        this.f24294x.mo31833a(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C10592h.m35878a(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f24292B != z) {
            C8544d dVar = z ? this.f24294x : this.f24293w;
            if (!dVar.mo31836d()) {
                dVar.mo31834b();
            }
        }
    }

    public void setHideMotionSpec(C10592h hVar) {
        this.f24296z.mo31833a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C10592h.m35878a(getContext(), i));
    }

    public void setShowMotionSpec(C10592h hVar) {
        this.f24295y.mo31833a(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C10592h.m35878a(getContext(), i));
    }

    public void setShrinkMotionSpec(C10592h hVar) {
        this.f24293w.mo31833a(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C10592h.m35878a(getContext(), i));
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C8519b extends Property<View, Float> {
        C8519b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C8520c extends Property<View, Float> {
        C8520c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }
    }

    /* renamed from: b */
    private boolean m27714b() {
        return C5071v.m9140E(this) && !isInEditMode();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27712a(C8544d dVar, C8521d dVar2) {
        if (!dVar.mo31836d()) {
            if (!m27714b()) {
                dVar.mo31834b();
                dVar.mo31832a(dVar2);
                return;
            }
            measure(0, 0);
            AnimatorSet f = dVar.mo31838f();
            f.addListener(new C8518a(dVar, dVar2));
            for (Animator.AnimatorListener addListener : dVar.mo31839g()) {
                f.addListener(addListener);
            }
            f.start();
        }
    }
}
