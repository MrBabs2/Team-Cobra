package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.C0253h;
import androidx.appcompat.widget.C0267l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0440l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C8529b;
import com.google.android.material.internal.C8552b;
import com.google.android.material.internal.C8566j;
import com.google.android.material.internal.C8567k;
import com.google.android.material.internal.C8572l;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.theme.p190a.C8648a;
import java.util.List;
import p050l.p075h.p083k.C5008h;
import p050l.p075h.p084l.C5070u;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10592h;
import p112n.p277e.p279b.p282b.p283m.C10595k;
import p112n.p277e.p279b.p282b.p291t.C10612a;
import p112n.p277e.p279b.p282b.p291t.C10614c;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p296y.C10631b;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

public class FloatingActionButton extends C8572l implements C5070u, C0440l, C10612a, C10660n, CoordinatorLayout.C0342b {

    /* renamed from: w */
    private static final int f24306w = C10583k.Widget_Design_FloatingActionButton;

    /* renamed from: g */
    private ColorStateList f24307g;

    /* renamed from: h */
    private PorterDuff.Mode f24308h;

    /* renamed from: i */
    private ColorStateList f24309i;

    /* renamed from: j */
    private PorterDuff.Mode f24310j;

    /* renamed from: k */
    private ColorStateList f24311k;

    /* renamed from: l */
    private int f24312l;

    /* renamed from: m */
    private int f24313m;

    /* renamed from: n */
    private int f24314n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f24315o;

    /* renamed from: p */
    private int f24316p;

    /* renamed from: q */
    boolean f24317q;

    /* renamed from: r */
    final Rect f24318r;

    /* renamed from: s */
    private final Rect f24319s;

    /* renamed from: t */
    private final C0267l f24320t;

    /* renamed from: u */
    private final C10614c f24321u;

