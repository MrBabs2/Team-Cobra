package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.na */
final class C7762na implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsResult f16295f;

    C7762na(JsResult jsResult) {
        this.f16295f = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16295f.cancel();
    }
}
