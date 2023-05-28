package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p050l.p075h.p079g.C4968a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p075h.p084l.p085e0.C5042f;
import p050l.p089j.p090a.C5104c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10645k;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C0343c<V> {

    /* renamed from: N */
    private static final int f23971N = C10583k.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    private int f23972A;

    /* renamed from: B */
    private boolean f23973B;

    /* renamed from: C */
    int f23974C;

    /* renamed from: D */
    int f23975D;

    /* renamed from: E */
    WeakReference<V> f23976E;

    /* renamed from: F */
    WeakReference<View> f23977F;

    /* renamed from: G */
    private final ArrayList<C8460e> f23978G = new ArrayList<>();

    /* renamed from: H */
    private VelocityTracker f23979H;

    /* renamed from: I */
    int f23980I;

    /* renamed from: J */
    private int f23981J;

    /* renamed from: K */
    boolean f23982K;

    /* renamed from: L */
    private Map<View, Integer> f23983L;

    /* renamed from: M */
    private final C5104c.C5107c f23984M = new C8458c();

    /* renamed from: a */
    private int f23985a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f23986b = true;

    /* renamed from: c */
    private boolean f23987c = false;

    /* renamed from: d */
    private float f23988d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f23989e;

    /* renamed from: f */
    private boolean f23990f;

    /* renamed from: g */
    private int f23991g;

    /* renamed from: h */
    private boolean f23992h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C10638g f23993i;

    /* renamed from: j */
    private boolean f23994j;

    /* renamed from: k */
    private C10645k f23995k;

    /* renamed from: l */
    private boolean f23996l;

    /* renamed from: m */
    private BottomSheetBehavior<V>.C4755f f23997m = null;

    /* renamed from: n */
    private ValueAnimator f23998n;

    /* renamed from: o */
    int f23999o;

    /* renamed from: p */
    int f24000p;

    /* renamed from: q */
    int f24001q;

    /* renamed from: r */
    float f24002r = 0.5f;

    /* renamed from: s */
    int f24003s;

    /* renamed from: t */
    float f24004t = -1.0f;

    /* renamed from: u */
    boolean f24005u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f24006v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f24007w = true;

    /* renamed from: x */
    int f24008x = 4;

    /* renamed from: y */
    C5104c f24009y;

    /* renamed from: z */
    private boolean f24010z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C8456a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f24016f;

        /* renamed from: g */
        final /* synthetic */ int f24017g;

        C8456a(View view, int i) {
            this.f24016f = view;
            this.f24017g = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo31068a(this.f24016f, this.f24017g);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C8457b implements ValueAnimator.AnimatorUpdateListener {
        C8457b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f23993i != null) {
                BottomSheetBehavior.this.f23993i.mo36249c(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    class C8458c extends C5104c.C5107c {
        C8458c() {
        }

        /* renamed from: a */
        public void mo17717a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo31066a(i2);
        }

        /* renamed from: b */
        public boolean mo17722b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f24008x;
            if (i2 == 1 || bottomSheetBehavior.f23982K) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f23980I == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f23977F;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f23976E;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public void mo17723c(int i) {
            if (i == 1 && BottomSheetBehavior.this.f24007w) {
                BottomSheetBehavior.this.mo31085f(1);
            }
        }

        /* renamed from: a */
        public void mo17715a(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f24005u || !bottomSheetBehavior.mo31072a(view, f2)) {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f23986b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f24001q;
                            if (top < i4) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f24003s)) {
                                    i = BottomSheetBehavior.this.f23999o;
                                } else {
                                    i2 = BottomSheetBehavior.this.f24001q;
                                }
                            } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f24003s)) {
                                i2 = BottomSheetBehavior.this.f24001q;
                            } else {
                                i = BottomSheetBehavior.this.f24003s;
                                BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                            }
                            i3 = 6;
                            BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f24000p) < Math.abs(top - BottomSheetBehavior.this.f24003s)) {
                            i = BottomSheetBehavior.this.f24000p;
                        } else {
                            i = BottomSheetBehavior.this.f24003s;
                            BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.f23986b) {
                            i = BottomSheetBehavior.this.f24003s;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f24001q) < Math.abs(top2 - BottomSheetBehavior.this.f24003s)) {
                                i2 = BottomSheetBehavior.this.f24001q;
                                i3 = 6;
                            } else {
                                i = BottomSheetBehavior.this.f24003s;
                            }
                        }
                        BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || m27309c(view)) {
                    i = BottomSheetBehavior.this.f23975D;
                    i3 = 5;
                    BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                } else if (BottomSheetBehavior.this.f23986b) {
                    i = BottomSheetBehavior.this.f24000p;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.f23999o) < Math.abs(view.getTop() - BottomSheetBehavior.this.f24001q)) {
                    i = BottomSheetBehavior.this.f23999o;
                } else {
                    i2 = BottomSheetBehavior.this.f24001q;
                    i3 = 6;
                    BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f23986b) {
                i = BottomSheetBehavior.this.f24000p;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f24001q;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo31069a(view, i3, i, true);
                }
                i = bottomSheetBehavior3.f23999o;
            }
            i3 = 3;
            BottomSheetBehavior.this.mo31069a(view, i3, i, true);
        }

        /* renamed from: c */
        private boolean m27309c(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f23975D + bottomSheetBehavior.mo31073b()) / 2;
        }

        /* renamed from: b */
        public int mo17719b(View view, int i, int i2) {
            int b = BottomSheetBehavior.this.mo31073b();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C4968a.m8801a(i, b, bottomSheetBehavior.f24005u ? bottomSheetBehavior.f23975D : bottomSheetBehavior.f24003s);
        }

        /* renamed from: b */
        public int mo17718b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f24005u) {
                return bottomSheetBehavior.f23975D;
            }
            return bottomSheetBehavior.f24003s;
        }

        /* renamed from: a */
        public int mo17713a(View view, int i, int i2) {
            return view.getLeft();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    class C8459d implements C5042f {

        /* renamed from: a */
        final /* synthetic */ int f24021a;

        C8459d(int i) {
            this.f24021a = i;
        }

        /* renamed from: a */
        public boolean mo17588a(View view, C5042f.C5043a aVar) {
            BottomSheetBehavior.this.mo31083e(this.f24021a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public static abstract class C8460e {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    private class C8461f implements Runnable {

        /* renamed from: f */
        private final View f24023f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f24024g;

        /* renamed from: h */
        int f24025h;

        C8461f(View view, int i) {
            this.f24023f = view;
            this.f24025h = i;
        }

        public void run() {
            C5104c cVar = BottomSheetBehavior.this.f24009y;
            if (cVar == null || !cVar.mo17701a(true)) {
                BottomSheetBehavior.this.mo31085f(this.f24025h);
            } else {
                C5071v.m9162a(this.f24023f, (Runnable) this);
            }
            this.f24024g = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: g */
    private void m27269g(int i) {
        View view = (View) this.f23976E.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !C5071v.m9139D(view)) {
                mo31068a(view, i);
            } else {
                view.post(new C8456a(view, i));
            }
        }
    }

    /* renamed from: h */
    private void m27271h(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.f23996l != z) {
                this.f23996l = z;
                if (this.f23993i != null && (valueAnimator = this.f23998n) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f23998n.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.f23998n.setFloatValues(new float[]{1.0f - f, f});
                    this.f23998n.start();
                }
            }
        }
    }

    /* renamed from: i */
    private float m27272i() {
        VelocityTracker velocityTracker = this.f23979H;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f23988d);
        return this.f23979H.getYVelocity(this.f23980I);
    }

    /* renamed from: j */
    private void m27273j() {
        this.f23980I = -1;
        VelocityTracker velocityTracker = this.f23979H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23979H = null;
        }
    }

    /* renamed from: k */
    private void m27274k() {
        View view;
        WeakReference<V> weakReference = this.f23976E;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C5071v.m9191f(view, 524288);
            C5071v.m9191f(view, 262144);
            C5071v.m9191f(view, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
            if (this.f24005u && this.f24008x != 5) {
                m27257a(view, C5034c.C5035a.f8905j, 5);
            }
            int i = this.f24008x;
            int i2 = 6;
            if (i == 3) {
                if (this.f23986b) {
                    i2 = 4;
                }
                m27257a(view, C5034c.C5035a.f8904i, i2);
            } else if (i == 4) {
                if (this.f23986b) {
                    i2 = 3;
                }
                m27257a(view, C5034c.C5035a.f8903h, i2);
            } else if (i == 6) {
                m27257a(view, C5034c.C5035a.f8904i, 4);
                m27257a(view, C5034c.C5035a.f8903h, 3);
            }
        }
    }

    /* renamed from: a */
    public void mo2137a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo31085f(int i) {
        View view;
        if (this.f24008x != i) {
            this.f24008x = i;
            WeakReference<V> weakReference = this.f23976E;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    m27267f(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    m27267f(false);
                }
                m27271h(i);
                for (int i2 = 0; i2 < this.f23978G.size(); i2++) {
                    this.f23978G.get(i2).onStateChanged(view, i);
                }
                m27274k();
            }
        }
    }

    /* renamed from: a */
    public void mo2133a(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.mo2133a(coordinatorLayout, v, savedState.mo2480a());
        m27259a(savedState);
        int i = savedState.f24011h;
        if (i == 1 || i == 2) {
            this.f24008x = 4;
        } else {
            this.f24008x = i;
        }
    }

    /* renamed from: b */
    public boolean mo2152b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f24008x == 1 && actionMasked == 0) {
            return true;
        }
        C5104c cVar = this.f24009y;
        if (cVar != null) {
            cVar.mo17697a(motionEvent);
        }
        if (actionMasked == 0) {
            m27273j();
        }
        if (this.f23979H == null) {
            this.f23979H = VelocityTracker.obtain();
        }
        this.f23979H.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f24010z && Math.abs(((float) this.f23981J) - motionEvent.getY()) > ((float) this.f24009y.mo17702b())) {
            this.f24009y.mo17698a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f24010z;
    }

    /* renamed from: c */
    public void mo31078c(int i) {
        mo31067a(i, false);
    }

    /* renamed from: d */
    public Parcelable mo2158d(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.mo2158d(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: e */
    public void mo31084e(boolean z) {
        this.f24006v = z;
    }

    /* renamed from: c */
    public void mo31079c(boolean z) {
        this.f23994j = z;
    }

    /* renamed from: d */
    public void mo31081d(boolean z) {
        if (this.f24005u != z) {
            this.f24005u = z;
            if (!z && this.f24008x == 5) {
                mo31083e(4);
            }
            m27274k();
        }
    }

    /* renamed from: e */
    public void mo31083e(int i) {
        if (i != this.f24008x) {
            if (this.f23976E != null) {
                m27269g(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f24005u && i == 5)) {
                this.f24008x = i;
            }
        }
    }

    /* renamed from: c */
    public int mo31077c() {
        return this.f24008x;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8455a();

        /* renamed from: h */
        final int f24011h;

        /* renamed from: i */
        int f24012i;

        /* renamed from: j */
        boolean f24013j;

        /* renamed from: k */
        boolean f24014k;

        /* renamed from: l */
        boolean f24015l;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        static class C8455a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8455a() {
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
            this.f24011h = parcel.readInt();
            this.f24012i = parcel.readInt();
            boolean z = false;
            this.f24013j = parcel.readInt() == 1;
            this.f24014k = parcel.readInt() == 1;
            this.f24015l = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24011h);
            parcel.writeInt(this.f24012i);
            parcel.writeInt(this.f24013j ? 1 : 0);
            parcel.writeInt(this.f24014k ? 1 : 0);
            parcel.writeInt(this.f24015l ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f24011h = bottomSheetBehavior.f24008x;
            this.f24012i = bottomSheetBehavior.f23989e;
            this.f24013j = bottomSheetBehavior.f23986b;
            this.f24014k = bottomSheetBehavior.f24005u;
            this.f24015l = bottomSheetBehavior.f24006v;
        }
    }

    /* renamed from: g */
    private int m27268g() {
        if (this.f23990f) {
            return Math.max(this.f23991g, this.f23975D - ((this.f23974C * 9) / 16));
        }
        return this.f23989e;
    }

    /* renamed from: e */
    private void m27264e() {
        int g = m27268g();
        if (this.f23986b) {
            this.f24003s = Math.max(this.f23975D - g, this.f24000p);
        } else {
            this.f24003s = this.f23975D - g;
        }
    }

    /* renamed from: h */
    private void m27270h() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f23998n = ofFloat;
        ofFloat.setDuration(500);
        this.f23998n.addUpdateListener(new C8457b());
    }

    /* renamed from: a */
    public void mo2132a(CoordinatorLayout.C0346f fVar) {
        super.mo2132a(fVar);
        this.f23976E = null;
        this.f24009y = null;
    }

    /* renamed from: d */
    public void mo31080d(int i) {
        this.f23985a = i;
    }

    /* renamed from: d */
    public boolean mo31082d() {
        return this.f23994j;
    }

    /* renamed from: f */
    private void m27266f() {
        this.f24001q = (int) (((float) this.f23975D) * (1.0f - this.f24002r));
    }

    /* renamed from: a */
    public void mo2131a() {
        super.mo2131a();
        this.f23976E = null;
        this.f24009y = null;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.BottomSheetBehavior_Layout);
        this.f23992h = obtainStyledAttributes.hasValue(C10584l.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(C10584l.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            m27256a(context, attributeSet, hasValue, C10620c.m35957a(context, obtainStyledAttributes, C10584l.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            m27255a(context, attributeSet, hasValue);
        }
        m27270h();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f24004t = obtainStyledAttributes.getDimension(C10584l.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(C10584l.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo31078c(obtainStyledAttributes.getDimensionPixelSize(C10584l.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            mo31078c(i);
        }
        mo31081d(obtainStyledAttributes.getBoolean(C10584l.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo31079c(obtainStyledAttributes.getBoolean(C10584l.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo31076b(obtainStyledAttributes.getBoolean(C10584l.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo31084e(obtainStyledAttributes.getBoolean(C10584l.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo31071a(obtainStyledAttributes.getBoolean(C10584l.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo31080d(obtainStyledAttributes.getInt(C10584l.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo31065a(obtainStyledAttributes.getFloat(C10584l.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(C10584l.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo31074b(obtainStyledAttributes.getDimensionPixelOffset(C10584l.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        } else {
            mo31074b(peekValue2.data);
        }
        obtainStyledAttributes.recycle();
        this.f23988d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: f */
    private void m27267f(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f23976E;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && z) {
                    if (this.f23983L == null) {
                        this.f23983L = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f23976E.get()) {
                        if (z) {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f23983L.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            if (this.f23987c) {
                                C5071v.m9195h(childAt, 4);
                            }
                        } else if (this.f23987c && (map = this.f23983L) != null && map.containsKey(childAt)) {
                            C5071v.m9195h(childAt, this.f23983L.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f23983L = null;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo2143a(CoordinatorLayout coordinatorLayout, V v, int i) {
        C10638g gVar;
        if (C5071v.m9201m(coordinatorLayout) && !C5071v.m9201m(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f23976E == null) {
            this.f23991g = coordinatorLayout.getResources().getDimensionPixelSize(C10576d.design_bottom_sheet_peek_height_min);
            m27258a(coordinatorLayout);
            this.f23976E = new WeakReference<>(v);
            if (this.f23992h && (gVar = this.f23993i) != null) {
                C5071v.m9161a((View) v, (Drawable) gVar);
            }
            C10638g gVar2 = this.f23993i;
            if (gVar2 != null) {
                float f = this.f24004t;
                if (f == -1.0f) {
                    f = C5071v.m9200l(v);
                }
                gVar2.mo36245b(f);
                boolean z = this.f24008x == 3;
                this.f23996l = z;
                this.f23993i.mo36249c(z ? 0.0f : 1.0f);
            }
            m27274k();
            if (C5071v.m9202n(v) == 0) {
                C5071v.m9195h(v, 1);
            }
        }
        if (this.f24009y == null) {
            this.f24009y = C5104c.m9349a((ViewGroup) coordinatorLayout, this.f23984M);
        }
        int top = v.getTop();
        coordinatorLayout.mo2093c((View) v, i);
        this.f23974C = coordinatorLayout.getWidth();
        int height = coordinatorLayout.getHeight();
        this.f23975D = height;
        this.f24000p = Math.max(0, height - v.getHeight());
        m27266f();
        m27264e();
        int i2 = this.f24008x;
        if (i2 == 3) {
            C5071v.m9189e(v, mo31073b());
        } else if (i2 == 6) {
            C5071v.m9189e(v, this.f24001q);
        } else if (!this.f24005u || i2 != 5) {
            int i3 = this.f24008x;
            if (i3 == 4) {
                C5071v.m9189e(v, this.f24003s);
            } else if (i3 == 1 || i3 == 2) {
                C5071v.m9189e(v, top - v.getTop());
            }
        } else {
            C5071v.m9189e(v, this.f23975D);
        }
        this.f23977F = new WeakReference<>(mo31064a((View) v));
        return true;
    }

    /* renamed from: b */
    public boolean mo2155b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f23972A = 0;
        this.f23973B = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo31076b(boolean z) {
        if (this.f23986b != z) {
            this.f23986b = z;
            if (this.f23976E != null) {
                m27264e();
            }
            mo31085f((!this.f23986b || this.f24008x != 6) ? this.f24008x : 3);
            m27274k();
        }
    }

    /* renamed from: b */
    public void mo31074b(int i) {
        if (i >= 0) {
            this.f23999o = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: b */
    public int mo31073b() {
        return this.f23986b ? this.f24000p : this.f23999o;
    }

    @Deprecated
    /* renamed from: b */
    public void mo31075b(C8460e eVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.f23978G.clear();
        if (eVar != null) {
            this.f23978G.add(eVar);
        }
    }

    /* renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m27260b(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0346f) {
            CoordinatorLayout.C0343c d = ((CoordinatorLayout.C0346f) layoutParams).mo2175d();
            if (d instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) d;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2147a(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r9.f24007w
            if (r0 != 0) goto L_0x000e
            goto L_0x00d2
        L_0x000e:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L_0x0017
            r9.m27273j()
        L_0x0017:
            android.view.VelocityTracker r3 = r9.f23979H
            if (r3 != 0) goto L_0x0021
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.f23979H = r3
        L_0x0021:
            android.view.VelocityTracker r3 = r9.f23979H
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L_0x003c
            if (r0 == r2) goto L_0x0031
            r11 = 3
            if (r0 == r11) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            r9.f23982K = r1
            r9.f23980I = r4
            boolean r11 = r9.f24010z
            if (r11 == 0) goto L_0x007f
            r9.f24010z = r1
            return r1
        L_0x003c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.f23981J = r7
            int r7 = r9.f24008x
            if (r7 == r5) goto L_0x006e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.f23977F
            if (r7 == 0) goto L_0x0057
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0058
        L_0x0057:
            r7 = r3
        L_0x0058:
            if (r7 == 0) goto L_0x006e
            int r8 = r9.f23981J
            boolean r7 = r10.mo2086a((android.view.View) r7, (int) r6, (int) r8)
            if (r7 == 0) goto L_0x006e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.f23980I = r7
            r9.f23982K = r2
        L_0x006e:
            int r7 = r9.f23980I
            if (r7 != r4) goto L_0x007c
            int r4 = r9.f23981J
            boolean r11 = r10.mo2086a((android.view.View) r11, (int) r6, (int) r4)
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r9.f24010z = r11
        L_0x007f:
            boolean r11 = r9.f24010z
            if (r11 != 0) goto L_0x008e
            l.j.a.c r11 = r9.f24009y
            if (r11 == 0) goto L_0x008e
            boolean r11 = r11.mo17705b((android.view.MotionEvent) r12)
            if (r11 == 0) goto L_0x008e
            return r2
        L_0x008e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.f23977F
            if (r11 == 0) goto L_0x0099
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x0099:
            if (r0 != r5) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r11 = r9.f24010z
            if (r11 != 0) goto L_0x00d1
            int r11 = r9.f24008x
            if (r11 == r2) goto L_0x00d1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.mo2086a((android.view.View) r3, (int) r11, (int) r0)
            if (r10 != 0) goto L_0x00d1
            l.j.a.c r10 = r9.f24009y
            if (r10 == 0) goto L_0x00d1
            int r10 = r9.f23981J
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            l.j.a.c r11 = r9.f24009y
            int r11 = r11.mo17702b()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d1
            r1 = 1
        L_0x00d1:
            return r1
        L_0x00d2:
            r9.f24010z = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo2147a(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public void mo2139a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f23977F;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo31073b()) {
                        iArr[1] = top - mo31073b();
                        C5071v.m9189e(v, -iArr[1]);
                        mo31085f(3);
                    } else if (this.f24007w) {
                        iArr[1] = i2;
                        C5071v.m9189e(v, -i2);
                        mo31085f(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f24003s;
                    if (i4 > i5 && !this.f24005u) {
                        iArr[1] = top - i5;
                        C5071v.m9189e(v, -iArr[1]);
                        mo31085f(4);
                    } else if (this.f24007w) {
                        iArr[1] = i2;
                        C5071v.m9189e(v, -i2);
                        mo31085f(1);
                    } else {
                        return;
                    }
                }
                mo31066a(v.getTop());
                this.f23972A = i2;
                this.f23973B = true;
            }
        }
    }

    /* renamed from: a */
    public void mo2134a(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo31073b()) {
            mo31085f(3);
            return;
        }
        WeakReference<View> weakReference = this.f23977F;
        if (weakReference != null && view == weakReference.get() && this.f23973B) {
            if (this.f23972A > 0) {
                if (this.f23986b) {
                    i2 = this.f24000p;
                } else {
                    int top = v.getTop();
                    int i5 = this.f24001q;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = this.f23999o;
                    }
                }
                mo31069a((View) v, i4, i2, false);
                this.f23973B = false;
            } else if (!this.f24005u || !mo31072a((View) v, m27272i())) {
                if (this.f23972A == 0) {
                    int top2 = v.getTop();
                    if (!this.f23986b) {
                        int i6 = this.f24001q;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.f24003s)) {
                                i2 = this.f23999o;
                                mo31069a((View) v, i4, i2, false);
                                this.f23973B = false;
                            }
                            i2 = this.f24001q;
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f24003s)) {
                            i2 = this.f24001q;
                        } else {
                            i3 = this.f24003s;
                        }
                    } else if (Math.abs(top2 - this.f24000p) < Math.abs(top2 - this.f24003s)) {
                        i2 = this.f24000p;
                        mo31069a((View) v, i4, i2, false);
                        this.f23973B = false;
                    } else {
                        i3 = this.f24003s;
                    }
                } else if (this.f23986b) {
                    i3 = this.f24003s;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f24001q) < Math.abs(top3 - this.f24003s)) {
                        i2 = this.f24001q;
                    } else {
                        i3 = this.f24003s;
                    }
                }
                i4 = 4;
                mo31069a((View) v, i4, i2, false);
                this.f23973B = false;
            } else {
                i2 = this.f23975D;
                i4 = 5;
                mo31069a((View) v, i4, i2, false);
                this.f23973B = false;
            }
            i4 = 6;
            mo31069a((View) v, i4, i2, false);
            this.f23973B = false;
        }
    }

    /* renamed from: a */
    public boolean mo2149a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f23977F;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f24008x != 3 || super.mo2149a(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31067a(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f23990f
            if (r4 != 0) goto L_0x0015
            r3.f23990f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f23990f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f23989e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f23990f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f23989e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f23976E
            if (r4 == 0) goto L_0x0042
            r3.m27264e()
            int r4 = r3.f24008x
            r0 = 4
            if (r4 != r0) goto L_0x0042
            java.lang.ref.WeakReference<V> r4 = r3.f23976E
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x003f
            int r4 = r3.f24008x
            r3.m27269g(r4)
            goto L_0x0042
        L_0x003f:
            r4.requestLayout()
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo31067a(int, boolean):void");
    }

    /* renamed from: a */
    public void mo31065a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f24002r = f;
        if (this.f23976E != null) {
            m27266f();
        }
    }

    /* renamed from: a */
    public void mo31071a(boolean z) {
        this.f24007w = z;
    }

    /* renamed from: a */
    public void mo31070a(C8460e eVar) {
        if (!this.f23978G.contains(eVar)) {
            this.f23978G.add(eVar);
        }
    }

    /* renamed from: a */
    private void m27259a(SavedState savedState) {
        int i = this.f23985a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f23989e = savedState.f24012i;
            }
            int i2 = this.f23985a;
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f23986b = savedState.f24013j;
            }
            int i3 = this.f23985a;
            if (i3 == -1 || (i3 & 4) == 4) {
                this.f24005u = savedState.f24014k;
            }
            int i4 = this.f23985a;
            if (i4 == -1 || (i4 & 8) == 8) {
                this.f24006v = savedState.f24015l;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo31072a(View view, float f) {
        if (this.f24006v) {
            return true;
        }
        if (view.getTop() < this.f24003s) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f24003s)) / ((float) m27268g()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo31064a(View view) {
        if (C5071v.m9141F(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a = mo31064a(viewGroup.getChildAt(i));
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m27255a(Context context, AttributeSet attributeSet, boolean z) {
        m27256a(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: a */
    private void m27256a(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f23992h) {
            this.f23995k = C10645k.m36076a(context, attributeSet, C10574b.bottomSheetStyle, f23971N).mo36302a();
            C10638g gVar = new C10638g(this.f23995k);
            this.f23993i = gVar;
            gVar.mo36239a(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f23993i.setTint(typedValue.data);
                return;
            }
            this.f23993i.mo36240a(colorStateList);
        }
    }

    /* renamed from: a */
    private void m27258a(CoordinatorLayout coordinatorLayout) {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT >= 29 && !mo31082d() && (rootWindowInsets = coordinatorLayout.getRootWindowInsets()) != null) {
            this.f23989e += rootWindowInsets.getSystemGestureInsets().bottom;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31068a(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f24003s;
        } else if (i == 6) {
            int i4 = this.f24001q;
            if (!this.f23986b || i4 > (i3 = this.f24000p)) {
                i2 = i4;
            } else {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = mo31073b();
        } else if (!this.f24005u || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f23975D;
        }
        mo31069a(view, i, i2, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31069a(View view, int i, int i2, boolean z) {
        boolean z2;
        if (z) {
            z2 = this.f24009y.mo17708c(view.getLeft(), i2);
        } else {
            z2 = this.f24009y.mo17707b(view, view.getLeft(), i2);
        }
        if (z2) {
            mo31085f(2);
            m27271h(i);
            if (this.f23997m == null) {
                this.f23997m = new C8461f(view, i);
            }
            if (!this.f23997m.f24024g) {
                BottomSheetBehavior<V>.C4755f fVar = this.f23997m;
                fVar.f24025h = i;
                C5071v.m9162a(view, (Runnable) fVar);
                boolean unused = this.f23997m.f24024g = true;
                return;
            }
            this.f23997m.f24025h = i;
            return;
        }
        mo31085f(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31066a(int i) {
        float f;
        float f2;
        View view = (View) this.f23976E.get();
        if (view != null && !this.f23978G.isEmpty()) {
            int i2 = this.f24003s;
            if (i > i2 || i2 == mo31073b()) {
                int i3 = this.f24003s;
                f = (float) (i3 - i);
                f2 = (float) (this.f23975D - i3);
            } else {
                int i4 = this.f24003s;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo31073b());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f23978G.size(); i5++) {
                this.f23978G.get(i5).onSlide(view, f3);
            }
        }
    }

    /* renamed from: a */
    private void m27257a(V v, C5034c.C5035a aVar, int i) {
        C5071v.m9167a(v, aVar, (CharSequence) null, new C8459d(i));
    }
}
