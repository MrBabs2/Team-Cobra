package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@zzard
/* renamed from: com.google.android.gms.internal.ads.c7 */
final class C7349c7 {

    /* renamed from: a */
    private final Object f14716a = new Object();

    /* renamed from: b */
    private final List<Runnable> f14717b = new ArrayList();

    /* renamed from: c */
    private boolean f14718c = false;

    /* renamed from: a */
    public final void mo25768a(Runnable runnable, Executor executor) {
        synchronized (this.f14716a) {
            if (this.f14718c) {
                executor.execute(runnable);
            } else {
                this.f14717b.add(new C7386d7(executor, runnable));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r2 >= r1) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r3 = r0.get(r2);
        r2 = r2 + 1;
        ((java.lang.Runnable) r3).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25767a() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r4.f14716a
            monitor-enter(r1)
            boolean r2 = r4.f14718c     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return
        L_0x000e:
            java.util.List<java.lang.Runnable> r2 = r4.f14717b     // Catch:{ all -> 0x0030 }
            r0.addAll(r2)     // Catch:{ all -> 0x0030 }
            java.util.List<java.lang.Runnable> r2 = r4.f14717b     // Catch:{ all -> 0x0030 }
            r2.clear()     // Catch:{ all -> 0x0030 }
            r2 = 1
            r4.f14718c = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            int r1 = r0.size()
            r2 = 0
        L_0x0021:
            if (r2 >= r1) goto L_0x002f
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r3.run()
            goto L_0x0021
        L_0x002f:
            return
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x0034
        L_0x0033:
            throw r0
        L_0x0034:
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7349c7.mo25767a():void");
    }
}
