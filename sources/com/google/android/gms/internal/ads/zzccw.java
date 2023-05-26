package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

public final class zzccw extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a */
    private final zzbyt f19980a;

    public zzccw(zzbyt zzbyt) {
        this.f19980a = zzbyt;
    }

    /* renamed from: a */
    private static zzaau m22390a(zzbyt zzbyt) {
        zzaar m = zzbyt.mo28546m();
        if (m == null) {
            return null;
        }
        try {
            return m.mo26928N0();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void onVideoEnd() {
        zzaau a = m22390a(this.f19980a);
        if (a != null) {
            try {
                a.mo26943x();
            } catch (RemoteException e) {
                zzbad.m20522c("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoPause() {
        zzaau a = m22390a(this.f19980a);
        if (a != null) {
            try {
                a.onVideoPause();
            } catch (RemoteException e) {
                zzbad.m20522c("Unable to call onVideoEnd()", e);
            }
        }
    }

    public final void onVideoStart() {
        zzaau a = m22390a(this.f19980a);
        if (a != null) {
            try {
                a.onVideoStart();
            } catch (RemoteException e) {
                zzbad.m20522c("Unable to call onVideoEnd()", e);
            }
        }
    }
}
