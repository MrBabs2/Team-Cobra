package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.common.util.PlatformVersion;
import p050l.p063c.p064b.C4858c;

@zzard
public final class zzapl implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f18248a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediationInterstitialListener f18249b;

    /* renamed from: c */
    private Uri f18250c;

    public final void onDestroy() {
        zzbad.m20516a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzbad.m20516a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzbad.m20516a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f18249b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzbad.m20523d("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzbad.m20523d("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f18249b.onAdFailedToLoad(this, 0);
        } else {
            if (!(PlatformVersion.m16286b() && zzads.m19024a(context))) {
                zzbad.m20523d("Default browser does not support custom tabs. Bailing out.");
                this.f18249b.onAdFailedToLoad(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzbad.m20523d("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f18249b.onAdFailedToLoad(this, 0);
                return;
            }
            this.f18248a = (Activity) context;
            this.f18250c = Uri.parse(string);
            this.f18249b.onAdLoaded(this);
        }
    }

    public final void showInterstitial() {
        C4858c b = new C4858c.C4859a().mo16896b();
        b.f8326a.setData(this.f18250c);
        zzaxi.f18651h.post(new C7493g3(this, new AdOverlayInfoParcel(new zzc(b.f8326a), (zzxr) null, new C7456f3(this), (zzu) null, new zzbai(0, 0, false))));
        zzk.zzlk().mo27739e();
    }
}
