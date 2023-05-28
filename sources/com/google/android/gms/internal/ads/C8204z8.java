package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.z8 */
final class C8204z8 implements zzhh {

    /* renamed from: a */
    private final /* synthetic */ zzbdq f17560a;

    C8204z8(zzbdq zzbdq) {
        this.f17560a = zzbdq;
    }

    /* renamed from: a */
    public final void mo26166a(int i, long j) {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Dropped frames. Count: ");
        sb.append(i);
        sb.append(" Elapsed: ");
        sb.append(j);
        zzbad.m20516a(sb.toString());
    }

    /* renamed from: a */
    public final void mo26167a(Surface surface) {
    }

    /* renamed from: a */
    public final void mo25584a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo26165a(int i, int i2, float f) {
        int unused = this.f17560a.f8027B = i;
        int unused2 = this.f17560a.f8028C = i2;
        float unused3 = this.f17560a.f8029D = f;
        zzbdq zzbdq = this.f17560a;
        zzbdq.m7757a(zzbdq.f8027B, this.f17560a.f8028C, this.f17560a.f8029D);
    }

    /* renamed from: a */
    public final void mo25581a(zzgv zzgv) {
        this.f17560a.m7763b("DecoderInitializationError", zzgv.getMessage());
    }

    /* renamed from: a */
    public final void mo25580a(MediaCodec.CryptoException cryptoException) {
        this.f17560a.m7763b("CryptoError", cryptoException.getMessage());
    }
}
