package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.C0414a;
import androidx.core.widget.C0436i;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C8566j;
import com.google.android.material.internal.C8567k;
import com.google.android.material.theme.p190a.C8648a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10574b;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.C10584l;
import p112n.p277e.p279b.p282b.p294w.C10620c;
import p112n.p277e.p279b.p282b.p297z.C10642h;
import p112n.p277e.p279b.p282b.p297z.C10645k;
import p112n.p277e.p279b.p282b.p297z.C10660n;

public class MaterialButton extends AppCompatButton implements Checkable, C10660n {

    /* renamed from: t */
    private static final int[] f24038t = {16842911};

    /* renamed from: u */
    private static final int[] f24039u = {16842912};

    /* renamed from: v */
    private static final int f24040v = C10583k.Widget_MaterialComponents_Button;

    /* renamed from: h */
    private final C8470a f24041h;

    /* renamed from: i */
    private final LinkedHashSet<C8468a> f24042i;

    /* renamed from: j */
    private C8469b f24043j;

    /* renamed from: k */
    private PorterDuff.Mode f24044k;

    /* renamed from: l */
    private ColorStateList f24045l;

    /* renamed from: m */
    private Drawable f24046m;

    /* renamed from: n */
    private int f24047n;

    /* renamed from: o */
    private int f24048o;

    /* renamed from: p */
    private int f24049p;

    /* renamed from: q */
    private boolean f24050q;

    /* renamed from: r */
    private boolean f24051r;

    /* renamed from: s */
    private int f24052s;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8467a();

