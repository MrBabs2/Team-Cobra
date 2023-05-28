package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzdcs implements zzdbj {

    /* renamed from: c */
    private static final byte[] f21343c = new byte[0];

    /* renamed from: a */
    private final zzdgw f21344a;

    /* renamed from: b */
    private final zzdbj f21345b;

    public zzdcs(zzdgw zzdgw, zzdbj zzdbj) {
        this.f21344a = zzdgw;
        this.f21345b = zzdbj;
    }

    /* renamed from: a */
    public final byte[] mo26324a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] g = zzdcf.m23305b(this.f21344a).mo29065g();
        byte[] a = this.f21345b.mo26324a(g, f21343c);
        byte[] a2 = ((zzdbj) zzdcf.m23300a(this.f21344a.mo29002j(), g, zzdbj.class)).mo26324a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
