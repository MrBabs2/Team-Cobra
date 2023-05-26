package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@zzard
public final class zzanr extends zzane {

    /* renamed from: f */
    private final NativeContentAdMapper f18227f;

    public zzanr(NativeContentAdMapper nativeContentAdMapper) {
        this.f18227f = nativeContentAdMapper;
    }

    /* renamed from: C */
    public final zzaei mo27476C() {
        NativeAd.Image logo = this.f18227f.getLogo();
        if (logo != null) {
            return new zzadw(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    /* renamed from: a */
    public final zzaea mo27477a() {
        return null;
    }

    /* renamed from: a */
    public final void mo27479a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.f18227f.trackViews((View) ObjectWrapper.m16390H(iObjectWrapper), (HashMap) ObjectWrapper.m16390H(iObjectWrapper2), (HashMap) ObjectWrapper.m16390H(iObjectWrapper3));
    }

    /* renamed from: b */
    public final String mo27480b() {
        return this.f18227f.getHeadline();
    }

    /* renamed from: c */
    public final String mo27482c() {
        return this.f18227f.getCallToAction();
    }

    /* renamed from: d */
    public final String mo27483d() {
        return this.f18227f.getBody();
    }

    /* renamed from: e */
    public final IObjectWrapper mo27484e() {
        return null;
    }

    /* renamed from: e */
    public final void mo27485e(IObjectWrapper iObjectWrapper) {
        this.f18227f.trackView((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: f */
    public final List mo27486f() {
        List<NativeAd.Image> images = this.f18227f.getImages();
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
        return this.f18227f.getExtras();
    }

    public final zzaar getVideoController() {
        if (this.f18227f.getVideoController() != null) {
            return this.f18227f.getVideoController().zzdh();
        }
        return null;
    }

    /* renamed from: l */
    public final String mo27489l() {
        return this.f18227f.getAdvertiser();
    }

    /* renamed from: n */
    public final boolean mo27490n() {
        return this.f18227f.getOverrideImpressionRecording();
    }

    /* renamed from: p */
    public final IObjectWrapper mo27491p() {
        View zzacd = this.f18227f.zzacd();
        if (zzacd == null) {
            return null;
        }
        return ObjectWrapper.m16391a(zzacd);
    }

    /* renamed from: q */
    public final IObjectWrapper mo27492q() {
        View adChoicesContent = this.f18227f.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.m16391a(adChoicesContent);
    }

    /* renamed from: r */
    public final boolean mo27493r() {
        return this.f18227f.getOverrideClickHandling();
    }

    public final void recordImpression() {
        this.f18227f.recordImpression();
    }

    /* renamed from: b */
    public final void mo27481b(IObjectWrapper iObjectWrapper) {
        this.f18227f.handleClick((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: a */
    public final void mo27478a(IObjectWrapper iObjectWrapper) {
        this.f18227f.untrackView((View) ObjectWrapper.m16390H(iObjectWrapper));
    }
}
