package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* renamed from: com.google.android.gms.internal.ads.pa */
final class C7836pa implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    private final /* synthetic */ JsPromptResult f16570f;

    C7836pa(JsPromptResult jsPromptResult) {
        this.f16570f = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16570f.cancel();
    }
}
