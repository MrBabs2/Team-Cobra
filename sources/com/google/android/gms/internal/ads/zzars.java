package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public abstract class zzars extends zzfn implements zzarr {
    public zzars() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo27591a((ParcelFileDescriptor) zzfo.m24341a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo27592a((zzaym) zzfo.m24341a(parcel, zzaym.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
