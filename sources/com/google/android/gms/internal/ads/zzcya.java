package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

public final class zzcya {
    /* renamed from: a */
    public static void m23109a(Throwable th, String str) {
        int a = zzcgm.m22526a(th);
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(a);
        zzbad.m20521c(sb.toString());
        zzawz.m20168e(str, th);
        if (zzcgm.m22526a(th) != 3) {
            zzk.zzlk().mo27736b(th, str);
        }
    }

    /* renamed from: a */
    public static void m23108a(Context context, boolean z) {
        if (z) {
            zzbad.m20521c("This request is sent from a test device.");
            return;
        }
        zzyt.m25666a();
        String a = zzazt.m20467a(context);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 71);
        sb.append("Use AdRequest.Builder.addTestDevice(\"");
        sb.append(a);
        sb.append("\") to get test ads on this device.");
        zzbad.m20521c(sb.toString());
    }
}
