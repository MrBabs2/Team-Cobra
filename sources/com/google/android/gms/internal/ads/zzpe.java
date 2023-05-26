package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class zzpe extends zzks {

    /* renamed from: U */
    private static final byte[] f22457U = zzsy.m25296e("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    private boolean f22458A;

    /* renamed from: B */
    private boolean f22459B;

    /* renamed from: C */
    private boolean f22460C;

    /* renamed from: D */
    private boolean f22461D;

    /* renamed from: E */
    private ByteBuffer[] f22462E;

    /* renamed from: F */
    private ByteBuffer[] f22463F;

    /* renamed from: G */
    private long f22464G;

    /* renamed from: H */
    private int f22465H;

    /* renamed from: I */
    private int f22466I;

    /* renamed from: J */
    private boolean f22467J;

    /* renamed from: K */
    private boolean f22468K;

    /* renamed from: L */
    private int f22469L;

    /* renamed from: M */
    private int f22470M;

    /* renamed from: N */
    private boolean f22471N;

    /* renamed from: O */
    private boolean f22472O;

    /* renamed from: P */
    private boolean f22473P;

    /* renamed from: Q */
    private boolean f22474Q;

    /* renamed from: R */
    private boolean f22475R;

    /* renamed from: S */
    private boolean f22476S;

    /* renamed from: T */
    protected zznc f22477T;

    /* renamed from: i */
    private final zzpg f22478i;

    /* renamed from: j */
    private final zznj<Object> f22479j;

    /* renamed from: k */
    private final boolean f22480k;

    /* renamed from: l */
    private final zznd f22481l;

    /* renamed from: m */
    private final zznd f22482m;

    /* renamed from: n */
    private final zzlj f22483n;

    /* renamed from: o */
    private final List<Long> f22484o;

    /* renamed from: p */
    private final MediaCodec.BufferInfo f22485p;

    /* renamed from: q */
    private zzlh f22486q;

    /* renamed from: r */
    private zznh<Object> f22487r;

    /* renamed from: s */
    private zznh<Object> f22488s;

    /* renamed from: t */
    private MediaCodec f22489t;

    /* renamed from: u */
    private zzpd f22490u;

    /* renamed from: v */
    private boolean f22491v;

    /* renamed from: w */
    private boolean f22492w;

    /* renamed from: x */
    private boolean f22493x;

    /* renamed from: y */
    private boolean f22494y;

    /* renamed from: z */
    private boolean f22495z;

    public zzpe(int i, zzpg zzpg, zznj<Object> zznj, boolean z) {
        super(i);
        zzsk.m25218b(zzsy.f22671a >= 16);
        zzsk.m25214a(zzpg);
        this.f22478i = zzpg;
        this.f22479j = zznj;
        this.f22480k = z;
        this.f22481l = new zznd(0);
        this.f22482m = new zznd(0);
        this.f22483n = new zzlj();
        this.f22484o = new ArrayList();
        this.f22485p = new MediaCodec.BufferInfo();
        this.f22469L = 0;
        this.f22470M = 0;
    }

    /* renamed from: A */
    private final void m25010A() throws zzku {
        if (this.f22470M == 2) {
            mo29611k();
            mo29610j();
            return;
        }
        this.f22474Q = true;
        mo29535l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0147 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0148  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean mo29760z() throws com.google.android.gms.internal.ads.zzku {
        /*
            r14 = this;
            android.media.MediaCodec r0 = r14.f22489t
            r1 = 0
            if (r0 == 0) goto L_0x01d2
            int r2 = r14.f22470M
            r3 = 2
            if (r2 == r3) goto L_0x01d2
            boolean r2 = r14.f22473P
            if (r2 == 0) goto L_0x0010
            goto L_0x01d2
        L_0x0010:
            int r2 = r14.f22465H
            if (r2 >= 0) goto L_0x002a
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r14.f22465H = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.google.android.gms.internal.ads.zznd r2 = r14.f22481l
            java.nio.ByteBuffer[] r4 = r14.f22462E
            r0 = r4[r0]
            r2.f22333c = r0
            r2.mo29540a()
        L_0x002a:
            int r0 = r14.f22470M
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0047
            boolean r0 = r14.f22494y
            if (r0 != 0) goto L_0x0044
            r14.f22472O = r4
            android.media.MediaCodec r5 = r14.f22489t
            int r6 = r14.f22465H
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f22465H = r2
        L_0x0044:
            r14.f22470M = r3
            return r1
        L_0x0047:
            boolean r0 = r14.f22460C
            if (r0 == 0) goto L_0x0069
            r14.f22460C = r1
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            java.nio.ByteBuffer r0 = r0.f22333c
            byte[] r1 = f22457U
            r0.put(r1)
            android.media.MediaCodec r5 = r14.f22489t
            int r6 = r14.f22465H
            r7 = 0
            byte[] r0 = f22457U
            int r8 = r0.length
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r14.f22465H = r2
            r14.f22471N = r4
            return r4
        L_0x0069:
            boolean r0 = r14.f22475R
            if (r0 == 0) goto L_0x0070
            r0 = -4
            r5 = 0
            goto L_0x00a8
        L_0x0070:
            int r0 = r14.f22469L
            if (r0 != r4) goto L_0x0095
            r0 = 0
        L_0x0075:
            com.google.android.gms.internal.ads.zzlh r5 = r14.f22486q
            java.util.List<byte[]> r5 = r5.f22191m
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0093
            com.google.android.gms.internal.ads.zzlh r5 = r14.f22486q
            java.util.List<byte[]> r5 = r5.f22191m
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.google.android.gms.internal.ads.zznd r6 = r14.f22481l
            java.nio.ByteBuffer r6 = r6.f22333c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0075
        L_0x0093:
            r14.f22469L = r3
        L_0x0095:
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            java.nio.ByteBuffer r0 = r0.f22333c
            int r0 = r0.position()
            com.google.android.gms.internal.ads.zzlj r5 = r14.f22483n
            com.google.android.gms.internal.ads.zznd r6 = r14.f22481l
            int r5 = r14.mo29433a((com.google.android.gms.internal.ads.zzlj) r5, (com.google.android.gms.internal.ads.zznd) r6, (boolean) r1)
            r13 = r5
            r5 = r0
            r0 = r13
        L_0x00a8:
            r6 = -3
            if (r0 != r6) goto L_0x00ac
            return r1
        L_0x00ac:
            r6 = -5
            if (r0 != r6) goto L_0x00c2
            int r0 = r14.f22469L
            if (r0 != r3) goto L_0x00ba
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            r0.mo29540a()
            r14.f22469L = r4
        L_0x00ba:
            com.google.android.gms.internal.ads.zzlj r0 = r14.f22483n
            com.google.android.gms.internal.ads.zzlh r0 = r0.f22205a
            r14.mo29533b(r0)
            return r4
        L_0x00c2:
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            boolean r0 = r0.mo29544c()
            if (r0 == 0) goto L_0x00fe
            int r0 = r14.f22469L
            if (r0 != r3) goto L_0x00d5
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            r0.mo29540a()
            r14.f22469L = r4
        L_0x00d5:
            r14.f22473P = r4
            boolean r0 = r14.f22471N
            if (r0 != 0) goto L_0x00df
            r14.m25010A()
            return r1
        L_0x00df:
            boolean r0 = r14.f22494y     // Catch:{ CryptoException -> 0x00f4 }
            if (r0 != 0) goto L_0x00f3
            r14.f22472O = r4     // Catch:{ CryptoException -> 0x00f4 }
            android.media.MediaCodec r5 = r14.f22489t     // Catch:{ CryptoException -> 0x00f4 }
            int r6 = r14.f22465H     // Catch:{ CryptoException -> 0x00f4 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f4 }
            r14.f22465H = r2     // Catch:{ CryptoException -> 0x00f4 }
        L_0x00f3:
            return r1
        L_0x00f4:
            r0 = move-exception
            int r1 = r14.mo29443d()
            com.google.android.gms.internal.ads.zzku r0 = com.google.android.gms.internal.ads.zzku.m24722a(r0, r1)
            throw r0
        L_0x00fe:
            boolean r0 = r14.f22476S
            if (r0 == 0) goto L_0x0116
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            boolean r0 = r0.mo29546d()
            if (r0 != 0) goto L_0x0116
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            r0.mo29540a()
            int r0 = r14.f22469L
            if (r0 != r3) goto L_0x0115
            r14.f22469L = r4
        L_0x0115:
            return r4
        L_0x0116:
            r14.f22476S = r1
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l
            boolean r0 = r0.mo29553e()
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r3 = r14.f22487r
            if (r3 == 0) goto L_0x0142
            int r3 = r3.getState()
            if (r3 == 0) goto L_0x0133
            r6 = 4
            if (r3 == r6) goto L_0x0142
            if (r0 != 0) goto L_0x0131
            boolean r3 = r14.f22480k
            if (r3 != 0) goto L_0x0142
        L_0x0131:
            r3 = 1
            goto L_0x0143
        L_0x0133:
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r0 = r14.f22487r
            com.google.android.gms.internal.ads.zzni r0 = r0.mo29564a()
            int r1 = r14.mo29443d()
            com.google.android.gms.internal.ads.zzku r0 = com.google.android.gms.internal.ads.zzku.m24722a(r0, r1)
            throw r0
        L_0x0142:
            r3 = 0
        L_0x0143:
            r14.f22475R = r3
            if (r3 == 0) goto L_0x0148
            return r1
        L_0x0148:
            boolean r3 = r14.f22491v
            if (r3 == 0) goto L_0x0162
            if (r0 != 0) goto L_0x0162
            com.google.android.gms.internal.ads.zznd r3 = r14.f22481l
            java.nio.ByteBuffer r3 = r3.f22333c
            com.google.android.gms.internal.ads.zzsq.m25237a(r3)
            com.google.android.gms.internal.ads.zznd r3 = r14.f22481l
            java.nio.ByteBuffer r3 = r3.f22333c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0160
            return r4
        L_0x0160:
            r14.f22491v = r1
        L_0x0162:
            com.google.android.gms.internal.ads.zznd r3 = r14.f22481l     // Catch:{ CryptoException -> 0x01c8 }
            long r10 = r3.f22334d     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zznd r3 = r14.f22481l     // Catch:{ CryptoException -> 0x01c8 }
            boolean r3 = r3.mo29543b()     // Catch:{ CryptoException -> 0x01c8 }
            if (r3 == 0) goto L_0x0177
            java.util.List<java.lang.Long> r3 = r14.f22484o     // Catch:{ CryptoException -> 0x01c8 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01c8 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01c8 }
        L_0x0177:
            com.google.android.gms.internal.ads.zznd r3 = r14.f22481l     // Catch:{ CryptoException -> 0x01c8 }
            java.nio.ByteBuffer r3 = r3.f22333c     // Catch:{ CryptoException -> 0x01c8 }
            r3.flip()     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zznd r3 = r14.f22481l     // Catch:{ CryptoException -> 0x01c8 }
            r14.mo29607a((com.google.android.gms.internal.ads.zznd) r3)     // Catch:{ CryptoException -> 0x01c8 }
            if (r0 == 0) goto L_0x01a9
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zzmz r0 = r0.f22332b     // Catch:{ CryptoException -> 0x01c8 }
            android.media.MediaCodec$CryptoInfo r9 = r0.mo29547a()     // Catch:{ CryptoException -> 0x01c8 }
            if (r5 != 0) goto L_0x0190
            goto L_0x019f
        L_0x0190:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01c8 }
            if (r0 != 0) goto L_0x0198
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01c8 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01c8 }
        L_0x0198:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01c8 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01c8 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01c8 }
        L_0x019f:
            android.media.MediaCodec r6 = r14.f22489t     // Catch:{ CryptoException -> 0x01c8 }
            int r7 = r14.f22465H     // Catch:{ CryptoException -> 0x01c8 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01c8 }
            goto L_0x01ba
        L_0x01a9:
            android.media.MediaCodec r6 = r14.f22489t     // Catch:{ CryptoException -> 0x01c8 }
            int r7 = r14.f22465H     // Catch:{ CryptoException -> 0x01c8 }
            r8 = 0
            com.google.android.gms.internal.ads.zznd r0 = r14.f22481l     // Catch:{ CryptoException -> 0x01c8 }
            java.nio.ByteBuffer r0 = r0.f22333c     // Catch:{ CryptoException -> 0x01c8 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01c8 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01c8 }
        L_0x01ba:
            r14.f22465H = r2     // Catch:{ CryptoException -> 0x01c8 }
            r14.f22471N = r4     // Catch:{ CryptoException -> 0x01c8 }
            r14.f22469L = r1     // Catch:{ CryptoException -> 0x01c8 }
            com.google.android.gms.internal.ads.zznc r0 = r14.f22477T     // Catch:{ CryptoException -> 0x01c8 }
            int r1 = r0.f22327c     // Catch:{ CryptoException -> 0x01c8 }
            int r1 = r1 + r4
            r0.f22327c = r1     // Catch:{ CryptoException -> 0x01c8 }
            return r4
        L_0x01c8:
            r0 = move-exception
            int r1 = r14.mo29443d()
            com.google.android.gms.internal.ads.zzku r0 = com.google.android.gms.internal.ads.zzku.m24722a(r0, r1)
            throw r0
        L_0x01d2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.mo29760z():boolean");
    }

    /* renamed from: a */
    public final int mo29432a() {
        return 4;
    }

    /* renamed from: a */
    public final int mo29483a(zzlh zzlh) throws zzku {
        try {
            return mo29525a(this.f22478i, zzlh);
        } catch (zzpk e) {
            throw zzku.m24722a(e, mo29443d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo29525a(zzpg zzpg, zzlh zzlh) throws zzpk;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29528a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzku {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29607a(zznd zznd) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29529a(zzpd zzpd, MediaCodec mediaCodec, zzlh zzlh, MediaCrypto mediaCrypto) throws zzpk;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29530a(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29531a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzku;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29608a(MediaCodec mediaCodec, boolean z, zzlh zzlh, zzlh zzlh2) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29609a(zzpd zzpd) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r5.f22194p == r0.f22194p) goto L_0x0077;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29533b(com.google.android.gms.internal.ads.zzlh r5) throws com.google.android.gms.internal.ads.zzku {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzlh r0 = r4.f22486q
            r4.f22486q = r5
            com.google.android.gms.internal.ads.zzne r5 = r5.f22192n
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            com.google.android.gms.internal.ads.zzne r2 = r0.f22192n
        L_0x000d:
            boolean r5 = com.google.android.gms.internal.ads.zzsy.m25289a((java.lang.Object) r5, (java.lang.Object) r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.zzlh r5 = r4.f22486q
            com.google.android.gms.internal.ads.zzne r5 = r5.f22192n
            if (r5 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.zznj<java.lang.Object> r5 = r4.f22479j
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.zzlh r3 = r4.f22486q
            com.google.android.gms.internal.ads.zzne r3 = r3.f22192n
            com.google.android.gms.internal.ads.zznh r5 = r5.mo29567a(r1, r3)
            r4.f22488s = r5
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r1 = r4.f22487r
            if (r5 != r1) goto L_0x0049
            com.google.android.gms.internal.ads.zznj<java.lang.Object> r1 = r4.f22479j
            r1.mo29568a(r5)
            goto L_0x0049
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.mo29443d()
            com.google.android.gms.internal.ads.zzku r5 = com.google.android.gms.internal.ads.zzku.m24722a(r5, r0)
            throw r5
        L_0x0047:
            r4.f22488s = r1
        L_0x0049:
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r5 = r4.f22488s
            com.google.android.gms.internal.ads.zznh<java.lang.Object> r1 = r4.f22487r
            if (r5 != r1) goto L_0x007a
            android.media.MediaCodec r5 = r4.f22489t
            if (r5 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.zzpd r1 = r4.f22490u
            boolean r1 = r1.f22452b
            com.google.android.gms.internal.ads.zzlh r3 = r4.f22486q
            boolean r5 = r4.mo29608a((android.media.MediaCodec) r5, (boolean) r1, (com.google.android.gms.internal.ads.zzlh) r0, (com.google.android.gms.internal.ads.zzlh) r3)
            if (r5 == 0) goto L_0x007a
            r4.f22468K = r2
            r4.f22469L = r2
            boolean r5 = r4.f22493x
            if (r5 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zzlh r5 = r4.f22486q
            int r1 = r5.f22193o
            int r3 = r0.f22193o
            if (r1 != r3) goto L_0x0076
            int r5 = r5.f22194p
            int r0 = r0.f22194p
            if (r5 != r0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            r4.f22460C = r2
            return
        L_0x007a:
            boolean r5 = r4.f22471N
            if (r5 == 0) goto L_0x0081
            r4.f22470M = r2
            return
        L_0x0081:
            r4.mo29611k()
            r4.mo29610j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpe.mo29533b(com.google.android.gms.internal.ads.zzlh):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo29444e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo29445f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo29446g() {
        this.f22486q = null;
        try {
            mo29611k();
            try {
                if (this.f22487r != null) {
                    this.f22479j.mo29568a(this.f22487r);
                }
                try {
                    if (!(this.f22488s == null || this.f22488s == this.f22487r)) {
                        this.f22479j.mo29568a(this.f22488s);
                    }
                } finally {
                    this.f22487r = null;
                    this.f22488s = null;
                }
            } catch (Throwable th) {
                if (!(this.f22488s == null || this.f22488s == this.f22487r)) {
                    this.f22479j.mo29568a(this.f22488s);
                }
                throw th;
            } finally {
                this.f22487r = null;
                this.f22488s = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.f22488s == null || this.f22488s == this.f22487r)) {
                    this.f22479j.mo29568a(this.f22488s);
                }
                throw th2;
            } finally {
                this.f22487r = null;
                this.f22488s = null;
            }
        } finally {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo29610j() throws zzku {
        zzlh zzlh;
        if (this.f22489t == null && (zzlh = this.f22486q) != null) {
            zznh<Object> zznh = this.f22488s;
            this.f22487r = zznh;
            String str = zzlh.f22189k;
            if (zznh != null) {
                int state = zznh.getState();
                if (state == 0) {
                    throw zzku.m24722a(this.f22487r.mo29564a(), mo29443d());
                } else if (state == 3 || state == 4) {
                    this.f22487r.mo29565b();
                    throw new NoSuchMethodError();
                }
            } else {
                if (this.f22490u == null) {
                    try {
                        zzpd a = mo29527a(this.f22478i, zzlh, false);
                        this.f22490u = a;
                        if (a == null) {
                            m25011a(new zzpf(this.f22486q, (Throwable) null, false, -49999));
                            throw null;
                        }
                    } catch (zzpk e) {
                        m25011a(new zzpf(this.f22486q, (Throwable) e, false, -49998));
                        throw null;
                    }
                }
                if (mo29609a(this.f22490u)) {
                    String str2 = this.f22490u.f22451a;
                    this.f22491v = zzsy.f22671a < 21 && this.f22486q.f22191m.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
                    int i = zzsy.f22671a;
                    this.f22492w = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (zzsy.f22671a == 19 && zzsy.f22674d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
                    this.f22493x = zzsy.f22671a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(zzsy.f22672b) || "flounder_lte".equals(zzsy.f22672b) || "grouper".equals(zzsy.f22672b) || "tilapia".equals(zzsy.f22672b));
                    this.f22494y = zzsy.f22671a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
                    this.f22495z = (zzsy.f22671a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (zzsy.f22671a <= 19 && "hb2000".equals(zzsy.f22672b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
                    this.f22458A = zzsy.f22671a == 21 && "OMX.google.aac.decoder".equals(str2);
                    this.f22459B = zzsy.f22671a <= 18 && this.f22486q.f22201w == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        String valueOf = String.valueOf(str2);
                        zzsx.m25278a(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
                        this.f22489t = MediaCodec.createByCodecName(str2);
                        zzsx.m25277a();
                        zzsx.m25278a("configureCodec");
                        mo29529a(this.f22490u, this.f22489t, this.f22486q, (MediaCrypto) null);
                        zzsx.m25277a();
                        zzsx.m25278a("startCodec");
                        this.f22489t.start();
                        zzsx.m25277a();
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo29530a(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.f22462E = this.f22489t.getInputBuffers();
                        this.f22463F = this.f22489t.getOutputBuffers();
                        this.f22464G = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        this.f22465H = -1;
                        this.f22466I = -1;
                        this.f22476S = true;
                        this.f22477T.f22325a++;
                    } catch (Exception e2) {
                        m25011a(new zzpf(this.f22486q, (Throwable) e2, false, str2));
                        throw null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo29611k() {
        this.f22464G = -9223372036854775807L;
        this.f22465H = -1;
        this.f22466I = -1;
        this.f22475R = false;
        this.f22467J = false;
        this.f22484o.clear();
        this.f22462E = null;
        this.f22463F = null;
        this.f22490u = null;
        this.f22468K = false;
        this.f22471N = false;
        this.f22491v = false;
        this.f22492w = false;
        this.f22493x = false;
        this.f22494y = false;
        this.f22495z = false;
        this.f22459B = false;
        this.f22460C = false;
        this.f22461D = false;
        this.f22472O = false;
        this.f22469L = 0;
        this.f22470M = 0;
        this.f22481l.f22333c = null;
        MediaCodec mediaCodec = this.f22489t;
        if (mediaCodec != null) {
            this.f22477T.f22326b++;
            try {
                mediaCodec.stop();
                try {
                    this.f22489t.release();
                    this.f22489t = null;
                    zznh<Object> zznh = this.f22487r;
                    if (zznh != null && this.f22488s != zznh) {
                        try {
                            this.f22479j.mo29568a(zznh);
                        } finally {
                            this.f22487r = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f22489t = null;
                    zznh<Object> zznh2 = this.f22487r;
                    if (!(zznh2 == null || this.f22488s == zznh2)) {
                        this.f22479j.mo29568a(zznh2);
                    }
                    throw th;
                } finally {
                    this.f22487r = null;
                }
            } catch (Throwable th2) {
                this.f22489t = null;
                zznh<Object> zznh3 = this.f22487r;
                if (!(zznh3 == null || this.f22488s == zznh3)) {
                    try {
                        this.f22479j.mo29568a(zznh3);
                    } finally {
                        this.f22487r = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo29535l() throws zzku {
    }

    /* renamed from: m */
    public boolean mo29481m() {
        if (this.f22486q == null || this.f22475R) {
            return false;
        }
        if (mo29449i() || this.f22466I >= 0) {
            return true;
        }
        return this.f22464G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f22464G;
    }

    /* renamed from: n */
    public boolean mo29482n() {
        return this.f22474Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final MediaCodec mo29612x() {
        return this.f22489t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final zzpd mo29613y() {
        return this.f22490u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public zzpd mo29527a(zzpg zzpg, zzlh zzlh, boolean z) throws zzpk {
        return zzpg.mo26463a(zzlh.f22189k, z);
    }

    /* renamed from: a */
    private final void m25011a(zzpf zzpf) throws zzku {
        throw zzku.m24722a(zzpf, mo29443d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29439a(boolean z) throws zzku {
        this.f22477T = new zznc();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29437a(long j, boolean z) throws zzku {
        this.f22473P = false;
        this.f22474Q = false;
        if (this.f22489t != null) {
            this.f22464G = -9223372036854775807L;
            this.f22465H = -1;
            this.f22466I = -1;
            this.f22476S = true;
            this.f22475R = false;
            this.f22467J = false;
            this.f22484o.clear();
            this.f22460C = false;
            this.f22461D = false;
            if (this.f22492w || (this.f22495z && this.f22472O)) {
                mo29611k();
                mo29610j();
            } else if (this.f22470M != 0) {
                mo29611k();
                mo29610j();
            } else {
                this.f22489t.flush();
                this.f22471N = false;
            }
            if (this.f22468K && this.f22486q != null) {
                this.f22469L = 1;
            }
        }
    }

    /* renamed from: b */
    private final boolean m25012b(long j, long j2) throws zzku {
        boolean z;
        boolean z2;
        if (this.f22466I < 0) {
            if (!this.f22458A || !this.f22472O) {
                this.f22466I = this.f22489t.dequeueOutputBuffer(this.f22485p, 0);
            } else {
                try {
                    this.f22466I = this.f22489t.dequeueOutputBuffer(this.f22485p, 0);
                } catch (IllegalStateException unused) {
                    m25010A();
                    if (this.f22474Q) {
                        mo29611k();
                    }
                    return false;
                }
            }
            int i = this.f22466I;
            if (i >= 0) {
                if (this.f22461D) {
                    this.f22461D = false;
                    this.f22489t.releaseOutputBuffer(i, false);
                    this.f22466I = -1;
                    return true;
                }
                MediaCodec.BufferInfo bufferInfo = this.f22485p;
                if ((bufferInfo.flags & 4) != 0) {
                    m25010A();
                    this.f22466I = -1;
                    return false;
                }
                ByteBuffer byteBuffer = this.f22463F[i];
                if (byteBuffer != null) {
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.f22485p;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                long j3 = this.f22485p.presentationTimeUs;
                int size = this.f22484o.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z2 = false;
                        break;
                    } else if (this.f22484o.get(i2).longValue() == j3) {
                        this.f22484o.remove(i2);
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                this.f22467J = z2;
            } else if (i == -2) {
                MediaFormat outputFormat = this.f22489t.getOutputFormat();
                if (this.f22493x && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f22461D = true;
                } else {
                    if (this.f22459B) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    mo29528a(this.f22489t, outputFormat);
                }
                return true;
            } else if (i == -3) {
                this.f22463F = this.f22489t.getOutputBuffers();
                return true;
            } else {
                if (this.f22494y && (this.f22473P || this.f22470M == 2)) {
                    m25010A();
                }
                return false;
            }
        }
        if (!this.f22458A || !this.f22472O) {
            MediaCodec mediaCodec = this.f22489t;
            ByteBuffer[] byteBufferArr = this.f22463F;
            int i3 = this.f22466I;
            ByteBuffer byteBuffer2 = byteBufferArr[i3];
            MediaCodec.BufferInfo bufferInfo3 = this.f22485p;
            z = mo29531a(j, j2, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f22467J);
        } else {
            try {
                z = mo29531a(j, j2, this.f22489t, this.f22463F[this.f22466I], this.f22466I, this.f22485p.flags, this.f22485p.presentationTimeUs, this.f22467J);
            } catch (IllegalStateException unused2) {
                m25010A();
                if (this.f22474Q) {
                    mo29611k();
                }
                return false;
            }
        }
        if (!z) {
            return false;
        }
        long j4 = this.f22485p.presentationTimeUs;
        this.f22466I = -1;
        return true;
    }

    /* renamed from: a */
    public final void mo29480a(long j, long j2) throws zzku {
        if (this.f22474Q) {
            mo29535l();
            return;
        }
        if (this.f22486q == null) {
            this.f22482m.mo29540a();
            int a = mo29433a(this.f22483n, this.f22482m, true);
            if (a == -5) {
                mo29533b(this.f22483n.f22205a);
            } else if (a == -4) {
                zzsk.m25218b(this.f22482m.mo29544c());
                this.f22473P = true;
                m25010A();
                return;
            } else {
                return;
            }
        }
        mo29610j();
        if (this.f22489t != null) {
            zzsx.m25278a("drainAndFeed");
            do {
            } while (m25012b(j, j2));
            do {
            } while (mo29760z());
            zzsx.m25277a();
        } else {
            mo29442b(j);
            this.f22482m.mo29540a();
            int a2 = mo29433a(this.f22483n, this.f22482m, false);
            if (a2 == -5) {
                mo29533b(this.f22483n.f22205a);
            } else if (a2 == -4) {
                zzsk.m25218b(this.f22482m.mo29544c());
                this.f22473P = true;
                m25010A();
            }
        }
        this.f22477T.mo29551a();
    }
}
