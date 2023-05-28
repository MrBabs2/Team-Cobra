package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p050l.p051a.C4790a;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5070u;

/* renamed from: androidx.appcompat.widget.m */
/* compiled from: AppCompatMultiAutoCompleteTextView */
public class C0269m extends MultiAutoCompleteTextView implements C5070u {

    /* renamed from: h */
    private static final int[] f1154h = {16843126};

    /* renamed from: f */
    private final C0231d f1155f;

    /* renamed from: g */
    private final C0283s f1156g;

    public C0269m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.autoCompleteTextViewStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0283s sVar = this.f1156g;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0258j.m1209a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C4800a.m7936c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f1155f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0283s sVar = this.f1156g;
        if (sVar != null) {
            sVar.mo1776a(context, i);
        }
    }

    public C0269m(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0278q0 a = C0278q0.m1271a(getContext(), attributeSet, f1154h, i, 0);
        if (a.mo1730g(0)) {
            setDropDownBackgroundDrawable(a.mo1719b(0));
        }
        a.mo1720b();
        C0231d dVar = new C0231d(this);
        this.f1155f = dVar;
        dVar.mo1481a(attributeSet, i);
        C0283s sVar = new C0283s(this);
        this.f1156g = sVar;
        sVar.mo1779a(attributeSet, i);
        this.f1156g.mo1772a();
    }
}
