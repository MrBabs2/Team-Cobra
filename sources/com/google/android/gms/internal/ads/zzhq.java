package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;

@TargetApi(16)
public final class zzhq {

    /* renamed from: A */
    private boolean f21969A;

    /* renamed from: B */
    private int f21970B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ConditionVariable f21971a = new ConditionVariable(true);

    /* renamed from: b */
    private final long[] f21972b;

    /* renamed from: c */
    private final C7861pz f21973c;

    /* renamed from: d */
    private AudioTrack f21974d;

    /* renamed from: e */
    private int f21975e;

    /* renamed from: f */
    private int f21976f;

    /* renamed from: g */
    private int f21977g;

    /* renamed from: h */
    private int f21978h;

    /* renamed from: i */
    private int f21979i;

    /* renamed from: j */
    private int f21980j;

    /* renamed from: k */
    private int f21981k;

    /* renamed from: l */
    private int f21982l;

    /* renamed from: m */
    private long f21983m;

    /* renamed from: n */
    private long f21984n;

    /* renamed from: o */
    private boolean f21985o;

    /* renamed from: p */
    private long f21986p;

    /* renamed from: q */
    private Method f21987q;

    /* renamed from: r */
    private long f21988r;

    /* renamed from: s */
    private int f21989s;

    /* renamed from: t */
    private long f21990t;

    /* renamed from: u */
    private long f21991u;

    /* renamed from: v */
    private long f21992v;

    /* renamed from: w */
    private float f21993w;

    /* renamed from: x */
    private byte[] f21994x;

    /* renamed from: y */
    private int f21995y;

    /* renamed from: z */
    private int f21996z;

