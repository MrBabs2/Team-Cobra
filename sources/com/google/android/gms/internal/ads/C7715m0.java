package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.m0 */
final class C7715m0 implements zzaho<zzbgz> {
    C7715m0() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        zzk.zzlg();
        DisplayMetrics a = zzaxi.m20264a((WindowManager) zzbgz.getContext().getSystemService("window"));
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzbgz).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzbgz.mo25665a("locationReady", (Map<String, ?>) hashMap);
        zzbad.m20523d("GET LOCATION COMPILED");
    }
}
