package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

final class q10 implements t10 {

    /* renamed from: a */
    private final byte[] f16629a = new byte[8];

    /* renamed from: b */
    private final Stack<s10> f16630b = new Stack<>();

    /* renamed from: c */
    private final z10 f16631c = new z10();

    /* renamed from: d */
    private u10 f16632d;

    /* renamed from: e */
    private int f16633e;

    /* renamed from: f */
    private int f16634f;

    /* renamed from: g */
    private long f16635g;

    q10() {
    }

    /* renamed from: a */
    public final void mo26459a(u10 u10) {
        this.f16632d = u10;
    }

    /* renamed from: a */
    public final void mo26458a() {
        this.f16633e = 0;
        this.f16630b.clear();
        this.f16631c.mo26860a();
    }

    /* renamed from: a */
    public final boolean mo26460a(zzno zzno) throws IOException, InterruptedException {
        String str;
        double d;
        int a;
        int a2;
        zzsk.m25218b(this.f16632d != null);
        while (true) {
            if (this.f16630b.isEmpty() || zzno.getPosition() < this.f16630b.peek().f16818b) {
                if (this.f16633e == 0) {
                    long a3 = this.f16631c.mo26859a(zzno, true, false, 4);
                    if (a3 == -2) {
                        zzno.mo29572a();
                        while (true) {
                            zzno.mo29574a(this.f16629a, 0, 4);
                            a = z10.m18582a(this.f16629a[0]);
                            if (a != -1 && a <= 4) {
                                a2 = (int) z10.m18583a(this.f16629a, a, false);
                                if (this.f16632d.mo26647c(a2)) {
                                    break;
                                }
                            }
                            zzno.mo29573a(1);
                        }
                        zzno.mo29573a(a);
                        a3 = (long) a2;
                    }
                    if (a3 == -1) {
                        return false;
                    }
                    this.f16634f = (int) a3;
                    this.f16633e = 1;
                }
                if (this.f16633e == 1) {
                    this.f16635g = this.f16631c.mo26859a(zzno, false, true, 8);
                    this.f16633e = 2;
                }
                int a4 = this.f16632d.mo26640a(this.f16634f);
                if (a4 == 0) {
                    zzno.mo29573a((int) this.f16635g);
                    this.f16633e = 0;
                } else if (a4 == 1) {
                    long position = zzno.getPosition();
                    this.f16630b.add(new s10(this.f16634f, this.f16635g + position));
                    this.f16632d.mo26643a(this.f16634f, position, this.f16635g);
                    this.f16633e = 0;
                    return true;
                } else if (a4 == 2) {
                    long j = this.f16635g;
                    if (j <= 8) {
                        this.f16632d.mo26646b(this.f16634f, m17983a(zzno, (int) j));
                        this.f16633e = 0;
                        return true;
                    }
                    long j2 = this.f16635g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new zzlm(sb.toString());
                } else if (a4 == 3) {
                    long j3 = this.f16635g;
                    if (j3 <= 2147483647L) {
                        u10 u10 = this.f16632d;
                        int i = this.f16634f;
                        int i2 = (int) j3;
                        if (i2 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i2];
                            zzno.readFully(bArr, 0, i2);
                            str = new String(bArr);
                        }
                        u10.mo26644a(i, str);
                        this.f16633e = 0;
                        return true;
                    }
                    long j4 = this.f16635g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j4);
                    throw new zzlm(sb2.toString());
                } else if (a4 == 4) {
                    this.f16632d.mo26642a(this.f16634f, (int) this.f16635g, zzno);
                    this.f16633e = 0;
                    return true;
                } else if (a4 == 5) {
                    long j5 = this.f16635g;
                    if (j5 == 4 || j5 == 8) {
                        u10 u102 = this.f16632d;
                        int i3 = this.f16634f;
                        int i4 = (int) this.f16635g;
                        long a5 = m17983a(zzno, i4);
                        if (i4 == 4) {
                            d = (double) Float.intBitsToFloat((int) a5);
                        } else {
                            d = Double.longBitsToDouble(a5);
                        }
                        u102.mo26641a(i3, d);
                        this.f16633e = 0;
                        return true;
                    }
                    long j6 = this.f16635g;
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j6);
                    throw new zzlm(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(a4);
                    throw new zzlm(sb4.toString());
                }
            } else {
                this.f16632d.mo26645b(this.f16630b.pop().f16817a);
                return true;
            }
        }
    }

    /* renamed from: a */
    private final long m17983a(zzno zzno, int i) throws IOException, InterruptedException {
        zzno.readFully(this.f16629a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f16629a[i2] & 255));
        }
        return j;
    }
}
