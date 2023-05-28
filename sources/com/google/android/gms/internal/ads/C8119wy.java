package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wy */
final class C8119wy implements q30 {

    /* renamed from: a */
    private final Map<String, List<zzr<?>>> f17105a = new HashMap();

    /* renamed from: b */
    private final zzd f17106b;

    C8119wy(zzd zzd) {
        this.f17106b = zzd;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m18432b(com.google.android.gms.internal.ads.zzr<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo29661m()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzr<?>>> r1 = r5.f17105a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzr<?>>> r1 = r5.f17105a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo29653a((java.lang.String) r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzr<?>>> r6 = r5.f17105a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.zzag.f18074b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.zzag.m19159a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.zzr<?>>> r1 = r5.f17105a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo29650a((com.google.android.gms.internal.ads.q30) r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.zzag.f18074b     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.zzag.m19159a(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8119wy.m18432b(com.google.android.gms.internal.ads.zzr):boolean");
    }

    /* renamed from: a */
    public final void mo26466a(zzr<?> zzr, zzy<?> zzy) {
        List<zzr> remove;
        zzc zzc = zzy.f23003b;
        if (zzc == null || zzc.mo28614a()) {
            mo26465a(zzr);
            return;
        }
        String m = zzr.mo29661m();
        synchronized (this) {
            remove = this.f17105a.remove(m);
        }
        if (remove != null) {
            if (zzag.f18074b) {
                zzag.m19162c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), m);
            }
            for (zzr a : remove) {
                this.f17106b.f21273i.mo26969a((zzr<?>) a, zzy);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo26465a(zzr<?> zzr) {
        String m = zzr.mo29661m();
        List remove = this.f17105a.remove(m);
        if (remove != null && !remove.isEmpty()) {
            if (zzag.f18074b) {
                zzag.m19162c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), m);
            }
            zzr zzr2 = (zzr) remove.remove(0);
            this.f17105a.put(m, remove);
            zzr2.mo29650a((q30) this);
            try {
                this.f17106b.f21271g.put(zzr2);
            } catch (InterruptedException e) {
                zzag.m19161b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f17106b.mo28866a();
            }
        }
    }
}
