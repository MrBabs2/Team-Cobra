package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzabd {

    /* renamed from: a */
    private final zzamo f17729a;

    /* renamed from: b */
    private final Context f17730b;

    /* renamed from: c */
    private AdListener f17731c;

    /* renamed from: d */
    private zzxr f17732d;

    /* renamed from: e */
    private zzzk f17733e;

    /* renamed from: f */
    private String f17734f;

    /* renamed from: g */
    private AdMetadataListener f17735g;

    /* renamed from: h */
    private AppEventListener f17736h;

    /* renamed from: i */
    private OnCustomRenderedAdLoadedListener f17737i;

    /* renamed from: j */
    private Correlator f17738j;

    /* renamed from: k */
    private RewardedVideoAdListener f17739k;

    /* renamed from: l */
    private boolean f17740l;

    /* renamed from: m */
    private boolean f17741m;

    public zzabd(Context context) {
        this(context, zzyc.f23015a, (PublisherInterstitialAd) null);
    }

    /* renamed from: a */
    public final AdListener mo27017a() {
        return this.f17731c;
    }

    /* renamed from: b */
    public final Bundle mo27028b() {
        try {
            if (this.f17733e != null) {
                return this.f17733e.getAdMetadata();
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
        return new Bundle();
    }

    /* renamed from: c */
    public final String mo27030c() {
        return this.f17734f;
    }

    /* renamed from: d */
    public final AppEventListener mo27031d() {
        return this.f17736h;
    }

    /* renamed from: e */
    public final String mo27032e() {
        try {
            if (this.f17733e != null) {
                return this.f17733e.mo27097v();
            }
            return null;
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
            return null;
        }
    }

    /* renamed from: f */
    public final OnCustomRenderedAdLoadedListener mo27033f() {
        return this.f17737i;
    }

    /* renamed from: g */
    public final boolean mo27034g() {
        try {
            if (this.f17733e == null) {
                return false;
            }
            return this.f17733e.mo27091m();
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: h */
    public final boolean mo27035h() {
        try {
            if (this.f17733e == null) {
                return false;
            }
            return this.f17733e.mo27099y();
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
            return false;
        }
    }

    /* renamed from: i */
    public final void mo27036i() {
        try {
            m18831b("show");
            this.f17733e.showInterstitial();
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27024a(zzaaz zzaaz) {
        try {
            if (this.f17733e == null) {
                if (this.f17734f == null) {
                    m18831b("loadAd");
                }
                zzyd d = this.f17740l ? zzyd.m25647d() : new zzyd();
                zzyh b = zzyt.m25667b();
                Context context = this.f17730b;
                zzzk zzzk = (zzzk) new c60(b, context, d, this.f17734f, this.f17729a).mo26124a(context, false);
                this.f17733e = zzzk;
                if (this.f17731c != null) {
                    zzzk.mo27078a((zzyz) new zzxv(this.f17731c));
                }
                if (this.f17732d != null) {
                    this.f17733e.mo27077a((zzyw) new zzxs(this.f17732d));
                }
                if (this.f17735g != null) {
                    this.f17733e.mo27079a((zzzp) new zzxy(this.f17735g));
                }
                if (this.f17736h != null) {
                    this.f17733e.mo27080a((zzzs) new zzyf(this.f17736h));
                }
                if (this.f17737i != null) {
                    this.f17733e.mo27072a((zzado) new zzadr(this.f17737i));
                }
                if (this.f17738j != null) {
                    this.f17733e.mo27081a((zzzy) this.f17738j.zzdf());
                }
                if (this.f17739k != null) {
                    this.f17733e.mo27075a((zzatb) new zzatg(this.f17739k));
                }
                this.f17733e.setImmersiveMode(this.f17741m);
            }
            if (this.f17733e.mo27082b(zzyc.m25642a(this.f17730b, zzaaz))) {
                this.f17729a.mo27398b(zzaaz.mo26963m());
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    public zzabd(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzyc.f23015a, publisherInterstitialAd);
    }

    @VisibleForTesting
    private zzabd(Context context, zzyc zzyc, PublisherInterstitialAd publisherInterstitialAd) {
        this.f17729a = new zzamo();
        this.f17730b = context;
    }

    /* renamed from: b */
    public final void mo27029b(boolean z) {
        this.f17740l = true;
    }

    /* renamed from: b */
    private final void m18831b(String str) {
        if (this.f17733e == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo27018a(AdListener adListener) {
        try {
            this.f17731c = adListener;
            if (this.f17733e != null) {
                this.f17733e.mo27078a((zzyz) adListener != null ? new zzxv(adListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27025a(zzxr zzxr) {
        try {
            this.f17732d = zzxr;
            if (this.f17733e != null) {
                this.f17733e.mo27077a((zzyw) zzxr != null ? new zzxs(zzxr) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27026a(String str) {
        if (this.f17734f == null) {
            this.f17734f = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    /* renamed from: a */
    public final void mo27022a(AdMetadataListener adMetadataListener) {
        try {
            this.f17735g = adMetadataListener;
            if (this.f17733e != null) {
                this.f17733e.mo27079a((zzzp) adMetadataListener != null ? new zzxy(adMetadataListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27020a(AppEventListener appEventListener) {
        try {
            this.f17736h = appEventListener;
            if (this.f17733e != null) {
                this.f17733e.mo27080a((zzzs) appEventListener != null ? new zzyf(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27021a(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.f17737i = onCustomRenderedAdLoadedListener;
            if (this.f17733e != null) {
                this.f17733e.mo27072a((zzado) onCustomRenderedAdLoadedListener != null ? new zzadr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27019a(Correlator correlator) {
        zzyu zzyu;
        this.f17738j = correlator;
        try {
            if (this.f17733e != null) {
                zzzk zzzk = this.f17733e;
                if (correlator == null) {
                    zzyu = null;
                } else {
                    zzyu = correlator.zzdf();
                }
                zzzk.mo27081a((zzzy) zzyu);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27023a(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.f17739k = rewardedVideoAdListener;
            if (this.f17733e != null) {
                this.f17733e.mo27075a((zzatb) rewardedVideoAdListener != null ? new zzatg(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }

    /* renamed from: a */
    public final void mo27027a(boolean z) {
        try {
            this.f17741m = z;
            if (this.f17733e != null) {
                this.f17733e.setImmersiveMode(z);
            }
        } catch (RemoteException e) {
            zzbad.m20524d("#008 Must be called on the main UI thread.", e);
        }
    }
}
