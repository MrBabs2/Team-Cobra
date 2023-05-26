package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class zznm implements zzno {

    /* renamed from: g */
    private static final byte[] f22347g = new byte[RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: a */
    private final zzrv f22348a;

    /* renamed from: b */
    private final long f22349b;

    /* renamed from: c */
    private long f22350c;

    /* renamed from: d */
    private byte[] f22351d = new byte[65536];

    /* renamed from: e */
    private int f22352e;

    /* renamed from: f */
    private int f22353f;

    public zznm(zzrv zzrv, long j, long j2) {
        this.f22348a = zzrv;
        this.f22350c = j;
        this.f22349b = j2;
    }

    /* renamed from: d */
    private final int m24930d(int i) {
        int min = Math.min(this.f22353f, i);
        m24931e(min);
        return min;
    }

    /* renamed from: e */
    private final void m24931e(int i) {
        int i2 = this.f22353f - i;
        this.f22353f = i2;
        this.f22352e = 0;
        byte[] bArr = this.f22351d;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.f22351d, i, bArr, 0, this.f22353f);
        this.f22351d = bArr;
    }

    /* renamed from: f */
    private final void m24932f(int i) {
        if (i != -1) {
            this.f22350c += (long) i;
        }
    }

    /* renamed from: a */
    public final boolean mo29575a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int b = m24929b(bArr, i, i2);
        while (b < i2 && b != -1) {
            b = m24927a(bArr, i, i2, b, z);
        }
        m24932f(b);
        return b != -1;
    }

    /* renamed from: b */
    public final int mo29576b(int i) throws IOException, InterruptedException {
        int d = m24930d(i);
        if (d == 0) {
            byte[] bArr = f22347g;
            d = m24927a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m24932f(d);
        return d;
    }

    /* renamed from: c */
    public final void mo29578c(int i) throws IOException, InterruptedException {
        m24928a(i, false);
    }

    public final long getPosition() {
        return this.f22350c;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int b = m24929b(bArr, i, i2);
        if (b == 0) {
            b = m24927a(bArr, i, i2, 0, true);
        }
        m24932f(b);
        return b;
    }

    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo29575a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final void mo29573a(int i) throws IOException, InterruptedException {
        int d = m24930d(i);
        while (d < i && d != -1) {
            byte[] bArr = f22347g;
            d = m24927a(bArr, -d, Math.min(i, bArr.length + d), d, false);
        }
        m24932f(d);
    }

    /* renamed from: b */
    public final long mo29577b() {
        return this.f22349b;
    }

    /* renamed from: b */
    private final int m24929b(byte[] bArr, int i, int i2) {
        int i3 = this.f22353f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f22351d, 0, bArr, i, min);
        m24931e(min);
        return min;
    }

    /* renamed from: a */
    public final void mo29574a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        if (m24928a(i2, false)) {
            System.arraycopy(this.f22351d, this.f22352e - i2, bArr, i, i2);
        }
    }

    /* renamed from: a */
    private final boolean m24928a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f22352e + i;
        byte[] bArr = this.f22351d;
        if (i2 > bArr.length) {
            this.f22351d = Arrays.copyOf(this.f22351d, zzsy.m25282a(bArr.length << 1, 65536 + i2, i2 + 524288));
        }
        int min = Math.min(this.f22353f - this.f22352e, i);
        while (min < i) {
            min = m24927a(this.f22351d, this.f22352e, i, min, false);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f22352e + i;
        this.f22352e = i3;
        this.f22353f = Math.max(this.f22353f, i3);
        return true;
    }

    /* renamed from: a */
    public final void mo29572a() {
        this.f22352e = 0;
    }

    /* renamed from: a */
    private final int m24927a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.f22348a.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
