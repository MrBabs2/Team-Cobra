package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.j8 */
final class C7612j8 implements zzgh {

    /* renamed from: a */
    private WeakReference<zzgh> f15738a;

    /* renamed from: b */
    private final /* synthetic */ zzbdk f15739b;

    private C7612j8(zzbdk zzbdk) {
        this.f15739b = zzbdk;
        this.f15738a = new WeakReference<>((Object) null);
    }

    /* renamed from: a */
    public final void mo26127a(zzgh zzgh) {
        this.f15738a = new WeakReference<>(zzgh);
    }

    /* renamed from: a */
    public final void mo26128a(boolean z, int i) {
        zzgh zzgh = (zzgh) this.f15738a.get();
        if (zzgh != null) {
            zzgh.mo26128a(z, i);
        }
    }

    /* renamed from: a */
    public final void mo26125a() {
        zzgh zzgh = (zzgh) this.f15738a.get();
        if (zzgh != null) {
            zzgh.mo26125a();
        }
    }

    /* renamed from: a */
    public final void mo26126a(zzgd zzgd) {
        this.f15739b.m20698a("PlayerError", zzgd.getMessage());
        zzgh zzgh = (zzgh) this.f15738a.get();
        if (zzgh != null) {
            zzgh.mo26126a(zzgd);
        }
    }
}
