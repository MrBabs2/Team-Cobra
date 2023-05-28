package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

public final class zzbvx extends zzbpc {

    /* renamed from: f */
    private final Context f19521f;

    /* renamed from: g */
    private final zzbup f19522g;

    /* renamed from: h */
    private final zzbwz f19523h;

    /* renamed from: i */
    private final zzbpv f19524i;

    /* renamed from: j */
    private final zzdan f19525j;

    /* renamed from: k */
    private boolean f19526k = false;

    zzbvx(Context context, zzbry zzbry, zzbup zzbup, zzbwz zzbwz, zzbpv zzbpv, zzdan zzdan) {
        this.f19521f = context;
        this.f19369c = zzbry;
        this.f19522g = zzbup;
        this.f19523h = zzbwz;
        this.f19524i = zzbpv;
        this.f19525j = zzdan;
    }

    /* renamed from: a */
    public final void mo28462a(boolean z) {
        this.f19522g.mo28449s();
        this.f19523h.mo25736a(z, this.f19521f);
        this.f19526k = true;
    }

    /* renamed from: f */
    public final boolean mo28463f() {
        return this.f19524i.mo28394a();
    }

    /* renamed from: g */
    public final zzbry mo28464g() {
        return this.f19369c;
    }

    /* renamed from: h */
    public final boolean mo28465h() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17958r0)).booleanValue()) {
            zzk.zzlg();
            if (zzaxi.m20304g(this.f19521f)) {
                zzbad.m20523d("It is not recommended to show an interstitial when app is not in foreground.");
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17962s0)).booleanValue()) {
                    this.f19525j.mo28882a(this.f19367a.f21163b.f21158b.f21147b);
                }
                return false;
            }
        }
        if (!this.f19526k) {
            return true;
        }
        return false;
    }
}
