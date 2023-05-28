package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
public final class zzaoi extends zzanh {

    /* renamed from: f */
    private final UnifiedNativeAdMapper f18241f;

    public zzaoi(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f18241f = unifiedNativeAdMapper;
    }

    /* renamed from: a */
    public final zzaea mo27495a() {
        return null;
    }

    /* renamed from: a */
    public final void mo27497a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f18241f.trackViews((View) ObjectWrapper.m16390H(iObjectWrapper), (HashMap) ObjectWrapper.m16390H(iObjectWrapper2), (HashMap) ObjectWrapper.m16390H(iObjectWrapper3));
    }

    /* renamed from: b */
    public final String mo27498b() {
        return this.f18241f.getHeadline();
    }

    /* renamed from: c */
    public final String mo27500c() {
        return this.f18241f.getCallToAction();
    }

    /* renamed from: d */
    public final String mo27501d() {
        return this.f18241f.getBody();
    }

    /* renamed from: e */
    public final IObjectWrapper mo27502e() {
        Object zzkv = this.f18241f.zzkv();
        if (zzkv == null) {
            return null;
        }
        return ObjectWrapper.m16391a(zzkv);
    }

    /* renamed from: f */
    public final List mo27503f() {
        List<NativeAd.Image> images = this.f18241f.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image next : images) {
                arrayList.add(new zzadw(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
            }
        }
        return arrayList;
    }

    public final Bundle getExtras() {
        return this.f18241f.getExtras();
    }

    public final String getStore() {
        return this.f18241f.getStore();
    }

    public final zzaar getVideoController() {
        if (this.f18241f.getVideoController() != null) {
            return this.f18241f.getVideoController().zzdh();
        }
        return null;
    }

    /* renamed from: h */
    public final zzaei mo27507h() {
        NativeAd.Image icon = this.f18241f.getIcon();
        if (icon != null) {
            return new zzadw(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    /* renamed from: i */
    public final String mo27508i() {
        return this.f18241f.getPrice();
    }

    /* renamed from: k */
    public final double mo27509k() {
        if (this.f18241f.getStarRating() != null) {
            return this.f18241f.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: l */
    public final String mo27510l() {
        return this.f18241f.getAdvertiser();
    }

    /* renamed from: n */
    public final boolean mo27511n() {
        return this.f18241f.getOverrideImpressionRecording();
    }

    /* renamed from: p */
    public final IObjectWrapper mo27512p() {
        View zzacd = this.f18241f.zzacd();
        if (zzacd == null) {
            return null;
        }
        return ObjectWrapper.m16391a(zzacd);
    }

    /* renamed from: q */
    public final IObjectWrapper mo27513q() {
        View adChoicesContent = this.f18241f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m16391a(adChoicesContent);
    }

    /* renamed from: r */
    public final boolean mo27514r() {
        return this.f18241f.getOverrideClickHandling();
    }

    public final void recordImpression() {
        this.f18241f.recordImpression();
    }

    /* renamed from: v0 */
    public final float mo27516v0() {
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo27499b(IObjectWrapper iObjectWrapper) {
        this.f18241f.handleClick((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo27496a(IObjectWrapper iObjectWrapper) {
        this.f18241f.untrackView((View) ObjectWrapper.m16390H(iObjectWrapper));
    }
}
