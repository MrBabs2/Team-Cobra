package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzayb;

@VisibleForTesting
@zzard
final class zzi extends RelativeLayout {
    @VisibleForTesting
    private zzayb zzdkf;
    @VisibleForTesting
    boolean zzdkg;

    public zzi(Context context, String str, String str2) {
        super(context);
        zzayb zzayb = new zzayb(context, str);
        this.zzdkf = zzayb;
        zzayb.mo27842d(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdkg) {
            return false;
        }
        this.zzdkf.mo27834a(motionEvent);
        return false;
    }
}
