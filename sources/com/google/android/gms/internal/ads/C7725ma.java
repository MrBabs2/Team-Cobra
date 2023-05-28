package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.ma */
final class C7725ma implements DialogInterface.OnCancelListener {

    /* renamed from: f */
    private final /* synthetic */ JsResult f16223f;

    C7725ma(JsResult jsResult) {
        this.f16223f = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f16223f.cancel();
    }
}
