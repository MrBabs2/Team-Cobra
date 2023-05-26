package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public final class zziv implements zzid, zzio {

    /* renamed from: a */
    private final zzkm f22046a = new zzkm(zzkj.f22147a);

    /* renamed from: b */
    private final zzkm f22047b = new zzkm(4);

    /* renamed from: c */
    private final zzkm f22048c = new zzkm(16);

    /* renamed from: d */
    private final Stack<zzir> f22049d = new Stack<>();

    /* renamed from: e */
    private int f22050e = 0;

    /* renamed from: f */
    private long f22051f;

    /* renamed from: g */
    private int f22052g;

    /* renamed from: h */
    private long f22053h;

    /* renamed from: i */
    private int f22054i;

    /* renamed from: j */
    private zzkm f22055j;

    /* renamed from: k */
    private int f22056k;

    /* renamed from: l */
    private int f22057l;

    /* renamed from: m */
    private int f22058m;

    /* renamed from: n */
    private zzif f22059n;

    /* renamed from: o */
    private a00[] f22060o;

    /* renamed from: a */
    public final void mo29385a(zzif zzif) {
        this.f22059n = zzif;
    }

    /* renamed from: b */
    public final boolean mo29367b() {
        return true;
    }

    /* renamed from: a */
    public final void mo29384a() {
        this.f22051f = 0;
        this.f22057l = 0;
        this.f22058m = 0;
    }

    /* renamed from: a */
    public final int mo29383a(zzie zzie, zzij zzij) throws IOException, InterruptedException {
        boolean z;
        a00[] a00Arr;
        long j;
        int i;
        boolean z2;
        zziv zziv;
        zzir zzir;
        boolean z3;
        int i2;
        zziv zziv2;
        ArrayList arrayList;
        zzix a;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2;
        int i11;
        zzkm zzkm;
        int i12;
        zzkm zzkm2;
        int i13;
        zziv zziv3 = this;
        zzie zzie2 = zzie;
        while (true) {
            zzij zzij2 = zzij;
            int i14 = zziv3.f22050e;
            if (i14 == 0) {
                zziv zziv4 = zziv3;
                zzie zzie3 = zzie;
                if (!zzie3.mo29369a(zziv4.f22048c.f22150a, 0, 8, true)) {
                    z = false;
                } else {
                    zziv4.f22048c.mo29418a(0);
                    zziv4.f22053h = zziv4.f22048c.mo29427g();
                    zziv4.f22052g = zziv4.f22048c.mo29423c();
                    if (zziv4.f22053h == 1) {
                        zzie3.readFully(zziv4.f22048c.f22150a, 8, 8);
                        zziv4.f22053h = zziv4.f22048c.mo29424d();
                        zziv4.f22051f += 16;
                        zziv4.f22054i = 16;
                    } else {
                        zziv4.f22051f += 8;
                        zziv4.f22054i = 8;
                    }
                    int i15 = zziv4.f22052g;
                    if (i15 == C8157xz.f17235j || i15 == C8157xz.f17237l || i15 == C8157xz.f17238m || i15 == C8157xz.f17239n || i15 == C8157xz.f17240o) {
                        if (zziv4.f22053h == 1) {
                            zziv4.f22049d.add(new zzir(zziv4.f22052g, (zziv4.f22051f + zziv4.f22053h) - ((long) zziv4.f22054i)));
                        } else {
                            zziv4.f22049d.add(new zzir(zziv4.f22052g, (zziv4.f22051f + zziv4.f22053h) - ((long) zziv4.f22054i)));
                        }
                        zziv4.f22050e = 0;
                    } else {
                        int i16 = zziv4.f22052g;
                        if (i16 == C8157xz.f17243r || i16 == C8157xz.f17236k || i16 == C8157xz.f17244s || i16 == C8157xz.f17217D || i16 == C8157xz.f17218E || i16 == C8157xz.f17245t || i16 == C8157xz.f17227b || i16 == C8157xz.f17241p || i16 == C8157xz.f17230e || i16 == C8157xz.f17229d || i16 == C8157xz.f17220G || i16 == C8157xz.f17221H || i16 == C8157xz.f17222I || i16 == C8157xz.f17223J || i16 == C8157xz.f17224K || i16 == C8157xz.f17225L || i16 == C8157xz.f17226M || i16 == C8157xz.f17242q) {
                            zzkh.m24659b(zziv4.f22053h < 2147483647L);
                            zzkm zzkm3 = new zzkm((int) zziv4.f22053h);
                            zziv4.f22055j = zzkm3;
                            System.arraycopy(zziv4.f22048c.f22150a, 0, zzkm3.f22150a, 0, 8);
                            zziv4.f22050e = 1;
                        } else {
                            zziv4.f22055j = null;
                            zziv4.f22050e = 1;
                        }
                    }
                    z = true;
                }
                if (!z) {
                    return -1;
                }
                zziv3 = zziv4;
                zzie2 = zzie3;
            } else if (i14 != 1) {
                long j3 = Long.MAX_VALUE;
                int i17 = 0;
                int i18 = -1;
                while (true) {
                    a00Arr = zziv3.f22060o;
                    if (i17 >= a00Arr.length) {
                        break;
                    }
                    a00 a00 = a00Arr[i17];
                    int i19 = a00.f14313d;
                    b00 b00 = a00.f14311b;
                    if (i19 != b00.f14526a) {
                        long j4 = b00.f14527b[i19];
                        if (j4 < j3) {
                            i18 = i17;
                            j3 = j4;
                        }
                    }
                    i17++;
                }
                if (i18 == -1) {
                    return -1;
                }
                a00 a002 = a00Arr[i18];
                int i20 = a002.f14313d;
                long j5 = a002.f14311b.f14527b[i20];
                long j6 = j5;
                long position = (j5 - zzie.getPosition()) + ((long) zziv3.f22057l);
                if (position < 0) {
                    i = 1;
                    j = j6;
                } else if (position >= 262144) {
                    j = j6;
                    i = 1;
                } else {
                    zzie2.mo29368a((int) position);
                    zziv3.f22056k = a002.f14311b.f14528c[i20];
                    int i21 = a002.f14310a.f22064d;
                    if (i21 == -1) {
                        while (true) {
                            int i22 = zziv3.f22057l;
                            int i23 = zziv3.f22056k;
                            if (i22 >= i23) {
                                break;
                            }
                            int a2 = a002.f14312c.mo29372a(zzie2, i23 - i22);
                            zziv3.f22057l += a2;
                            zziv3.f22058m -= a2;
                        }
                    } else {
                        byte[] bArr = zziv3.f22047b.f22150a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i24 = 4 - i21;
                        while (zziv3.f22057l < zziv3.f22056k) {
                            int i25 = zziv3.f22058m;
                            if (i25 == 0) {
                                zzie2.readFully(zziv3.f22047b.f22150a, i24, i21);
                                zziv3.f22047b.mo29418a(0);
                                zziv3.f22058m = zziv3.f22047b.mo29429i();
                                zziv3.f22046a.mo29418a(0);
                                a002.f14312c.mo29376a(zziv3.f22046a, 4);
                                zziv3.f22057l += 4;
                                zziv3.f22056k += i24;
                            } else {
                                int a3 = a002.f14312c.mo29372a(zzie2, i25);
                                zziv3.f22057l += a3;
                                zziv3.f22058m -= a3;
                            }
                        }
                    }
                    zzip zzip = a002.f14312c;
                    b00 b002 = a002.f14311b;
                    zzip.mo26563a(b002.f14529d[i20], b002.f14530e[i20], zziv3.f22056k, 0, (byte[]) null);
                    a002.f14313d++;
                    zziv3.f22057l = 0;
                    zziv3.f22058m = 0;
                    return 0;
                }
                zzij2.f22041a = j;
                return i;
            } else {
                zziv3.f22050e = 0;
                long j7 = zziv3.f22051f;
                long j8 = zziv3.f22053h;
                int i26 = zziv3.f22054i;
                zziv3.f22051f = j7 + (j8 - ((long) i26));
                long j9 = j8 - ((long) i26);
                boolean z4 = zziv3.f22055j == null && (j8 >= 262144 || j8 > 2147483647L);
                if (z4) {
                    zzij2.f22041a = zziv3.f22051f;
                } else {
                    zzkm zzkm4 = zziv3.f22055j;
                    if (zzkm4 != null) {
                        zzie2.readFully(zzkm4.f22150a, zziv3.f22054i, (int) j9);
                        if (!zziv3.f22049d.isEmpty()) {
                            zziv3.f22049d.peek().f22043O.add(new zzis(zziv3.f22052g, zziv3.f22055j));
                        }
                    } else {
                        zzie2.mo29368a((int) j9);
                    }
                }
                while (!zziv3.f22049d.isEmpty() && zziv3.f22049d.peek().f22042N == zziv3.f22051f) {
                    zzir pop = zziv3.f22049d.pop();
                    if (pop.f17252a == C8157xz.f17235j) {
                        ArrayList arrayList2 = new ArrayList();
                        int i27 = 0;
                        while (i27 < pop.f22044P.size()) {
                            zzir zzir2 = pop.f22044P.get(i27);
                            if (zzir2.f17252a == C8157xz.f17237l && (a = C8194yz.m18575a(zzir2, pop.mo29393c(C8157xz.f17236k))) != null && ((i3 = a.f22061a) == 1936684398 || i3 == 1986618469)) {
                                zzir d = zzir2.mo29394d(C8157xz.f17238m).mo29394d(C8157xz.f17239n).mo29394d(C8157xz.f17240o);
                                zzkm zzkm5 = d.mo29393c(C8157xz.f17224K).f22045N;
                                zzis c = d.mo29393c(C8157xz.f17225L);
                                if (c == null) {
                                    c = d.mo29393c(C8157xz.f17226M);
                                }
                                zzkm zzkm6 = c.f22045N;
                                zzkm zzkm7 = d.mo29393c(C8157xz.f17223J).f22045N;
                                zzkm zzkm8 = d.mo29393c(C8157xz.f17220G).f22045N;
                                zzis c2 = d.mo29393c(C8157xz.f17221H);
                                zzkm zzkm9 = c2 != null ? c2.f22045N : null;
                                zzis c3 = d.mo29393c(C8157xz.f17222I);
                                zzkm zzkm10 = c3 != null ? c3.f22045N : null;
                                zzkm5.mo29418a(12);
                                int i28 = zzkm5.mo29429i();
                                int i29 = zzkm5.mo29429i();
                                int[] iArr = new int[i29];
                                long[] jArr = new long[i29];
                                z3 = z4;
                                long[] jArr2 = new long[i29];
                                zzir = pop;
                                int[] iArr2 = new int[i29];
                                ArrayList arrayList3 = arrayList2;
                                zzkm6.mo29418a(12);
                                int i30 = i27;
                                int i31 = zzkm6.mo29429i();
                                zzkm7.mo29418a(12);
                                int i32 = zzkm7.mo29429i() - 1;
                                zzix zzix = a;
                                if (zzkm7.mo29423c() == 1) {
                                    int i33 = zzkm7.mo29429i();
                                    zzkm7.mo29422b(4);
                                    if (i32 > 0) {
                                        i4 = zzkm7.mo29429i() - 1;
                                        i5 = 12;
                                    } else {
                                        i5 = 12;
                                        i4 = -1;
                                    }
                                    zzkm8.mo29418a(i5);
                                    int i34 = zzkm8.mo29429i() - 1;
                                    int i35 = zzkm8.mo29429i();
                                    int i36 = zzkm8.mo29429i();
                                    if (zzkm10 != null) {
                                        zzkm10.mo29418a(i5);
                                        i8 = zzkm10.mo29429i() - 1;
                                        i7 = zzkm10.mo29429i();
                                        i6 = zzkm10.mo29423c();
                                    } else {
                                        i8 = 0;
                                        i7 = 0;
                                        i6 = 0;
                                    }
                                    if (zzkm9 != null) {
                                        zzkm9.mo29418a(i5);
                                        int i37 = zzkm9.mo29429i();
                                        i10 = zzkm9.mo29429i() - 1;
                                        i9 = i37;
                                    } else {
                                        i10 = -1;
                                        i9 = 0;
                                    }
                                    int i38 = i32;
                                    if (c.f17252a == C8157xz.f17225L) {
                                        j2 = zzkm6.mo29427g();
                                    } else {
                                        j2 = zzkm6.mo29430j();
                                    }
                                    int i39 = i6;
                                    int i40 = i9;
                                    long j10 = j2;
                                    long j11 = 0;
                                    zzkm zzkm11 = zzkm6;
                                    int i41 = i4;
                                    int i42 = i8;
                                    int i43 = i10;
                                    int i44 = 0;
                                    int i45 = i35;
                                    int i46 = i7;
                                    int i47 = i33;
                                    zzkm zzkm12 = zzkm7;
                                    int i48 = i36;
                                    int i49 = i34;
                                    int i50 = i47;
                                    int i51 = 0;
                                    while (i51 < i29) {
                                        jArr2[i51] = j10;
                                        iArr[i51] = i28 == 0 ? zzkm5.mo29429i() : i28;
                                        int[] iArr3 = iArr;
                                        long[] jArr3 = jArr2;
                                        jArr[i51] = j11 + ((long) i39);
                                        iArr2[i51] = zzkm9 == null ? 1 : 0;
                                        if (i51 == i43) {
                                            iArr2[i51] = 1;
                                            i40--;
                                            if (i40 > 0) {
                                                i43 = zzkm9.mo29429i() - 1;
                                            }
                                        }
                                        j11 += (long) i48;
                                        i45--;
                                        if (i45 == 0 && i49 > 0) {
                                            i49--;
                                            i45 = zzkm8.mo29429i();
                                            i48 = zzkm8.mo29429i();
                                        }
                                        if (zzkm10 != null && i46 - 1 == 0 && i42 > 0) {
                                            i42--;
                                            i46 = zzkm10.mo29429i();
                                            i39 = zzkm10.mo29423c();
                                        }
                                        i50--;
                                        if (i50 == 0) {
                                            int i52 = i44 + 1;
                                            if (i52 < i31) {
                                                i11 = i40;
                                                if (c.f17252a == C8157xz.f17225L) {
                                                    j10 = zzkm11.mo29427g();
                                                } else {
                                                    j10 = zzkm11.mo29430j();
                                                }
                                            } else {
                                                i11 = i40;
                                            }
                                            i13 = i41;
                                            if (i52 == i13) {
                                                i47 = zzkm12.mo29429i();
                                                i12 = i39;
                                                zzkm2 = zzkm12;
                                                zzkm2.mo29422b(4);
                                                i38--;
                                                if (i38 > 0) {
                                                    i13 = zzkm2.mo29429i() - 1;
                                                }
                                            } else {
                                                i12 = i39;
                                                zzkm2 = zzkm12;
                                            }
                                            i44 = i52;
                                            zzkm = zzkm10;
                                            if (i52 < i31) {
                                                i50 = i47;
                                            }
                                        } else {
                                            i11 = i40;
                                            i12 = i39;
                                            zzkm2 = zzkm12;
                                            i13 = i41;
                                            zzkm = zzkm10;
                                            j10 += (long) iArr3[i51];
                                        }
                                        i51++;
                                        i41 = i13;
                                        i39 = i12;
                                        zzkm10 = zzkm;
                                        iArr = iArr3;
                                        i40 = i11;
                                        zzkm12 = zzkm2;
                                        jArr2 = jArr3;
                                    }
                                    int[] iArr4 = iArr;
                                    long[] jArr4 = jArr2;
                                    zzix zzix2 = zzix;
                                    zzkq.m24689a(jArr, 1000000, zzix2.f22062b);
                                    zzkh.m24657a(i40 == 0);
                                    zzkh.m24657a(i45 == 0);
                                    zzkh.m24657a(i50 == 0);
                                    zzkh.m24657a(i49 == 0);
                                    zzkh.m24657a(i42 == 0);
                                    b00 b003 = new b00(jArr4, iArr4, jArr, iArr2);
                                    if (b003.f14526a != 0) {
                                        zziv2 = this;
                                        i2 = i30;
                                        a00 a003 = new a00(zzix2, b003, zziv2.f22059n.mo29386a(i2));
                                        a003.f14312c.mo29375a(zzix2.f22063c);
                                        arrayList = arrayList3;
                                        arrayList.add(a003);
                                    } else {
                                        zziv2 = this;
                                        arrayList = arrayList3;
                                        i2 = i30;
                                    }
                                } else {
                                    throw new IllegalStateException("stsc first chunk must be 1");
                                }
                            } else {
                                zziv2 = zziv3;
                                z3 = z4;
                                zzir = pop;
                                arrayList = arrayList2;
                                i2 = i27;
                            }
                            i27 = i2 + 1;
                            zzie zzie4 = zzie;
                            arrayList2 = arrayList;
                            zziv3 = zziv2;
                            z4 = z3;
                            pop = zzir;
                            zzij zzij3 = zzij;
                        }
                        zziv = zziv3;
                        z2 = z4;
                        zziv.f22060o = (a00[]) arrayList2.toArray(new a00[0]);
                        zziv.f22059n.mo29389c();
                        zziv.f22059n.mo29388a((zzio) zziv);
                        zziv.f22050e = 2;
                    } else {
                        zziv = zziv3;
                        z2 = z4;
                        zzir zzir3 = pop;
                        if (!zziv.f22049d.isEmpty()) {
                            zziv.f22049d.peek().f22044P.add(zzir3);
                        }
                    }
                    zzie zzie5 = zzie;
                    zziv3 = zziv;
                    z4 = z2;
                    zzij zzij4 = zzij;
                }
                zziv zziv5 = zziv3;
                if (z4) {
                    return 1;
                }
                zzie2 = zzie;
                zziv3 = zziv5;
            }
        }
    }

    /* renamed from: a */
    public final long mo29366a(long j) {
        int i;
        long j2 = Long.MAX_VALUE;
        int i2 = 0;
        while (true) {
            a00[] a00Arr = this.f22060o;
            if (i2 >= a00Arr.length) {
                return j2;
            }
            b00 b00 = a00Arr[i2].f14311b;
            int a = zzkq.m24686a(b00.f14529d, j, true, false);
            while (true) {
                i = -1;
                if (a >= 0) {
                    if (b00.f14529d[a] <= j && (b00.f14530e[a] & 1) != 0) {
                        break;
                    }
                    a--;
                } else {
                    a = -1;
                    break;
                }
            }
            if (a == -1) {
                int b = zzkq.m24692b(b00.f14529d, j, true, false);
                while (true) {
                    long[] jArr = b00.f14529d;
                    if (b < jArr.length) {
                        if (jArr[b] >= j && (b00.f14530e[b] & 1) != 0) {
                            i = b;
                            break;
                        }
                        b++;
                    } else {
                        break;
                    }
                }
                a = i;
            }
            a00[] a00Arr2 = this.f22060o;
            a00Arr2[i2].f14313d = a;
            long j3 = b00.f14527b[a00Arr2[i2].f14313d];
            if (j3 < j2) {
                j2 = j3;
            }
            i2++;
        }
    }
}
