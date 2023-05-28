package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class zzjq {

    /* renamed from: a */
    public final Uri f22106a;

    /* renamed from: b */
    public final long f22107b;

    /* renamed from: c */
    public final long f22108c;

    /* renamed from: d */
    public final long f22109d;

    /* renamed from: e */
    public final String f22110e;

    /* renamed from: f */
    public final int f22111f;

    public zzjq(Uri uri) {
        this(uri, 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22106a);
        long j = this.f22107b;
        long j2 = this.f22108c;
        long j3 = this.f22109d;
        String str = this.f22110e;
        int i = this.f22111f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91 + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    private zzjq(Uri uri, int i) {
        this(uri, 0, -1, (String) null, 0);
    }

    public zzjq(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, (String) null, 0);
    }

    private zzjq(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, (String) null, 0);
    }

    public zzjq(Uri uri, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        zzkh.m24657a(j >= 0);
        zzkh.m24657a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        zzkh.m24657a(z);
        this.f22106a = uri;
        this.f22107b = j;
        this.f22108c = j2;
        this.f22109d = j3;
        this.f22110e = str;
        this.f22111f = i;
    }
}
