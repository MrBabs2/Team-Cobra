package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.xa */
final /* synthetic */ class C8132xa implements zzbal {

    /* renamed from: a */
    private final Context f17177a;

    /* renamed from: b */
    private final zzdh f17178b;

    /* renamed from: c */
    private final zzbai f17179c;

    /* renamed from: d */
    private final zza f17180d;

    /* renamed from: e */
    private final String f17181e;

    C8132xa(Context context, zzdh zzdh, zzbai zzbai, zza zza, String str) {
        this.f17177a = context;
        this.f17178b = zzdh;
        this.f17179c = zzbai;
        this.f17180d = zza;
        this.f17181e = str;
    }

    public final zzbbh zzf(Object obj) {
        Context context = this.f17177a;
        zzdh zzdh = this.f17178b;
        zzbai zzbai = this.f17179c;
        zza zza = this.f17180d;
        String str = this.f17181e;
        zzk.zzlh();
        zzbgz a = zzbhf.m20985a(context, zzbin.m21124f(), "", false, false, zzdh, zzbai, (zzadi) null, (zzj) null, zza, zzwj.m25465a());
        zzbbq c = zzbbq.m20559c(a);
        a.mo25697k().mo28128a((zzbij) new C8206za(c));
        a.loadUrl(str);
        return c;
    }
}
