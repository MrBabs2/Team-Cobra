package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
public final class zzanq extends zzanb {

    /* renamed from: f */
    private final NativeAppInstallAdMapper f18226f;

    public zzanq(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f18226f = nativeAppInstallAdMapper;
    }

    /* renamed from: a */
    public final zzaea mo27455a() {
        return null;
    }

    /* renamed from: a */
    public final void mo27457a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f18226f.trackViews((View) ObjectWrapper.m16390H(iObjectWrapper), (HashMap) ObjectWrapper.m16390H(iObjectWrapper2), (HashMap) ObjectWrapper.m16390H(iObjectWrapper3));
    }

    /* renamed from: b */
    public final String mo27458b() {
        return this.f18226f.getHeadline();
    }

    /* renamed from: c */
    public final String mo27460c() {
        return this.f18226f.getCallToAction();
    }

    /* renamed from: d */
    public final String mo27461d() {
        return this.f18226f.getBody();
    }

    /* renamed from: e */
    public final IObjectWrapper mo27462e() {
        return null;
    }

    /* renamed from: e */
    public final void mo27463e(IObjectWrapper iObjectWrapper) {
        this.f18226f.trackView((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: f */
    public final List mo27464f() {
        List<NativeAd.Image> images = this.f18226f.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (NativeAd.Image next : images) {
            arrayList.add(new zzadw(next.getDrawable(), next.getUri(), next.getScale(), next.getWidth(), next.getHeight()));
        }
        return arrayList;
    }

    public final Bundle getExtras() {
        return this.f18226f.getExtras();
    }

    public final String getStore() {
        return this.f18226f.getStore();
    }

    public final zzaar getVideoController() {
        if (this.f18226f.getVideoController() != null) {
            return this.f18226f.getVideoController().zzdh();
        }
        return null;
    }

    /* renamed from: h */
    public final zzaei mo27468h() {
        NativeAd.Image icon = this.f18226f.getIcon();
        if (icon != null) {
            return new zzadw(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    /* renamed from: i */
    public final String mo27469i() {
        return this.f18226f.getPrice();
    }

    /* renamed from: k */
    public final double mo27470k() {
        return this.f18226f.getStarRating();
    }

    /* renamed from: n */
    public final boolean mo27471n() {
        return this.f18226f.getOverrideImpressionRecording();
    }

    /* renamed from: p */
    public final IObjectWrapper mo27472p() {
        View zzacd = this.f18226f.zzacd();
        if (zzacd == null) {
            return null;
        }
        return ObjectWrapper.m16391a(zzacd);
    }

    /* renamed from: q */
    public final IObjectWrapper mo27473q() {
        View adChoicesContent = this.f18226f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m16391a(adChoicesContent);
    }

    /* renamed from: r */
    public final boolean mo27474r() {
        return this.f18226f.getOverrideClickHandling();
    }

    public final void recordImpression() {
        this.f18226f.recordImpression();
    }

    /* renamed from: b */
    public final void mo27459b(IObjectWrapper iObjectWrapper) {
        this.f18226f.handleClick((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo27456a(IObjectWrapper iObjectWrapper) {
        this.f18226f.untrackView((View) ObjectWrapper.m16390H(iObjectWrapper));
    }
}