    /* renamed from: v */
    private C8529b f24322v;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0343c<T> {

        /* renamed from: a */
        private Rect f24323a;

        /* renamed from: b */
        private C8523b f24324b;

        /* renamed from: c */
        private boolean f24325c;

        public BaseBehavior() {
            this.f24325c = true;
        }

        /* renamed from: b */
        private boolean m27758b(View view, FloatingActionButton floatingActionButton) {
            if (!m27756a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0346f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo31673a(this.f24324b, false);
                return true;
            }
            floatingActionButton.mo31680b(this.f24324b, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10584l.FloatingActionButton_Behavior_Layout);
            this.f24325c = obtainStyledAttributes.getBoolean(C10584l.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void mo2132a(CoordinatorLayout.C0346f fVar) {
            if (fVar.f1620h == 0) {
                fVar.f1620h = 80;
            }
        }

        /* renamed from: a */
        public boolean mo2153b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m27757a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m27755a(view)) {
                return false;
            } else {
                m27758b(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: a */
        private static boolean m27755a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0346f) {
                return ((CoordinatorLayout.C0346f) layoutParams).mo2175d() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m27756a(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0346f fVar = (CoordinatorLayout.C0346f) floatingActionButton.getLayoutParams();
            if (this.f24325c && fVar.mo2174c() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private boolean m27757a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m27756a((View) appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f24323a == null) {
                this.f24323a = new Rect();
            }
            Rect rect = this.f24323a;
            C8552b.m27952a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo31673a(this.f24324b, false);
                return true;
            }
            floatingActionButton.mo31680b(this.f24324b, false);
            return true;
        }

        /* renamed from: a */
        public boolean mo2143a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> b = coordinatorLayout.mo2087b((View) floatingActionButton);
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = b.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m27755a(view) && m27758b(view, floatingActionButton)) {
                        break;
                    }
                } else if (m27757a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2093c((View) floatingActionButton, i);
            m27754a(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: a */
        public boolean mo2145a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f24318r;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: a */
        private void m27754a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f24318r;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0346f fVar = (CoordinatorLayout.C0346f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C5071v.m9189e(floatingActionButton, i2);
                }
                if (i != 0) {
                    C5071v.m9187d(floatingActionButton, i);
                }
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C8522a implements C8529b.C8539j {

        /* renamed from: a */
        final /* synthetic */ C8523b f24326a;

        C8522a(C8523b bVar) {
            this.f24326a = bVar;
        }

        /* renamed from: a */
        public void mo31742a() {
            this.f24326a.mo30950b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo31743b() {
            this.f24326a.mo30949a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C8523b {
        /* renamed from: a */
        public void mo30949a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo30950b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C8525d<T extends FloatingActionButton> implements C8529b.C8538i {

        /* renamed from: a */
        private final C10595k<T> f24329a;

        C8525d(C10595k<T> kVar) {
            this.f24329a = kVar;
        }

        /* renamed from: a */
        public void mo31747a() {
            this.f24329a.mo36153b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo31748b() {
            this.f24329a.mo36152a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C8525d) && ((C8525d) obj).f24329a.equals(this.f24329a);
        }

        public int hashCode() {
            return this.f24329a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private C8529b.C8539j m27738c(C8523b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C8522a(bVar);
    }

    /* renamed from: d */
    private C8529b m27740d() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C8542c(this, new C8524c());
        }
        return new C8529b(this, new C8524c());
    }

    /* renamed from: e */
    private void m27741e() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f24309i;
            if (colorStateList == null) {
                C0414a.m2021b(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f24310j;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0253h.m1182a(colorForState, mode));
        }
    }

    private C8529b getImpl() {
        if (this.f24322v == null) {
            this.f24322v = m27740d();
        }
        return this.f24322v;
    }

    /* renamed from: b */
    public void mo31679b(C8523b bVar) {
        mo31680b(bVar, true);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo31782a(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.f24307g;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f24308h;
    }

    public CoordinatorLayout.C0343c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo31792c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo31798f();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo31799g();
    }

    public Drawable getContentBackground() {
        return getImpl().mo31783b();
    }

    public int getCustomSize() {
        return this.f24314n;
    }

    public int getExpandedComponentIdHint() {
        return this.f24321u.mo36196a();
    }

    public C10592h getHideMotionSpec() {
        return getImpl().mo31796e();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f24311k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f24311k;
    }

    public C10645k getShapeAppearanceModel() {
        C10645k h = getImpl().mo31800h();
        C5008h.m8899a(h);
        return h;
    }

    public C10592h getShowMotionSpec() {
        return getImpl().mo31801i();
    }

    public int getSize() {
        return this.f24313m;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m27734a(this.f24313m);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f24309i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f24310j;
    }

    public boolean getUseCompatPadding() {
        return this.f24317q;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo31804l();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo31805m();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo31807o();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f24315o = (sizeDimension - this.f24316p) / 2;
        getImpl().mo31816x();
        int min = Math.min(m27735a(sizeDimension, i), m27735a(sizeDimension, i2));
        Rect rect = this.f24318r;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo2480a());
        C10614c cVar = this.f24321u;
        Bundle bundle = extendableSavedState.f24599h.get("expandableWidgetHelper");
        C5008h.m8899a(bundle);
        cVar.mo36198a(bundle);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f24599h.put("expandableWidgetHelper", this.f24321u.mo36200c());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo31676a(this.f24319s) || this.f24319s.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f24307g != colorStateList) {
            this.f24307g = colorStateList;
            getImpl().mo31773a(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f24308h != mode) {
            this.f24308h = mode;
            getImpl().mo31775a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo31769a(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo31784b(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo31794d(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f24314n) {
            this.f24314n = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo31797e(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo31795d()) {
            getImpl().mo31781a(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f24321u.mo36197a(i);
    }

    public void setHideMotionSpec(C10592h hVar) {
        getImpl().mo31779a(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C10592h.m35878a(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo31815w();
            if (this.f24309i != null) {
                m27741e();
            }
        }
    }

    public void setImageResource(int i) {
        this.f24320t.mo1679a(i);
        m27741e();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo31809q();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo31809q();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo31791b(z);
    }

    public void setShapeAppearanceModel(C10645k kVar) {
        getImpl().mo31780a(kVar);
    }

    public void setShowMotionSpec(C10592h hVar) {
        getImpl().mo31790b(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C10592h.m35878a(getContext(), i));
    }

    public void setSize(int i) {
        this.f24314n = 0;
        if (i != this.f24313m) {
            this.f24313m = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f24309i != colorStateList) {
            this.f24309i = colorStateList;
            m27741e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f24310j != mode) {
            this.f24310j = mode;
            m27741e();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo31810r();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo31810r();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo31810r();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f24317q != z) {
            this.f24317q = z;
            getImpl().mo31806n();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.floatingActionButtonStyle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31680b(C8523b bVar, boolean z) {
        getImpl().mo31789b(m27738c(bVar), z);
    }

    /* renamed from: c */
    public boolean mo31682c() {
        return getImpl().mo31803k();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f24311k != colorStateList) {
            this.f24311k = colorStateList;
            getImpl().mo31787b(this.f24311k);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f24306w), attributeSet, i);
        this.f24318r = new Rect();
        this.f24319s = new Rect();
        Context context2 = getContext();
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.FloatingActionButton, i, f24306w, new int[0]);
        this.f24307g = C10620c.m35957a(context2, c, C10584l.FloatingActionButton_backgroundTint);
        this.f24308h = C8567k.m28001a(c.getInt(C10584l.FloatingActionButton_backgroundTintMode, -1), (PorterDuff.Mode) null);
        this.f24311k = C10620c.m35957a(context2, c, C10584l.FloatingActionButton_rippleColor);
        this.f24313m = c.getInt(C10584l.FloatingActionButton_fabSize, -1);
        this.f24314n = c.getDimensionPixelSize(C10584l.FloatingActionButton_fabCustomSize, 0);
        this.f24312l = c.getDimensionPixelSize(C10584l.FloatingActionButton_borderWidth, 0);
        float dimension = c.getDimension(C10584l.FloatingActionButton_elevation, 0.0f);
        float dimension2 = c.getDimension(C10584l.FloatingActionButton_hoveredFocusedTranslationZ, 0.0f);
        float dimension3 = c.getDimension(C10584l.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.f24317q = c.getBoolean(C10584l.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C10576d.mtrl_fab_min_touch_target);
        this.f24316p = c.getDimensionPixelSize(C10584l.FloatingActionButton_maxImageSize, 0);
        C10592h a = C10592h.m35879a(context2, c, C10584l.FloatingActionButton_showMotionSpec);
        C10592h a2 = C10592h.m35879a(context2, c, C10584l.FloatingActionButton_hideMotionSpec);
        C10645k a3 = C10645k.m36078a(context2, attributeSet, i, f24306w, C10645k.f28609m).mo36302a();
        boolean z = c.getBoolean(C10584l.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(c.getBoolean(C10584l.FloatingActionButton_android_enabled, true));
        c.recycle();
        C0267l lVar = new C0267l(this);
        this.f24320t = lVar;
        lVar.mo1682a(attributeSet, i);
        this.f24321u = new C10614c(this);
        getImpl().mo31780a(a3);
        getImpl().mo31774a(this.f24307g, this.f24308h, this.f24311k, this.f24312l);
        getImpl().mo31785b(dimensionPixelSize);
        getImpl().mo31769a(dimension);
        getImpl().mo31784b(dimension2);
        getImpl().mo31794d(dimension3);
        getImpl().mo31771a(this.f24316p);
        getImpl().mo31790b(a);
        getImpl().mo31779a(a2);
        getImpl().mo31781a(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: c */
    private void m27739c(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f24318r;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: a */
    public void mo31672a(C8523b bVar) {
        mo31673a(bVar, true);
    }

    /* renamed from: b */
    public void mo31677b(Animator.AnimatorListener animatorListener) {
        getImpl().mo31786b(animatorListener);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C8524c implements C10631b {
        C8524c() {
        }

        /* renamed from: a */
        public void mo31744a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f24318r.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f24315o, i2 + FloatingActionButton.this.f24315o, i3 + FloatingActionButton.this.f24315o, i4 + FloatingActionButton.this.f24315o);
        }

        /* renamed from: a */
        public void mo31745a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: a */
        public boolean mo31746a() {
            return FloatingActionButton.this.f24317q;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31673a(C8523b bVar, boolean z) {
        getImpl().mo31778a(m27738c(bVar), z);
    }

    /* renamed from: b */
    public boolean mo31681b() {
        return getImpl().mo31802j();
    }

    /* renamed from: a */
    public void mo31671a(Animator.AnimatorListener animatorListener) {
        getImpl().mo31772a(animatorListener);
    }

    /* renamed from: b */
    public void mo31678b(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m27739c(rect);
    }

    /* renamed from: a */
    public boolean mo31675a() {
        return this.f24321u.mo36199b();
    }

    /* renamed from: a */
    private int m27734a(int i) {
        int i2 = this.f24314n;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C10576d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C10576d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m27734a(1);
        } else {
            return m27734a(0);
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo31676a(Rect rect) {
        if (!C5071v.m9140E(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m27739c(rect);
        return true;
    }

    /* renamed from: a */
    private static int m27735a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void mo31674a(C10595k<? extends FloatingActionButton> kVar) {
        getImpl().mo31777a((C8529b.C8538i) new C8525d(kVar));
    }
}
