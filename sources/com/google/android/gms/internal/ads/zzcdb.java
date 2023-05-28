package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

public final class zzcdb extends zzbpc {

    /* renamed from: f */
    private final Context f19989f;

    /* renamed from: g */
    private final zzbwz f19990g;

    /* renamed from: h */
    private final zzbup f19991h;

    /* renamed from: i */
    private final zzbrp f19992i;

    /* renamed from: j */
    private final zzbpv f19993j;

    /* renamed from: k */
    private final zzatq f19994k;

    /* renamed from: l */
    private final zzdan f19995l;

    /* renamed from: m */
    private boolean f19996m = false;

    zzcdb(Context context, zzbwz zzbwz, zzbup zzbup, zzbrp zzbrp, zzbry zzbry, zzbpv zzbpv, zzcxm zzcxm, zzdan zzdan) {
        this.f19989f = context;
        this.f19990g = zzbwz;
        this.f19991h = zzbup;
        this.f19992i = zzbrp;
        this.f19369c = zzbry;
        this.f19993j = zzbpv;
        this.f19995l = zzdan;
        this.f19994k = new zzaup(zzcxm.f21128l);
    }

    /* renamed from: a */
    public final void mo28651a(boolean z, Activity activity) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17958r0)).booleanValue()) {
            zzk.zzlg();
            if (zzaxi.m20304g(this.f19989f)) {
                zzbad.m20523d("Rewarded ad can not be shown when app is not in foreground.");
                this.f19992i.mo28407c(3);
                if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17962s0)).booleanValue()) {
                    this.f19995l.mo28882a(this.f19367a.f21163b.f21158b.f21147b);
                    return;
                }
                return;
            }
        }
        if (this.f19996m) {
            zzbad.m20523d("The rewarded ad have been showed.");
            this.f19992i.mo28407c(1);
            return;
        }
        this.f19996m = true;
        this.f19991h.mo28449s();
        Context context = activity;
        if (activity == null) {
            context = this.f19989f;
        }
        this.f19990g.mo25736a(z, context);
    }

    /* renamed from: f */
    public final boolean mo28652f() {
        return this.f19993j.mo28394a();
    }

    /* renamed from: g */
    public final zzbry mo28653g() {
        return this.f19369c;
    }

    /* renamed from: h */
    public final zzatq mo28654h() {
        return this.f19994k;
    }
}
