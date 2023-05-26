package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.zza;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzanl extends zzamt {

    /* renamed from: f */
    private final Object f18215f;

    /* renamed from: g */
    private zzano f18216g;

    /* renamed from: h */
    private zzatk f18217h;

    /* renamed from: i */
    private IObjectWrapper f18218i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public MediationRewardedAd f18219j;

    public zzanl(MediationAdapter mediationAdapter) {
        this.f18215f = mediationAdapter;
    }

    /* renamed from: c */
    private static boolean m19629c(zzxz zzxz) {
        if (zzxz.f22986k) {
            return true;
        }
        zzyt.m25666a();
        return zzazt.m20474a();
    }

    /* renamed from: B0 */
    public final Bundle mo27402B0() {
        return new Bundle();
    }

    /* renamed from: Q */
    public final IObjectWrapper mo27403Q() throws RemoteException {
        Object obj = this.f18215f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return ObjectWrapper.m16391a(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: U */
    public final zzang mo27404U() {
        UnifiedNativeAdMapper b = this.f18216g.mo27518b();
        if (b != null) {
            return new zzaoi(b);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27411a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        mo27412a(iObjectWrapper, zzyd, zzxz, str, (String) null, zzamv);
    }

    /* renamed from: b */
    public final void mo27415b(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        mo27409a(iObjectWrapper, zzxz, str, (String) null, zzamv);
    }

    /* renamed from: c1 */
    public final zzand mo27416c1() {
        NativeAdMapper a = this.f18216g.mo27517a();
        if (a instanceof NativeContentAdMapper) {
            return new zzanr((NativeContentAdMapper) a);
        }
        return null;
    }

    public final void destroy() throws RemoteException {
        Object obj = this.f18215f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onDestroy();
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        }
    }

    /* renamed from: g0 */
    public final zzafe mo27418g0() {
        NativeCustomTemplateAd c = this.f18216g.mo27519c();
        if (c instanceof zzafh) {
            return ((zzafh) c).mo27260a();
        }
        return null;
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f18215f;
        if (obj instanceof zzbjl) {
            return ((zzbjl) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbjl.class.getCanonicalName();
        String canonicalName2 = this.f18215f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m20523d(sb.toString());
        return new Bundle();
    }

    public final zzaar getVideoController() {
        Object obj = this.f18215f;
        if (!(obj instanceof zza)) {
            return null;
        }
        try {
            return ((zza) obj).getVideoController();
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            return null;
        }
    }

    public final boolean isInitialized() throws RemoteException {
        Object obj = this.f18215f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m20516a("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f18215f).isInitialized();
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            return this.f18217h != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: n0 */
    public final boolean mo27422n0() {
        return this.f18215f instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    /* renamed from: n1 */
    public final zzana mo27423n1() {
        NativeAdMapper a = this.f18216g.mo27517a();
        if (a instanceof NativeAppInstallAdMapper) {
            return new zzanq((NativeAppInstallAdMapper) a);
        }
        return null;
    }

    public final void pause() throws RemoteException {
        Object obj = this.f18215f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onPause();
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        }
    }

    public final void resume() throws RemoteException {
        Object obj = this.f18215f;
        if (obj instanceof MediationAdapter) {
            try {
                ((MediationAdapter) obj).onResume();
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        }
    }

    public final void setImmersiveMode(boolean z) throws RemoteException {
        Object obj = this.f18215f;
        if (!(obj instanceof OnImmersiveModeUpdatedListener)) {
            String canonicalName = OnImmersiveModeUpdatedListener.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            return;
        }
        try {
            ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z);
        } catch (Throwable th) {
            zzbad.m20520b("", th);
        }
    }

    public final void showInterstitial() throws RemoteException {
        if (this.f18215f instanceof MediationInterstitialAdapter) {
            zzbad.m20516a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f18215f).showInterstitial();
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        Object obj = this.f18215f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m20516a("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f18215f).showVideo();
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f18219j;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.m16390H(this.f18218i));
            } else {
                zzbad.m20519b("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: t */
    public final void mo27429t(IObjectWrapper iObjectWrapper) throws RemoteException {
        if (this.f18215f instanceof Adapter) {
            zzbad.m20516a("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f18219j;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) ObjectWrapper.m16390H(iObjectWrapper));
            } else {
                zzbad.m20519b("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: w */
    public final void mo27430w(IObjectWrapper iObjectWrapper) throws RemoteException {
        Context context = (Context) ObjectWrapper.m16390H(iObjectWrapper);
        Object obj = this.f18215f;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    public final Bundle zzsh() {
        Object obj = this.f18215f;
        if (obj instanceof zzbjk) {
            return ((zzbjk) obj).zzsh();
        }
        String canonicalName = zzbjk.class.getCanonicalName();
        String canonicalName2 = this.f18215f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        zzbad.m20523d(sb.toString());
        return new Bundle();
    }

    /* renamed from: a */
    public final void mo27412a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException {
        Date date;
        zzyd zzyd2 = zzyd;
        zzxz zzxz2 = zzxz;
        String str3 = str;
        if (this.f18215f instanceof MediationBannerAdapter) {
            zzbad.m20516a("Requesting banner ad from adapter.");
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f18215f;
                Bundle bundle = null;
                HashSet hashSet = zzxz2.f22985j != null ? new HashSet(zzxz2.f22985j) : null;
                if (zzxz2.f22982g == -1) {
                    date = null;
                } else {
                    date = new Date(zzxz2.f22982g);
                }
                zzank zzank = new zzank(date, zzxz2.f22984i, hashSet, zzxz2.f22991p, m19629c(zzxz), zzxz2.f22987l, zzxz2.f22998w, zzxz2.f23000y, m19628a(str3, zzxz2));
                if (zzxz2.f22993r != null) {
                    bundle = zzxz2.f22993r.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) ObjectWrapper.m16390H(iObjectWrapper), new zzano(zzamv), m19626a(str3, zzxz2, str2), zzb.zza(zzyd2.f23020j, zzyd2.f23017g, zzyd2.f23016f), zzank, bundle);
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    public zzanl(Adapter adapter) {
        this.f18215f = adapter;
    }

    /* renamed from: a */
    public final void mo27409a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException {
        Date date;
        zzxz zzxz2 = zzxz;
        String str3 = str;
        if (this.f18215f instanceof MediationInterstitialAdapter) {
            zzbad.m20516a("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f18215f;
                Bundle bundle = null;
                HashSet hashSet = zzxz2.f22985j != null ? new HashSet(zzxz2.f22985j) : null;
                if (zzxz2.f22982g == -1) {
                    date = null;
                } else {
                    date = new Date(zzxz2.f22982g);
                }
                zzank zzank = new zzank(date, zzxz2.f22984i, hashSet, zzxz2.f22991p, m19629c(zzxz), zzxz2.f22987l, zzxz2.f22998w, zzxz2.f23000y, m19628a(str3, zzxz2));
                if (zzxz2.f22993r != null) {
                    bundle = zzxz2.f22993r.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) ObjectWrapper.m16390H(iObjectWrapper), new zzano(zzamv), m19626a(str3, zzxz2, str2), zzank, bundle);
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27410a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv, zzady zzady, List<String> list) throws RemoteException {
        Date date;
        zzxz zzxz2 = zzxz;
        String str3 = str;
        Object obj = this.f18215f;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                Bundle bundle = null;
                HashSet hashSet = zzxz2.f22985j != null ? new HashSet(zzxz2.f22985j) : null;
                if (zzxz2.f22982g == -1) {
                    date = null;
                } else {
                    date = new Date(zzxz2.f22982g);
                }
                zzans zzans = new zzans(date, zzxz2.f22984i, hashSet, zzxz2.f22991p, m19629c(zzxz), zzxz2.f22987l, zzady, list, zzxz2.f22998w, zzxz2.f23000y, m19628a(str3, zzxz2));
                if (zzxz2.f22993r != null) {
                    bundle = zzxz2.f22993r.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f18216g = new zzano(zzamv);
                mediationNativeAdapter.requestNativeAd((Context) ObjectWrapper.m16390H(iObjectWrapper), this.f18216g, m19626a(str3, zzxz2, str2), zzans, bundle);
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27408a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzatk zzatk, String str2) throws RemoteException {
        Bundle bundle;
        zzank zzank;
        Date date;
        zzxz zzxz2 = zzxz;
        zzatk zzatk2 = zzatk;
        String str3 = str2;
        Object obj = this.f18215f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m20516a("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f18215f;
                Bundle a = m19626a(str3, zzxz2, (String) null);
                if (zzxz2 != null) {
                    HashSet hashSet = zzxz2.f22985j != null ? new HashSet(zzxz2.f22985j) : null;
                    if (zzxz2.f22982g == -1) {
                        date = null;
                    } else {
                        date = new Date(zzxz2.f22982g);
                    }
                    zzank zzank2 = new zzank(date, zzxz2.f22984i, hashSet, zzxz2.f22991p, m19629c(zzxz), zzxz2.f22987l, zzxz2.f22998w, zzxz2.f23000y, m19628a(str3, zzxz2));
                    bundle = zzxz2.f22993r != null ? zzxz2.f22993r.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    zzank = zzank2;
                } else {
                    zzank = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.m16390H(iObjectWrapper), zzank, str, new zzatn(zzatk2), a, bundle);
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            this.f18218i = iObjectWrapper;
            this.f18217h = zzatk2;
            zzatk2.mo26038o(ObjectWrapper.m16391a(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27406a(IObjectWrapper iObjectWrapper, zzatk zzatk, List<String> list) throws RemoteException {
        if (this.f18215f instanceof InitializableMediationRewardedVideoAdAdapter) {
            zzbad.m20516a("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f18215f;
                ArrayList arrayList = new ArrayList();
                for (String a : list) {
                    arrayList.add(m19626a(a, (zzxz) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) ObjectWrapper.m16390H(iObjectWrapper), new zzatn(zzatk), arrayList);
            } catch (Throwable th) {
                zzbad.m20522c("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27413a(zzxz zzxz, String str) throws RemoteException {
        mo27414a(zzxz, str, (String) null);
    }

    /* renamed from: a */
    public final void mo27414a(zzxz zzxz, String str, String str2) throws RemoteException {
        Date date;
        zzxz zzxz2 = zzxz;
        String str3 = str;
        Object obj = this.f18215f;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            zzbad.m20516a("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f18215f;
                Bundle bundle = null;
                HashSet hashSet = zzxz2.f22985j != null ? new HashSet(zzxz2.f22985j) : null;
                if (zzxz2.f22982g == -1) {
                    date = null;
                } else {
                    date = new Date(zzxz2.f22982g);
                }
                zzank zzank = new zzank(date, zzxz2.f22984i, hashSet, zzxz2.f22991p, m19629c(zzxz), zzxz2.f22987l, zzxz2.f22998w, zzxz2.f23000y, m19628a(str3, zzxz2));
                if (zzxz2.f22993r != null) {
                    bundle = zzxz2.f22993r.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(zzank, m19626a(str3, zzxz2, str2), bundle);
            } catch (Throwable th) {
                zzbad.m20520b("", th);
                throw new RemoteException();
            }
        } else if (obj instanceof Adapter) {
            mo27407a(this.f18218i, zzxz2, str3, new zzanp((Adapter) obj, this.f18217h));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = Adapter.class.getCanonicalName();
            String canonicalName3 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
            sb.append(canonicalName);
            sb.append(" or ");
            sb.append(canonicalName2);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName3);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27407a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException {
        Bundle bundle;
        zzxz zzxz2 = zzxz;
        String str2 = str;
        if (this.f18215f instanceof Adapter) {
            zzbad.m20516a("Requesting rewarded ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f18215f;
                C7939s2 s2Var = new C7939s2(this, zzamv, adapter);
                Context context = (Context) ObjectWrapper.m16390H(iObjectWrapper);
                Bundle a = m19626a(str2, zzxz2, (String) null);
                if (zzxz2.f22993r == null || (bundle = zzxz2.f22993r.getBundle(this.f18215f.getClass().getName())) == null) {
                    bundle = new Bundle();
                }
                adapter.loadRewardedAd(new MediationRewardedAdConfiguration(context, "", a, bundle, m19629c(zzxz), zzxz2.f22991p, zzxz2.f22987l, zzxz2.f23000y, m19628a(str2, zzxz2)), s2Var);
            } catch (Exception e) {
                zzbad.m20520b("", e);
                throw new RemoteException();
            }
        } else {
            String canonicalName = Adapter.class.getCanonicalName();
            String canonicalName2 = this.f18215f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            zzbad.m20523d(sb.toString());
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    public final void mo27405a(IObjectWrapper iObjectWrapper, zzaiq zzaiq, List<zzaiw> list) throws RemoteException {
        AdFormat adFormat;
        if (this.f18215f instanceof Adapter) {
            C7976t2 t2Var = new C7976t2(this, zzaiq);
            ArrayList arrayList = new ArrayList();
            for (zzaiw next : list) {
                String str = next.f18142f;
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
                    throw new RemoteException();
                }
                arrayList.add(new MediationConfiguration(adFormat, next.f18143g));
            }
            ((Adapter) this.f18215f).initialize((Context) ObjectWrapper.m16390H(iObjectWrapper), t2Var, arrayList);
            return;
        }
        throw new RemoteException();
    }

    /* renamed from: a */
    private final Bundle m19626a(String str, zzxz zzxz, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        zzbad.m20516a(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f18215f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzxz != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzxz.f22987l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            zzbad.m20520b("", th);
            throw new RemoteException();
        }
    }

    /* renamed from: a */
    private static String m19628a(String str, zzxz zzxz) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzxz.f23001z;
        }
    }
}
