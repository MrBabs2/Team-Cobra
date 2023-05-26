package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.i8 */
final class C7571i8 implements zzgq {

    /* renamed from: a */
    private WeakReference<zzgq> f15580a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f15581b;

    private C7571i8(zzbdk zzbdk) {
        this.f15581b = zzbdk;
        this.f15580a = new WeakReference<>((Object) null);
    }

    /* renamed from: a */
    public final void mo26076a(zzgq zzgq) {
        this.f15580a = new WeakReference<>(zzgq);
    }

    /* renamed from: a */
    public final void mo25582a(zzhu zzhu) {
        this.f15581b.m20698a("AudioTrackInitializationError", zzhu.getMessage());
        zzgq zzgq = (zzgq) this.f15580a.get();
        if (zzgq != null) {
            zzgq.mo25582a(zzhu);
        }
    }

    /* renamed from: a */
    public final void mo25583a(zzhv zzhv) {
        this.f15581b.m20698a("AudioTrackWriteError", zzhv.getMessage());
        zzgq zzgq = (zzgq) this.f15580a.get();
        if (zzgq != null) {
            zzgq.mo25583a(zzhv);
        }
    }

    /* renamed from: a */
    public final void mo25581a(zzgv zzgv) {
        this.f15581b.m20698a("DecoderInitializationError", zzgv.getMessage());
        zzgq zzgq = (zzgq) this.f15580a.get();
        if (zzgq != null) {
            zzgq.mo25581a(zzgv);
        }
    }

    /* renamed from: a */
    public final void mo25580a(MediaCodec.CryptoException cryptoException) {
        this.f15581b.m20698a("CryptoError", cryptoException.getMessage());
        zzgq zzgq = (zzgq) this.f15580a.get();
        if (zzgq != null) {
            zzgq.mo25580a(cryptoException);
        }
    }

    /* renamed from: a */
    public final void mo25584a(String str, long j, long j2) {
        zzgq zzgq = (zzgq) this.f15580a.get();
        if (zzgq != null) {
            zzgq.mo25584a(str, j, j2);
        }
    }
}
