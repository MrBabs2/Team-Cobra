package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;

@TargetApi(24)
public class zzaxw extends zzaxv {
    /* renamed from: a */
    public final boolean mo27819a(Activity activity, Configuration configuration) {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17935l2)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17944n2)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzyt.m25666a();
        int b = zzazt.m20475b((Context) activity, configuration.screenHeightDp);
        int b2 = zzazt.m20475b((Context) activity, configuration.screenWidthDp);
        zzk.zzlg();
        DisplayMetrics a = zzaxi.m20264a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a.heightPixels;
        int i2 = a.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzyt.m25670e().mo27163a(zzacu.f17930k2)).intValue();
        if (!(m20366a(i, b + dimensionPixelSize, round) && m20366a(i2, b2, round))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m20366a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
