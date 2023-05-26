package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zzjg implements zzid {

    /* renamed from: A */
    private int f22065A;

    /* renamed from: B */
    private int f22066B;

    /* renamed from: C */
    private long f22067C;

    /* renamed from: D */
    private boolean f22068D;

    /* renamed from: E */
    private boolean f22069E;

    /* renamed from: F */
    private zzif f22070F;

    /* renamed from: a */
    private final g00 f22071a;

    /* renamed from: b */
    private final i00 f22072b;

    /* renamed from: c */
    private final zzkm f22073c;

    /* renamed from: d */
    private final zzkm f22074d;

    /* renamed from: e */
    private final zzkm f22075e;

    /* renamed from: f */
    private long f22076f;

    /* renamed from: g */
    private long f22077g;

    /* renamed from: h */
    private long f22078h;

    /* renamed from: i */
    private long f22079i;

    /* renamed from: j */
    private l00 f22080j;

    /* renamed from: k */
    private l00 f22081k;

    /* renamed from: l */
    private l00 f22082l;

    /* renamed from: m */
    private boolean f22083m;

    /* renamed from: n */
    private int f22084n;

    /* renamed from: o */
    private long f22085o;

    /* renamed from: p */
    private boolean f22086p;

    /* renamed from: q */
    private long f22087q;

    /* renamed from: r */
    private long f22088r;

    /* renamed from: s */
    private int f22089s;

    /* renamed from: t */
    private long f22090t;

    /* renamed from: u */
    private zzkk f22091u;

    /* renamed from: v */
    private zzkk f22092v;

    /* renamed from: w */
    private boolean f22093w;

    /* renamed from: x */
    private int f22094x;

    /* renamed from: y */
    private int f22095y;

    /* renamed from: z */
    private int f22096z;

    public zzjg() {
        this(new d00());
    }

    /* renamed from: b */
    private final ArrayList<byte[]> m24610b() throws zzhl {
        try {
            byte[] bArr = this.f22081k.f16040j;
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + bArr[i];
                int i5 = 0;
                while (bArr[i3] == -1) {
                    i5 += 255;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + bArr[i3];
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            byte[] bArr3 = new byte[(bArr.length - i9)];
                            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                            ArrayList<byte[]> arrayList = new ArrayList<>(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzhl("Error parsing vorbis codec private");
                    }
                    throw new zzhl("Error parsing vorbis codec private");
                }
                throw new zzhl("Error parsing vorbis codec private");
            }
            throw new zzhl("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhl("Error parsing vorbis codec private");
        }
    }

    /* renamed from: a */
    public final void mo29385a(zzif zzif) {
        this.f22070F = zzif;
    }

    private zzjg(g00 g00) {
        this.f22076f = -1;
        this.f22077g = -1;
        this.f22078h = 1000000;
        this.f22079i = -1;
        this.f22087q = -1;
        this.f22088r = -1;
        this.f22089s = 0;
        this.f22090t = -1;
        this.f22071a = g00;
        g00.mo25803a((h00) new k00(this));
        this.f22072b = new i00();
        this.f22073c = new zzkm(4);
        this.f22074d = new zzkm(ByteBuffer.allocate(4).putInt(-1).array());
        this.f22075e = new zzkm(4);
    }

    /* renamed from: a */
    public final void mo29384a() {
        this.f22090t = -1;
        this.f22095y = 0;
        this.f22071a.mo25802a();
        this.f22072b.mo26063a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29383a(com.google.android.gms.internal.ads.zzie r9, com.google.android.gms.internal.ads.zzij r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f22068D = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003d
            boolean r3 = r8.f22068D
            if (r3 != 0) goto L_0x003d
            com.google.android.gms.internal.ads.g00 r2 = r8.f22071a
            boolean r2 = r2.mo25804a((com.google.android.gms.internal.ads.zzie) r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.f22086p
            if (r5 == 0) goto L_0x0027
            r8.f22088r = r3
            long r3 = r8.f22087q
            r10.f22041a = r3
            r8.f22089s = r1
            r8.f22086p = r0
        L_0x0025:
            r3 = 1
            goto L_0x003a
        L_0x0027:
            int r3 = r8.f22089s
            r4 = 2
            if (r3 != r4) goto L_0x0039
            long r3 = r8.f22088r
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0039
            r10.f22041a = r3
            r8.f22088r = r5
            goto L_0x0025
        L_0x0039:
            r3 = 0
        L_0x003a:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003d:
            if (r2 == 0) goto L_0x0040
            return r0
        L_0x0040:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.mo29383a(com.google.android.gms.internal.ads.zzie, com.google.android.gms.internal.ads.zzij):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29399a(int i, long j, long j2) throws zzhl {
        if (i == 160) {
            this.f22069E = false;
        } else if (i == 174) {
            this.f22080j = new l00();
        } else if (i == 187) {
            this.f22093w = false;
        } else if (i == 19899) {
            this.f22084n = -1;
            this.f22085o = -1;
        } else if (i == 20533) {
            this.f22080j.f16034d = true;
        } else if (i != 408125543) {
            if (i == 475249515) {
                this.f22091u = new zzkk();
                this.f22092v = new zzkk();
            } else if (i == 524531317 && this.f22089s == 0 && this.f22087q != -1) {
                this.f22086p = true;
            }
        } else if (this.f22076f == -1) {
            this.f22076f = j;
            this.f22077g = j2;
        } else {
            throw new zzhl("Multiple Segment elements not supported");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29395a(int i) throws zzhl {
        int i2;
        zzhj zzhj;
        zzhj zzhj2;
        if (i != 160) {
            if (i == 174) {
                l00 l00 = this.f22080j;
                if (l00.f16032b == -1 || (i2 = l00.f16033c) == -1) {
                    throw new zzhl("Mandatory element TrackNumber or TrackType not found");
                } else if ((i2 != 2 || this.f22081k == null) && (this.f22080j.f16033c != 1 || this.f22082l == null)) {
                    l00 l002 = this.f22080j;
                    if (l002.f16033c != 2 || !m24609a(l002.f16031a)) {
                        l00 l003 = this.f22080j;
                        if (l003.f16033c == 1 && m24609a(l003.f16031a)) {
                            l00 l004 = this.f22080j;
                            this.f22082l = l004;
                            l004.f16043m = this.f22070F.mo29386a(l004.f16032b);
                            l00 l005 = this.f22082l;
                            zzip zzip = l005.f16043m;
                            if (l005 == null || !"V_VP8".equals(l005.f16031a)) {
                                l00 l006 = this.f22082l;
                                if (l006 == null || !"V_VP9".equals(l006.f16031a)) {
                                    throw new zzhl("Unable to build format");
                                }
                                long j = this.f22079i;
                                l00 l007 = this.f22082l;
                                zzhj = zzhj.m24479a("video/x-vnd.on2.vp9", -1, j, l007.f16036f, l007.f16037g, (List<byte[]>) null);
                            } else {
                                long j2 = this.f22079i;
                                l00 l008 = this.f22082l;
                                zzhj = zzhj.m24479a("video/x-vnd.on2.vp8", -1, j2, l008.f16036f, l008.f16037g, (List<byte[]>) null);
                            }
                            zzip.mo29375a(zzhj);
                        }
                    } else {
                        l00 l009 = this.f22080j;
                        this.f22081k = l009;
                        l009.f16043m = this.f22070F.mo29386a(l009.f16032b);
                        l00 l0010 = this.f22081k;
                        zzip zzip2 = l0010.f16043m;
                        if (l0010 == null || !"A_VORBIS".equals(l0010.f16031a)) {
                            l00 l0011 = this.f22081k;
                            if (l0011 == null || !"A_OPUS".equals(l0011.f16031a)) {
                                throw new zzhl("Unable to build format");
                            }
                            ArrayList arrayList = new ArrayList(3);
                            arrayList.add(this.f22081k.f16040j);
                            arrayList.add(ByteBuffer.allocate(64).putLong(this.f22081k.f16041k).array());
                            arrayList.add(ByteBuffer.allocate(64).putLong(this.f22081k.f16042l).array());
                            long j3 = this.f22079i;
                            l00 l0012 = this.f22081k;
                            zzhj2 = zzhj.m24482b("audio/opus", 5760, j3, l0012.f16038h, l0012.f16039i, arrayList);
                        } else {
                            long j4 = this.f22079i;
                            l00 l0013 = this.f22081k;
                            zzhj2 = zzhj.m24482b("audio/vorbis", 8192, j4, l0013.f16038h, l0013.f16039i, m24610b());
                        }
                        zzip2.mo29375a(zzhj2);
                    }
                    this.f22080j = null;
                } else {
                    this.f22080j = null;
                }
            } else if (i == 19899) {
                int i3 = this.f22084n;
                if (i3 != -1) {
                    long j5 = this.f22085o;
                    if (j5 != -1) {
                        if (i3 == 475249515) {
                            this.f22087q = j5;
                            return;
                        }
                        return;
                    }
                }
                throw new zzhl("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                l00 l0014 = this.f22080j;
                if (l0014.f16034d) {
                    byte[] bArr = l0014.f16035e;
                    if (bArr == null) {
                        throw new zzhl("Encrypted Track found but ContentEncKeyID was not found");
                    } else if (!this.f22083m) {
                        this.f22070F.mo29387a((zzhw) new zzhy("video/webm", bArr));
                        this.f22083m = true;
                    }
                } else {
                    throw new zzhl("Found an unsupported ContentEncoding");
                }
            } else if (i != 374648427) {
                if (i == 475249515 && this.f22089s != 2) {
                    zzif zzif = this.f22070F;
                    if (this.f22076f == -1) {
                        throw new zzhl("Segment start/end offsets unknown");
                    } else if (this.f22079i != -1) {
                        zzkk zzkk = this.f22091u;
                        if (zzkk == null || this.f22092v == null || zzkk.mo29414a() == 0 || this.f22091u.mo29414a() != this.f22092v.mo29414a()) {
                            throw new zzhl("Invalid/missing cue points");
                        }
                        int a = this.f22091u.mo29414a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        int i4 = 0;
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f22091u.mo29415a(i5);
                            jArr[i5] = this.f22076f + this.f22092v.mo29415a(i5);
                        }
                        while (true) {
                            int i6 = a - 1;
                            if (i4 < i6) {
                                int i7 = i4 + 1;
                                iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                                jArr2[i4] = jArr3[i7] - jArr3[i4];
                                i4 = i7;
                            } else {
                                iArr[i6] = (int) ((this.f22076f + this.f22077g) - jArr[i6]);
                                jArr2[i6] = this.f22079i - jArr3[i6];
                                this.f22091u = null;
                                this.f22092v = null;
                                zzif.mo29388a((zzio) new zzia(iArr, jArr, jArr2, jArr3));
                                this.f22089s = 2;
                                return;
                            }
                        }
                    } else {
                        throw new zzhl("Duration unknown");
                    }
                }
            } else if (this.f22082l == null && this.f22081k == null) {
                throw new zzhl("No valid tracks were found");
            } else {
                this.f22070F.mo29389c();
            }
        } else if (this.f22095y == 2) {
            if (!this.f22069E) {
                this.f22066B |= 1;
            }
            l00 l0015 = this.f22081k;
            if (l0015 == null || this.f22065A != l0015.f16032b) {
                l0015 = this.f22082l;
            }
            m24608a(l0015.f16043m);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29398a(int i, long j) throws zzhl {
        switch (i) {
            case 131:
                this.f22080j.f16033c = (int) j;
                return;
            case 159:
                this.f22080j.f16038h = (int) j;
                return;
            case 176:
                this.f22080j.f16036f = (int) j;
                return;
            case 179:
                this.f22091u.mo29416a(m24607a(j));
                return;
            case 186:
                this.f22080j.f16037g = (int) j;
                return;
            case 215:
                this.f22080j.f16032b = (int) j;
                return;
            case 231:
                this.f22090t = m24607a(j);
                return;
            case 241:
                if (!this.f22093w) {
                    this.f22092v.mo29416a(j);
                    this.f22093w = true;
                    return;
                }
                return;
            case 251:
                this.f22069E = true;
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("DocTypeReadVersion ");
                    sb.append(j);
                    sb.append(" not supported");
                    throw new zzhl(sb.toString());
                }
                return;
            case 17143:
                if (j != 1) {
                    StringBuilder sb2 = new StringBuilder(50);
                    sb2.append("EBMLReadVersion ");
                    sb2.append(j);
                    sb2.append(" not supported");
                    throw new zzhl(sb2.toString());
                }
                return;
            case 18401:
                if (j != 5) {
                    StringBuilder sb3 = new StringBuilder(49);
                    sb3.append("ContentEncAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzhl(sb3.toString());
                }
                return;
            case 18408:
                if (j != 1) {
                    StringBuilder sb4 = new StringBuilder(56);
                    sb4.append("AESSettingsCipherMode ");
                    sb4.append(j);
                    sb4.append(" not supported");
                    throw new zzhl(sb4.toString());
                }
                return;
            case 20529:
                if (j != 0) {
                    StringBuilder sb5 = new StringBuilder(55);
                    sb5.append("ContentEncodingOrder ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzhl(sb5.toString());
                }
                return;
            case 20530:
                if (j != 1) {
                    StringBuilder sb6 = new StringBuilder(55);
                    sb6.append("ContentEncodingScope ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzhl(sb6.toString());
                }
                return;
            case 20531:
                if (j != 1) {
                    StringBuilder sb7 = new StringBuilder(54);
                    sb7.append("ContentEncodingType ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzhl(sb7.toString());
                }
                return;
            case 21420:
                this.f22085o = j + this.f22076f;
                return;
            case 22186:
                this.f22080j.f16041k = j;
                return;
            case 22203:
                this.f22080j.f16042l = j;
                return;
            case 2807729:
                this.f22078h = j;
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29396a(int i, double d) {
        if (i == 181) {
            this.f22080j.f16039i = (int) d;
        } else if (i == 17545) {
            this.f22079i = m24607a((long) d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29400a(int i, String str) throws zzhl {
        if (i == 134) {
            this.f22080j.f16031a = str;
        } else if (i == 17026 && !"webm".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzhl(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0141  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29397a(int r17, int r18, com.google.android.gms.internal.ads.zzie r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            if (r1 == r4) goto L_0x0069
            if (r1 == r5) goto L_0x0069
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x005f
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0041
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 != r4) goto L_0x0028
            com.google.android.gms.internal.ads.l00 r1 = r0.f22080j
            byte[] r4 = new byte[r2]
            r1.f16040j = r4
            r3.readFully(r4, r7, r2)
            return
        L_0x0028:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0041:
            com.google.android.gms.internal.ads.zzkm r1 = r0.f22075e
            byte[] r1 = r1.f22150a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.zzkm r1 = r0.f22075e
            byte[] r1 = r1.f22150a
            int r6 = r6 - r2
            r3.readFully(r1, r6, r2)
            com.google.android.gms.internal.ads.zzkm r1 = r0.f22075e
            r1.mo29418a(r7)
            com.google.android.gms.internal.ads.zzkm r1 = r0.f22075e
            long r1 = r1.mo29427g()
            int r2 = (int) r1
            r0.f22084n = r2
            return
        L_0x005f:
            com.google.android.gms.internal.ads.l00 r1 = r0.f22080j
            byte[] r4 = new byte[r2]
            r1.f16035e = r4
            r3.readFully(r4, r7, r2)
            return
        L_0x0069:
            int r4 = r0.f22095y
            r8 = 1
            if (r4 != 0) goto L_0x0081
            com.google.android.gms.internal.ads.i00 r4 = r0.f22072b
            long r9 = r4.mo26062a(r3, r7, r8)
            int r4 = (int) r9
            r0.f22065A = r4
            com.google.android.gms.internal.ads.i00 r4 = r0.f22072b
            int r4 = r4.mo26064b()
            r0.f22094x = r4
            r0.f22095y = r8
        L_0x0081:
            com.google.android.gms.internal.ads.l00 r4 = r0.f22081k
            if (r4 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.l00 r9 = r0.f22082l
            if (r9 == 0) goto L_0x0093
            int r4 = r4.f16032b
            int r10 = r0.f22065A
            if (r4 == r10) goto L_0x0093
            int r4 = r9.f16032b
            if (r4 != r10) goto L_0x00af
        L_0x0093:
            com.google.android.gms.internal.ads.l00 r4 = r0.f22081k
            if (r4 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.l00 r9 = r0.f22082l
            if (r9 != 0) goto L_0x00a1
            int r4 = r4.f16032b
            int r9 = r0.f22065A
            if (r4 != r9) goto L_0x00af
        L_0x00a1:
            com.google.android.gms.internal.ads.l00 r4 = r0.f22081k
            if (r4 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.l00 r4 = r0.f22082l
            if (r4 == 0) goto L_0x00b9
            int r4 = r4.f16032b
            int r9 = r0.f22065A
            if (r4 == r9) goto L_0x00b9
        L_0x00af:
            int r1 = r0.f22094x
            int r1 = r2 - r1
            r3.mo29368a(r1)
            r0.f22095y = r7
            return
        L_0x00b9:
            com.google.android.gms.internal.ads.l00 r4 = r0.f22081k
            if (r4 == 0) goto L_0x00c4
            int r9 = r0.f22065A
            int r10 = r4.f16032b
            if (r9 != r10) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            com.google.android.gms.internal.ads.l00 r4 = r0.f22082l
        L_0x00c6:
            com.google.android.gms.internal.ads.zzip r9 = r4.f16043m
            int r10 = r0.f22095y
            if (r10 != r8) goto L_0x0171
            com.google.android.gms.internal.ads.zzkm r10 = r0.f22073c
            byte[] r10 = r10.f22150a
            boolean r11 = r4.f16034d
            r12 = 3
            if (r11 == 0) goto L_0x00d7
            r11 = 4
            goto L_0x00d8
        L_0x00d7:
            r11 = 3
        L_0x00d8:
            r3.readFully(r10, r7, r11)
            int r13 = r0.f22094x
            int r13 = r13 + r11
            r0.f22094x = r13
            byte r11 = r10[r7]
            r13 = 8
            int r11 = r11 << r13
            byte r14 = r10[r8]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r11 = r11 | r14
            long r14 = r0.f22090t
            long r6 = (long) r11
            long r6 = r0.m24607a((long) r6)
            long r14 = r14 + r6
            r0.f22067C = r14
            r6 = 2
            byte r7 = r10[r6]
            r7 = r7 & 6
            int r7 = r7 >> r8
            if (r7 != 0) goto L_0x0158
            byte r7 = r10[r6]
            r7 = r7 & r13
            if (r7 != r13) goto L_0x0103
            r7 = 1
            goto L_0x0104
        L_0x0103:
            r7 = 0
        L_0x0104:
            r11 = 128(0x80, float:1.794E-43)
            if (r1 != r5) goto L_0x010f
            byte r14 = r10[r6]
            r14 = r14 & r11
            if (r14 != r11) goto L_0x010f
            r14 = 1
            goto L_0x0110
        L_0x010f:
            r14 = 0
        L_0x0110:
            boolean r15 = r4.f16034d
            if (r15 == 0) goto L_0x0120
            byte r15 = r10[r12]
            r15 = r15 & r11
            if (r15 == r11) goto L_0x0122
            byte r10 = r10[r12]
            r10 = r10 & r8
            if (r10 != r8) goto L_0x0120
            r10 = 1
            goto L_0x012a
        L_0x0120:
            r10 = 0
            goto L_0x012a
        L_0x0122:
            com.google.android.gms.internal.ads.zzhl r1 = new com.google.android.gms.internal.ads.zzhl
            java.lang.String r2 = "Extension bit is set in signal byte"
            r1.<init>(r2)
            throw r1
        L_0x012a:
            if (r7 == 0) goto L_0x012f
            r7 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x0130
        L_0x012f:
            r7 = 0
        L_0x0130:
            r7 = r7 | r14
            if (r10 == 0) goto L_0x0135
            r11 = 2
            goto L_0x0136
        L_0x0135:
            r11 = 0
        L_0x0136:
            r7 = r7 | r11
            r0.f22066B = r7
            int r7 = r0.f22094x
            int r7 = r2 - r7
            r0.f22096z = r7
            if (r10 == 0) goto L_0x0155
            com.google.android.gms.internal.ads.zzkm r7 = r0.f22073c
            byte[] r10 = r7.f22150a
            r11 = 0
            r10[r11] = r13
            r7.mo29418a(r11)
            com.google.android.gms.internal.ads.zzkm r7 = r0.f22073c
            r9.mo29376a((com.google.android.gms.internal.ads.zzkm) r7, (int) r8)
            int r7 = r0.f22096z
            int r7 = r7 + r8
            r0.f22096z = r7
        L_0x0155:
            r0.f22095y = r6
            goto L_0x0171
        L_0x0158:
            com.google.android.gms.internal.ads.zzhl r1 = new com.google.android.gms.internal.ads.zzhl
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 38
            r2.<init>(r3)
            java.lang.String r3 = "Lacing mode not supported: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0171:
            int r6 = r0.f22094x
            if (r6 >= r2) goto L_0x017f
            int r7 = r2 - r6
            int r7 = r9.mo29372a((com.google.android.gms.internal.ads.zzie) r3, (int) r7)
            int r6 = r6 + r7
            r0.f22094x = r6
            goto L_0x0171
        L_0x017f:
            java.lang.String r2 = r4.f16031a
            java.lang.String r3 = "A_VORBIS"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x019a
            com.google.android.gms.internal.ads.zzkm r2 = r0.f22074d
            r3 = 0
            r2.mo29418a(r3)
            com.google.android.gms.internal.ads.zzkm r2 = r0.f22074d
            r3 = 4
            r9.mo29376a((com.google.android.gms.internal.ads.zzkm) r2, (int) r3)
            int r2 = r0.f22096z
            int r2 = r2 + r3
            r0.f22096z = r2
        L_0x019a:
            if (r1 != r5) goto L_0x019f
            r0.m24608a((com.google.android.gms.internal.ads.zzip) r9)
        L_0x019f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjg.mo29397a(int, int, com.google.android.gms.internal.ads.zzie):void");
    }

    /* renamed from: a */
    private final void m24608a(zzip zzip) {
        zzip.mo26563a(this.f22067C, this.f22066B, this.f22096z, 0, (byte[]) null);
        this.f22095y = 0;
        this.f22068D = true;
    }

    /* renamed from: a */
    private final long m24607a(long j) {
        return TimeUnit.NANOSECONDS.toMicros(j * this.f22078h);
    }

    /* renamed from: a */
    private static boolean m24609a(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str);
    }
}
