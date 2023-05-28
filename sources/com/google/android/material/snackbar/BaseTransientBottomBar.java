package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0414a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.C8566j;
import com.google.android.material.internal.C8567k;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C8600b;
import com.google.android.material.theme.p190a.C8648a;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5020d0;
import p050l.p075h.p084l.C5067r;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10580h;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10585a;
import p112n.p277e.p279b.p282b.p288q.C10609a;
import p112n.p277e.p279b.p282b.p294w.C10620c;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: s */
    static final Handler f24526s = new Handler(Looper.getMainLooper(), new C8581i());
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final boolean f24527t;

    /* renamed from: u */
    private static final int[] f24528u = {C10574b.snackbarStyle};
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final String f24529v = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a */
    private final ViewGroup f24530a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f24531b;

    /* renamed from: c */
    protected final C8595v f24532c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8599a f24533d;

    /* renamed from: e */
    private int f24534e;

    /* renamed from: f */
    private boolean f24535f;

    /* renamed from: g */
    private View f24536g;

    /* renamed from: h */
    private final Runnable f24537h = new C8582j();

    /* renamed from: i */
    private Rect f24538i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f24539j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f24540k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f24541l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f24542m;

    /* renamed from: n */
    private int f24543n;

    /* renamed from: o */
    private List<C8591r<B>> f24544o;

    /* renamed from: p */
    private Behavior f24545p;

    /* renamed from: q */
    private final AccessibilityManager f24546q;

    /* renamed from: r */
    C8600b.C8602b f24547r = new C8585m();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C8592s f24548k = new C8592s(this);

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m28059a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24548k.mo31994a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo30917a(View view) {
            return this.f24548k.mo31995a(view);
        }

        /* renamed from: a */
        public boolean mo2147a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f24548k.mo31993a(coordinatorLayout, view, motionEvent);
            return super.mo2147a(coordinatorLayout, view, motionEvent);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C8573a extends AnimatorListenerAdapter {
        C8573a() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo31970i();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C8574b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f24550a;

        C8574b(int i) {
            this.f24550a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo31963c(this.f24550a);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    class C8575c implements ValueAnimator.AnimatorUpdateListener {
        C8575c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f24532c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C8576d implements ValueAnimator.AnimatorUpdateListener {
        C8576d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f24532c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f24532c.setScaleY(floatValue);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C8577e extends AnimatorListenerAdapter {
        C8577e() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo31970i();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f24533d.mo32018a(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C8578f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f24555a = this.f24556b;

        /* renamed from: b */
        final /* synthetic */ int f24556b;

        C8578f(int i) {
            this.f24556b = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f24527t) {
                C5071v.m9189e(BaseTransientBottomBar.this.f24532c, intValue - this.f24555a);
            } else {
                BaseTransientBottomBar.this.f24532c.setTranslationY((float) intValue);
            }
            this.f24555a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C8579g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f24558a;

        C8579g(int i) {
            this.f24558a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo31963c(this.f24558a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f24533d.mo32019b(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C8580h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private int f24560a = 0;

        C8580h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f24527t) {
                C5071v.m9189e(BaseTransientBottomBar.this.f24532c, intValue - this.f24560a);
            } else {
                BaseTransientBottomBar.this.f24532c.setTranslationY((float) intValue);
            }
            this.f24560a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    static class C8581i implements Handler.Callback {
        C8581i() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo31973l();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo31961b(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C8582j implements Runnable {
        C8582j() {
        }

        public void run() {
            int b;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f24532c != null && baseTransientBottomBar.f24531b != null && (b = (BaseTransientBottomBar.this.m28031p() - BaseTransientBottomBar.this.m28033r()) + ((int) BaseTransientBottomBar.this.f24532c.getTranslationY())) < BaseTransientBottomBar.this.f24542m) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f24532c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f24529v, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f24542m - b;
                BaseTransientBottomBar.this.f24532c.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C8583k implements C5067r {
        C8583k() {
        }

        /* renamed from: a */
        public C5020d0 mo342a(View view, C5020d0 d0Var) {
            int unused = BaseTransientBottomBar.this.f24539j = d0Var.mo17478d();
            int unused2 = BaseTransientBottomBar.this.f24540k = d0Var.mo17479e();
            int unused3 = BaseTransientBottomBar.this.f24541l = d0Var.mo17481f();
            BaseTransientBottomBar.this.m28039x();
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    class C8585m implements C8600b.C8602b {
        C8585m() {
        }

        /* renamed from: a */
        public void mo31986a(int i) {
            Handler handler = BaseTransientBottomBar.f24526s;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        public void show() {
            Handler handler = BaseTransientBottomBar.f24526s;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    class C8586n implements C8593t {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class C8587a implements Runnable {
            C8587a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo31963c(3);
            }
        }

        C8586n() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f24532c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f24542m = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.m28039x();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo31969h()) {
                BaseTransientBottomBar.f24526s.post(new C8587a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$o */
    class C8588o implements C8594u {
        C8588o() {
        }

        /* renamed from: a */
        public void mo31991a(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f24532c.setOnLayoutChangeListener((C8594u) null);
            BaseTransientBottomBar.this.m28036u();
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$q */
    class C8590q implements Runnable {
        C8590q() {
        }

        public void run() {
            C8595v vVar = BaseTransientBottomBar.this.f24532c;
            if (vVar != null) {
                vVar.setVisibility(0);
                if (BaseTransientBottomBar.this.f24532c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.m28037v();
                } else {
                    BaseTransientBottomBar.this.m28038w();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$r */
    public static abstract class C8591r<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$s */
    public static class C8592s {

        /* renamed from: a */
        private C8600b.C8602b f24571a;

        public C8592s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo30918b(0.1f);
            swipeDismissBehavior.mo30914a(0.6f);
            swipeDismissBehavior.mo30915a(0);
        }

        /* renamed from: a */
        public void mo31994a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f24571a = baseTransientBottomBar.f24547r;
        }

        /* renamed from: a */
        public boolean mo31995a(View view) {
            return view instanceof C8595v;
        }

        /* renamed from: a */
        public void mo31993a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C8600b.m28092a().mo32032e(this.f24571a);
                }
            } else if (coordinatorLayout.mo2086a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C8600b.m28092a().mo32031d(this.f24571a);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$t */
    protected interface C8593t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$u */
    protected interface C8594u {
        /* renamed from: a */
        void mo31991a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v */
    protected static class C8595v extends FrameLayout {

        /* renamed from: m */
        private static final View.OnTouchListener f24572m = new C8596a();

        /* renamed from: f */
        private C8594u f24573f;

        /* renamed from: g */
        private C8593t f24574g;

        /* renamed from: h */
        private int f24575h;

        /* renamed from: i */
        private final float f24576i;

        /* renamed from: j */
        private final float f24577j;

        /* renamed from: k */
        private ColorStateList f24578k;

        /* renamed from: l */
        private PorterDuff.Mode f24579l;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$v$a */
        static class C8596a implements View.OnTouchListener {
            C8596a() {
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected C8595v(Context context) {
            this(context, (AttributeSet) null);
        }

        /* renamed from: a */
        private Drawable m28073a() {
            float dimension = getResources().getDimension(C10576d.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C10609a.m35928a(this, C10574b.colorSurface, C10574b.colorOnSurface, getBackgroundOverlayColorAlpha()));
            if (this.f24578k == null) {
                return C0414a.m2029i(gradientDrawable);
            }
            Drawable i = C0414a.m2029i(gradientDrawable);
            C0414a.m2014a(i, this.f24578k);
            return i;
        }

        /* access modifiers changed from: package-private */
        public float getActionTextColorAlpha() {
            return this.f24577j;
        }

        /* access modifiers changed from: package-private */
        public int getAnimationMode() {
            return this.f24575h;
        }

        /* access modifiers changed from: package-private */
        public float getBackgroundOverlayColorAlpha() {
            return this.f24576i;
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            C8593t tVar = this.f24574g;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C5071v.m9145J(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C8593t tVar = this.f24574g;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            C8594u uVar = this.f24573f;
            if (uVar != null) {
                uVar.mo31991a(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: package-private */
        public void setAnimationMode(int i) {
            this.f24575h = i;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f24578k == null)) {
                drawable = C0414a.m2029i(drawable.mutate());
                C0414a.m2014a(drawable, this.f24578k);
                C0414a.m2017a(drawable, this.f24579l);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f24578k = colorStateList;
            if (getBackground() != null) {
                Drawable i = C0414a.m2029i(getBackground().mutate());
                C0414a.m2014a(i, colorStateList);
                C0414a.m2017a(i, this.f24579l);
                if (i != getBackground()) {
                    super.setBackgroundDrawable(i);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f24579l = mode;
            if (getBackground() != null) {
                Drawable i = C0414a.m2029i(getBackground().mutate());
                C0414a.m2017a(i, mode);
                if (i != getBackground()) {
                    super.setBackgroundDrawable(i);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setOnAttachStateChangeListener(C8593t tVar) {
            this.f24574g = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f24572m);
            super.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public void setOnLayoutChangeListener(C8594u uVar) {
            this.f24573f = uVar;
        }

        protected C8595v(Context context, AttributeSet attributeSet) {
            super(C8648a.m28241b(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C10584l.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C10584l.SnackbarLayout_elevation)) {
                C5071v.m9177b((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C10584l.SnackbarLayout_elevation, 0));
            }
            this.f24575h = obtainStyledAttributes.getInt(C10584l.SnackbarLayout_animationMode, 0);
            this.f24576i = obtainStyledAttributes.getFloat(C10584l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(C10620c.m35957a(context2, obtainStyledAttributes, C10584l.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(C8567k.m28001a(obtainStyledAttributes.getInt(C10584l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f24577j = obtainStyledAttributes.getFloat(C10584l.SnackbarLayout_actionTextColorAlpha, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f24572m);
            setFocusable(true);
            if (getBackground() == null) {
                C5071v.m9161a((View) this, m28073a());
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f24527t = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, C8599a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f24530a = viewGroup;
            this.f24533d = aVar;
            Context context = viewGroup.getContext();
            this.f24531b = context;
            C8566j.m27990a(context);
            C8595v vVar = (C8595v) LayoutInflater.from(this.f24531b).inflate(mo31967f(), this.f24530a, false);
            this.f24532c = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).mo32017a(vVar.getActionTextColorAlpha());
            }
            this.f24532c.addView(view);
            ViewGroup.LayoutParams layoutParams = this.f24532c.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f24538i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C5071v.m9193g(this.f24532c, 1);
            C5071v.m9195h(this.f24532c, 1);
            C5071v.m9179b((View) this.f24532c, true);
            C5071v.m9169a((View) this.f24532c, (C5067r) new C8583k());
            C5071v.m9165a((View) this.f24532c, (C5010a) new C8584l());
            this.f24546q = (AccessibilityManager) this.f24531b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: o */
    private int m28030o() {
        View view = this.f24536g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.f24530a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f24530a.getHeight()) - i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public int m28031p() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f24531b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    /* renamed from: q */
    private int m28032q() {
        int height = this.f24532c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f24532c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public int m28033r() {
        int[] iArr = new int[2];
        this.f24532c.getLocationOnScreen(iArr);
        return iArr[1] + this.f24532c.getHeight();
    }

    /* renamed from: s */
    private boolean m28034s() {
        ViewGroup.LayoutParams layoutParams = this.f24532c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.C0346f) && (((CoordinatorLayout.C0346f) layoutParams).mo2175d() instanceof SwipeDismissBehavior);
    }

    /* renamed from: t */
    private boolean m28035t() {
        return this.f24542m > 0 && !this.f24535f && m28034s();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m28036u() {
        if (mo31971j()) {
            mo31957a();
            return;
        }
        this.f24532c.setVisibility(0);
        mo31970i();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m28037v() {
        ValueAnimator a = m28010a(0.0f, 1.0f);
        ValueAnimator b = m28015b(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{a, b});
        animatorSet.setDuration(150);
        animatorSet.addListener(new C8573a());
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m28038w() {
        int q = m28032q();
        if (f24527t) {
            C5071v.m9189e(this.f24532c, q);
        } else {
            this.f24532c.setTranslationY((float) q);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{q, 0});
        valueAnimator.setInterpolator(C10585a.f28457b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C8577e());
        valueAnimator.addUpdateListener(new C8578f(q));
        valueAnimator.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m28039x() {
        ViewGroup.LayoutParams layoutParams = this.f24532c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.f24538i == null) {
            Log.w(f24529v, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        int i = this.f24536g != null ? this.f24543n : this.f24539j;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = this.f24538i;
        marginLayoutParams.bottomMargin = rect.bottom + i;
        marginLayoutParams.leftMargin = rect.left + this.f24540k;
        marginLayoutParams.rightMargin = rect.right + this.f24541l;
        this.f24532c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && m28035t()) {
            this.f24532c.removeCallbacks(this.f24537h);
            this.f24532c.post(this.f24537h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo31971j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.f24546q.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo31972k() {
        C8600b.m28092a().mo32025a(mo31964d(), this.f24547r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo31973l() {
        this.f24532c.setOnAttachStateChangeListener(new C8586n());
        if (this.f24532c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f24532c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0346f) {
                m28012a((CoordinatorLayout.C0346f) layoutParams);
            }
            this.f24543n = m28030o();
            m28039x();
            this.f24532c.setVisibility(4);
            this.f24530a.addView(this.f24532c);
        }
        if (C5071v.m9140E(this.f24532c)) {
            m28036u();
        } else {
            this.f24532c.setOnLayoutChangeListener(new C8588o());
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$p */
    class C8589p implements SwipeDismissBehavior.C8432c {
        C8589p() {
        }

        /* renamed from: a */
        public void mo30920a(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo31958a(0);
        }

        /* renamed from: a */
        public void mo30919a(int i) {
            if (i == 0) {
                C8600b.m28092a().mo32032e(BaseTransientBottomBar.this.f24547r);
            } else if (i == 1 || i == 2) {
                C8600b.m28092a().mo32031d(BaseTransientBottomBar.this.f24547r);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public SwipeDismissBehavior<? extends View> mo31966e() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo31967f() {
        return mo31968g() ? C10580h.mtrl_layout_snackbar : C10580h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo31968g() {
        TypedArray obtainStyledAttributes = this.f24531b.obtainStyledAttributes(f24528u);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo31969h() {
        return C8600b.m28092a().mo32028a(this.f24547r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo31970i() {
        C8600b.m28092a().mo32030c(this.f24547r);
        List<C8591r<B>> list = this.f24544o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24544o.get(size).onShown(this);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    class C8584l extends C5010a {
        C8584l() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            cVar.mo17506a((int) CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);
            cVar.mo17535e(true);
        }

        /* renamed from: a */
        public boolean mo2446a(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo2446a(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo31960b();
            return true;
        }
    }

    /* renamed from: e */
    private void m28021e(int i) {
        if (this.f24532c.getAnimationMode() == 1) {
            m28023f(i);
        } else {
            m28025g(i);
        }
    }

    /* renamed from: f */
    private void m28023f(int i) {
        ValueAnimator a = m28010a(1.0f, 0.0f);
        a.setDuration(75);
        a.addListener(new C8574b(i));
        a.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31958a(int i) {
        C8600b.m28092a().mo32026a(this.f24547r, i);
    }

    /* renamed from: b */
    public void mo31960b() {
        mo31958a(3);
    }

    /* renamed from: c */
    public Context mo31962c() {
        return this.f24531b;
    }

    /* renamed from: d */
    public B mo31965d(int i) {
        this.f24534e = i;
        return this;
    }

    /* renamed from: a */
    public B mo31956a(C8591r<B> rVar) {
        if (rVar == null) {
            return this;
        }
        if (this.f24544o == null) {
            this.f24544o = new ArrayList();
        }
        this.f24544o.add(rVar);
        return this;
    }

    /* renamed from: b */
    public B mo31959b(C8591r<B> rVar) {
        List<C8591r<B>> list;
        if (rVar == null || (list = this.f24544o) == null) {
            return this;
        }
        list.remove(rVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31963c(int i) {
        C8600b.m28092a().mo32029b(this.f24547r);
        List<C8591r<B>> list = this.f24544o;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24544o.get(size).onDismissed(this, i);
            }
        }
        ViewParent parent = this.f24532c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f24532c);
        }
    }

    /* renamed from: d */
    public int mo31964d() {
        return this.f24534e;
    }

    /* renamed from: g */
    private void m28025g(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m28032q()});
        valueAnimator.setInterpolator(C10585a.f28457b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C8579g(i));
        valueAnimator.addUpdateListener(new C8580h());
        valueAnimator.start();
    }

    /* renamed from: b */
    private ValueAnimator m28015b(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10585a.f28459d);
        ofFloat.addUpdateListener(new C8576d());
        return ofFloat;
    }

    /* renamed from: a */
    private void m28012a(CoordinatorLayout.C0346f fVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f24545p;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = mo31966e();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).m28059a((BaseTransientBottomBar<?>) this);
        }
        swipeDismissBehavior.mo30916a((SwipeDismissBehavior.C8432c) new C8589p());
        fVar.mo2166a((CoordinatorLayout.C0343c) swipeDismissBehavior);
        if (this.f24536g == null) {
            fVar.f1619g = 80;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo31961b(int i) {
        if (!mo31971j() || this.f24532c.getVisibility() != 0) {
            mo31963c(i);
        } else {
            m28021e(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31957a() {
        this.f24532c.post(new C8590q());
    }

    /* renamed from: a */
    private ValueAnimator m28010a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10585a.f28456a);
        ofFloat.addUpdateListener(new C8575c());
        return ofFloat;
    }
}
