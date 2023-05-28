package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;

@zzard
public final class zzbhf {
    /* renamed from: a */
    public static zzbbh<zzbgz> m20984a(Context context, zzbai zzbai, String str, zzdh zzdh, zza zza) {
        return zzbar.m20542a(zzbar.m20539a(null), new C8132xa(context, zzdh, zzbai, zza, str), zzbbm.f18748a);
    }

    /* renamed from: a */
    public static zzbgz m20985a(Context context, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) throws zzbhj {
        zzacu.m18983a(context);
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17966t0)).booleanValue()) {
            return zzbit.m21172a(context, zzbin, str, z, z2, zzdh, zzbai, (zzadi) null, zzj, zza, zzwj);
        }
        try {
            return (zzbgz) zzazl.m20449a(new C8169ya(context, zzbin, str, z, z2, zzdh, zzbai, (zzadi) null, zzj, zza, zzwj));
        } catch (Throwable th) {
            throw new zzbhj("Webview initialization failed.", th);
        }
    }
}
