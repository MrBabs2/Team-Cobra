package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.g3 */
final class C7493g3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ AdOverlayInfoParcel f15266f;

    /* renamed from: g */
    private final /* synthetic */ zzapl f15267g;

    C7493g3(zzapl zzapl, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f15267g = zzapl;
        this.f15266f = adOverlayInfoParcel;
    }

    public final void run() {
        zzk.zzlf();
        zzm.zza(this.f15267g.f18248a, this.f15266f, true);
    }
}
