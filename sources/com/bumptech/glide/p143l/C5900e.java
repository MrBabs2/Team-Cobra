package com.bumptech.glide.p143l;

import android.graphics.Bitmap;
import com.bumptech.glide.p143l.C5895a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.l.e */
/* compiled from: StandardGifDecoder */
public class C5900e implements C5895a {

    /* renamed from: u */
    private static final String f10749u = "e";

    /* renamed from: a */
    private int[] f10750a;

    /* renamed from: b */
    private final int[] f10751b;

    /* renamed from: c */
    private final C5895a.C5896a f10752c;

    /* renamed from: d */
    private ByteBuffer f10753d;

    /* renamed from: e */
    private byte[] f10754e;

    /* renamed from: f */
    private short[] f10755f;

    /* renamed from: g */
    private byte[] f10756g;

    /* renamed from: h */
    private byte[] f10757h;

    /* renamed from: i */
    private byte[] f10758i;

    /* renamed from: j */
    private int[] f10759j;

    /* renamed from: k */
    private int f10760k;

    /* renamed from: l */
    private C5898c f10761l;

    /* renamed from: m */
    private Bitmap f10762m;

    /* renamed from: n */
    private boolean f10763n;

    /* renamed from: o */
    private int f10764o;

    /* renamed from: p */
    private int f10765p;

    /* renamed from: q */
    private int f10766q;

    /* renamed from: r */
    private int f10767r;

    /* renamed from: s */
    private Boolean f10768s;

    /* renamed from: t */
    private Bitmap.Config f10769t;

    public C5900e(C5895a.C5896a aVar, C5898c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo20063a(cVar, byteBuffer, i);
    }

