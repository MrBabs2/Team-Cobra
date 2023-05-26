package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.h3 */
final class C7529h3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ zzapo f15340f;

    C7529h3(zzapo zzapo) {
        this.f15340f = zzapo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent a = this.f15340f.mo27538a();
        zzk.zzlg();
        zzaxi.m20273a(this.f15340f.f18252d, a);
    }
}
