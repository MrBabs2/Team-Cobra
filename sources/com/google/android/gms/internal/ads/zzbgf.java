package com.google.android.gms.internal.ads;

@zzard
public final class zzbgf extends zzbft {
    public zzbgf(zzbdf zzbdf) {
        super(zzbdf);
    }

    /* renamed from: a */
    public final boolean mo28077a(String str) {
        zzbdf zzbdf = (zzbdf) this.f18931h.get();
        if (zzbdf != null) {
            zzbdf.mo25663a(mo28079b(str), (zzbft) this);
        }
        zzbad.m20523d("VideoStreamNoopCache is doing nothing.");
        mo28076a(str, mo28079b(str), "noop", "Noop cache is a noop.");
        return false;
    }

    /* renamed from: b */
    public final void mo28080b() {
    }
}
