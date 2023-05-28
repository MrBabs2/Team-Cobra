package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzzd extends zzfn implements zzzc {
    public zzzd() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo25847a((zzxz) zzfo.m24341a(parcel, zzxz.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String mediationAdapterClassName = getMediationAdapterClassName();
            parcel2.writeNoException();
            parcel2.writeString(mediationAdapterClassName);
        } else if (i == 3) {
            boolean y = mo25851y();
            parcel2.writeNoException();
            zzfo.m24344a(parcel2, y);
        } else if (i == 4) {
            String v = mo25850v();
            parcel2.writeNoException();
            parcel2.writeString(v);
        } else if (i != 5) {
            return false;
        } else {
            mo25848a((zzxz) zzfo.m24341a(parcel, zzxz.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
