package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;

/* renamed from: com.google.android.gms.internal.ads.x */
final class C8121x implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ PublisherAdView f17109f;

    /* renamed from: g */
    private final /* synthetic */ zzzk f17110g;

    /* renamed from: h */
    private final /* synthetic */ zzagq f17111h;

    C8121x(zzagq zzagq, PublisherAdView publisherAdView, zzzk zzzk) {
        this.f17111h = zzagq;
        this.f17109f = publisherAdView;
        this.f17110g = zzzk;
    }

    public final void run() {
        if (this.f17109f.zza(this.f17110g)) {
            this.f17111h.f18089f.onPublisherAdViewLoaded(this.f17109f);
        } else {
            zzbad.m20523d("Could not bind.");
        }
    }
}
