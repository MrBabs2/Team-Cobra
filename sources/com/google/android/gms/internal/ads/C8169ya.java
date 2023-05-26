package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.ya */
final /* synthetic */ class C8169ya implements Callable {

    /* renamed from: f */
    private final Context f17278f;

    /* renamed from: g */
    private final zzbin f17279g;

    /* renamed from: h */
    private final String f17280h;

    /* renamed from: i */
    private final boolean f17281i;

    /* renamed from: j */
    private final boolean f17282j;

    /* renamed from: k */
    private final zzdh f17283k;

    /* renamed from: l */
    private final zzbai f17284l;

    /* renamed from: m */
    private final zzadi f17285m = null;

    /* renamed from: n */
    private final zzj f17286n;

    /* renamed from: o */
    private final zza f17287o;

    /* renamed from: p */
    private final zzwj f17288p;

    C8169ya(Context context, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) {
        this.f17278f = context;
        this.f17279g = zzbin;
        this.f17280h = str;
        this.f17281i = z;
        this.f17282j = z2;
        this.f17283k = zzdh;
        this.f17284l = zzbai;
        this.f17286n = zzj;
        this.f17287o = zza;
        this.f17288p = zzwj;
    }

    public final Object call() {
        Context context = this.f17278f;
        zzbin zzbin = this.f17279g;
        String str = this.f17280h;
        boolean z = this.f17281i;
        boolean z2 = this.f17282j;
        zzdh zzdh = this.f17283k;
        zzbai zzbai = this.f17284l;
        zzadi zzadi = this.f17285m;
        zzj zzj = this.f17286n;
        zza zza = this.f17287o;
        zzwj zzwj = this.f17288p;
        zzbhk zzbhk = new zzbhk(C7316bb.m16559a(context, zzbin, str, z, z2, zzdh, zzbai, zzadi, zzj, zza, zzwj));
        zzbhk.setWebViewClient(zzk.zzli().mo27813a(zzbhk, zzwj, z2));
        zzbhk.setWebChromeClient(new zzbgr(zzbhk));
        return zzbhk;
    }
}
