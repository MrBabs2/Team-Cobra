package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzaok extends zzfn implements zzaoj {
    public zzaok() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo26374f(IObjectWrapper.Stub.m16389a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            mo26373a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
