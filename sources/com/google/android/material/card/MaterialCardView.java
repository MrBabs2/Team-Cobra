package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.C8566j;
import com.google.android.material.theme.p190a.C8648a;
import p050l.p051a.p052k.p053a.C4800a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p297z.C10642h;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

public class MaterialCardView extends CardView implements Checkable, C10660n {

    /* renamed from: t */
    private static final int[] f24073t = {16842911};

    /* renamed from: u */
    private static final int[] f24074u = {16842912};

    /* renamed from: v */
    private static final int[] f24075v = {C10574b.state_dragged};

    /* renamed from: w */
    private static final int f24076w = C10583k.Widget_MaterialComponents_CardView;

    /* renamed from: o */
    private final C8472a f24077o;

    /* renamed from: p */
    private boolean f24078p;

    /* renamed from: q */
    private boolean f24079q;

    /* renamed from: r */
    private boolean f24080r;

    /* renamed from: s */
    private C8471a f24081s;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C8471a {
        /* renamed from: a */
        void mo31216a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    private void m27367e() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f24077o.mo31217a();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f24077o.mo31227b().getBounds());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31179b(int i, int i2, int i3, int i4) {
        super.mo1885a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public boolean mo31180c() {
        C8472a aVar = this.f24077o;
        return aVar != null && aVar.mo31247p();
    }

    /* renamed from: d */
    public boolean mo31181d() {
        return this.f24080r;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f24077o.mo31231c();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f24077o.mo31233d();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f24077o.mo31235e();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f24077o.mo31237f();
    }

    public int getContentPaddingBottom() {
        return this.f24077o.mo31245n().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f24077o.mo31245n().left;
    }

    public int getContentPaddingRight() {
        return this.f24077o.mo31245n().right;
    }

    public int getContentPaddingTop() {
        return this.f24077o.mo31245n().top;
    }

    public float getProgress() {
        return this.f24077o.mo31239h();
    }

    public float getRadius() {
        return this.f24077o.mo31238g();
    }

    public ColorStateList getRippleColor() {
        return this.f24077o.mo31240i();
    }

    public C10645k getShapeAppearanceModel() {
        return this.f24077o.mo31241j();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f24077o.mo31242k();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f24077o.mo31243l();
    }

    public int getStrokeWidth() {
        return this.f24077o.mo31244m();
    }

    public boolean isChecked() {
        return this.f24079q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10642h.m36068a((View) this, this.f24077o.mo31227b());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo31180c()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24073t);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24074u);
        }
        if (mo31181d()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24075v);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo31180c());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f24077o.mo31220a(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f24078p) {
            if (!this.f24077o.mo31246o()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f24077o.mo31226a(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f24077o.mo31222a(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f24077o.mo31250s();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f24077o.mo31229b(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f24077o.mo31230b(z);
    }

    public void setChecked(boolean z) {
        if (this.f24079q != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f24077o.mo31224a(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.f24077o.mo31224a(C4800a.m7936c(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f24077o.mo31232c(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f24077o.mo31248q();
    }

    public void setDragged(boolean z) {
        if (this.f24080r != z) {
            this.f24080r = z;
            refreshDrawableState();
            m27367e();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f24077o.mo31251t();
    }

    public void setOnCheckedChangeListener(C8471a aVar) {
        this.f24081s = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f24077o.mo31251t();
        this.f24077o.mo31249r();
    }

    public void setProgress(float f) {
        this.f24077o.mo31228b(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f24077o.mo31218a(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f24077o.mo31234d(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f24077o.mo31234d(C4800a.m7935b(getContext(), i));
    }

    public void setShapeAppearanceModel(C10645k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.mo36285a(getBoundsAsRectF()));
        }
        this.f24077o.mo31225a(kVar);
    }

    public void setStrokeColor(int i) {
        this.f24077o.mo31236e(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f24077o.mo31219a(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f24077o.mo31251t();
        this.f24077o.mo31249r();
    }

    public void toggle() {
        if (mo31180c() && isEnabled()) {
            this.f24079q = !this.f24079q;
            refreshDrawableState();
            m27367e();
            C8471a aVar = this.f24081s;
            if (aVar != null) {
                aVar.mo31216a(this, this.f24079q);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.materialCardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f24077o.mo31222a(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f24077o.mo31236e(colorStateList);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f24076w), attributeSet, i);
        this.f24079q = false;
        this.f24080r = false;
        this.f24078p = true;
        TypedArray c = C8566j.m27997c(getContext(), attributeSet, C10584l.MaterialCardView, i, f24076w, new int[0]);
        C8472a aVar = new C8472a(this, attributeSet, i, f24076w);
        this.f24077o = aVar;
        aVar.mo31222a(super.getCardBackgroundColor());
        this.f24077o.mo31221a(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        this.f24077o.mo31223a(c);
        c.recycle();
    }
}
