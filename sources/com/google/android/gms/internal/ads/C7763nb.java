package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.nb */
final /* synthetic */ class C7763nb implements Callable {

    /* renamed from: f */
    private final Context f16296f;

    /* renamed from: g */
    private final zzbin f16297g;

    /* renamed from: h */
    private final String f16298h;

    /* renamed from: i */
    private final boolean f16299i;

    /* renamed from: j */
    private final boolean f16300j;

    /* renamed from: k */
    private final zzdh f16301k;

    /* renamed from: l */
    private final zzbai f16302l;

    /* renamed from: m */
    private final zzadi f16303m;

    /* renamed from: n */
    private final zzj f16304n;

    /* renamed from: o */
    private final zza f16305o;

    /* renamed from: p */
    private final zzwj f16306p;

    C7763nb(Context context, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) {
        this.f16296f = context;
        this.f16297g = zzbin;
        this.f16298h = str;
        this.f16299i = z;
        this.f16300j = z2;
        this.f16301k = zzdh;
        this.f16302l = zzbai;
        this.f16303m = zzadi;
        this.f16304n = zzj;
        this.f16305o = zza;
        this.f16306p = zzwj;
    }

    public final Object call() {
        Context context = this.f16296f;
        zzbin zzbin = this.f16297g;
        String str = this.f16298h;
        boolean z = this.f16299i;
        boolean z2 = this.f16300j;
        zzdh zzdh = this.f16301k;
        zzbai zzbai = this.f16302l;
        zzadi zzadi = this.f16303m;
        zzj zzj = this.f16304n;
        zza zza = this.f16305o;
        zzwj zzwj = this.f16306p;
        zzbio zzbio = new zzbio();
        C7800ob obVar = new C7800ob(new zzbim(context), zzbio, zzbin, str, z, z2, zzdh, zzbai, zzadi, zzj, zza, zzwj);
        zzbhk zzbhk = new zzbhk(obVar);
        obVar.setWebChromeClient(new zzbgr(zzbhk));
        zzbio.mo28186a((zzbgz) zzbhk, z2);
        return zzbhk;
    }
}
