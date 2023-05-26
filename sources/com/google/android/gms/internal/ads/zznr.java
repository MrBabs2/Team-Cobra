package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzpo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zznr {

    /* renamed from: c */
    private static final Pattern f22354c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f22355a = -1;

    /* renamed from: b */
    public int f22356b = -1;

    static {
        new p10();
    }

    /* renamed from: a */
    public final boolean mo29588a(zzpo zzpo) {
        for (int i = 0; i < zzpo.mo29616a(); i++) {
            zzpo.zza a = zzpo.mo29617a(i);
            if (a instanceof zzps) {
                zzps zzps = (zzps) a;
                if (m24956a(zzps.f22512h, zzps.f22513i)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m24956a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f22354c.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f22355a = parseInt;
                    this.f22356b = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo29587a() {
        return (this.f22355a == -1 || this.f22356b == -1) ? false : true;
    }
}
