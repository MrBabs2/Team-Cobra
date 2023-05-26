package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzzk;

public final class PublisherAdView extends ViewGroup {
    private final zzabb zzabf;

    public PublisherAdView(Context context) {
        super(context);
        this.zzabf = new zzabb(this);
    }

    public final void destroy() {
        this.zzabf.mo26990a();
    }

    public final AdListener getAdListener() {
        return this.zzabf.mo27002b();
    }

    public final AdSize getAdSize() {
        return this.zzabf.mo27004c();
    }

    public final AdSize[] getAdSizes() {
        return this.zzabf.mo27005d();
    }

    public final String getAdUnitId() {
        return this.zzabf.mo27006e();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzabf.mo27007f();
    }

    public final String getMediationAdapterClassName() {
        return this.zzabf.mo27008g();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzabf.mo27009h();
    }

    public final VideoController getVideoController() {
        return this.zzabf.mo27010i();
    }

    public final VideoOptions getVideoOptions() {
        return this.zzabf.mo27011j();
    }

    public final boolean isLoading() {
        return this.zzabf.mo27012k();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzabf.mo26996a(publisherAdRequest.zzde());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzbad.m20520b("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void pause() {
        this.zzabf.mo27013l();
    }

    public final void recordManualImpression() {
        this.zzabf.mo27014m();
    }

    public final void resume() {
        this.zzabf.mo27015n();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzabf.mo26991a(adListener);
    }

    public final void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zzabf.mo27003b(adSizeArr);
    }

    public final void setAdUnitId(String str) {
        this.zzabf.mo26998a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzabf.mo26994a(appEventListener);
    }

    public final void setCorrelator(Correlator correlator) {
        this.zzabf.mo26992a(correlator);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzabf.mo26999a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzabf.mo26995a(onCustomRenderedAdLoadedListener);
    }

    public final void setVideoOptions(VideoOptions videoOptions) {
        this.zzabf.mo26993a(videoOptions);
    }

    public final boolean zza(zzzk zzzk) {
        return this.zzabf.mo27001a(zzzk);
    }

    public PublisherAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzabf = new zzabb(this, attributeSet, true);
        Preconditions.m16038a(context, (Object) "Context cannot be null");
    }

    public PublisherAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzabf = new zzabb(this, attributeSet, true);
    }
}
