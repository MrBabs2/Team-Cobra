package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaExtractor;

public final class zzgb {

    /* renamed from: a */
    public byte[] f21870a;

    /* renamed from: b */
    private byte[] f21871b;

    /* renamed from: c */
    private int f21872c;

    /* renamed from: d */
    public int[] f21873d;

    /* renamed from: e */
    public int[] f21874e;

    /* renamed from: f */
    private int f21875f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f21876g;

    public zzgb() {
        this.f21876g = zzkq.f22154a >= 16 ? new MediaCodec.CryptoInfo() : null;
    }

    /* renamed from: a */
    public final void mo29293a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f21875f = i;
        this.f21873d = iArr;
        this.f21874e = iArr2;
        this.f21871b = bArr;
        this.f21870a = bArr2;
        this.f21872c = 1;
        if (zzkq.f22154a >= 16) {
            this.f21876g.set(i, iArr, iArr2, bArr, bArr2, 1);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final void mo29294a(MediaExtractor mediaExtractor) {
        mediaExtractor.getSampleCryptoInfo(this.f21876g);
        MediaCodec.CryptoInfo cryptoInfo = this.f21876g;
        this.f21875f = cryptoInfo.numSubSamples;
        this.f21873d = cryptoInfo.numBytesOfClearData;
        this.f21874e = cryptoInfo.numBytesOfEncryptedData;
        this.f21871b = cryptoInfo.key;
        this.f21870a = cryptoInfo.iv;
        this.f21872c = cryptoInfo.mode;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo29292a() {
        return this.f21876g;
    }
}
