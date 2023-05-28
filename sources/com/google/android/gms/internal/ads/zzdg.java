package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzdg extends zzdf {
    private zzdg(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: a */
    public static zzdg m23498a(String str, Context context, boolean z) {
        zzdf.m23418a(context, z);
        return new zzdg(context, str, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<Callable<Void>> mo28936b(zzdy zzdy, Context context, zzbp.zza.C12966zza zza, zzbk.zza zza2) {
        if (zzdy.mo29244d() == null || !this.f21379z) {
            return super.mo28936b(zzdy, context, zza, zza2);
        }
        int c = zzdy.mo29243c();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo28936b(zzdy, context, zza, zza2));
        arrayList.add(new zzes(zzdy, "3pegtvj7nkb7e3rwh5b+3dnQATJj6aqtaosJ3DkOYPzNGN2w+CoarbJEsY1UQgeA", "/kRTFQbKQx44ublaFMNQ8yNL6QxOrgEofiWDpZSH6zA=", zza, c, 24));
        return arrayList;
    }
}
