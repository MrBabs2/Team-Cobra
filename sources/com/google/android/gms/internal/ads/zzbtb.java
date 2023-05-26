package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzbtb extends zzbts<zzbtf> {

    /* renamed from: g */
    private final ScheduledExecutorService f19460g;

    /* renamed from: h */
    private final Clock f19461h;

    /* renamed from: i */
    private long f19462i = -1;

    /* renamed from: j */
    private long f19463j = -1;

    /* renamed from: k */
    private boolean f19464k = false;

    /* renamed from: l */
    private ScheduledFuture<?> f19465l;

    public zzbtb(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.f19460g = scheduledExecutorService;
        this.f19461h = clock;
    }

    /* renamed from: a */
    private final synchronized void m21859a(long j) {
        if (this.f19465l != null && !this.f19465l.isDone()) {
            this.f19465l.cancel(true);
        }
        this.f19462i = this.f19461h.mo25499c() + j;
        this.f19465l = this.f19460g.schedule(new C7803oe(this), j, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final void m21861y() {
        mo28426a(C7729me.f16232a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo28421b(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0043 }
            long r1 = (long) r7     // Catch:{ all -> 0x0043 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0043 }
            boolean r7 = r6.f19464k     // Catch:{ all -> 0x0043 }
            if (r7 == 0) goto L_0x0025
            long r2 = r6.f19463j     // Catch:{ all -> 0x0043 }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
            long r2 = r6.f19463j     // Catch:{ all -> 0x0043 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            long r0 = r6.f19463j     // Catch:{ all -> 0x0043 }
        L_0x0021:
            r6.f19463j = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r6)
            return
        L_0x0025:
            com.google.android.gms.common.util.Clock r7 = r6.f19461h     // Catch:{ all -> 0x0043 }
            long r2 = r7.mo25499c()     // Catch:{ all -> 0x0043 }
            long r4 = r6.f19462i     // Catch:{ all -> 0x0043 }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x003e
            long r2 = r6.f19462i     // Catch:{ all -> 0x0043 }
            com.google.android.gms.common.util.Clock r7 = r6.f19461h     // Catch:{ all -> 0x0043 }
            long r4 = r7.mo25499c()     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r4
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0041
        L_0x003e:
            r6.m21859a((long) r0)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r6)
            return
        L_0x0043:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbtb.mo28421b(int):void");
    }

    public final synchronized void onPause() {
        if (!this.f19464k) {
            if (this.f19465l == null || this.f19465l.isCancelled()) {
                this.f19463j = -1;
            } else {
                this.f19465l.cancel(true);
                this.f19463j = this.f19462i - this.f19461h.mo25499c();
            }
            this.f19464k = true;
        }
    }

    public final synchronized void onResume() {
        if (this.f19464k) {
            if (this.f19463j > 0 && this.f19465l.isCancelled()) {
                m21859a(this.f19463j);
            }
            this.f19464k = false;
        }
    }

    /* renamed from: w */
    public final synchronized void mo28424w() {
        this.f19464k = false;
        m21859a(0);
    }
}
