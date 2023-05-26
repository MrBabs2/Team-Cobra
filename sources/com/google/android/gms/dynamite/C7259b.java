package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.b */
final class C7259b implements DynamiteModule.VersionPolicy {
    C7259b() {
    }

    /* renamed from: a */
    public final DynamiteModule.VersionPolicy.zzb mo25548a(Context context, String str, DynamiteModule.VersionPolicy.zza zza) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.zzb zzb = new DynamiteModule.VersionPolicy.zzb();
        int a = zza.mo25550a(context, str, true);
        zzb.f14304b = a;
        if (a != 0) {
            zzb.f14305c = 1;
        } else {
            int a2 = zza.mo25549a(context, str);
            zzb.f14303a = a2;
            if (a2 != 0) {
                zzb.f14305c = -1;
            }
        }
        return zzb;
    }
}
