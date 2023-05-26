package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzcpy implements AppEventListener {

    /* renamed from: f */
    private zzzs f20779f;

    /* renamed from: a */
    public final synchronized void mo28765a(zzzs zzzs) {
        this.f20779f = zzzs;
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (this.f20779f != null) {
            try {
                this.f20779f.onAppEvent(str, str2);
            } catch (RemoteException e) {
                zzbad.m20522c("Remote Exception at onAppEvent.", e);
            }
        }
    }

    /* renamed from: a */
    public final synchronized zzzs mo28764a() {
        return this.f20779f;
    }
}
