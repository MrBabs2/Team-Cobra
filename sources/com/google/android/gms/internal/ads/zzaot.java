package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzaot extends zzfn implements zzaos {
    public zzaot() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo26579s();
        } else if (i != 3) {
            return false;
        } else {
            mo26578a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
