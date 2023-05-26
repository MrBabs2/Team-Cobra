package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public final class zzow implements zznn, zznu {

    /* renamed from: p */
    private static final int f22420p = zzsy.m25292b("qt  ");

    /* renamed from: a */
    private final zzst f22421a = new zzst(zzsq.f22651a);

    /* renamed from: b */
    private final zzst f22422b = new zzst(4);

    /* renamed from: c */
    private final zzst f22423c = new zzst(16);

    /* renamed from: d */
    private final Stack<b20> f22424d = new Stack<>();

    /* renamed from: e */
    private int f22425e;

    /* renamed from: f */
    private int f22426f;

    /* renamed from: g */
    private long f22427g;

    /* renamed from: h */
    private int f22428h;

    /* renamed from: i */
    private zzst f22429i;

    /* renamed from: j */
    private int f22430j;

    /* renamed from: k */
    private int f22431k;

    /* renamed from: l */
    private zznp f22432l;

    /* renamed from: m */
    private n20[] f22433m;

    /* renamed from: n */
    private long f22434n;

    /* renamed from: o */
    private boolean f22435o;

    static {
        new m20();
    }

    /* renamed from: b */
    private final void m24990b(long j) throws zzlm {
        zzpa a;
        while (!this.f22424d.isEmpty() && this.f22424d.peek().f14539z0 == j) {
            b20 pop = this.f22424d.pop();
            if (pop.f14396a == a20.f14389w) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                zzpo zzpo = null;
                zznr zznr = new zznr();
                c20 d = pop.mo25623d(a20.f14368l0);
                if (!(d == null || (zzpo = d20.m16772a(d, this.f22435o)) == null)) {
                    zznr.mo29588a(zzpo);
                }
                for (int i = 0; i < pop.f14538B0.size(); i++) {
                    b20 b20 = pop.f14538B0.get(i);
                    if (b20.f14396a == a20.f14393y && (a = d20.m16771a(b20, pop.mo25623d(a20.f14391x), -9223372036854775807L, (zzne) null, this.f22435o)) != null) {
                        p20 a2 = d20.m16770a(a, b20.mo25624e(a20.f14395z).mo25624e(a20.f14320A).mo25624e(a20.f14321B), zznr);
                        if (a2.f16548a != 0) {
                            n20 n20 = new n20(a, a2, this.f22432l.mo26870b(i, a.f22442b));
                            zzlh a3 = a.f22446f.mo29467a(a2.f16551d + 30);
                            if (a.f22442b == 1) {
                                if (zznr.mo29587a()) {
                                    a3 = a3.mo29468a(zznr.f22355a, zznr.f22356b);
                                }
                                if (zzpo != null) {
                                    a3 = a3.mo29470a(zzpo);
                                }
                            }
                            n20.f16274c.mo29591a(a3);
                            j2 = Math.max(j2, a.f22445e);
                            arrayList.add(n20);
                        }
                    }
                }
                this.f22434n = j2;
                this.f22433m = (n20[]) arrayList.toArray(new n20[arrayList.size()]);
                this.f22432l.mo26871c();
                this.f22432l.mo26866a(this);
                this.f22424d.clear();
                this.f22425e = 2;
            } else if (!this.f22424d.isEmpty()) {
                this.f22424d.peek().f14538B0.add(pop);
            }
        }
        if (this.f22425e != 2) {
            m24991d();
        }
    }

    /* renamed from: d */
    private final void m24991d() {
        this.f22425e = 0;
        this.f22428h = 0;
    }

    /* renamed from: a */
    public final void mo29583a() {
    }

    /* renamed from: a */
    public final boolean mo29586a(zzno zzno) throws IOException, InterruptedException {
        return o20.m17720a(zzno);
    }

    /* renamed from: b */
    public final boolean mo29570b() {
        return true;
    }

    /* renamed from: c */
    public final long mo29571c() {
        return this.f22434n;
    }

    /* renamed from: a */
    public final void mo29585a(zznp zznp) {
        this.f22432l = zznp;
    }

    /* renamed from: a */
    public final void mo29584a(long j, long j2) {
        this.f22424d.clear();
        this.f22428h = 0;
        this.f22430j = 0;
        this.f22431k = 0;
        if (j == 0) {
            m24991d();
            return;
        }
        n20[] n20Arr = this.f22433m;
        if (n20Arr != null) {
            for (n20 n20 : n20Arr) {
                p20 p20 = n20.f16273b;
                int a = p20.mo26397a(j2);
                if (a == -1) {
                    a = p20.mo26398b(j2);
                }
                n20.f16275d = a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x018e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x029b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29582a(com.google.android.gms.internal.ads.zzno r24, com.google.android.gms.internal.ads.zznt r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f22425e
            r4 = -1
            r5 = 8
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L_0x018f
            r8 = 262144(0x40000, double:1.295163E-318)
            r10 = 2
            if (r3 == r6) goto L_0x010d
            if (r3 != r10) goto L_0x0107
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 0
            r5 = -1
        L_0x001e:
            com.google.android.gms.internal.ads.n20[] r14 = r0.f22433m
            int r15 = r14.length
            if (r3 >= r15) goto L_0x003a
            r14 = r14[r3]
            int r15 = r14.f16275d
            com.google.android.gms.internal.ads.p20 r14 = r14.f16273b
            int r11 = r14.f16548a
            if (r15 == r11) goto L_0x0037
            long[] r11 = r14.f16549b
            r14 = r11[r15]
            int r11 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            r5 = r3
            r12 = r14
        L_0x0037:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != r4) goto L_0x003d
            return r4
        L_0x003d:
            r3 = r14[r5]
            com.google.android.gms.internal.ads.zznw r4 = r3.f16274c
            int r5 = r3.f16275d
            com.google.android.gms.internal.ads.p20 r11 = r3.f16273b
            long[] r12 = r11.f16549b
            r13 = r12[r5]
            int[] r11 = r11.f16550c
            r11 = r11[r5]
            com.google.android.gms.internal.ads.zzpa r12 = r3.f16272a
            int r12 = r12.f22447g
            if (r12 != r6) goto L_0x0059
            r16 = 8
            long r13 = r13 + r16
            int r11 = r11 + -8
        L_0x0059:
            long r16 = r24.getPosition()
            long r16 = r13 - r16
            int r12 = r0.f22430j
            r18 = r11
            long r10 = (long) r12
            long r10 = r16 + r10
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 < 0) goto L_0x0104
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 < 0) goto L_0x0072
            goto L_0x0104
        L_0x0072:
            int r2 = (int) r10
            r1.mo29573a(r2)
            com.google.android.gms.internal.ads.zzpa r2 = r3.f16272a
            int r2 = r2.f22450j
            if (r2 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzst r8 = r0.f22422b
            byte[] r8 = r8.f22660a
            r8[r7] = r7
            r8[r6] = r7
            r9 = 2
            r8[r9] = r7
            r8 = 4
            int r11 = 4 - r2
            r8 = r18
        L_0x008c:
            int r9 = r0.f22430j
            if (r9 >= r8) goto L_0x00c9
            int r9 = r0.f22431k
            if (r9 != 0) goto L_0x00ba
            com.google.android.gms.internal.ads.zzst r9 = r0.f22422b
            byte[] r9 = r9.f22660a
            r1.readFully(r9, r11, r2)
            com.google.android.gms.internal.ads.zzst r9 = r0.f22422b
            r9.mo29727b(r7)
            com.google.android.gms.internal.ads.zzst r9 = r0.f22422b
            int r9 = r9.mo29740l()
            r0.f22431k = r9
            com.google.android.gms.internal.ads.zzst r9 = r0.f22421a
            r9.mo29727b(r7)
            com.google.android.gms.internal.ads.zzst r9 = r0.f22421a
            r10 = 4
            r4.mo29592a(r9, r10)
            int r9 = r0.f22430j
            int r9 = r9 + r10
            r0.f22430j = r9
            int r8 = r8 + r11
            goto L_0x008c
        L_0x00ba:
            int r9 = r4.mo29589a(r1, r9, r7)
            int r10 = r0.f22430j
            int r10 = r10 + r9
            r0.f22430j = r10
            int r10 = r0.f22431k
            int r10 = r10 - r9
            r0.f22431k = r10
            goto L_0x008c
        L_0x00c9:
            r20 = r8
            goto L_0x00e7
        L_0x00cc:
            int r2 = r0.f22430j
            r11 = r18
            if (r2 >= r11) goto L_0x00e5
            int r2 = r11 - r2
            int r2 = r4.mo29589a(r1, r2, r7)
            int r8 = r0.f22430j
            int r8 = r8 + r2
            r0.f22430j = r8
            int r8 = r0.f22431k
            int r8 = r8 - r2
            r0.f22431k = r8
            r18 = r11
            goto L_0x00cc
        L_0x00e5:
            r20 = r11
        L_0x00e7:
            com.google.android.gms.internal.ads.p20 r1 = r3.f16273b
            long[] r2 = r1.f16552e
            r17 = r2[r5]
            int[] r1 = r1.f16553f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.mo29590a(r17, r19, r20, r21, r22)
            int r1 = r3.f16275d
            int r1 = r1 + r6
            r3.f16275d = r1
            r0.f22430j = r7
            r0.f22431k = r7
            return r7
        L_0x0104:
            r2.f22357a = r13
            return r6
        L_0x0107:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x010d:
            long r3 = r0.f22427g
            int r10 = r0.f22428h
            long r10 = (long) r10
            long r3 = r3 - r10
            long r10 = r24.getPosition()
            long r10 = r10 + r3
            com.google.android.gms.internal.ads.zzst r12 = r0.f22429i
            if (r12 == 0) goto L_0x016f
            byte[] r8 = r12.f22660a
            int r9 = r0.f22428h
            int r4 = (int) r3
            r1.readFully(r8, r9, r4)
            int r3 = r0.f22426f
            int r4 = com.google.android.gms.internal.ads.a20.f14347b
            if (r3 != r4) goto L_0x0150
            com.google.android.gms.internal.ads.zzst r3 = r0.f22429i
            r3.mo29727b(r5)
            int r4 = r3.mo29730d()
            int r5 = f22420p
            if (r4 != r5) goto L_0x0139
        L_0x0137:
            r3 = 1
            goto L_0x014d
        L_0x0139:
            r4 = 4
            r3.mo29729c(r4)
        L_0x013d:
            int r4 = r3.mo29742n()
            if (r4 <= 0) goto L_0x014c
            int r4 = r3.mo29730d()
            int r5 = f22420p
            if (r4 != r5) goto L_0x013d
            goto L_0x0137
        L_0x014c:
            r3 = 0
        L_0x014d:
            r0.f22435o = r3
            goto L_0x0177
        L_0x0150:
            java.util.Stack<com.google.android.gms.internal.ads.b20> r3 = r0.f22424d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0177
            java.util.Stack<com.google.android.gms.internal.ads.b20> r3 = r0.f22424d
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.b20 r3 = (com.google.android.gms.internal.ads.b20) r3
            com.google.android.gms.internal.ads.c20 r4 = new com.google.android.gms.internal.ads.c20
            int r5 = r0.f22426f
            com.google.android.gms.internal.ads.zzst r8 = r0.f22429i
            r4.<init>(r5, r8)
            java.util.List<com.google.android.gms.internal.ads.c20> r3 = r3.f14537A0
            r3.add(r4)
            goto L_0x0177
        L_0x016f:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0179
            int r4 = (int) r3
            r1.mo29573a(r4)
        L_0x0177:
            r3 = 0
            goto L_0x0181
        L_0x0179:
            long r8 = r24.getPosition()
            long r8 = r8 + r3
            r2.f22357a = r8
            r3 = 1
        L_0x0181:
            r0.m24990b(r10)
            if (r3 == 0) goto L_0x018c
            int r3 = r0.f22425e
            r4 = 2
            if (r3 == r4) goto L_0x018c
            r7 = 1
        L_0x018c:
            if (r7 == 0) goto L_0x0006
            return r6
        L_0x018f:
            int r3 = r0.f22428h
            if (r3 != 0) goto L_0x01b7
            com.google.android.gms.internal.ads.zzst r3 = r0.f22423c
            byte[] r3 = r3.f22660a
            boolean r3 = r1.mo29575a(r3, r7, r5, r6)
            if (r3 != 0) goto L_0x01a0
            r6 = 0
            goto L_0x0299
        L_0x01a0:
            r0.f22428h = r5
            com.google.android.gms.internal.ads.zzst r3 = r0.f22423c
            r3.mo29727b(r7)
            com.google.android.gms.internal.ads.zzst r3 = r0.f22423c
            long r8 = r3.mo29738j()
            r0.f22427g = r8
            com.google.android.gms.internal.ads.zzst r3 = r0.f22423c
            int r3 = r3.mo29730d()
            r0.f22426f = r3
        L_0x01b7:
            long r8 = r0.f22427g
            r10 = 1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01d3
            com.google.android.gms.internal.ads.zzst r3 = r0.f22423c
            byte[] r3 = r3.f22660a
            r1.readFully(r3, r5, r5)
            int r3 = r0.f22428h
            int r3 = r3 + r5
            r0.f22428h = r3
            com.google.android.gms.internal.ads.zzst r3 = r0.f22423c
            long r8 = r3.mo29741m()
            r0.f22427g = r8
        L_0x01d3:
            int r3 = r0.f22426f
            int r8 = com.google.android.gms.internal.ads.a20.f14389w
            if (r3 == r8) goto L_0x01f0
            int r8 = com.google.android.gms.internal.ads.a20.f14393y
            if (r3 == r8) goto L_0x01f0
            int r8 = com.google.android.gms.internal.ads.a20.f14395z
            if (r3 == r8) goto L_0x01f0
            int r8 = com.google.android.gms.internal.ads.a20.f14320A
            if (r3 == r8) goto L_0x01f0
            int r8 = com.google.android.gms.internal.ads.a20.f14321B
            if (r3 == r8) goto L_0x01f0
            int r8 = com.google.android.gms.internal.ads.a20.f14328I
            if (r3 != r8) goto L_0x01ee
            goto L_0x01f0
        L_0x01ee:
            r3 = 0
            goto L_0x01f1
        L_0x01f0:
            r3 = 1
        L_0x01f1:
            if (r3 == 0) goto L_0x021d
            long r7 = r24.getPosition()
            long r9 = r0.f22427g
            long r7 = r7 + r9
            int r3 = r0.f22428h
            long r9 = (long) r3
            long r7 = r7 - r9
            java.util.Stack<com.google.android.gms.internal.ads.b20> r3 = r0.f22424d
            com.google.android.gms.internal.ads.b20 r5 = new com.google.android.gms.internal.ads.b20
            int r9 = r0.f22426f
            r5.<init>(r9, r7)
            r3.add(r5)
            long r9 = r0.f22427g
            int r3 = r0.f22428h
            long r11 = (long) r3
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0218
            r0.m24990b(r7)
            goto L_0x0299
        L_0x0218:
            r23.m24991d()
            goto L_0x0299
        L_0x021d:
            int r3 = r0.f22426f
            int r8 = com.google.android.gms.internal.ads.a20.f14330K
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14391x
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14331L
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14332M
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14343X
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14344Y
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14345Z
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14329J
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14346a0
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14348b0
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14350c0
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14352d0
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14354e0
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14327H
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14347b
            if (r3 == r8) goto L_0x0262
            int r8 = com.google.android.gms.internal.ads.a20.f14368l0
            if (r3 != r8) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            r3 = 0
            goto L_0x0263
        L_0x0262:
            r3 = 1
        L_0x0263:
            if (r3 == 0) goto L_0x0294
            int r3 = r0.f22428h
            if (r3 != r5) goto L_0x026b
            r3 = 1
            goto L_0x026c
        L_0x026b:
            r3 = 0
        L_0x026c:
            com.google.android.gms.internal.ads.zzsk.m25218b(r3)
            long r8 = r0.f22427g
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x027a
            r3 = 1
            goto L_0x027b
        L_0x027a:
            r3 = 0
        L_0x027b:
            com.google.android.gms.internal.ads.zzsk.m25218b(r3)
            com.google.android.gms.internal.ads.zzst r3 = new com.google.android.gms.internal.ads.zzst
            long r8 = r0.f22427g
            int r9 = (int) r8
            r3.<init>((int) r9)
            r0.f22429i = r3
            com.google.android.gms.internal.ads.zzst r8 = r0.f22423c
            byte[] r8 = r8.f22660a
            byte[] r3 = r3.f22660a
            java.lang.System.arraycopy(r8, r7, r3, r7, r5)
            r0.f22425e = r6
            goto L_0x0299
        L_0x0294:
            r3 = 0
            r0.f22429i = r3
            r0.f22425e = r6
        L_0x0299:
            if (r6 != 0) goto L_0x0006
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.mo29582a(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    /* renamed from: a */
    public final long mo29569a(long j) {
        long j2 = Long.MAX_VALUE;
        for (n20 n20 : this.f22433m) {
            p20 p20 = n20.f16273b;
            int a = p20.mo26397a(j);
            if (a == -1) {
                a = p20.mo26398b(j);
            }
            long j3 = p20.f16549b[a];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }
}
