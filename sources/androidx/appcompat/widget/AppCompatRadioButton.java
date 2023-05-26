package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import androidx.core.widget.C0438j;
import p050l.p051a.C4790a;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5070u;

public class AppCompatRadioButton extends RadioButton implements C0438j, C5070u {

    /* renamed from: f */
    private final C0245g f747f;

    /* renamed from: g */
    private final C0231d f748g;

    /* renamed from: h */
    private final C0283s f749h;

    public AppCompatRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f748g;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0283s sVar = this.f749h;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0245g gVar = this.f747f;
        return gVar != null ? gVar.mo1544a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f748g;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f748g;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0245g gVar = this.f747f;
        if (gVar != null) {
            return gVar.mo1549b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0245g gVar = this.f747f;
        if (gVar != null) {
            return gVar.mo1550c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f748g;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f748g;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0245g gVar = this.f747f;
        if (gVar != null) {
            gVar.mo1551d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f748g;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f748g;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0245g gVar = this.f747f;
        if (gVar != null) {
            gVar.mo1546a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0245g gVar = this.f747f;
        if (gVar != null) {
            gVar.mo1547a(mode);
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.radioButtonStyle);
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0245g gVar = new C0245g(this);
        this.f747f = gVar;
        gVar.mo1548a(attributeSet, i);
        C0231d dVar = new C0231d(this);
        this.f748g = dVar;
        dVar.mo1481a(attributeSet, i);
        C0283s sVar = new C0283s(this);
        this.f749h = sVar;
        sVar.mo1779a(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C4800a.m7936c(getContext(), i));
    }
}
