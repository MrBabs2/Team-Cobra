package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.ra */
final class C7910ra implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsPromptResult f16749f;

    /* renamed from: g */
    private final /* synthetic */ EditText f16750g;

    C7910ra(JsPromptResult jsPromptResult, EditText editText) {
        this.f16749f = jsPromptResult;
        this.f16750g = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16749f.confirm(this.f16750g.getText().toString());
    }
}
