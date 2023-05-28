package com.google.android.gms.internal.ads;

public final class zzxp extends zzdrr<zzxp> {

    /* renamed from: c */
    private static volatile zzxp[] f22975c;

    public zzxp() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: d */
    public static zzxp[] m25631d() {
        if (f22975c == null) {
            synchronized (zzdrv.f21654a) {
                if (f22975c == null) {
                    f22975c = new zzxp[0];
                }
            }
        }
        return f22975c;
    }
}
