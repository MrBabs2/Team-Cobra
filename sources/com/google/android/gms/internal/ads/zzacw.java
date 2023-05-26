package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.regex.Pattern;

@zzard
public final class zzacw {
    /* renamed from: a */
    public static boolean m18986a(String str) {
        return m18987a((String) zzyt.m25670e().mo27163a(zzacu.f17776A2), str);
    }

    /* renamed from: a */
    private static boolean m18987a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                zzk.zzlk().mo27734a((Throwable) e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
