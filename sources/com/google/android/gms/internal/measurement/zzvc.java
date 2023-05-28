package com.google.android.gms.internal.measurement;

public class zzvc {

    /* renamed from: a */
    private volatile zzvv f23524a;

    /* renamed from: b */
    private volatile zzte f23525b;

    static {
        zzub.m26644b();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.zzvv m26692b(com.google.android.gms.internal.measurement.zzvv r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.zzvv r0 = r1.f23524a
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.zzvv r0 = r1.f23524a     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f23524a = r2     // Catch:{ zzuv -> 0x0012 }
            com.google.android.gms.internal.measurement.zzte r0 = com.google.android.gms.internal.measurement.zzte.f23433g     // Catch:{ zzuv -> 0x0012 }
            r1.f23525b = r0     // Catch:{ zzuv -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f23524a = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.zzte r2 = com.google.android.gms.internal.measurement.zzte.f23433g     // Catch:{ all -> 0x001a }
            r1.f23525b = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.zzvv r2 = r1.f23524a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzvc.m26692b(com.google.android.gms.internal.measurement.zzvv):com.google.android.gms.internal.measurement.zzvv");
    }

    /* renamed from: a */
    public final zzvv mo30444a(zzvv zzvv) {
        zzvv zzvv2 = this.f23524a;
        this.f23525b = null;
        this.f23524a = zzvv;
        return zzvv2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvc)) {
            return false;
        }
        zzvc zzvc = (zzvc) obj;
        zzvv zzvv = this.f23524a;
        zzvv zzvv2 = zzvc.f23524a;
        if (zzvv == null && zzvv2 == null) {
            return mo30443a().equals(zzvc.mo30443a());
        }
        if (zzvv != null && zzvv2 != null) {
            return zzvv.equals(zzvv2);
        }
        if (zzvv != null) {
            return zzvv.equals(zzvc.m26692b(zzvv.mo30428f()));
        }
        return m26692b(zzvv2.mo30428f()).equals(zzvv2);
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: a */
    public final zzte mo30443a() {
        if (this.f23525b != null) {
            return this.f23525b;
        }
        synchronized (this) {
            if (this.f23525b != null) {
                zzte zzte = this.f23525b;
                return zzte;
            }
            if (this.f23524a == null) {
                this.f23525b = zzte.f23433g;
            } else {
                this.f23525b = this.f23524a.mo30369e();
            }
            zzte zzte2 = this.f23525b;
            return zzte2;
        }
    }

    /* renamed from: b */
    public final int mo30445b() {
        if (this.f23525b != null) {
            return this.f23525b.size();
        }
        if (this.f23524a != null) {
            return this.f23524a.mo30425b();
        }
        return 0;
    }
}
