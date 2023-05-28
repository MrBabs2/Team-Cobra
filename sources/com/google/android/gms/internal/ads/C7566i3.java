package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* renamed from: com.google.android.gms.internal.ads.i3 */
final class C7566i3 implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ zzapo f15567f;

    C7566i3(zzapo zzapo) {
        this.f15567f = zzapo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15567f.mo27556a("Operation denied by user.");
    }
}
