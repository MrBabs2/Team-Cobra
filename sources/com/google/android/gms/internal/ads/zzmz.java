package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class zzmz {

    /* renamed from: a */
    public byte[] f22312a;

    /* renamed from: b */
    private byte[] f22313b;

    /* renamed from: c */
    private int f22314c;

    /* renamed from: d */
    public int[] f22315d;

    /* renamed from: e */
    public int[] f22316e;

    /* renamed from: f */
    private int f22317f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f22318g;

    /* renamed from: h */
    private final m10 f22319h;

    public zzmz() {
        m10 m10 = null;
        MediaCodec.CryptoInfo cryptoInfo = zzsy.f22671a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f22318g = cryptoInfo;
        this.f22319h = zzsy.f22671a >= 24 ? new m10(cryptoInfo) : m10;
    }

    /* renamed from: a */
    public final void mo29548a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f22317f = i;
        this.f22315d = iArr;
        this.f22316e = iArr2;
        this.f22313b = bArr;
        this.f22312a = bArr2;
        this.f22314c = i2;
        int i3 = zzsy.f22671a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f22318g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = i2;
            if (i3 >= 24) {
                this.f22319h.m17541a(0, 0);
            }
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo29547a() {
        return this.f22318g;
    }
}
