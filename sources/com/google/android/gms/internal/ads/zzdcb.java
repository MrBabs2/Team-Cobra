package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzdcb<P> {

    /* renamed from: a */
    private final P f21332a;

    /* renamed from: b */
    private final byte[] f21333b;

    /* renamed from: c */
    private final zzdhm f21334c;

    public zzdcb(P p, byte[] bArr, zzdgu zzdgu, zzdhm zzdhm) {
        this.f21332a = p;
        this.f21333b = Arrays.copyOf(bArr, bArr.length);
        this.f21334c = zzdhm;
    }

    /* renamed from: a */
    public final P mo28918a() {
        return this.f21332a;
    }

    /* renamed from: b */
    public final zzdhm mo28919b() {
        return this.f21334c;
    }

    /* renamed from: c */
    public final byte[] mo28920c() {
        byte[] bArr = this.f21333b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
