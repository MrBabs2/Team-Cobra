package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.C7113c;
import com.google.ads.mediation.C7120d;
import com.google.ads.mediation.C7121e;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import p112n.p277e.p278a.C10567a;

@zzard
public final class zzanu<NETWORK_EXTRAS extends C7121e, SERVER_PARAMETERS extends MediationServerParameters> implements C7113c, C7120d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzamv f18240a;

    public zzanu(zzamv zzamv) {
        this.f18240a = zzamv;
    }

    /* renamed from: a */
    public final void mo23790a(MediationBannerAdapter<?, ?> mediationBannerAdapter, C10567a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(valueOf);
        zzbad.m20516a(sb.toString());
        zzyt.m25666a();
        if (!zzazt.m20478b()) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazt.f18727b.post(new C8013u2(this, aVar));
            return;
        }
        try {
            this.f18240a.onAdFailedToLoad(zzaog.m19721a(aVar));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: a */
    public final void mo23797a(MediationInterstitialAdapter<?, ?> mediationInterstitialAdapter, C10567a aVar) {
        String valueOf = String.valueOf(aVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(valueOf);
        sb.append(".");
        zzbad.m20516a(sb.toString());
        zzyt.m25666a();
        if (!zzazt.m20478b()) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", (Throwable) null);
            zzazt.f18727b.post(new C8087w2(this, aVar));
            return;
        }
        try {
            this.f18240a.onAdFailedToLoad(zzaog.m19721a(aVar));
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
