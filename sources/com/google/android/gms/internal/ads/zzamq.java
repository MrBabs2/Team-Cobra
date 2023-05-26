package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzamq extends zzfn implements zzamp {
    public zzamq() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* renamed from: a */
    public static zzamp m19431a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        if (queryLocalInterface instanceof zzamp) {
            return (zzamp) queryLocalInterface;
        }
        return new zzamr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzams q = mo27400q(parcel.readString());
            parcel2.writeNoException();
            zzfo.m24342a(parcel2, (IInterface) q);
        } else if (i == 2) {
            boolean r = mo27401r(parcel.readString());
            parcel2.writeNoException();
            zzfo.m24344a(parcel2, r);
        } else if (i != 3) {
            return false;
        } else {
            zzaov g = mo27399g(parcel.readString());
            parcel2.writeNoException();
            zzfo.m24342a(parcel2, (IInterface) g);
        }
        return true;
    }
}
