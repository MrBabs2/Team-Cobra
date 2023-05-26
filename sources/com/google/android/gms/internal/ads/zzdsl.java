package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzdsl extends zzdrr<zzdsl> {

    /* renamed from: e */
    private static volatile zzdsl[] f21700e;

    /* renamed from: c */
    public byte[] f21701c = null;

    /* renamed from: d */
    public byte[] f21702d = null;

    public zzdsl() {
        this.f21649b = null;
        this.f21655a = -1;
    }

    /* renamed from: d */
    public static zzdsl[] m24189d() {
        if (f21700e == null) {
            synchronized (zzdrv.f21654a) {
                if (f21700e == null) {
                    f21700e = new zzdsl[0];
                }
            }
        }
        return f21700e;
    }

    /* renamed from: a */
    public final void mo29198a(zzdrp zzdrp) throws IOException {
        zzdrp.mo29195a(1, this.f21701c);
        byte[] bArr = this.f21702d;
        if (bArr != null) {
            zzdrp.mo29195a(2, bArr);
        }
        super.mo29198a(zzdrp);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo29200c() {
        int c = super.mo29200c() + zzdrp.m24120b(1, this.f21701c);
        byte[] bArr = this.f21702d;
        return bArr != null ? c + zzdrp.m24120b(2, bArr) : c;
    }
}
