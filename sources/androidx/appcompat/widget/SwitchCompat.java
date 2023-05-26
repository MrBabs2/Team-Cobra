package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0436i;
import p050l.p051a.C4790a;
import p050l.p051a.C4799j;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p051a.p057n.C4819a;
import p050l.p075h.p084l.C5071v;

public class SwitchCompat extends CompoundButton {

    /* renamed from: S */
    private static final Property<SwitchCompat, Float> f869S = new C0211a(Float.class, "thumbPos");

    /* renamed from: T */
    private static final int[] f870T = {16842912};

    /* renamed from: A */
    private VelocityTracker f871A;

    /* renamed from: B */
    private int f872B;

    /* renamed from: C */
    float f873C;

    /* renamed from: D */
    private int f874D;

    /* renamed from: E */
    private int f875E;

    /* renamed from: F */
    private int f876F;

    /* renamed from: G */
    private int f877G;

    /* renamed from: H */
    private int f878H;

    /* renamed from: I */
    private int f879I;

    /* renamed from: J */
    private int f880J;

    /* renamed from: K */
    private final TextPaint f881K;

    /* renamed from: L */
    private ColorStateList f882L;

    /* renamed from: M */
    private Layout f883M;

    /* renamed from: N */
    private Layout f884N;

    /* renamed from: O */
    private TransformationMethod f885O;

    /* renamed from: P */
    ObjectAnimator f886P;

    /* renamed from: Q */
    private final C0283s f887Q;

    /* renamed from: R */
    private final Rect f888R;

    /* renamed from: f */
    private Drawable f889f;

    /* renamed from: g */
    private ColorStateList f890g;

    /* renamed from: h */
    private PorterDuff.Mode f891h;

    /* renamed from: i */
    private boolean f892i;

    /* renamed from: j */
    private boolean f893j;

    /* renamed from: k */
    private Drawable f894k;

    /* renamed from: l */
    private ColorStateList f895l;

    /* renamed from: m */
    private PorterDuff.Mode f896m;

    /* renamed from: n */
    private boolean f897n;

    /* renamed from: o */
    private boolean f898o;

    /* renamed from: p */
    private int f899p;

    /* renamed from: q */
    private int f900q;

    /* renamed from: r */
    private int f901r;

    /* renamed from: s */
    private boolean f902s;

    /* renamed from: t */
    private CharSequence f903t;

    /* renamed from: u */
    private CharSequence f904u;

    /* renamed from: v */
    private boolean f905v;

    /* renamed from: w */
    private int f906w;

    /* renamed from: x */
    private int f907x;

    /* renamed from: y */
    private float f908y;

