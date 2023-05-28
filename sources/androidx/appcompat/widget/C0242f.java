package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.core.widget.C0436i;
import p050l.p051a.p052k.p053a.C4800a;

/* renamed from: androidx.appcompat.widget.f */
/* compiled from: AppCompatCheckedTextView */
public class C0242f extends CheckedTextView {

    /* renamed from: g */
    private static final int[] f1058g = {16843016};

    /* renamed from: f */
    private final C0283s f1059f;

    public C0242f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0283s sVar = this.f1059f;
        if (sVar != null) {
            sVar.mo1772a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0258j.m1209a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C4800a.m7936c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0436i.m2145a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0283s sVar = this.f1059f;
        if (sVar != null) {
            sVar.mo1776a(context, i);
        }
    }

    public C0242f(Context context, AttributeSet attributeSet, int i) {
        super(C0272n0.m1256b(context), attributeSet, i);
        C0268l0.m1250a((View) this, getContext());
        C0283s sVar = new C0283s(this);
        this.f1059f = sVar;
        sVar.mo1779a(attributeSet, i);
        this.f1059f.mo1772a();
        C0278q0 a = C0278q0.m1271a(getContext(), attributeSet, f1058g, i, 0);
        setCheckMarkDrawable(a.mo1719b(0));
        a.mo1720b();
    }
}
