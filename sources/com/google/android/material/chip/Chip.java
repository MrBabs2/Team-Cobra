package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0240e;
import com.google.android.material.chip.C8482a;
import com.google.android.material.internal.C8566j;
import com.google.android.material.internal.C8567k;
import com.google.android.material.theme.p190a.C8648a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p050l.p089j.p090a.C5096a;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10582j;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p283m.C10592h;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p294w.C10621d;
import p112n.p277e.p279b.p282b.p294w.C10625f;
import p112n.p277e.p279b.p282b.p295x.C10629b;
import p112n.p277e.p279b.p282b.p297z.C10638g;
import p112n.p277e.p279b.p282b.p297z.C10642h;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

public class Chip extends C0240e implements C8482a.C8483a, C10660n {

    /* renamed from: A */
    private static final int[] f24103A = {16842913};

    /* renamed from: B */
    private static final int[] f24104B = {16842911};

    /* renamed from: y */
    private static final int f24105y = C10583k.Widget_MaterialComponents_Chip_Action;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final Rect f24106z = new Rect();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8482a f24107i;

    /* renamed from: j */
    private InsetDrawable f24108j;

    /* renamed from: k */
    private RippleDrawable f24109k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public View.OnClickListener f24110l;

    /* renamed from: m */
    private CompoundButton.OnCheckedChangeListener f24111m;

    /* renamed from: n */
    private boolean f24112n;

    /* renamed from: o */
    private boolean f24113o;

    /* renamed from: p */
    private boolean f24114p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f24115q;

    /* renamed from: r */
    private boolean f24116r;

    /* renamed from: s */
    private int f24117s;

    /* renamed from: t */
    private int f24118t;

    /* renamed from: u */
    private final C8476c f24119u;

    /* renamed from: v */
    private final Rect f24120v;

    /* renamed from: w */
    private final RectF f24121w;

