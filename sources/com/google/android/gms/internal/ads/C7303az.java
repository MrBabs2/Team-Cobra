package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.az */
final class C7303az implements Handler.Callback {

    /* renamed from: f */
    private final Handler f14503f;

    /* renamed from: g */
    private final HandlerThread f14504g;

    /* renamed from: h */
    private final Handler f14505h;

    /* renamed from: i */
    private final C7340bz f14506i;

    /* renamed from: j */
    private final boolean[] f14507j;

    /* renamed from: k */
    private final long f14508k;

    /* renamed from: l */
    private final long f14509l;

    /* renamed from: m */
    private final List<zzhp> f14510m;

    /* renamed from: n */
    private zzhp[] f14511n;

    /* renamed from: o */
    private zzhp f14512o;

    /* renamed from: p */
    private boolean f14513p;

    /* renamed from: q */
    private boolean f14514q;

    /* renamed from: r */
    private boolean f14515r;

    /* renamed from: s */
    private int f14516s;

    /* renamed from: t */
    private int f14517t = 0;

    /* renamed from: u */
    private int f14518u = 0;

    /* renamed from: v */
    private long f14519v;

    /* renamed from: w */
    private volatile long f14520w;

    /* renamed from: x */
    private volatile long f14521x;

    /* renamed from: y */
    private volatile long f14522y;

