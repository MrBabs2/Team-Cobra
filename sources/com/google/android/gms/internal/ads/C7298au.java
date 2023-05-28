package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.au */
final class C7298au {
    /* renamed from: a */
    static int m16500a(byte[] bArr, int i, C7335bu buVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m16495a((int) b, bArr, i2, buVar);
        }
        buVar.f14659a = b;
        return i2;
    }

    /* renamed from: b */
    static int m16502b(byte[] bArr, int i, C7335bu buVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            buVar.f14660b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        buVar.f14660b = j2;
        return i3;
    }

    /* renamed from: c */
    static double m16504c(byte[] bArr, int i) {
        return Double.longBitsToDouble(m16503b(bArr, i));
    }

    /* renamed from: d */
    static float m16506d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m16499a(bArr, i));
    }

    /* renamed from: e */
    static int m16508e(byte[] bArr, int i, C7335bu buVar) throws zzdok {
        int a = m16500a(bArr, i, buVar);
        int i2 = buVar.f14659a;
        if (i2 < 0) {
            throw zzdok.m24048b();
        } else if (i2 > bArr.length - a) {
            throw zzdok.m24047a();
        } else if (i2 == 0) {
            buVar.f14661c = zzdmr.f21488g;
            return a;
        } else {
            buVar.f14661c = zzdmr.m23764a(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: c */
    static int m16505c(byte[] bArr, int i, C7335bu buVar) throws zzdok {
        int a = m16500a(bArr, i, buVar);
        int i2 = buVar.f14659a;
        if (i2 < 0) {
            throw zzdok.m24048b();
        } else if (i2 == 0) {
            buVar.f14661c = "";
            return a;
        } else {
            buVar.f14661c = new String(bArr, a, i2, zzdod.f21586a);
            return a + i2;
        }
    }

    /* renamed from: d */
    static int m16507d(byte[] bArr, int i, C7335bu buVar) throws zzdok {
        int a = m16500a(bArr, i, buVar);
        int i2 = buVar.f14659a;
        if (i2 < 0) {
            throw zzdok.m24048b();
        } else if (i2 == 0) {
            buVar.f14661c = "";
            return a;
        } else {
            buVar.f14661c = C7711lx.m17534c(bArr, a, i2);
            return a + i2;
        }
    }

    /* renamed from: a */
    static int m16495a(int i, byte[] bArr, int i2, C7335bu buVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            buVar.f14659a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            buVar.f14659a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            buVar.f14659a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            buVar.f14659a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                buVar.f14659a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* renamed from: b */
    static long m16503b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: a */
    static int m16499a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m16498a(com.google.android.gms.internal.ads.C7784nw r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.C7335bu r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m16495a((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.ads.C7335bu) r10)
            int r8 = r10.f14659a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo25744a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo25748a(r1, r2, r3, r4, r5)
            r6.mo25749b(r9)
            r10.f14661c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzdok r6 = com.google.android.gms.internal.ads.zzdok.m24047a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7298au.m16498a(com.google.android.gms.internal.ads.nw, byte[], int, int, com.google.android.gms.internal.ads.bu):int");
    }

    /* renamed from: a */
    static int m16497a(C7784nw nwVar, byte[] bArr, int i, int i2, int i3, C7335bu buVar) throws IOException {
        C7337bw bwVar = (C7337bw) nwVar;
        Object a = bwVar.mo25744a();
        int a2 = bwVar.mo25743a(a, bArr, i, i2, i3, buVar);
        bwVar.mo25749b(a);
        buVar.f14661c = a;
        return a2;
    }

    /* renamed from: a */
    static int m16493a(int i, byte[] bArr, int i2, int i3, zzdoj<?> zzdoj, C7335bu buVar) {
        C7557hv hvVar = (C7557hv) zzdoj;
        int a = m16500a(bArr, i2, buVar);
        hvVar.mo26051f(buVar.f14659a);
        while (a < i3) {
            int a2 = m16500a(bArr, a, buVar);
            if (i != buVar.f14659a) {
                break;
            }
            a = m16500a(bArr, a2, buVar);
            hvVar.mo26051f(buVar.f14659a);
        }
        return a;
    }

    /* renamed from: a */
    static int m16501a(byte[] bArr, int i, zzdoj<?> zzdoj, C7335bu buVar) throws IOException {
        C7557hv hvVar = (C7557hv) zzdoj;
        int a = m16500a(bArr, i, buVar);
        int i2 = buVar.f14659a + a;
        while (a < i2) {
            a = m16500a(bArr, a, buVar);
            hvVar.mo26051f(buVar.f14659a);
        }
        if (a == i2) {
            return a;
        }
        throw zzdok.m24047a();
    }

    /* renamed from: a */
    static int m16496a(C7784nw<?> nwVar, int i, byte[] bArr, int i2, int i3, zzdoj<?> zzdoj, C7335bu buVar) throws IOException {
        int a = m16498a((C7784nw) nwVar, bArr, i2, i3, buVar);
        zzdoj.add(buVar.f14661c);
        while (a < i3) {
            int a2 = m16500a(bArr, a, buVar);
            if (i != buVar.f14659a) {
                break;
            }
            a = m16498a((C7784nw) nwVar, bArr, a2, i3, buVar);
            zzdoj.add(buVar.f14661c);
        }
        return a;
    }

    /* renamed from: a */
    static int m16494a(int i, byte[] bArr, int i2, int i3, zzdqu zzdqu, C7335bu buVar) throws zzdok {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = m16502b(bArr, i2, buVar);
                zzdqu.mo29175a(i, (Object) Long.valueOf(buVar.f14660b));
                return b;
            } else if (i4 == 1) {
                zzdqu.mo29175a(i, (Object) Long.valueOf(m16503b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = m16500a(bArr, i2, buVar);
                int i5 = buVar.f14659a;
                if (i5 < 0) {
                    throw zzdok.m24048b();
                } else if (i5 <= bArr.length - a) {
                    if (i5 == 0) {
                        zzdqu.mo29175a(i, (Object) zzdmr.f21488g);
                    } else {
                        zzdqu.mo29175a(i, (Object) zzdmr.m23764a(bArr, a, i5));
                    }
                    return a + i5;
                } else {
                    throw zzdok.m24047a();
                }
            } else if (i4 == 3) {
                zzdqu e = zzdqu.m24096e();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = m16500a(bArr, i2, buVar);
                    int i8 = buVar.f14659a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = m16494a(i7, bArr, a2, i3, e, buVar);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzdok.m24053g();
                }
                zzdqu.mo29175a(i, (Object) e);
                return i2;
            } else if (i4 == 5) {
                zzdqu.mo29175a(i, (Object) Integer.valueOf(m16499a(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzdok.m24050d();
            }
        } else {
            throw zzdok.m24050d();
        }
    }

    /* renamed from: a */
    static int m16492a(int i, byte[] bArr, int i2, int i3, C7335bu buVar) throws zzdok {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m16502b(bArr, i2, buVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m16500a(bArr, i2, buVar) + buVar.f14659a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m16500a(bArr, i2, buVar);
                    i6 = buVar.f14659a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m16492a(i6, bArr, i2, i3, buVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzdok.m24053g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzdok.m24050d();
            }
        } else {
            throw zzdok.m24050d();
        }
    }
}
