package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.k8 */
final class C7649k8 implements zzhh {

    /* renamed from: a */
    private WeakReference<zzhh> f15820a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f15821b;

    private C7649k8(zzbdk zzbdk) {
        this.f15821b = zzbdk;
        this.f15820a = new WeakReference<>((Object) null);
    }

    /* renamed from: a */
    public final void mo26168a(zzhh zzhh) {
        this.f15820a = new WeakReference<>(zzhh);
    }

    /* renamed from: a */
    public final void mo26166a(int i, long j) {
        zzhh zzhh = (zzhh) this.f15820a.get();
        if (zzhh != null) {
            zzhh.mo26166a(i, j);
        }
    }

    /* renamed from: a */
    public final void mo26165a(int i, int i2, float f) {
        zzhh zzhh = (zzhh) this.f15820a.get();
        if (zzhh != null) {
            zzhh.mo26165a(i, i2, f);
        }
    }

    /* renamed from: a */
    public final void mo26167a(Surface surface) {
        zzhh zzhh = (zzhh) this.f15820a.get();
        if (zzhh != null) {
            zzhh.mo26167a(surface);
        }
    }

    /* renamed from: a */
    public final void mo25581a(zzgv zzgv) {
        this.f15821b.m20698a("DecoderInitializationError", zzgv.getMessage());
        zzhh zzhh = (zzhh) this.f15820a.get();
        if (zzhh != null) {
            zzhh.mo25581a(zzgv);
        }
    }

    /* renamed from: a */
    public final void mo25580a(MediaCodec.CryptoException cryptoException) {
        this.f15821b.m20698a("CryptoError", cryptoException.getMessage());
        zzhh zzhh = (zzhh) this.f15820a.get();
        if (zzhh != null) {
            zzhh.mo25580a(cryptoException);
        }
    }

    /* renamed from: a */
    public final void mo25584a(String str, long j, long j2) {
        zzhh zzhh = (zzhh) this.f15820a.get();
        if (zzhh != null) {
            zzhh.mo25584a(str, j, j2);
        }
    }
}