    public zzhq() {
        if (zzkq.f22154a >= 18) {
            try {
                this.f21987q = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzkq.f22154a >= 19) {
            this.f21973c = new C7898qz();
        } else {
            this.f21973c = new C7861pz((C7824oz) null);
        }
        this.f21972b = new long[10];
        this.f21993w = 1.0f;
        this.f21989s = 0;
    }

    /* renamed from: h */
    private final void m24522h() {
        this.f21983m = 0;
        this.f21982l = 0;
        this.f21981k = 0;
        this.f21984n = 0;
        this.f21985o = false;
        this.f21986p = 0;
    }

    /* renamed from: a */
    public final boolean mo29352a() {
        return this.f21974d != null;
    }

    /* renamed from: b */
    public final void mo29353b() {
        if (mo29352a()) {
            m24522h();
            this.f21974d.pause();
        }
    }

    /* renamed from: c */
    public final void mo29354c() {
        if (mo29352a()) {
            this.f21991u = System.nanoTime() / 1000;
            this.f21974d.play();
        }
    }

    /* renamed from: d */
    public final void mo29355d() {
        if (mo29352a()) {
            this.f21988r = 0;
            this.f21996z = 0;
            this.f21990t = 0;
            this.f21992v = 0;
            m24522h();
            if (this.f21974d.getPlayState() == 3) {
                this.f21974d.pause();
            }
            AudioTrack audioTrack = this.f21974d;
            this.f21974d = null;
            this.f21973c.mo26447a((AudioTrack) null, false);
            this.f21971a.close();
            new C7824oz(this, audioTrack).start();
        }
    }

    /* renamed from: e */
    public final void mo29356e() {
        if (this.f21989s == 1) {
            this.f21989s = 2;
        }
    }

    /* renamed from: f */
    public final boolean mo29357f() {
        if (mo29352a()) {
            return m24518a(this.f21988r) > this.f21973c.mo26449b() || this.f21973c.mo26448a();
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo29358g() {
        return this.f21988r > ((long) ((this.f21979i * 3) / 2));
    }

    /* renamed from: a */
    public final long mo29349a(boolean z) {
        long j;
        long j2;
        if (!(mo29352a() && this.f21990t != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f21974d.getPlayState() == 3) {
            long c = this.f21973c.mo26450c();
            if (c != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.f21984n >= 30000) {
                    long[] jArr = this.f21972b;
                    int i = this.f21981k;
                    jArr[i] = c - nanoTime;
                    this.f21981k = (i + 1) % 10;
                    int i2 = this.f21982l;
                    if (i2 < 10) {
                        this.f21982l = i2 + 1;
                    }
                    this.f21984n = nanoTime;
                    this.f21983m = 0;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.f21982l;
                        if (i3 >= i4) {
                            break;
                        }
                        this.f21983m += this.f21972b[i3] / ((long) i4);
                        i3++;
                    }
                }
                if (!this.f21969A && nanoTime - this.f21986p >= 500000) {
                    boolean d = this.f21973c.mo26451d();
                    this.f21985o = d;
                    if (d) {
                        long e = this.f21973c.mo26452e() / 1000;
                        long f = this.f21973c.mo26453f();
                        if (e < this.f21991u) {
                            this.f21985o = false;
                        } else if (Math.abs(e - nanoTime) > 5000000) {
                            this.f21985o = false;
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(f);
                            sb.append(", ");
                            sb.append(e);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(c);
                            Log.w("AudioTrack", sb.toString());
                        } else if (Math.abs(m24520b(f) - c) > 5000000) {
                            this.f21985o = false;
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(f);
                            sb2.append(", ");
                            sb2.append(e);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(c);
                            Log.w("AudioTrack", sb2.toString());
                        }
                    }
                    Method method = this.f21987q;
                    if (method != null) {
                        try {
                            long intValue = (((long) ((Integer) method.invoke(this.f21974d, (Object[]) null)).intValue()) * 1000) - m24520b(m24518a((long) this.f21980j));
                            this.f21992v = intValue;
                            long max = Math.max(intValue, 0);
                            this.f21992v = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("AudioTrack", sb3.toString());
                                this.f21992v = 0;
                            }
                        } catch (Exception unused) {
                            this.f21987q = null;
                        }
                    }
                    this.f21986p = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.f21985o) {
            return m24520b(this.f21973c.mo26453f() + m24521c(nanoTime2 - (this.f21973c.mo26452e() / 1000))) + this.f21990t;
        }
        if (this.f21982l == 0) {
            j2 = this.f21973c.mo26450c();
            j = this.f21990t;
        } else {
            j2 = nanoTime2 + this.f21983m;
            j = this.f21990t;
        }
        long j3 = j2 + j;
        return !z ? j3 - this.f21992v : j3;
    }

    /* renamed from: b */
    private final long m24520b(long j) {
        return (j * 1000000) / ((long) this.f21975e);
    }

    /* renamed from: c */
    private final long m24521c(long j) {
        return (j * ((long) this.f21975e)) / 1000000;
    }

    /* renamed from: a */
    public final int mo29347a(int i) throws zzhu {
        this.f21971a.block();
        if (i == 0) {
            this.f21974d = new AudioTrack(3, this.f21975e, this.f21976f, this.f21977g, this.f21980j, 1);
        } else {
            this.f21974d = new AudioTrack(3, this.f21975e, this.f21976f, this.f21977g, this.f21980j, 1, i);
        }
        int state = this.f21974d.getState();
        if (state == 1) {
            int audioSessionId = this.f21974d.getAudioSessionId();
            this.f21973c.mo26447a(this.f21974d, this.f21969A);
            mo29350a(this.f21993w);
            return audioSessionId;
        }
        try {
            this.f21974d.release();
        } catch (Exception unused) {
        } finally {
            this.f21974d = null;
        }
        throw new zzhu(state, this.f21975e, this.f21976f, this.f21980j);
    }

    /* renamed from: a */
    public final void mo29351a(MediaFormat mediaFormat, int i) {
        int i2;
        int i3;
        int integer = mediaFormat.getInteger("channel-count");
        boolean z = true;
        if (integer == 1) {
            i2 = 4;
        } else if (integer == 2) {
            i2 = 12;
        } else if (integer == 6) {
            i2 = 252;
        } else if (integer == 8) {
            i2 = 1020;
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unsupported channel count: ");
            sb.append(integer);
            throw new IllegalArgumentException(sb.toString());
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        String string = mediaFormat.getString("mime");
        if ("audio/ac3".equals(string)) {
            i3 = 5;
        } else if ("audio/eac3".equals(string)) {
            i3 = 6;
        } else {
            i3 = zzkl.m24667b(string) ? 2 : 0;
        }
        boolean z2 = i3 == 5 || i3 == 6;
        if (!mo29352a() || this.f21975e != integer2 || this.f21976f != i2 || this.f21969A || z2) {
            mo29355d();
            this.f21977g = i3;
            this.f21975e = integer2;
            this.f21976f = i2;
            this.f21969A = z2;
            this.f21970B = 0;
            this.f21978h = integer * 2;
            int minBufferSize = AudioTrack.getMinBufferSize(integer2, i2, i3);
            this.f21979i = minBufferSize;
            if (minBufferSize == -2) {
                z = false;
            }
            zzkh.m24659b(z);
            int i4 = this.f21979i << 2;
            int c = ((int) m24521c(250000)) * this.f21978h;
            int max = (int) Math.max((long) this.f21979i, m24521c(750000) * ((long) this.f21978h));
            if (i4 < c) {
                i4 = c;
            } else if (i4 > max) {
                i4 = max;
            }
            this.f21980j = i4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0118  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29348a(java.nio.ByteBuffer r11, int r12, int r13, long r14) throws com.google.android.gms.internal.ads.zzhv {
        /*
            r10 = this;
            r0 = 2
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = com.google.android.gms.internal.ads.zzkq.f22154a
            r2 = 22
            r3 = 0
            r5 = 1
            r6 = 0
            if (r1 > r2) goto L_0x002e
            boolean r1 = r10.f21969A
            if (r1 == 0) goto L_0x002e
            android.media.AudioTrack r1 = r10.f21974d
            int r1 = r1.getPlayState()
            if (r1 != r0) goto L_0x001b
            return r6
        L_0x001b:
            android.media.AudioTrack r1 = r10.f21974d
            int r1 = r1.getPlayState()
            if (r1 != r5) goto L_0x002e
            com.google.android.gms.internal.ads.pz r1 = r10.f21973c
            long r1 = r1.mo26449b()
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x002e
            return r6
        L_0x002e:
            int r1 = r10.f21996z
            if (r1 != 0) goto L_0x00ac
            boolean r1 = r10.f21969A
            if (r1 == 0) goto L_0x0042
            int r1 = r10.f21970B
            if (r1 != 0) goto L_0x0042
            int r1 = r10.f21975e
            int r1 = com.google.android.gms.internal.ads.zzkg.m24653a(r13, r1)
            r10.f21970B = r1
        L_0x0042:
            long r1 = (long) r13
            long r1 = r10.m24518a((long) r1)
            long r1 = r10.m24520b(r1)
            long r14 = r14 - r1
            long r1 = r10.f21990t
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x005b
            long r14 = java.lang.Math.max(r3, r14)
            r10.f21990t = r14
            r10.f21989s = r5
            goto L_0x00ac
        L_0x005b:
            long r3 = r10.f21988r
            long r3 = r10.m24518a((long) r3)
            long r3 = r10.m24520b(r3)
            long r1 = r1 + r3
            int r3 = r10.f21989s
            if (r3 != r5) goto L_0x009e
            long r3 = r1 - r14
            long r3 = java.lang.Math.abs(r3)
            r7 = 200000(0x30d40, double:9.8813E-319)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x009e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 80
            r3.<init>(r4)
            java.lang.String r4 = "Discontinuity detected [expected "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", got "
            r3.append(r4)
            r3.append(r14)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "AudioTrack"
            android.util.Log.e(r4, r3)
            r10.f21989s = r0
        L_0x009e:
            int r3 = r10.f21989s
            if (r3 != r0) goto L_0x00ac
            long r3 = r10.f21990t
            long r14 = r14 - r1
            long r3 = r3 + r14
            r10.f21990t = r3
            r10.f21989s = r5
            r14 = 1
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            int r15 = r10.f21996z
            r0 = 21
            if (r15 != 0) goto L_0x00ce
            r10.f21996z = r13
            r11.position(r12)
            int r12 = com.google.android.gms.internal.ads.zzkq.f22154a
            if (r12 >= r0) goto L_0x00ce
            byte[] r12 = r10.f21994x
            if (r12 == 0) goto L_0x00c3
            int r12 = r12.length
            if (r12 >= r13) goto L_0x00c7
        L_0x00c3:
            byte[] r12 = new byte[r13]
            r10.f21994x = r12
        L_0x00c7:
            byte[] r12 = r10.f21994x
            r11.get(r12, r6, r13)
            r10.f21995y = r6
        L_0x00ce:
            int r12 = com.google.android.gms.internal.ads.zzkq.f22154a
            if (r12 >= r0) goto L_0x00fe
            long r11 = r10.f21988r
            com.google.android.gms.internal.ads.pz r13 = r10.f21973c
            long r0 = r13.mo26449b()
            int r13 = r10.f21978h
            long r2 = (long) r13
            long r0 = r0 * r2
            long r11 = r11 - r0
            int r12 = (int) r11
            int r11 = r10.f21980j
            int r11 = r11 - r12
            if (r11 <= 0) goto L_0x0106
            int r12 = r10.f21996z
            int r11 = java.lang.Math.min(r12, r11)
            android.media.AudioTrack r12 = r10.f21974d
            byte[] r13 = r10.f21994x
            int r15 = r10.f21995y
            int r6 = r12.write(r13, r15, r11)
            if (r6 < 0) goto L_0x0106
            int r11 = r10.f21995y
            int r11 = r11 + r6
            r10.f21995y = r11
            goto L_0x0106
        L_0x00fe:
            android.media.AudioTrack r12 = r10.f21974d
            int r13 = r10.f21996z
            int r6 = r12.write(r11, r13, r5)
        L_0x0106:
            if (r6 < 0) goto L_0x0118
            int r11 = r10.f21996z
            int r11 = r11 - r6
            r10.f21996z = r11
            long r12 = r10.f21988r
            long r0 = (long) r6
            long r12 = r12 + r0
            r10.f21988r = r12
            if (r11 != 0) goto L_0x0117
            r14 = r14 | 2
        L_0x0117:
            return r14
        L_0x0118:
            com.google.android.gms.internal.ads.zzhv r11 = new com.google.android.gms.internal.ads.zzhv
            r11.<init>(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhq.mo29348a(java.nio.ByteBuffer, int, int, long):int");
    }

    /* renamed from: a */
    public final void mo29350a(float f) {
        this.f21993w = f;
        if (!mo29352a()) {
            return;
        }
        if (zzkq.f22154a >= 21) {
            this.f21974d.setVolume(f);
        } else {
            this.f21974d.setStereoVolume(f, f);
        }
    }

    /* renamed from: a */
    private final long m24518a(long j) {
        if (!this.f21969A) {
            return j / ((long) this.f21978h);
        }
        int i = this.f21970B;
        if (i == 0) {
            return 0;
        }
        return ((j << 3) * ((long) this.f21975e)) / ((long) (i * 1000));
    }
}
