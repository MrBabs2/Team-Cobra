package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

final class r00 implements Handler.Callback, zzqk, zzqm, zzrq {

    /* renamed from: A */
    private int f16699A;

    /* renamed from: B */
    private int f16700B = 0;

    /* renamed from: C */
    private int f16701C;

    /* renamed from: D */
    private int f16702D;

    /* renamed from: E */
    private long f16703E;

    /* renamed from: F */
    private int f16704F;

    /* renamed from: G */
    private t00 f16705G;

    /* renamed from: H */
    private long f16706H;

    /* renamed from: I */
    private s00 f16707I;

    /* renamed from: J */
    private s00 f16708J;

    /* renamed from: K */
    private s00 f16709K;

    /* renamed from: L */
    private zzlr f16710L;

    /* renamed from: f */
    private final zzlo[] f16711f;

    /* renamed from: g */
    private final zzlp[] f16712g;

    /* renamed from: h */
    private final zzrp f16713h;

    /* renamed from: i */
    private final zzll f16714i;

    /* renamed from: j */
    private final zzsw f16715j;

    /* renamed from: k */
    private final Handler f16716k;

    /* renamed from: l */
    private final HandlerThread f16717l;

    /* renamed from: m */
    private final Handler f16718m;

    /* renamed from: n */
    private final zzkv f16719n;

    /* renamed from: o */
    private final zzlu f16720o;

    /* renamed from: p */
    private final zzlt f16721p;

    /* renamed from: q */
    private zzle f16722q;

    /* renamed from: r */
    private zzln f16723r;

    /* renamed from: s */
    private zzlo f16724s;

    /* renamed from: t */
    private zzso f16725t;

    /* renamed from: u */
    private zzql f16726u;

    /* renamed from: v */
    private zzlo[] f16727v;

    /* renamed from: w */
    private boolean f16728w;

    /* renamed from: x */
    private boolean f16729x;

    /* renamed from: y */
    private boolean f16730y;

    /* renamed from: z */
    private boolean f16731z;

    public r00(zzlo[] zzloArr, zzrp zzrp, zzll zzll, boolean z, int i, Handler handler, zzle zzle, zzkv zzkv) {
        this.f16711f = zzloArr;
        this.f16713h = zzrp;
        this.f16714i = zzll;
        this.f16729x = z;
        this.f16718m = handler;
        this.f16699A = 1;
        this.f16722q = zzle;
        this.f16719n = zzkv;
        this.f16712g = new zzlp[zzloArr.length];
        for (int i2 = 0; i2 < zzloArr.length; i2++) {
            zzloArr[i2].mo29434a(i2);
            this.f16712g[i2] = zzloArr[i2].mo29451p();
        }
        this.f16715j = new zzsw();
        this.f16727v = new zzlo[0];
        this.f16720o = new zzlu();
        this.f16721p = new zzlt();
        zzrp.mo29695a((zzrq) this);
        this.f16723r = zzln.f22206d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f16717l = handlerThread;
        handlerThread.start();
        this.f16716k = new Handler(this.f16717l.getLooper(), this);
    }

    /* renamed from: d */
    private final void m18099d() throws zzku {
        this.f16730y = false;
        this.f16715j.mo29750a();
        for (zzlo start : this.f16727v) {
            start.start();
        }
    }

    /* renamed from: e */
    private final void m18100e() throws zzku {
        this.f16715j.mo29753d();
        for (zzlo a : this.f16727v) {
            m18088a(a);
        }
    }

    /* renamed from: f */
    private final void m18101f() {
        m18098c(true);
        this.f16714i.mo28029d();
        m18084a(1);
    }

    /* renamed from: g */
    private final void m18102g() throws zzku {
        long j;
        s00 s00 = this.f16709K;
        if (s00 != null) {
            long d = s00.f16796a.mo26008d();
            if (d != -9223372036854775807L) {
                m18085a(d);
            } else {
                zzlo zzlo = this.f16724s;
                if (zzlo == null || zzlo.mo29482n()) {
                    this.f16706H = this.f16715j.mo29532b();
                } else {
                    long b = this.f16725t.mo29532b();
                    this.f16706H = b;
                    this.f16715j.mo29751a(b);
                }
                d = this.f16706H - this.f16709K.mo26535b();
            }
            this.f16722q.f22172c = d;
            this.f16703E = SystemClock.elapsedRealtime() * 1000;
            if (this.f16727v.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f16709K.f16796a.mo26005b();
            }
            zzle zzle = this.f16722q;
            if (j == Long.MIN_VALUE) {
                j = this.f16710L.mo26675a(this.f16709K.f16802g, this.f16721p, false).f22215c;
            }
            zzle.f22173d = j;
        }
    }

