package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Stack;

final class d00 implements g00 {

    /* renamed from: a */
    private final byte[] f14783a = new byte[8];

    /* renamed from: b */
    private final Stack<f00> f14784b = new Stack<>();

    /* renamed from: c */
    private final i00 f14785c = new i00();

    /* renamed from: d */
    private h00 f14786d;

    /* renamed from: e */
    private int f14787e;

    /* renamed from: f */
    private int f14788f;

    /* renamed from: g */
    private long f14789g;

    d00() {
    }

    /* renamed from: a */
    public final void mo25803a(h00 h00) {
        this.f14786d = h00;
    }

    /* renamed from: a */
    public final void mo25802a() {
        this.f14787e = 0;
        this.f14784b.clear();
        this.f14785c.mo26063a();
    }

    /* renamed from: a */
    public final boolean mo25804a(zzie zzie) throws IOException, InterruptedException {
        double d;
        zzkh.m24659b(this.f14786d != null);
        while (true) {
            if (this.f14784b.isEmpty() || zzie.getPosition() < this.f14784b.peek().f15173b) {
                if (this.f14787e == 0) {
                    long a = this.f14785c.mo26062a(zzie, true, false);
                    if (a == -1) {
                        return false;
                    }
                    this.f14788f = (int) a;
                    this.f14787e = 1;
                }
                if (this.f14787e == 1) {
                    this.f14789g = this.f14785c.mo26062a(zzie, false, true);
                    this.f14787e = 2;
                }
                int a2 = this.f14786d.mo25990a(this.f14788f);
                if (a2 == 0) {
                    zzie.mo29368a((int) this.f14789g);
                    this.f14787e = 0;
                } else if (a2 == 1) {
                    long position = zzie.getPosition();
                    this.f14784b.add(new f00(this.f14788f, this.f14789g + position));
                    this.f14786d.mo25993a(this.f14788f, position, this.f14789g);
                    this.f14787e = 0;
                    return true;
                } else if (a2 == 2) {
                    long j = this.f14789g;
                    if (j <= 8) {
                        this.f14786d.mo25996b(this.f14788f, m16751a(zzie, (int) j));
                        this.f14787e = 0;
                        return true;
                    }
                    long j2 = this.f14789g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new IllegalStateException(sb.toString());
                } else if (a2 == 3) {
                    long j3 = this.f14789g;
                    if (j3 <= 2147483647L) {
                        h00 h00 = this.f14786d;
                        int i = this.f14788f;
                        int i2 = (int) j3;
                        byte[] bArr = new byte[i2];
                        zzie.readFully(bArr, 0, i2);
                        h00.mo25994a(i, new String(bArr, Charset.forName("UTF-8")));
                        this.f14787e = 0;
                        return true;
                    }
                    long j4 = this.f14789g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j4);
                    throw new IllegalStateException(sb2.toString());
                } else if (a2 == 4) {
                    this.f14786d.mo25992a(this.f14788f, (int) this.f14789g, zzie);
                    this.f14787e = 0;
                    return true;
                } else if (a2 == 5) {
                    long j5 = this.f14789g;
                    if (j5 == 4 || j5 == 8) {
                        h00 h002 = this.f14786d;
                        int i3 = this.f14788f;
                        int i4 = (int) this.f14789g;
                        long a3 = m16751a(zzie, i4);
                        if (i4 == 4) {
                            d = (double) Float.intBitsToFloat((int) a3);
                        } else {
                            d = Double.longBitsToDouble(a3);
                        }
                        h002.mo25991a(i3, d);
                        this.f14787e = 0;
                        return true;
                    }
                    long j6 = this.f14789g;
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j6);
                    throw new IllegalStateException(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(a2);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                this.f14786d.mo25995b(this.f14784b.pop().f15172a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m16751a(zzie zzie, int i) throws IOException, InterruptedException {
        zzie.readFully(this.f14783a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f14783a[i2] & 255));
        }
        return j;
    }
}