        /* renamed from: h */
        boolean f24053h;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        static class C8467a implements Parcelable.ClassLoaderCreator<SavedState> {
            C8467a() {
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

        /* renamed from: a */
        private void m27333a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f24053h = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f24053h ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m27333a(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C8468a {
        /* renamed from: a */
        void mo31153a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C8469b {
        /* renamed from: a */
        void mo31154a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m27327a(boolean z) {
        if (z) {
            C0436i.m2149a(this, this.f24046m, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C0436i.m2149a(this, (Drawable) null, (Drawable) null, this.f24046m, (Drawable) null);
        }
    }

    /* renamed from: b */
    private boolean m27329b() {
        return C5071v.m9204p(this) == 1;
    }

    /* renamed from: c */
    private boolean m27330c() {
        C8470a aVar = this.f24041h;
        return aVar != null && !aVar.mo31176j();
    }

    /* renamed from: d */
    private void m27331d() {
        if (this.f24046m != null && getLayout() != null) {
            int i = this.f24052s;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f24048o = 0;
                m27328b(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f24047n;
            if (i2 == 0) {
                i2 = this.f24046m.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C5071v.m9208t(this)) - i2) - this.f24049p) - C5071v.m9209u(this)) / 2;
            boolean b = m27329b();
            if (this.f24052s != 4) {
                z = false;
            }
            if (b != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f24048o != measuredWidth) {
                this.f24048o = measuredWidth;
                m27328b(false);
            }
        }
    }

    private String getA11yClassName() {
        return (mo31100a() ? CompoundButton.class : Button.class).getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m27330c()) {
            return this.f24041h.mo31155a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f24046m;
    }

    public int getIconGravity() {
        return this.f24052s;
    }

    public int getIconPadding() {
        return this.f24049p;
    }

    public int getIconSize() {
        return this.f24047n;
    }

    public ColorStateList getIconTint() {
        return this.f24045l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f24044k;
    }

    public ColorStateList getRippleColor() {
        if (m27330c()) {
            return this.f24041h.mo31170d();
        }
        return null;
    }

    public C10645k getShapeAppearanceModel() {
        if (m27330c()) {
            return this.f24041h.mo31171e();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m27330c()) {
            return this.f24041h.mo31172f();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m27330c()) {
            return this.f24041h.mo31173g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m27330c()) {
            return this.f24041h.mo31174h();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m27330c()) {
            return this.f24041h.mo31175i();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f24050q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m27330c()) {
            C10642h.m36068a((View) this, this.f24041h.mo31167c());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo31100a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f24038t);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f24039u);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo31100a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C8470a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f24041h) != null) {
            aVar.mo31157a(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m27331d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2480a());
        setChecked(savedState.f24053h);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f24053h = this.f24050q;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m27331d();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m27330c()) {
            this.f24041h.mo31156a(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m27330c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f24041h.mo31178l();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m27330c()) {
            this.f24041h.mo31162a(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo31100a() && isEnabled() && this.f24050q != z) {
            this.f24050q = z;
            refreshDrawableState();
            if (!this.f24051r) {
                this.f24051r = true;
                Iterator it = this.f24042i.iterator();
                while (it.hasNext()) {
                    ((C8468a) it.next()).mo31153a(this, this.f24050q);
                }
                this.f24051r = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m27330c()) {
            this.f24041h.mo31164b(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m27330c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m27330c()) {
            this.f24041h.mo31167c().mo36245b(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f24046m != drawable) {
            this.f24046m = drawable;
            m27328b(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f24052s != i) {
            this.f24052s = i;
            m27331d();
        }
    }

    public void setIconPadding(int i) {
        if (this.f24049p != i) {
            this.f24049p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C4800a.m7936c(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f24047n != i) {
            this.f24047n = i;
            m27328b(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f24045l != colorStateList) {
            this.f24045l = colorStateList;
            m27328b(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f24044k != mode) {
            this.f24044k = mode;
            m27328b(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C4800a.m7935b(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C8469b bVar) {
        this.f24043j = bVar;
    }

    public void setPressed(boolean z) {
        C8469b bVar = this.f24043j;
        if (bVar != null) {
            bVar.mo31154a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m27330c()) {
            this.f24041h.mo31158a(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m27330c()) {
            setRippleColor(C4800a.m7935b(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C10645k kVar) {
        if (m27330c()) {
            this.f24041h.mo31161a(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m27330c()) {
            this.f24041h.mo31166b(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m27330c()) {
            this.f24041h.mo31165b(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m27330c()) {
            setStrokeColor(C4800a.m7935b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m27330c()) {
            this.f24041h.mo31168c(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m27330c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m27330c()) {
            this.f24041h.mo31169c(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m27330c()) {
            this.f24041h.mo31160a(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f24050q);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10574b.materialButtonStyle);
    }

    /* renamed from: b */
    private void m27328b(boolean z) {
        Drawable drawable = this.f24046m;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0414a.m2029i(drawable).mutate();
            this.f24046m = mutate;
            C0414a.m2014a(mutate, this.f24045l);
            PorterDuff.Mode mode = this.f24044k;
            if (mode != null) {
                C0414a.m2017a(this.f24046m, mode);
            }
            int i = this.f24047n;
            if (i == 0) {
                i = this.f24046m.getIntrinsicWidth();
            }
            int i2 = this.f24047n;
            if (i2 == 0) {
                i2 = this.f24046m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f24046m;
            int i3 = this.f24048o;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f24052s;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m27327a(z3);
            return;
        }
        Drawable[] a = C0436i.m2152a((TextView) this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[2];
        if ((z3 && drawable3 != this.f24046m) || (!z3 && drawable4 != this.f24046m)) {
            z2 = true;
        }
        if (z2) {
            m27327a(z3);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C8648a.m28241b(context, attributeSet, i, f24040v), attributeSet, i);
        this.f24042i = new LinkedHashSet<>();
        boolean z = false;
        this.f24050q = false;
        this.f24051r = false;
        Context context2 = getContext();
        TypedArray c = C8566j.m27997c(context2, attributeSet, C10584l.MaterialButton, i, f24040v, new int[0]);
        this.f24049p = c.getDimensionPixelSize(C10584l.MaterialButton_iconPadding, 0);
        this.f24044k = C8567k.m28001a(c.getInt(C10584l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f24045l = C10620c.m35957a(getContext(), c, C10584l.MaterialButton_iconTint);
        this.f24046m = C10620c.m35959b(getContext(), c, C10584l.MaterialButton_icon);
        this.f24052s = c.getInteger(C10584l.MaterialButton_iconGravity, 1);
        this.f24047n = c.getDimensionPixelSize(C10584l.MaterialButton_iconSize, 0);
        C8470a aVar = new C8470a(this, C10645k.m36076a(context2, attributeSet, i, f24040v).mo36302a());
        this.f24041h = aVar;
        aVar.mo31159a(c);
        c.recycle();
        setCompoundDrawablePadding(this.f24049p);
        m27328b(this.f24046m != null ? true : z);
    }

    /* renamed from: a */
    public boolean mo31100a() {
        C8470a aVar = this.f24041h;
        return aVar != null && aVar.mo31177k();
    }
}
