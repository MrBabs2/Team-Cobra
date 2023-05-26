package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.widget.C0436i;
import p050l.p051a.C4790a;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p084l.C5070u;

/* renamed from: androidx.appcompat.widget.c */
/* compiled from: AppCompatAutoCompleteTextView */
public class C0228c extends AutoCompleteTextView implements C5070u {

    /* renamed from: h */
    private static final int[] f988h = {16843126};

    /* renamed from: f */
    private final C0231d f989f;

    /* renamed from: g */
    private final C0283s f990g;

    public C0228c(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f989f;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0283s sVar = this.f990g;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f989f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f989f;
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
        C0231d dVar = this.f989f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f989f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0436i.m2145a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C4800a.m7936c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f989f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f989f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0283s sVar = this.f990g;
        if (sVar != null) {
            sVar.mo1776a(context, i);
        }
    }

    public C0228c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.autoCompleteTextViewStyle);
    }

    public C0228c(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0278q0 a = C0278q0.m1271a(getContext(), attributeSet, f988h, i, 0);
        if (a.mo1730g(0)) {
            setDropDownBackgroundDrawable(a.mo1719b(0));
        }
        a.mo1720b();
        C0231d dVar = new C0231d(this);
        this.f989f = dVar;
        dVar.mo1481a(attributeSet, i);
        C0283s sVar = new C0283s(this);
        this.f990g = sVar;
        sVar.mo1779a(attributeSet, i);
        this.f990g.mo1772a();
    }
}
