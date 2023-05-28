package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.fz */
final class C7488fz implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ MediaCodec.CryptoException f15245f;

    /* renamed from: g */
    private final /* synthetic */ zzgr f15246g;

    C7488fz(zzgr zzgr, MediaCodec.CryptoException cryptoException) {
        this.f15246g = zzgr;
        this.f15245f = cryptoException;
    }

    public final void run() {
        this.f15246g.f21906j.mo25580a(this.f15245f);
    }
}
