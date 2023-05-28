package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzabe {

    /* renamed from: c */
    private static zzabe f17742c;

    /* renamed from: d */
    private static final Object f17743d = new Object();

    /* renamed from: a */
    private zzaab f17744a;

    /* renamed from: b */
    private RewardedVideoAd f17745b;

    private zzabe() {
    }

    /* renamed from: d */
    public static zzabe m18852d() {
        zzabe zzabe;
        synchronized (f17743d) {
            if (f17742c == null) {
                f17742c = new zzabe();
            }
            zzabe = f17742c;
        }
        return zzabe;
    }

    /* renamed from: a */
    public final void mo27041a(Context context, String str, zzabi zzabi, zztx zztx) {
        synchronized (f17743d) {
            if (this.f17744a == null) {
                if (context != null) {
                    try {
                        zzami.m19401a(context, str);
                        boolean z = false;
                        zzaab zzaab = (zzaab) new e60(zzyt.m25667b(), context).mo26124a(context, false);
                        this.f17744a = zzaab;
                        zzaab.mo26912a((zzamp) new zzamo());
                        this.f17744a.mo26908B();
                        this.f17744a.mo26913a(str, ObjectWrapper.m16391a(new C7304b(this, context)));
                        zzacu.m18983a(context);
                        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17988y2)).booleanValue()) {
                            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17992z2)).booleanValue()) {
                                z = true;
                            }
                        }
                        if (!z) {
                            zzbad.m20519b("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                            new C7341c(this);
                        }
                    } catch (RemoteException e) {
                        zzbad.m20522c("MobileAdsSettingManager initialization failed", e);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
    }

    /* renamed from: b */
    public final float mo27044b() {
        zzaab zzaab = this.f17744a;
        if (zzaab == null) {
            return 1.0f;
        }
        try {
            return zzaab.mo26909G0();
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to get app volume.", e);
            return 1.0f;
        }
    }

    /* renamed from: c */
    public final boolean mo27045c() {
        zzaab zzaab = this.f17744a;
        if (zzaab == null) {
            return false;
        }
        try {
            return zzaab.mo26920s0();
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to get app mute state.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final RewardedVideoAd mo27037a(Context context) {
        synchronized (f17743d) {
            if (this.f17745b != null) {
                RewardedVideoAd rewardedVideoAd = this.f17745b;
                return rewardedVideoAd;
            }
            zzatj zzatj = new zzatj(context, (zzasw) new h60(zzyt.m25667b(), context, new zzamo()).mo26124a(context, false));
            this.f17745b = zzatj;
            return zzatj;
        }
    }

    /* renamed from: a */
    public final void mo27039a(float f) {
        boolean z = true;
        Preconditions.m16044a(0.0f <= f && f <= 1.0f, (Object) "The app volume must be a value between 0 and 1 inclusive.");
        if (this.f17744a == null) {
            z = false;
        }
        Preconditions.m16048b(z, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f17744a.mo26910a(f);
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to set app volume.", e);
        }
    }

    /* renamed from: a */
    public final void mo27043a(boolean z) {
        Preconditions.m16048b(this.f17744a != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.f17744a.mo26916g(z);
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to set app mute state.", e);
        }
    }

    /* renamed from: a */
    public final void mo27040a(Context context, String str) {
        Preconditions.m16048b(this.f17744a != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f17744a.mo26914b(ObjectWrapper.m16391a(context), str);
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to open debug menu.", e);
        }
    }

    /* renamed from: a */
    public final String mo27038a() {
        Preconditions.m16048b(this.f17744a != null, "MobileAds.initialize() must be called prior to getting version string.");
        try {
            return this.f17744a.mo26919r0();
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to get version string.", e);
            return "";
        }
    }

    /* renamed from: a */
    public final void mo27042a(Class<? extends RtbAdapter> cls) {
        try {
            this.f17744a.mo26915f(cls.getCanonicalName());
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to register RtbAdapter", e);
        }
    }
}