    public C7303az(Handler handler, boolean z, boolean[] zArr, int i, int i2) {
        this.f14505h = handler;
        this.f14514q = z;
        this.f14507j = new boolean[zArr.length];
        this.f14508k = 2500000;
        this.f14509l = 5000000;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            this.f14507j[i3] = zArr[i3];
        }
        this.f14516s = 1;
        this.f14520w = -1;
        this.f14522y = -1;
        this.f14506i = new C7340bz();
        this.f14510m = new ArrayList(zArr.length);
        zzko zzko = new zzko(String.valueOf(C7303az.class.getSimpleName()).concat(":Handler"), -16);
        this.f14504g = zzko;
        zzko.start();
        this.f14503f = new Handler(this.f14504g.getLooper(), this);
    }

    /* renamed from: f */
    private final void m16520f() throws zzgd {
        this.f14515r = false;
        this.f14506i.mo25754a();
        for (int i = 0; i < this.f14510m.size(); i++) {
            this.f14510m.get(i).mo29345h();
        }
    }

    /* renamed from: g */
    private final void m16521g() throws zzgd {
        this.f14506i.mo25756b();
        for (int i = 0; i < this.f14510m.size(); i++) {
            m16519b(this.f14510m.get(i));
        }
    }

    /* renamed from: h */
    private final void m16522h() {
        zzhp zzhp = this.f14512o;
        if (zzhp == null || !this.f14510m.contains(zzhp) || this.f14512o.mo29317l()) {
            this.f14521x = this.f14506i.mo25757c();
        } else {
            this.f14521x = this.f14512o.mo29318m();
            this.f14506i.mo25755a(this.f14521x);
        }
        this.f14519v = SystemClock.elapsedRealtime() * 1000;
    }

    /* renamed from: i */
    private final void m16523i() {
        m16524j();
        m16516a(1);
    }

    /* renamed from: j */
    private final void m16524j() {
        this.f14503f.removeMessages(7);
        this.f14503f.removeMessages(2);
        int i = 0;
        this.f14515r = false;
        this.f14506i.mo25756b();
        if (this.f14511n != null) {
            while (true) {
                zzhp[] zzhpArr = this.f14511n;
                if (i < zzhpArr.length) {
                    zzhp zzhp = zzhpArr[i];
                    try {
                        m16519b(zzhp);
                        if (zzhp.mo29342c() == 2) {
                            zzhp.mo29340a();
                        }
                    } catch (zzgd e) {
                        Log.e("ExoPlayerImplInternal", "Stop failed.", e);
                    } catch (RuntimeException e2) {
                        Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
                    }
                    try {
                        zzhp.mo29344g();
                    } catch (zzgd e3) {
                        Log.e("ExoPlayerImplInternal", "Release failed.", e3);
                    } catch (RuntimeException e4) {
                        Log.e("ExoPlayerImplInternal", "Release failed.", e4);
                    }
                    i++;
                } else {
                    this.f14511n = null;
                    this.f14512o = null;
                    this.f14510m.clear();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final long mo25607a() {
        if (this.f14522y == -1) {
            return -1;
        }
        return this.f14522y / 1000;
    }

    /* renamed from: b */
    public final long mo25613b() {
        if (this.f14520w == -1) {
            return -1;
        }
        return this.f14520w / 1000;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo25615c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f14513p     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f14503f     // Catch:{ all -> 0x0024 }
            r1 = 5
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f14513p     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f14504g     // Catch:{ all -> 0x0024 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7303az.mo25615c():void");
    }

    /* renamed from: d */
    public final void mo25616d() {
        this.f14503f.sendEmptyMessage(4);
    }

    /* renamed from: e */
    public final long mo25617e() {
        return this.f14521x / 1000;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r21) {
        /*
            r20 = this;
            r7 = r20
            r0 = r21
            r8 = 3
            r9 = 1
            int r1 = r0.what     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r2 = -2
            r4 = 5
            r5 = 7
            r6 = 4
            r10 = 2
            r11 = -1
            switch(r1) {
                case 1: goto L_0x02ee;
                case 2: goto L_0x0241;
                case 3: goto L_0x01fc;
                case 4: goto L_0x01f7;
                case 5: goto L_0x01e5;
                case 6: goto L_0x0196;
                case 7: goto L_0x00b3;
                case 8: goto L_0x004e;
                case 9: goto L_0x0015;
                default: goto L_0x0013;
            }     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0013:
            r0 = 0
            return r0
        L_0x0015:
            int r1 = r0.arg1     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.lang.Object r0 = r0.obj     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = r0.first     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzgf r2 = (com.google.android.gms.internal.ads.zzgf) r2     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x003f }
            r2.mo29295a(r1, r0)     // Catch:{ all -> 0x003f }
            monitor-enter(r20)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r0 = r7.f14518u     // Catch:{ all -> 0x003c }
            int r0 = r0 + r9
            r7.f14518u = r0     // Catch:{ all -> 0x003c }
            r20.notifyAll()     // Catch:{ all -> 0x003c }
            monitor-exit(r20)     // Catch:{ all -> 0x003c }
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == r9) goto L_0x003b
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == r10) goto L_0x003b
            android.os.Handler r0 = r7.f14503f     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.sendEmptyMessage(r5)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x003b:
            return r9
        L_0x003c:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x003f:
            r0 = move-exception
            monitor-enter(r20)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r1 = r7.f14518u     // Catch:{ all -> 0x004b }
            int r1 = r1 + r9
            r7.f14518u = r1     // Catch:{ all -> 0x004b }
            r20.notifyAll()     // Catch:{ all -> 0x004b }
            monitor-exit(r20)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x004b:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x004e:
            int r1 = r0.arg1     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r0 = r0.arg2     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == 0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            boolean[] r2 = r7.f14507j     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r2 = r2[r1]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r2 == r0) goto L_0x00b2
            boolean[] r2 = r7.f14507j     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r2[r1] = r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r2 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r2 == r9) goto L_0x00b2
            int r2 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r2 != r10) goto L_0x006a
            goto L_0x00b2
        L_0x006a:
            com.google.android.gms.internal.ads.zzhp[] r2 = r7.f14511n     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = r2[r1]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r2 = r1.mo29342c()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r2 == r9) goto L_0x0078
            if (r2 == r10) goto L_0x0078
            if (r2 != r8) goto L_0x00b2
        L_0x0078:
            if (r0 == 0) goto L_0x009a
            boolean r0 = r7.f14514q     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == 0) goto L_0x0084
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 != r6) goto L_0x0084
            r13 = 1
            goto L_0x0085
        L_0x0084:
            r13 = 0
        L_0x0085:
            long r2 = r7.f14521x     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1.mo29341b(r2, r13)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.util.List<com.google.android.gms.internal.ads.zzhp> r0 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.add(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r13 == 0) goto L_0x0094
            r1.mo29345h()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0094:
            android.os.Handler r0 = r7.f14503f     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.sendEmptyMessage(r5)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x00b2
        L_0x009a:
            com.google.android.gms.internal.ads.zzhp r0 = r7.f14512o     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r1 != r0) goto L_0x00a7
            com.google.android.gms.internal.ads.bz r0 = r7.f14506i     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r2 = r1.mo29318m()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.mo25755a(r2)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x00a7:
            m16519b(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.util.List<com.google.android.gms.internal.ads.zzhp> r0 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.remove(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1.mo29340a()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x00b2:
            return r9
        L_0x00b3:
            java.lang.String r0 = "doSomeWork"
            com.google.android.gms.internal.ads.zzkp.m24684a(r0)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r0 = r7.f14520w     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x00c5
            long r0 = r7.f14520w     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x00ca
        L_0x00c5:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00ca:
            r20.m16522h()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r10 = 0
            r16 = 1
            r17 = 1
        L_0x00d2:
            java.util.List<com.google.android.gms.internal.ads.zzhp> r13 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r13 = r13.size()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r10 >= r13) goto L_0x0132
            java.util.List<com.google.android.gms.internal.ads.zzhp> r13 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.lang.Object r13 = r13.get(r10)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            com.google.android.gms.internal.ads.zzhp r13 = (com.google.android.gms.internal.ads.zzhp) r13     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r5 = r7.f14521x     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r8 = r7.f14519v     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r13.mo29320a((long) r5, (long) r8)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r16 == 0) goto L_0x00f4
            boolean r5 = r13.mo29317l()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r5 == 0) goto L_0x00f4
            r16 = 1
            goto L_0x00f6
        L_0x00f4:
            r16 = 0
        L_0x00f6:
            if (r17 == 0) goto L_0x0101
            boolean r5 = r7.m16518a((com.google.android.gms.internal.ads.zzhp) r13)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r5 == 0) goto L_0x0101
            r17 = 1
            goto L_0x0103
        L_0x0101:
            r17 = 0
        L_0x0103:
            int r5 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x012b
            long r5 = r13.mo29324b()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r8 = r13.mo29325j()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0115
            r0 = r11
            goto L_0x012b
        L_0x0115:
            r18 = -3
            int r13 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r13 == 0) goto L_0x012b
            int r13 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0127
            int r13 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x0127
            int r13 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x012b
        L_0x0127:
            long r0 = java.lang.Math.min(r0, r8)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x012b:
            int r10 = r10 + 1
            r5 = 7
            r6 = 4
            r8 = 3
            r9 = 1
            goto L_0x00d2
        L_0x0132:
            r7.f14522y = r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r16 == 0) goto L_0x013d
            r7.m16516a((int) r4)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r20.m16521g()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x0162
        L_0x013d:
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 3
            if (r0 != r1) goto L_0x0150
            if (r17 == 0) goto L_0x0150
            r0 = 4
            r7.m16516a((int) r0)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r0 = r7.f14514q     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == 0) goto L_0x0162
            r20.m16520f()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x0162
        L_0x0150:
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 4
            if (r0 != r1) goto L_0x0162
            if (r17 != 0) goto L_0x0162
            boolean r0 = r7.f14514q     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r7.f14515r = r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 3
            r7.m16516a((int) r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r20.m16521g()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0162:
            android.os.Handler r0 = r7.f14503f     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 7
            r0.removeMessages(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r0 = r7.f14514q     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == 0) goto L_0x0171
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 4
            if (r0 == r1) goto L_0x0176
        L_0x0171:
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 3
            if (r0 != r1) goto L_0x0180
        L_0x0176:
            r2 = 7
            r5 = 10
            r1 = r20
            r3 = r14
            r1.m16517a((int) r2, (long) r3, (long) r5)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x0191
        L_0x0180:
            java.util.List<com.google.android.gms.internal.ads.zzhp> r0 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r0 = r0.isEmpty()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 != 0) goto L_0x0191
            r2 = 7
            r5 = 1000(0x3e8, double:4.94E-321)
            r1 = r20
            r3 = r14
            r1.m16517a((int) r2, (long) r3, (long) r5)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0191:
            com.google.android.gms.internal.ads.zzkp.m24683a()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 1
            return r1
        L_0x0196:
            java.lang.Object r0 = r0.obj     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r0 = r0.longValue()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r2 = 0
            r7.f14515r = r2     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r7.f14521x = r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            com.google.android.gms.internal.ads.bz r0 = r7.f14506i     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.mo25756b()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            com.google.android.gms.internal.ads.bz r0 = r7.f14506i     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r1 = r7.f14521x     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.mo25755a(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 1
            if (r0 == r1) goto L_0x01e3
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 != r10) goto L_0x01bd
            goto L_0x01e3
        L_0x01bd:
            r13 = 0
        L_0x01be:
            java.util.List<com.google.android.gms.internal.ads.zzhp> r0 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r0 = r0.size()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r13 >= r0) goto L_0x01d9
            java.util.List<com.google.android.gms.internal.ads.zzhp> r0 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            com.google.android.gms.internal.ads.zzhp r0 = (com.google.android.gms.internal.ads.zzhp) r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            m16519b(r0)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r1 = r7.f14521x     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.mo29307a(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r13 = r13 + 1
            goto L_0x01be
        L_0x01d9:
            r1 = 3
            r7.m16516a((int) r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            android.os.Handler r0 = r7.f14503f     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 7
            r0.sendEmptyMessage(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x01e3:
            r1 = 1
            return r1
        L_0x01e5:
            r20.m16524j()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 1
            r7.m16516a((int) r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            monitor-enter(r20)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r7.f14513p = r1     // Catch:{ all -> 0x01f4 }
            r20.notifyAll()     // Catch:{ all -> 0x01f4 }
            monitor-exit(r20)     // Catch:{ all -> 0x01f4 }
            return r1
        L_0x01f4:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x01f7:
            r20.m16523i()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 1
            return r1
        L_0x01fc:
            int r0 = r0.arg1     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == 0) goto L_0x0202
            r0 = 1
            goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            r1 = 0
            r7.f14515r = r1     // Catch:{ all -> 0x0236 }
            r7.f14514q = r0     // Catch:{ all -> 0x0236 }
            if (r0 != 0) goto L_0x0211
            r20.m16521g()     // Catch:{ all -> 0x0236 }
            r20.m16522h()     // Catch:{ all -> 0x0236 }
            goto L_0x022b
        L_0x0211:
            int r0 = r7.f14516s     // Catch:{ all -> 0x0236 }
            r1 = 4
            if (r0 != r1) goto L_0x0220
            r20.m16520f()     // Catch:{ all -> 0x0236 }
            android.os.Handler r0 = r7.f14503f     // Catch:{ all -> 0x0236 }
            r1 = 7
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0236 }
            goto L_0x022b
        L_0x0220:
            int r0 = r7.f14516s     // Catch:{ all -> 0x0236 }
            r1 = 3
            if (r0 != r1) goto L_0x022b
            android.os.Handler r0 = r7.f14503f     // Catch:{ all -> 0x0236 }
            r1 = 7
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0236 }
        L_0x022b:
            android.os.Handler r0 = r7.f14505h     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            android.os.Message r0 = r0.obtainMessage(r10)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.sendToTarget()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 1
            return r1
        L_0x0236:
            r0 = move-exception
            android.os.Handler r1 = r7.f14505h     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            android.os.Message r1 = r1.obtainMessage(r10)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1.sendToTarget()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            throw r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0241:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0 = 0
            r1 = 1
        L_0x0247:
            com.google.android.gms.internal.ads.zzhp[] r8 = r7.f14511n     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r8 = r8.length     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 >= r8) goto L_0x0266
            com.google.android.gms.internal.ads.zzhp[] r8 = r7.f14511n     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r8 = r8[r0]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r8 = r8.mo29342c()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r8 != 0) goto L_0x0263
            com.google.android.gms.internal.ads.zzhp[] r8 = r7.f14511n     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r8 = r8[r0]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            long r9 = r7.f14521x     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r8 = r8.mo29343c(r9)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r8 != 0) goto L_0x0263
            r1 = 0
        L_0x0263:
            int r0 = r0 + 1
            goto L_0x0247
        L_0x0266:
            if (r1 != 0) goto L_0x0275
            r2 = 2
            r8 = 10
            r1 = r20
            r3 = r5
            r5 = r8
            r1.m16517a((int) r2, (long) r3, (long) r5)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0272:
            r1 = 1
            goto L_0x02ed
        L_0x0275:
            r0 = 0
            r5 = 0
            r6 = 1
            r8 = 1
        L_0x027a:
            com.google.android.gms.internal.ads.zzhp[] r9 = r7.f14511n     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r9 = r9.length     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r5 >= r9) goto L_0x02ca
            com.google.android.gms.internal.ads.zzhp[] r9 = r7.f14511n     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r9 = r9[r5]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean[] r10 = r7.f14507j     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r10 = r10[r5]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r10 == 0) goto L_0x02c7
            int r10 = r9.mo29342c()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r13 = 1
            if (r10 != r13) goto L_0x02c7
            long r13 = r7.f14521x     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r10 = 0
            r9.mo29341b(r13, r10)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            java.util.List<com.google.android.gms.internal.ads.zzhp> r10 = r7.f14510m     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r10.add(r9)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r6 == 0) goto L_0x02a5
            boolean r6 = r9.mo29317l()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r6 == 0) goto L_0x02a5
            r6 = 1
            goto L_0x02a6
        L_0x02a5:
            r6 = 0
        L_0x02a6:
            if (r8 == 0) goto L_0x02b0
            boolean r8 = r7.m16518a((com.google.android.gms.internal.ads.zzhp) r9)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r8 == 0) goto L_0x02b0
            r8 = 1
            goto L_0x02b1
        L_0x02b0:
            r8 = 0
        L_0x02b1:
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 == 0) goto L_0x02c7
            long r9 = r9.mo29324b()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x02bf
            r0 = r11
            goto L_0x02c7
        L_0x02bf:
            int r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x02c7
            long r0 = java.lang.Math.max(r0, r9)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x02c7:
            int r5 = r5 + 1
            goto L_0x027a
        L_0x02ca:
            r7.f14520w = r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r6 == 0) goto L_0x02d2
            r7.m16516a((int) r4)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x02e6
        L_0x02d2:
            if (r8 == 0) goto L_0x02d6
            r1 = 4
            goto L_0x02d7
        L_0x02d6:
            r1 = 3
        L_0x02d7:
            r7.m16516a((int) r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r0 = r7.f14514q     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r0 == 0) goto L_0x02e6
            int r0 = r7.f14516s     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 4
            if (r0 != r1) goto L_0x02e6
            r20.m16520f()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x02e6:
            android.os.Handler r0 = r7.f14503f     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 7
            r0.sendEmptyMessage(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            goto L_0x0272
        L_0x02ed:
            return r1
        L_0x02ee:
            java.lang.Object r0 = r0.obj     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            com.google.android.gms.internal.ads.zzhp[] r0 = (com.google.android.gms.internal.ads.zzhp[]) r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r20.m16524j()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r7.f14511n = r0     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r2 = 0
        L_0x02f8:
            int r1 = r0.length     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r2 >= r1) goto L_0x0314
            r1 = r0[r2]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            boolean r1 = r1.mo29316k()     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r1 == 0) goto L_0x0311
            com.google.android.gms.internal.ads.zzhp r1 = r7.f14512o     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            if (r1 != 0) goto L_0x0309
            r1 = 1
            goto L_0x030a
        L_0x0309:
            r1 = 0
        L_0x030a:
            com.google.android.gms.internal.ads.zzkh.m24659b(r1)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = r0[r2]     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r7.f14512o = r1     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
        L_0x0311:
            int r2 = r2 + 1
            goto L_0x02f8
        L_0x0314:
            r7.m16516a((int) r10)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            android.os.Handler r0 = r7.f14503f     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r0.sendEmptyMessage(r10)     // Catch:{ zzgd -> 0x033a, RuntimeException -> 0x031e }
            r1 = 1
            return r1
        L_0x031e:
            r0 = move-exception
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r2 = "Internal runtime error."
            android.util.Log.e(r1, r2, r0)
            android.os.Handler r1 = r7.f14505h
            com.google.android.gms.internal.ads.zzgd r2 = new com.google.android.gms.internal.ads.zzgd
            r3 = 1
            r2.<init>(r0, r3)
            r4 = 3
            android.os.Message r0 = r1.obtainMessage(r4, r2)
            r0.sendToTarget()
            r20.m16523i()
            return r3
        L_0x033a:
            r0 = move-exception
            r3 = 1
            r4 = 3
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r2 = "Internal track renderer error."
            android.util.Log.e(r1, r2, r0)
            android.os.Handler r1 = r7.f14505h
            android.os.Message r0 = r1.obtainMessage(r4, r0)
            r0.sendToTarget()
            r20.m16523i()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7303az.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    public final void mo25612a(zzhp... zzhpArr) {
        this.f14503f.obtainMessage(1, zzhpArr).sendToTarget();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0040 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo25614b(com.google.android.gms.internal.ads.zzgf r4, int r5, java.lang.Object r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.f14513p     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x0021
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r6 = 57
            r5.<init>(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "Sent message(1"
            r5.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = ") after release. Message ignored."
            r5.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004a }
            android.util.Log.w(r4, r5)     // Catch:{ all -> 0x004a }
            monitor-exit(r3)
            return
        L_0x0021:
            int r5 = r3.f14517t     // Catch:{ all -> 0x004a }
            int r0 = r5 + 1
            r3.f14517t = r0     // Catch:{ all -> 0x004a }
            android.os.Handler r0 = r3.f14503f     // Catch:{ all -> 0x004a }
            r1 = 9
            r2 = 0
            android.util.Pair r4 = android.util.Pair.create(r4, r6)     // Catch:{ all -> 0x004a }
            r6 = 1
            android.os.Message r4 = r0.obtainMessage(r1, r6, r2, r4)     // Catch:{ all -> 0x004a }
            r4.sendToTarget()     // Catch:{ all -> 0x004a }
        L_0x0038:
            int r4 = r3.f14518u     // Catch:{ all -> 0x004a }
            if (r4 > r5) goto L_0x0048
            r3.wait()     // Catch:{ InterruptedException -> 0x0040 }
            goto L_0x0038
        L_0x0040:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004a }
            r4.interrupt()     // Catch:{ all -> 0x004a }
            goto L_0x0038
        L_0x0048:
            monitor-exit(r3)
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)
            goto L_0x004e
        L_0x004d:
            throw r4
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7303az.mo25614b(com.google.android.gms.internal.ads.zzgf, int, java.lang.Object):void");
    }

    /* renamed from: a */
    public final void mo25611a(boolean z) {
        this.f14503f.obtainMessage(3, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25609a(long j) {
        this.f14503f.obtainMessage(6, Long.valueOf(j)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25608a(int i, boolean z) {
        this.f14503f.obtainMessage(8, 0, z ? 1 : 0).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25610a(zzgf zzgf, int i, Object obj) {
        this.f14517t++;
        this.f14503f.obtainMessage(9, 1, 0, Pair.create(zzgf, obj)).sendToTarget();
    }

    /* renamed from: a */
    private final void m16516a(int i) {
        if (this.f14516s != i) {
            this.f14516s = i;
            this.f14505h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: a */
    private final boolean m16518a(zzhp zzhp) {
        if (zzhp.mo29317l()) {
            return true;
        }
        if (!zzhp.mo29313d()) {
            return false;
        }
        if (this.f14516s == 4) {
            return true;
        }
        long b = zzhp.mo29324b();
        long j = zzhp.mo29325j();
        long j2 = this.f14515r ? this.f14509l : this.f14508k;
        if (j2 <= 0 || j == -1 || j == -3 || j >= this.f14521x + j2 || (b != -1 && b != -2 && j >= b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m16519b(zzhp zzhp) throws zzgd {
        if (zzhp.mo29342c() == 3) {
            zzhp.mo29346i();
        }
    }

    /* renamed from: a */
    private final void m16517a(int i, long j, long j2) {
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f14503f.sendEmptyMessage(i);
        } else {
            this.f14503f.sendEmptyMessageDelayed(i, elapsedRealtime);
        }
    }
}
