package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.C0436i;
import p050l.p051a.C4790a;
import p050l.p075h.p084l.C5070u;

/* renamed from: androidx.appcompat.widget.i */
/* compiled from: AppCompatEditText */
public class C0256i extends EditText implements C5070u {

    /* renamed from: f */
    private final C0231d f1092f;

    /* renamed from: g */
    private final C0283s f1093g;

    /* renamed from: h */
    private final C0279r f1094h;

    public C0256i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            dVar.mo1476a();
        }
        C0283s sVar = this.f1093g;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            return dVar.mo1482b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            return dVar.mo1484c();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        C0279r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f1094h) == null) {
            return super.getTextClassifier();
        }
        return rVar.mo1731a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0258j.m1209a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            dVar.mo1480a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            dVar.mo1477a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0436i.m2145a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            dVar.mo1483b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0231d dVar = this.f1092f;
        if (dVar != null) {
            dVar.mo1479a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0283s sVar = this.f1093g;
        if (sVar != null) {
            sVar.mo1776a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0279r rVar;
        if (Build.VERSION.SDK_INT >= 28 || (rVar = this.f1094h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            rVar.mo1732a(textClassifier);
        }
    }

    public C0256i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4790a.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C0256i(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0231d dVar = new C0231d(this);
        this.f1092f = dVar;
        dVar.mo1481a(attributeSet, i);
        C0283s sVar = new C0283s(this);
        this.f1093g = sVar;
        sVar.mo1779a(attributeSet, i);
        this.f1093g.mo1772a();
        this.f1094h = new C0279r(this);
    }
}
