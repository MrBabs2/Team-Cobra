package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

@zzard
public final class zzbfq extends zzawv {

    /* renamed from: a */
    final zzbdf f18924a;

    /* renamed from: b */
    final zzbft f18925b;

    /* renamed from: c */
    private final String f18926c;

    /* renamed from: d */
    private final String[] f18927d;

    zzbfq(zzbdf zzbdf, zzbft zzbft, String str, String[] strArr) {
        this.f18924a = zzbdf;
        this.f18925b = zzbft;
        this.f18926c = str;
        this.f18927d = strArr;
        zzk.zzmc().mo28067a(this);
    }

    public final void zzto() {
        try {
            this.f18925b.mo28078a(this.f18926c, this.f18927d);
        } finally {
            zzaxi.f18651h.post(new C8168y9(this));
        }
    }
}
