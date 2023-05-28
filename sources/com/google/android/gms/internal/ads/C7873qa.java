package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.qa */
final class C7873qa implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsPromptResult f16653f;

    C7873qa(JsPromptResult jsPromptResult) {
        this.f16653f = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16653f.cancel();
    }
}
