package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzzb extends zzfm implements zzyz {
    zzzb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void onAdClicked() throws RemoteException {
        mo29280b(6, mo29277Z());
    }

    public final void onAdClosed() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    public final void onAdFailedToLoad(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(2, Z);
    }

    public final void onAdImpression() throws RemoteException {
        mo29280b(7, mo29277Z());
    }

    public final void onAdLeftApplication() throws RemoteException {
        mo29280b(3, mo29277Z());
    }

    public final void onAdLoaded() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    public final void onAdOpened() throws RemoteException {
        mo29280b(5, mo29277Z());
    }
}
