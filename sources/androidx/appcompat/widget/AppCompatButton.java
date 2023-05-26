package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.C0429b;
import androidx.core.widget.C0436i;
import androidx.core.widget.C0439k;
import p050l.p051a.C4790a;
import p050l.p075h.p084l.C5070u;

public class AppCompatButton extends Button implements C5070u, C0429b, C0439k {

    /* renamed from: f */
    private final C0231d f743f;

    /* renamed from: g */
    private final C0283s f744g;

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f743f;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0429b.f1890a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            return sVar.mo1785c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0429b.f1890a) {
            return super.getAutoSizeMinTextSize();
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            return sVar.mo1786d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0429b.f1890a) {
            return super.getAutoSizeStepGranularity();
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            return sVar.mo1787e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0429b.f1890a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0283s sVar = this.f744g;
        return sVar != null ? sVar.mo1788f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0429b.f1890a) {
            C0283s sVar = this.f744g;
            if (sVar != null) {
                return sVar.mo1789g();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f743f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f743f;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f744g.mo1790h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f744g.mo1791i();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1782a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0283s sVar = this.f744g;
        if (sVar != null && !C0429b.f1890a && sVar.mo1792j()) {
            this.f744g.mo1784b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0429b.f1890a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1775a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0429b.f1890a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1783a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0429b.f1890a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1773a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f743f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f743f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0436i.m2145a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1781a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f743f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f743f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f744g.mo1777a(colorStateList);
        this.f744g.mo1772a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f744g.mo1778a(mode);
        this.f744g.mo1772a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1776a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0429b.f1890a) {
            super.setTextSize(i, f);
            return;
        }
        C0283s sVar = this.f744g;
        if (sVar != null) {
            sVar.mo1774a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0231d dVar = new C0231d(this);
        this.f743f = dVar;
        dVar.mo1481a(attributeSet, i);
        C0283s sVar = new C0283s(this);
        this.f744g = sVar;
        sVar.mo1779a(attributeSet, i);
        this.f744g.mo1772a();
    }
}
