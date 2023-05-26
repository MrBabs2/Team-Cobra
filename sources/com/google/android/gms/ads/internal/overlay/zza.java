package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzacu;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzawz;
import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;

@zzard
public final class zza {
    public static boolean zza(Context context, zzc zzc, zzu zzu) {
        int i = 0;
        if (zzc == null) {
            zzbad.m20523d("No intent data for launcher overlay.");
            return false;
        }
        zzacu.m18983a(context);
        Intent intent = zzc.intent;
        if (intent != null) {
            return zza(context, intent, zzu);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.url)) {
            zzbad.m20523d("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.mimeType)) {
            intent2.setDataAndType(Uri.parse(zzc.url), zzc.mimeType);
        } else {
            intent2.setData(Uri.parse(zzc.url));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.packageName)) {
            intent2.setPackage(zzc.packageName);
        }
        if (!TextUtils.isEmpty(zzc.zzdjh)) {
            String[] split = zzc.zzdjh.split("/", 2);
            if (split.length < 2) {
                String valueOf = String.valueOf(zzc.zzdjh);
                zzbad.m20523d(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = zzc.zzdji;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzbad.m20523d("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17895d2)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17890c2)).booleanValue()) {
                zzk.zzlg();
                zzaxi.m20284b(context, intent2);
            }
        }
        return zza(context, intent2, zzu);
    }

    private static boolean zza(Context context, Intent intent, zzu zzu) {
        try {
            String valueOf = String.valueOf(intent.toURI());
            zzawz.m20167e(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            zzk.zzlg();
            zzaxi.m20273a(context, intent);
            if (zzu == null) {
                return true;
            }
            zzu.zztq();
            return true;
        } catch (ActivityNotFoundException e) {
            zzbad.m20523d(e.getMessage());
            return false;
        }
    }
}
