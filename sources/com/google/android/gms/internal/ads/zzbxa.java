package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;

public final class zzbxa implements zzo, zzbsr {

    /* renamed from: f */
    private final Context f19568f;

    /* renamed from: g */
    private final zzbgz f19569g;

    /* renamed from: h */
    private final zzcxm f19570h;

    /* renamed from: i */
    private final zzbai f19571i;

    /* renamed from: j */
    private final int f19572j;
    @VisibleForTesting

    /* renamed from: k */
    private IObjectWrapper f19573k;

    public zzbxa(Context context, zzbgz zzbgz, zzcxm zzcxm, zzbai zzbai, int i) {
        this.f19568f = context;
        this.f19569g = zzbgz;
        this.f19570h = zzcxm;
        this.f19571i = zzbai;
        this.f19572j = i;
    }

    public final void onAdLoaded() {
        int i = this.f19572j;
        if ((i == 7 || i == 3) && this.f19570h.f21111J && this.f19569g != null && zzk.zzlv().mo27566b(this.f19568f)) {
            zzbai zzbai = this.f19571i;
            int i2 = zzbai.f18743g;
            int i3 = zzbai.f18744h;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i2);
            sb.append(".");
            sb.append(i3);
            IObjectWrapper a = zzk.zzlv().mo27560a(sb.toString(), this.f19569g.getWebView(), "", "javascript", this.f19570h.f21113L.optInt("media_type", -1) == 0 ? null : "javascript");
            this.f19573k = a;
            if (a != null && this.f19569g.getView() != null) {
                zzk.zzlv().mo27564a(this.f19573k, this.f19569g.getView());
                this.f19569g.mo25654a(this.f19573k);
                zzk.zzlv().mo27563a(this.f19573k);
            }
        }
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void zzsz() {
        this.f19573k = null;
    }

    public final void zzta() {
        zzbgz zzbgz;
        if (this.f19573k != null && (zzbgz = this.f19569g) != null) {
            zzbgz.mo25665a("onSdkImpression", (Map<String, ?>) new HashMap());
        }
    }
}
