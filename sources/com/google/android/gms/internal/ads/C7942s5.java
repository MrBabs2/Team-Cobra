package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.s5 */
final class C7942s5 implements Runnable {

    /* renamed from: f */
    final /* synthetic */ Context f16825f;

    /* renamed from: g */
    private final /* synthetic */ String f16826g;

    /* renamed from: h */
    private final /* synthetic */ boolean f16827h;

    /* renamed from: i */
    private final /* synthetic */ boolean f16828i;

    C7942s5(zzayi zzayi, Context context, String str, boolean z, boolean z2) {
        this.f16825f = context;
        this.f16826g = str;
        this.f16827h = z;
        this.f16828i = z2;
    }

    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f16825f);
        builder.setMessage(this.f16826g);
        if (this.f16827h) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f16828i) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new C7979t5(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
