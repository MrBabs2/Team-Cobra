package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzaaw extends zzfm implements zzaau {
    zzaaw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* renamed from: b */
    public final void mo26939b(boolean z) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24344a(Z, z);
        mo29280b(5, Z);
    }

    public final void onVideoPause() throws RemoteException {
        mo29280b(3, mo29277Z());
    }

    public final void onVideoPlay() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    public final void onVideoStart() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    /* renamed from: x */
    public final void mo26943x() throws RemoteException {
        mo29280b(4, mo29277Z());
    }
}
