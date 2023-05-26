package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.qk */
final /* synthetic */ class C7883qk implements zzbwz {

    /* renamed from: a */
    private final zzbbr f16667a;

    C7883qk(zzbbr zzbbr) {
        this.f16667a = zzbbr;
    }

    /* renamed from: a */
    public final void mo25736a(boolean z, Context context) {
        zzbbr zzbbr = this.f16667a;
        try {
            zzk.zzlf();
            zzm.zza(context, (AdOverlayInfoParcel) zzbbr.get(), true);
        } catch (Exception unused) {
        }
    }
}
