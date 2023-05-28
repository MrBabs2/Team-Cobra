package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.doubleclick.CustomRenderedAd;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzadk implements CustomRenderedAd {

    /* renamed from: a */
    private final zzadl f18022a;

    public zzadk(zzadl zzadl) {
        this.f18022a = zzadl;
    }

    public final String getBaseUrl() {
        try {
            return this.f18022a.mo27187Y0();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final String getContent() {
        try {
            return this.f18022a.getContent();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void onAdRendered(View view) {
        try {
            this.f18022a.mo27189h(view != null ? ObjectWrapper.m16391a(view) : null);
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void recordClick() {
        try {
            this.f18022a.recordClick();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }

    public final void recordImpression() {
        try {
            this.f18022a.recordImpression();
        } catch (RemoteException e) {
            zzbad.m20524d("#007 Could not call remote method.", e);
        }
    }
}
