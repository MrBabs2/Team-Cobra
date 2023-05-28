package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.ads.zzdap;
import com.google.android.gms.internal.ads.zzdau;

@ShowFirstParty
public final class zzdan {

    /* renamed from: a */
    private final Context f21303a;

    /* renamed from: b */
    private final Looper f21304b;

    public zzdan(Context context, Looper looper) {
        this.f21303a = context;
        this.f21304b = looper;
    }

    /* renamed from: a */
    public final void mo28882a(String str) {
        zzdau.zza j = zzdau.m23225j();
        j.mo28887a(this.f21303a.getPackageName());
        j.mo28886a(zzdau.zzb.BLOCKED_IMPRESSION);
        zzdap.zzb j2 = zzdap.m23211j();
        j2.mo28884a(str);
        j2.mo28883a(zzdap.zza.BLOCKED_REASON_BACKGROUND);
        j.mo28885a(j2);
        new C7963sq(this.f21303a, this.f21304b, (zzdau) ((zzdob) j.mo29143t())).mo26552a();
    }
}
