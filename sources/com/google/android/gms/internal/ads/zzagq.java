package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzagq extends zzafv {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final OnPublisherAdViewLoadedListener f18089f;

    public zzagq(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.f18089f = onPublisherAdViewLoadedListener;
    }

    /* renamed from: a */
    public final void mo27265a(zzzk zzzk, IObjectWrapper iObjectWrapper) {
        if (zzzk != null && iObjectWrapper != null) {
            PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.m16390H(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzzk.mo27068S0() instanceof zzxv) {
                    zzxv zzxv = (zzxv) zzzk.mo27068S0();
                    publisherAdView.setAdListener(zzxv != null ? zzxv.mo29900p1() : null);
                }
            } catch (RemoteException e) {
                zzbad.m20520b("", e);
            }
            try {
                if (zzzk.mo27067I0() instanceof zzyf) {
                    zzyf zzyf = (zzyf) zzzk.mo27067I0();
                    if (zzyf != null) {
                        appEventListener = zzyf.mo29913p1();
                    }
                    publisherAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzbad.m20520b("", e2);
            }
            zzazt.f18727b.post(new C8121x(this, publisherAdView, zzzk));
        }
    }
}
