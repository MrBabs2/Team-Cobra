package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;

@zzard
public final class zzbit {
    /* renamed from: a */
    public static zzbgz m21172a(Context context, zzbin zzbin, String str, boolean z, boolean z2, zzdh zzdh, zzbai zzbai, zzadi zzadi, zzj zzj, zza zza, zzwj zzwj) throws zzbhj {
        try {
            return (zzbgz) zzazl.m20449a(new C7763nb(context, zzbin, str, z, z2, zzdh, zzbai, (zzadi) null, zzj, zza, zzwj));
        } catch (Throwable th) {
            zzk.zzlk().mo27734a(th, "AdWebViewFactory.newAdWebView2");
            throw new zzbhj("Webview initialization failed.", th);
        }
    }
}
