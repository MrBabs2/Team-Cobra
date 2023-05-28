package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
final class m10 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f16194a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f16195b;

    private m10(MediaCodec.CryptoInfo cryptoInfo) {
        this.f16194a = cryptoInfo;
        this.f16195b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m17541a(int i, int i2) {
        this.f16195b.set(i, i2);
        this.f16194a.setPattern(this.f16195b);
    }
}
