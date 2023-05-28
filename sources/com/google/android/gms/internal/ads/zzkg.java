package com.google.android.gms.internal.ads;

import java.util.Collections;

public final class zzkg {

    /* renamed from: a */
    private static final int[] f22143a = {48000, 44100, 32000};

    /* renamed from: b */
    private static final int[] f22144b = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: a */
    public static zzhj m24654a(zzkm zzkm) {
        int i = f22143a[(zzkm.mo29425e() & 192) >> 6];
        int e = zzkm.mo29425e();
        int i2 = f22144b[(e & 56) >> 3];
        if ((e & 4) != 0) {
            i2++;
        }
        return zzhj.m24482b("audio/ac3", -1, -1, i2, i, Collections.emptyList());
    }

    /* renamed from: b */
    public static zzhj m24655b(zzkm zzkm) {
        zzkm.mo29422b(2);
        int i = f22143a[(zzkm.mo29425e() & 192) >> 6];
        int e = zzkm.mo29425e();
        int i2 = f22144b[(e & 14) >> 1];
        if ((e & 1) != 0) {
            i2++;
        }
        return zzhj.m24477a("audio/eac3", -1, i2, i, Collections.emptyList());
    }

    /* renamed from: a */
    public static int m24653a(int i, int i2) {
        return (((i << 3) * i2) + 768000) / 1536000;
    }
}