    /* renamed from: i */
    private Bitmap m11655i() {
        Boolean bool = this.f10768s;
        Bitmap a = this.f10752c.mo20049a(this.f10767r, this.f10766q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f10769t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: j */
    private int m11656j() {
        int k = m11657k();
        if (k <= 0) {
            return k;
        }
        ByteBuffer byteBuffer = this.f10753d;
        byteBuffer.get(this.f10754e, 0, Math.min(k, byteBuffer.remaining()));
        return k;
    }

    /* renamed from: k */
    private int m11657k() {
        return this.f10753d.get() & 255;
    }

    /* renamed from: a */
    public int mo20062a(int i) {
        if (i >= 0) {
            C5898c cVar = this.f10761l;
            if (i < cVar.f10734c) {
                return cVar.f10736e.get(i).f10729i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo20041b() {
        this.f10760k = (this.f10760k + 1) % this.f10761l.f10734c;
    }

    /* renamed from: c */
    public int mo20042c() {
        return this.f10761l.f10734c;
    }

    public void clear() {
        this.f10761l = null;
        byte[] bArr = this.f10758i;
        if (bArr != null) {
            this.f10752c.mo20051a(bArr);
        }
        int[] iArr = this.f10759j;
        if (iArr != null) {
            this.f10752c.mo20052a(iArr);
        }
        Bitmap bitmap = this.f10762m;
        if (bitmap != null) {
            this.f10752c.mo20050a(bitmap);
        }
        this.f10762m = null;
        this.f10753d = null;
        this.f10768s = null;
        byte[] bArr2 = this.f10754e;
        if (bArr2 != null) {
            this.f10752c.mo20051a(bArr2);
        }
    }

    /* renamed from: d */
    public int mo20044d() {
        int i;
        if (this.f10761l.f10734c <= 0 || (i = this.f10760k) < 0) {
            return 0;
        }
        return mo20062a(i);
    }

    /* renamed from: e */
    public ByteBuffer mo20045e() {
        return this.f10753d;
    }

    /* renamed from: f */
    public void mo20046f() {
        this.f10760k = -1;
    }

    /* renamed from: g */
    public int mo20047g() {
        return this.f10760k;
    }

    /* renamed from: h */
    public int mo20048h() {
        return this.f10753d.limit() + this.f10758i.length + (this.f10759j.length * 4);
    }

    /* renamed from: b */
    private void m11653b(C5897b bVar) {
        C5897b bVar2 = bVar;
        int[] iArr = this.f10759j;
        int i = bVar2.f10724d;
        int i2 = bVar2.f10722b;
        int i3 = bVar2.f10723c;
        int i4 = bVar2.f10721a;
        boolean z = this.f10760k == 0;
        int i5 = this.f10767r;
        byte[] bArr = this.f10758i;
        int[] iArr2 = this.f10750a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f10723c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C5897b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        this.f10768s = Boolean.valueOf(this.f10768s == null && z && b != -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11654c(com.bumptech.glide.p143l.C5897b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f10753d
            int r3 = r1.f10730j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            com.bumptech.glide.l.c r1 = r0.f10761l
            int r2 = r1.f10737f
            int r1 = r1.f10738g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f10723c
            int r1 = r1.f10724d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f10758i
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002b
        L_0x0023:
            com.bumptech.glide.l.a$a r1 = r0.f10752c
            byte[] r1 = r1.mo20054b(r2)
            r0.f10758i = r1
        L_0x002b:
            byte[] r1 = r0.f10758i
            short[] r3 = r0.f10755f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0037
            short[] r3 = new short[r4]
            r0.f10755f = r3
        L_0x0037:
            short[] r3 = r0.f10755f
            byte[] r5 = r0.f10756g
            if (r5 != 0) goto L_0x0041
            byte[] r5 = new byte[r4]
            r0.f10756g = r5
        L_0x0041:
            byte[] r5 = r0.f10756g
            byte[] r6 = r0.f10757h
            if (r6 != 0) goto L_0x004d
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f10757h = r6
        L_0x004d:
            byte[] r6 = r0.f10757h
            int r7 = r28.m11657k()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0060:
            if (r14 >= r9) goto L_0x006a
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0060
        L_0x006a:
            byte[] r14 = r0.f10754e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = -1
            r25 = 0
            r26 = 0
        L_0x0083:
            if (r13 >= r2) goto L_0x014e
            if (r16 != 0) goto L_0x0094
            int r16 = r28.m11656j()
            if (r16 > 0) goto L_0x0092
            r3 = 3
            r0.f10764o = r3
            goto L_0x014e
        L_0x0092:
            r17 = 0
        L_0x0094:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ae:
            if (r4 < r15) goto L_0x0136
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c2
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ae
        L_0x00c2:
            if (r11 != r10) goto L_0x00d9
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0083
        L_0x00d9:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ed
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ae
        L_0x00ed:
            if (r11 < r8) goto L_0x00f6
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f7
        L_0x00f6:
            r7 = r11
        L_0x00f7:
            if (r7 < r9) goto L_0x0102
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f7
        L_0x0102:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0109:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0116
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0109
        L_0x0116:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012d
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012d
            if (r8 >= r6) goto L_0x012d
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012d:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ae
        L_0x0136:
            r25 = r4
            r27 = r6
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0083
        L_0x014e:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p143l.C5900e.m11654c(com.bumptech.glide.l.b):void");
    }

    public C5900e(C5895a.C5896a aVar) {
        this.f10751b = new int[256];
        this.f10769t = Bitmap.Config.ARGB_8888;
        this.f10752c = aVar;
        this.f10761l = new C5898c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e1, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo20039a() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.bumptech.glide.l.c r0 = r7.f10761l     // Catch:{ all -> 0x00e2 }
            int r0 = r0.f10734c     // Catch:{ all -> 0x00e2 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r7.f10760k     // Catch:{ all -> 0x00e2 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = f10749u     // Catch:{ all -> 0x00e2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = f10749u     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r3.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.l.c r4 = r7.f10761l     // Catch:{ all -> 0x00e2 }
            int r4 = r4.f10734c     // Catch:{ all -> 0x00e2 }
            r3.append(r4)     // Catch:{ all -> 0x00e2 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00e2 }
            int r4 = r7.f10760k     // Catch:{ all -> 0x00e2 }
            r3.append(r4)     // Catch:{ all -> 0x00e2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00e2 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00e2 }
        L_0x0039:
            r7.f10764o = r2     // Catch:{ all -> 0x00e2 }
        L_0x003b:
            int r0 = r7.f10764o     // Catch:{ all -> 0x00e2 }
            r3 = 0
            if (r0 == r2) goto L_0x00c0
            int r0 = r7.f10764o     // Catch:{ all -> 0x00e2 }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00c0
        L_0x0047:
            r0 = 0
            r7.f10764o = r0     // Catch:{ all -> 0x00e2 }
            byte[] r4 = r7.f10754e     // Catch:{ all -> 0x00e2 }
            if (r4 != 0) goto L_0x0058
            com.bumptech.glide.l.a$a r4 = r7.f10752c     // Catch:{ all -> 0x00e2 }
            r5 = 255(0xff, float:3.57E-43)
            byte[] r4 = r4.mo20054b(r5)     // Catch:{ all -> 0x00e2 }
            r7.f10754e = r4     // Catch:{ all -> 0x00e2 }
        L_0x0058:
            com.bumptech.glide.l.c r4 = r7.f10761l     // Catch:{ all -> 0x00e2 }
            java.util.List<com.bumptech.glide.l.b> r4 = r4.f10736e     // Catch:{ all -> 0x00e2 }
            int r5 = r7.f10760k     // Catch:{ all -> 0x00e2 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.l.b r4 = (com.bumptech.glide.p143l.C5897b) r4     // Catch:{ all -> 0x00e2 }
            int r5 = r7.f10760k     // Catch:{ all -> 0x00e2 }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x0074
            com.bumptech.glide.l.c r6 = r7.f10761l     // Catch:{ all -> 0x00e2 }
            java.util.List<com.bumptech.glide.l.b> r6 = r6.f10736e     // Catch:{ all -> 0x00e2 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x00e2 }
            com.bumptech.glide.l.b r5 = (com.bumptech.glide.p143l.C5897b) r5     // Catch:{ all -> 0x00e2 }
            goto L_0x0075
        L_0x0074:
            r5 = r3
        L_0x0075:
            int[] r6 = r4.f10731k     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x007c
            int[] r6 = r4.f10731k     // Catch:{ all -> 0x00e2 }
            goto L_0x0080
        L_0x007c:
            com.bumptech.glide.l.c r6 = r7.f10761l     // Catch:{ all -> 0x00e2 }
            int[] r6 = r6.f10732a     // Catch:{ all -> 0x00e2 }
        L_0x0080:
            r7.f10750a = r6     // Catch:{ all -> 0x00e2 }
            if (r6 != 0) goto L_0x00a8
            java.lang.String r0 = f10749u     // Catch:{ all -> 0x00e2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = f10749u     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00e2 }
            int r4 = r7.f10760k     // Catch:{ all -> 0x00e2 }
            r1.append(r4)     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e2 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e2 }
        L_0x00a4:
            r7.f10764o = r2     // Catch:{ all -> 0x00e2 }
            monitor-exit(r7)
            return r3
        L_0x00a8:
            boolean r1 = r4.f10726f     // Catch:{ all -> 0x00e2 }
            if (r1 == 0) goto L_0x00ba
            int[] r1 = r7.f10751b     // Catch:{ all -> 0x00e2 }
            int r2 = r6.length     // Catch:{ all -> 0x00e2 }
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch:{ all -> 0x00e2 }
            int[] r1 = r7.f10751b     // Catch:{ all -> 0x00e2 }
            r7.f10750a = r1     // Catch:{ all -> 0x00e2 }
            int r2 = r4.f10728h     // Catch:{ all -> 0x00e2 }
            r1[r2] = r0     // Catch:{ all -> 0x00e2 }
        L_0x00ba:
            android.graphics.Bitmap r0 = r7.m11651a(r4, r5)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r7)
            return r0
        L_0x00c0:
            java.lang.String r0 = f10749u     // Catch:{ all -> 0x00e2 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = f10749u     // Catch:{ all -> 0x00e2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e2 }
            r1.<init>()     // Catch:{ all -> 0x00e2 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00e2 }
            int r2 = r7.f10764o     // Catch:{ all -> 0x00e2 }
            r1.append(r2)     // Catch:{ all -> 0x00e2 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e2 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00e2 }
        L_0x00e0:
            monitor-exit(r7)
            return r3
        L_0x00e2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p143l.C5900e.mo20039a():android.graphics.Bitmap");
    }

    /* renamed from: a */
    public synchronized void mo20063a(C5898c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f10764o = 0;
            this.f10761l = cVar;
            this.f10760k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f10753d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f10753d.order(ByteOrder.LITTLE_ENDIAN);
            this.f10763n = false;
            Iterator<C5897b> it = cVar.f10736e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f10727g == 3) {
                        this.f10763n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f10765p = highestOneBit;
            this.f10767r = cVar.f10737f / highestOneBit;
            this.f10766q = cVar.f10738g / highestOneBit;
            this.f10758i = this.f10752c.mo20054b(cVar.f10737f * cVar.f10738g);
            this.f10759j = this.f10752c.mo20053a(this.f10767r * this.f10766q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    /* renamed from: a */
    public void mo20040a(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f10769t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    private Bitmap m11651a(C5897b bVar, C5897b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f10759j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f10762m;
            if (bitmap2 != null) {
                this.f10752c.mo20050a(bitmap2);
            }
            this.f10762m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f10727g == 3 && this.f10762m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f10727g) > 0) {
            if (i2 == 2) {
                if (!bVar.f10726f) {
                    C5898c cVar = this.f10761l;
                    int i4 = cVar.f10743l;
                    if (bVar.f10731k == null || cVar.f10741j != bVar.f10728h) {
                        i3 = i4;
                    }
                } else if (this.f10760k == 0) {
                    this.f10768s = true;
                }
                int i5 = bVar2.f10724d;
                int i6 = this.f10765p;
                int i7 = i5 / i6;
                int i8 = bVar2.f10722b / i6;
                int i9 = bVar2.f10723c / i6;
                int i10 = bVar2.f10721a / i6;
                int i11 = this.f10767r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f10767r;
                }
            } else if (i2 == 3 && (bitmap = this.f10762m) != null) {
                int i16 = this.f10767r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f10766q);
            }
        }
        m11654c(bVar);
        if (bVar.f10725e || this.f10765p != 1) {
            m11652a(bVar);
        } else {
            m11653b(bVar);
        }
        if (this.f10763n && ((i = bVar.f10727g) == 0 || i == 1)) {
            if (this.f10762m == null) {
                this.f10762m = m11655i();
            }
            Bitmap bitmap3 = this.f10762m;
            int i17 = this.f10767r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f10766q);
        }
        Bitmap i18 = m11655i();
        int i19 = this.f10767r;
        i18.setPixels(iArr, 0, i19, 0, 0, i19, this.f10766q);
        return i18;
    }

    /* renamed from: a */
    private void m11652a(C5897b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C5897b bVar2 = bVar;
        int[] iArr = this.f10759j;
        int i6 = bVar2.f10724d;
        int i7 = this.f10765p;
        int i8 = i6 / i7;
        int i9 = bVar2.f10722b / i7;
        int i10 = bVar2.f10723c / i7;
        int i11 = bVar2.f10721a / i7;
        boolean z2 = this.f10760k == 0;
        int i12 = this.f10765p;
        int i13 = this.f10767r;
        int i14 = this.f10766q;
        byte[] bArr = this.f10758i;
        int[] iArr2 = this.f10750a;
        Boolean bool = this.f10768s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f10725e) {
                if (i17 >= i8) {
                    i = i8;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i17 = 2;
                        i15 = 4;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i17 + i15;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z3 = i12 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i2;
                int i25 = i16 * i12 * bVar2.f10723c;
                if (z3) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i9;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z2 && bool2 == null) {
                            bool2 = 1;
                        }
                        i25 += i12;
                        i26++;
                        i9 = i27;
                    }
                } else {
                    i5 = i9;
                    int i29 = ((i23 - i22) * i12) + i25;
                    int i30 = i22;
                    while (true) {
                        i4 = i10;
                        if (i30 >= i23) {
                            break;
                        }
                        int a = m11650a(i25, i29, bVar2.f10723c);
                        if (a != 0) {
                            iArr[i30] = a;
                        } else if (z2 && bool2 == null) {
                            bool2 = 1;
                        }
                        i25 += i12;
                        i30++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i17 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i17 = i3;
        }
        Boolean bool3 = bool;
        if (this.f10768s == null) {
            if (bool3 == null) {
                z = false;
            } else {
                z = bool3.booleanValue();
            }
            this.f10768s = Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private int m11650a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f10765p + i; i9++) {
            byte[] bArr = this.f10758i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f10750a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f10765p + i11; i12++) {
            byte[] bArr2 = this.f10758i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f10750a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }
}
