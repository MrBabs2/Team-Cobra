package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

@zzard
/* renamed from: com.google.android.gms.internal.ads.v9 */
final class C8057v9 implements zzrv {

    /* renamed from: a */
    private final zzrv f17012a;

    /* renamed from: b */
    private final long f17013b;

    /* renamed from: c */
    private final zzrv f17014c;

    /* renamed from: d */
    private long f17015d;

    /* renamed from: e */
    private Uri f17016e;

    C8057v9(zzrv zzrv, int i, zzrv zzrv2) {
        this.f17012a = zzrv;
        this.f17013b = (long) i;
        this.f17014c = zzrv2;
    }

    /* renamed from: F */
    public final Uri mo26231F() {
        return this.f17016e;
    }

    /* renamed from: a */
    public final long mo26232a(zzry zzry) throws IOException {
        zzry zzry2;
        zzry zzry3 = zzry;
        this.f17016e = zzry3.f22610a;
        long j = zzry3.f22613d;
        long j2 = this.f17013b;
        zzry zzry4 = null;
        if (j >= j2) {
            zzry2 = null;
        } else {
            long j3 = zzry3.f22614e;
            zzry2 = new zzry(zzry3.f22610a, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null);
        }
        long j4 = zzry3.f22614e;
        if (j4 == -1 || zzry3.f22613d + j4 > this.f17013b) {
            long max = Math.max(this.f17013b, zzry3.f22613d);
            long j5 = zzry3.f22614e;
            zzry4 = new zzry(zzry3.f22610a, max, j5 != -1 ? Math.min(j5, (zzry3.f22613d + j5) - this.f17013b) : -1, (String) null);
        }
        long j6 = 0;
        long a = zzry2 != null ? this.f17012a.mo26232a(zzry2) : 0;
        if (zzry4 != null) {
            j6 = this.f17014c.mo26232a(zzry4);
        }
        this.f17015d = zzry3.f22613d;
        if (a == -1 || j6 == -1) {
            return -1;
        }
        return a + j6;
    }

    public final void close() throws IOException {
        this.f17012a.close();
        this.f17014c.close();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f17015d;
        long j2 = this.f17013b;
        if (j < j2) {
            i3 = this.f17012a.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.f17015d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f17015d < this.f17013b) {
            return i3;
        }
        int read = this.f17014c.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.f17015d += (long) read;
        return i4;
    }
}
