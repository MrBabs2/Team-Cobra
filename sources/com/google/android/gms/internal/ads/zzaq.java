package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class zzaq {
    /* renamed from: a */
    public static zzc m19828a(zzp zzp) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        zzp zzp2 = zzp;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = zzp2.f22438c;
        String str = map.get("Date");
        long a = str != null ? m19827a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get("Expires");
        long a2 = str3 != null ? m19827a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a3 = str4 != null ? m19827a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        zzc zzc = new zzc();
        zzc.f19815a = zzp2.f22437b;
        zzc.f19816b = str5;
        zzc.f19820f = j4;
        zzc.f19819e = j3;
        zzc.f19817c = a;
        zzc.f19818d = a3;
        zzc.f19821g = map;
        zzc.f19822h = zzp2.f22439d;
        return zzc;
    }

    /* renamed from: a */
    private static long m19827a(String str) {
        try {
            return m19830a().parse(str).getTime();
        } catch (ParseException e) {
            zzag.m19160a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    static String m19829a(long j) {
        return m19830a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m19830a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
