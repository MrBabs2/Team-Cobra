package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzapc extends zzaow {

    /* renamed from: f */
    private final RtbAdapter f18242f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MediationInterstitialAd f18243g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public MediationRewardedAd f18244h;

    public zzapc(RtbAdapter rtbAdapter) {
        this.f18242f = rtbAdapter;
    }

    /* renamed from: c */
    private static boolean m19786c(zzxz zzxz) {
        if (zzxz.f22986k) {
            return true;
        }
        zzyt.m25666a();
        return zzazt.m20474a();
    }

    /* renamed from: d */
    private final Bundle m19787d(zzxz zzxz) {
        Bundle bundle;
        Bundle bundle2 = zzxz.f22993r;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f18242f.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    /* renamed from: t */
    private static Bundle m19788t(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbad.m20523d(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            zzbad.m20520b("", e);
            throw new RemoteException();
        }
    }

    /* renamed from: O0 */
    public final zzapj mo27520O0() throws RemoteException {
        return zzapj.m19800a(this.f18242f.getSDKVersionInfo());
    }

    /* renamed from: a */
    public final void mo27522a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaoj zzaoj, zzamv zzamv, zzyd zzyd) throws RemoteException {
        zzxz zzxz2 = zzxz;
        zzyd zzyd2 = zzyd;
        try {
            C8198z2 z2Var = new C8198z2(this, zzaoj, zzamv);
            RtbAdapter rtbAdapter = this.f18242f;
            Bundle t = m19788t(str2);
            Bundle d = m19787d(zzxz2);
            boolean c = m19786c(zzxz);
            Location location = zzxz2.f22991p;
            int i = zzxz2.f22987l;
            int i2 = zzxz2.f23000y;
            String a = m19785a(str2, zzxz);
            AdSize zza = zzb.zza(zzyd2.f23020j, zzyd2.f23017g, zzyd2.f23016f);
            MediationBannerAdConfiguration mediationBannerAdConfiguration = r5;
            MediationBannerAdConfiguration mediationBannerAdConfiguration2 = new MediationBannerAdConfiguration((Context) ObjectWrapper.m16390H(iObjectWrapper), str, t, d, c, location, i, i2, a, zza);
            rtbAdapter.loadBannerAd(mediationBannerAdConfiguration, z2Var);
        } catch (Throwable th) {
            zzbad.m20520b("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27526a(String[] strArr, Bundle[] bundleArr) {
    }

    /* renamed from: a1 */
    public final zzapj mo27527a1() throws RemoteException {
        return zzapj.m19800a(this.f18242f.getVersionInfo());
    }

    public final zzaar getVideoController() {
        RtbAdapter rtbAdapter = this.f18242f;
        if (!(rtbAdapter instanceof zza)) {
            return null;
        }
        try {
            return ((zza) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            return null;
        }
    }

    /* renamed from: l */
    public final boolean mo27529l(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.f18243g;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.m16390H(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            return true;
        }
    }

    /* renamed from: m */
    public final boolean mo27530m(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.f18244h;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.m16390H(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            return true;
        }
    }

    /* renamed from: p */
    public final void mo27531p(IObjectWrapper iObjectWrapper) {
    }

    /* renamed from: a */
    public final void mo27523a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamv zzamv) throws RemoteException {
        zzxz zzxz2 = zzxz;
        try {
            this.f18242f.loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.m16390H(iObjectWrapper), str, m19788t(str2), m19787d(zzxz2), m19786c(zzxz), zzxz2.f22991p, zzxz2.f22987l, zzxz2.f23000y, m19785a(str2, zzxz)), new C7271a3(this, zzaom, zzamv));
        } catch (Throwable th) {
            zzbad.m20520b("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27525a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamv zzamv) throws RemoteException {
        zzxz zzxz2 = zzxz;
        try {
            this.f18242f.loadRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.m16390H(iObjectWrapper), str, m19788t(str2), m19787d(zzxz2), m19786c(zzxz), zzxz2.f22991p, zzxz2.f22987l, zzxz2.f23000y, m19785a(str2, zzxz)), new C7308b3(this, zzaos, zzamv));
        } catch (Throwable th) {
            zzbad.m20520b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27524a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaop zzaop, zzamv zzamv) throws RemoteException {
        zzxz zzxz2 = zzxz;
        try {
            this.f18242f.loadNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.m16390H(iObjectWrapper), str, m19788t(str2), m19787d(zzxz2), m19786c(zzxz), zzxz2.f22991p, zzxz2.f22987l, zzxz2.f23000y, m19785a(str2, zzxz)), new C7345c3(this, zzaop, zzamv));
        } catch (Throwable th) {
            zzbad.m20520b("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27521a(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzyd, zzaoy zzaoy) throws RemoteException {
        AdFormat adFormat;
        try {
            C7382d3 d3Var = new C7382d3(this, zzaoy);
            RtbAdapter rtbAdapter = this.f18242f;
            char c = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                adFormat = AdFormat.BANNER;
            } else if (c == 1) {
                adFormat = AdFormat.INTERSTITIAL;
            } else if (c == 2) {
                adFormat = AdFormat.REWARDED;
            } else if (c == 3) {
                adFormat = AdFormat.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.m16390H(iObjectWrapper), new MediationConfiguration(adFormat, bundle2), bundle, zzb.zza(zzyd.f23020j, zzyd.f23017g, zzyd.f23016f)), d3Var);
        } catch (Throwable th) {
            zzbad.m20520b("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static String m19785a(String str, zzxz zzxz) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzxz.f23001z;
        }
    }
}
