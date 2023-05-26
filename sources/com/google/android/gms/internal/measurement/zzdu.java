package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzdu extends zzr implements zzdt {
    public zzdu() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo30323a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo30325a(parcel.readString(), parcel.readString(), (Bundle) zzs.m26505a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int l0 = mo30326l0();
            parcel2.writeNoException();
            parcel2.writeInt(l0);
        }
        return true;
    }
}