    /* renamed from: x */
    private final C10625f f24122x;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C8474a extends C10625f {
        C8474a() {
        }

        /* renamed from: a */
        public void mo31397a(int i) {
        }

        /* renamed from: a */
        public void mo31398a(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f24107i.mo31496e0() ? Chip.this.f24107i.mo31463V() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C8475b extends ViewOutlineProvider {
        C8475b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f24107i != null) {
                Chip.this.f24107i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C8476c extends C5096a {
        C8476c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo17670a(float f, float f2) {
            return (!Chip.this.m27439i() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo17675a(List<Integer> list) {
            list.add(0);
            if (Chip.this.m27439i() && Chip.this.mo31259c() && Chip.this.f24110l != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo17673a(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f24115q = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo17672a(int i, C5034c cVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.mo17520b(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C10582j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.mo17520b((CharSequence) context.getString(i2, objArr).trim());
                }
                cVar.mo17525c(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo17513a(C5034c.C5035a.f8900e);
                cVar.mo17539f(Chip.this.isEnabled());
                return;
            }
            cVar.mo17520b(charSequence);
            cVar.mo17525c(Chip.f24106z);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo17676a(C5034c cVar) {
            cVar.mo17522b(Chip.this.mo31258b());
            cVar.mo17532d(Chip.this.isClickable());
            if (Chip.this.mo31258b() || Chip.this.isClickable()) {
                cVar.mo17510a((CharSequence) Chip.this.mo31258b() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.mo17510a((CharSequence) "android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo17544h(text);
            } else {
                cVar.mo17520b(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo17680a(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo31260d();
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    private int[] m27437g() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f24115q) {
            i2++;
        }
        if (this.f24114p) {
            i2++;
        }
        if (this.f24113o) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f24115q) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f24114p) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f24113o) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f24121w.setEmpty();
        if (m27439i()) {
            this.f24107i.mo31469a(this.f24121w);
        }
        return this.f24121w;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f24120v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f24120v;
    }

    private C10621d getTextAppearance() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31464W();
        }
        return null;
    }

    /* renamed from: h */
    private void m27438h() {
        if (getBackgroundDrawable() == this.f24108j && this.f24107i.getCallback() == null) {
            this.f24107i.setCallback(this.f24108j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m27439i() {
        C8482a aVar = this.f24107i;
        return (aVar == null || aVar.mo31450I() == null) ? false : true;
    }

    /* renamed from: j */
    private void m27440j() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C8475b());
        }
    }

    /* renamed from: k */
    private void m27441k() {
        if (this.f24108j != null) {
            this.f24108j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m27443m();
        }
    }

    /* renamed from: l */
    private void m27442l() {
        if (!m27439i() || !mo31259c() || this.f24110l == null) {
            C5071v.m9165a((View) this, (C5010a) null);
        } else {
            C5071v.m9165a((View) this, (C5010a) this.f24119u);
        }
    }

    /* renamed from: m */
    private void m27443m() {
        if (C10629b.f28531a) {
            m27444n();
            return;
        }
        this.f24107i.mo31504g(true);
        C5071v.m9161a((View) this, getBackgroundDrawable());
        m27445o();
        m27438h();
    }

    /* renamed from: n */
    private void m27444n() {
        this.f24109k = new RippleDrawable(C10629b.m35983b(this.f24107i.mo31461T()), getBackgroundDrawable(), (Drawable) null);
        this.f24107i.mo31504g(false);
        C5071v.m9161a((View) this, (Drawable) this.f24109k);
        m27445o();
    }

    /* renamed from: o */
    private void m27445o() {
        C8482a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f24107i) != null) {
            int A = (int) (aVar.mo31437A() + this.f24107i.mo31465X() + this.f24107i.mo31547v());
            int F = (int) (this.f24107i.mo31447F() + this.f24107i.mo31466Y() + this.f24107i.mo31544u());
            if (this.f24108j != null) {
                Rect rect = new Rect();
                this.f24108j.getPadding(rect);
                F += rect.left;
                A += rect.right;
            }
            C5071v.m9156a(this, F, getPaddingTop(), A, getPaddingBottom());
        }
    }

    /* renamed from: p */
    private void m27446p() {
        TextPaint paint = getPaint();
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C10621d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo36209b(getContext(), paint, this.f24122x);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f24114p != z) {
            this.f24114p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f24113o != z) {
            this.f24113o = z;
            refreshDrawableState();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m27429a(motionEvent) || this.f24119u.mo17682a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f24119u.mo17681a(keyEvent) || this.f24119u.mo17686c() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C8482a aVar = this.f24107i;
        if ((aVar == null || !aVar.mo31482b0()) ? false : this.f24107i.mo31476a(m27437g())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f24108j;
        return insetDrawable == null ? this.f24107i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31549w();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31551x();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31553y();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo31555z());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f24107i;
    }

    public float getChipEndPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31437A();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31439B();
        }
        return null;
    }

    public float getChipIconSize() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31441C();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31443D();
        }
        return null;
    }

    public float getChipMinHeight() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31445E();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31447F();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31448G();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31449H();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31450I();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31451J();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31452K();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31453L();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31454M();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31456O();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31457P();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f24119u.mo17686c() == 1 || this.f24119u.mo17683b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C10592h getHideMotionSpec() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31458Q();
        }
        return null;
    }

    public float getIconEndPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31459R();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31460S();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31461T();
        }
        return null;
    }

    public C10645k getShapeAppearanceModel() {
        return this.f24107i.mo36264l();
    }

    public C10592h getShowMotionSpec() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31462U();
        }
        return null;
    }

    public float getTextEndPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31465X();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            return aVar.mo31466Y();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10642h.m36068a((View) this, (C10638g) this.f24107i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f24103A);
        }
        if (mo31258b()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f24104B);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f24119u.mo17677a(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo31258b() || isClickable()) {
            accessibilityNodeInfo.setClassName(mo31258b() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo31258b());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C5034c.m8990a(accessibilityNodeInfo).mo17521b((Object) C5034c.C5037c.m9069a(chipGroup.mo31914a(this), 1, chipGroup.mo31400a() ? chipGroup.mo31402b((View) this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f24117s != i) {
            this.f24117s = i;
            m27445o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f24113o
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f24113o
            if (r0 == 0) goto L_0x0034
            r5.mo31260d()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24109k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f24109k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31481b(z);
        }
    }

    public void setCheckableResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31483c(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C8482a aVar = this.f24107i;
        if (aVar == null) {
            this.f24112n = z;
        } else if (aVar.mo31477a0()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f24111m) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31470a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31488d(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31484c(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31493e(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31498f(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31489d(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31502g(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31497f(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31512h(i);
        }
    }

    public void setChipDrawable(C8482a aVar) {
        C8482a aVar2 = this.f24107i;
        if (aVar2 != aVar) {
            m27431b(aVar2);
            this.f24107i = aVar;
            aVar.mo31500f(false);
            m27428a(this.f24107i);
            mo31257a(this.f24118t);
        }
    }

    public void setChipEndPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31501g(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31515i(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31478b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31519j(i);
        }
    }

    public void setChipIconSize(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31511h(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31521k(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31494e(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31523l(i);
        }
    }

    public void setChipIconVisible(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31525m(i);
        }
    }

    public void setChipMinHeight(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31514i(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31527n(i);
        }
    }

    public void setChipStartPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31518j(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31529o(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31499f(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31533p(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31520k(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31535q(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31485c(drawable);
        }
        m27442l();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31473a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31522l(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31537r(i);
        }
    }

    public void setCloseIconResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31538s(i);
        }
        m27442l();
    }

    public void setCloseIconSize(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31524m(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31543t(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31526n(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31545u(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31503g(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31548v(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo36245b(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f24107i != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C8482a aVar = this.f24107i;
                if (aVar != null) {
                    aVar.mo31471a(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f24116r = z;
        mo31257a(this.f24118t);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C10592h hVar) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31474a(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31550w(i);
        }
    }

    public void setIconEndPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31528o(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31552x(i);
        }
    }

    public void setIconStartPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31532p(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31554y(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f24107i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31556z(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f24111m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f24110l = onClickListener;
        m27442l();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31513h(colorStateList);
        }
        if (!this.f24107i.mo31467Z()) {
            m27444n();
        }
    }

    public void setRippleColorResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31438A(i);
            if (!this.f24107i.mo31467Z()) {
                m27444n();
            }
        }
    }

    public void setShapeAppearanceModel(C10645k kVar) {
        this.f24107i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C10592h hVar) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31480b(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31440B(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f24107i != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.f24107i.mo31496e0() ? null : charSequence, bufferType);
            C8482a aVar = this.f24107i;
            if (aVar != null) {
                aVar.mo31479b(charSequence);
            }
        }
    }

    public void setTextAppearance(C10621d dVar) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31475a(dVar);
        }
        m27446p();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31534q(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31444D(i);
        }
    }

    public void setTextStartPadding(float f) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31536r(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31446E(i);
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.chipStyle);
    }

    /* renamed from: b */
    private void m27431b(C8482a aVar) {
        if (aVar != null) {
            aVar.mo31472a((C8482a.C8483a) null);
        }
    }

    /* renamed from: c */
    public boolean mo31259c() {
        C8482a aVar = this.f24107i;
        return aVar != null && aVar.mo31487c0();
    }

    /* renamed from: d */
    public boolean mo31260d() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f24110l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f24119u.mo17679a(1, 1);
        return z;
    }

    /* renamed from: e */
    public boolean mo31263e() {
        return this.f24116r;
    }

    public void setCloseIconVisible(boolean z) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31495e(z);
        }
        m27442l();
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f24105y), attributeSet, i);
        this.f24120v = new Rect();
        this.f24121w = new RectF();
        this.f24122x = new C8474a();
        Context context2 = getContext();
        m27427a(attributeSet);
        C8482a a = C8482a.m27477a(context2, attributeSet, i, f24105y);
        m27426a(context2, attributeSet, i);
        setChipDrawable(a);
        a.mo36245b(C5071v.m9200l(this));
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.Chip, i, f24105y, new int[0]);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(C10620c.m35957a(context2, c, C10584l.Chip_android_textColor));
        }
        boolean hasValue = c.hasValue(C10584l.Chip_shapeAppearance);
        c.recycle();
        this.f24119u = new C8476c(this);
        m27442l();
        if (!hasValue) {
            m27440j();
        }
        setChecked(this.f24112n);
        setText(a.mo31463V());
        setEllipsize(a.mo31457P());
        setIncludeFontPadding(false);
        m27446p();
        if (!this.f24107i.mo31496e0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m27445o();
        if (mo31263e()) {
            setMinHeight(this.f24118t);
        }
        this.f24117s = C5071v.m9204p(this);
    }

    /* renamed from: a */
    private void m27426a(Context context, AttributeSet attributeSet, int i) {
        TypedArray c = C8566j.m27997c(context, attributeSet, C10584l.Chip, i, f24105y, new int[0]);
        this.f24116r = c.getBoolean(C10584l.Chip_ensureMinTouchTargetSize, false);
        this.f24118t = (int) Math.ceil((double) c.getDimension(C10584l.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C8567k.m27999a(getContext(), 48))));
        c.recycle();
    }

    /* renamed from: b */
    public boolean mo31258b() {
        C8482a aVar = this.f24107i;
        return aVar != null && aVar.mo31477a0();
    }

    public void setCheckedIconVisible(boolean z) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31486c(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31490d(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31442C(i);
        }
        m27446p();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C8482a aVar = this.f24107i;
        if (aVar != null) {
            aVar.mo31442C(i);
        }
        m27446p();
    }

    /* renamed from: a */
    private void m27427a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* renamed from: a */
    private void m27428a(C8482a aVar) {
        aVar.mo31472a((C8482a.C8483a) this);
    }

    /* renamed from: a */
    public void mo31256a() {
        mo31257a(this.f24118t);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m27429a(MotionEvent motionEvent) {
        Class<C5096a> cls = C5096a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f24119u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f24119u, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo31257a(int i) {
        this.f24118t = i;
        int i2 = 0;
        if (!mo31263e()) {
            if (this.f24108j != null) {
                m27441k();
            } else {
                m27443m();
            }
            return false;
        }
        int max = Math.max(0, i - this.f24107i.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f24107i.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f24108j != null) {
                Rect rect = new Rect();
                this.f24108j.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    m27443m();
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m27425a(i3, i2, i3, i2);
            m27443m();
            return true;
        }
        if (this.f24108j != null) {
            m27441k();
        } else {
            m27443m();
        }
        return false;
    }

    /* renamed from: a */
    private void m27425a(int i, int i2, int i3, int i4) {
        this.f24108j = new InsetDrawable(this.f24107i, i, i2, i3, i4);
    }
}
