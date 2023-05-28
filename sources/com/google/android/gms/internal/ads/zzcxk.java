package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzcxk {

    /* renamed from: a */
    private final Clock f21098a;

    /* renamed from: b */
    private final Object f21099b = new Object();

    /* renamed from: c */
    private volatile int f21100c = C8110wp.f17098a;

    /* renamed from: d */
    private volatile long f21101d = 0;

    public zzcxk(Clock clock) {
        this.f21098a = clock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23057a(int r5, int r6) {
        /*
            r4 = this;
            r4.m23058d()
            com.google.android.gms.common.util.Clock r0 = r4.f21098a
            long r0 = r0.mo25498b()
            java.lang.Object r2 = r4.f21099b
            monitor-enter(r2)
            int r3 = r4.f21100c     // Catch:{ all -> 0x001e }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x0012:
            r4.f21100c = r6     // Catch:{ all -> 0x001e }
            int r5 = r4.f21100c     // Catch:{ all -> 0x001e }
            int r6 = com.google.android.gms.internal.ads.C8110wp.f17100c     // Catch:{ all -> 0x001e }
            if (r5 != r6) goto L_0x001c
            r4.f21101d = r0     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcxk.m23057a(int, int):void");
    }

    /* renamed from: d */
    private final void m23058d() {
        long b = this.f21098a.mo25498b();
        synchronized (this.f21099b) {
            if (this.f21100c == C8110wp.f17100c) {
                if (this.f21101d + ((Long) zzyt.m25670e().mo27163a(zzacu.f17856U2)).longValue() <= b) {
                    this.f21100c = C8110wp.f17098a;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo28814b() {
        boolean z;
        synchronized (this.f21099b) {
            m23058d();
            z = this.f21100c == C8110wp.f17100c;
        }
        return z;
    }

    /* renamed from: c */
    public final void mo28815c() {
        m23057a(C8110wp.f17099b, C8110wp.f17100c);
    }

    /* renamed from: a */
    public final void mo28812a(boolean z) {
        if (z) {
            m23057a(C8110wp.f17098a, C8110wp.f17099b);
        } else {
            m23057a(C8110wp.f17099b, C8110wp.f17098a);
        }
    }

    /* renamed from: a */
    public final boolean mo28813a() {
        boolean z;
        synchronized (this.f21099b) {
            m23058d();
            z = this.f21100c == C8110wp.f17099b;
        }
        return z;
    }
}
