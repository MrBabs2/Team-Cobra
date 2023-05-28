package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzxr;

class BaseAdView extends ViewGroup {
    protected final zzabb zzaaq;

    public BaseAdView(Context context, int i) {
        super(context);
        this.zzaaq = new zzabb(this, i);
    }

    public void destroy() {
        this.zzaaq.mo26990a();
    }

    public AdListener getAdListener() {
        return this.zzaaq.mo27002b();
    }

    public AdSize getAdSize() {
        return this.zzaaq.mo27004c();
    }

    public String getAdUnitId() {
        return this.zzaaq.mo27006e();
    }

    public String getMediationAdapterClassName() {
        return this.zzaaq.mo27008g();
    }

    public boolean isLoading() {
        return this.zzaaq.mo27012k();
    }

    public void loadAd(AdRequest adRequest) {
        this.zzaaq.mo26996a(adRequest.zzde());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    public void pause() {
        this.zzaaq.mo27013l();
    }

    public void resume() {
        this.zzaaq.mo27015n();
    }

    public void setAdListener(AdListener adListener) {
        this.zzaaq.mo26991a(adListener);
        if (adListener == null) {
            this.zzaaq.mo26997a((zzxr) null);
            this.zzaaq.mo26994a((AppEventListener) null);
            return;
        }
        if (adListener instanceof zzxr) {
            this.zzaaq.mo26997a((zzxr) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zzaaq.mo26994a((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzaaq.mo27000a(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzaaq.mo26998a(str);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zzaaq = new zzabb(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zzaaq = new zzabb(this, attributeSet, false, i2);
    }
}
