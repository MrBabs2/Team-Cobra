package com.google.android.gms.ads.mediation;

public final class VersionInfo {
    private final int zzenq;
    private final int zzenr;
    private final int zzens;

    public VersionInfo(int i, int i2, int i3) {
        this.zzenq = i;
        this.zzenr = i2;
        this.zzens = i3;
    }

    public final int getMajorVersion() {
        return this.zzenq;
    }

    public final int getMicroVersion() {
        return this.zzens;
    }

    public final int getMinorVersion() {
        return this.zzenr;
    }
}
