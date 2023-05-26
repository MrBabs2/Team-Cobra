package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final /* synthetic */ class zzl implements Runnable {
    private final zzk zzdkj;
    private final Drawable zzdkk;

    zzl(zzk zzk, Drawable drawable) {
        this.zzdkj = zzk;
        this.zzdkk = drawable;
    }

    public final void run() {
        zzk zzk = this.zzdkj;
        zzk.zzdki.mActivity.getWindow().setBackgroundDrawable(this.zzdkk);
    }
}
