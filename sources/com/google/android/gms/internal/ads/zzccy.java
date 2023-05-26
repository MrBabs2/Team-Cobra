package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzccy implements zzbrx {

    /* renamed from: f */
    private final zzams f19982f;

    public zzccy(zzams zzams) {
        this.f19982f = zzams;
    }

    /* renamed from: a */
    public final void mo26819a(Context context) {
        try {
            this.f19982f.destroy();
        } catch (RemoteException e) {
            zzbad.m20522c("Nonagon: Can't invoke onDestroy for rewarded video.", e);
        }
    }

    /* renamed from: b */
    public final void mo26820b(Context context) {
        try {
            this.f19982f.resume();
            if (context != null) {
                this.f19982f.mo27430w(ObjectWrapper.m16391a(context));
            }
        } catch (RemoteException e) {
            zzbad.m20522c("Nonagon: Can't invoke onResume for rewarded video.", e);
        }
    }

    /* renamed from: d */
    public final void mo26821d(Context context) {
        try {
            this.f19982f.pause();
        } catch (RemoteException e) {
            zzbad.m20522c("Nonagon: Can't invoke onPause for rewarded video.", e);
        }
    }
}
