package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p050l.p051a.p052k.p053a.C4800a;
import p112n.p277e.p279b.p282b.C10577e;
import p112n.p277e.p279b.p282b.C10582j;
import p112n.p277e.p279b.p282b.p283m.C10585a;

/* renamed from: com.google.android.material.textfield.a */
/* compiled from: ClearTextEndIconDelegate */
class C8613a extends C8637e {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TextWatcher f24609d = new C8614a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final View.OnFocusChangeListener f24610e = new C8615b();

    /* renamed from: f */
    private final TextInputLayout.C8611f f24611f = new C8616c();

    /* renamed from: g */
    private final TextInputLayout.C8612g f24612g = new C8617d();

    /* renamed from: h */
    private AnimatorSet f24613h;

    /* renamed from: i */
    private ValueAnimator f24614i;

    /* renamed from: com.google.android.material.textfield.a$a */
    /* compiled from: ClearTextEndIconDelegate */
    class C8614a implements TextWatcher {
        C8614a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C8613a.this.f24654a.getSuffixText() == null) {
                C8613a.this.m28117b(C8613a.m28118b(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    /* compiled from: ClearTextEndIconDelegate */
    class C8615b implements View.OnFocusChangeListener {
        C8615b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C8613a aVar = C8613a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.m28117b(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    /* compiled from: ClearTextEndIconDelegate */
    class C8616c implements TextInputLayout.C8611f {
        C8616c() {
        }

        /* renamed from: a */
        public void mo32216a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C8613a.m28118b(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C8613a.this.f24610e);
            editText.removeTextChangedListener(C8613a.this.f24609d);
            editText.addTextChangedListener(C8613a.this.f24609d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    /* compiled from: ClearTextEndIconDelegate */
    class C8617d implements TextInputLayout.C8612g {
        C8617d() {
        }

        /* renamed from: a */
        public void mo32217a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.removeTextChangedListener(C8613a.this.f24609d);
                if (editText.getOnFocusChangeListener() == C8613a.this.f24610e) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    /* compiled from: ClearTextEndIconDelegate */
    class C8618e implements View.OnClickListener {
        C8618e() {
        }

        public void onClick(View view) {
            Editable text = C8613a.this.f24654a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    /* compiled from: ClearTextEndIconDelegate */
    class C8619f extends AnimatorListenerAdapter {
        C8619f() {
        }

        public void onAnimationStart(Animator animator) {
            C8613a.this.f24654a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    /* compiled from: ClearTextEndIconDelegate */
    class C8620g extends AnimatorListenerAdapter {
        C8620g() {
        }

        public void onAnimationEnd(Animator animator) {
            C8613a.this.f24654a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    /* compiled from: ClearTextEndIconDelegate */
    class C8621h implements ValueAnimator.AnimatorUpdateListener {
        C8621h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8613a.this.f24656c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    /* compiled from: ClearTextEndIconDelegate */
    class C8622i implements ValueAnimator.AnimatorUpdateListener {
        C8622i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8613a.this.f24656c.setScaleX(floatValue);
            C8613a.this.f24656c.setScaleY(floatValue);
        }
    }

    C8613a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: c */
    private ValueAnimator m28119c() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C10585a.f28459d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C8622i());
        return ofFloat;
    }

    /* renamed from: d */
    private void m28120d() {
        ValueAnimator c = m28119c();
        ValueAnimator a = m28112a(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f24613h = animatorSet;
        animatorSet.playTogether(new Animator[]{c, a});
        this.f24613h.addListener(new C8619f());
        ValueAnimator a2 = m28112a(1.0f, 0.0f);
        this.f24614i = a2;
        a2.addListener(new C8620g());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28117b(boolean z) {
        boolean z2 = this.f24654a.isEndIconVisible() == z;
        if (z) {
            this.f24614i.cancel();
            this.f24613h.start();
            if (z2) {
                this.f24613h.end();
                return;
            }
            return;
        }
        this.f24613h.cancel();
        this.f24614i.start();
        if (z2) {
            this.f24614i.end();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32218a() {
        this.f24654a.setEndIconDrawable(C4800a.m7936c(this.f24655b, C10577e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f24654a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C10582j.clear_text_end_icon_content_description));
        this.f24654a.setEndIconOnClickListener(new C8618e());
        this.f24654a.addOnEditTextAttachedListener(this.f24611f);
        this.f24654a.addOnEndIconChangedListener(this.f24612g);
        m28120d();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m28118b(Editable editable) {
        return editable.length() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32219a(boolean z) {
        if (this.f24654a.getSuffixText() != null) {
            m28117b(z);
        }
    }

    /* renamed from: a */
    private ValueAnimator m28112a(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C10585a.f28456a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C8621h());
        return ofFloat;
    }
}
