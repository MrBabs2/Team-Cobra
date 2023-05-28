package com.google.android.gms.internal.ads;

public final class zzqz extends zzlr {

    /* renamed from: e */
    private static final Object f22554e = new Object();

    /* renamed from: b */
    private final long f22555b;

    /* renamed from: c */
    private final long f22556c;

    /* renamed from: d */
    private final boolean f22557d;

    public zzqz(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    /* renamed from: a */
    public final zzlu mo26676a(int i, zzlu zzlu, boolean z, long j) {
        zzsk.m25213a(i, 0, 1);
        boolean z2 = this.f22557d;
        long j2 = this.f22556c;
        zzlu.f22217a = null;
        zzlu.f22218b = -9223372036854775807L;
        zzlu.f22219c = -9223372036854775807L;
        zzlu.f22220d = z2;
        zzlu.f22221e = false;
        zzlu.f22224h = 0;
        zzlu.f22225i = j2;
        zzlu.f22222f = 0;
        zzlu.f22223g = 0;
        zzlu.f22226j = 0;
        return zzlu;
    }

    /* renamed from: b */
    public final int mo26677b() {
        return 1;
    }

    /* renamed from: c */
    public final int mo26678c() {
        return 1;
    }

    private zzqz(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f22555b = j;
        this.f22556c = j2;
        this.f22557d = z;
    }

    /* renamed from: a */
    public final zzlt mo26675a(int i, zzlt zzlt, boolean z) {
        zzsk.m25213a(i, 0, 1);
        Object obj = z ? f22554e : null;
        zzlt.mo29490a(obj, obj, 0, this.f22555b, 0, false);
        return zzlt;
    }

    /* renamed from: a */
    public final int mo26674a(Object obj) {
        return f22554e.equals(obj) ? 0 : -1;
    }
}
