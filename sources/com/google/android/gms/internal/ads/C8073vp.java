package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.vp */
final /* synthetic */ class C8073vp implements Callable {

    /* renamed from: f */
    static final Callable f17036f = new C8073vp();

    private C8073vp() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) zzyt.m25670e().mo27163a(zzacu.f17797G);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) zzyt.m25670e().mo27163a(zzacu.f17801H)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, zzazr.m20456a(str2));
                }
            }
        }
        return new zzcxg(hashMap);
    }
}
