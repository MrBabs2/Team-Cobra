package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class zzdkc implements zzdbq {

    /* renamed from: f */
    private static final byte[] f21443f = new byte[0];

    /* renamed from: a */
    private final zzdke f21444a;

    /* renamed from: b */
    private final String f21445b;

    /* renamed from: c */
    private final byte[] f21446c;

    /* renamed from: d */
    private final zzdkv f21447d;

    /* renamed from: e */
    private final zzdka f21448e;

    public zzdkc(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdkv zzdkv, zzdka zzdka) throws GeneralSecurityException {
        zzdkr.m23716a(eCPublicKey);
        this.f21444a = new zzdke(eCPublicKey);
        this.f21446c = bArr;
        this.f21445b = str;
        this.f21447d = zzdkv;
        this.f21448e = zzdka;
    }

    /* renamed from: a */
    public final byte[] mo26525a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzdkf a = this.f21444a.mo29054a(this.f21445b, this.f21446c, bArr2, this.f21448e.mo26662a(), this.f21447d);
        byte[] a2 = this.f21448e.mo26663a(a.mo29056b()).mo26324a(bArr, f21443f);
        byte[] a3 = a.mo29055a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
