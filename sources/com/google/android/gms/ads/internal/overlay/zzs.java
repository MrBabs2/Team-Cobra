package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzawz;

@zzard
public final class zzs extends zzd {
    public zzs(Activity activity) {
        super(activity);
    }

    public final void onCreate(Bundle bundle) {
        zzawz.m20167e("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzdjw = 3;
        this.mActivity.finish();
    }
}
