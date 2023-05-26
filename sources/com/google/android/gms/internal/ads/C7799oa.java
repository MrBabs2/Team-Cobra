package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: com.google.android.gms.internal.ads.oa */
final class C7799oa implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ JsResult f16449f;

    C7799oa(JsResult jsResult) {
        this.f16449f = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16449f.confirm();
    }
}