    /* renamed from: z */
    private float f909z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0211a extends Property<SwitchCompat, Float> {
        C0211a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f873C);
        }

        /* renamed from: a */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static float m980a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: b */
    private void m987b() {
        if (this.f894k == null) {
            return;
        }
        if (this.f897n || this.f898o) {
            Drawable mutate = C0414a.m2029i(this.f894k).mutate();
            this.f894k = mutate;
            if (this.f897n) {
                C0414a.m2014a(mutate, this.f895l);
            }
            if (this.f898o) {
                C0414a.m2017a(this.f894k, this.f896m);
            }
            if (this.f894k.isStateful()) {
                this.f894k.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m989c() {
        ObjectAnimator objectAnimator = this.f886P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f873C > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0298w0.m1423a(this)) {
            f = 1.0f - this.f873C;
        } else {
            f = this.f873C;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f894k;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f888R;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f889f;
        if (drawable2 != null) {
            rect = C0301y.m1453d(drawable2);
        } else {
            rect = C0301y.f1266c;
        }
        return ((((this.f874D - this.f876F) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* renamed from: a */
    public void mo1248a(Context context, int i) {
        C0278q0 a = C0278q0.m1269a(context, i, C4799j.TextAppearance);
        ColorStateList a2 = a.mo1713a(C4799j.TextAppearance_android_textColor);
        if (a2 != null) {
            this.f882L = a2;
        } else {
            this.f882L = getTextColors();
        }
        int c = a.mo1721c(C4799j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f881K.getTextSize()) {
                this.f881K.setTextSize(f);
                requestLayout();
            }
        }
        m983a(a.mo1723d(C4799j.TextAppearance_android_typeface, -1), a.mo1723d(C4799j.TextAppearance_android_textStyle, -1));
        if (a.mo1716a(C4799j.TextAppearance_textAllCaps, false)) {
            this.f885O = new C4819a(getContext());
        } else {
            this.f885O = null;
        }
        a.mo1720b();
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f888R;
        int i3 = this.f877G;
        int i4 = this.f878H;
        int i5 = this.f879I;
        int i6 = this.f880J;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f889f;
        if (drawable != null) {
            rect = C0301y.m1453d(drawable);
        } else {
            rect = C0301y.f1266c;
        }
        Drawable drawable2 = this.f894k;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f894k.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f894k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f889f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f876F + rect2.right;
            this.f889f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0414a.m2013a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f889f;
        if (drawable != null) {
            C0414a.m2012a(drawable, f, f2);
        }
        Drawable drawable2 = this.f894k;
        if (drawable2 != null) {
            C0414a.m2012a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f889f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f894k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0298w0.m1423a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f874D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f901r : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0298w0.m1423a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f874D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f901r : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f905v;
    }

    public boolean getSplitTrack() {
        return this.f902s;
    }

    public int getSwitchMinWidth() {
        return this.f900q;
    }

    public int getSwitchPadding() {
        return this.f901r;
    }

    public CharSequence getTextOff() {
        return this.f904u;
    }

    public CharSequence getTextOn() {
        return this.f903t;
    }

    public Drawable getThumbDrawable() {
        return this.f889f;
    }

    public int getThumbTextPadding() {
        return this.f899p;
    }

    public ColorStateList getThumbTintList() {
        return this.f890g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f891h;
    }

    public Drawable getTrackDrawable() {
        return this.f894k;
    }

    public ColorStateList getTrackTintList() {
        return this.f895l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f896m;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f889f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f894k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f886P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f886P.end();
            this.f886P = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f870T);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f888R;
        Drawable drawable = this.f894k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f878H;
        int i3 = this.f880J;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f889f;
        if (drawable != null) {
            if (!this.f902s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0301y.m1453d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f883M : this.f884N;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f882L;
            if (colorStateList != null) {
                this.f881K.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f881K.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f903t : this.f904u;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f889f != null) {
            Rect rect = this.f888R;
            Drawable drawable = this.f894k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0301y.m1453d(this.f889f);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0298w0.m1423a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f874D + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f874D) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f875E;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f875E;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f875E;
            this.f877G = i7;
            this.f878H = i9;
            this.f880J = i8;
            this.f879I = i6;
        }
        i8 = i10 + i9;
        this.f877G = i7;
        this.f878H = i9;
        this.f880J = i8;
        this.f879I = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f905v) {
            if (this.f883M == null) {
                this.f883M = m981a(this.f903t);
            }
            if (this.f884N == null) {
                this.f884N = m981a(this.f904u);
            }
        }
        Rect rect = this.f888R;
        Drawable drawable = this.f889f;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f889f.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f889f.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f876F = Math.max(this.f905v ? Math.max(this.f883M.getWidth(), this.f884N.getWidth()) + (this.f899p * 2) : 0, i4);
        Drawable drawable2 = this.f894k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f894k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f889f;
        if (drawable3 != null) {
            Rect d = C0301y.m1453d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f900q, (this.f876F * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f874D = max;
        this.f875E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f903t : this.f904u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f871A
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f906w
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f908y
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.C0298w0.m1423a(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f873C
            float r0 = r0 + r2
            float r0 = m980a(r0, r4, r3)
            float r2 = r6.f873C
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f908y = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f908y
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f907x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f909z
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f907x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f906w = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f908y = r0
            r6.f909z = r3
            return r1
        L_0x008b:
            int r0 = r6.f906w
            if (r0 != r2) goto L_0x0096
            r6.m988b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f906w = r0
            android.view.VelocityTracker r0 = r6.f871A
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m986a((float) r0, (float) r2)
            if (r3 == 0) goto L_0x00b9
            r6.f906w = r1
            r6.f908y = r0
            r6.f909z = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C5071v.m9140E(this)) {
            m989c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m985a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0436i.m2145a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f905v != z) {
            this.f905v = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f902s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f900q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f901r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f881K.getTypeface() != null && !this.f881K.getTypeface().equals(typeface)) || (this.f881K.getTypeface() == null && typeface != null)) {
            this.f881K.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f904u = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f903t = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f889f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f889f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f873C = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C4800a.m7936c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f899p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f890g = colorStateList;
        this.f892i = true;
        m982a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f891h = mode;
        this.f893j = true;
        m982a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f894k;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f894k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C4800a.m7936c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f895l = colorStateList;
        this.f897n = true;
        m987b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f896m = mode;
        this.f898o = true;
        m987b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f889f || drawable == this.f894k;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f890g = null;
        this.f891h = null;
        this.f892i = false;
        this.f893j = false;
        this.f895l = null;
        this.f896m = null;
        this.f897n = false;
        this.f898o = false;
        this.f871A = VelocityTracker.obtain();
        this.f888R = new Rect();
        C0268l0.m1250a((View) this, getContext());
        this.f881K = new TextPaint(1);
        Resources resources = getResources();
        this.f881K.density = resources.getDisplayMetrics().density;
        C0278q0 a = C0278q0.m1271a(context, attributeSet, C4799j.SwitchCompat, i, 0);
        C5071v.m9157a(this, context, C4799j.SwitchCompat, attributeSet, a.mo1714a(), i, 0);
        Drawable b = a.mo1719b(C4799j.SwitchCompat_android_thumb);
        this.f889f = b;
        if (b != null) {
            b.setCallback(this);
        }
        Drawable b2 = a.mo1719b(C4799j.SwitchCompat_track);
        this.f894k = b2;
        if (b2 != null) {
            b2.setCallback(this);
        }
        this.f903t = a.mo1726e(C4799j.SwitchCompat_android_textOn);
        this.f904u = a.mo1726e(C4799j.SwitchCompat_android_textOff);
        this.f905v = a.mo1716a(C4799j.SwitchCompat_showText, true);
        this.f899p = a.mo1721c(C4799j.SwitchCompat_thumbTextPadding, 0);
        this.f900q = a.mo1721c(C4799j.SwitchCompat_switchMinWidth, 0);
        this.f901r = a.mo1721c(C4799j.SwitchCompat_switchPadding, 0);
        this.f902s = a.mo1716a(C4799j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo1713a(C4799j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f890g = a2;
            this.f892i = true;
        }
        PorterDuff.Mode a3 = C0301y.m1449a(a.mo1723d(C4799j.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f891h != a3) {
            this.f891h = a3;
            this.f893j = true;
        }
        if (this.f892i || this.f893j) {
            m982a();
        }
        ColorStateList a4 = a.mo1713a(C4799j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f895l = a4;
            this.f897n = true;
        }
        PorterDuff.Mode a5 = C0301y.m1449a(a.mo1723d(C4799j.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f896m != a5) {
            this.f896m = a5;
            this.f898o = true;
        }
        if (this.f897n || this.f898o) {
            m987b();
        }
        int g = a.mo1729g(C4799j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo1248a(context, g);
        }
        C0283s sVar = new C0283s(this);
        this.f887Q = sVar;
        sVar.mo1779a(attributeSet, i);
        a.mo1720b();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f907x = viewConfiguration.getScaledTouchSlop();
        this.f872B = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: b */
    private void m988b(MotionEvent motionEvent) {
        this.f906w = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f871A.computeCurrentVelocity(1000);
            float xVelocity = this.f871A.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f872B)) {
                z = getTargetCheckedState();
            } else if (!C0298w0.m1423a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m984a(motionEvent);
    }

    /* renamed from: a */
    private void m983a(int i, int i2) {
        Typeface typeface;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i != 2) {
            typeface = i != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        mo1249a(typeface, i2);
    }

    /* renamed from: a */
    public void mo1249a(Typeface typeface, int i) {
        Typeface typeface2;
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setSwitchTypeface(typeface2);
            int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f881K;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f881K;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f881K.setFakeBoldText(false);
        this.f881K.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    /* renamed from: a */
    private void m982a() {
        if (this.f889f == null) {
            return;
        }
        if (this.f892i || this.f893j) {
            Drawable mutate = C0414a.m2029i(this.f889f).mutate();
            this.f889f = mutate;
            if (this.f892i) {
                C0414a.m2014a(mutate, this.f890g);
            }
            if (this.f893j) {
                C0414a.m2017a(this.f889f, this.f891h);
            }
            if (this.f889f.isStateful()) {
                this.f889f.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private Layout m981a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f885O;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f881K;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private boolean m986a(float f, float f2) {
        if (this.f889f == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f889f.getPadding(this.f888R);
        int i = this.f878H;
        int i2 = this.f907x;
        int i3 = i - i2;
        int i4 = (this.f877G + thumbOffset) - i2;
        Rect rect = this.f888R;
        int i5 = this.f876F + i4 + rect.left + rect.right + i2;
        int i6 = this.f880J + i2;
        if (f <= ((float) i4) || f >= ((float) i5) || f2 <= ((float) i3) || f2 >= ((float) i6)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m984a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m985a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f869S, new float[]{z ? 1.0f : 0.0f});
        this.f886P = ofFloat;
        ofFloat.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f886P.setAutoCancel(true);
        }
        this.f886P.start();
    }
}
