package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* renamed from: com.google.android.gms.internal.ads.f3 */
final class C7456f3 implements zzo {

    /* renamed from: f */
    private final /* synthetic */ zzapl f15179f;

    C7456f3(zzapl zzapl) {
        this.f15179f = zzapl;
    }

    public final void onPause() {
        zzbad.m20516a("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        zzbad.m20516a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzsz() {
        zzbad.m20516a("AdMobCustomTabsAdapter overlay is closed.");
        this.f15179f.f18249b.onAdClosed(this.f15179f);
    }

    public final void zzta() {
        zzbad.m20516a("Opening AdMobCustomTabsAdapter overlay.");
        this.f15179f.f18249b.onAdOpened(this.f15179f);
    }
}
