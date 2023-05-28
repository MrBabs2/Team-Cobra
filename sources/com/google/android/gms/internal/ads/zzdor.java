package com.google.android.gms.internal.ads;

public class zzdor {

    /* renamed from: a */
    private volatile zzdpk f21601a;

    /* renamed from: b */
    private volatile zzdmr f21602b;

    static {
        zzdno.m23985c();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.zzdpk m24058b(com.google.android.gms.internal.ads.zzdpk r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzdpk r0 = r1.f21601a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdpk r0 = r1.f21601a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f21601a = r2     // Catch:{ zzdok -> 0x0012 }
            com.google.android.gms.internal.ads.zzdmr r0 = com.google.android.gms.internal.ads.zzdmr.f21488g     // Catch:{ zzdok -> 0x0012 }
            r1.f21602b = r0     // Catch:{ zzdok -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f21601a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.ads.zzdmr r2 = com.google.android.gms.internal.ads.zzdmr.f21488g     // Catch:{ all -> 0x001a }
            r1.f21602b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.ads.zzdpk r2 = r1.f21601a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdor.m24058b(com.google.android.gms.internal.ads.zzdpk):com.google.android.gms.internal.ads.zzdpk");
    }

    /* renamed from: a */
    public final zzdpk mo29150a(zzdpk zzdpk) {
        zzdpk zzdpk2 = this.f21601a;
        this.f21602b = null;
        this.f21601a = zzdpk;
        return zzdpk2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdor)) {
            return false;
        }
        zzdor zzdor = (zzdor) obj;
        zzdpk zzdpk = this.f21601a;
        zzdpk zzdpk2 = zzdor.f21601a;
        if (zzdpk == null && zzdpk2 == null) {
            return mo29149a().equals(zzdor.mo29149a());
        }
        if (zzdpk != null && zzdpk2 != null) {
            return zzdpk.equals(zzdpk2);
        }
        if (zzdpk != null) {
            return zzdpk.equals(zzdor.m24058b(zzdpk.mo29132f()));
        }
        return m24058b(zzdpk2.mo29132f()).equals(zzdpk2);
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: a */
    public final zzdmr mo29149a() {
        if (this.f21602b != null) {
            return this.f21602b;
        }
        synchronized (this) {
            if (this.f21602b != null) {
                zzdmr zzdmr = this.f21602b;
                return zzdmr;
            }
            if (this.f21601a == null) {
                this.f21602b = zzdmr.f21488g;
            } else {
                this.f21602b = this.f21601a.mo29064e();
            }
            zzdmr zzdmr2 = this.f21602b;
            return zzdmr2;
        }
    }

    /* renamed from: b */
    public final int mo29151b() {
        if (this.f21602b != null) {
            return this.f21602b.size();
        }
        if (this.f21601a != null) {
            return this.f21601a.mo29133h();
        }
        return 0;
    }
}
