package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.C7111a;
import com.google.ads.mediation.C7113c;
import com.google.ads.mediation.C7120d;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbad;
import p112n.p277e.p278a.C10567a;
import p112n.p277e.p278a.C10569c;

@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<CustomEventExtras, C7119d>, MediationInterstitialAdapter<CustomEventExtras, C7119d> {

    /* renamed from: a */
    private View f13391a;
    @VisibleForTesting

    /* renamed from: b */
    private CustomEventBanner f13392b;
    @VisibleForTesting

    /* renamed from: c */
    private CustomEventInterstitial f13393c;

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$a */
    static final class C7114a implements C7117b {
        public C7114a(CustomEventAdapter customEventAdapter, C7113c cVar) {
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.ads.mediation.customevent.CustomEventAdapter$b */
    class C7115b implements C7118c {
        public C7115b(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, C7120d dVar) {
        }
    }

    /* renamed from: a */
    private static <T> T m15061a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            zzbad.m20523d(sb.toString());
            return null;
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.f13392b;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f13393c;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    public final Class<CustomEventExtras> getAdditionalParametersType() {
        return CustomEventExtras.class;
    }

    public final View getBannerView() {
        return this.f13391a;
    }

    public final Class<C7119d> getServerParametersType() {
        return C7119d.class;
    }

    public final void requestBannerAd(C7113c cVar, Activity activity, C7119d dVar, C10569c cVar2, C7111a aVar, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventBanner customEventBanner = (CustomEventBanner) m15061a(dVar.f13395b);
        this.f13392b = customEventBanner;
        if (customEventBanner == null) {
            cVar.mo23790a(this, C10567a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(dVar.f13394a);
        }
        Activity activity2 = activity;
        this.f13392b.requestBannerAd(new C7114a(this, cVar), activity2, dVar.f13394a, dVar.f13396c, cVar2, aVar, obj);
    }

    public final void requestInterstitialAd(C7120d dVar, Activity activity, C7119d dVar2, C7111a aVar, CustomEventExtras customEventExtras) {
        Object obj;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m15061a(dVar2.f13395b);
        this.f13393c = customEventInterstitial;
        if (customEventInterstitial == null) {
            dVar.mo23797a(this, C10567a.INTERNAL_ERROR);
            return;
        }
        if (customEventExtras == null) {
            obj = null;
        } else {
            obj = customEventExtras.getExtra(dVar2.f13394a);
        }
        Activity activity2 = activity;
        this.f13393c.requestInterstitialAd(new C7115b(this, this, dVar), activity2, dVar2.f13394a, dVar2.f13396c, aVar, obj);
    }

    public final void showInterstitial() {
        this.f13393c.showInterstitial();
    }
}
