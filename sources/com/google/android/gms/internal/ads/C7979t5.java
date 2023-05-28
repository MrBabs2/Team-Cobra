package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.t5 */
final class C7979t5 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ C7942s5 f16892f;

    C7979t5(C7942s5 s5Var) {
        this.f16892f = s5Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzk.zzlg();
        zzaxi.m20274a(this.f16892f.f16825f, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
