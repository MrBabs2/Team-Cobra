package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;

@Deprecated
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbqi;
    private final zzaem zzbqj = zzks();

    public NativeAdView(Context context) {
        super(context);
        this.zzbqi = zzd(context);
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzaem zzks() {
        Preconditions.m16038a(this.zzbqi, (Object) "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzyt.m25667b().mo29916a(this.zzbqi.getContext(), (FrameLayout) this, this.zzbqi);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbqi);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbqi;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        try {
            this.zzbqj.destroy();
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to destroy native ad view", e);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View zzbj = zzbj(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbj instanceof AdChoicesView) {
            return (AdChoicesView) zzbj;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzaem zzaem = this.zzbqj;
        if (zzaem != null) {
            try {
                zzaem.mo27101a(ObjectWrapper.m16391a(view), i);
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbqi);
    }

    public void removeView(View view) {
        if (this.zzbqi != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzbqj.mo27103c((IObjectWrapper) nativeAd.zzkq());
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to call setNativeAd on delegate", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzbqj.mo27102b(str, ObjectWrapper.m16391a(view));
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to call setAssetView on delegate", e);
        }
    }

    /* access modifiers changed from: protected */
    public final View zzbj(String str) {
        try {
            IObjectWrapper l = this.zzbqj.mo27106l(str);
            if (l != null) {
                return (View) ObjectWrapper.m16390H(l);
            }
            return null;
        } catch (RemoteException e) {
            zzbad.m20520b("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbqi = zzd(context);
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbqi = zzd(context);
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbqi = zzd(context);
    }
}
