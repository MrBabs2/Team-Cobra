package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.C0429b;
import androidx.core.widget.C0436i;
import androidx.core.widget.C0439k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p076e.C4954d;
import p050l.p075h.p082j.C4989c;
import p050l.p075h.p084l.C5070u;

/* renamed from: androidx.appcompat.widget.t */
/* compiled from: AppCompatTextView */
public class C0286t extends TextView implements C5070u, C0439k, C0429b {

    /* renamed from: f */
    private final C0231d f1222f;

    /* renamed from: g */
    private final C0283s f1223g;

    /* renamed from: h */
    private final C0279r f1224h;

    /* renamed from: i */
    private Future<C4989c> f1225i;

    public C0286t(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private void mo454d() {
        Future<C4989c> future = this.f1225i;
        if (future != null) {
            try {
                this.f1225i = null;
                C0436i.m2151a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0429b.f1890a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            return sVar.mo1785c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0429b.f1890a) {
            return super.getAutoSizeMinTextSize();
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            return sVar.mo1786d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0429b.f1890a) {
            return super.getAutoSizeStepGranularity();
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            return sVar.mo1787e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0429b.f1890a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0283s sVar = this.f1223g;
        return sVar != null ? sVar.mo1788f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!C0429b.f1890a) {
            C0283s sVar = this.f1223g;
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

    public int getFirstBaselineToTopHeight() {
        return C0436i.m2153b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0436i.m2155c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1223g.mo1790h();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1223g.mo1791i();
    }

    public CharSequence getText() {
        mo454d();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0279r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f1224h) == null) {
            return super.getTextClassifier();
        }
        return rVar.mo1731a();
    }

    public C4989c.C4990a getTextMetricsParamsCompat() {
        return C0436i.m2159e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0258j.m1209a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1782a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo454d();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0283s sVar = this.f1223g;
        if (sVar != null && !C0429b.f1890a && sVar.mo1792j()) {
            this.f1223g.mo1784b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0429b.f1890a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1775a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0429b.f1890a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1783a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0429b.f1890a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1773a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1793k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1793k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1793k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1793k();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0436i.m2145a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0436i.m2146a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0436i.m2154b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0436i.m2156c(this, i);
    }

    public void setPrecomputedText(C4989c cVar) {
        C0436i.m2151a((TextView) this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f1222f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1223g.mo1777a(colorStateList);
        this.f1223g.mo1772a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1223g.mo1778a(mode);
        this.f1223g.mo1772a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1776a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0279r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f1224h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            rVar.mo1732a(textClassifier);
        }
    }

    public void setTextFuture(Future<C4989c> future) {
        this.f1225i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C4989c.C4990a aVar) {
        C0436i.m2150a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0429b.f1890a) {
            super.setTextSize(i, f);
            return;
        }
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1774a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C4954d.m8728a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public C0286t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0286t(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0231d dVar = new C0231d(this);
        this.f1222f = dVar;
        dVar.mo1481a(attributeSet, i);
        C0283s sVar = new C0283s(this);
        this.f1223g = sVar;
        sVar.mo1779a(attributeSet, i);
        this.f1223g.mo1772a();
        this.f1224h = new C0279r(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C4800a.m7936c(context, i) : null;
        Drawable c2 = i2 != 0 ? C4800a.m7936c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C4800a.m7936c(context, i3) : null;
        if (i4 != 0) {
            drawable = C4800a.m7936c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1793k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C4800a.m7936c(context, i) : null;
        Drawable c2 = i2 != 0 ? C4800a.m7936c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C4800a.m7936c(context, i3) : null;
        if (i4 != 0) {
            drawable = C4800a.m7936c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0283s sVar = this.f1223g;
        if (sVar != null) {
            sVar.mo1793k();
        }
    }
}
