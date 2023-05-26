package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzaon extends zzfn implements zzaom {
    public zzaon() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            mo25874s();
        } else if (i != 3) {
            return false;
        } else {
            mo25873a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
