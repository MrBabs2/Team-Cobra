package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabd;

public final class PublisherInterstitialAd {
    private final zzabd zzaas;

    public PublisherInterstitialAd(Context context) {
        this.zzaas = new zzabd(context, this);
        Preconditions.m16038a(context, (Object) "Context cannot be null");
    }

    public final AdListener getAdListener() {
        return this.zzaas.mo27017a();
    }

    public final String getAdUnitId() {
        return this.zzaas.mo27030c();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzaas.mo27031d();
    }

    public final String getMediationAdapterClassName() {
        return this.zzaas.mo27032e();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzaas.mo27033f();
    }

    public final boolean isLoaded() {
        return this.zzaas.mo27034g();
    }

    public final boolean isLoading() {
        return this.zzaas.mo27035h();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzaas.mo27024a(publisherAdRequest.zzde());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzaas.mo27018a(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzaas.mo27026a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzaas.mo27020a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzaas.mo27019a(correlator);
    }

    public final void setImmersiveMode(boolean z) {
        this.zzaas.mo27027a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzaas.mo27021a(onCustomRenderedAdLoadedListener);
    }

    public final void show() {
        this.zzaas.mo27036i();
    }
}
