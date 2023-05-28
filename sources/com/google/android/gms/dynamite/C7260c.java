package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.c */
final class C7260c implements DynamiteModule.VersionPolicy {
    C7260c() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.zzb mo25548a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        int a = zza.mo25549a(context, str);
        zzb.f14303a = a;
        if (a != 0) {
            zzb.f14305c = -1;
        } else {
            int a2 = zza.mo25550a(context, str, true);
            zzb.f14304b = a2;
            if (a2 != 0) {
                zzb.f14305c = 1;
            }
        }
        return zzb;
    }
}
