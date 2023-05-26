package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;

@zzard
public final class zzbfm implements zzbgd {
    /* renamed from: a */
    public final zzbft mo28066a(zzbdf zzbdf, int i, String str, zzbde zzbde) {
        if (Build.VERSION.SDK_INT >= 16 && i > 0) {
            List asList = Arrays.asList(zzbde.f18831e.split(","));
            if (asList.contains("3")) {
                int g = zzbfa.m20769g();
                if (g < zzbde.f18834h) {
                    return new zzbgp(zzbdf, zzbde);
                }
                if (g < zzbde.f18828b) {
                    return new zzbgo(zzbdf, zzbde);
                }
                return new zzbgf(zzbdf);
            } else if (asList.contains(DiskLruCache.VERSION_1)) {
                int g2 = zzbdk.m20700g();
                if (g2 < zzbde.f18834h) {
                    if (i == 1) {
                        return new zzbgk(zzbdf);
                    }
                    if (i == 2) {
                        return new zzbgh(zzbdf, (String) null);
                    }
                }
                if (g2 < zzbde.f18828b) {
                    return new zzbgg(zzbdf, zzbde);
                }
                return new zzbgf(zzbdf);
            }
        }
        return new zzbge(zzbdf);
    }
}
