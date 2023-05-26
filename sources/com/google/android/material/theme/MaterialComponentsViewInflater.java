package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0107j;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.C0228c;
import androidx.appcompat.widget.C0240e;
import androidx.appcompat.widget.C0286t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C8640g;
import com.google.android.material.textview.MaterialTextView;
import p112n.p277e.p279b.p282b.p285o.C10597a;
import p112n.p277e.p279b.p282b.p293v.C10616a;

public class MaterialComponentsViewInflater extends C0107j {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0228c mo397a(Context context, AttributeSet attributeSet) {
        return new C8640g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatButton mo398b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0240e mo399c(Context context, AttributeSet attributeSet) {
        return new C10597a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatRadioButton mo405i(Context context, AttributeSet attributeSet) {
        return new C10616a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0286t mo409m(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
