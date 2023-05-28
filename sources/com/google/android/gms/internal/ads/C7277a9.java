package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.a9 */
final class C7277a9 implements zzgq {

    /* renamed from: a */
    private final /* synthetic */ zzbdq f14414a;

    C7277a9(zzbdq zzbdq) {
        this.f14414a = zzbdq;
    }

    /* renamed from: a */
    public final void mo25582a(zzhu zzhu) {
        this.f14414a.m7763b("AudioTrackInitializationError", zzhu.getMessage());
    }

    /* renamed from: a */
    public final void mo25584a(String str, long j, long j2) {
    }

    /* renamed from: a */
    public final void mo25583a(zzhv zzhv) {
        this.f14414a.m7763b("AudioTrackWriteError", zzhv.getMessage());
    }

    /* renamed from: a */
    public final void mo25581a(zzgv zzgv) {
        this.f14414a.m7763b("DecoderInitializationError", zzgv.getMessage());
    }

    /* renamed from: a */
    public final void mo25580a(MediaCodec.CryptoException cryptoException) {
        this.f14414a.m7763b("CryptoError", cryptoException.getMessage());
    }
}
