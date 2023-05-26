package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

@zzard
public final class zzawg implements zzawi {
    /* renamed from: a */
    public final zzbbh<String> mo27716a(String str, PackageInfo packageInfo) {
        return zzbar.m20539a(str);
    }

    /* renamed from: a */
    public final zzbbh<AdvertisingIdClient.Info> mo27715a(Context context) {
        zzbbr zzbbr = new zzbbr();
        zzyt.m25666a();
        if (zzazt.m20481c(context)) {
            zzaxg.m20259a((Runnable) new C7978t4(this, context, zzbbr));
        }
        return zzbbr;
    }
}
