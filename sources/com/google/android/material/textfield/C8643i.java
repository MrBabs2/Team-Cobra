package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p050l.p051a.p052k.p053a.C4800a;
import p112n.p277e.p279b.p282b.C10577e;
import p112n.p277e.p279b.p282b.C10582j;

/* renamed from: com.google.android.material.textfield.i */
/* compiled from: PasswordToggleEndIconDelegate */
class C8643i extends C8637e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f24688d = new C8644a();

    /* renamed from: e */
    private final TextInputLayout.C8611f f24689e = new C8645b();

    /* renamed from: f */
    private final TextInputLayout.C8612g f24690f = new C8646c();

    /* renamed from: com.google.android.material.textfield.i$a */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C8644a implements TextWatcher {
        C8644a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C8643i iVar = C8643i.this;
            iVar.f24656c.setChecked(!iVar.m28225c());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C8645b implements TextInputLayout.C8611f {
        C8645b() {
        }

        /* renamed from: a */
        public void mo32216a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C8643i iVar = C8643i.this;
            iVar.f24656c.setChecked(!iVar.m28225c());
            editText.removeTextChangedListener(C8643i.this.f24688d);
            editText.addTextChangedListener(C8643i.this.f24688d);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C8646c implements TextInputLayout.C8612g {
        C8646c() {
        }

        /* renamed from: a */
        public void mo32217a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.removeTextChangedListener(C8643i.this.f24688d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    /* compiled from: PasswordToggleEndIconDelegate */
    class C8647d implements View.OnClickListener {
        C8647d() {
        }

        public void onClick(View view) {
            EditText editText = C8643i.this.f24654a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C8643i.this.m28225c()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    C8643i(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m28225c() {
        EditText editText = this.f24654a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32218a() {
        this.f24654a.setEndIconDrawable(C4800a.m7936c(this.f24655b, C10577e.design_password_eye));
        TextInputLayout textInputLayout = this.f24654a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10582j.password_toggle_content_description));
        this.f24654a.setEndIconOnClickListener(new C8647d());
        this.f24654a.addOnEditTextAttachedListener(this.f24689e);
        this.f24654a.addOnEndIconChangedListener(this.f24690f);
        EditText editText = this.f24654a.getEditText();
        if (m28222a(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: a */
    private static boolean m28222a(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }
}
