package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

public final class zzbxg implements zzbrl, zzbur {

    /* renamed from: f */
    private final zzavf f19585f;

    /* renamed from: g */
    private final Context f19586g;

    /* renamed from: h */
    private final zzavg f19587h;

    /* renamed from: i */
    private final View f19588i;

    /* renamed from: j */
    private String f19589j;

    /* renamed from: k */
    private final int f19590k;

    public zzbxg(zzavf zzavf, Context context, zzavg zzavg, View view, int i) {
        this.f19585f = zzavf;
        this.f19586g = context;
        this.f19587h = zzavg;
        this.f19588i = view;
        this.f19590k = i;
    }

    /* renamed from: a */
    public final void mo28260a(zzasr zzasr, String str, String str2) {
        if (this.f19587h.mo27700f(this.f19586g)) {
            try {
                this.f19587h.mo27689a(this.f19586g, this.f19587h.mo27693c(this.f19586g), this.f19585f.mo27685j(), zzasr.getType(), zzasr.getAmount());
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception to get reward item.", e);
            }
        }
    }

    public final void onAdClosed() {
        this.f19585f.mo27684f(false);
    }

    public final void onAdLeftApplication() {
    }

    public final void onAdOpened() {
        View view = this.f19588i;
        if (!(view == null || this.f19589j == null)) {
            this.f19587h.mo27694c(view.getContext(), this.f19589j);
        }
        this.f19585f.mo27684f(true);
    }

    public final void onRewardedVideoCompleted() {
    }

    public final void onRewardedVideoStarted() {
    }

    /* renamed from: s */
    public final void mo28449s() {
        String g = this.f19587h.mo27701g(this.f19586g);
        this.f19589j = g;
        String valueOf = String.valueOf(g);
        String str = this.f19590k == 7 ? "/Rewarded" : "/Interstitial";
        this.f19589j = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}
