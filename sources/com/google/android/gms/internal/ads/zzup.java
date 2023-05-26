package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzard
public final class zzup {

    /* renamed from: a */
    private final Object f22794a = new Object();
    @VisibleForTesting

    /* renamed from: b */
    private int f22795b;

    /* renamed from: c */
    private List<zzuo> f22796c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzuo mo29808a(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f22794a
            monitor-enter(r0)
            java.util.List<com.google.android.gms.internal.ads.zzuo> r1 = r7.f22796c     // Catch:{ all -> 0x005a }
            int r1 = r1.size()     // Catch:{ all -> 0x005a }
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r8 = "Queue empty"
            com.google.android.gms.internal.ads.zzbad.m20516a((java.lang.String) r8)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0013:
            java.util.List<com.google.android.gms.internal.ads.zzuo> r1 = r7.f22796c     // Catch:{ all -> 0x005a }
            int r1 = r1.size()     // Catch:{ all -> 0x005a }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x0045
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            java.util.List<com.google.android.gms.internal.ads.zzuo> r1 = r7.f22796c     // Catch:{ all -> 0x005a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005a }
            r3 = 0
        L_0x0026:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x005a }
            if (r5 == 0) goto L_0x003e
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.ads.zzuo r5 = (com.google.android.gms.internal.ads.zzuo) r5     // Catch:{ all -> 0x005a }
            int r6 = r5.mo29791a()     // Catch:{ all -> 0x005a }
            if (r6 <= r8) goto L_0x003b
            r4 = r3
            r2 = r5
            r8 = r6
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x003e:
            java.util.List<com.google.android.gms.internal.ads.zzuo> r8 = r7.f22796c     // Catch:{ all -> 0x005a }
            r8.remove(r4)     // Catch:{ all -> 0x005a }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r2
        L_0x0045:
            java.util.List<com.google.android.gms.internal.ads.zzuo> r1 = r7.f22796c     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.ads.zzuo r1 = (com.google.android.gms.internal.ads.zzuo) r1     // Catch:{ all -> 0x005a }
            if (r8 == 0) goto L_0x0055
            java.util.List<com.google.android.gms.internal.ads.zzuo> r8 = r7.f22796c     // Catch:{ all -> 0x005a }
            r8.remove(r4)     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x0055:
            r1.mo29800f()     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r1
        L_0x005a:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005e
        L_0x005d:
            throw r8
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzup.mo29808a(boolean):com.google.android.gms.internal.ads.zzuo");
    }

    /* renamed from: b */
    public final boolean mo29810b(zzuo zzuo) {
        synchronized (this.f22794a) {
            Iterator<zzuo> it = this.f22796c.iterator();
            while (it.hasNext()) {
                zzuo next = it.next();
                if (!zzk.zzlk().mo27743i().mo27784g()) {
                    if (zzuo != next && next.mo29796c().equals(zzuo.mo29796c())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzk.zzlk().mo27743i().mo27781d() && zzuo != next && next.mo29798e().equals(zzuo.mo29798e())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo29811c(zzuo zzuo) {
        synchronized (this.f22794a) {
            if (this.f22796c.size() >= 10) {
                int size = this.f22796c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzbad.m20516a(sb.toString());
                this.f22796c.remove(0);
            }
            int i = this.f22795b;
            this.f22795b = i + 1;
            zzuo.mo29792a(i);
            zzuo.mo29804i();
            this.f22796c.add(zzuo);
        }
    }

    /* renamed from: a */
    public final boolean mo29809a(zzuo zzuo) {
        synchronized (this.f22794a) {
            if (this.f22796c.contains(zzuo)) {
                return true;
            }
            return false;
        }
    }
}
