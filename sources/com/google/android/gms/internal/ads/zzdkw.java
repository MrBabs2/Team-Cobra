package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzdkw implements zzdbj {

    /* renamed from: a */
    private final zzdlk f21460a;

    /* renamed from: b */
    private final zzdby f21461b;

    public zzdkw(zzdlk zzdlk, zzdby zzdby, int i) {
        this.f21460a = zzdlk;
        this.f21461b = zzdby;
    }

    /* renamed from: a */
    public final byte[] mo26324a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.f21460a.mo26247a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return zzdjs.m23702a(a, this.f21461b.mo28913a(zzdjs.m23702a(bArr2, a, copyOf)));
    }
}
