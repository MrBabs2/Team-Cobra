package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
/* compiled from: EndIconDelegate */
abstract class C8637e {

    /* renamed from: a */
    TextInputLayout f24654a;

    /* renamed from: b */
    Context f24655b;

    /* renamed from: c */
    CheckableImageButton f24656c;

    C8637e(TextInputLayout textInputLayout) {
        this.f24654a = textInputLayout;
        this.f24655b = textInputLayout.getContext();
        this.f24656c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo32218a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32219a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo32231a(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo32232b() {
        return false;
    }
}
