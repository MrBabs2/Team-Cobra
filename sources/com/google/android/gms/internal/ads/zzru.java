package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class zzru implements zzrv {

    /* renamed from: a */
    private final byte[] f22606a;

    /* renamed from: b */
    private Uri f22607b;

    /* renamed from: c */
    private int f22608c;

    /* renamed from: d */
    private int f22609d;

    public zzru(byte[] bArr) {
        zzsk.m25214a(bArr);
        zzsk.m25216a(bArr.length > 0);
        this.f22606a = bArr;
    }

    /* renamed from: F */
    public final Uri mo26231F() {
        return this.f22607b;
    }

    /* renamed from: a */
    public final long mo26232a(zzry zzry) throws IOException {
        this.f22607b = zzry.f22610a;
        long j = zzry.f22613d;
        this.f22608c = (int) j;
        long j2 = zzry.f22614e;
        if (j2 == -1) {
            j2 = ((long) this.f22606a.length) - j;
        }
        int i = (int) j2;
        this.f22609d = i;
        if (i > 0 && this.f22608c + i <= this.f22606a.length) {
            return (long) i;
        }
        int i2 = this.f22608c;
        long j3 = zzry.f22614e;
        int length = this.f22606a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    public final void close() throws IOException {
        this.f22607b = null;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f22609d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f22606a, this.f22608c, bArr, i, min);
        this.f22608c += min;
        this.f22609d -= min;
        return min;
    }
}
