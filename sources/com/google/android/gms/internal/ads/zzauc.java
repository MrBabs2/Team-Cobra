package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzauc extends zzfn implements zzaub {
    public zzauc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo27653N();
        } else if (i != 2) {
            return false;
        } else {
            mo27654o(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
