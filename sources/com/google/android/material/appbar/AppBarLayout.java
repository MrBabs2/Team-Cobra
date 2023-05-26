package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0414a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p079g.C4968a;
import p050l.p075h.p083k.C5003c;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5061l;
import p050l.p075h.p084l.C5067r;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5042f;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10579g;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10642h;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0342b {

    /* renamed from: w */
    private static final int f23721w = C10583k.Widget_Design_AppBarLayout;

    /* renamed from: f */
    private int f23722f;

    /* renamed from: g */
    private int f23723g;

    /* renamed from: h */
    private int f23724h;

    /* renamed from: i */
    private int f23725i;

    /* renamed from: j */
    private boolean f23726j;

    /* renamed from: k */
    private int f23727k;

    /* renamed from: l */
    private C5020d0 f23728l;

    /* renamed from: m */
    private List<C8414c> f23729m;

    /* renamed from: n */
    private boolean f23730n;

    /* renamed from: o */
    private boolean f23731o;

    /* renamed from: p */
    private boolean f23732p;

    /* renamed from: q */
    private boolean f23733q;

    /* renamed from: r */
    private int f23734r;

    /* renamed from: s */
    private WeakReference<View> f23735s;

    /* renamed from: t */
    private ValueAnimator f23736t;

    /* renamed from: u */
    private int[] f23737u;

    /* renamed from: v */
    private Drawable f23738v;

    protected static class BaseBehavior<T extends AppBarLayout> extends C8421a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f23739k;

        /* renamed from: l */
        private int f23740l;

        /* renamed from: m */
        private ValueAnimator f23741m;

        /* renamed from: n */
        private int f23742n = -1;

        /* renamed from: o */
        private boolean f23743o;

        /* renamed from: p */
        private float f23744p;

        /* renamed from: q */
        private WeakReference<View> f23745q;

        /* renamed from: r */
        private C8411d f23746r;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C8408a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f23750a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f23751b;

            C8408a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f23750a = coordinatorLayout;
                this.f23751b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo30867c(this.f23750a, this.f23751b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        class C8409b implements C5042f {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f23753a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f23754b;

            /* renamed from: c */
            final /* synthetic */ View f23755c;

            /* renamed from: d */
            final /* synthetic */ int f23756d;

            C8409b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f23753a = coordinatorLayout;
                this.f23754b = appBarLayout;
                this.f23755c = view;
                this.f23756d = i;
            }

            /* renamed from: a */
            public boolean mo17588a(View view, C5042f.C5043a aVar) {
                BaseBehavior.this.mo2139a(this.f23753a, this.f23754b, this.f23755c, 0, this.f23756d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        class C8410c implements C5042f {

            /* renamed from: a */
            final /* synthetic */ AppBarLayout f23758a;

            /* renamed from: b */
            final /* synthetic */ boolean f23759b;

            C8410c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
                this.f23758a = appBarLayout;
                this.f23759b = z;
            }

            /* renamed from: a */
            public boolean mo17588a(View view, C5042f.C5043a aVar) {
                this.f23758a.setExpanded(this.f23759b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class C8411d<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo30793a(T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: a */
        private static boolean m26967a(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: d */
        private void m26972d(CoordinatorLayout coordinatorLayout, T t) {
            int c = mo30785c();
            int b = m26968b(t, c);
            if (b >= 0) {
                View childAt = t.getChildAt(b);
                C8415d dVar = (C8415d) childAt.getLayoutParams();
                int a = dVar.mo30798a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (b == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m26967a(a, 2)) {
                        i2 += C5071v.m9205q(childAt);
                    } else if (m26967a(a, 5)) {
                        int q = C5071v.m9205q(childAt) + i2;
                        if (c < q) {
                            i = q;
                        } else {
                            i2 = q;
                        }
                    }
                    if (m26967a(a, 32)) {
                        i += dVar.topMargin;
                        i2 -= dVar.bottomMargin;
                    }
                    if (c < (i2 + i) / 2) {
                        i = i2;
                    }
                    m26962a(coordinatorLayout, t, C4968a.m8801a(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: e */
        private void m26973e(CoordinatorLayout coordinatorLayout, T t) {
            C5071v.m9191f(coordinatorLayout, C5034c.C5035a.f8901f.mo17568a());
            C5071v.m9191f(coordinatorLayout, C5034c.C5035a.f8902g.mo17568a());
            View a = m26960a(coordinatorLayout);
            if (a != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0346f) a.getLayoutParams()).mo2175d() instanceof ScrollingViewBehavior)) {
                m26965a(coordinatorLayout, t, a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo30786c(T t) {
            return t.getTotalScrollRange();
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: c */
        private int m26970c(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C8415d dVar = (C8415d) childAt.getLayoutParams();
                Interpolator b = dVar.mo30799b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = dVar.mo30798a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + dVar.topMargin + dVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C5071v.m9205q(childAt);
                        }
                    }
                    if (C5071v.m9201m(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C8407a();

            /* renamed from: h */
            int f23747h;

            /* renamed from: i */
            float f23748i;

            /* renamed from: j */
            boolean f23749j;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            static class C8407a implements Parcelable.ClassLoaderCreator<SavedState> {
                C8407a() {
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

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f23747h = parcel.readInt();
                this.f23748i = parcel.readFloat();
                this.f23749j = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f23747h);
                parcel.writeFloat(this.f23748i);
                parcel.writeByte(this.f23749j ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }

        /* renamed from: b */
        private boolean m26969b(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo30735b() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: b */
        private int m26968b(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C8415d dVar = (C8415d) childAt.getLayoutParams();
                if (m26967a(dVar.mo30798a(), 32)) {
                    top -= dVar.topMargin;
                    bottom += dVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public boolean mo2155b(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo30736c() || m26969b(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f23741m) != null) {
                valueAnimator.cancel();
            }
            this.f23745q = null;
            this.f23740l = i2;
            return z;
        }

        /* renamed from: a */
        public void mo2139a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo30865a(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo30736c()) {
                t.mo30732a(t.mo30731a(view));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo30781b(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: b */
        public Parcelable mo2158d(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable d = super.mo2158d(coordinatorLayout, t);
            int b = mo30876b();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + b;
                if (childAt.getTop() + b > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(d);
                    savedState.f23747h = i;
                    if (bottom == C5071v.m9205q(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f23749j = z;
                    savedState.f23748i = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return d;
        }

        /* renamed from: c */
        private boolean m26971c(CoordinatorLayout coordinatorLayout, T t) {
            List<View> c = coordinatorLayout.mo2091c((View) t);
            int size = c.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.C0343c d = ((CoordinatorLayout.C0346f) c.get(i).getLayoutParams()).mo2175d();
                if (!(d instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) d).mo30872c() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: a */
        public void mo2137a(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo30865a(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                m26973e(coordinatorLayout, t);
            }
        }

        /* renamed from: a */
        public void mo2134a(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f23740l == 0 || i == 1) {
                m26972d(coordinatorLayout, t);
                if (t.mo30736c()) {
                    t.mo30732a(t.mo30731a(view));
                }
            }
            this.f23745q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo30785c() {
            return mo30876b() + this.f23739k;
        }

        /* renamed from: a */
        private void m26962a(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo30785c() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m26963a(coordinatorLayout, t, i, i2);
        }

        /* renamed from: a */
        private void m26963a(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int c = mo30785c();
            if (c == i) {
                ValueAnimator valueAnimator = this.f23741m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f23741m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f23741m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f23741m = valueAnimator3;
                valueAnimator3.setInterpolator(C10585a.f28460e);
                this.f23741m.addUpdateListener(new C8408a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f23741m.setDuration((long) Math.min(i2, 600));
            this.f23741m.setIntValues(new int[]{c, i});
            this.f23741m.start();
        }

        /* renamed from: a */
        public boolean mo2144a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0346f) t.getLayoutParams()).height != -2) {
                return super.mo2144a(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2082a((View) t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: a */
        public boolean mo2143a(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean a = super.mo2143a(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f23742n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f23743o) {
                    i2 = C5071v.m9205q(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f23744p);
                }
                mo30867c(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m26962a(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo30867c(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m26962a(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo30867c(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo30738d();
            this.f23742n = -1;
            mo30875a(C4968a.m8801a(mo30876b(), -t.getTotalScrollRange(), 0));
            m26964a(coordinatorLayout, t, mo30876b(), 0, true);
            t.mo30726a(mo30876b());
            m26973e(coordinatorLayout, t);
            return a;
        }

        /* renamed from: a */
        private void m26965a(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo30785c() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                m26966a(coordinatorLayout, t, C5034c.C5035a.f8901f, false);
            }
            if (mo30785c() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    C5071v.m9167a(coordinatorLayout, C5034c.C5035a.f8902g, (CharSequence) null, new C8409b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            m26966a(coordinatorLayout, t, C5034c.C5035a.f8902g, true);
        }

        /* renamed from: a */
        private void m26966a(CoordinatorLayout coordinatorLayout, T t, C5034c.C5035a aVar, boolean z) {
            C5071v.m9167a(coordinatorLayout, aVar, (CharSequence) null, new C8410c(this, t, z));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo30776a(T t) {
            C8411d dVar = this.f23746r;
            if (dVar != null) {
                return dVar.mo30793a(t);
            }
            WeakReference<View> weakReference = this.f23745q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo30788e(CoordinatorLayout coordinatorLayout, T t) {
            m26972d(coordinatorLayout, t);
            if (t.mo30736c()) {
                t.mo30732a(t.mo30731a(m26960a(coordinatorLayout)));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo30782b(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int c = mo30785c();
            int i4 = 0;
            if (i2 == 0 || c < i2 || c > i3) {
                this.f23739k = 0;
            } else {
                int a = C4968a.m8801a(i, i2, i3);
                if (c != a) {
                    int c2 = t.mo30730a() ? m26970c(t, a) : a;
                    boolean a2 = mo30875a(c2);
                    i4 = c - a;
                    this.f23739k = a - c2;
                    if (!a2 && t.mo30730a()) {
                        coordinatorLayout.mo2081a((View) t);
                    }
                    t.mo30726a(mo30876b());
                    m26964a(coordinatorLayout, t, a, a < c ? -1 : 1, false);
                }
            }
            m26973e(coordinatorLayout, t);
            return i4;
        }

        /* renamed from: a */
        private void m26964a(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View a = m26961a((AppBarLayout) t, i);
            if (a != null) {
                int a2 = ((C8415d) a.getLayoutParams()).mo30798a();
                boolean z2 = false;
                if ((a2 & 1) != 0) {
                    int q = C5071v.m9205q(a);
                    if (i2 <= 0 || (a2 & 12) == 0 ? !((a2 & 2) == 0 || (-i) < (a.getBottom() - q) - t.getTopInset()) : (-i) >= (a.getBottom() - q) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo30736c()) {
                    z2 = t.mo30731a(m26960a(coordinatorLayout));
                }
                boolean a3 = t.mo30732a(z2);
                if (z || (a3 && m26971c(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: a */
        private static View m26961a(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        private View m26960a(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C5061l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2133a(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.mo2133a(coordinatorLayout, t, savedState.mo2480a());
                this.f23742n = savedState.f23747h;
                this.f23744p = savedState.f23748i;
                this.f23743o = savedState.f23749j;
                return;
            }
            super.mo2133a(coordinatorLayout, t, parcelable);
            this.f23742n = -1;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C8423b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: c */
        public void mo2157c(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                C5071v.m9191f(coordinatorLayout, C5034c.C5035a.f8901f.mo17568a());
                C5071v.m9191f(coordinatorLayout, C5034c.C5035a.f8902g.mo17568a());
            }
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.ScrollingViewBehavior_Layout);
            mo30870b(obtainStyledAttributes.getDimensionPixelSize(C10584l.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public boolean mo2153b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m27005a(view, view2);
            m27006b(view, view2);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public float mo30795b(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m27004a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo30796c(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo30796c(view);
        }

        /* renamed from: a */
        public boolean mo2148a(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: a */
        public boolean mo2146a(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo30794a((List) coordinatorLayout.mo2087b(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f23805d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.mo30729a(false, !z);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        private void m27006b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo30736c()) {
                    appBarLayout.mo30732a(appBarLayout.mo30731a(view));
                }
            }
        }

        /* renamed from: a */
        private void m27005a(View view, View view2) {
            CoordinatorLayout.C0343c d = ((CoordinatorLayout.C0346f) view2.getLayoutParams()).mo2175d();
            if (d instanceof BaseBehavior) {
                C5071v.m9189e(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) d).f23739k) + mo30873d()) - mo30869a(view2));
            }
        }

        /* renamed from: a */
        private static int m27004a(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0343c d = ((CoordinatorLayout.C0346f) appBarLayout.getLayoutParams()).mo2175d();
            if (d instanceof BaseBehavior) {
                return ((BaseBehavior) d).mo30785c();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AppBarLayout m27008a(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C8412a implements C5067r {
        C8412a() {
        }

        /* renamed from: a */
        public C5020d0 mo342a(View view, C5020d0 d0Var) {
            AppBarLayout.this.mo30725a(d0Var);
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    class C8413b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C10638g f23761a;

        C8413b(C10638g gVar) {
            this.f23761a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f23761a.mo36245b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C8414c<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public interface C8416e extends C8414c<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    private void m26940e() {
        WeakReference<View> weakReference = this.f23735s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23735s = null;
    }

    /* renamed from: f */
    private boolean m26941f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C8415d) getChildAt(i).getLayoutParams()).mo30800c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m26942g() {
        this.f23723g = -1;
        this.f23724h = -1;
        this.f23725i = -1;
    }

    /* renamed from: h */
    private boolean m26943h() {
        return this.f23738v != null && getTopInset() > 0;
    }

    /* renamed from: i */
    private boolean m26944i() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C5071v.m9201m(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m26945j() {
        setWillNotDraw(!m26943h());
    }

    /* renamed from: a */
    public void mo30727a(C8414c cVar) {
        if (this.f23729m == null) {
            this.f23729m = new ArrayList();
        }
        if (cVar != null && !this.f23729m.contains(cVar)) {
            this.f23729m.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo30733b(C8414c cVar) {
        List<C8414c> list = this.f23729m;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* renamed from: c */
    public boolean mo30736c() {
        return this.f23733q;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C8415d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo30738d() {
        this.f23727k = 0;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m26943h()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f23722f));
            this.f23738v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23738v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public CoordinatorLayout.C0343c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int q;
        int i2 = this.f23724h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C8415d dVar = (C8415d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f23763a;
            if ((i4 & 5) == 5) {
                int i5 = dVar.topMargin + dVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    q = C5071v.m9205q(childAt);
                } else if ((i4 & 2) != 0) {
                    q = measuredHeight - C5071v.m9205q(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C5071v.m9201m(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + q;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f23724h = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f23725i;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C8415d dVar = (C8415d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + dVar.topMargin + dVar.bottomMargin;
            int i4 = dVar.f23763a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C5071v.m9205q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f23725i = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f23734r;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int q = C5071v.m9205q(this);
        if (q == 0) {
            int childCount = getChildCount();
            q = childCount >= 1 ? C5071v.m9205q(getChildAt(childCount - 1)) : 0;
            if (q == 0) {
                return getHeight() / 3;
            }
        }
        return (q * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f23727k;
    }

    public Drawable getStatusBarForeground() {
        return this.f23738v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C5020d0 d0Var = this.f23728l;
        if (d0Var != null) {
            return d0Var.mo17482g();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f23723g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C8415d dVar = (C8415d) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = dVar.f23763a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + dVar.topMargin + dVar.bottomMargin;
            if (i2 == 0 && C5071v.m9201m(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C5071v.m9205q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f23723g = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10642h.m36066a((View) this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f23737u == null) {
            this.f23737u = new int[4];
        }
        int[] iArr = this.f23737u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.f23731o ? C10574b.state_liftable : -C10574b.state_liftable;
        iArr[1] = (!this.f23731o || !this.f23732p) ? -C10574b.state_lifted : C10574b.state_lifted;
        iArr[2] = this.f23731o ? C10574b.state_collapsible : -C10574b.state_collapsible;
        iArr[3] = (!this.f23731o || !this.f23732p) ? -C10574b.state_collapsed : C10574b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m26940e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C5071v.m9201m(this) && m26944i()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C5071v.m9189e(getChildAt(childCount), topInset);
            }
        }
        m26942g();
        this.f23726j = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C8415d) getChildAt(i5).getLayoutParams()).mo30799b() != null) {
                this.f23726j = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f23738v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f23730n) {
            if (!this.f23733q && !m26941f()) {
                z2 = false;
            }
            m26939b(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C5071v.m9201m(this) && m26944i()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C4968a.m8801a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m26942g();
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C10642h.m36067a((View) this, f);
    }

    public void setExpanded(boolean z) {
        mo30729a(z, C5071v.m9140E(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f23733q = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f23734r = i;
        m26940e();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f23738v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f23738v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f23738v.setState(getDrawableState());
                }
                C0414a.m2020a(this.f23738v, C5071v.m9204p(this));
                this.f23738v.setVisible(getVisibility() == 0, false);
                this.f23738v.setCallback(this);
            }
            m26945j();
            C5071v.m9144I(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C4800a.m7936c(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C8426e.m27068a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f23738v;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23738v;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.appBarLayoutStyle);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f23721w), attributeSet, i);
        this.f23723g = -1;
        this.f23724h = -1;
        this.f23725i = -1;
        this.f23727k = 0;
        Context context2 = getContext();
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 21) {
            C8426e.m27067a(this);
            C8426e.m27069a(this, attributeSet, i, f23721w);
        }
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.AppBarLayout, i, f23721w, new int[0]);
        C5071v.m9161a((View) this, c.getDrawable(C10584l.AppBarLayout_android_background));
        if (getBackground() instanceof ColorDrawable) {
            C10638g gVar = new C10638g();
            gVar.mo36240a(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.mo36239a(context2);
            C5071v.m9161a((View) this, (Drawable) gVar);
        }
        if (c.hasValue(C10584l.AppBarLayout_expanded)) {
            m26937a(c.getBoolean(C10584l.AppBarLayout_expanded, false), false, false);
        }
        if (Build.VERSION.SDK_INT >= 21 && c.hasValue(C10584l.AppBarLayout_elevation)) {
            C8426e.m27068a(this, (float) c.getDimensionPixelSize(C10584l.AppBarLayout_elevation, 0));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (c.hasValue(C10584l.AppBarLayout_android_keyboardNavigationCluster)) {
                setKeyboardNavigationCluster(c.getBoolean(C10584l.AppBarLayout_android_keyboardNavigationCluster, false));
            }
            if (c.hasValue(C10584l.AppBarLayout_android_touchscreenBlocksFocus)) {
                setTouchscreenBlocksFocus(c.getBoolean(C10584l.AppBarLayout_android_touchscreenBlocksFocus, false));
            }
        }
        this.f23733q = c.getBoolean(C10584l.AppBarLayout_liftOnScroll, false);
        this.f23734r = c.getResourceId(C10584l.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(c.getDrawable(C10584l.AppBarLayout_statusBarForeground));
        c.recycle();
        C5071v.m9169a((View) this, (C5067r) new C8412a());
    }

    /* renamed from: b */
    public void mo30734b(C8416e eVar) {
        mo30733b((C8414c) eVar);
    }

    /* access modifiers changed from: protected */
    public C8415d generateDefaultLayoutParams() {
        return new C8415d(-1, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo30735b() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: b */
    private boolean m26939b(boolean z) {
        if (this.f23731o == z) {
            return false;
        }
        this.f23731o = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: a */
    public void mo30728a(C8416e eVar) {
        mo30727a((C8414c) eVar);
    }

    public C8415d generateLayoutParams(AttributeSet attributeSet) {
        return new C8415d(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo30729a(boolean z, boolean z2) {
        m26937a(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public C8415d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C8415d((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C8415d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C8415d(layoutParams);
    }

    /* renamed from: a */
    private void m26937a(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f23727k = i2 | i;
        requestLayout();
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static class C8415d extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f23763a = 1;

        /* renamed from: b */
        Interpolator f23764b;

        public C8415d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.AppBarLayout_Layout);
            this.f23763a = obtainStyledAttributes.getInt(C10584l.AppBarLayout_Layout_layout_scrollFlags, 0);
            if (obtainStyledAttributes.hasValue(C10584l.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.f23764b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(C10584l.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo30798a() {
            return this.f23763a;
        }

        /* renamed from: b */
        public Interpolator mo30799b() {
            return this.f23764b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo30800c() {
            int i = this.f23763a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public C8415d(int i, int i2) {
            super(i, i2);
        }

        public C8415d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C8415d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C8415d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: b */
    private View m26938b(View view) {
        int i;
        if (this.f23735s == null && (i = this.f23734r) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f23734r);
            }
            if (findViewById != null) {
                this.f23735s = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f23735s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo30730a() {
        return this.f23726j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30726a(int i) {
        this.f23722f = i;
        if (!willNotDraw()) {
            C5071v.m9144I(this);
        }
        List<C8414c> list = this.f23729m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8414c cVar = this.f23729m.get(i2);
                if (cVar != null) {
                    cVar.onOffsetChanged(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo30732a(boolean z) {
        if (this.f23732p == z) {
            return false;
        }
        this.f23732p = z;
        refreshDrawableState();
        if (!this.f23733q || !(getBackground() instanceof C10638g)) {
            return true;
        }
        m26936a((C10638g) getBackground(), z);
        return true;
    }

    /* renamed from: a */
    private void m26936a(C10638g gVar, boolean z) {
        float dimension = getResources().getDimension(C10576d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f23736t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f23736t = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C10579g.app_bar_elevation_anim_duration));
        this.f23736t.setInterpolator(C10585a.f28456a);
        this.f23736t.addUpdateListener(new C8413b(gVar));
        this.f23736t.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo30731a(View view) {
        View b = m26938b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5020d0 mo30725a(C5020d0 d0Var) {
        C5020d0 d0Var2 = C5071v.m9201m(this) ? d0Var : null;
        if (!C5003c.m8889a(this.f23728l, d0Var2)) {
            this.f23728l = d0Var2;
            m26945j();
            requestLayout();
        }
        return d0Var;
    }
}
