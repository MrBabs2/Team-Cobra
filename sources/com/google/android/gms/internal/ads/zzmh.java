package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzmh {

    /* renamed from: A */
    private long f22235A;

    /* renamed from: B */
    private long f22236B;

    /* renamed from: C */
    private boolean f22237C;

    /* renamed from: D */
    private long f22238D;

    /* renamed from: E */
    private Method f22239E;

    /* renamed from: F */
    private int f22240F;

    /* renamed from: G */
    private long f22241G;

    /* renamed from: H */
    private long f22242H;

    /* renamed from: I */
    private int f22243I;

    /* renamed from: J */
    private long f22244J;

    /* renamed from: K */
    private long f22245K;

    /* renamed from: L */
    private int f22246L;

    /* renamed from: M */
    private int f22247M;

    /* renamed from: N */
    private long f22248N;

    /* renamed from: O */
    private long f22249O;

    /* renamed from: P */
    private long f22250P;

    /* renamed from: Q */
    private float f22251Q;

    /* renamed from: R */
    private zzlx[] f22252R;

    /* renamed from: S */
    private ByteBuffer[] f22253S;

    /* renamed from: T */
    private ByteBuffer f22254T;

    /* renamed from: U */
    private ByteBuffer f22255U;

    /* renamed from: V */
    private byte[] f22256V;

    /* renamed from: W */
    private int f22257W;

    /* renamed from: X */
    private int f22258X;

    /* renamed from: Y */
    private boolean f22259Y;

    /* renamed from: Z */
    private boolean f22260Z;

    /* renamed from: a */
    private final zzlw f22261a = null;

    /* renamed from: a0 */
    private int f22262a0;

    /* renamed from: b */
    private final g10 f22263b;

    /* renamed from: b0 */
    private boolean f22264b0;

    /* renamed from: c */
    private final zzmx f22265c;

    /* renamed from: c0 */
    private boolean f22266c0;

    /* renamed from: d */
    private final zzlx[] f22267d;

    /* renamed from: d0 */
    private long f22268d0;

    /* renamed from: e */
    private final zzmn f22269e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ConditionVariable f22270f;

    /* renamed from: g */
    private final long[] f22271g;

    /* renamed from: h */
    private final d10 f22272h;

    /* renamed from: i */
    private final LinkedList<f10> f22273i;

    /* renamed from: j */
    private AudioTrack f22274j;

    /* renamed from: k */
    private int f22275k;

    /* renamed from: l */
    private int f22276l;

    /* renamed from: m */
    private int f22277m;

    /* renamed from: n */
    private int f22278n;

    /* renamed from: o */
    private int f22279o;

    /* renamed from: p */
    private boolean f22280p;

    /* renamed from: q */
    private int f22281q;

    /* renamed from: r */
    private long f22282r;

    /* renamed from: s */
    private zzln f22283s;

    /* renamed from: t */
    private zzln f22284t;

    /* renamed from: u */
    private long f22285u;

    /* renamed from: v */
    private long f22286v;

    /* renamed from: w */
    private ByteBuffer f22287w;

    /* renamed from: x */
    private int f22288x;

    /* renamed from: y */
    private int f22289y;

    /* renamed from: z */
    private int f22290z;

    public zzmh(zzlw zzlw, zzlx[] zzlxArr, zzmn zzmn) {
        this.f22269e = zzmn;
        this.f22270f = new ConditionVariable(true);
        if (zzsy.f22671a >= 18) {
            try {
                this.f22239E = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzsy.f22671a >= 19) {
            this.f22272h = new e10();
        } else {
            this.f22272h = new d10((c10) null);
        }
        this.f22263b = new g10();
        this.f22265c = new zzmx();
        zzlx[] zzlxArr2 = new zzlx[(zzlxArr.length + 3)];
        this.f22267d = zzlxArr2;
        zzlxArr2[0] = new j10();
        zzlx[] zzlxArr3 = this.f22267d;
        zzlxArr3[1] = this.f22263b;
        System.arraycopy(zzlxArr, 0, zzlxArr3, 2, zzlxArr.length);
        this.f22267d[zzlxArr.length + 2] = this.f22265c;
        this.f22271g = new long[10];
        this.f22251Q = 1.0f;
        this.f22247M = 0;
        this.f22279o = 3;
        this.f22262a0 = 0;
        this.f22284t = zzln.f22206d;
        this.f22258X = -1;
        this.f22252R = new zzlx[0];
        this.f22253S = new ByteBuffer[0];
        this.f22273i = new LinkedList<>();
    }

    /* renamed from: c */
    private final void m24833c(long j) throws zzmp {
        ByteBuffer byteBuffer;
        int length = this.f22252R.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f22253S[i - 1];
            } else {
                byteBuffer = this.f22254T;
                if (byteBuffer == null) {
                    byteBuffer = zzlx.f22232a;
                }
            }
            if (i == length) {
                m24832b(byteBuffer, j);
            } else {
                zzlx zzlx = this.f22252R[i];
                zzlx.mo25940a(byteBuffer);
                ByteBuffer d = zzlx.mo25945d();
                this.f22253S[i] = d;
                if (d.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    private final boolean m24834k() {
        return this.f22274j != null;
    }

    /* renamed from: l */
    private final void m24835l() {
        this.f22235A = 0;
        this.f22290z = 0;
        this.f22289y = 0;
        this.f22236B = 0;
        this.f22237C = false;
        this.f22238D = 0;
    }

    /* renamed from: m */
    private final void m24836m() {
        ArrayList arrayList = new ArrayList();
        for (zzlx zzlx : this.f22267d) {
            if (zzlx.mo25943b()) {
                arrayList.add(zzlx);
            } else {
                zzlx.flush();
            }
        }
        int size = arrayList.size();
        this.f22252R = (zzlx[]) arrayList.toArray(new zzlx[size]);
        this.f22253S = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            zzlx zzlx2 = this.f22252R[i];
            zzlx2.flush();
            this.f22253S[i] = zzlx2.mo25945d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m24837n() throws com.google.android.gms.internal.ads.zzmp {
        /*
            r9 = this;
            int r0 = r9.f22258X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f22280p
            if (r0 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.zzlx[] r0 = r9.f22252R
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r9.f22258X = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.f22258X
            com.google.android.gms.internal.ads.zzlx[] r5 = r9.f22252R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo25944c()
        L_0x0028:
            r9.m24833c(r7)
            boolean r0 = r4.mo25949n()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f22258X
            int r0 = r0 + r2
            r9.f22258X = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f22255U
            if (r0 == 0) goto L_0x0044
            r9.m24832b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f22255U
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f22258X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.m24837n():boolean");
    }

    /* renamed from: o */
    private final void m24838o() {
        if (!m24834k()) {
            return;
        }
        if (zzsy.f22671a >= 21) {
            this.f22274j.setVolume(this.f22251Q);
            return;
        }
        AudioTrack audioTrack = this.f22274j;
        float f = this.f22251Q;
        audioTrack.setStereoVolume(f, f);
    }

    /* renamed from: p */
    private final long m24839p() {
        return this.f22280p ? this.f22245K : this.f22244J / ((long) this.f22243I);
    }

    /* renamed from: q */
    private final boolean m24840q() {
        if (zzsy.f22671a >= 23) {
            return false;
        }
        int i = this.f22278n;
        return i == 5 || i == 6;
    }

    /* renamed from: a */
    public final boolean mo29513a(String str) {
        zzlw zzlw = this.f22261a;
        return zzlw != null && zzlw.mo29491a(m24830b(str));
    }

    /* renamed from: b */
    public final void mo29515b() {
        this.f22260Z = true;
        if (m24834k()) {
            this.f22249O = System.nanoTime() / 1000;
            this.f22274j.play();
        }
    }

    /* renamed from: d */
    public final void mo29518d() {
        if (m24834k()) {
            this.f22241G = 0;
            this.f22242H = 0;
            this.f22244J = 0;
            this.f22245K = 0;
            this.f22246L = 0;
            zzln zzln = this.f22283s;
            if (zzln != null) {
                this.f22284t = zzln;
                this.f22283s = null;
            } else if (!this.f22273i.isEmpty()) {
                this.f22284t = this.f22273i.getLast().f15176a;
            }
            this.f22273i.clear();
            this.f22285u = 0;
            this.f22286v = 0;
            this.f22254T = null;
            this.f22255U = null;
            int i = 0;
            while (true) {
                zzlx[] zzlxArr = this.f22252R;
                if (i >= zzlxArr.length) {
                    break;
                }
                zzlx zzlx = zzlxArr[i];
                zzlx.flush();
                this.f22253S[i] = zzlx.mo25945d();
                i++;
            }
            this.f22259Y = false;
            this.f22258X = -1;
            this.f22287w = null;
            this.f22288x = 0;
            this.f22247M = 0;
            this.f22250P = 0;
            m24835l();
            if (this.f22274j.getPlayState() == 3) {
                this.f22274j.pause();
            }
            AudioTrack audioTrack = this.f22274j;
            this.f22274j = null;
            this.f22272h.mo25807a((AudioTrack) null, false);
            this.f22270f.close();
            new c10(this, audioTrack).start();
        }
    }

    /* renamed from: e */
    public final boolean mo29519e() {
        if (m24834k()) {
            return this.f22259Y && !mo29521g();
        }
        return true;
    }

    /* renamed from: f */
    public final void mo29520f() {
        if (this.f22247M == 1) {
            this.f22247M = 2;
        }
    }

    /* renamed from: g */
    public final boolean mo29521g() {
        if (m24834k()) {
            if (m24839p() <= this.f22272h.mo25809c()) {
                if (m24840q() && this.f22274j.getPlayState() == 2 && this.f22274j.getPlaybackHeadPosition() == 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo29522h() throws zzmp {
        if (!this.f22259Y && m24834k() && m24837n()) {
            this.f22272h.mo25806a(m24839p());
            this.f22288x = 0;
            this.f22259Y = true;
        }
    }

    /* renamed from: i */
    public final zzln mo29523i() {
        return this.f22284t;
    }

    /* renamed from: j */
    public final void mo29524j() {
        if (this.f22264b0) {
            this.f22264b0 = false;
            this.f22262a0 = 0;
            mo29518d();
        }
    }

    /* renamed from: a */
    public final long mo29507a(boolean z) {
        long j;
        long j2;
        long j3;
        long j4;
        if (!(m24834k() && this.f22247M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f22274j.getPlayState() == 3) {
            long b = this.f22272h.mo25808b();
            if (b != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f22236B >= 30000) {
                    long[] jArr = this.f22271g;
                    int i = this.f22289y;
                    jArr[i] = b - nanoTime;
                    this.f22289y = (i + 1) % 10;
                    int i2 = this.f22290z;
                    if (i2 < 10) {
                        this.f22290z = i2 + 1;
                    }
                    this.f22236B = nanoTime;
                    this.f22235A = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f22290z;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f22235A += this.f22271g[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!m24840q() && nanoTime - this.f22238D >= 500000) {
                    boolean d = this.f22272h.mo25810d();
                    this.f22237C = d;
                    if (d) {
                        long e = this.f22272h.mo25811e() / 1000;
                        long f = this.f22272h.mo25812f();
                        if (e < this.f22249O) {
                            this.f22237C = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(f);
                            sb.append(", ");
                            sb.append(e);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(b);
                            Log.w("AudioTrack", sb.toString());
                            this.f22237C = false;
                        } else if (Math.abs(m24828a(f) - b) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(f);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(b);
                            Log.w("AudioTrack", sb2.toString());
                            this.f22237C = false;
                        }
                    }
                    Method method = this.f22239E;
                    if (method != null && !this.f22280p) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f22274j, (Object[]) null)).intValue()) * 1000) - this.f22282r;
                            this.f22250P = intValue;
                            long max = Math.max(intValue, 0);
                            this.f22250P = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.f22250P = 0;
                            }
                        } catch (Exception unused) {
                            this.f22239E = null;
                        }
                    }
                    this.f22238D = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f22237C) {
            j = m24828a(this.f22272h.mo25812f() + m24831b(nanoTime2 - (this.f22272h.mo25811e() / 1000)));
        } else {
            if (this.f22290z == 0) {
                j = this.f22272h.mo25808b();
            } else {
                j = nanoTime2 + this.f22235A;
            }
            if (!z) {
                j -= this.f22250P;
            }
        }
        long j5 = this.f22248N;
        while (!this.f22273i.isEmpty() && j >= this.f22273i.getFirst().f15178c) {
            f10 remove = this.f22273i.remove();
            this.f22284t = remove.f15176a;
            this.f22286v = remove.f15178c;
            this.f22285u = remove.f15177b - this.f22248N;
        }
        if (this.f22284t.f22207a == 1.0f) {
            j2 = (j + this.f22285u) - this.f22286v;
        } else {
            if (!this.f22273i.isEmpty() || this.f22265c.mo29539h() < 1024) {
                j3 = this.f22285u;
                double d2 = (double) this.f22284t.f22207a;
                double d3 = (double) (j - this.f22286v);
                Double.isNaN(d2);
                Double.isNaN(d3);
                j4 = (long) (d2 * d3);
            } else {
                j3 = this.f22285u;
                j4 = zzsy.m25284a(j - this.f22286v, this.f22265c.mo29538g(), this.f22265c.mo29539h());
            }
            j2 = j4 + j3;
        }
        return j5 + j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r11 < r10) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m24832b(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzmp {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f22255U
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            com.google.android.gms.internal.ads.zzsk.m25216a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r8.f22255U = r9
            int r0 = com.google.android.gms.internal.ads.zzsy.f22671a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.f22256V
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.f22256V = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.f22256V
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f22257W = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.google.android.gms.internal.ads.zzsy.f22671a
            if (r4 >= r2) goto L_0x0079
            long r10 = r8.f22244J
            com.google.android.gms.internal.ads.d10 r2 = r8.f22272h
            long r4 = r2.mo25809c()
            int r2 = r8.f22243I
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r11 = (int) r10
            int r10 = r8.f22281q
            int r10 = r10 - r11
            if (r10 <= 0) goto L_0x0076
            int r10 = java.lang.Math.min(r0, r10)
            android.media.AudioTrack r11 = r8.f22274j
            byte[] r2 = r8.f22256V
            int r4 = r8.f22257W
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00f0
            int r11 = r8.f22257W
            int r11 = r11 + r10
            r8.f22257W = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00f0
        L_0x0076:
            r10 = 0
            goto L_0x00f0
        L_0x0079:
            boolean r2 = r8.f22264b0
            if (r2 == 0) goto L_0x00ea
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0088
            r2 = 1
            goto L_0x0089
        L_0x0088:
            r2 = 0
        L_0x0089:
            com.google.android.gms.internal.ads.zzsk.m25218b(r2)
            android.media.AudioTrack r2 = r8.f22274j
            java.nio.ByteBuffer r4 = r8.f22287w
            if (r4 != 0) goto L_0x00a7
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f22287w = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f22287w
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a7:
            int r4 = r8.f22288x
            if (r4 != 0) goto L_0x00c3
            java.nio.ByteBuffer r4 = r8.f22287w
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f22287w
            r5 = 8
            r6 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r6
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f22287w
            r10.position(r3)
            r8.f22288x = r0
        L_0x00c3:
            java.nio.ByteBuffer r10 = r8.f22287w
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00da
            java.nio.ByteBuffer r11 = r8.f22287w
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d7
            r8.f22288x = r3
            r10 = r11
            goto L_0x00f0
        L_0x00d7:
            if (r11 >= r10) goto L_0x00da
            goto L_0x0076
        L_0x00da:
            int r9 = r2.write(r9, r0, r1)
            if (r9 >= 0) goto L_0x00e3
            r8.f22288x = r3
            goto L_0x00e8
        L_0x00e3:
            int r10 = r8.f22288x
            int r10 = r10 - r9
            r8.f22288x = r10
        L_0x00e8:
            r10 = r9
            goto L_0x00f0
        L_0x00ea:
            android.media.AudioTrack r10 = r8.f22274j
            int r10 = r10.write(r9, r0, r1)
        L_0x00f0:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f22268d0 = r4
            if (r10 < 0) goto L_0x0115
            boolean r9 = r8.f22280p
            if (r9 != 0) goto L_0x0102
            long r4 = r8.f22244J
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f22244J = r4
        L_0x0102:
            if (r10 != r0) goto L_0x0114
            boolean r9 = r8.f22280p
            if (r9 == 0) goto L_0x0110
            long r9 = r8.f22245K
            int r11 = r8.f22246L
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f22245K = r9
        L_0x0110:
            r9 = 0
            r8.f22255U = r9
            return r1
        L_0x0114:
            return r3
        L_0x0115:
            com.google.android.gms.internal.ads.zzmp r9 = new com.google.android.gms.internal.ads.zzmp
            r9.<init>(r10)
            goto L_0x011c
        L_0x011b:
            throw r9
        L_0x011c:
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.m24832b(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: c */
    public final void mo29517c() {
        mo29518d();
        for (zzlx a : this.f22267d) {
            a.mo25939a();
        }
        this.f22262a0 = 0;
        this.f22260Z = false;
    }

    /* renamed from: b */
    public final void mo29516b(int i) {
        zzsk.m25218b(zzsy.f22671a >= 21);
        if (!this.f22264b0 || this.f22262a0 != i) {
            this.f22264b0 = true;
            this.f22262a0 = i;
            mo29518d();
        }
    }

    /* renamed from: b */
    private final long m24831b(long j) {
        return (j * ((long) this.f22275k)) / 1000000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m24830b(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L_0x002a;
                case 187078296: goto L_0x0020;
                case 1504578661: goto L_0x0016;
                case 1505942594: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 3
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0045
            if (r5 == r4) goto L_0x0043
            if (r5 == r3) goto L_0x0041
            if (r5 == r2) goto L_0x003e
            return r1
        L_0x003e:
            r5 = 8
            return r5
        L_0x0041:
            r5 = 7
            return r5
        L_0x0043:
            r5 = 6
            return r5
        L_0x0045:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.m24830b(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29512a(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws com.google.android.gms.internal.ads.zzml {
        /*
            r7 = this;
            java.lang.String r12 = "audio/raw"
            boolean r12 = r12.equals(r8)
            r0 = 1
            r12 = r12 ^ r0
            if (r12 == 0) goto L_0x000f
            int r8 = m24830b((java.lang.String) r8)
            goto L_0x0010
        L_0x000f:
            r8 = r11
        L_0x0010:
            r1 = 0
            if (r12 != 0) goto L_0x004a
            int r11 = com.google.android.gms.internal.ads.zzsy.m25291b(r11, r9)
            r7.f22240F = r11
            com.google.android.gms.internal.ads.g10 r11 = r7.f22263b
            r11.mo25941a((int[]) r13)
            com.google.android.gms.internal.ads.zzlx[] r11 = r7.f22267d
            int r13 = r11.length
            r2 = 0
            r3 = 0
        L_0x0023:
            if (r2 >= r13) goto L_0x0044
            r4 = r11[r2]
            boolean r5 = r4.mo25942a(r10, r9, r8)     // Catch:{ zzly -> 0x003d }
            r3 = r3 | r5
            boolean r5 = r4.mo25943b()
            if (r5 == 0) goto L_0x003a
            int r9 = r4.mo25946e()
            int r8 = r4.mo25947f()
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003d:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzml r9 = new com.google.android.gms.internal.ads.zzml
            r9.<init>((java.lang.Throwable) r8)
            throw r9
        L_0x0044:
            if (r3 == 0) goto L_0x004b
            r7.m24836m()
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            r11 = 252(0xfc, float:3.53E-43)
            r13 = 12
            switch(r9) {
                case 1: goto L_0x0080;
                case 2: goto L_0x007d;
                case 3: goto L_0x007a;
                case 4: goto L_0x0077;
                case 5: goto L_0x0074;
                case 6: goto L_0x0071;
                case 7: goto L_0x006e;
                case 8: goto L_0x006b;
                default: goto L_0x0052;
            }
        L_0x0052:
            com.google.android.gms.internal.ads.zzml r8 = new com.google.android.gms.internal.ads.zzml
            r10 = 38
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            java.lang.String r10 = "Unsupported channel count: "
            r11.append(r10)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r8.<init>((java.lang.String) r9)
            throw r8
        L_0x006b:
            int r2 = com.google.android.gms.internal.ads.zzkt.f22163a
            goto L_0x0081
        L_0x006e:
            r2 = 1276(0x4fc, float:1.788E-42)
            goto L_0x0081
        L_0x0071:
            r2 = 252(0xfc, float:3.53E-43)
            goto L_0x0081
        L_0x0074:
            r2 = 220(0xdc, float:3.08E-43)
            goto L_0x0081
        L_0x0077:
            r2 = 204(0xcc, float:2.86E-43)
            goto L_0x0081
        L_0x007a:
            r2 = 28
            goto L_0x0081
        L_0x007d:
            r2 = 12
            goto L_0x0081
        L_0x0080:
            r2 = 4
        L_0x0081:
            int r4 = com.google.android.gms.internal.ads.zzsy.f22671a
            r5 = 23
            r6 = 5
            if (r4 > r5) goto L_0x00a8
            java.lang.String r4 = com.google.android.gms.internal.ads.zzsy.f22672b
            java.lang.String r5 = "foster"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = com.google.android.gms.internal.ads.zzsy.f22673c
            java.lang.String r5 = "NVIDIA"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00a8
            r4 = 3
            if (r9 == r4) goto L_0x00a9
            if (r9 == r6) goto L_0x00a9
            r11 = 7
            if (r9 == r11) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            int r11 = com.google.android.gms.internal.ads.zzkt.f22163a
            goto L_0x00a9
        L_0x00a8:
            r11 = r2
        L_0x00a9:
            int r2 = com.google.android.gms.internal.ads.zzsy.f22671a
            r4 = 25
            if (r2 > r4) goto L_0x00be
            java.lang.String r2 = com.google.android.gms.internal.ads.zzsy.f22672b
            java.lang.String r4 = "fugu"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00be
            if (r12 == 0) goto L_0x00be
            if (r9 != r0) goto L_0x00be
            goto L_0x00bf
        L_0x00be:
            r13 = r11
        L_0x00bf:
            if (r3 != 0) goto L_0x00d4
            boolean r11 = r7.m24834k()
            if (r11 == 0) goto L_0x00d4
            int r11 = r7.f22277m
            if (r11 != r8) goto L_0x00d4
            int r11 = r7.f22275k
            if (r11 != r10) goto L_0x00d4
            int r11 = r7.f22276l
            if (r11 != r13) goto L_0x00d4
            return
        L_0x00d4:
            r7.mo29518d()
            r7.f22277m = r8
            r7.f22280p = r12
            r7.f22275k = r10
            r7.f22276l = r13
            r11 = 2
            if (r12 == 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r8 = 2
        L_0x00e4:
            r7.f22278n = r8
            int r8 = com.google.android.gms.internal.ads.zzsy.m25291b(r11, r9)
            r7.f22243I = r8
            if (r12 == 0) goto L_0x00fd
            int r8 = r7.f22278n
            if (r8 == r6) goto L_0x00fa
            r9 = 6
            if (r8 != r9) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            r8 = 49152(0xc000, float:6.8877E-41)
            goto L_0x0133
        L_0x00fa:
            r8 = 20480(0x5000, float:2.8699E-41)
            goto L_0x0133
        L_0x00fd:
            int r8 = r7.f22278n
            int r8 = android.media.AudioTrack.getMinBufferSize(r10, r13, r8)
            r9 = -2
            if (r8 == r9) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            com.google.android.gms.internal.ads.zzsk.m25218b(r0)
            int r9 = r8 << 2
            r10 = 250000(0x3d090, double:1.235164E-318)
            long r10 = r7.m24831b((long) r10)
            int r11 = (int) r10
            int r10 = r7.f22243I
            int r10 = r10 * r11
            long r0 = (long) r8
            r2 = 750000(0xb71b0, double:3.70549E-318)
            long r2 = r7.m24831b((long) r2)
            int r8 = r7.f22243I
            long r4 = (long) r8
            long r2 = r2 * r4
            long r0 = java.lang.Math.max(r0, r2)
            int r8 = (int) r0
            if (r9 >= r10) goto L_0x012f
            r8 = r10
            goto L_0x0133
        L_0x012f:
            if (r9 <= r8) goto L_0x0132
            goto L_0x0133
        L_0x0132:
            r8 = r9
        L_0x0133:
            r7.f22281q = r8
            if (r12 == 0) goto L_0x013d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0145
        L_0x013d:
            int r9 = r7.f22243I
            int r8 = r8 / r9
            long r8 = (long) r8
            long r8 = r7.m24828a((long) r8)
        L_0x0145:
            r7.f22282r = r8
            com.google.android.gms.internal.ads.zzln r8 = r7.f22284t
            r7.mo29508a((com.google.android.gms.internal.ads.zzln) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.mo29512a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: a */
    public final boolean mo29514a(ByteBuffer byteBuffer, long j) throws zzmm, zzmp {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f22254T;
        zzsk.m25216a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!m24834k()) {
            this.f22270f.block();
            if (this.f22264b0) {
                this.f22274j = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f22276l).setEncoding(this.f22278n).setSampleRate(this.f22275k).build(), this.f22281q, 1, this.f22262a0);
            } else if (this.f22262a0 == 0) {
                this.f22274j = new AudioTrack(this.f22279o, this.f22275k, this.f22276l, this.f22278n, this.f22281q, 1);
            } else {
                this.f22274j = new AudioTrack(this.f22279o, this.f22275k, this.f22276l, this.f22278n, this.f22281q, 1, this.f22262a0);
            }
            int state = this.f22274j.getState();
            if (state == 1) {
                int audioSessionId = this.f22274j.getAudioSessionId();
                if (this.f22262a0 != audioSessionId) {
                    this.f22262a0 = audioSessionId;
                    this.f22269e.mo26067a(audioSessionId);
                }
                this.f22272h.mo25807a(this.f22274j, m24840q());
                m24838o();
                this.f22266c0 = false;
                if (this.f22260Z) {
                    mo29515b();
                }
            } else {
                try {
                    this.f22274j.release();
                } catch (Exception unused) {
                } finally {
                    this.f22274j = null;
                }
                throw new zzmm(state, this.f22275k, this.f22276l, this.f22281q);
            }
        }
        if (m24840q()) {
            if (this.f22274j.getPlayState() == 2) {
                this.f22266c0 = false;
                return false;
            } else if (this.f22274j.getPlayState() == 1 && this.f22272h.mo25809c() != 0) {
                return false;
            }
        }
        boolean z = this.f22266c0;
        boolean g = mo29521g();
        this.f22266c0 = g;
        if (z && !g && this.f22274j.getPlayState() != 1) {
            this.f22269e.mo26068a(this.f22281q, zzkt.m24719a(this.f22282r), SystemClock.elapsedRealtime() - this.f22268d0);
        }
        if (this.f22254T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f22280p && this.f22246L == 0) {
                int i3 = this.f22278n;
                if (i3 == 7 || i3 == 8) {
                    i2 = zzmr.m24862a(byteBuffer);
                } else if (i3 == 5) {
                    i2 = zzlv.m24800a();
                } else if (i3 == 6) {
                    i2 = zzlv.m24801a(byteBuffer);
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unexpected audio encoding: ");
                    sb.append(i3);
                    throw new IllegalStateException(sb.toString());
                }
                this.f22246L = i2;
            }
            if (this.f22283s != null) {
                if (!m24837n()) {
                    return false;
                }
                LinkedList<f10> linkedList = this.f22273i;
                f10 f10 = r11;
                f10 f102 = new f10(this.f22283s, Math.max(0, j2), m24828a(m24839p()), (c10) null);
                linkedList.add(f10);
                this.f22283s = null;
                m24836m();
            }
            if (this.f22247M == 0) {
                this.f22248N = Math.max(0, j2);
                this.f22247M = 1;
            } else {
                long a = this.f22248N + m24828a(this.f22280p ? this.f22242H : this.f22241G / ((long) this.f22240F));
                if (this.f22247M != 1 || Math.abs(a - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(a);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i = 2;
                    this.f22247M = 2;
                }
                if (this.f22247M == i) {
                    this.f22248N += j2 - a;
                    this.f22247M = 1;
                    this.f22269e.mo26066a();
                }
            }
            if (this.f22280p) {
                this.f22242H += (long) this.f22246L;
            } else {
                this.f22241G += (long) byteBuffer.remaining();
            }
            this.f22254T = byteBuffer2;
        }
        if (this.f22280p) {
            m24832b(this.f22254T, j2);
        } else {
            m24833c(j2);
        }
        if (this.f22254T.hasRemaining()) {
            return false;
        }
        this.f22254T = null;
        return true;
    }

    /* renamed from: a */
    public final zzln mo29508a(zzln zzln) {
        if (this.f22280p) {
            zzln zzln2 = zzln.f22206d;
            this.f22284t = zzln2;
            return zzln2;
        }
        float a = this.f22265c.mo29536a(zzln.f22207a);
        zzmx zzmx = this.f22265c;
        float f = zzln.f22208b;
        zzmx.mo29537b(f);
        zzln zzln3 = new zzln(a, f);
        zzln zzln4 = this.f22283s;
        if (zzln4 == null) {
            if (!this.f22273i.isEmpty()) {
                zzln4 = this.f22273i.getLast().f15176a;
            } else {
                zzln4 = this.f22284t;
            }
        }
        if (!zzln3.equals(zzln4)) {
            if (m24834k()) {
                this.f22283s = zzln3;
            } else {
                this.f22284t = zzln3;
            }
        }
        return this.f22284t;
    }

    /* renamed from: a */
    public final void mo29511a(int i) {
        if (this.f22279o != i) {
            this.f22279o = i;
            if (!this.f22264b0) {
                mo29518d();
                this.f22262a0 = 0;
            }
        }
    }

    /* renamed from: a */
    public final void mo29510a(float f) {
        if (this.f22251Q != f) {
            this.f22251Q = f;
            m24838o();
        }
    }

    /* renamed from: a */
    public final void mo29509a() {
        this.f22260Z = false;
        if (m24834k()) {
            m24835l();
            this.f22272h.mo25805a();
        }
    }

    /* renamed from: a */
    private final long m24828a(long j) {
        return (j * 1000000) / ((long) this.f22275k);
    }
}
