package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
final class C7261d implements DynamiteModule.VersionPolicy {
    C7261d() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.zzb mo25548a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        zzb.f14303a = zza.mo25549a(context, str);
        int a = zza.mo25550a(context, str, true);
        zzb.f14304b = a;
        if (zzb.f14303a == 0 && a == 0) {
            zzb.f14305c = 0;
        } else if (zzb.f14303a >= zzb.f14304b) {
            zzb.f14305c = -1;
        } else {
            zzb.f14305c = 1;
        }
        return zzb;
    }
}