    /* renamed from: h */
    private final void m18103h() throws IOException {
        s00 s00 = this.f16707I;
        if (s00 != null && !s00.f16805j) {
            s00 s002 = this.f16708J;
            if (s002 == null || s002.f16807l == s00) {
                zzlo[] zzloArr = this.f16727v;
                int length = zzloArr.length;
                int i = 0;
                while (i < length) {
                    if (zzloArr[i].mo29460w()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f16707I.f16796a.mo26009e();
            }
        }
    }

    /* renamed from: i */
    private final void m18104i() {
        long j;
        s00 s00 = this.f16707I;
        if (!s00.f16805j) {
            j = 0;
        } else {
            j = s00.f16796a.mo25999a();
        }
        if (j == Long.MIN_VALUE) {
            m18095b(false);
            return;
        }
        long b = this.f16706H - this.f16707I.mo26535b();
        boolean a = this.f16714i.mo28023a(j - b);
        m18095b(a);
        if (a) {
            this.f16707I.f16796a.mo26004a(b);
        }
    }

    /* renamed from: a */
    public final void mo26500a(zzql zzql, boolean z) {
        this.f16716k.obtainMessage(0, 1, 0, zzql).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26504b(com.google.android.gms.internal.ads.zzky... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f16728w     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f16701C     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f16701C = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f16716k     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f16702D     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x0035
        L_0x0034:
            throw r4
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r00.mo26504b(com.google.android.gms.internal.ads.zzky[]):void");
    }

    /* renamed from: c */
    public final void mo26505c() {
        this.f16716k.sendEmptyMessage(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0380, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0445, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0446, code lost:
        r2 = r0;
        r8.f16722q = new com.google.android.gms.internal.ads.zzle(r3, r4);
        r3 = r8.f16718m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0450, code lost:
        if (r1 != false) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0452, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0454, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0455, code lost:
        r3.obtainMessage(4, r1, 0, r8.f16722q).sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x045e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0899, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x089a, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x089e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x089f, code lost:
        r1 = r0;
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x08a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x08a4, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f16718m.obtainMessage(8, com.google.android.gms.internal.ads.zzku.m24723a(r1)).sendToTarget();
        m18101f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x08be, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c9, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        monitor-enter(r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r8.f16702D++;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0285 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0288 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x028c A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x034e A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0362 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0529 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0530 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x054a A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x054d A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0588 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x059a A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x05b6 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }, LOOP:8: B:331:0x05b6->B:335:0x05c8, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0713 A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x07cc A[Catch:{ all -> 0x0445, all -> 0x0380, all -> 0x00c8, all -> 0x00d5, all -> 0x00c4, zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x08a3 A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            r34 = this;
            r8 = r34
            r1 = r35
            r10 = 1
            int r2 = r1.what     // Catch:{ zzku -> 0x08db, IOException -> 0x08bf, RuntimeException -> 0x08a3 }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x0862;
                case 1: goto L_0x0835;
                case 2: goto L_0x045f;
                case 3: goto L_0x03a8;
                case 4: goto L_0x0388;
                case 5: goto L_0x0384;
                case 6: goto L_0x036d;
                case 7: goto L_0x0213;
                case 8: goto L_0x01df;
                case 9: goto L_0x01cc;
                case 10: goto L_0x00d9;
                case 11: goto L_0x009b;
                case 12: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            return r9
        L_0x0019:
            int r1 = r1.arg1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16700B = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0026
        L_0x0024:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0026:
            if (r2 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.s00 r3 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.s00 r4 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.zzlr r11 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r2.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r13 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlu r14 = r8.f16720o     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.mo29486a((int) r12, (com.google.android.gms.internal.ads.zzlt) r13, (com.google.android.gms.internal.ads.zzlu) r14, (int) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r12 = r2.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x0061
            if (r11 == r5) goto L_0x0061
            com.google.android.gms.internal.ads.s00 r12 = r2.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r12.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 != r11) goto L_0x0061
            com.google.android.gms.internal.ads.s00 r2 = r2.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r11 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r11) goto L_0x0056
            r11 = 1
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r3 = r3 | r11
            com.google.android.gms.internal.ads.s00 r11 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r11) goto L_0x005e
            r11 = 1
            goto L_0x005f
        L_0x005e:
            r11 = 0
        L_0x005f:
            r4 = r4 | r11
            goto L_0x0036
        L_0x0061:
            com.google.android.gms.internal.ads.s00 r5 = r2.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r5 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.s00 r5 = r2.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            m18087a((com.google.android.gms.internal.ads.s00) r5)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.f16807l = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x006c:
            int r5 = r2.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r5 = r8.m18096b((int) r5)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.f16804i = r5     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 != 0) goto L_0x0078
            r8.f16707I = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0078:
            if (r3 != 0) goto L_0x0091
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0091
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r3 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r8.m18081a((int) r2, (long) r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r5 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5.<init>(r2, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r5     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0091:
            int r2 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r15) goto L_0x009a
            if (r1 == 0) goto L_0x009a
            r8.m18084a((int) r7)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x009a:
            return r10
        L_0x009b:
            java.lang.Object r1 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzky[] r1 = (com.google.android.gms.internal.ads.zzky[]) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r1.length     // Catch:{ all -> 0x00c8 }
        L_0x00a0:
            if (r9 >= r2) goto L_0x00b0
            r3 = r1[r9]     // Catch:{ all -> 0x00c8 }
            com.google.android.gms.internal.ads.zzkx r4 = r3.f22165a     // Catch:{ all -> 0x00c8 }
            int r5 = r3.f22166b     // Catch:{ all -> 0x00c8 }
            java.lang.Object r3 = r3.f22167c     // Catch:{ all -> 0x00c8 }
            r4.mo29435a(r5, r3)     // Catch:{ all -> 0x00c8 }
            int r9 = r9 + 1
            goto L_0x00a0
        L_0x00b0:
            com.google.android.gms.internal.ads.zzql r1 = r8.f16726u     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x00b9
            android.os.Handler r1 = r8.f16716k     // Catch:{ all -> 0x00c8 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c8 }
        L_0x00b9:
            monitor-enter(r34)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r8.f16702D     // Catch:{ all -> 0x00c4 }
            int r1 = r1 + r10
            r8.f16702D = r1     // Catch:{ all -> 0x00c4 }
            r34.notifyAll()     // Catch:{ all -> 0x00c4 }
            monitor-exit(r34)     // Catch:{ all -> 0x00c4 }
            return r10
        L_0x00c4:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00c4 }
            throw r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x00c8:
            r0 = move-exception
            r1 = r0
            monitor-enter(r34)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r8.f16702D     // Catch:{ all -> 0x00d5 }
            int r2 = r2 + r10
            r8.f16702D = r2     // Catch:{ all -> 0x00d5 }
            r34.notifyAll()     // Catch:{ all -> 0x00d5 }
            monitor-exit(r34)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x00d5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x00d9:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x01cb
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 1
        L_0x00e0:
            if (r1 == 0) goto L_0x01cb
            boolean r3 = r1.f16805j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != 0) goto L_0x00e8
            goto L_0x01cb
        L_0x00e8:
            boolean r3 = r1.mo26537d()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != 0) goto L_0x00f6
            com.google.android.gms.internal.ads.s00 r3 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r3) goto L_0x00f3
            r2 = 0
        L_0x00f3:
            com.google.android.gms.internal.ads.s00 r1 = r1.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x00e0
        L_0x00f6:
            if (r2 == 0) goto L_0x0194
            com.google.android.gms.internal.ads.s00 r2 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == r3) goto L_0x0100
            r2 = 1
            goto L_0x0101
        L_0x0100:
            r2 = 0
        L_0x0101:
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r3.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            m18087a((com.google.android.gms.internal.ads.s00) r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.f16807l = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16707I = r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16708J = r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlo[] r3 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean[] r3 = new boolean[r3]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r4 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r5 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r5.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r4.mo26532a(r11, r2, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r2 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r2.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0132
            com.google.android.gms.internal.ads.zzle r2 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.f22172c = r4     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18085a((long) r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0132:
            com.google.android.gms.internal.ads.zzlo[] r2 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean[] r2 = new boolean[r2]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4 = 0
            r5 = 0
        L_0x0139:
            com.google.android.gms.internal.ads.zzlo[] r11 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 >= r11) goto L_0x0185
            com.google.android.gms.internal.ads.zzlo[] r11 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11 = r11[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r11.getState()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x014a
            r12 = 1
            goto L_0x014b
        L_0x014a:
            r12 = 0
        L_0x014b:
            r2[r4] = r12     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r12 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqw[] r12 = r12.f16799d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12 = r12[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x0157
            int r5 = r5 + 1
        L_0x0157:
            boolean r13 = r2[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r13 == 0) goto L_0x0182
            com.google.android.gms.internal.ads.zzqw r13 = r11.mo29459v()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == r13) goto L_0x0179
            com.google.android.gms.internal.ads.zzlo r13 = r8.f16724s     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r11 != r13) goto L_0x0172
            if (r12 != 0) goto L_0x016e
            com.google.android.gms.internal.ads.zzsw r12 = r8.f16715j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzso r13 = r8.f16725t     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.mo29752a((com.google.android.gms.internal.ads.zzso) r13)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x016e:
            r8.f16725t = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16724s = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0172:
            m18088a((com.google.android.gms.internal.ads.zzlo) r11)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.mo29458u()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0182
        L_0x0179:
            boolean r12 = r3[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x0182
            long r12 = r8.f16706H     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.mo29436a((long) r12)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0182:
            int r4 = r4 + 1
            goto L_0x0139
        L_0x0185:
            android.os.Handler r3 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzrr r1 = r1.f16808m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18090a((boolean[]) r2, (int) r5)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x01c0
        L_0x0194:
            r8.f16707I = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r1.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0198:
            if (r1 == 0) goto L_0x01a0
            r1.mo26533a()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r1.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0198
        L_0x01a0:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.f16807l = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.f16805j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x01c0
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.f16803h     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r8.f16706H     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r3.mo26535b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.mo26531a((long) r1, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x01c0:
            r34.m18104i()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.m18102g()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.f16716k     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r7)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x01cb:
            return r10
        L_0x01cc:
            java.lang.Object r1 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r1 = (com.google.android.gms.internal.ads.zzqj) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x01de
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r2 = r2.f16796a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == r1) goto L_0x01db
            goto L_0x01de
        L_0x01db:
            r34.m18104i()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x01de:
            return r10
        L_0x01df:
            java.lang.Object r1 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r1 = (com.google.android.gms.internal.ads.zzqj) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0212
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r2 = r2.f16796a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == r1) goto L_0x01ee
            goto L_0x0212
        L_0x01ee:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.f16805j = r10     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo26537d()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r1.f16803h     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r1.mo26531a((long) r2, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.f16803h = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x020f
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16708J = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.f16803h     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18085a((long) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18093b((com.google.android.gms.internal.ads.s00) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x020f:
            r34.m18104i()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0212:
            return r10
        L_0x0213:
            java.lang.Object r1 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r3 = r1.first     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r3 = (com.google.android.gms.internal.ads.zzlr) r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16710L = r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r1 = r1.second     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0280
            int r4 = r8.f16704F     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 <= 0) goto L_0x0252
            com.google.android.gms.internal.ads.t00 r3 = r8.f16705G     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.util.Pair r3 = r8.m18082a((com.google.android.gms.internal.ads.t00) r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r4 = r8.f16704F     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16704F = r9     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16705G = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != 0) goto L_0x023a
            r8.m18089a((java.lang.Object) r1, (int) r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x036c
        L_0x023a:
            com.google.android.gms.internal.ads.zzle r7 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r11 = r3.first     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.intValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r3 = r3.second     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r3.longValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r7.<init>(r11, r14)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r7     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0281
        L_0x0252:
            com.google.android.gms.internal.ads.zzle r4 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r4.f22171b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0280
            boolean r3 = r3.mo29488a()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x0265
            r8.m18089a((java.lang.Object) r1, (int) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x036c
        L_0x0265:
            android.util.Pair r3 = r8.m18091b((int) r9, (long) r12)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r4 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r7 = r3.first     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.intValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r3 = r3.second     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r3.longValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4.<init>(r7, r14)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r4     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0280:
            r4 = 0
        L_0x0281:
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x0288
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x028a
        L_0x0288:
            com.google.android.gms.internal.ads.s00 r3 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x028a:
            if (r3 == 0) goto L_0x0369
            com.google.android.gms.internal.ads.zzlr r7 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r11 = r3.f16797b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.mo26674a(r11)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 != r5) goto L_0x02ee
            int r6 = r3.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r7 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r8.m18080a((int) r6, (com.google.android.gms.internal.ads.zzlr) r2, (com.google.android.gms.internal.ads.zzlr) r7)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != r5) goto L_0x02a5
            r8.m18089a((java.lang.Object) r1, (int) r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x036c
        L_0x02a5:
            com.google.android.gms.internal.ads.zzlr r6 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r7 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6.mo26675a((int) r2, (com.google.android.gms.internal.ads.zzlt) r7, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.util.Pair r2 = r8.m18091b((int) r9, (long) r12)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r6 = r2.first     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r6 = r6.intValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r2 = r2.second     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r2.longValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r7 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo26675a((int) r6, (com.google.android.gms.internal.ads.zzlt) r7, (boolean) r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r2 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r2 = r2.f22214b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.f16802g = r5     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x02cd:
            com.google.android.gms.internal.ads.s00 r7 = r3.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x02e1
            com.google.android.gms.internal.ads.s00 r3 = r3.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r7 = r3.f16797b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r7 = r7.equals(r2)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x02dd
            r7 = r6
            goto L_0x02de
        L_0x02dd:
            r7 = -1
        L_0x02de:
            r3.f16802g = r7     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x02cd
        L_0x02e1:
            long r2 = r8.m18081a((int) r6, (long) r11)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r5 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5.<init>(r6, r2)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r5     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0369
        L_0x02ee:
            boolean r2 = r8.m18096b((int) r7)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.mo26534a((int) r7, (boolean) r2)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 != r2) goto L_0x02fb
            r2 = 1
            goto L_0x02fc
        L_0x02fb:
            r2 = 0
        L_0x02fc:
            com.google.android.gms.internal.ads.zzle r11 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r11 = r11.f22170a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == r11) goto L_0x0315
            com.google.android.gms.internal.ads.zzle r11 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r12 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r13 = r11.f22171b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.<init>(r7, r13)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r13 = r11.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.f22172c = r13     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r13 = r11.f22173d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12.f22173d = r13     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r12     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0315:
            com.google.android.gms.internal.ads.s00 r11 = r3.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r11 == 0) goto L_0x0369
            com.google.android.gms.internal.ads.s00 r11 = r3.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r12 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r13 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlu r14 = r8.f16720o     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r15 = r8.f16700B     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r12.mo29486a((int) r7, (com.google.android.gms.internal.ads.zzlt) r13, (com.google.android.gms.internal.ads.zzlu) r14, (int) r15)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == r5) goto L_0x034c
            java.lang.Object r12 = r11.f16797b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r13 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r14 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r13 = r13.mo26675a((int) r7, (com.google.android.gms.internal.ads.zzlt) r14, (boolean) r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r13 = r13.f22214b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r12 = r12.equals(r13)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r12 == 0) goto L_0x034c
            boolean r3 = r8.m18096b((int) r7)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.mo26534a((int) r7, (boolean) r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r11 != r3) goto L_0x0348
            r3 = 1
            goto L_0x0349
        L_0x0348:
            r3 = 0
        L_0x0349:
            r2 = r2 | r3
            r3 = r11
            goto L_0x0315
        L_0x034c:
            if (r2 != 0) goto L_0x0362
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r3 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r3.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r8.m18081a((int) r2, (long) r5)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r3 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.<init>(r2, r5)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0369
        L_0x0362:
            r8.f16707I = r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.f16807l = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            m18087a((com.google.android.gms.internal.ads.s00) r11)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0369:
            r8.m18094b((java.lang.Object) r1, (int) r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x036c:
            return r10
        L_0x036d:
            r8.m18098c(r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzll r1 = r8.f16714i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo28027c()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18084a((int) r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            monitor-enter(r34)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16728w = r10     // Catch:{ all -> 0x0380 }
            r34.notifyAll()     // Catch:{ all -> 0x0380 }
            monitor-exit(r34)     // Catch:{ all -> 0x0380 }
            return r10
        L_0x0380:
            r0 = move-exception
            r1 = r0
            monitor-exit(r34)     // Catch:{ all -> 0x0380 }
            throw r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0384:
            r34.m18101f()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            return r10
        L_0x0388:
            java.lang.Object r1 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzln r1 = (com.google.android.gms.internal.ads.zzln) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzso r2 = r8.f16725t     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0397
            com.google.android.gms.internal.ads.zzso r2 = r8.f16725t     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzln r1 = r2.mo29526a(r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x039c
        L_0x0397:
            com.google.android.gms.internal.ads.zzsw r2 = r8.f16715j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo29526a((com.google.android.gms.internal.ads.zzln) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x039c:
            r8.f16723r = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            return r10
        L_0x03a8:
            java.lang.Object r1 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.t00 r1 = (com.google.android.gms.internal.ads.t00) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x03b9
            int r2 = r8.f16704F     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2 + r10
            r8.f16704F = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16705G = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0444
        L_0x03b9:
            android.util.Pair r2 = r8.m18082a((com.google.android.gms.internal.ads.t00) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x03dd
            com.google.android.gms.internal.ads.zzle r1 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.<init>(r9, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r1 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.<init>(r9, r12)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18084a((int) r15)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18098c(r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0444
        L_0x03dd:
            long r3 = r1.f16876c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03e5
            r1 = 1
            goto L_0x03e6
        L_0x03e5:
            r1 = 0
        L_0x03e6:
            java.lang.Object r3 = r2.first     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.intValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r2 = r2.second     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r2.longValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r2 = r8.f16722q     // Catch:{ all -> 0x0445 }
            int r2 = r2.f22170a     // Catch:{ all -> 0x0445 }
            if (r3 != r2) goto L_0x0421
            r6 = 1000(0x3e8, double:4.94E-321)
            long r11 = r4 / r6
            com.google.android.gms.internal.ads.zzle r2 = r8.f16722q     // Catch:{ all -> 0x0445 }
            long r13 = r2.f22172c     // Catch:{ all -> 0x0445 }
            long r13 = r13 / r6
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0421
            com.google.android.gms.internal.ads.zzle r2 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.<init>(r3, r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0416
            r1 = 1
            goto L_0x0417
        L_0x0416:
            r1 = 0
        L_0x0417:
            com.google.android.gms.internal.ads.zzle r3 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0444
        L_0x0421:
            long r6 = r8.m18081a((int) r3, (long) r4)     // Catch:{ all -> 0x0445 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x042b
            r2 = 1
            goto L_0x042c
        L_0x042b:
            r2 = 0
        L_0x042c:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.zzle r2 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.<init>(r3, r6)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x043a
            r1 = 1
            goto L_0x043b
        L_0x043a:
            r1 = 0
        L_0x043b:
            com.google.android.gms.internal.ads.zzle r3 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r2.obtainMessage(r15, r1, r9, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0444:
            return r10
        L_0x0445:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.zzle r6 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6.<init>(r3, r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r6     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r3 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0454
            r1 = 1
            goto L_0x0455
        L_0x0454:
            r1 = 0
        L_0x0455:
            com.google.android.gms.internal.ads.zzle r4 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            throw r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x045f:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r1 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x046f
            com.google.android.gms.internal.ads.zzql r1 = r8.f16726u     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo29636b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r14 = r5
            goto L_0x06c4
        L_0x046f:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x0478
            com.google.android.gms.internal.ads.zzle r1 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.f22170a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x04b6
        L_0x0478:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.f16804i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x04c3
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.mo26536c()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x04c3
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r7 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r2 = r2.mo26675a((int) r1, (com.google.android.gms.internal.ads.zzlt) r7, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r2.f22215c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0499
            goto L_0x04c3
        L_0x0499:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x04aa
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f16798c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r7 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.f16798c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2 - r7
            r7 = 100
            if (r2 == r7) goto L_0x04c3
        L_0x04aa:
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r7 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlu r14 = r8.f16720o     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r15 = r8.f16700B     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r2.mo29486a((int) r1, (com.google.android.gms.internal.ads.zzlt) r7, (com.google.android.gms.internal.ads.zzlu) r14, (int) r15)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x04b6:
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.mo26678c()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 < r2) goto L_0x04c6
            com.google.android.gms.internal.ads.zzql r1 = r8.f16726u     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo29636b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x04c3:
            r14 = r5
            goto L_0x0596
        L_0x04c6:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x04d0
            com.google.android.gms.internal.ads.zzle r2 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r2.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x04ce:
            r14 = r5
            goto L_0x0525
        L_0x04d0:
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r7 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo26675a((int) r1, (com.google.android.gms.internal.ads.zzlt) r7, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlu r7 = r8.f16720o     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo29487a((int) r9, (com.google.android.gms.internal.ads.zzlu) r7, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x04e1
            goto L_0x04ce
        L_0x04e1:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.mo26535b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r7 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r14 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r14 = r14.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r15 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r7 = r7.mo26675a((int) r14, (com.google.android.gms.internal.ads.zzlt) r15, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r14 = r7.f22215c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1 + r14
            long r14 = r8.f16706H     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1 - r14
            com.google.android.gms.internal.ads.zzlr r7 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r14 = 0
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r18 = java.lang.Math.max(r3, r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1 = r34
            r2 = r7
            r3 = r14
            r14 = r5
            r4 = r16
            r6 = r18
            android.util.Pair r1 = r1.m18083a(r2, r3, r4, r6)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0596
            java.lang.Object r2 = r1.first     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.intValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r1 = r1.second     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r1.longValue()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1 = r2
        L_0x0525:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0530
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x052d:
            r23 = r5
            goto L_0x0546
        L_0x0530:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r2.mo26535b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r7 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r7 = r7.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r11 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r2 = r2.mo26675a((int) r7, (com.google.android.gms.internal.ads.zzlt) r11, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r12 = r2.f22215c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r5 = r5 + r12
            goto L_0x052d
        L_0x0546:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x054d
            r29 = 0
            goto L_0x0554
        L_0x054d:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f16798c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2 + r10
            r29 = r2
        L_0x0554:
            boolean r31 = r8.m18096b((int) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r5 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo26675a((int) r1, (com.google.android.gms.internal.ads.zzlt) r5, (boolean) r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = new com.google.android.gms.internal.ads.s00     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlo[] r5 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlp[] r6 = r8.f16712g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzrp r7 = r8.f16713h     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzll r11 = r8.f16714i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzql r12 = r8.f16726u     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r13 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            java.lang.Object r13 = r13.f22214b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r20 = r2
            r21 = r5
            r22 = r6
            r25 = r7
            r26 = r11
            r27 = r12
            r28 = r13
            r30 = r1
            r32 = r3
            r20.<init>(r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x058c
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.f16807l = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x058c:
            r8.f16707I = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r1 = r2.f16796a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo26002a(r8, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18095b((boolean) r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0596:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x05af
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.mo26536c()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x05a3
            goto L_0x05af
        L_0x05a3:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x05b2
            boolean r1 = r8.f16731z     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x05b2
            r34.m18104i()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x05b2
        L_0x05af:
            r8.m18095b((boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x05b2:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x06c4
        L_0x05b6:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == r2) goto L_0x05f3
            long r1 = r8.f16706H     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r3.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f16801f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x05f3
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo26533a()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r1.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18093b((com.google.android.gms.internal.ads.s00) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r1 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f16803h     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.<init>(r2, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.m18102g()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 5
            com.google.android.gms.internal.ads.zzle r3 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x05b6
        L_0x05f3:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.f16804i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x061d
            r1 = 0
        L_0x05fa:
            com.google.android.gms.internal.ads.zzlo[] r2 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 >= r2) goto L_0x06c4
            com.google.android.gms.internal.ads.zzlo[] r2 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = r2[r1]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqw[] r3 = r3.f16799d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3 = r3[r1]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x061a
            com.google.android.gms.internal.ads.zzqw r4 = r2.mo29459v()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 != r3) goto L_0x061a
            boolean r3 = r2.mo29460w()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x061a
            r2.mo29454s()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x061a:
            int r1 = r1 + 1
            goto L_0x05fa
        L_0x061d:
            r1 = 0
        L_0x061e:
            com.google.android.gms.internal.ads.zzlo[] r2 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 >= r2) goto L_0x0640
            com.google.android.gms.internal.ads.zzlo[] r2 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = r2[r1]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqw[] r3 = r3.f16799d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3 = r3[r1]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqw r4 = r2.mo29459v()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 != r3) goto L_0x06c4
            if (r3 == 0) goto L_0x063d
            boolean r2 = r2.mo29460w()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x063d
            goto L_0x06c4
        L_0x063d:
            int r1 = r1 + 1
            goto L_0x061e
        L_0x0640:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r1.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x06c4
            com.google.android.gms.internal.ads.s00 r1 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r1.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r1.f16805j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x06c4
            com.google.android.gms.internal.ads.s00 r1 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzrr r1 = r1.f16808m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r2.f16807l     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16708J = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzrr r3 = r2.f16808m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r2 = r2.f16796a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r2.mo26008d()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x066b
            r2 = 1
            goto L_0x066c
        L_0x066b:
            r2 = 0
        L_0x066c:
            r4 = 0
        L_0x066d:
            com.google.android.gms.internal.ads.zzlo[] r5 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r5 = r5.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r4 >= r5) goto L_0x06c4
            com.google.android.gms.internal.ads.zzlo[] r5 = r8.f16711f     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = r5[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzro r6 = r1.f22601b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzrm r6 = r6.mo29690a(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r6 == 0) goto L_0x06c1
            if (r2 != 0) goto L_0x06be
            boolean r6 = r5.mo29457t()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r6 != 0) goto L_0x06c1
            com.google.android.gms.internal.ads.zzro r6 = r3.f22601b     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzrm r6 = r6.mo29690a(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlq[] r7 = r1.f22603d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r7 = r7[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlq[] r11 = r3.f22603d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11 = r11[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r6 == 0) goto L_0x06be
            boolean r7 = r11.equals(r7)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x06be
            int r7 = r6.length()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlh[] r11 = new com.google.android.gms.internal.ads.zzlh[r7]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r12 = 0
        L_0x06a3:
            if (r12 >= r7) goto L_0x06ae
            com.google.android.gms.internal.ads.zzlh r13 = r6.mo29680b(r12)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11[r12] = r13     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r12 = r12 + 1
            goto L_0x06a3
        L_0x06ae:
            com.google.android.gms.internal.ads.s00 r6 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqw[] r6 = r6.f16799d     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r6 = r6[r4]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r7 = r8.f16708J     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r12 = r7.mo26535b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5.mo29441a(r11, r6, r12)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x06c1
        L_0x06be:
            r5.mo29454s()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x06c1:
            int r4 = r4 + 1
            goto L_0x066d
        L_0x06c4:
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 10
            if (r1 != 0) goto L_0x06d2
            r34.m18103h()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18086a((long) r14, (long) r2)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0834
        L_0x06d2:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.zzsx.m25278a(r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.m18102g()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r1 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r1 = r1.f16796a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzle r4 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r4 = r4.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.mo26007c(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlo[] r1 = r8.f16727v     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r4 = r1.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = 0
            r6 = 1
            r7 = 1
        L_0x06eb:
            if (r5 >= r4) goto L_0x0722
            r11 = r1[r5]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r12 = r8.f16706H     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r8.f16703E     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r11.mo29480a(r12, r2)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x0700
            boolean r2 = r11.mo29482n()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x0700
            r7 = 1
            goto L_0x0701
        L_0x0700:
            r7 = 0
        L_0x0701:
            boolean r2 = r11.mo29481m()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0710
            boolean r2 = r11.mo29482n()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x070e
            goto L_0x0710
        L_0x070e:
            r2 = 0
            goto L_0x0711
        L_0x0710:
            r2 = 1
        L_0x0711:
            if (r2 != 0) goto L_0x0716
            r11.mo29453r()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0716:
            if (r6 == 0) goto L_0x071c
            if (r2 == 0) goto L_0x071c
            r6 = 1
            goto L_0x071d
        L_0x071c:
            r6 = 0
        L_0x071d:
            int r5 = r5 + 1
            r2 = 10
            goto L_0x06eb
        L_0x0722:
            if (r6 != 0) goto L_0x0727
            r34.m18103h()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0727:
            com.google.android.gms.internal.ads.zzso r1 = r8.f16725t     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x074c
            com.google.android.gms.internal.ads.zzso r1 = r8.f16725t     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzln r1 = r1.mo29534c()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzln r2 = r8.f16723r     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r1.equals(r2)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x074c
            r8.f16723r = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzsw r2 = r8.f16715j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzso r3 = r8.f16725t     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo29752a((com.google.android.gms.internal.ads.zzso) r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r2 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendToTarget()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x074c:
            com.google.android.gms.internal.ads.zzlr r1 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r2.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r3 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r1 = r1.mo26675a((int) r2, (com.google.android.gms.internal.ads.zzlt) r3, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r1 = r1.f22215c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r7 == 0) goto L_0x077d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x076d
            com.google.android.gms.internal.ads.zzle r3 = r8.f16722q     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r3 = r3.f22172c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x077d
        L_0x076d:
            com.google.android.gms.internal.ads.s00 r3 = r8.f16709K     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r3 = r3.f16804i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 == 0) goto L_0x077d
            r3 = 4
            r8.m18084a((int) r3)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.m18100e()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4 = 2
            goto L_0x07fd
        L_0x077d:
            int r3 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r4 = 2
            if (r3 != r4) goto L_0x07e2
            com.google.android.gms.internal.ads.zzlo[] r3 = r8.f16727v     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 <= 0) goto L_0x07d0
            if (r6 == 0) goto L_0x07ce
            boolean r1 = r8.f16730y     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.f16805j     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 != 0) goto L_0x0796
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r2.f16803h     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x079e
        L_0x0796:
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzqj r2 = r2.f16796a     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r2.mo26005b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x079e:
            r5 = -9223372036854775808
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x07ba
            com.google.android.gms.internal.ads.s00 r2 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r2 = r2.f16804i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r2 == 0) goto L_0x07ac
            r1 = 1
            goto L_0x07ca
        L_0x07ac:
            com.google.android.gms.internal.ads.zzlr r2 = r8.f16710L     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r3 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.f16802g     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r5 = r8.f16721p     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzlt r2 = r2.mo26675a((int) r3, (com.google.android.gms.internal.ads.zzlt) r5, (boolean) r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r2 = r2.f22215c     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07ba:
            com.google.android.gms.internal.ads.zzll r5 = r8.f16714i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.s00 r6 = r8.f16707I     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r8.f16706H     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r6 = r6.mo26535b()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            long r11 = r11 - r6
            long r2 = r2 - r11
            boolean r1 = r5.mo28024a(r2, r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07ca:
            if (r1 == 0) goto L_0x07ce
            r1 = 1
            goto L_0x07d4
        L_0x07ce:
            r1 = 0
            goto L_0x07d4
        L_0x07d0:
            boolean r1 = r8.m18097b((long) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07d4:
            if (r1 == 0) goto L_0x07fd
            r1 = 3
            r8.m18084a((int) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            boolean r1 = r8.f16729x     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x07fd
            r34.m18099d()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x07fd
        L_0x07e2:
            int r3 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = 3
            if (r3 != r5) goto L_0x07fd
            com.google.android.gms.internal.ads.zzlo[] r3 = r8.f16727v     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r3 = r3.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r3 <= 0) goto L_0x07ed
            goto L_0x07f1
        L_0x07ed:
            boolean r6 = r8.m18097b((long) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07f1:
            if (r6 != 0) goto L_0x07fd
            boolean r1 = r8.f16729x     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16730y = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18084a((int) r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.m18100e()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x07fd:
            int r1 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r4) goto L_0x080e
            com.google.android.gms.internal.ads.zzlo[] r1 = r8.f16727v     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r2 = r1.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0804:
            if (r9 >= r2) goto L_0x080e
            r3 = r1[r9]     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.mo29453r()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r9 = r9 + 1
            goto L_0x0804
        L_0x080e:
            boolean r1 = r8.f16729x     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0817
            int r1 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 3
            if (r1 == r2) goto L_0x081b
        L_0x0817:
            int r1 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r4) goto L_0x0821
        L_0x081b:
            r1 = 10
            r8.m18086a((long) r14, (long) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0831
        L_0x0821:
            com.google.android.gms.internal.ads.zzlo[] r1 = r8.f16727v     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.length     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x082c
            r1 = 1000(0x3e8, double:4.94E-321)
            r8.m18086a((long) r14, (long) r1)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0831
        L_0x082c:
            android.os.Handler r1 = r8.f16716k     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.removeMessages(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0831:
            com.google.android.gms.internal.ads.zzsx.m25277a()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0834:
            return r10
        L_0x0835:
            r4 = 2
            int r1 = r1.arg1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x083c
            r1 = 1
            goto L_0x083d
        L_0x083c:
            r1 = 0
        L_0x083d:
            r8.f16730y = r9     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16729x = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != 0) goto L_0x084a
            r34.m18100e()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r34.m18102g()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0861
        L_0x084a:
            int r1 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2 = 3
            if (r1 != r2) goto L_0x0858
            r34.m18099d()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.f16716k     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            goto L_0x0861
        L_0x0858:
            int r1 = r8.f16699A     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 != r4) goto L_0x0861
            android.os.Handler r1 = r8.f16716k     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0861:
            return r10
        L_0x0862:
            r4 = 2
            java.lang.Object r2 = r1.obj     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzql r2 = (com.google.android.gms.internal.ads.zzql) r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            int r1 = r1.arg1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x086d
            r1 = 1
            goto L_0x086e
        L_0x086d:
            r1 = 0
        L_0x086e:
            android.os.Handler r3 = r8.f16718m     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.sendEmptyMessage(r9)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18098c(r10)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzll r3 = r8.f16714i     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r3.mo28020a()     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            if (r1 == 0) goto L_0x0889
            com.google.android.gms.internal.ads.zzle r1 = new com.google.android.gms.internal.ads.zzle     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r9, r5)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.f16722q = r1     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
        L_0x0889:
            r8.f16726u = r2     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            com.google.android.gms.internal.ads.zzkv r1 = r8.f16719n     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r2.mo29634a(r1, r10, r8)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r8.m18084a((int) r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            android.os.Handler r1 = r8.f16716k     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            r1.sendEmptyMessage(r4)     // Catch:{ zzku -> 0x089e, IOException -> 0x0899, RuntimeException -> 0x08a3 }
            return r10
        L_0x0899:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08c3
        L_0x089e:
            r0 = move-exception
            r1 = r0
            r3 = 8
            goto L_0x08df
        L_0x08a3:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f16718m
            com.google.android.gms.internal.ads.zzku r1 = com.google.android.gms.internal.ads.zzku.m24723a((java.lang.RuntimeException) r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m18101f()
            return r10
        L_0x08bf:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08c3:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Source error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.f16718m
            com.google.android.gms.internal.ads.zzku r1 = com.google.android.gms.internal.ads.zzku.m24721a((java.io.IOException) r1)
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m18101f()
            return r10
        L_0x08db:
            r0 = move-exception
            r3 = 8
            r1 = r0
        L_0x08df:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r4 = "Renderer error."
            android.util.Log.e(r2, r4, r1)
            android.os.Handler r2 = r8.f16718m
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r34.m18101f()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r00.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: c */
    private final void m18098c(boolean z) {
        this.f16716k.removeMessages(2);
        this.f16730y = false;
        this.f16715j.mo29753d();
        this.f16725t = null;
        this.f16724s = null;
        this.f16706H = 60000000;
        for (zzlo zzlo : this.f16727v) {
            try {
                m18088a(zzlo);
                zzlo.mo29458u();
            } catch (zzku | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f16727v = new zzlo[0];
        s00 s00 = this.f16709K;
        if (s00 == null) {
            s00 = this.f16707I;
        }
        m18087a(s00);
        this.f16707I = null;
        this.f16708J = null;
        this.f16709K = null;
        m18095b(false);
        if (z) {
            zzql zzql = this.f16726u;
            if (zzql != null) {
                zzql.mo29633a();
                this.f16726u = null;
            }
            this.f16710L = null;
        }
    }

    /* renamed from: a */
    public final void mo26501a(boolean z) {
        this.f16716k.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo26499a(zzlr zzlr, int i, long j) {
        this.f16716k.obtainMessage(3, new t00(zzlr, i, j)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo26502a(zzky... zzkyArr) {
        if (this.f16728w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f16701C++;
        this.f16716k.obtainMessage(11, zzkyArr).sendToTarget();
    }

    /* renamed from: a */
    public final void mo26072a(zzlr zzlr, Object obj) {
        this.f16716k.obtainMessage(7, Pair.create(zzlr, obj)).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26503b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f16728w     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f16716k     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f16728w     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f16717l     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0028
        L_0x0027:
            throw r0
        L_0x0028:
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.r00.mo26503b():void");
    }

    /* renamed from: a */
    public final void mo26001a(zzqj zzqj) {
        this.f16716k.obtainMessage(8, zzqj).sendToTarget();
    }

    /* renamed from: a */
    public final void mo26498a() {
        this.f16716k.sendEmptyMessage(10);
    }

    /* renamed from: a */
    private final void m18084a(int i) {
        if (this.f16699A != i) {
            this.f16699A = i;
            this.f16718m.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private final void m18086a(long j, long j2) {
        this.f16716k.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f16716k.sendEmptyMessage(2);
        } else {
            this.f16716k.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: b */
    private final void m18095b(boolean z) {
        if (this.f16731z != z) {
            this.f16731z = z;
            this.f16718m.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private final long m18081a(int i, long j) throws zzku {
        s00 s00;
        m18100e();
        this.f16730y = false;
        m18084a(2);
        s00 s002 = this.f16709K;
        if (s002 == null) {
            s00 s003 = this.f16707I;
            if (s003 != null) {
                s003.mo26533a();
            }
            s00 = null;
        } else {
            s00 = null;
            while (s002 != null) {
                if (s002.f16802g != i || !s002.f16805j) {
                    s002.mo26533a();
                } else {
                    s00 = s002;
                }
                s002 = s002.f16807l;
            }
        }
        s00 s004 = this.f16709K;
        if (!(s004 == s00 && s004 == this.f16708J)) {
            for (zzlo u : this.f16727v) {
                u.mo29458u();
            }
            this.f16727v = new zzlo[0];
            this.f16725t = null;
            this.f16724s = null;
            this.f16709K = null;
        }
        if (s00 != null) {
            s00.f16807l = null;
            this.f16707I = s00;
            this.f16708J = s00;
            m18093b(s00);
            s00 s005 = this.f16709K;
            if (s005.f16806k) {
                j = s005.f16796a.mo26006b(j);
            }
            m18085a(j);
            m18104i();
        } else {
            this.f16707I = null;
            this.f16708J = null;
            this.f16709K = null;
            m18085a(j);
        }
        this.f16716k.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: b */
    private final boolean m18097b(long j) {
        if (j == -9223372036854775807L || this.f16722q.f22172c < j) {
            return true;
        }
        s00 s00 = this.f16709K.f16807l;
        return s00 != null && s00.f16805j;
    }

    /* renamed from: b */
    private final void m18094b(Object obj, int i) {
        this.f16718m.obtainMessage(6, new zzlg(this.f16710L, obj, this.f16722q, i)).sendToTarget();
    }

    /* renamed from: b */
    private final boolean m18096b(int i) {
        this.f16710L.mo26675a(i, this.f16721p, false);
        if (this.f16710L.mo29487a(0, this.f16720o, false).f22221e || this.f16710L.mo29486a(i, this.f16721p, this.f16720o, this.f16700B) != -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m18091b(int i, long j) {
        return m18092b(this.f16710L, i, -9223372036854775807L);
    }

    /* renamed from: b */
    private final Pair<Integer, Long> m18092b(zzlr zzlr, int i, long j) {
        return m18083a(zzlr, i, j, 0);
    }

    /* renamed from: b */
    private final void m18093b(s00 s00) throws zzku {
        if (this.f16709K != s00) {
            boolean[] zArr = new boolean[this.f16711f.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                zzlo[] zzloArr = this.f16711f;
                if (i < zzloArr.length) {
                    zzlo zzlo = zzloArr[i];
                    zArr[i] = zzlo.getState() != 0;
                    zzrm a = s00.f16808m.f22601b.mo29690a(i);
                    if (a != null) {
                        i2++;
                    }
                    if (zArr[i] && (a == null || (zzlo.mo29457t() && zzlo.mo29459v() == this.f16709K.f16799d[i]))) {
                        if (zzlo == this.f16724s) {
                            this.f16715j.mo29752a(this.f16725t);
                            this.f16725t = null;
                            this.f16724s = null;
                        }
                        m18088a(zzlo);
                        zzlo.mo29458u();
                    }
                    i++;
                } else {
                    this.f16709K = s00;
                    this.f16718m.obtainMessage(3, s00.f16808m).sendToTarget();
                    m18090a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m18085a(long j) throws zzku {
        long j2;
        s00 s00 = this.f16709K;
        if (s00 == null) {
            j2 = 60000000;
        } else {
            j2 = s00.mo26535b();
        }
        long j3 = j + j2;
        this.f16706H = j3;
        this.f16715j.mo29751a(j3);
        for (zzlo a : this.f16727v) {
            a.mo29436a(this.f16706H);
        }
    }

    /* renamed from: a */
    private static void m18088a(zzlo zzlo) throws zzku {
        if (zzlo.getState() == 2) {
            zzlo.stop();
        }
    }

    /* renamed from: a */
    private final void m18089a(Object obj, int i) {
        this.f16722q = new zzle(0, 0);
        m18094b(obj, i);
        this.f16722q = new zzle(0, -9223372036854775807L);
        m18084a(4);
        m18098c(false);
    }

    /* renamed from: a */
    private final int m18080a(int i, zzlr zzlr, zzlr zzlr2) {
        int c = zzlr.mo26678c();
        int i2 = -1;
        for (int i3 = 0; i3 < c && i2 == -1; i3++) {
            i = zzlr.mo29486a(i, this.f16721p, this.f16720o, this.f16700B);
            i2 = zzlr2.mo26674a(zzlr.mo26675a(i, this.f16721p, true).f22214b);
        }
        return i2;
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m18082a(t00 t00) {
        zzlr zzlr = t00.f16874a;
        if (zzlr.mo29488a()) {
            zzlr = this.f16710L;
        }
        try {
            Pair<Integer, Long> b = m18092b(zzlr, t00.f16875b, t00.f16876c);
            zzlr zzlr2 = this.f16710L;
            if (zzlr2 == zzlr) {
                return b;
            }
            int a = zzlr2.mo26674a(zzlr.mo26675a(((Integer) b.first).intValue(), this.f16721p, true).f22214b);
            if (a != -1) {
                return Pair.create(Integer.valueOf(a), (Long) b.second);
            }
            int a2 = m18080a(((Integer) b.first).intValue(), zzlr, this.f16710L);
            if (a2 == -1) {
                return null;
            }
            this.f16710L.mo26675a(a2, this.f16721p, false);
            return m18091b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzlk(this.f16710L, t00.f16875b, t00.f16876c);
        }
    }

    /* renamed from: a */
    private final Pair<Integer, Long> m18083a(zzlr zzlr, int i, long j, long j2) {
        zzsk.m25213a(i, 0, zzlr.mo26677b());
        zzlr.mo26676a(i, this.f16720o, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f16720o.f22224h;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        zzlr.mo26675a(0, this.f16721p, false);
        return Pair.create(0, Long.valueOf(this.f16720o.f22226j + j));
    }

    /* renamed from: a */
    private static void m18087a(s00 s00) {
        while (s00 != null) {
            s00.mo26533a();
            s00 = s00.f16807l;
        }
    }

    /* renamed from: a */
    private final void m18090a(boolean[] zArr, int i) throws zzku {
        this.f16727v = new zzlo[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzlo[] zzloArr = this.f16711f;
            if (i2 < zzloArr.length) {
                zzlo zzlo = zzloArr[i2];
                zzrm a = this.f16709K.f16808m.f22601b.mo29690a(i2);
                if (a != null) {
                    int i4 = i3 + 1;
                    this.f16727v[i3] = zzlo;
                    if (zzlo.getState() == 0) {
                        zzlq zzlq = this.f16709K.f16808m.f22603d[i2];
                        boolean z = this.f16729x && this.f16699A == 3;
                        boolean z2 = !zArr[i2] && z;
                        int length = a.length();
                        zzlh[] zzlhArr = new zzlh[length];
                        for (int i5 = 0; i5 < length; i5++) {
                            zzlhArr[i5] = a.mo29680b(i5);
                        }
                        s00 s00 = this.f16709K;
                        zzlo.mo29438a(zzlq, zzlhArr, s00.f16799d[i2], this.f16706H, z2, s00.mo26535b());
                        zzso q = zzlo.mo29452q();
                        if (q != null) {
                            if (this.f16725t == null) {
                                this.f16725t = q;
                                this.f16724s = zzlo;
                                q.mo29526a(this.f16723r);
                            } else {
                                throw zzku.m24723a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z) {
                            zzlo.start();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo26003a(zzqx zzqx) {
        this.f16716k.obtainMessage(9, (zzqj) zzqx).sendToTarget();
    }
}
