package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzatd extends zzfm implements zzatb {
    zzatd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    /* renamed from: a */
    public final void mo27627a(zzasr zzasr) throws RemoteException {
        Parcel Z = mo29277Z();
        zzfo.m24342a(Z, (IInterface) zzasr);
        mo29280b(5, Z);
    }

    public final void onRewardedVideoAdClosed() throws RemoteException {
        mo29280b(4, mo29277Z());
    }

    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        Parcel Z = mo29277Z();
        Z.writeInt(i);
        mo29280b(7, Z);
    }

    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        mo29280b(6, mo29277Z());
    }

    public final void onRewardedVideoAdLoaded() throws RemoteException {
        mo29280b(1, mo29277Z());
    }

    public final void onRewardedVideoAdOpened() throws RemoteException {
        mo29280b(2, mo29277Z());
    }

    public final void onRewardedVideoCompleted() throws RemoteException {
        mo29280b(8, mo29277Z());
    }

    public final void onRewardedVideoStarted() throws RemoteException {
        mo29280b(3, mo29277Z());
    }
}
