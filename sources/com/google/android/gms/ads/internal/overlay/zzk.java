package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxo;

@zzard
final class zzk extends zzawv {
    final /* synthetic */ zzd zzdki;

    private zzk(zzd zzd) {
        this.zzdki = zzd;
    }

    public final void zzto() {
        Bitmap a = com.google.android.gms.ads.internal.zzk.zzlz().mo27865a(Integer.valueOf(this.zzdki.zzdjl.zzdkt.zzbrj));
        if (a != null) {
            zzaxo zzli = com.google.android.gms.ads.internal.zzk.zzli();
            zzd zzd = this.zzdki;
            Activity activity = zzd.mActivity;
            zzh zzh = zzd.zzdjl.zzdkt;
            zzaxi.f18651h.post(new zzl(this, zzli.mo27811a(activity, a, zzh.zzbrh, zzh.zzbri)));
        }
    }
}
