package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.google.android.material.internal.l */
/* compiled from: VisibilityAwareImageButton */
public class C8572l extends ImageButton {

    /* renamed from: f */
    private int f24525f;

    public C8572l(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo31954a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f24525f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f24525f;
    }

    public void setVisibility(int i) {
        mo31954a(i, true);
    }

    public C8572l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8572l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24525f = getVisibility();
    }
}
