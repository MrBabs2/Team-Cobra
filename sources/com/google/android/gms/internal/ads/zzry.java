package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class zzry {

    /* renamed from: a */
    public final Uri f22610a;

    /* renamed from: b */
    public final byte[] f22611b;

    /* renamed from: c */
    public final long f22612c;

    /* renamed from: d */
    public final long f22613d;

    /* renamed from: e */
    public final long f22614e;

    /* renamed from: f */
    public final String f22615f;

    /* renamed from: g */
    public final int f22616g;

    public zzry(Uri uri) {
        this(uri, 0);
    }

    /* renamed from: a */
    public final boolean mo29703a(int i) {
        return (this.f22616g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f22610a);
        String arrays = Arrays.toString(this.f22611b);
        long j = this.f22612c;
        long j2 = this.f22613d;
        long j3 = this.f22614e;
        String str = this.f22615f;
        int i = this.f22616g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
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

    private zzry(Uri uri, int i) {
        this(uri, 0, -1, (String) null, 0);
    }

    public zzry(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private zzry(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, (String) null, 0);
    }

    private zzry(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public zzry(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        zzsk.m25216a(j >= 0);
        zzsk.m25216a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        zzsk.m25216a(z);
        this.f22610a = uri;
        this.f22611b = bArr;
        this.f22612c = j;
        this.f22613d = j2;
        this.f22614e = j3;
        this.f22615f = str;
        this.f22616g = i;
    }
}
