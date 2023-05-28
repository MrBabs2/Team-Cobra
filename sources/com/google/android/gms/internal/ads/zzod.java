package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzne;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public final class zzod implements zznn {

    /* renamed from: Z */
    private static final byte[] f22361Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    private static final byte[] f22362a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final UUID f22363b0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    private long f22364A;

    /* renamed from: B */
    private zzsn f22365B;

    /* renamed from: C */
    private zzsn f22366C;

    /* renamed from: D */
    private boolean f22367D;

    /* renamed from: E */
    private int f22368E;

    /* renamed from: F */
    private long f22369F;

    /* renamed from: G */
    private long f22370G;

    /* renamed from: H */
    private int f22371H;

    /* renamed from: I */
    private int f22372I;

    /* renamed from: J */
    private int[] f22373J;

    /* renamed from: K */
    private int f22374K;

    /* renamed from: L */
    private int f22375L;

    /* renamed from: M */
    private int f22376M;

    /* renamed from: N */
    private int f22377N;

    /* renamed from: O */
    private boolean f22378O;

    /* renamed from: P */
    private boolean f22379P;

    /* renamed from: Q */
    private boolean f22380Q;

    /* renamed from: R */
    private boolean f22381R;

    /* renamed from: S */
    private byte f22382S;

    /* renamed from: T */
    private int f22383T;

    /* renamed from: U */
    private int f22384U;

    /* renamed from: V */
    private int f22385V;

    /* renamed from: W */
    private boolean f22386W;

    /* renamed from: X */
    private boolean f22387X;

    /* renamed from: Y */
    private zznp f22388Y;

    /* renamed from: a */
    private final t10 f22389a;

    /* renamed from: b */
    private final z10 f22390b;

    /* renamed from: c */
    private final SparseArray<x10> f22391c;

    /* renamed from: d */
    private final boolean f22392d;

    /* renamed from: e */
    private final zzst f22393e;

    /* renamed from: f */
    private final zzst f22394f;

    /* renamed from: g */
    private final zzst f22395g;

    /* renamed from: h */
    private final zzst f22396h;

    /* renamed from: i */
    private final zzst f22397i;

    /* renamed from: j */
    private final zzst f22398j;

    /* renamed from: k */
    private final zzst f22399k;

    /* renamed from: l */
    private final zzst f22400l;

    /* renamed from: m */
    private final zzst f22401m;

    /* renamed from: n */
    private ByteBuffer f22402n;

    /* renamed from: o */
    private long f22403o;

    /* renamed from: p */
    private long f22404p;

    /* renamed from: q */
    private long f22405q;

    /* renamed from: r */
    private long f22406r;

    /* renamed from: s */
    private long f22407s;

    /* renamed from: t */
    private x10 f22408t;

    /* renamed from: u */
    private boolean f22409u;

    /* renamed from: v */
    private int f22410v;

    /* renamed from: w */
    private long f22411w;

    /* renamed from: x */
    private boolean f22412x;

    /* renamed from: y */
    private long f22413y;

    /* renamed from: z */
    private long f22414z;

    static {
        new v10();
    }

    public zzod() {
        this(0);
    }

    /* renamed from: b */
    private final void m24975b() {
        this.f22377N = 0;
        this.f22385V = 0;
        this.f22384U = 0;
        this.f22378O = false;
        this.f22379P = false;
        this.f22381R = false;
        this.f22383T = 0;
        this.f22382S = 0;
        this.f22380Q = false;
        this.f22398j.mo29737i();
    }

    /* renamed from: b */
    static boolean m24976b(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    /* renamed from: c */
    static int m24977c(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public final void mo29583a() {
    }

    /* renamed from: a */
    public final boolean mo29586a(zzno zzno) throws IOException, InterruptedException {
        return new y10().mo26793a(zzno);
    }

    private zzod(int i) {
        this(new q10(), 0);
    }

    /* renamed from: a */
    public final void mo29585a(zznp zznp) {
        this.f22388Y = zznp;
    }

    private zzod(t10 t10, int i) {
        this.f22404p = -1;
        this.f22405q = -9223372036854775807L;
        this.f22406r = -9223372036854775807L;
        this.f22407s = -9223372036854775807L;
        this.f22413y = -1;
        this.f22414z = -1;
        this.f22364A = -9223372036854775807L;
        this.f22389a = t10;
        t10.mo26459a((u10) new w10(this, (v10) null));
        this.f22392d = true;
        this.f22390b = new z10();
        this.f22391c = new SparseArray<>();
        this.f22395g = new zzst(4);
        this.f22396h = new zzst(ByteBuffer.allocate(4).putInt(-1).array());
        this.f22397i = new zzst(4);
        this.f22393e = new zzst(zzsq.f22651a);
        this.f22394f = new zzst(4);
        this.f22398j = new zzst();
        this.f22399k = new zzst();
        this.f22400l = new zzst(8);
        this.f22401m = new zzst();
    }

    /* renamed from: a */
    public final void mo29584a(long j, long j2) {
        this.f22364A = -9223372036854775807L;
        this.f22368E = 0;
        this.f22389a.mo26458a();
        this.f22390b.mo26860a();
        m24975b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0005 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29582a(com.google.android.gms.internal.ads.zzno r9, com.google.android.gms.internal.ads.zznt r10) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            r0 = 0
            r8.f22386W = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r8.f22386W
            if (r3 != 0) goto L_0x003a
            com.google.android.gms.internal.ads.t10 r2 = r8.f22389a
            boolean r2 = r2.mo26460a((com.google.android.gms.internal.ads.zzno) r9)
            if (r2 == 0) goto L_0x0005
            long r3 = r9.getPosition()
            boolean r5 = r8.f22412x
            if (r5 == 0) goto L_0x0025
            r8.f22414z = r3
            long r3 = r8.f22413y
            r10.f22357a = r3
            r8.f22412x = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r8.f22409u
            if (r3 == 0) goto L_0x0036
            long r3 = r8.f22414z
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r10.f22357a = r3
            r8.f22414z = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            return r0
        L_0x003d:
            r9 = -1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.mo29582a(com.google.android.gms.internal.ads.zzno, com.google.android.gms.internal.ads.zznt):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29599a(int i, long j, long j2) throws zzlm {
        if (i == 160) {
            this.f22387X = false;
        } else if (i == 174) {
            this.f22408t = new x10((v10) null);
        } else if (i == 187) {
            this.f22367D = false;
        } else if (i == 19899) {
            this.f22410v = -1;
            this.f22411w = -1;
        } else if (i == 20533) {
            this.f22408t.f17137e = true;
        } else if (i == 21968) {
            this.f22408t.f17149q = true;
        } else if (i == 408125543) {
            long j3 = this.f22404p;
            if (j3 == -1 || j3 == j) {
                this.f22404p = j;
                this.f22403o = j2;
                return;
            }
            throw new zzlm("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f22365B = new zzsn();
            this.f22366C = new zzsn();
        } else if (i != 524531317 || this.f22409u) {
        } else {
            if (!this.f22392d || this.f22413y == -1) {
                this.f22388Y.mo26866a(new zznv(this.f22407s));
                this.f22409u = true;
                return;
            }
            this.f22412x = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29595a(int i) throws zzlm {
        zznu zznu;
        zzsn zzsn;
        zzsn zzsn2;
        int i2;
        int i3 = 0;
        if (i != 160) {
            if (i == 174) {
                String str = this.f22408t.f17133a;
                if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                    i3 = 1;
                }
                if (i3 != 0) {
                    x10 x10 = this.f22408t;
                    x10.mo26755a(this.f22388Y, x10.f17134b);
                    SparseArray<x10> sparseArray = this.f22391c;
                    x10 x102 = this.f22408t;
                    sparseArray.put(x102.f17134b, x102);
                }
                this.f22408t = null;
            } else if (i == 19899) {
                int i4 = this.f22410v;
                if (i4 != -1) {
                    long j = this.f22411w;
                    if (j != -1) {
                        if (i4 == 475249515) {
                            this.f22413y = j;
                            return;
                        }
                        return;
                    }
                }
                throw new zzlm("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                x10 x103 = this.f22408t;
                if (!x103.f17137e) {
                    return;
                }
                if (x103.f17139g != null) {
                    x103.f17141i = new zzne(new zzne.zza(zzkt.f22164b, "video/webm", this.f22408t.f17139g.f22360b));
                    return;
                }
                throw new zzlm("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                x10 x104 = this.f22408t;
                if (x104.f17137e && x104.f17138f != null) {
                    throw new zzlm("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f22405q == -9223372036854775807L) {
                    this.f22405q = 1000000;
                }
                long j2 = this.f22406r;
                if (j2 != -9223372036854775807L) {
                    this.f22407s = m24970a(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f22409u) {
                    zznp zznp = this.f22388Y;
                    if (this.f22404p == -1 || this.f22407s == -9223372036854775807L || (zzsn = this.f22365B) == null || zzsn.mo29718a() == 0 || (zzsn2 = this.f22366C) == null || zzsn2.mo29718a() != this.f22365B.mo29718a()) {
                        this.f22365B = null;
                        this.f22366C = null;
                        zznu = new zznv(this.f22407s);
                    } else {
                        int a = this.f22365B.mo29718a();
                        int[] iArr = new int[a];
                        long[] jArr = new long[a];
                        long[] jArr2 = new long[a];
                        long[] jArr3 = new long[a];
                        for (int i5 = 0; i5 < a; i5++) {
                            jArr3[i5] = this.f22365B.mo29719a(i5);
                            jArr[i5] = this.f22404p + this.f22366C.mo29719a(i5);
                        }
                        while (true) {
                            i2 = a - 1;
                            if (i3 >= i2) {
                                break;
                            }
                            int i6 = i3 + 1;
                            iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                            jArr2[i3] = jArr3[i6] - jArr3[i3];
                            i3 = i6;
                        }
                        iArr[i2] = (int) ((this.f22404p + this.f22403o) - jArr[i2]);
                        jArr2[i2] = this.f22407s - jArr3[i2];
                        this.f22365B = null;
                        this.f22366C = null;
                        zznu = new zznl(iArr, jArr, jArr2, jArr3);
                    }
                    zznp.mo26866a(zznu);
                    this.f22409u = true;
                }
            } else if (this.f22391c.size() != 0) {
                this.f22388Y.mo26871c();
            } else {
                throw new zzlm("No valid tracks were found");
            }
        } else if (this.f22368E == 2) {
            if (!this.f22387X) {
                this.f22376M |= 1;
            }
            m24971a(this.f22391c.get(this.f22374K), this.f22369F);
            this.f22368E = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29598a(int i, long j) throws zzlm {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f22408t.f17135c = (int) j;
                        return;
                    case 136:
                        x10 x10 = this.f22408t;
                        if (j == 1) {
                            z = true;
                        }
                        x10.f17128L = z;
                        return;
                    case 155:
                        this.f22370G = m24970a(j);
                        return;
                    case 159:
                        this.f22408t.f17123G = (int) j;
                        return;
                    case 176:
                        this.f22408t.f17142j = (int) j;
                        return;
                    case 179:
                        this.f22365B.mo29720a(m24970a(j));
                        return;
                    case 186:
                        this.f22408t.f17143k = (int) j;
                        return;
                    case 215:
                        this.f22408t.f17134b = (int) j;
                        return;
                    case 231:
                        this.f22364A = m24970a(j);
                        return;
                    case 241:
                        if (!this.f22367D) {
                            this.f22366C.mo29720a(j);
                            this.f22367D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f22387X = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            StringBuilder sb = new StringBuilder(50);
                            sb.append("ContentCompAlgo ");
                            sb.append(j);
                            sb.append(" not supported");
                            throw new zzlm(sb.toString());
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            StringBuilder sb2 = new StringBuilder(53);
                            sb2.append("DocTypeReadVersion ");
                            sb2.append(j);
                            sb2.append(" not supported");
                            throw new zzlm(sb2.toString());
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            StringBuilder sb3 = new StringBuilder(50);
                            sb3.append("EBMLReadVersion ");
                            sb3.append(j);
                            sb3.append(" not supported");
                            throw new zzlm(sb3.toString());
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            StringBuilder sb4 = new StringBuilder(49);
                            sb4.append("ContentEncAlgo ");
                            sb4.append(j);
                            sb4.append(" not supported");
                            throw new zzlm(sb4.toString());
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            StringBuilder sb5 = new StringBuilder(56);
                            sb5.append("AESSettingsCipherMode ");
                            sb5.append(j);
                            sb5.append(" not supported");
                            throw new zzlm(sb5.toString());
                        }
                        return;
                    case 21420:
                        this.f22411w = j + this.f22404p;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f22408t.f17148p = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f22408t.f17148p = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f22408t.f17148p = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f22408t.f17148p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f22408t.f17144l = (int) j;
                        return;
                    case 21682:
                        this.f22408t.f17146n = (int) j;
                        return;
                    case 21690:
                        this.f22408t.f17145m = (int) j;
                        return;
                    case 21930:
                        x10 x102 = this.f22408t;
                        if (j == 1) {
                            z = true;
                        }
                        x102.f17129M = z;
                        return;
                    case 22186:
                        this.f22408t.f17126J = j;
                        return;
                    case 22203:
                        this.f22408t.f17127K = j;
                        return;
                    case 25188:
                        this.f22408t.f17124H = (int) j;
                        return;
                    case 2352003:
                        this.f22408t.f17136d = (int) j;
                        return;
                    case 2807729:
                        this.f22405q = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i3 = (int) j;
                                if (i3 == 1) {
                                    this.f22408t.f17152t = 2;
                                    return;
                                } else if (i3 == 2) {
                                    this.f22408t.f17152t = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i4 = (int) j;
                                if (i4 != 1) {
                                    if (i4 == 16) {
                                        this.f22408t.f17151s = 6;
                                        return;
                                    } else if (i4 == 18) {
                                        this.f22408t.f17151s = 7;
                                        return;
                                    } else if (!(i4 == 6 || i4 == 7)) {
                                        return;
                                    }
                                }
                                this.f22408t.f17151s = 3;
                                return;
                            case 21947:
                                x10 x103 = this.f22408t;
                                x103.f17149q = true;
                                int i5 = (int) j;
                                if (i5 == 1) {
                                    x103.f17150r = 1;
                                    return;
                                } else if (i5 == 9) {
                                    x103.f17150r = 6;
                                    return;
                                } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                    this.f22408t.f17150r = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f22408t.f17153u = (int) j;
                                return;
                            case 21949:
                                this.f22408t.f17154v = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                StringBuilder sb6 = new StringBuilder(55);
                sb6.append("ContentEncodingScope ");
                sb6.append(j);
                sb6.append(" not supported");
                throw new zzlm(sb6.toString());
            }
        } else if (j != 0) {
            StringBuilder sb7 = new StringBuilder(55);
            sb7.append("ContentEncodingOrder ");
            sb7.append(j);
            sb7.append(" not supported");
            throw new zzlm(sb7.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29596a(int i, double d) {
        if (i == 181) {
            this.f22408t.f17125I = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f22408t.f17155w = (float) d;
                    return;
                case 21970:
                    this.f22408t.f17156x = (float) d;
                    return;
                case 21971:
                    this.f22408t.f17157y = (float) d;
                    return;
                case 21972:
                    this.f22408t.f17158z = (float) d;
                    return;
                case 21973:
                    this.f22408t.f17117A = (float) d;
                    return;
                case 21974:
                    this.f22408t.f17118B = (float) d;
                    return;
                case 21975:
                    this.f22408t.f17119C = (float) d;
                    return;
                case 21976:
                    this.f22408t.f17120D = (float) d;
                    return;
                case 21977:
                    this.f22408t.f17121E = (float) d;
                    return;
                case 21978:
                    this.f22408t.f17122F = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.f22406r = (long) d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29600a(int i, String str) throws zzlm {
        if (i == 134) {
            this.f22408t.f17133a = str;
        } else if (i != 17026) {
            if (i == 2274716) {
                String unused = this.f22408t.f17130N = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzlm(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ef, code lost:
        throw new com.google.android.gms.internal.ads.zzlm("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0245  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29597a(int r20, int r21, com.google.android.gms.internal.ads.zzno r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 4
            r7 = 0
            r8 = 1
            if (r1 == r4) goto L_0x008b
            if (r1 == r5) goto L_0x008b
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0081
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0072
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0054
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x004a
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0031
            com.google.android.gms.internal.ads.x10 r1 = r0.f22408t
            byte[] r4 = new byte[r2]
            r1.f17147o = r4
            r3.readFully(r4, r7, r2)
            return
        L_0x0031:
            com.google.android.gms.internal.ads.zzlm r2 = new com.google.android.gms.internal.ads.zzlm
            r3 = 26
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Unexpected id: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x004a:
            com.google.android.gms.internal.ads.x10 r1 = r0.f22408t
            byte[] r4 = new byte[r2]
            r1.f17140h = r4
            r3.readFully(r4, r7, r2)
            return
        L_0x0054:
            com.google.android.gms.internal.ads.zzst r1 = r0.f22397i
            byte[] r1 = r1.f22660a
            java.util.Arrays.fill(r1, r7)
            com.google.android.gms.internal.ads.zzst r1 = r0.f22397i
            byte[] r1 = r1.f22660a
            int r6 = r6 - r2
            r3.readFully(r1, r6, r2)
            com.google.android.gms.internal.ads.zzst r1 = r0.f22397i
            r1.mo29727b(r7)
            com.google.android.gms.internal.ads.zzst r1 = r0.f22397i
            long r1 = r1.mo29738j()
            int r2 = (int) r1
            r0.f22410v = r2
            return
        L_0x0072:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r7, r2)
            com.google.android.gms.internal.ads.x10 r2 = r0.f22408t
            com.google.android.gms.internal.ads.zznx r3 = new com.google.android.gms.internal.ads.zznx
            r3.<init>(r8, r1)
            r2.f17139g = r3
            return
        L_0x0081:
            com.google.android.gms.internal.ads.x10 r1 = r0.f22408t
            byte[] r4 = new byte[r2]
            r1.f17138f = r4
            r3.readFully(r4, r7, r2)
            return
        L_0x008b:
            int r4 = r0.f22368E
            r9 = 8
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.z10 r4 = r0.f22390b
            long r10 = r4.mo26859a(r3, r7, r8, r9)
            int r4 = (int) r10
            r0.f22374K = r4
            com.google.android.gms.internal.ads.z10 r4 = r0.f22390b
            int r4 = r4.mo26861b()
            r0.f22375L = r4
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f22370G = r10
            r0.f22368E = r8
            com.google.android.gms.internal.ads.zzst r4 = r0.f22395g
            r4.mo29737i()
        L_0x00b0:
            android.util.SparseArray<com.google.android.gms.internal.ads.x10> r4 = r0.f22391c
            int r10 = r0.f22374K
            java.lang.Object r4 = r4.get(r10)
            com.google.android.gms.internal.ads.x10 r4 = (com.google.android.gms.internal.ads.x10) r4
            if (r4 != 0) goto L_0x00c6
            int r1 = r0.f22375L
            int r1 = r2 - r1
            r3.mo29573a(r1)
            r0.f22368E = r7
            return
        L_0x00c6:
            int r10 = r0.f22368E
            if (r10 != r8) goto L_0x0271
            r10 = 3
            r0.m24972a((com.google.android.gms.internal.ads.zzno) r3, (int) r10)
            com.google.android.gms.internal.ads.zzst r11 = r0.f22395g
            byte[] r11 = r11.f22660a
            r12 = 2
            byte r11 = r11[r12]
            r11 = r11 & 6
            int r11 = r11 >> r8
            r13 = 255(0xff, float:3.57E-43)
            if (r11 != 0) goto L_0x00ef
            r0.f22372I = r8
            int[] r6 = r0.f22373J
            int[] r6 = m24974a((int[]) r6, (int) r8)
            r0.f22373J = r6
            int r11 = r0.f22375L
            int r2 = r2 - r11
            int r2 = r2 - r10
            r6[r7] = r2
        L_0x00ec:
            r7 = 1
            goto L_0x0203
        L_0x00ef:
            if (r1 != r5) goto L_0x0269
            r0.m24972a((com.google.android.gms.internal.ads.zzno) r3, (int) r6)
            com.google.android.gms.internal.ads.zzst r14 = r0.f22395g
            byte[] r14 = r14.f22660a
            byte r14 = r14[r10]
            r14 = r14 & r13
            int r14 = r14 + r8
            r0.f22372I = r14
            int[] r15 = r0.f22373J
            int[] r14 = m24974a((int[]) r15, (int) r14)
            r0.f22373J = r14
            if (r11 != r12) goto L_0x0113
            int r10 = r0.f22375L
            int r2 = r2 - r10
            int r2 = r2 - r6
            int r6 = r0.f22372I
            int r2 = r2 / r6
            java.util.Arrays.fill(r14, r7, r6, r2)
            goto L_0x00ec
        L_0x0113:
            if (r11 != r8) goto L_0x0149
            r10 = 0
            r11 = 0
        L_0x0117:
            int r14 = r0.f22372I
            int r15 = r14 + -1
            if (r10 >= r15) goto L_0x013e
            int[] r14 = r0.f22373J
            r14[r10] = r7
        L_0x0121:
            int r6 = r6 + r8
            r0.m24972a((com.google.android.gms.internal.ads.zzno) r3, (int) r6)
            com.google.android.gms.internal.ads.zzst r14 = r0.f22395g
            byte[] r14 = r14.f22660a
            int r15 = r6 + -1
            byte r14 = r14[r15]
            r14 = r14 & r13
            int[] r15 = r0.f22373J
            r16 = r15[r10]
            int r16 = r16 + r14
            r15[r10] = r16
            if (r14 == r13) goto L_0x0121
            r14 = r15[r10]
            int r11 = r11 + r14
            int r10 = r10 + 1
            goto L_0x0117
        L_0x013e:
            int[] r10 = r0.f22373J
            int r14 = r14 - r8
            int r15 = r0.f22375L
            int r2 = r2 - r15
            int r2 = r2 - r6
            int r2 = r2 - r11
            r10[r14] = r2
            goto L_0x00ec
        L_0x0149:
            if (r11 != r10) goto L_0x0250
            r10 = 0
            r11 = 0
        L_0x014d:
            int r14 = r0.f22372I
            int r15 = r14 + -1
            if (r10 >= r15) goto L_0x01f8
            int[] r14 = r0.f22373J
            r14[r10] = r7
            int r6 = r6 + 1
            r0.m24972a((com.google.android.gms.internal.ads.zzno) r3, (int) r6)
            com.google.android.gms.internal.ads.zzst r14 = r0.f22395g
            byte[] r14 = r14.f22660a
            int r15 = r6 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01f0
            r16 = 0
            r14 = 0
        L_0x0169:
            if (r14 >= r9) goto L_0x01bb
            int r18 = 7 - r14
            int r18 = r8 << r18
            com.google.android.gms.internal.ads.zzst r5 = r0.f22395g
            byte[] r5 = r5.f22660a
            byte r5 = r5[r15]
            r5 = r5 & r18
            if (r5 == 0) goto L_0x01b1
            int r6 = r6 + r14
            r0.m24972a((com.google.android.gms.internal.ads.zzno) r3, (int) r6)
            com.google.android.gms.internal.ads.zzst r5 = r0.f22395g
            byte[] r5 = r5.f22660a
            int r16 = r15 + 1
            byte r5 = r5[r15]
            r5 = r5 & r13
            r15 = r18 ^ -1
            r5 = r5 & r15
            long r7 = (long) r5
            r5 = r16
        L_0x018c:
            r16 = r7
            if (r5 >= r6) goto L_0x01a3
            long r7 = r16 << r9
            com.google.android.gms.internal.ads.zzst r15 = r0.f22395g
            byte[] r15 = r15.f22660a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r13
            long r12 = (long) r5
            long r7 = r7 | r12
            r5 = r16
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x018c
        L_0x01a3:
            if (r10 <= 0) goto L_0x01bb
            int r14 = r14 * 7
            int r14 = r14 + 6
            r7 = 1
            long r12 = r7 << r14
            long r12 = r12 - r7
            long r16 = r16 - r12
            goto L_0x01bb
        L_0x01b1:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x0169
        L_0x01bb:
            r7 = r16
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x01e8
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x01e8
            int r5 = (int) r7
            int[] r7 = r0.f22373J
            if (r10 != 0) goto L_0x01d1
            goto L_0x01d6
        L_0x01d1:
            int r8 = r10 + -1
            r8 = r7[r8]
            int r5 = r5 + r8
        L_0x01d6:
            r7[r10] = r5
            int[] r5 = r0.f22373J
            r5 = r5[r10]
            int r11 = r11 + r5
            int r10 = r10 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r7 = 0
            r8 = 1
            r12 = 2
            r13 = 255(0xff, float:3.57E-43)
            goto L_0x014d
        L_0x01e8:
            com.google.android.gms.internal.ads.zzlm r1 = new com.google.android.gms.internal.ads.zzlm
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>(r2)
            throw r1
        L_0x01f0:
            com.google.android.gms.internal.ads.zzlm r1 = new com.google.android.gms.internal.ads.zzlm
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>(r2)
            throw r1
        L_0x01f8:
            int[] r5 = r0.f22373J
            r7 = 1
            int r14 = r14 - r7
            int r8 = r0.f22375L
            int r2 = r2 - r8
            int r2 = r2 - r6
            int r2 = r2 - r11
            r5[r14] = r2
        L_0x0203:
            com.google.android.gms.internal.ads.zzst r2 = r0.f22395g
            byte[] r2 = r2.f22660a
            r5 = 0
            byte r6 = r2[r5]
            int r5 = r6 << 8
            byte r2 = r2[r7]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.f22364A
            long r7 = (long) r2
            long r7 = r0.m24970a((long) r7)
            long r5 = r5 + r7
            r0.f22369F = r5
            com.google.android.gms.internal.ads.zzst r2 = r0.f22395g
            byte[] r2 = r2.f22660a
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r9
            if (r2 != r9) goto L_0x0228
            r2 = 1
            goto L_0x0229
        L_0x0228:
            r2 = 0
        L_0x0229:
            int r6 = r4.f17135c
            if (r6 == r5) goto L_0x023f
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x023d
            com.google.android.gms.internal.ads.zzst r6 = r0.f22395g
            byte[] r6 = r6.f22660a
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x023d
            goto L_0x023f
        L_0x023d:
            r5 = 0
            goto L_0x0240
        L_0x023f:
            r5 = 1
        L_0x0240:
            if (r2 == 0) goto L_0x0245
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0246
        L_0x0245:
            r2 = 0
        L_0x0246:
            r2 = r2 | r5
            r0.f22376M = r2
            r2 = 2
            r0.f22368E = r2
            r2 = 0
            r0.f22371H = r2
            goto L_0x0271
        L_0x0250:
            com.google.android.gms.internal.ads.zzlm r1 = new com.google.android.gms.internal.ads.zzlm
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected lacing value: "
            r3.append(r2)
            r3.append(r11)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0269:
            com.google.android.gms.internal.ads.zzlm r1 = new com.google.android.gms.internal.ads.zzlm
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>(r2)
            throw r1
        L_0x0271:
            r2 = 163(0xa3, float:2.28E-43)
            if (r1 != r2) goto L_0x029c
        L_0x0275:
            int r1 = r0.f22371H
            int r2 = r0.f22372I
            if (r1 >= r2) goto L_0x0298
            int[] r2 = r0.f22373J
            r1 = r2[r1]
            r0.m24973a((com.google.android.gms.internal.ads.zzno) r3, (com.google.android.gms.internal.ads.x10) r4, (int) r1)
            long r1 = r0.f22369F
            int r5 = r0.f22371H
            int r6 = r4.f17136d
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.m24971a((com.google.android.gms.internal.ads.x10) r4, (long) r1)
            int r1 = r0.f22371H
            r2 = 1
            int r1 = r1 + r2
            r0.f22371H = r1
            goto L_0x0275
        L_0x0298:
            r1 = 0
            r0.f22368E = r1
            return
        L_0x029c:
            r1 = 0
            int[] r2 = r0.f22373J
            r1 = r2[r1]
            r0.m24973a((com.google.android.gms.internal.ads.zzno) r3, (com.google.android.gms.internal.ads.x10) r4, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzod.mo29597a(int, int, com.google.android.gms.internal.ads.zzno):void");
    }

    /* renamed from: a */
    private final void m24971a(x10 x10, long j) {
        byte[] bArr;
        if ("S_TEXT/UTF8".equals(x10.f17133a)) {
            byte[] bArr2 = this.f22399k.f22660a;
            long j2 = this.f22370G;
            if (j2 == -9223372036854775807L) {
                bArr = f22362a0;
            } else {
                int i = (int) (j2 / 3600000000L);
                long j3 = j2 - (((long) i) * 3600000000L);
                int i2 = (int) (j3 / 60000000);
                long j4 = j3 - ((long) (60000000 * i2));
                int i3 = (int) (j4 / 1000000);
                bArr = zzsy.m25295d(String.format(Locale.US, "%02d:%02d:%02d,%03d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - ((long) (1000000 * i3))) / 1000))}));
            }
            System.arraycopy(bArr, 0, bArr2, 19, 12);
            zznw zznw = x10.f17131O;
            zzst zzst = this.f22399k;
            zznw.mo29592a(zzst, zzst.mo29728c());
            this.f22385V += this.f22399k.mo29728c();
        }
        x10.f17131O.mo29590a(j, this.f22376M, this.f22385V, 0, x10.f17139g);
        this.f22386W = true;
        m24975b();
    }

    /* renamed from: a */
    private final void m24972a(zzno zzno, int i) throws IOException, InterruptedException {
        if (this.f22395g.mo29728c() < i) {
            if (this.f22395g.mo29722a() < i) {
                zzst zzst = this.f22395g;
                byte[] bArr = zzst.f22660a;
                zzst.mo29724a(Arrays.copyOf(bArr, Math.max(bArr.length << 1, i)), this.f22395g.mo29728c());
            }
            zzst zzst2 = this.f22395g;
            zzno.readFully(zzst2.f22660a, zzst2.mo29728c(), i - this.f22395g.mo29728c());
            this.f22395g.mo29731d(i);
        }
    }

    /* renamed from: a */
    private final void m24973a(zzno zzno, x10 x10, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(x10.f17133a)) {
            int length = f22361Z.length + i;
            if (this.f22399k.mo29722a() < length) {
                this.f22399k.f22660a = Arrays.copyOf(f22361Z, length + i);
            }
            zzno.readFully(this.f22399k.f22660a, f22361Z.length, i);
            this.f22399k.mo29727b(0);
            this.f22399k.mo29731d(length);
            return;
        }
        zznw zznw = x10.f17131O;
        if (!this.f22378O) {
            if (x10.f17137e) {
                this.f22376M &= -1073741825;
                int i3 = 128;
                if (!this.f22379P) {
                    zzno.readFully(this.f22395g.f22660a, 0, 1);
                    this.f22377N++;
                    byte[] bArr = this.f22395g.f22660a;
                    if ((bArr[0] & 128) != 128) {
                        this.f22382S = bArr[0];
                        this.f22379P = true;
                    } else {
                        throw new zzlm("Extension bit is set in signal byte");
                    }
                }
                byte b = this.f22382S;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.f22376M |= 1073741824;
                    if (!this.f22380Q) {
                        zzno.readFully(this.f22400l.f22660a, 0, 8);
                        this.f22377N += 8;
                        this.f22380Q = true;
                        byte[] bArr2 = this.f22395g.f22660a;
                        if (!z) {
                            i3 = 0;
                        }
                        bArr2[0] = (byte) (i3 | 8);
                        this.f22395g.mo29727b(0);
                        zznw.mo29592a(this.f22395g, 1);
                        this.f22385V++;
                        this.f22400l.mo29727b(0);
                        zznw.mo29592a(this.f22400l, 8);
                        this.f22385V += 8;
                    }
                    if (z) {
                        if (!this.f22381R) {
                            zzno.readFully(this.f22395g.f22660a, 0, 1);
                            this.f22377N++;
                            this.f22395g.mo29727b(0);
                            this.f22383T = this.f22395g.mo29735g();
                            this.f22381R = true;
                        }
                        int i4 = this.f22383T << 2;
                        this.f22395g.mo29723a(i4);
                        zzno.readFully(this.f22395g.f22660a, 0, i4);
                        this.f22377N += i4;
                        short s = (short) ((this.f22383T / 2) + 1);
                        int i5 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f22402n;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f22402n = ByteBuffer.allocate(i5);
                        }
                        this.f22402n.position(0);
                        this.f22402n.putShort(s);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i2 = this.f22383T;
                            if (i6 >= i2) {
                                break;
                            }
                            int l = this.f22395g.mo29740l();
                            if (i6 % 2 == 0) {
                                this.f22402n.putShort((short) (l - i7));
                            } else {
                                this.f22402n.putInt(l - i7);
                            }
                            i6++;
                            i7 = l;
                        }
                        int i8 = (i - this.f22377N) - i7;
                        if (i2 % 2 == 1) {
                            this.f22402n.putInt(i8);
                        } else {
                            this.f22402n.putShort((short) i8);
                            this.f22402n.putInt(0);
                        }
                        this.f22401m.mo29724a(this.f22402n.array(), i5);
                        zznw.mo29592a(this.f22401m, i5);
                        this.f22385V += i5;
                    }
                }
            } else {
                byte[] bArr3 = x10.f17138f;
                if (bArr3 != null) {
                    this.f22398j.mo29724a(bArr3, bArr3.length);
                }
            }
            this.f22378O = true;
        }
        int c = i + this.f22398j.mo29728c();
        if (!"V_MPEG4/ISO/AVC".equals(x10.f17133a) && !"V_MPEGH/ISO/HEVC".equals(x10.f17133a)) {
            while (true) {
                int i9 = this.f22377N;
                if (i9 >= c) {
                    break;
                }
                m24969a(zzno, zznw, c - i9);
            }
        } else {
            byte[] bArr4 = this.f22394f.f22660a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i10 = x10.f17132P;
            int i11 = 4 - i10;
            while (this.f22377N < c) {
                int i12 = this.f22384U;
                if (i12 == 0) {
                    int min = Math.min(i10, this.f22398j.mo29742n());
                    zzno.readFully(bArr4, i11 + min, i10 - min);
                    if (min > 0) {
                        this.f22398j.mo29725a(bArr4, i11, min);
                    }
                    this.f22377N += i10;
                    this.f22394f.mo29727b(0);
                    this.f22384U = this.f22394f.mo29740l();
                    this.f22393e.mo29727b(0);
                    zznw.mo29592a(this.f22393e, 4);
                    this.f22385V += 4;
                } else {
                    this.f22384U = i12 - m24969a(zzno, zznw, i12);
                }
            }
        }
        if ("A_VORBIS".equals(x10.f17133a)) {
            this.f22396h.mo29727b(0);
            zznw.mo29592a(this.f22396h, 4);
            this.f22385V += 4;
        }
    }

    /* renamed from: a */
    private final int m24969a(zzno zzno, zznw zznw, int i) throws IOException, InterruptedException {
        int i2;
        int n = this.f22398j.mo29742n();
        if (n > 0) {
            i2 = Math.min(i, n);
            zznw.mo29592a(this.f22398j, i2);
        } else {
            i2 = zznw.mo29589a(zzno, i, false);
        }
        this.f22377N += i2;
        this.f22385V += i2;
        return i2;
    }

    /* renamed from: a */
    private final long m24970a(long j) throws zzlm {
        long j2 = this.f22405q;
        if (j2 != -9223372036854775807L) {
            return zzsy.m25284a(j, j2, 1000);
        }
        throw new zzlm("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: a */
    private static int[] m24974a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length << 1, i)];
    }
}
