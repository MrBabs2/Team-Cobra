package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.util.PlatformVersion;

@zzard
public final class zzuq {

    /* renamed from: a */
    private final Object f22797a = new Object();

    /* renamed from: b */
    private o40 f22798b = null;

    /* renamed from: c */
    private boolean f22799c = false;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29813a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f22797a
            monitor-enter(r0)
            boolean r1 = r4.f22799c     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x003a
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.m16285a()     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x000f:
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x0017
            r2 = r5
        L_0x0017:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x001e
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x003c }
        L_0x001e:
            if (r1 != 0) goto L_0x0027
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.zzbad.m20523d(r5)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.o40 r2 = r4.f22798b     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.o40 r2 = new com.google.android.gms.internal.ads.o40     // Catch:{ all -> 0x003c }
            r2.<init>()     // Catch:{ all -> 0x003c }
            r4.f22798b = r2     // Catch:{ all -> 0x003c }
        L_0x0032:
            com.google.android.gms.internal.ads.o40 r2 = r4.f22798b     // Catch:{ all -> 0x003c }
            r2.mo26343a((android.app.Application) r1, (android.content.Context) r5)     // Catch:{ all -> 0x003c }
            r5 = 1
            r4.f22799c = r5     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuq.mo29813a(android.content.Context):void");
    }

    /* renamed from: b */
    public final Context mo29815b() {
        synchronized (this.f22797a) {
            if (!PlatformVersion.m16285a()) {
                return null;
            }
            if (this.f22798b == null) {
                return null;
            }
            Context b = this.f22798b.mo26345b();
            return b;
        }
    }

    /* renamed from: a */
    public final void mo29814a(zzut zzut) {
        synchronized (this.f22797a) {
            if (PlatformVersion.m16285a()) {
                if (this.f22798b == null) {
                    this.f22798b = new o40();
                }
                this.f22798b.mo26344a(zzut);
            }
        }
    }

    /* renamed from: a */
    public final Activity mo29812a() {
        synchronized (this.f22797a) {
            if (!PlatformVersion.m16285a()) {
                return null;
            }
            if (this.f22798b == null) {
                return null;
            }
            Activity a = this.f22798b.mo26342a();
            return a;
        }
    }
}
