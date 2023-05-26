package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.e */
final class C7262e implements DynamiteModule.VersionPolicy {
    C7262e() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.zzb mo25548a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        int a = zza.mo25549a(context, str);
        zzb.f14303a = a;
        if (a != 0) {
            zzb.f14304b = zza.mo25550a(context, str, false);
        } else {
            zzb.f14304b = zza.mo25550a(context, str, true);
        }
        if (zzb.f14303a == 0 && zzb.f14304b == 0) {
            zzb.f14305c = 0;
        } else if (zzb.f14303a >= zzb.f14304b) {
            zzb.f14305c = -1;
        } else {
            zzb.f14305c = 1;
        }
        return zzb;
    }
}
